package ri;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final ModifyOrderDto f33761a;

    public c(ModifyOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f33761a = stockOrder;
    }

    @NotNull
    public static final c fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", c.class, "stockOrder")) {
            if (!Parcelable.class.isAssignableFrom(ModifyOrderDto.class) && !Serializable.class.isAssignableFrom(ModifyOrderDto.class)) {
                throw new UnsupportedOperationException(ModifyOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            ModifyOrderDto modifyOrderDto = (ModifyOrderDto) bundle.get("stockOrder");
            if (modifyOrderDto != null) {
                return new c(modifyOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stockOrder\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stockOrder\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f33761a, ((c) obj).f33761a);
    }

    public final int hashCode() {
        return this.f33761a.hashCode();
    }

    public final String toString() {
        return "ModifyStockCoverOrderConfirmationFragmentArgs(stockOrder=" + this.f33761a + ")";
    }
}
