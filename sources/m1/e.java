package m1;

import t0.t;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f27243a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27244b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27245c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27246d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27247e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27248f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27249g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27250h;

    static {
        long j10 = a.f27227a;
        t.a(a.b(j10), a.c(j10));
    }

    public e(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f27243a = f10;
        this.f27244b = f11;
        this.f27245c = f12;
        this.f27246d = f13;
        this.f27247e = j10;
        this.f27248f = j11;
        this.f27249g = j12;
        this.f27250h = j13;
    }

    public final float a() {
        return this.f27246d - this.f27244b;
    }

    public final float b() {
        return this.f27245c - this.f27243a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f27243a, eVar.f27243a) == 0 && Float.compare(this.f27244b, eVar.f27244b) == 0 && Float.compare(this.f27245c, eVar.f27245c) == 0 && Float.compare(this.f27246d, eVar.f27246d) == 0 && a.a(this.f27247e, eVar.f27247e) && a.a(this.f27248f, eVar.f27248f) && a.a(this.f27249g, eVar.f27249g) && a.a(this.f27250h, eVar.f27250h);
    }

    public final int hashCode() {
        int a10 = v.e.a(this.f27246d, v.e.a(this.f27245c, v.e.a(this.f27244b, Float.hashCode(this.f27243a) * 31, 31), 31), 31);
        int i10 = a.f27228b;
        return Long.hashCode(this.f27250h) + v.e.c(this.f27249g, v.e.c(this.f27248f, v.e.c(this.f27247e, a10, 31), 31), 31);
    }

    public final String toString() {
        String str = t.G0(this.f27243a) + ", " + t.G0(this.f27244b) + ", " + t.G0(this.f27245c) + ", " + t.G0(this.f27246d);
        long j10 = this.f27247e;
        long j11 = this.f27248f;
        boolean a10 = a.a(j10, j11);
        long j12 = this.f27249g;
        long j13 = this.f27250h;
        if (a10 && a.a(j11, j12) && a.a(j12, j13)) {
            if (a.b(j10) == a.c(j10)) {
                StringBuilder s7 = da.e.s("RoundRect(rect=", str, ", radius=");
                s7.append(t.G0(a.b(j10)));
                s7.append(')');
                return s7.toString();
            }
            StringBuilder s10 = da.e.s("RoundRect(rect=", str, ", x=");
            s10.append(t.G0(a.b(j10)));
            s10.append(", y=");
            s10.append(t.G0(a.c(j10)));
            s10.append(')');
            return s10.toString();
        }
        StringBuilder s11 = da.e.s("RoundRect(rect=", str, ", topLeft=");
        s11.append((Object) a.d(j10));
        s11.append(", topRight=");
        s11.append((Object) a.d(j11));
        s11.append(", bottomRight=");
        s11.append((Object) a.d(j12));
        s11.append(", bottomLeft=");
        s11.append((Object) a.d(j13));
        s11.append(')');
        return s11.toString();
    }
}
