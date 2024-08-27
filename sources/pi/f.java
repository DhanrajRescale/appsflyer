package pi;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p f31117a;

    /* renamed from: b, reason: collision with root package name */
    public final p f31118b;

    /* renamed from: c, reason: collision with root package name */
    public final p f31119c;

    /* renamed from: d, reason: collision with root package name */
    public final p f31120d;

    /* renamed from: e, reason: collision with root package name */
    public final p f31121e;

    public f(p quantityError, p orderTypeError, p priceError, p stopLossError, p bookProfitError) {
        Intrinsics.checkNotNullParameter(quantityError, "quantityError");
        Intrinsics.checkNotNullParameter(orderTypeError, "orderTypeError");
        Intrinsics.checkNotNullParameter(priceError, "priceError");
        Intrinsics.checkNotNullParameter(stopLossError, "stopLossError");
        Intrinsics.checkNotNullParameter(bookProfitError, "bookProfitError");
        this.f31117a = quantityError;
        this.f31118b = orderTypeError;
        this.f31119c = priceError;
        this.f31120d = stopLossError;
        this.f31121e = bookProfitError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f31117a, fVar.f31117a) && Intrinsics.a(this.f31118b, fVar.f31118b) && Intrinsics.a(this.f31119c, fVar.f31119c) && Intrinsics.a(this.f31120d, fVar.f31120d) && Intrinsics.a(this.f31121e, fVar.f31121e);
    }

    public final int hashCode() {
        return this.f31121e.hashCode() + ((this.f31120d.hashCode() + ((this.f31119c.hashCode() + ((this.f31118b.hashCode() + (this.f31117a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StockOrderValidationResults(quantityError=" + this.f31117a + ", orderTypeError=" + this.f31118b + ", priceError=" + this.f31119c + ", stopLossError=" + this.f31120d + ", bookProfitError=" + this.f31121e + ")";
    }
}
