package mt;

/* loaded from: classes2.dex */
public final class m extends jt.b {
    private static final long serialVersionUID = 396518478098735504L;

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28037a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28038b;

    /* renamed from: c, reason: collision with root package name */
    public long f28039c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28040d;

    public m(at.g gVar, long j10, long j11) {
        this.f28037a = gVar;
        this.f28039c = j10;
        this.f28038b = j11;
    }

    @Override // ct.b
    public final void a() {
        set(1);
    }

    @Override // ht.c
    public final void clear() {
        this.f28039c = this.f28038b;
        lazySet(1);
    }

    @Override // ht.b
    public final int d() {
        this.f28040d = true;
        return 1;
    }

    @Override // ht.c
    public final Object i() {
        long j10 = this.f28039c;
        if (j10 != this.f28038b) {
            this.f28039c = 1 + j10;
            return Integer.valueOf((int) j10);
        }
        lazySet(1);
        return null;
    }

    @Override // ht.c
    public final boolean isEmpty() {
        return this.f28039c == this.f28038b;
    }
}
