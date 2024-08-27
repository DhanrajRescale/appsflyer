package si;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final ModifyOrderDto f34655a;

    public j(ModifyOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f34655a = stockOrder;
    }

    @NotNull
    public static final j fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", j.class, "stockOrder")) {
            if (!Parcelable.class.isAssignableFrom(ModifyOrderDto.class) && !Serializable.class.isAssignableFrom(ModifyOrderDto.class)) {
                throw new UnsupportedOperationException(ModifyOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            ModifyOrderDto modifyOrderDto = (ModifyOrderDto) bundle.get("stockOrder");
            if (modifyOrderDto != null) {
                return new j(modifyOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stockOrder\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stockOrder\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.a(this.f34655a, ((j) obj).f34655a);
    }

    public final int hashCode() {
        return this.f34655a.hashCode();
    }

    public final String toString() {
        return "StockModifySellOrderConfirmationFragmentArgs(stockOrder=" + this.f34655a + ")";
    }
}
