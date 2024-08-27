package mi;

import android.os.Bundle;
import com.assetgro.stockgro.data.model.StockOrderDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final StockOrderDto f27801a;

    public m(StockOrderDto stock) {
        Intrinsics.checkNotNullParameter(stock, "stock");
        this.f27801a = stock;
    }

    @NotNull
    public static final m fromBundle(@NotNull Bundle bundle) {
        return yk.o.O(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.a(this.f27801a, ((m) obj).f27801a);
    }

    public final int hashCode() {
        return this.f27801a.hashCode();
    }

    public final String toString() {
        return "StockOrderPaymentSuccessFragmentArgs(stock=" + this.f27801a + ")";
    }
}
