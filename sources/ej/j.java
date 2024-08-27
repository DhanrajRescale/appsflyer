package ej;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final MySubscriptionResponse f15490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15491b;

    public j(MySubscriptionResponse subscriptionData, int i10) {
        Intrinsics.checkNotNullParameter(subscriptionData, "subscriptionData");
        this.f15490a = subscriptionData;
        this.f15491b = i10;
    }

    @NotNull
    public static final j fromBundle(@NotNull Bundle bundle) {
        int i10;
        if (da.e.y(bundle, "bundle", j.class, "selectedIndex")) {
            i10 = bundle.getInt("selectedIndex");
        } else {
            i10 = 0;
        }
        if (bundle.containsKey("subscriptionData")) {
            if (!Parcelable.class.isAssignableFrom(MySubscriptionResponse.class) && !Serializable.class.isAssignableFrom(MySubscriptionResponse.class)) {
                throw new UnsupportedOperationException(MySubscriptionResponse.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) bundle.get("subscriptionData");
            if (mySubscriptionResponse != null) {
                return new j(mySubscriptionResponse, i10);
            }
            throw new IllegalArgumentException("Argument \"subscriptionData\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"subscriptionData\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.a(this.f15490a, jVar.f15490a) && this.f15491b == jVar.f15491b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15491b) + (this.f15490a.hashCode() * 31);
    }

    public final String toString() {
        return "OtherSubscriptionPlansFragmentArgs(subscriptionData=" + this.f15490a + ", selectedIndex=" + this.f15491b + ")";
    }
}
