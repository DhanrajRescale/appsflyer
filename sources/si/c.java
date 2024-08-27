package si;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f34643a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34644b;

    public c(String portfolioId, String stockId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        this.f34643a = portfolioId;
        this.f34644b = stockId;
    }

    @NotNull
    public static final c fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", c.class, "portfolioId")) {
            String string = bundle.getString("portfolioId");
            if (string != null) {
                if (bundle.containsKey("stockId")) {
                    String string2 = bundle.getString("stockId");
                    if (string2 != null) {
                        return new c(string, string2);
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f34643a, cVar.f34643a) && Intrinsics.a(this.f34644b, cVar.f34644b);
    }

    public final int hashCode() {
        return this.f34644b.hashCode() + (this.f34643a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModifySellOrderFragmentArgs(portfolioId=");
        sb2.append(this.f34643a);
        sb2.append(", stockId=");
        return nn.d.o(sb2, this.f34644b, ")");
    }
}
