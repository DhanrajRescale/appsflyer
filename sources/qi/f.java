package qi;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.h;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ModifyOrderDto f31978a;

    public f(ModifyOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f31978a = stockOrder;
    }

    @NotNull
    public static final f fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", f.class, "stockOrder")) {
            if (!Parcelable.class.isAssignableFrom(ModifyOrderDto.class) && !Serializable.class.isAssignableFrom(ModifyOrderDto.class)) {
                throw new UnsupportedOperationException(ModifyOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            ModifyOrderDto modifyOrderDto = (ModifyOrderDto) bundle.get("stockOrder");
            if (modifyOrderDto != null) {
                return new f(modifyOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stockOrder\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stockOrder\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.a(this.f31978a, ((f) obj).f31978a);
    }

    public final int hashCode() {
        return this.f31978a.hashCode();
    }

    public final String toString() {
        return "ModifyTransactionPendingFragmentArgs(stockOrder=" + this.f31978a + ")";
    }
}
