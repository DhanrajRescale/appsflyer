package bq;

/* loaded from: classes2.dex */
public final class l implements mq.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7266c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f7267a = f7266c;

    /* renamed from: b, reason: collision with root package name */
    public volatile mq.c f7268b;

    public l(mq.c cVar) {
        this.f7268b = cVar;
    }

    @Override // mq.c
    public final Object get() {
        Object obj = this.f7267a;
        Object obj2 = f7266c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f7267a;
                    if (obj == obj2) {
                        obj = this.f7268b.get();
                        this.f7267a = obj;
                        this.f7268b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
