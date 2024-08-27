package vi;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f38090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38092c;

    public d(String portfolioId, String stockId, int i10) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        this.f38090a = portfolioId;
        this.f38091b = stockId;
        this.f38092c = i10;
    }

    @NotNull
    public static final d fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", d.class, "portfolioId")) {
            String string = bundle.getString("portfolioId");
            if (string != null) {
                if (bundle.containsKey("stockId")) {
                    String string2 = bundle.getString("stockId");
                    if (string2 != null) {
                        if (bundle.containsKey("quantity")) {
                            return new d(string, string2, bundle.getInt("quantity"));
                        }
                        throw new IllegalArgumentException("Required argument \"quantity\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"stockId\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"stockId\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"portfolioId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"portfolioId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f38090a, dVar.f38090a) && Intrinsics.a(this.f38091b, dVar.f38091b) && this.f38092c == dVar.f38092c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38092c) + jr.h.g(this.f38091b, this.f38090a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StockSellFragmentArgs(portfolioId=");
        sb2.append(this.f38090a);
        sb2.append(", stockId=");
        sb2.append(this.f38091b);
        sb2.append(", quantity=");
        return nn.d.m(sb2, this.f38092c, ")");
    }
}
