package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.l3;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f38495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f38496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f38497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, d dVar, l3 l3Var, l3 l3Var2, yt.a aVar) {
        super(2, aVar);
        this.f38494b = obj;
        this.f38495c = dVar;
        this.f38496d = l3Var;
        this.f38497e = l3Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f38494b, this.f38495c, this.f38496d, this.f38497e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38493a;
        d dVar = this.f38495c;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Object value = dVar.f38455e.getValue();
            Object obj2 = this.f38494b;
            if (!Intrinsics.a(obj2, value)) {
                f1 f1Var = i.f38521a;
                n nVar = (n) this.f38496d.getValue();
                this.f38493a = 1;
                if (d.c(dVar, obj2, nVar, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f23355a;
        }
        f1 f1Var2 = i.f38521a;
        Function1 function1 = (Function1) this.f38497e.getValue();
        if (function1 != null) {
            function1.invoke(dVar.d());
        }
        return Unit.f23355a;
    }
}
