package ri;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d0;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ModifyOrderDto f33763a;

    public e(ModifyOrderDto stockOrder) {
        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
        this.f33763a = stockOrder;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ModifyOrderDto.class);
        Parcelable parcelable = this.f33763a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("stockOrder", parcelable);
        } else if (Serializable.class.isAssignableFrom(ModifyOrderDto.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("stockOrder", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(ModifyOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.transactionPending;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f33763a, ((e) obj).f33763a);
    }

    public final int hashCode() {
        return this.f33763a.hashCode();
    }

    public final String toString() {
        return "TransactionPending(stockOrder=" + this.f33763a + ")";
    }
}
