package ak;

/* loaded from: classes.dex */
public final class d0 implements e0, sk.b {

    /* renamed from: e, reason: collision with root package name */
    public static final x9.c f456e = sk.d.a(20, new ni.j(27));

    /* renamed from: a, reason: collision with root package name */
    public final sk.e f457a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public e0 f458b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f459c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f460d;

    public final synchronized void a() {
        this.f457a.a();
        if (this.f459c) {
            this.f459c = false;
            if (this.f460d) {
                b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // ak.e0
    public final synchronized void b() {
        this.f457a.a();
        this.f460d = true;
        if (!this.f459c) {
            this.f458b.b();
            this.f458b = null;
            f456e.b(this);
        }
    }

    @Override // ak.e0
    public final int c() {
        return this.f458b.c();
    }

    @Override // ak.e0
    public final Class d() {
        return this.f458b.d();
    }

    @Override // sk.b
    public final sk.e e() {
        return this.f457a;
    }

    @Override // ak.e0
    public final Object get() {
        return this.f458b.get();
    }
}
