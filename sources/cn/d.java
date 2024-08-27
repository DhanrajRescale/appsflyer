package cn;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f8246d;

    /* renamed from: b, reason: collision with root package name */
    public float f8247b;

    /* renamed from: c, reason: collision with root package name */
    public float f8248c;

    static {
        f a10 = f.a(32, new d(s0.g.f34069a, s0.g.f34069a));
        f8246d = a10;
        a10.f8256f = 0.5f;
    }

    public d(float f10, float f11) {
        this.f8247b = f10;
        this.f8248c = f11;
    }

    public static d b(float f10, float f11) {
        d dVar = (d) f8246d.b();
        dVar.f8247b = f10;
        dVar.f8248c = f11;
        return dVar;
    }

    public static void c(d dVar) {
        f8246d.c(dVar);
    }

    @Override // cn.e
    public final e a() {
        return new d(s0.g.f34069a, s0.g.f34069a);
    }
}
