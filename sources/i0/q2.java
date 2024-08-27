package i0;

import t0.o3;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: f, reason: collision with root package name */
    public static final d1.r f19156f = t0.t.g0(p2.f19108a, r.f19174n);

    /* renamed from: a, reason: collision with root package name */
    public final t0.k1 f19157a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.k1 f19158b = dp.b.y1(s0.g.f34069a);

    /* renamed from: c, reason: collision with root package name */
    public m1.d f19159c = m1.d.f27238e;

    /* renamed from: d, reason: collision with root package name */
    public long f19160d = j2.f0.f20710b;

    /* renamed from: e, reason: collision with root package name */
    public final t0.n1 f19161e;

    public q2(y.g1 g1Var, float f10) {
        this.f19157a = dp.b.y1(f10);
        this.f19161e = t0.t.n0(g1Var, o3.f35116a);
    }

    public final void a(y.g1 g1Var, m1.d dVar, int i10, int i11) {
        boolean z10;
        float f10;
        float f11;
        float f12 = i11 - i10;
        this.f19158b.j(f12);
        m1.d dVar2 = this.f19159c;
        float f13 = dVar2.f27239a;
        float f14 = dVar.f27239a;
        t0.k1 k1Var = this.f19157a;
        float f15 = dVar.f27240b;
        if (f14 != f13 || f15 != dVar2.f27240b) {
            if (g1Var == y.g1.f40723a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f14 = f15;
            }
            if (z10) {
                f10 = dVar.f27242d;
            } else {
                f10 = dVar.f27241c;
            }
            float i12 = k1Var.i();
            float f16 = i10;
            float f17 = i12 + f16;
            if (f10 > f17 || (f14 < i12 && f10 - f14 > f16)) {
                f11 = f10 - f17;
            } else if (f14 < i12 && f10 - f14 <= f16) {
                f11 = f14 - i12;
            } else {
                f11 = 0.0f;
            }
            k1Var.j(k1Var.i() + f11);
            this.f19159c = dVar;
        }
        k1Var.j(kotlin.ranges.d.e(k1Var.i(), s0.g.f34069a, f12));
    }
}
