package ja;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final List f21272a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21273b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21274c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21275d;

    public j(List optionList, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(optionList, "optionList");
        this.f21272a = optionList;
        this.f21273b = z10;
        this.f21274c = z11;
        this.f21275d = z12;
    }

    public static j a(j jVar, boolean z10, boolean z11, boolean z12, int i10) {
        List optionList;
        if ((i10 & 1) != 0) {
            optionList = jVar.f21272a;
        } else {
            optionList = null;
        }
        if ((i10 & 2) != 0) {
            z10 = jVar.f21273b;
        }
        if ((i10 & 4) != 0) {
            z11 = jVar.f21274c;
        }
        if ((i10 & 8) != 0) {
            z12 = jVar.f21275d;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(optionList, "optionList");
        return new j(optionList, z10, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.a(this.f21272a, jVar.f21272a) && this.f21273b == jVar.f21273b && this.f21274c == jVar.f21274c && this.f21275d == jVar.f21275d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21275d) + v.e.d(this.f21274c, v.e.d(this.f21273b, this.f21272a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MarketOptionsListState(optionList=" + this.f21272a + ", showShimmer=" + this.f21273b + ", isRefreshing=" + this.f21274c + ", showRetryScreen=" + this.f21275d + ")";
    }
}
