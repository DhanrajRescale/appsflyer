package ta;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f35653a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35654b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35655c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35656d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35657e;

    public i(List stockList, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(stockList, "stockList");
        this.f35653a = stockList;
        this.f35654b = z10;
        this.f35655c = z11;
        this.f35656d = z12;
        this.f35657e = z13;
    }

    public static i a(i iVar, List list, boolean z10, boolean z11, int i10) {
        boolean z12;
        boolean z13;
        if ((i10 & 1) != 0) {
            list = iVar.f35653a;
        }
        List stockList = list;
        if ((i10 & 2) != 0) {
            z10 = iVar.f35654b;
        }
        boolean z14 = z10;
        if ((i10 & 4) != 0) {
            z12 = iVar.f35655c;
        } else {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = iVar.f35656d;
        }
        boolean z15 = z11;
        if ((i10 & 16) != 0) {
            z13 = iVar.f35657e;
        } else {
            z13 = false;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(stockList, "stockList");
        return new i(stockList, z14, z12, z15, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f35653a, iVar.f35653a) && this.f35654b == iVar.f35654b && this.f35655c == iVar.f35655c && this.f35656d == iVar.f35656d && this.f35657e == iVar.f35657e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35657e) + v.e.d(this.f35656d, v.e.d(this.f35655c, v.e.d(this.f35654b, this.f35653a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketStocksListState(stockList=");
        sb2.append(this.f35653a);
        sb2.append(", showShimmer=");
        sb2.append(this.f35654b);
        sb2.append(", isRefreshing=");
        sb2.append(this.f35655c);
        sb2.append(", showRetryScreen=");
        sb2.append(this.f35656d);
        sb2.append(", isSearchOpen=");
        return da.e.o(sb2, this.f35657e, ")");
    }
}
