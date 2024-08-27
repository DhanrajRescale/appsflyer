package ej;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g0 implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15476a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15477b;

    public g0(String packageId, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f15476a = packageId;
        this.f15477b = z10;
    }

    @NotNull
    public static final g0 fromBundle(@NotNull Bundle bundle) {
        boolean z10;
        if (da.e.y(bundle, "bundle", g0.class, "packageId")) {
            String string = bundle.getString("packageId");
            if (string != null) {
                if (bundle.containsKey("setupMandate")) {
                    z10 = bundle.getBoolean("setupMandate");
                } else {
                    z10 = false;
                }
                return new g0(string, z10);
            }
            throw new IllegalArgumentException("Argument \"packageId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"packageId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.a(this.f15476a, g0Var.f15476a) && this.f15477b == g0Var.f15477b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15477b) + (this.f15476a.hashCode() * 31);
    }

    public final String toString() {
        return "SubscriptionPlanConfirmationFragmentArgs(packageId=" + this.f15476a + ", setupMandate=" + this.f15477b + ")";
    }
}
