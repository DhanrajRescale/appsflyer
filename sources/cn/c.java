package cn;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f8243d;

    /* renamed from: b, reason: collision with root package name */
    public double f8244b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public double f8245c = 0.0d;

    static {
        f a10 = f.a(64, new c());
        f8243d = a10;
        a10.f8256f = 0.5f;
    }

    public static void b(c cVar) {
        f8243d.c(cVar);
    }

    @Override // cn.e
    public final e a() {
        return new c();
    }

    public final String toString() {
        return "MPPointD, x: " + this.f8244b + ", y: " + this.f8245c;
    }
}
