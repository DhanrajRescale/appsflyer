package ri;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final p f33779a;

    /* renamed from: b, reason: collision with root package name */
    public final p f33780b;

    public l(p quantityError, p priceError) {
        Intrinsics.checkNotNullParameter(quantityError, "quantityError");
        Intrinsics.checkNotNullParameter(priceError, "priceError");
        this.f33779a = quantityError;
        this.f33780b = priceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.f33779a, lVar.f33779a) && Intrinsics.a(this.f33780b, lVar.f33780b);
    }

    public final int hashCode() {
        return this.f33780b.hashCode() + (this.f33779a.hashCode() * 31);
    }

    public final String toString() {
        return "ModifyStockCoverOrderValidationResults(quantityError=" + this.f33779a + ", priceError=" + this.f33780b + ")";
    }
}
