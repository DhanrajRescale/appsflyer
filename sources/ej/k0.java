package ej;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15496b;

    public k0(String status, String pgRoute) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        this.f15495a = status;
        this.f15496b = pgRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.a(this.f15495a, k0Var.f15495a) && Intrinsics.a(this.f15496b, k0Var.f15496b);
    }

    public final int hashCode() {
        return this.f15496b.hashCode() + (this.f15495a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlanPurchaseStatusData(status=");
        sb2.append(this.f15495a);
        sb2.append(", pgRoute=");
        return nn.d.o(sb2, this.f15496b, ")");
    }
}
