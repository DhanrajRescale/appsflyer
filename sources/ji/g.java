package ji;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p f21406a;

    /* renamed from: b, reason: collision with root package name */
    public final p f21407b;

    public g(p quantityError, p priceError) {
        Intrinsics.checkNotNullParameter(quantityError, "quantityError");
        Intrinsics.checkNotNullParameter(priceError, "priceError");
        this.f21406a = quantityError;
        this.f21407b = priceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f21406a, gVar.f21406a) && Intrinsics.a(this.f21407b, gVar.f21407b);
    }

    public final int hashCode() {
        return this.f21407b.hashCode() + (this.f21406a.hashCode() * 31);
    }

    public final String toString() {
        return "StockCoverOrderValidationResults(quantityError=" + this.f21406a + ", priceError=" + this.f21407b + ")";
    }
}
