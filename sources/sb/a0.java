package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34431d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34432e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34433f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34434g;

    public a0(String userId, String userName, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f34431d = userId;
        this.f34432e = userName;
        this.f34433f = z10;
        this.f34434g = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.a(this.f34431d, a0Var.f34431d) && Intrinsics.a(this.f34432e, a0Var.f34432e) && this.f34433f == a0Var.f34433f && this.f34434g == a0Var.f34434g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34434g) + v.e.d(this.f34433f, jr.h.g(this.f34432e, this.f34431d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowUserProfile(userId=");
        sb2.append(this.f34431d);
        sb2.append(", userName=");
        sb2.append(this.f34432e);
        sb2.append(", comingFromChat=");
        sb2.append(this.f34433f);
        sb2.append(", isRiaRra=");
        return da.e.o(sb2, this.f34434g, ")");
    }
}
