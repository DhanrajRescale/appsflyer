package hp;

/* loaded from: classes2.dex */
public final class q implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18664c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f18665a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f18666b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hp.q, hp.b] */
    public static b b(a aVar) {
        aVar.getClass();
        if (aVar instanceof q) {
            return aVar;
        }
        ?? obj = new Object();
        obj.f18666b = f18664c;
        obj.f18665a = aVar;
        return obj;
    }

    @Override // hp.b
    public final Object a() {
        Object obj = this.f18666b;
        Object obj2 = f18664c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f18666b;
                    if (obj == obj2) {
                        obj = this.f18665a.a();
                        Object obj3 = this.f18666b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f18666b = obj;
                        this.f18665a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
