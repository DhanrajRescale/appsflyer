package ra;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f33549a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33550b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33551c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33552d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33553e;

    public c(List insightList, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(insightList, "insightList");
        this.f33549a = insightList;
        this.f33550b = z10;
        this.f33551c = z11;
        this.f33552d = z12;
        this.f33553e = z13;
    }

    public static c a(c cVar, List list, boolean z10, boolean z11, boolean z12, int i10) {
        boolean z13;
        if ((i10 & 1) != 0) {
            list = cVar.f33549a;
        }
        List insightList = list;
        if ((i10 & 2) != 0) {
            z10 = cVar.f33550b;
        }
        boolean z14 = z10;
        if ((i10 & 4) != 0) {
            z11 = cVar.f33551c;
        }
        boolean z15 = z11;
        if ((i10 & 8) != 0) {
            z13 = cVar.f33552d;
        } else {
            z13 = false;
        }
        boolean z16 = z13;
        if ((i10 & 16) != 0) {
            z12 = cVar.f33553e;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(insightList, "insightList");
        return new c(insightList, z14, z15, z16, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f33549a, cVar.f33549a) && this.f33550b == cVar.f33550b && this.f33551c == cVar.f33551c && this.f33552d == cVar.f33552d && this.f33553e == cVar.f33553e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33553e) + v.e.d(this.f33552d, v.e.d(this.f33551c, v.e.d(this.f33550b, this.f33549a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketStockInsightsState(insightList=");
        sb2.append(this.f33549a);
        sb2.append(", showShimmer=");
        sb2.append(this.f33550b);
        sb2.append(", isRefreshing=");
        sb2.append(this.f33551c);
        sb2.append(", isUpdateData=");
        sb2.append(this.f33552d);
        sb2.append(", showRetryScreen=");
        return da.e.o(sb2, this.f33553e, ")");
    }
}
