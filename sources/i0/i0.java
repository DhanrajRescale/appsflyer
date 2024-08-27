package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0.f f18956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f18957c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f18958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2 f18959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.v f18960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f0.f fVar, p2.c0 c0Var, q1 q1Var, s2 s2Var, p2.v vVar, yt.a aVar) {
        super(2, aVar);
        this.f18956b = fVar;
        this.f18957c = c0Var;
        this.f18958d = q1Var;
        this.f18959e = s2Var;
        this.f18960f = vVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i0(this.f18956b, this.f18957c, this.f18958d, this.f18959e, this.f18960f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        long a10;
        m1.d dVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18955a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            z1 z1Var = this.f18958d.f19134a;
            j2.e0 e0Var = this.f18959e.f19194a;
            this.f18955a = 1;
            int b10 = this.f18960f.b(j2.f0.d(this.f18957c.f30523b));
            if (b10 < e0Var.f20703a.f20689a.f20699a.length()) {
                dVar = e0Var.b(b10);
            } else if (b10 == 0) {
                a10 = e2.a(z1Var.f19293b, z1Var.f19298g, z1Var.f19299h, e2.f18851a, 1);
                dVar = new m1.d(s0.g.f34069a, s0.g.f34069a, 1.0f, (int) (a10 & 4294967295L));
            } else {
                dVar = e0Var.b(b10 - 1);
            }
            Object a11 = this.f18956b.a(dVar, this);
            if (a11 != aVar) {
                a11 = Unit.f23355a;
            }
            if (a11 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
