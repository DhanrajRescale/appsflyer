package ji;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f21402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21403b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21404c;

    public e(String portfolioId, String stockId, int i10) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        this.f21402a = portfolioId;
        this.f21403b = stockId;
        this.f21404c = i10;
    }

    @NotNull
    public static final e fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", e.class, "portfolioId")) {
            String string = bundle.getString("portfolioId");
            if (string != null) {
                if (bundle.containsKey("stockId")) {
                    String string2 = bundle.getString("stockId");
                    if (string2 != null) {
                        if (bundle.containsKey("quantity")) {
                            return new e(string, string2, bundle.getInt("quantity"));
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f21402a, eVar.f21402a) && Intrinsics.a(this.f21403b, eVar.f21403b) && this.f21404c == eVar.f21404c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21404c) + jr.h.g(this.f21403b, this.f21402a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StockCoverOrderFragmentArgs(portfolioId=");
        sb2.append(this.f21402a);
        sb2.append(", stockId=");
        sb2.append(this.f21403b);
        sb2.append(", quantity=");
        return nn.d.m(sb2, this.f21404c, ")");
    }
}
