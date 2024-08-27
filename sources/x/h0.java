package x;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class h0 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39569a;

    /* renamed from: b, reason: collision with root package name */
    public int f39570b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ y.k1 f39571c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f39572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f39573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(k kVar, yt.a aVar, int i10) {
        super(3, aVar);
        this.f39569a = i10;
        this.f39573e = kVar;
    }

    @Override // hu.c
    public final /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f39569a) {
            case 0:
                return i((y.k1) obj, ((m1.c) obj2).f27237a, (yt.a) obj3);
            default:
                return i((y.k1) obj, ((m1.c) obj2).f27237a, (yt.a) obj3);
        }
    }

    public final Object i(y.k1 k1Var, long j10, yt.a aVar) {
        int i10 = this.f39569a;
        k kVar = this.f39573e;
        switch (i10) {
            case 0:
                h0 h0Var = new h0((i0) kVar, aVar, 0);
                h0Var.f39571c = k1Var;
                h0Var.f39572d = j10;
                return h0Var.invokeSuspend(Unit.f23355a);
            default:
                h0 h0Var2 = new h0((m0) kVar, aVar, 1);
                h0Var2.f39571c = k1Var;
                h0Var2.f39572d = j10;
                return h0Var2.invokeSuspend(Unit.f23355a);
        }
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i10 = this.f39569a;
        k kVar = this.f39573e;
        switch (i10) {
            case 0:
                Object obj4 = zt.a.f42823a;
                int i11 = this.f39570b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ut.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ut.n.b(obj);
                    y.k1 k1Var = this.f39571c;
                    long j10 = this.f39572d;
                    i0 i0Var = (i0) kVar;
                    if (i0Var.f39606t) {
                        this.f39570b = 1;
                        a0.l lVar = i0Var.f39602p;
                        if (lVar == null || (obj2 = hl.f.P(new e(k1Var, j10, lVar, i0Var, null), this)) != obj4) {
                            obj2 = Unit.f23355a;
                        }
                        if (obj2 == obj4) {
                            return obj4;
                        }
                    }
                }
                return Unit.f23355a;
            default:
                Object obj5 = zt.a.f42823a;
                int i12 = this.f39570b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ut.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ut.n.b(obj);
                    y.k1 k1Var2 = this.f39571c;
                    long j11 = this.f39572d;
                    m0 m0Var = (m0) kVar;
                    if (m0Var.f39606t) {
                        this.f39570b = 1;
                        a0.l lVar2 = m0Var.f39602p;
                        if (lVar2 == null || (obj3 = hl.f.P(new e(k1Var2, j11, lVar2, m0Var, null), this)) != obj5) {
                            obj3 = Unit.f23355a;
                        }
                        if (obj3 == obj5) {
                            return obj5;
                        }
                    }
                }
                return Unit.f23355a;
        }
    }
}
