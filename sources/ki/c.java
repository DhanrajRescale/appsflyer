package ki;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.h;
import com.assetgro.stockgro.data.model.StockOrderDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final StockOrderDto f23201a;

    public c(StockOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f23201a = stockOrder;
    }

    @NotNull
    public static final c fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", c.class, "stockOrder")) {
            if (!Parcelable.class.isAssignableFrom(StockOrderDto.class) && !Serializable.class.isAssignableFrom(StockOrderDto.class)) {
                throw new UnsupportedOperationException(StockOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            StockOrderDto stockOrderDto = (StockOrderDto) bundle.get("stockOrder");
            if (stockOrderDto != null) {
                return new c(stockOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stockOrder\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stockOrder\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f23201a, ((c) obj).f23201a);
    }

    public final int hashCode() {
        return this.f23201a.hashCode();
    }

    public final String toString() {
        return "StockCoverOrderConfirmationFragmentArgs(stockOrder=" + this.f23201a + ")";
    }
}
