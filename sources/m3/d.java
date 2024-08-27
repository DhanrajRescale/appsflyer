package m3;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f27306a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f27307a0;

    /* renamed from: b, reason: collision with root package name */
    public int f27308b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f27309b0;

    /* renamed from: c, reason: collision with root package name */
    public float f27310c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f27311c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27312d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f27313d0;

    /* renamed from: e, reason: collision with root package name */
    public int f27314e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f27315e0;

    /* renamed from: f, reason: collision with root package name */
    public int f27316f;

    /* renamed from: f0, reason: collision with root package name */
    public int f27317f0;

    /* renamed from: g, reason: collision with root package name */
    public int f27318g;

    /* renamed from: g0, reason: collision with root package name */
    public int f27319g0;

    /* renamed from: h, reason: collision with root package name */
    public int f27320h;

    /* renamed from: h0, reason: collision with root package name */
    public int f27321h0;

    /* renamed from: i, reason: collision with root package name */
    public int f27322i;

    /* renamed from: i0, reason: collision with root package name */
    public int f27323i0;

    /* renamed from: j, reason: collision with root package name */
    public int f27324j;

    /* renamed from: j0, reason: collision with root package name */
    public int f27325j0;

    /* renamed from: k, reason: collision with root package name */
    public int f27326k;

    /* renamed from: k0, reason: collision with root package name */
    public int f27327k0;

    /* renamed from: l, reason: collision with root package name */
    public int f27328l;

    /* renamed from: l0, reason: collision with root package name */
    public float f27329l0;

    /* renamed from: m, reason: collision with root package name */
    public int f27330m;

    /* renamed from: m0, reason: collision with root package name */
    public int f27331m0;

    /* renamed from: n, reason: collision with root package name */
    public int f27332n;
    public int n0;

    /* renamed from: o, reason: collision with root package name */
    public int f27333o;

    /* renamed from: o0, reason: collision with root package name */
    public float f27334o0;

    /* renamed from: p, reason: collision with root package name */
    public int f27335p;

    /* renamed from: p0, reason: collision with root package name */
    public j3.d f27336p0;

    /* renamed from: q, reason: collision with root package name */
    public int f27337q;

    /* renamed from: r, reason: collision with root package name */
    public float f27338r;

    /* renamed from: s, reason: collision with root package name */
    public int f27339s;

    /* renamed from: t, reason: collision with root package name */
    public int f27340t;

    /* renamed from: u, reason: collision with root package name */
    public int f27341u;

    /* renamed from: v, reason: collision with root package name */
    public int f27342v;

    /* renamed from: w, reason: collision with root package name */
    public int f27343w;

    /* renamed from: x, reason: collision with root package name */
    public int f27344x;

    /* renamed from: y, reason: collision with root package name */
    public int f27345y;

    /* renamed from: z, reason: collision with root package name */
    public int f27346z;

    public final void a() {
        this.f27313d0 = false;
        this.f27307a0 = true;
        this.f27309b0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.W) {
            this.f27307a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.X) {
            this.f27309b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f27307a0 = false;
            if (i10 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f27309b0 = false;
            if (i11 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f27310c != -1.0f || this.f27306a != -1 || this.f27308b != -1) {
            this.f27313d0 = true;
            this.f27307a0 = true;
            this.f27309b0 = true;
            if (!(this.f27336p0 instanceof j3.h)) {
                this.f27336p0 = new j3.h();
            }
            ((j3.h) this.f27336p0).X(this.V);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.d.resolveLayoutDirection(int):void");
    }
}
