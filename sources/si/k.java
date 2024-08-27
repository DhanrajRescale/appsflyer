package si;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d0;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ModifyOrderDto f34656a;

    public k(ModifyOrderDto stock) {
        Intrinsics.checkNotNullParameter(stock, "stock");
        this.f34656a = stock;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ModifyOrderDto.class);
        Parcelable parcelable = this.f34656a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("stock", parcelable);
        } else if (Serializable.class.isAssignableFrom(ModifyOrderDto.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("stock", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(ModifyOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.paymentSuccess;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.a(this.f34656a, ((k) obj).f34656a);
    }

    public final int hashCode() {
        return this.f34656a.hashCode();
    }

    public final String toString() {
        return "PaymentSuccess(stock=" + this.f34656a + ")";
    }
}
