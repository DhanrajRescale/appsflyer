package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f42498a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42499b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42500c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42501d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42502e;

    public m(String fairMarketValue, String discountPercentage, float f10, boolean z10, String comment) {
        Intrinsics.checkNotNullParameter(fairMarketValue, "fairMarketValue");
        Intrinsics.checkNotNullParameter(discountPercentage, "discountPercentage");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f42498a = fairMarketValue;
        this.f42499b = discountPercentage;
        this.f42500c = f10;
        this.f42501d = z10;
        this.f42502e = comment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.a(this.f42498a, mVar.f42498a) && Intrinsics.a(this.f42499b, mVar.f42499b) && Float.compare(this.f42500c, mVar.f42500c) == 0 && this.f42501d == mVar.f42501d && Intrinsics.a(this.f42502e, mVar.f42502e);
    }

    public final int hashCode() {
        return this.f42502e.hashCode() + v.e.d(this.f42501d, v.e.a(this.f42500c, jr.h.g(this.f42499b, this.f42498a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StockAnalysisCalculationResult(fairMarketValue=");
        sb2.append(this.f42498a);
        sb2.append(", discountPercentage=");
        sb2.append(this.f42499b);
        sb2.append(", valuationPercentage=");
        sb2.append(this.f42500c);
        sb2.append(", isDiscounted=");
        sb2.append(this.f42501d);
        sb2.append(", comment=");
        return nn.d.o(sb2, this.f42502e, ")");
    }
}
