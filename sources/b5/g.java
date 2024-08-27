package b5;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final g f3297g = new g(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3299b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3300c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3301d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3302e;

    /* renamed from: f, reason: collision with root package name */
    public t9.c f3303f;

    static {
        int i10 = e5.x.f15050a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public g(int i10, int i11, int i12, int i13, int i14) {
        this.f3298a = i10;
        this.f3299b = i11;
        this.f3300c = i12;
        this.f3301d = i13;
        this.f3302e = i14;
    }

    public final t9.c a() {
        if (this.f3303f == null) {
            this.f3303f = new t9.c(this, 0);
        }
        return this.f3303f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3298a == gVar.f3298a && this.f3299b == gVar.f3299b && this.f3300c == gVar.f3300c && this.f3301d == gVar.f3301d && this.f3302e == gVar.f3302e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f3298a) * 31) + this.f3299b) * 31) + this.f3300c) * 31) + this.f3301d) * 31) + this.f3302e;
    }
}
