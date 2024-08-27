package ej;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15538b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15539c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15540d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15541e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15542f;

    public s(String packageId, int i10, String currentPlan, String targetPlan, String targetPlanPrice, String currentPlanValidity) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(targetPlan, "targetPlan");
        Intrinsics.checkNotNullParameter(targetPlanPrice, "targetPlanPrice");
        Intrinsics.checkNotNullParameter(currentPlanValidity, "currentPlanValidity");
        this.f15537a = packageId;
        this.f15538b = i10;
        this.f15539c = currentPlan;
        this.f15540d = targetPlan;
        this.f15541e = targetPlanPrice;
        this.f15542f = currentPlanValidity;
    }

    @NotNull
    public static final s fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", s.class, "packageId")) {
            String string = bundle.getString("packageId");
            if (string != null) {
                if (bundle.containsKey("packageLevel")) {
                    int i10 = bundle.getInt("packageLevel");
                    if (bundle.containsKey("currentPlan")) {
                        String string2 = bundle.getString("currentPlan");
                        if (string2 != null) {
                            if (bundle.containsKey("targetPlan")) {
                                String string3 = bundle.getString("targetPlan");
                                if (string3 != null) {
                                    if (bundle.containsKey("targetPlanPrice")) {
                                        String string4 = bundle.getString("targetPlanPrice");
                                        if (string4 != null) {
                                            if (bundle.containsKey("currentPlanValidity")) {
                                                String string5 = bundle.getString("currentPlanValidity");
                                                if (string5 != null) {
                                                    return new s(string, i10, string2, string3, string4, string5);
                                                }
                                                throw new IllegalArgumentException("Argument \"currentPlanValidity\" is marked as non-null but was passed a null value.");
                                            }
                                            throw new IllegalArgumentException("Required argument \"currentPlanValidity\" is missing and does not have an android:defaultValue");
                                        }
                                        throw new IllegalArgumentException("Argument \"targetPlanPrice\" is marked as non-null but was passed a null value.");
                                    }
                                    throw new IllegalArgumentException("Required argument \"targetPlanPrice\" is missing and does not have an android:defaultValue");
                                }
                                throw new IllegalArgumentException("Argument \"targetPlan\" is marked as non-null but was passed a null value.");
                            }
                            throw new IllegalArgumentException("Required argument \"targetPlan\" is missing and does not have an android:defaultValue");
                        }
                        throw new IllegalArgumentException("Argument \"currentPlan\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"currentPlan\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"packageLevel\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"packageId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"packageId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f15537a, sVar.f15537a) && this.f15538b == sVar.f15538b && Intrinsics.a(this.f15539c, sVar.f15539c) && Intrinsics.a(this.f15540d, sVar.f15540d) && Intrinsics.a(this.f15541e, sVar.f15541e) && Intrinsics.a(this.f15542f, sVar.f15542f);
    }

    public final int hashCode() {
        return this.f15542f.hashCode() + jr.h.g(this.f15541e, jr.h.g(this.f15540d, jr.h.g(this.f15539c, da.e.f(this.f15538b, this.f15537a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriptionDowngradePromptFragmentArgs(packageId=");
        sb2.append(this.f15537a);
        sb2.append(", packageLevel=");
        sb2.append(this.f15538b);
        sb2.append(", currentPlan=");
        sb2.append(this.f15539c);
        sb2.append(", targetPlan=");
        sb2.append(this.f15540d);
        sb2.append(", targetPlanPrice=");
        sb2.append(this.f15541e);
        sb2.append(", currentPlanValidity=");
        return nn.d.o(sb2, this.f15542f, ")");
    }
}
