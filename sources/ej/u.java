package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15548a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15549b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15550c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15551d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15552e;

    public u(String packageId, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter("CASH", "pgRoute");
        this.f15548a = packageId;
        this.f15549b = "CASH";
        this.f15550c = null;
        this.f15551d = z10;
        this.f15552e = str;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.f15548a);
        bundle.putString("pgRoute", this.f15549b);
        bundle.putString("transactionId", this.f15550c);
        bundle.putBoolean("mandateCreated", this.f15551d);
        bundle.putString("mandateMessage", this.f15552e);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.actionDowngradePromptToMyPurchaseStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.a(this.f15548a, uVar.f15548a) && Intrinsics.a(this.f15549b, uVar.f15549b) && Intrinsics.a(this.f15550c, uVar.f15550c) && this.f15551d == uVar.f15551d && Intrinsics.a(this.f15552e, uVar.f15552e);
    }

    public final int hashCode() {
        int hashCode;
        int g10 = jr.h.g(this.f15549b, this.f15548a.hashCode() * 31, 31);
        int i10 = 0;
        String str = this.f15550c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = v.e.d(this.f15551d, (g10 + hashCode) * 31, 31);
        String str2 = this.f15552e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionDowngradePromptToMyPurchaseStatus(packageId=");
        sb2.append(this.f15548a);
        sb2.append(", pgRoute=");
        sb2.append(this.f15549b);
        sb2.append(", transactionId=");
        sb2.append(this.f15550c);
        sb2.append(", mandateCreated=");
        sb2.append(this.f15551d);
        sb2.append(", mandateMessage=");
        return nn.d.o(sb2, this.f15552e, ")");
    }
}
