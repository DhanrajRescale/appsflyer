package ej;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.remote.response.SubscriptionFeatureFlag;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final SubscriptionFeatureFlag f15563a;

    public z(SubscriptionFeatureFlag subscriptionFeatureFlag) {
        this.f15563a = subscriptionFeatureFlag;
    }

    @NotNull
    public static final z fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", z.class, "maintenanceData")) {
            if (!Parcelable.class.isAssignableFrom(SubscriptionFeatureFlag.class) && !Serializable.class.isAssignableFrom(SubscriptionFeatureFlag.class)) {
                throw new UnsupportedOperationException(SubscriptionFeatureFlag.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            return new z((SubscriptionFeatureFlag) bundle.get("maintenanceData"));
        }
        throw new IllegalArgumentException("Required argument \"maintenanceData\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.a(this.f15563a, ((z) obj).f15563a);
    }

    public final int hashCode() {
        SubscriptionFeatureFlag subscriptionFeatureFlag = this.f15563a;
        if (subscriptionFeatureFlag == null) {
            return 0;
        }
        return subscriptionFeatureFlag.hashCode();
    }

    public final String toString() {
        return "SubscriptionMaintenanceFragmentArgs(maintenanceData=" + this.f15563a + ")";
    }
}
