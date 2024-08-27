package cn;

/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f8240d;

    /* renamed from: b, reason: collision with root package name */
    public float f8241b = s0.g.f34069a;

    /* renamed from: c, reason: collision with root package name */
    public float f8242c = s0.g.f34069a;

    static {
        f a10 = f.a(256, new b());
        f8240d = a10;
        a10.f8256f = 0.5f;
    }

    public static b b(float f10, float f11) {
        b bVar = (b) f8240d.b();
        bVar.f8241b = f10;
        bVar.f8242c = f11;
        return bVar;
    }

    @Override // cn.e
    public final e a() {
        return new b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8241b != bVar.f8241b || this.f8242c != bVar.f8242c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8241b) ^ Float.floatToIntBits(this.f8242c);
    }

    public final String toString() {
        return this.f8241b + "x" + this.f8242c;
    }
}
