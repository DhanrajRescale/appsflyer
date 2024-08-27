package b5;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class c0 implements k {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3226i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3227j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3228k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3229l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f3230m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f3231n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f3232o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f3233p;

    /* renamed from: q, reason: collision with root package name */
    public static final i5.w f3234q;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f3235a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f3236b;

    /* renamed from: c, reason: collision with root package name */
    public final lp.s0 f3237c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3238d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3239e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3240f;

    /* renamed from: g, reason: collision with root package name */
    public final lp.o0 f3241g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f3242h;

    static {
        int i10 = e5.x.f15050a;
        f3226i = Integer.toString(0, 36);
        f3227j = Integer.toString(1, 36);
        f3228k = Integer.toString(2, 36);
        f3229l = Integer.toString(3, 36);
        f3230m = Integer.toString(4, 36);
        f3231n = Integer.toString(5, 36);
        f3232o = Integer.toString(6, 36);
        f3233p = Integer.toString(7, 36);
        f3234q = new i5.w(23);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f3221f && b0Var.f3217b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.H0(z10);
        UUID uuid = b0Var.f3216a;
        uuid.getClass();
        this.f3235a = uuid;
        this.f3236b = b0Var.f3217b;
        this.f3237c = b0Var.f3218c;
        this.f3238d = b0Var.f3219d;
        this.f3240f = b0Var.f3221f;
        this.f3239e = b0Var.f3220e;
        this.f3241g = b0Var.f3222g;
        byte[] bArr2 = b0Var.f3223h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f3242h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f3235a.equals(c0Var.f3235a) && e5.x.a(this.f3236b, c0Var.f3236b) && e5.x.a(this.f3237c, c0Var.f3237c) && this.f3238d == c0Var.f3238d && this.f3240f == c0Var.f3240f && this.f3239e == c0Var.f3239e && this.f3241g.equals(c0Var.f3241g) && Arrays.equals(this.f3242h, c0Var.f3242h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3235a.hashCode() * 31;
        Uri uri = this.f3236b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f3242h) + ((this.f3241g.hashCode() + ((((((((this.f3237c.hashCode() + ((hashCode + i10) * 31)) * 31) + (this.f3238d ? 1 : 0)) * 31) + (this.f3240f ? 1 : 0)) * 31) + (this.f3239e ? 1 : 0)) * 31)) * 31);
    }
}
