package xs;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f40553c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f40554a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f40555b;

    /* JADX WARN: Type inference failed for: r0v1, types: [xs.a, xs.b, java.lang.Object] */
    public static b a(b bVar) {
        bVar.getClass();
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f40555b = f40553c;
        obj.f40554a = bVar;
        return obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.f40555b;
        Object obj2 = f40553c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f40555b;
                    if (obj == obj2) {
                        obj = this.f40554a.get();
                        Object obj3 = this.f40555b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f40555b = obj;
                        this.f40554a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
