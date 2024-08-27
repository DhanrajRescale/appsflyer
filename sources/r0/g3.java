package r0;

/* loaded from: classes.dex */
public final class g3 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e3 f32418a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(e3 e3Var) {
        super(3);
        this.f32418a = e3Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(-1541271084);
        e3 e3Var = this.f32418a;
        float f10 = e3Var.f32387b;
        w.z zVar = w.e0.f38470a;
        t0.l3 a10 = w.i.a(f10, w.e.x(250, 0, zVar, 2), rVar, 0);
        g1.o q10 = androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.d.u(androidx.compose.foundation.layout.d.e((g1.o) obj, 1.0f), g1.a.f16385g, 2), ((w2.e) w.i.a(e3Var.f32386a, w.e.x(250, 0, zVar, 2), rVar, 0).getValue()).f38783a, s0.g.f34069a, 2), ((w2.e) a10.getValue()).f38783a);
        rVar.s(false);
        return q10;
    }
}
