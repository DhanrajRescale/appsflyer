package vi;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final p f38103a;

    /* renamed from: b, reason: collision with root package name */
    public final p f38104b;

    public l(p quantityError, p priceError) {
        Intrinsics.checkNotNullParameter(quantityError, "quantityError");
        Intrinsics.checkNotNullParameter(priceError, "priceError");
        this.f38103a = quantityError;
        this.f38104b = priceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.f38103a, lVar.f38103a) && Intrinsics.a(this.f38104b, lVar.f38104b);
    }

    public final int hashCode() {
        return this.f38104b.hashCode() + (this.f38103a.hashCode() * 31);
    }

    public final String toString() {
        return "StockSellOrderValidationResults(quantityError=" + this.f38103a + ", priceError=" + this.f38104b + ")";
    }
}
