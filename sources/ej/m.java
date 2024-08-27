package ej;

import android.os.Bundle;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements androidx.navigation.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15502b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15503c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15504d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15505e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15506f;

    public m(String packageId, int i10, String currentPlan, String targetPlan, String targetPlanPrice, String currentPlanValidity) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(targetPlan, "targetPlan");
        Intrinsics.checkNotNullParameter(targetPlanPrice, "targetPlanPrice");
        Intrinsics.checkNotNullParameter(currentPlanValidity, "currentPlanValidity");
        this.f15501a = packageId;
        this.f15502b = i10;
        this.f15503c = currentPlan;
        this.f15504d = targetPlan;
        this.f15505e = targetPlanPrice;
        this.f15506f = currentPlanValidity;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.f15501a);
        bundle.putInt("packageLevel", this.f15502b);
        bundle.putString("currentPlan", this.f15503c);
        bundle.putString("targetPlan", this.f15504d);
        bundle.putString("targetPlanPrice", this.f15505e);
        bundle.putString("currentPlanValidity", this.f15506f);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.otherPlansToDowngradePromp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.a(this.f15501a, mVar.f15501a) && this.f15502b == mVar.f15502b && Intrinsics.a(this.f15503c, mVar.f15503c) && Intrinsics.a(this.f15504d, mVar.f15504d) && Intrinsics.a(this.f15505e, mVar.f15505e) && Intrinsics.a(this.f15506f, mVar.f15506f);
    }

    public final int hashCode() {
        return this.f15506f.hashCode() + jr.h.g(this.f15505e, jr.h.g(this.f15504d, jr.h.g(this.f15503c, da.e.f(this.f15502b, this.f15501a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OtherPlansToDowngradePromp(packageId=");
        sb2.append(this.f15501a);
        sb2.append(", packageLevel=");
        sb2.append(this.f15502b);
        sb2.append(", currentPlan=");
        sb2.append(this.f15503c);
        sb2.append(", targetPlan=");
        sb2.append(this.f15504d);
        sb2.append(", targetPlanPrice=");
        sb2.append(this.f15505e);
        sb2.append(", currentPlanValidity=");
        return nn.d.o(sb2, this.f15506f, ")");
    }
}
