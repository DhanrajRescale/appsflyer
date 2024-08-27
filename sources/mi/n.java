package mi;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final p f27802a;

    /* renamed from: b, reason: collision with root package name */
    public final p f27803b;

    /* renamed from: c, reason: collision with root package name */
    public final p f27804c;

    /* renamed from: d, reason: collision with root package name */
    public final p f27805d;

    /* renamed from: e, reason: collision with root package name */
    public final p f27806e;

    public n(p quantityError, p orderTypeError, p priceError, p stopLossError, p bookProfitError) {
        Intrinsics.checkNotNullParameter(quantityError, "quantityError");
        Intrinsics.checkNotNullParameter(orderTypeError, "orderTypeError");
        Intrinsics.checkNotNullParameter(priceError, "priceError");
        Intrinsics.checkNotNullParameter(stopLossError, "stopLossError");
        Intrinsics.checkNotNullParameter(bookProfitError, "bookProfitError");
        this.f27802a = quantityError;
        this.f27803b = orderTypeError;
        this.f27804c = priceError;
        this.f27805d = stopLossError;
        this.f27806e = bookProfitError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.a(this.f27802a, nVar.f27802a) && Intrinsics.a(this.f27803b, nVar.f27803b) && Intrinsics.a(this.f27804c, nVar.f27804c) && Intrinsics.a(this.f27805d, nVar.f27805d) && Intrinsics.a(this.f27806e, nVar.f27806e);
    }

    public final int hashCode() {
        return this.f27806e.hashCode() + ((this.f27805d.hashCode() + ((this.f27804c.hashCode() + ((this.f27803b.hashCode() + (this.f27802a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StockOrderValidationResults(quantityError=" + this.f27802a + ", orderTypeError=" + this.f27803b + ", priceError=" + this.f27804c + ", stopLossError=" + this.f27805d + ", bookProfitError=" + this.f27806e + ")";
    }
}
