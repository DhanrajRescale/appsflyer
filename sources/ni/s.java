package ni;

import com.assetgro.stockgro.data.repository.SortDirection;
import com.assetgro.stockgro.data.repository.SortOption;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SortOption f28762a;

    /* renamed from: b, reason: collision with root package name */
    public final SortDirection f28763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28764c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28765d;

    public s(SortOption option, SortDirection direction, int i10) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f28762a = option;
        this.f28763b = direction;
        this.f28764c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f28762a == sVar.f28762a && this.f28763b == sVar.f28763b && this.f28764c == sVar.f28764c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28764c) + ((this.f28763b.hashCode() + (this.f28762a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StockSortItem(option=");
        sb2.append(this.f28762a);
        sb2.append(", direction=");
        sb2.append(this.f28763b);
        sb2.append(", displayName=");
        return nn.d.m(sb2, this.f28764c, ")");
    }
}
