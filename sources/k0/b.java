package k0;

import j2.g0;
import o2.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f21809h;

    /* renamed from: a, reason: collision with root package name */
    public final w2.k f21810a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f21811b;

    /* renamed from: c, reason: collision with root package name */
    public final w2.b f21812c;

    /* renamed from: d, reason: collision with root package name */
    public final r f21813d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f21814e;

    /* renamed from: f, reason: collision with root package name */
    public float f21815f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f21816g = Float.NaN;

    public b(w2.k kVar, g0 g0Var, w2.b bVar, r rVar) {
        this.f21810a = kVar;
        this.f21811b = g0Var;
        this.f21812c = bVar;
        this.f21813d = rVar;
        this.f21814e = hl.f.M0(g0Var, kVar);
    }

    public final long a(int i10, long j10) {
        float f10 = this.f21816g;
        float f11 = this.f21815f;
        int i11 = 0;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            float b10 = hl.f.m(c.f21817a, this.f21814e, hl.f.c(0, 0, 15), this.f21812c, this.f21813d, null, 1, 96).b();
            float b11 = hl.f.m(c.f21818b, this.f21814e, hl.f.c(0, 0, 15), this.f21812c, this.f21813d, null, 2, 96).b() - b10;
            this.f21816g = b10;
            this.f21815f = b11;
            f11 = b11;
            f10 = b10;
        }
        if (i10 != 1) {
            int round = Math.round((f11 * (i10 - 1)) + f10);
            if (round >= 0) {
                i11 = round;
            }
            int g10 = w2.a.g(j10);
            if (i11 > g10) {
                i11 = g10;
            }
        } else {
            i11 = w2.a.i(j10);
        }
        return hl.f.b(w2.a.j(j10), w2.a.h(j10), i11, w2.a.g(j10));
    }
}
