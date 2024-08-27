package tb;

import c0.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f35703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f35704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f35705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m0 m0Var, g1 g1Var, g1 g1Var2, yt.a aVar) {
        super(2, aVar);
        this.f35703b = m0Var;
        this.f35704c = g1Var;
        this.f35705d = g1Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f35703b, this.f35704c, this.f35705d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35702a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.j z02 = t0.t.z0(new f(this.f35703b, 0));
            a0.f fVar = new a0.f(this.f35704c, this.f35705d);
            this.f35702a = 1;
            if (z02.c(fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
