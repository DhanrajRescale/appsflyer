package z5;

/* loaded from: classes.dex */
public final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final f f42060a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42061b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42062c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f42063d;

    /* renamed from: e, reason: collision with root package name */
    public final long f42064e;

    /* renamed from: f, reason: collision with root package name */
    public final long f42065f;

    /* renamed from: g, reason: collision with root package name */
    public final long f42066g;

    public d(f fVar, long j10, long j11, long j12, long j13, long j14) {
        this.f42060a = fVar;
        this.f42061b = j10;
        this.f42063d = j11;
        this.f42064e = j12;
        this.f42065f = j13;
        this.f42066g = j14;
    }

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    @Override // z5.y
    public final x h(long j10) {
        z zVar = new z(j10, e.a(this.f42060a.e(j10), this.f42062c, this.f42063d, this.f42064e, this.f42065f, this.f42066g));
        return new x(zVar, zVar);
    }

    @Override // z5.y
    public final long i() {
        return this.f42061b;
    }
}
