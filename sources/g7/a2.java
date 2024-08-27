package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a2 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16651a;

    /* renamed from: b, reason: collision with root package name */
    public int f16652b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16653c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(int i10, Object obj, yt.a aVar) {
        super(3, aVar);
        this.f16651a = i10;
        this.f16655e = obj;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f16651a;
        Object obj4 = this.f16655e;
        switch (i10) {
            case 0:
                int i11 = 0;
                a2 a2Var = new a2(i11, (b1) obj4, (yt.a) obj3);
                a2Var.f16653c = (s0) obj;
                a2Var.f16654d = (s0) obj2;
                return a2Var.invokeSuspend(Unit.f23355a);
            default:
                int i12 = 1;
                a2 a2Var2 = new a2(i12, (Function2) obj4, (yt.a) obj3);
                a2Var2.f16653c = (tu.g) obj;
                a2Var2.f16654d = obj2;
                return a2Var2.invokeSuspend(Unit.f23355a);
        }
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        tu.g gVar;
        int i10 = this.f16651a;
        Object obj2 = this.f16655e;
        switch (i10) {
            case 0:
                zt.a aVar = zt.a.f42823a;
                if (this.f16652b == 0) {
                    ut.n.b(obj);
                    s0 previous = (s0) this.f16653c;
                    s0 s0Var = (s0) this.f16654d;
                    b1 loadType = (b1) obj2;
                    Intrinsics.checkNotNullParameter(s0Var, "<this>");
                    Intrinsics.checkNotNullParameter(previous, "previous");
                    Intrinsics.checkNotNullParameter(loadType, "loadType");
                    int i11 = s0Var.f17040a;
                    int i12 = previous.f17040a;
                    if (i11 > i12 || (i11 >= i12 && yk.g.a0(s0Var.f17041b, previous.f17041b, loadType))) {
                        return s0Var;
                    }
                    return previous;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            default:
                zt.a aVar2 = zt.a.f42823a;
                int i13 = this.f16652b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            ut.n.b(obj);
                            return Unit.f23355a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (tu.g) this.f16653c;
                    ut.n.b(obj);
                } else {
                    ut.n.b(obj);
                    tu.g gVar2 = (tu.g) this.f16653c;
                    Object obj3 = this.f16654d;
                    this.f16653c = gVar2;
                    this.f16652b = 1;
                    Object invoke = ((Function2) obj2).invoke(obj3, this);
                    if (invoke != aVar2) {
                        gVar = gVar2;
                        obj = invoke;
                    } else {
                        return aVar2;
                    }
                }
                this.f16653c = null;
                this.f16652b = 2;
                if (gVar.a(obj, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f23355a;
        }
    }
}
