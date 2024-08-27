package y6;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f41269a;

    /* renamed from: b, reason: collision with root package name */
    public int f41270b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41271c;

    /* renamed from: d, reason: collision with root package name */
    public int f41272d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41273e;

    /* renamed from: k, reason: collision with root package name */
    public float f41279k;

    /* renamed from: l, reason: collision with root package name */
    public String f41280l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f41283o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f41284p;

    /* renamed from: r, reason: collision with root package name */
    public b f41286r;

    /* renamed from: f, reason: collision with root package name */
    public int f41274f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f41275g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f41276h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f41277i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f41278j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f41281m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f41282n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f41285q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f41287s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f41271c && gVar.f41271c) {
                this.f41270b = gVar.f41270b;
                this.f41271c = true;
            }
            if (this.f41276h == -1) {
                this.f41276h = gVar.f41276h;
            }
            if (this.f41277i == -1) {
                this.f41277i = gVar.f41277i;
            }
            if (this.f41269a == null && (str = gVar.f41269a) != null) {
                this.f41269a = str;
            }
            if (this.f41274f == -1) {
                this.f41274f = gVar.f41274f;
            }
            if (this.f41275g == -1) {
                this.f41275g = gVar.f41275g;
            }
            if (this.f41282n == -1) {
                this.f41282n = gVar.f41282n;
            }
            if (this.f41283o == null && (alignment2 = gVar.f41283o) != null) {
                this.f41283o = alignment2;
            }
            if (this.f41284p == null && (alignment = gVar.f41284p) != null) {
                this.f41284p = alignment;
            }
            if (this.f41285q == -1) {
                this.f41285q = gVar.f41285q;
            }
            if (this.f41278j == -1) {
                this.f41278j = gVar.f41278j;
                this.f41279k = gVar.f41279k;
            }
            if (this.f41286r == null) {
                this.f41286r = gVar.f41286r;
            }
            if (this.f41287s == Float.MAX_VALUE) {
                this.f41287s = gVar.f41287s;
            }
            if (!this.f41273e && gVar.f41273e) {
                this.f41272d = gVar.f41272d;
                this.f41273e = true;
            }
            if (this.f41281m == -1 && (i10 = gVar.f41281m) != -1) {
                this.f41281m = i10;
            }
        }
    }
}
