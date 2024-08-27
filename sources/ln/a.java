package ln;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class a implements Provider {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24942c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Provider f24943a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f24944b;

    /* JADX WARN: Type inference failed for: r0v1, types: [javax.inject.Provider, ln.a, java.lang.Object] */
    public static Provider a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f24944b = f24942c;
        obj.f24943a = bVar;
        return obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.f24944b;
        Object obj2 = f24942c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f24944b;
                    if (obj == obj2) {
                        obj = this.f24943a.get();
                        Object obj3 = this.f24944b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f24944b = obj;
                        this.f24943a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
