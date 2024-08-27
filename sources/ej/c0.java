package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15458a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15459b;

    public c0(String packageId, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f15458a = packageId;
        this.f15459b = z10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.f15458a);
        bundle.putBoolean("setupMandate", this.f15459b);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.actionSubscriptionPaymentNonSuccessToSubscriptionPlanConfirmation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.a(this.f15458a, c0Var.f15458a) && this.f15459b == c0Var.f15459b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15459b) + (this.f15458a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionSubscriptionPaymentNonSuccessToSubscriptionPlanConfirmation(packageId=" + this.f15458a + ", setupMandate=" + this.f15459b + ")";
    }
}
