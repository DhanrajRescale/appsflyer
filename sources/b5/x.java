package b5;

import android.net.Uri;

/* loaded from: classes.dex */
public final class x implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3674c;

    /* renamed from: d, reason: collision with root package name */
    public static final i5.w f3675d;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3676a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3677b;

    static {
        int i10 = e5.x.f15050a;
        f3674c = Integer.toString(0, 36);
        f3675d = new i5.w(21);
    }

    public x(tr.e eVar) {
        this.f3676a = (Uri) eVar.f36361b;
        this.f3677b = eVar.f36362c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f3676a.equals(xVar.f3676a) && e5.x.a(this.f3677b, xVar.f3677b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3676a.hashCode() * 31;
        Object obj = this.f3677b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
