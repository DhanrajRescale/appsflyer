package l8;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final h f24218a;

    /* renamed from: b, reason: collision with root package name */
    public final op.a f24219b;

    public e(h hVar, op.a aVar) {
        this.f24218a = hVar;
        this.f24219b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24218a.f24227a != this) {
            return;
        }
        if (h.f24225f.s(this.f24218a, this, h.f(this.f24219b))) {
            h.c(this.f24218a);
        }
    }
}
