package nl;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f28964a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28965b;

    public /* synthetic */ x(int i10) {
        if (i10 != 1) {
            this.f28964a = "oauth/access_token";
            this.f28965b = "fb_extend_sso_token";
        } else {
            this.f28964a = "refresh_access_token";
            this.f28965b = "ig_refresh_token";
        }
    }

    public x(String str, String str2) {
        this.f28964a = str;
        this.f28965b = str2;
    }
}
