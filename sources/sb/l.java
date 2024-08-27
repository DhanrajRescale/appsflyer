package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f34508a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34509b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34510c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34511d;

    public l(String userId, String userName, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f34508a = userId;
        this.f34509b = userName;
        this.f34510c = z10;
        this.f34511d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.f34508a, lVar.f34508a) && Intrinsics.a(this.f34509b, lVar.f34509b) && this.f34510c == lVar.f34510c && this.f34511d == lVar.f34511d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34511d) + v.e.d(this.f34510c, jr.h.g(this.f34509b, this.f34508a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowUserProfile(userId=");
        sb2.append(this.f34508a);
        sb2.append(", userName=");
        sb2.append(this.f34509b);
        sb2.append(", comingFromChat=");
        sb2.append(this.f34510c);
        sb2.append(", isExpert=");
        return da.e.o(sb2, this.f34511d, ")");
    }
}
