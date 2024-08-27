package cn;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static int f8250g;

    /* renamed from: a, reason: collision with root package name */
    public int f8251a;

    /* renamed from: b, reason: collision with root package name */
    public int f8252b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8253c;

    /* renamed from: d, reason: collision with root package name */
    public int f8254d;

    /* renamed from: e, reason: collision with root package name */
    public e f8255e;

    /* renamed from: f, reason: collision with root package name */
    public float f8256f;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, cn.f] */
    public static synchronized f a(int i10, e eVar) {
        ?? obj;
        synchronized (f.class) {
            obj = new Object();
            if (i10 > 0) {
                obj.f8252b = i10;
                obj.f8253c = new Object[i10];
                obj.f8254d = 0;
                obj.f8255e = eVar;
                obj.f8256f = 1.0f;
                obj.d();
                int i11 = f8250g;
                obj.f8251a = i11;
                f8250g = i11 + 1;
            } else {
                throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
            }
        }
        return obj;
    }

    public final synchronized e b() {
        e eVar;
        try {
            if (this.f8254d == -1 && this.f8256f > s0.g.f34069a) {
                d();
            }
            Object[] objArr = this.f8253c;
            int i10 = this.f8254d;
            eVar = (e) objArr[i10];
            eVar.f8249a = -1;
            this.f8254d = i10 - 1;
        } catch (Throwable th2) {
            throw th2;
        }
        return eVar;
    }

    public final synchronized void c(e eVar) {
        try {
            int i10 = eVar.f8249a;
            if (i10 != -1) {
                if (i10 == this.f8251a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + eVar.f8249a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i11 = this.f8254d + 1;
            this.f8254d = i11;
            if (i11 >= this.f8253c.length) {
                int i12 = this.f8252b;
                int i13 = i12 * 2;
                this.f8252b = i13;
                Object[] objArr = new Object[i13];
                for (int i14 = 0; i14 < i12; i14++) {
                    objArr[i14] = this.f8253c[i14];
                }
                this.f8253c = objArr;
            }
            eVar.f8249a = this.f8251a;
            this.f8253c[this.f8254d] = eVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        float f10 = this.f8256f;
        int i10 = this.f8252b;
        int i11 = (int) (i10 * f10);
        if (i11 < 1) {
            i10 = 1;
        } else if (i11 <= i10) {
            i10 = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            this.f8253c[i12] = this.f8255e.a();
        }
        this.f8254d = i10 - 1;
    }
}
