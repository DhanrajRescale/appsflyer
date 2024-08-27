package ej;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final MySubscriptionResponse f15465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15466b;

    public e(MySubscriptionResponse subscriptionData, int i10) {
        Intrinsics.checkNotNullParameter(subscriptionData, "subscriptionData");
        this.f15465a = subscriptionData;
        this.f15466b = i10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("selectedIndex", this.f15466b);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MySubscriptionResponse.class);
        Parcelable parcelable = this.f15465a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("subscriptionData", parcelable);
        } else if (Serializable.class.isAssignableFrom(MySubscriptionResponse.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("subscriptionData", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(MySubscriptionResponse.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.mySubscriptionToMorePlan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f15465a, eVar.f15465a) && this.f15466b == eVar.f15466b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15466b) + (this.f15465a.hashCode() * 31);
    }

    public final String toString() {
        return "MySubscriptionToMorePlan(subscriptionData=" + this.f15465a + ", selectedIndex=" + this.f15466b + ")";
    }
}
