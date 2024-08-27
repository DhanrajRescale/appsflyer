package i0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class k2 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19020a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ y.k1 f19021b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f19022c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f19023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f19024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.l f19025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(qu.f0 f0Var, t0.g1 g1Var, a0.l lVar, yt.a aVar) {
        super(3, aVar);
        this.f19023d = f0Var;
        this.f19024e = g1Var;
        this.f19025f = lVar;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j10 = ((m1.c) obj2).f27237a;
        k2 k2Var = new k2(this.f19023d, this.f19024e, this.f19025f, (yt.a) obj3);
        k2Var.f19021b = (y.k1) obj;
        k2Var.f19022c = j10;
        return k2Var.invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19020a;
        qu.f0 f0Var = this.f19023d;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y.k1 k1Var = this.f19021b;
            yk.g.H(f0Var, null, null, new i2(this.f19024e, this.f19022c, this.f19025f, null), 3);
            this.f19020a = 1;
            obj = k1Var.c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        yk.g.H(f0Var, null, null, new j2(this.f19024e, ((Boolean) obj).booleanValue(), this.f19025f, null), 3);
        return Unit.f23355a;
    }
}
