package g7;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z1 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public int f17153a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ tu.g f17154b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2 f17156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f17157e;

    /* renamed from: f, reason: collision with root package name */
    public yu.d f17158f;

    /* renamed from: g, reason: collision with root package name */
    public int f17159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(yt.a aVar, t2 t2Var, b1 b1Var) {
        super(3, aVar);
        this.f17156d = t2Var;
        this.f17157e = b1Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        z1 z1Var = new z1((yt.a) obj3, this.f17156d, this.f17157e);
        z1Var.f17154b = (tu.g) obj;
        z1Var.f17155c = obj2;
        return z1Var.invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        tu.g gVar;
        int intValue;
        u2 u2Var;
        yu.d dVar;
        int i10;
        tu.f c2Var;
        b1 b1Var = this.f17157e;
        zt.a aVar = zt.a.f42823a;
        int i11 = this.f17153a;
        t2 t2Var = this.f17156d;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ut.n.b(obj);
                        return Unit.f23355a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intValue = this.f17159g;
                dVar = this.f17158f;
                u2Var = (u2) this.f17155c;
                gVar = this.f17154b;
                ut.n.b(obj);
            } else {
                ut.n.b(obj);
                gVar = this.f17154b;
                intValue = ((Number) this.f17155c).intValue();
                u2Var = t2Var.f17073j;
                dVar = u2Var.f17084a;
                this.f17154b = gVar;
                this.f17155c = u2Var;
                this.f17158f = dVar;
                this.f17159g = intValue;
                this.f17153a = 1;
                if (dVar.b(null, this) == aVar) {
                    return aVar;
                }
            }
            h.c cVar = u2Var.f17085b.f17147l;
            if (Intrinsics.a(cVar.p(b1Var), y0.f17133b)) {
                c2Var = new tu.i(new s0[0]);
            } else {
                if (!(cVar.p(b1Var) instanceof w0)) {
                    cVar.V(b1Var, y0.f17134c);
                }
                Unit unit = Unit.f23355a;
                dVar.a(null);
                tu.w0 q10 = t2Var.f17070g.q(b1Var);
                if (intValue == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (i10 >= 0) {
                    c2Var = new c2(new c2(q10, i10, 1), intValue, 0);
                } else {
                    throw new IllegalArgumentException(jr.h.n("Drop count should be non-negative, but had ", i10).toString());
                }
            }
            this.f17154b = null;
            this.f17155c = null;
            this.f17158f = null;
            this.f17153a = 2;
            if (!(gVar instanceof tu.r1)) {
                Object c10 = c2Var.c(gVar, this);
                if (c10 != aVar) {
                    c10 = Unit.f23355a;
                }
                if (c10 == aVar) {
                    return aVar;
                }
                return Unit.f23355a;
            }
            throw ((tu.r1) gVar).f36543a;
        } finally {
            dVar.a(null);
        }
    }
}
