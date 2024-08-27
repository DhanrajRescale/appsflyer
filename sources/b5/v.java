package b5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v implements k {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public final String f3641a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3643c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3645e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3646f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3647g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3648h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3649i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f3650j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3651k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3652l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3653m;

    /* renamed from: n, reason: collision with root package name */
    public final List f3654n;

    /* renamed from: o, reason: collision with root package name */
    public final r f3655o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3656p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3657q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3658r;

    /* renamed from: s, reason: collision with root package name */
    public final float f3659s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3660t;

    /* renamed from: u, reason: collision with root package name */
    public final float f3661u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f3662v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3663w;

    /* renamed from: x, reason: collision with root package name */
    public final n f3664x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3665y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3666z;
    public static final v I = new v(new u());
    public static final String J = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f3620e0 = Integer.toString(4, 36);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f3621f0 = Integer.toString(5, 36);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f3622g0 = Integer.toString(6, 36);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f3623h0 = Integer.toString(7, 36);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f3624i0 = Integer.toString(8, 36);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f3625j0 = Integer.toString(9, 36);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f3626k0 = Integer.toString(10, 36);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f3627l0 = Integer.toString(11, 36);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f3628m0 = Integer.toString(12, 36);
    public static final String n0 = Integer.toString(13, 36);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f3629o0 = Integer.toString(14, 36);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f3630p0 = Integer.toString(15, 36);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f3631q0 = Integer.toString(16, 36);

    /* renamed from: r0, reason: collision with root package name */
    public static final String f3632r0 = Integer.toString(17, 36);

    /* renamed from: s0, reason: collision with root package name */
    public static final String f3633s0 = Integer.toString(18, 36);

    /* renamed from: t0, reason: collision with root package name */
    public static final String f3634t0 = Integer.toString(19, 36);

    /* renamed from: u0, reason: collision with root package name */
    public static final String f3635u0 = Integer.toString(20, 36);

    /* renamed from: v0, reason: collision with root package name */
    public static final String f3636v0 = Integer.toString(21, 36);

    /* renamed from: w0, reason: collision with root package name */
    public static final String f3637w0 = Integer.toString(22, 36);

    /* renamed from: x0, reason: collision with root package name */
    public static final String f3638x0 = Integer.toString(23, 36);

    /* renamed from: y0, reason: collision with root package name */
    public static final String f3639y0 = Integer.toString(24, 36);

    /* renamed from: z0, reason: collision with root package name */
    public static final String f3640z0 = Integer.toString(25, 36);
    public static final String A0 = Integer.toString(26, 36);
    public static final String B0 = Integer.toString(27, 36);
    public static final String C0 = Integer.toString(28, 36);
    public static final String D0 = Integer.toString(29, 36);
    public static final String E0 = Integer.toString(30, 36);
    public static final String F0 = Integer.toString(31, 36);
    public static final i5.w G0 = new i5.w(18);

    public v(u uVar) {
        this.f3641a = uVar.f3590a;
        this.f3642b = uVar.f3591b;
        this.f3643c = e5.x.G(uVar.f3592c);
        this.f3644d = uVar.f3593d;
        this.f3645e = uVar.f3594e;
        int i10 = uVar.f3595f;
        this.f3646f = i10;
        int i11 = uVar.f3596g;
        this.f3647g = i11;
        this.f3648h = i11 != -1 ? i11 : i10;
        this.f3649i = uVar.f3597h;
        this.f3650j = uVar.f3598i;
        this.f3651k = uVar.f3599j;
        this.f3652l = uVar.f3600k;
        this.f3653m = uVar.f3601l;
        List list = uVar.f3602m;
        this.f3654n = list == null ? Collections.emptyList() : list;
        r rVar = uVar.f3603n;
        this.f3655o = rVar;
        this.f3656p = uVar.f3604o;
        this.f3657q = uVar.f3605p;
        this.f3658r = uVar.f3606q;
        this.f3659s = uVar.f3607r;
        int i12 = uVar.f3608s;
        this.f3660t = i12 == -1 ? 0 : i12;
        float f10 = uVar.f3609t;
        this.f3661u = f10 == -1.0f ? 1.0f : f10;
        this.f3662v = uVar.f3610u;
        this.f3663w = uVar.f3611v;
        this.f3664x = uVar.f3612w;
        this.f3665y = uVar.f3613x;
        this.f3666z = uVar.f3614y;
        this.A = uVar.f3615z;
        int i13 = uVar.A;
        this.B = i13 == -1 ? 0 : i13;
        int i14 = uVar.B;
        this.C = i14 != -1 ? i14 : 0;
        this.D = uVar.C;
        this.E = uVar.D;
        this.F = uVar.E;
        int i15 = uVar.F;
        if (i15 == 0 && rVar != null) {
            this.G = 1;
        } else {
            this.G = i15;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b5.u, java.lang.Object] */
    public final u a() {
        ?? obj = new Object();
        obj.f3590a = this.f3641a;
        obj.f3591b = this.f3642b;
        obj.f3592c = this.f3643c;
        obj.f3593d = this.f3644d;
        obj.f3594e = this.f3645e;
        obj.f3595f = this.f3646f;
        obj.f3596g = this.f3647g;
        obj.f3597h = this.f3649i;
        obj.f3598i = this.f3650j;
        obj.f3599j = this.f3651k;
        obj.f3600k = this.f3652l;
        obj.f3601l = this.f3653m;
        obj.f3602m = this.f3654n;
        obj.f3603n = this.f3655o;
        obj.f3604o = this.f3656p;
        obj.f3605p = this.f3657q;
        obj.f3606q = this.f3658r;
        obj.f3607r = this.f3659s;
        obj.f3608s = this.f3660t;
        obj.f3609t = this.f3661u;
        obj.f3610u = this.f3662v;
        obj.f3611v = this.f3663w;
        obj.f3612w = this.f3664x;
        obj.f3613x = this.f3665y;
        obj.f3614y = this.f3666z;
        obj.f3615z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        return obj;
    }

    public final int b() {
        int i10;
        int i11 = this.f3657q;
        if (i11 == -1 || (i10 = this.f3658r) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean c(v vVar) {
        List list = this.f3654n;
        if (list.size() != vVar.f3654n.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) vVar.f3654n.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        int i11 = this.H;
        if (i11 != 0 && (i10 = vVar.H) != 0 && i11 != i10) {
            return false;
        }
        if (this.f3644d == vVar.f3644d && this.f3645e == vVar.f3645e && this.f3646f == vVar.f3646f && this.f3647g == vVar.f3647g && this.f3653m == vVar.f3653m && this.f3656p == vVar.f3656p && this.f3657q == vVar.f3657q && this.f3658r == vVar.f3658r && this.f3660t == vVar.f3660t && this.f3663w == vVar.f3663w && this.f3665y == vVar.f3665y && this.f3666z == vVar.f3666z && this.A == vVar.A && this.B == vVar.B && this.C == vVar.C && this.D == vVar.D && this.E == vVar.E && this.F == vVar.F && this.G == vVar.G && Float.compare(this.f3659s, vVar.f3659s) == 0 && Float.compare(this.f3661u, vVar.f3661u) == 0 && e5.x.a(this.f3641a, vVar.f3641a) && e5.x.a(this.f3642b, vVar.f3642b) && e5.x.a(this.f3649i, vVar.f3649i) && e5.x.a(this.f3651k, vVar.f3651k) && e5.x.a(this.f3652l, vVar.f3652l) && e5.x.a(this.f3643c, vVar.f3643c) && Arrays.equals(this.f3662v, vVar.f3662v) && e5.x.a(this.f3650j, vVar.f3650j) && e5.x.a(this.f3664x, vVar.f3664x) && e5.x.a(this.f3655o, vVar.f3655o) && c(vVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.H == 0) {
            int i11 = 0;
            String str = this.f3641a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (527 + hashCode) * 31;
            String str2 = this.f3642b;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (i12 + i10) * 31;
            String str3 = this.f3643c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i14 = (((((((((i13 + hashCode2) * 31) + this.f3644d) * 31) + this.f3645e) * 31) + this.f3646f) * 31) + this.f3647g) * 31;
            String str4 = this.f3649i;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i15 = (i14 + hashCode3) * 31;
            q0 q0Var = this.f3650j;
            if (q0Var == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = q0Var.hashCode();
            }
            int i16 = (i15 + hashCode4) * 31;
            String str5 = this.f3651k;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i17 = (i16 + hashCode5) * 31;
            String str6 = this.f3652l;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            this.H = ((((((((((((((((((((Float.floatToIntBits(this.f3661u) + ((((Float.floatToIntBits(this.f3659s) + ((((((((((i17 + i11) * 31) + this.f3653m) * 31) + ((int) this.f3656p)) * 31) + this.f3657q) * 31) + this.f3658r) * 31)) * 31) + this.f3660t) * 31)) * 31) + this.f3663w) * 31) + this.f3665y) * 31) + this.f3666z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G;
        }
        return this.H;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3641a);
        sb2.append(", ");
        sb2.append(this.f3642b);
        sb2.append(", ");
        sb2.append(this.f3651k);
        sb2.append(", ");
        sb2.append(this.f3652l);
        sb2.append(", ");
        sb2.append(this.f3649i);
        sb2.append(", ");
        sb2.append(this.f3648h);
        sb2.append(", ");
        sb2.append(this.f3643c);
        sb2.append(", [");
        sb2.append(this.f3657q);
        sb2.append(", ");
        sb2.append(this.f3658r);
        sb2.append(", ");
        sb2.append(this.f3659s);
        sb2.append(", ");
        sb2.append(this.f3664x);
        sb2.append("], [");
        sb2.append(this.f3665y);
        sb2.append(", ");
        return nn.d.m(sb2, this.f3666z, "])");
    }
}
