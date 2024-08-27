package y;

/* loaded from: classes.dex */
public final class m implements o {

    /* renamed from: b, reason: collision with root package name */
    public final w.n f40853b;

    public m() {
        n nVar = n.f40863a;
        this.f40853b = n.f40864b;
    }

    @Override // y.o
    public final float a(float f10, float f11, float f12) {
        float f13 = f11 + f10;
        if ((f10 >= s0.g.f34069a && f13 <= f12) || (f10 < s0.g.f34069a && f13 > f12)) {
            return s0.g.f34069a;
        }
        float f14 = f13 - f12;
        if (Math.abs(f10) >= Math.abs(f14)) {
            return f14;
        }
        return f10;
    }

    @Override // y.o
    public final w.n b() {
        return this.f40853b;
    }
}
