package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15497a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15498b;

    public l(String packageId, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f15497a = packageId;
        this.f15498b = z10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.f15497a);
        bundle.putBoolean("setupMandate", this.f15498b);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.otherPlansToConfirmation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.f15497a, lVar.f15497a) && this.f15498b == lVar.f15498b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15498b) + (this.f15497a.hashCode() * 31);
    }

    public final String toString() {
        return "OtherPlansToConfirmation(packageId=" + this.f15497a + ", setupMandate=" + this.f15498b + ")";
    }
}
