package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16659a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.o1 f16661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f16662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(qu.o1 o1Var, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f16661c = o1Var;
        this.f16662d = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b0 b0Var = new b0(this.f16661c, this.f16662d, aVar);
        b0Var.f16660b = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((j4) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16659a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            j4 j4Var = (j4) this.f16660b;
            this.f16661c.I(new c2.e1(j4Var, 15));
            this.f16659a = 1;
            if (this.f16662d.invoke(j4Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
