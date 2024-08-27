package androidx.navigation;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2220a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2221b;

    /* renamed from: d, reason: collision with root package name */
    public String f2223d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2224e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2225f;

    /* renamed from: c, reason: collision with root package name */
    public int f2222c = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2226g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f2227h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f2228i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f2229j = -1;

    public final k0 a() {
        String str = this.f2223d;
        if (str != null) {
            boolean z10 = this.f2220a;
            boolean z11 = this.f2221b;
            boolean z12 = this.f2224e;
            boolean z13 = this.f2225f;
            int i10 = this.f2226g;
            int i11 = this.f2227h;
            int i12 = this.f2228i;
            int i13 = this.f2229j;
            int i14 = c0.f2173j;
            k0 k0Var = new k0(z10, z11, x2.c.n(str).hashCode(), z12, z13, i10, i11, i12, i13);
            k0Var.f2243j = str;
            return k0Var;
        }
        return new k0(this.f2220a, this.f2221b, this.f2222c, this.f2224e, this.f2225f, this.f2226g, this.f2227h, this.f2228i, this.f2229j);
    }
}
