package b5;

import android.net.Uri;

/* loaded from: classes.dex */
public final class g0 implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f3304c = new g0(new h.c(12, 0));

    /* renamed from: d, reason: collision with root package name */
    public static final String f3305d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3306e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f3307f;

    /* renamed from: g, reason: collision with root package name */
    public static final i5.w f3308g;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3310b;

    static {
        int i10 = e5.x.f15050a;
        f3305d = Integer.toString(0, 36);
        f3306e = Integer.toString(1, 36);
        f3307f = Integer.toString(2, 36);
        f3308g = new i5.w(27);
    }

    public g0(h.c cVar) {
        this.f3309a = (Uri) cVar.f17583b;
        this.f3310b = (String) cVar.f17584c;
        Object obj = cVar.f17585d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (e5.x.a(this.f3309a, g0Var.f3309a) && e5.x.a(this.f3310b, g0Var.f3310b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Uri uri = this.f3309a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f3310b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }
}
