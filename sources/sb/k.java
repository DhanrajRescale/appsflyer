package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f34501a;

    public k(String stockName) {
        Intrinsics.checkNotNullParameter(stockName, "stockName");
        this.f34501a = stockName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.a(this.f34501a, ((k) obj).f34501a);
    }

    public final int hashCode() {
        return this.f34501a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowStockDetails(stockName="), this.f34501a, ")");
    }
}
