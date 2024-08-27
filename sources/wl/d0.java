package wl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final xk.a f39167a;

    /* renamed from: b, reason: collision with root package name */
    public final xk.i f39168b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f39169c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f39170d;

    public d0(xk.a accessToken, xk.i iVar, Set recentlyGrantedPermissions, Set recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f39167a = accessToken;
        this.f39168b = iVar;
        this.f39169c = recentlyGrantedPermissions;
        this.f39170d = recentlyDeniedPermissions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.a(this.f39167a, d0Var.f39167a) && Intrinsics.a(this.f39168b, d0Var.f39168b) && Intrinsics.a(this.f39169c, d0Var.f39169c) && Intrinsics.a(this.f39170d, d0Var.f39170d);
    }

    public final int hashCode() {
        int hashCode = this.f39167a.hashCode() * 31;
        xk.i iVar = this.f39168b;
        return this.f39170d.hashCode() + ((this.f39169c.hashCode() + ((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f39167a + ", authenticationToken=" + this.f39168b + ", recentlyGrantedPermissions=" + this.f39169c + ", recentlyDeniedPermissions=" + this.f39170d + ')';
    }
}
