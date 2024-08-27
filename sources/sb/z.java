package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34545d;

    public z(String stockName) {
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        this.f34545d = stockName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.a(this.f34545d, ((z) obj).f34545d);
    }

    public final int hashCode() {
        return this.f34545d.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowStockDetail(stockName="), this.f34545d, ")");
    }
}
