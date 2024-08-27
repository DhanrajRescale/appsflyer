package ak;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ck.d f559a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ck.a f560b;

    public q(ck.d dVar) {
        this.f559a = dVar;
    }

    public final ck.a a() {
        if (this.f560b == null) {
            synchronized (this) {
                try {
                    if (this.f560b == null) {
                        this.f560b = this.f559a.a();
                    }
                    if (this.f560b == null) {
                        this.f560b = new ni.g(28);
                    }
                } finally {
                }
            }
        }
        return this.f560b;
    }
}
