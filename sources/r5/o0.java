package r5;

/* loaded from: classes.dex */
public final class o0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final g5.e f33252a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.t f33253b;

    /* renamed from: c, reason: collision with root package name */
    public n5.h f33254c;

    /* renamed from: d, reason: collision with root package name */
    public kq.e f33255d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33256e;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kq.e] */
    public o0(g5.e eVar, z5.s sVar) {
        b3.t tVar = new b3.t(sVar, 13);
        n5.h hVar = new n5.h();
        ?? obj = new Object();
        this.f33252a = eVar;
        this.f33253b = tVar;
        this.f33254c = hVar;
        this.f33255d = obj;
        this.f33256e = 1048576;
    }

    @Override // r5.v
    public final a a(b5.k0 k0Var) {
        k0Var.f3390b.getClass();
        return new p0(k0Var, this.f33252a, this.f33253b, this.f33254c.b(k0Var), this.f33255d, this.f33256e);
    }

    @Override // r5.v
    public final v b(n5.h hVar) {
        if (hVar != null) {
            this.f33254c = hVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // r5.v
    public final v c(kq.e eVar) {
        if (eVar != null) {
            this.f33255d = eVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
