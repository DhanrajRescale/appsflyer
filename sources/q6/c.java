package q6;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f31665a;

    /* renamed from: b, reason: collision with root package name */
    public int f31666b;

    /* renamed from: c, reason: collision with root package name */
    public int f31667c;

    /* renamed from: d, reason: collision with root package name */
    public long f31668d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31669e;

    /* renamed from: f, reason: collision with root package name */
    public final e5.p f31670f;

    /* renamed from: g, reason: collision with root package name */
    public final e5.p f31671g;

    /* renamed from: h, reason: collision with root package name */
    public int f31672h;

    /* renamed from: i, reason: collision with root package name */
    public int f31673i;

    public c(e5.p pVar, e5.p pVar2, boolean z10) {
        this.f31671g = pVar;
        this.f31670f = pVar2;
        this.f31669e = z10;
        pVar2.F(12);
        this.f31665a = pVar2.x();
        pVar.F(12);
        this.f31673i = pVar.x();
        e5.a.e("first_chunk must be 1", pVar.g() == 1);
        this.f31666b = -1;
    }

    public final boolean a() {
        long v10;
        int i10;
        int i11 = this.f31666b + 1;
        this.f31666b = i11;
        if (i11 == this.f31665a) {
            return false;
        }
        boolean z10 = this.f31669e;
        e5.p pVar = this.f31670f;
        if (z10) {
            v10 = pVar.y();
        } else {
            v10 = pVar.v();
        }
        this.f31668d = v10;
        if (this.f31666b == this.f31672h) {
            e5.p pVar2 = this.f31671g;
            this.f31667c = pVar2.x();
            pVar2.G(4);
            int i12 = this.f31673i - 1;
            this.f31673i = i12;
            if (i12 > 0) {
                i10 = pVar2.x() - 1;
            } else {
                i10 = -1;
            }
            this.f31672h = i10;
        }
        return true;
    }
}
