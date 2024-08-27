package o2;

import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* loaded from: classes.dex */
public final class d implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29459a;

    public d(int i10) {
        this.f29459a = i10;
    }

    @Override // o2.j0
    public final d0 a(d0 d0Var) {
        int i10 = this.f29459a;
        if (i10 != 0 && i10 != Integer.MAX_VALUE) {
            return new d0(kotlin.ranges.d.f(d0Var.f29469a + i10, 1, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
        }
        return d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f29459a == ((d) obj).f29459a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29459a);
    }

    public final String toString() {
        return a3.a.i(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f29459a, ')');
    }
}
