package ej;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.remote.response.SubscriptionFeatureFlag;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final SubscriptionFeatureFlag f15553a;

    public v(SubscriptionFeatureFlag subscriptionFeatureFlag) {
        this.f15553a = subscriptionFeatureFlag;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(SubscriptionFeatureFlag.class);
        Parcelable parcelable = this.f15553a;
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
        return R.id.actionSubscriptionDowngradePromptToSubscriptionMaintenance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.a(this.f15553a, ((v) obj).f15553a);
    }

    public final int hashCode() {
        SubscriptionFeatureFlag subscriptionFeatureFlag = this.f15553a;
        if (subscriptionFeatureFlag == null) {
            return 0;
        }
        return subscriptionFeatureFlag.hashCode();
    }

    public final String toString() {
        return "ActionSubscriptionDowngradePromptToSubscriptionMaintenance(maintenanceData=" + this.f15553a + ")";
    }
}
