package b5;

import android.net.Uri;

/* loaded from: classes.dex */
public class j0 implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final String f3358h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3359i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3360j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3361k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3362l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f3363m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f3364n;

    /* renamed from: o, reason: collision with root package name */
    public static final i5.w f3365o;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3367b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3368c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3369d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3370e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3371f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3372g;

    static {
        int i10 = e5.x.f15050a;
        f3358h = Integer.toString(0, 36);
        f3359i = Integer.toString(1, 36);
        f3360j = Integer.toString(2, 36);
        f3361k = Integer.toString(3, 36);
        f3362l = Integer.toString(4, 36);
        f3363m = Integer.toString(5, 36);
        f3364n = Integer.toString(6, 36);
        f3365o = new i5.w(28);
    }

    public j0(i0 i0Var) {
        this.f3366a = (Uri) i0Var.f3353d;
        this.f3367b = i0Var.f3350a;
        this.f3368c = (String) i0Var.f3354e;
        this.f3369d = i0Var.f3351b;
        this.f3370e = i0Var.f3352c;
        this.f3371f = (String) i0Var.f3355f;
        this.f3372g = (String) i0Var.f3356g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b5.i0] */
    public final i0 a() {
        ?? obj = new Object();
        obj.f3353d = this.f3366a;
        obj.f3350a = this.f3367b;
        obj.f3354e = this.f3368c;
        obj.f3351b = this.f3369d;
        obj.f3352c = this.f3370e;
        obj.f3355f = this.f3371f;
        obj.f3356g = this.f3372g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3366a.equals(j0Var.f3366a) && e5.x.a(this.f3367b, j0Var.f3367b) && e5.x.a(this.f3368c, j0Var.f3368c) && this.f3369d == j0Var.f3369d && this.f3370e == j0Var.f3370e && e5.x.a(this.f3371f, j0Var.f3371f) && e5.x.a(this.f3372g, j0Var.f3372g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3366a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3367b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3368c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.f3369d) * 31) + this.f3370e) * 31;
        String str3 = this.f3371f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3372g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
