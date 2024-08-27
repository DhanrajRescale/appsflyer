package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15486b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15487c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15488d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15489e;

    public i0(String packageId, String pgRoute, String str, String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        this.f15485a = packageId;
        this.f15486b = pgRoute;
        this.f15487c = str;
        this.f15488d = z10;
        this.f15489e = str2;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.f15485a);
        bundle.putString("pgRoute", this.f15486b);
        bundle.putString("transactionId", this.f15487c);
        bundle.putBoolean("mandateCreated", this.f15488d);
        bundle.putString("mandateMessage", this.f15489e);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.goToSubscriptionPurchaseStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.a(this.f15485a, i0Var.f15485a) && Intrinsics.a(this.f15486b, i0Var.f15486b) && Intrinsics.a(this.f15487c, i0Var.f15487c) && this.f15488d == i0Var.f15488d && Intrinsics.a(this.f15489e, i0Var.f15489e);
    }

    public final int hashCode() {
        int hashCode;
        int g10 = jr.h.g(this.f15486b, this.f15485a.hashCode() * 31, 31);
        int i10 = 0;
        String str = this.f15487c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = v.e.d(this.f15488d, (g10 + hashCode) * 31, 31);
        String str2 = this.f15489e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GoToSubscriptionPurchaseStatus(packageId=");
        sb2.append(this.f15485a);
        sb2.append(", pgRoute=");
        sb2.append(this.f15486b);
        sb2.append(", transactionId=");
        sb2.append(this.f15487c);
        sb2.append(", mandateCreated=");
        sb2.append(this.f15488d);
        sb2.append(", mandateMessage=");
        return nn.d.o(sb2, this.f15489e, ")");
    }
}
