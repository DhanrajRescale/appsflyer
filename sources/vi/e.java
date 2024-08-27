package vi;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d0;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final StockOrderDto f38093a;

    public e(StockOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f38093a = stockOrder;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(StockOrderDto.class);
        Parcelable parcelable = this.f38093a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("stockOrder", parcelable);
        } else if (Serializable.class.isAssignableFrom(StockOrderDto.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("stockOrder", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(StockOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.reviewOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f38093a, ((e) obj).f38093a);
    }

    public final int hashCode() {
        return this.f38093a.hashCode();
    }

    public final String toString() {
        return "ReviewOrder(stockOrder=" + this.f38093a + ")";
    }
}
