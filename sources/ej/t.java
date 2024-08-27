package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15545a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15546b;

    public t(String packageId, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f15545a = packageId;
        this.f15546b = z10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.f15545a);
        bundle.putBoolean("setupMandate", this.f15546b);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.actionDowngradePromptToConfirmation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.a(this.f15545a, tVar.f15545a) && this.f15546b == tVar.f15546b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15546b) + (this.f15545a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionDowngradePromptToConfirmation(packageId=" + this.f15545a + ", setupMandate=" + this.f15546b + ")";
    }
}
