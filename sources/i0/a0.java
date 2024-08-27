package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.l3;

/* loaded from: classes.dex */
public final class a0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f18776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f18777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.d0 f18778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f18779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.o f18780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.v f18781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q1 q1Var, l3 l3Var, p2.d0 d0Var, l0.v0 v0Var, p2.o oVar, p2.v vVar, yt.a aVar) {
        super(2, aVar);
        this.f18776b = q1Var;
        this.f18777c = l3Var;
        this.f18778d = d0Var;
        this.f18779e = v0Var;
        this.f18780f = oVar;
        this.f18781g = vVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a0(this.f18776b, this.f18777c, this.f18778d, this.f18779e, this.f18780f, this.f18781g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18775a;
        q1 q1Var = this.f18776b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                tu.j z02 = t0.t.z0(new c0.r(this.f18777c, 2));
                z zVar = new z(this.f18776b, this.f18778d, this.f18779e, this.f18780f, this.f18781g);
                this.f18775a = 1;
                if (z02.c(zVar, this) == aVar) {
                    return aVar;
                }
            }
            l1.k(q1Var);
            return Unit.f23355a;
        } catch (Throwable th2) {
            l1.k(q1Var);
            throw th2;
        }
    }
}
