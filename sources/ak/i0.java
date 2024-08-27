package ak;

/* loaded from: classes.dex */
public final class i0 implements h, g {

    /* renamed from: a, reason: collision with root package name */
    public final i f510a;

    /* renamed from: b, reason: collision with root package name */
    public final g f511b;

    /* renamed from: c, reason: collision with root package name */
    public int f512c;

    /* renamed from: d, reason: collision with root package name */
    public e f513d;

    /* renamed from: e, reason: collision with root package name */
    public Object f514e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ek.v f515f;

    /* renamed from: g, reason: collision with root package name */
    public f f516g;

    public i0(i iVar, g gVar) {
        this.f510a = iVar;
        this.f511b = gVar;
    }

    @Override // ak.g
    public final void a(xj.g gVar, Exception exc, yj.e eVar, xj.a aVar) {
        this.f511b.a(gVar, exc, eVar, this.f515f.f15630c.f());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00db. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[SYNTHETIC] */
    @Override // ak.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.i0.b():boolean");
    }

    @Override // ak.g
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // ak.h
    public final void cancel() {
        ek.v vVar = this.f515f;
        if (vVar != null) {
            vVar.f15630c.cancel();
        }
    }

    @Override // ak.g
    public final void d(xj.g gVar, Object obj, yj.e eVar, xj.a aVar, xj.g gVar2) {
        this.f511b.d(gVar, obj, eVar, this.f515f.f15630c.f(), gVar);
    }
}
