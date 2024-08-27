package ej;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.remote.response.SubscriptionFeatureFlag;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final SubscriptionFeatureFlag f15494a;

    public k(SubscriptionFeatureFlag subscriptionFeatureFlag) {
        this.f15494a = subscriptionFeatureFlag;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(SubscriptionFeatureFlag.class);
        Parcelable parcelable = this.f15494a;
        if (isAssignableFrom) {
            bundle.putParcelable("maintenanceData", parcelable);
        } else if (Serializable.class.isAssignableFrom(SubscriptionFeatureFlag.class)) {
            bundle.putSerializable("maintenanceData", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(SubscriptionFeatureFlag.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.actionMoreSubscriptionPlansToSubscriptionMaintenance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.a(this.f15494a, ((k) obj).f15494a);
    }

    public final int hashCode() {
        SubscriptionFeatureFlag subscriptionFeatureFlag = this.f15494a;
        if (subscriptionFeatureFlag == null) {
            return 0;
        }
        return subscriptionFeatureFlag.hashCode();
    }

    public final String toString() {
        return "ActionMoreSubscriptionPlansToSubscriptionMaintenance(maintenanceData=" + this.f15494a + ")";
    }
}
