package xi;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p f40271a;

    /* renamed from: b, reason: collision with root package name */
    public final p f40272b;

    /* renamed from: c, reason: collision with root package name */
    public final p f40273c;

    /* renamed from: d, reason: collision with root package name */
    public final p f40274d;

    /* renamed from: e, reason: collision with root package name */
    public final p f40275e;

    public f(p quantityError, p orderTypeError, p priceError, p stopLossError, p bookProfitError) {
        Intrinsics.checkNotNullParameter(quantityError, "quantityError");
        Intrinsics.checkNotNullParameter(orderTypeError, "orderTypeError");
        Intrinsics.checkNotNullParameter(priceError, "priceError");
        Intrinsics.checkNotNullParameter(stopLossError, "stopLossError");
        Intrinsics.checkNotNullParameter(bookProfitError, "bookProfitError");
        this.f40271a = quantityError;
        this.f40272b = orderTypeError;
        this.f40273c = priceError;
        this.f40274d = stopLossError;
        this.f40275e = bookProfitError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f40271a, fVar.f40271a) && Intrinsics.a(this.f40272b, fVar.f40272b) && Intrinsics.a(this.f40273c, fVar.f40273c) && Intrinsics.a(this.f40274d, fVar.f40274d) && Intrinsics.a(this.f40275e, fVar.f40275e);
    }

    public final int hashCode() {
        return this.f40275e.hashCode() + ((this.f40274d.hashCode() + ((this.f40273c.hashCode() + ((this.f40272b.hashCode() + (this.f40271a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StockShortSellOrderValidationResults(quantityError=" + this.f40271a + ", orderTypeError=" + this.f40272b + ", priceError=" + this.f40273c + ", stopLossError=" + this.f40274d + ", bookProfitError=" + this.f40275e + ")";
    }
}
