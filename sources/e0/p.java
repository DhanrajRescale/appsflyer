package e0;

import w.f1;

/* loaded from: classes.dex */
public final class p implements y.o {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f14769b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f14770c = w.e.v(s0.g.f34069a, null, 7);

    public p(j0 j0Var) {
        this.f14769b = j0Var;
    }

    @Override // y.o
    public final float a(float f10, float f11, float f12) {
        if (f10 < f12 && f10 >= s0.g.f34069a) {
            if ((f11 > f12 || f11 + f10 <= f12) && Math.abs(this.f14769b.f14718d.f14651c.i()) == s0.g.f34069a) {
                return s0.g.f34069a;
            }
            return f10;
        }
        return f10;
    }

    @Override // y.o
    public final w.n b() {
        return this.f14770c;
    }
}
