package ri;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f33775a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33776b;

    public i(String portfolioId, String stockId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        this.f33775a = portfolioId;
        this.f33776b = stockId;
    }

    @NotNull
    public static final i fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", i.class, "portfolioId")) {
            String string = bundle.getString("portfolioId");
            if (string != null) {
                if (bundle.containsKey("stockId")) {
                    String string2 = bundle.getString("stockId");
                    if (string2 != null) {
                        return new i(string, string2);
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f33775a, iVar.f33775a) && Intrinsics.a(this.f33776b, iVar.f33776b);
    }

    public final int hashCode() {
        return this.f33776b.hashCode() + (this.f33775a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModifyStockCoverOrderFragmentArgs(portfolioId=");
        sb2.append(this.f33775a);
        sb2.append(", stockId=");
        return nn.d.o(sb2, this.f33776b, ")");
    }
}
