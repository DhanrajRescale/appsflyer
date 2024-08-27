package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15480a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15481b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15482c;

    public h0(String str, String pgRoute, String packageId) {
        Intrinsics.checkNotNullParameter(str, "case");
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f15480a = str;
        this.f15481b = pgRoute;
        this.f15482c = packageId;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("case", this.f15480a);
        bundle.putString("pgRoute", this.f15481b);
        bundle.putString("packageId", this.f15482c);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.actionSubscriptionPlanConfirmationToSubscriptionPaymentNonSuccess;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.a(this.f15480a, h0Var.f15480a) && Intrinsics.a(this.f15481b, h0Var.f15481b) && Intrinsics.a(this.f15482c, h0Var.f15482c);
    }

    public final int hashCode() {
        return this.f15482c.hashCode() + jr.h.g(this.f15481b, this.f15480a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionSubscriptionPlanConfirmationToSubscriptionPaymentNonSuccess(case=");
        sb2.append(this.f15480a);
        sb2.append(", pgRoute=");
        sb2.append(this.f15481b);
        sb2.append(", packageId=");
        return nn.d.o(sb2, this.f15482c, ")");
    }
}
