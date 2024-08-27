package hj;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import jr.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18506c;

    public f(String str, String pgRoute, String packageId) {
        Intrinsics.checkNotNullParameter(str, "case");
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f18504a = str;
        this.f18505b = pgRoute;
        this.f18506c = packageId;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("case", this.f18504a);
        bundle.putString("pgRoute", this.f18505b);
        bundle.putString("packageId", this.f18506c);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.actionSubscriptionPurchaseStatusToSubscriptionPaymentNonSuccess;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f18504a, fVar.f18504a) && Intrinsics.a(this.f18505b, fVar.f18505b) && Intrinsics.a(this.f18506c, fVar.f18506c);
    }

    public final int hashCode() {
        return this.f18506c.hashCode() + h.g(this.f18505b, this.f18504a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionSubscriptionPurchaseStatusToSubscriptionPaymentNonSuccess(case=");
        sb2.append(this.f18504a);
        sb2.append(", pgRoute=");
        sb2.append(this.f18505b);
        sb2.append(", packageId=");
        return nn.d.o(sb2, this.f18506c, ")");
    }
}
