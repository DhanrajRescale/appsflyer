package b5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h1 implements k {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;

    /* renamed from: r, reason: collision with root package name */
    public static final Object f3323r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final Object f3324s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static final k0 f3325t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f3326u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f3327v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f3328w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f3329x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f3330y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f3331z;

    /* renamed from: b, reason: collision with root package name */
    public Object f3333b;

    /* renamed from: d, reason: collision with root package name */
    public Object f3335d;

    /* renamed from: e, reason: collision with root package name */
    public long f3336e;

    /* renamed from: f, reason: collision with root package name */
    public long f3337f;

    /* renamed from: g, reason: collision with root package name */
    public long f3338g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3339h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3340i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3341j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f3342k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3343l;

    /* renamed from: m, reason: collision with root package name */
    public long f3344m;

    /* renamed from: n, reason: collision with root package name */
    public long f3345n;

    /* renamed from: o, reason: collision with root package name */
    public int f3346o;

    /* renamed from: p, reason: collision with root package name */
    public int f3347p;

    /* renamed from: q, reason: collision with root package name */
    public long f3348q;

    /* renamed from: a, reason: collision with root package name */
    public Object f3332a = f3323r;

    /* renamed from: c, reason: collision with root package name */
    public k0 f3334c = f3325t;

    /* JADX WARN: Type inference failed for: r2v1, types: [b5.z, b5.a0] */
    static {
        boolean z10;
        f0 f0Var;
        y yVar = new y();
        b0 b0Var = new b0();
        List emptyList = Collections.emptyList();
        lp.j1 j1Var = lp.j1.f24998e;
        g0 g0Var = g0.f3304c;
        Uri uri = Uri.EMPTY;
        if (b0Var.f3217b != null && b0Var.f3216a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.H0(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f3216a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, emptyList, null, j1Var, null);
        } else {
            f0Var = null;
        }
        f3325t = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), n0.I, g0Var);
        int i10 = e5.x.f15050a;
        f3326u = Integer.toString(1, 36);
        f3327v = Integer.toString(2, 36);
        f3328w = Integer.toString(3, 36);
        f3329x = Integer.toString(4, 36);
        f3330y = Integer.toString(5, 36);
        f3331z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f3341j;
        if (this.f3342k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.H0(z11);
        if (this.f3342k == null) {
            return false;
        }
        return true;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, e0 e0Var, long j13, long j14, int i10, int i11, long j15) {
        k0 k0Var2;
        Object obj3;
        boolean z12;
        f0 f0Var;
        this.f3332a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f3325t;
        }
        this.f3334c = k0Var2;
        if (k0Var != null && (f0Var = k0Var.f3390b) != null) {
            obj3 = f0Var.f3296h;
        } else {
            obj3 = null;
        }
        this.f3333b = obj3;
        this.f3335d = obj2;
        this.f3336e = j10;
        this.f3337f = j11;
        this.f3338g = j12;
        this.f3339h = z10;
        this.f3340i = z11;
        if (e0Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f3341j = z12;
        this.f3342k = e0Var;
        this.f3344m = j13;
        this.f3345n = j14;
        this.f3346o = i10;
        this.f3347p = i11;
        this.f3348q = j15;
        this.f3343l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h1.class.equals(obj.getClass())) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (e5.x.a(this.f3332a, h1Var.f3332a) && e5.x.a(this.f3334c, h1Var.f3334c) && e5.x.a(this.f3335d, h1Var.f3335d) && e5.x.a(this.f3342k, h1Var.f3342k) && this.f3336e == h1Var.f3336e && this.f3337f == h1Var.f3337f && this.f3338g == h1Var.f3338g && this.f3339h == h1Var.f3339h && this.f3340i == h1Var.f3340i && this.f3343l == h1Var.f3343l && this.f3344m == h1Var.f3344m && this.f3345n == h1Var.f3345n && this.f3346o == h1Var.f3346o && this.f3347p == h1Var.f3347p && this.f3348q == h1Var.f3348q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3334c.hashCode() + ((this.f3332a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f3335d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f3342k;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        int i12 = (i11 + i10) * 31;
        long j10 = this.f3336e;
        int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3337f;
        int i14 = (i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f3338g;
        int i15 = (((((((i14 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f3339h ? 1 : 0)) * 31) + (this.f3340i ? 1 : 0)) * 31) + (this.f3343l ? 1 : 0)) * 31;
        long j13 = this.f3344m;
        int i16 = (i15 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f3345n;
        int i17 = (((((i16 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f3346o) * 31) + this.f3347p) * 31;
        long j15 = this.f3348q;
        return i17 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
