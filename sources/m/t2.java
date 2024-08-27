package m;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25728a;

    /* renamed from: b, reason: collision with root package name */
    public int f25729b;

    /* renamed from: c, reason: collision with root package name */
    public int f25730c;

    /* renamed from: d, reason: collision with root package name */
    public int f25731d;

    /* renamed from: e, reason: collision with root package name */
    public int f25732e;

    /* renamed from: f, reason: collision with root package name */
    public int f25733f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25734g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25735h;

    public final void a(int i10, int i11) {
        this.f25730c = i10;
        this.f25731d = i11;
        this.f25735h = true;
        if (this.f25734g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f25728a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f25729b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f25728a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f25729b = i11;
        }
    }
}
