package ej;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b0 implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15453a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15454b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15455c;

    public b0(String str, String pgRoute, String packageId) {
        Intrinsics.checkNotNullParameter(str, "case");
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f15453a = str;
        this.f15454b = pgRoute;
        this.f15455c = packageId;
    }

    @NotNull
    public static final b0 fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", b0.class, "case")) {
            String string = bundle.getString("case");
            if (string != null) {
                if (bundle.containsKey("pgRoute")) {
                    String string2 = bundle.getString("pgRoute");
                    if (string2 != null) {
                        if (bundle.containsKey("packageId")) {
                            String string3 = bundle.getString("packageId");
                            if (string3 != null) {
                                return new b0(string, string2, string3);
                            }
                            throw new IllegalArgumentException("Argument \"packageId\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"packageId\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"pgRoute\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"pgRoute\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"case\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"case\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.a(this.f15453a, b0Var.f15453a) && Intrinsics.a(this.f15454b, b0Var.f15454b) && Intrinsics.a(this.f15455c, b0Var.f15455c);
    }

    public final int hashCode() {
        return this.f15455c.hashCode() + jr.h.g(this.f15454b, this.f15453a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriptionPaymentNonSuccessFragmentArgs(case=");
        sb2.append(this.f15453a);
        sb2.append(", pgRoute=");
        sb2.append(this.f15454b);
        sb2.append(", packageId=");
        return nn.d.o(sb2, this.f15455c, ")");
    }
}
