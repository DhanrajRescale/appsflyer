package tu;

/* loaded from: classes2.dex */
public final class y0 extends uu.c {

    /* renamed from: a, reason: collision with root package name */
    public long f36591a;

    /* renamed from: b, reason: collision with root package name */
    public qu.i f36592b;

    @Override // uu.c
    public final boolean a(uu.a aVar) {
        w0 w0Var = (w0) aVar;
        if (this.f36591a >= 0) {
            return false;
        }
        long j10 = w0Var.f36577i;
        if (j10 < w0Var.f36578j) {
            w0Var.f36578j = j10;
        }
        this.f36591a = j10;
        return true;
    }

    @Override // uu.c
    public final yt.a[] b(uu.a aVar) {
        long j10 = this.f36591a;
        this.f36591a = -1L;
        this.f36592b = null;
        return ((w0) aVar).x(j10);
    }
}
