package ep;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15784c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f15785a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f15786b;

    /* JADX WARN: Type inference failed for: r0v1, types: [ep.b, java.lang.Object, ep.c] */
    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        ?? obj = new Object();
        obj.f15786b = f15784c;
        obj.f15785a = cVar;
        return obj;
    }

    @Override // ep.c
    public final Object zza() {
        Object obj = this.f15786b;
        Object obj2 = f15784c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f15786b;
                    if (obj == obj2) {
                        obj = this.f15785a.zza();
                        Object obj3 = this.f15786b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f15786b = obj;
                        this.f15785a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
