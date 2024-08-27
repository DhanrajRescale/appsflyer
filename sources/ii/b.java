package ii;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.h;
import com.assetgro.stockgro.data.model.StockOrderDto;
import da.e;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final StockOrderDto f20035a;

    public b(StockOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f20035a = stockOrder;
    }

    @NotNull
    public static final b fromBundle(@NotNull Bundle bundle) {
        if (e.y(bundle, "bundle", b.class, "stockOrder")) {
            if (!Parcelable.class.isAssignableFrom(StockOrderDto.class) && !Serializable.class.isAssignableFrom(StockOrderDto.class)) {
                throw new UnsupportedOperationException(StockOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            StockOrderDto stockOrderDto = (StockOrderDto) bundle.get("stockOrder");
            if (stockOrderDto != null) {
                return new b(stockOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stockOrder\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stockOrder\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.a(this.f20035a, ((b) obj).f20035a);
    }

    public final int hashCode() {
        return this.f20035a.hashCode();
    }

    public final String toString() {
        return "StockTransactionPendingFragmentArgs(stockOrder=" + this.f20035a + ")";
    }
}
