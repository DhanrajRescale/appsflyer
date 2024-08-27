package ti;

import ij.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final p f36099a;

    /* renamed from: b, reason: collision with root package name */
    public final p f36100b;

    /* renamed from: c, reason: collision with root package name */
    public final p f36101c;

    /* renamed from: d, reason: collision with root package name */
    public final p f36102d;

    /* renamed from: e, reason: collision with root package name */
    public final p f36103e;

    public f(p quantityError, p orderTypeError, p priceError, p stopLossError, p bookProfitError) {
        Intrinsics.checkNotNullParameter(quantityError, "quantityError");
        Intrinsics.checkNotNullParameter(orderTypeError, "orderTypeError");
        Intrinsics.checkNotNullParameter(priceError, "priceError");
        Intrinsics.checkNotNullParameter(stopLossError, "stopLossError");
        Intrinsics.checkNotNullParameter(bookProfitError, "bookProfitError");
        this.f36099a = quantityError;
        this.f36100b = orderTypeError;
        this.f36101c = priceError;
        this.f36102d = stopLossError;
        this.f36103e = bookProfitError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f36099a, fVar.f36099a) && Intrinsics.a(this.f36100b, fVar.f36100b) && Intrinsics.a(this.f36101c, fVar.f36101c) && Intrinsics.a(this.f36102d, fVar.f36102d) && Intrinsics.a(this.f36103e, fVar.f36103e);
    }

    public final int hashCode() {
        return this.f36103e.hashCode() + ((this.f36102d.hashCode() + ((this.f36101c.hashCode() + ((this.f36100b.hashCode() + (this.f36099a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StockOrderValidationResults(quantityError=" + this.f36099a + ", orderTypeError=" + this.f36100b + ", priceError=" + this.f36101c + ", stopLossError=" + this.f36102d + ", bookProfitError=" + this.f36103e + ")";
    }
}
