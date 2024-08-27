package vi;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.StockOrderDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final StockOrderDto f38098a;

    public h(StockOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f38098a = stockOrder;
    }

    @NotNull
    public static final h fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", h.class, "stockOrder")) {
            if (!Parcelable.class.isAssignableFrom(StockOrderDto.class) && !Serializable.class.isAssignableFrom(StockOrderDto.class)) {
                throw new UnsupportedOperationException(StockOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            StockOrderDto stockOrderDto = (StockOrderDto) bundle.get("stockOrder");
            if (stockOrderDto != null) {
                return new h(stockOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stockOrder\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stockOrder\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.a(this.f38098a, ((h) obj).f38098a);
    }

    public final int hashCode() {
        return this.f38098a.hashCode();
    }

    public final String toString() {
        return "StockSellOrderConfirmationFragmentArgs(stockOrder=" + this.f38098a + ")";
    }
}
