package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15460a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15461b;

    public d(String packageId, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f15460a = packageId;
        this.f15461b = z10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.f15460a);
        bundle.putBoolean("setupMandate", this.f15461b);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.actionMySubscriptionToSubscriptionPlanConfirmation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f15460a, dVar.f15460a) && this.f15461b == dVar.f15461b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15461b) + (this.f15460a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionMySubscriptionToSubscriptionPlanConfirmation(packageId=" + this.f15460a + ", setupMandate=" + this.f15461b + ")";
    }
}
