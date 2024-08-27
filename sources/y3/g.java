package y3;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f41139a;

    /* renamed from: b, reason: collision with root package name */
    public f f41140b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41141c;

    public final void a(f fVar) {
        synchronized (this) {
            while (this.f41141c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f41140b == fVar) {
                return;
            }
            this.f41140b = fVar;
            if (this.f41139a) {
                fVar.a();
            }
        }
    }
}
