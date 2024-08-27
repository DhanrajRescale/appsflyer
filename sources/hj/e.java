package hj;

import android.os.Bundle;
import androidx.navigation.h;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f18499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18500b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18501c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18502d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18503e;

    public e(String packageId, String pgRoute, String str, String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(pgRoute, "pgRoute");
        this.f18499a = packageId;
        this.f18500b = pgRoute;
        this.f18501c = str;
        this.f18502d = z10;
        this.f18503e = str2;
    }

    @NotNull
    public static final e fromBundle(@NotNull Bundle bundle) {
        boolean z10;
        String str;
        if (da.e.y(bundle, "bundle", e.class, "packageId")) {
            String string = bundle.getString("packageId");
            if (string != null) {
                if (bundle.containsKey("pgRoute")) {
                    String string2 = bundle.getString("pgRoute");
                    if (string2 != null) {
                        if (bundle.containsKey("transactionId")) {
                            String string3 = bundle.getString("transactionId");
                            if (bundle.containsKey("mandateCreated")) {
                                z10 = bundle.getBoolean("mandateCreated");
                            } else {
                                z10 = false;
                            }
                            boolean z11 = z10;
                            if (bundle.containsKey("mandateMessage")) {
                                str = bundle.getString("mandateMessage");
                            } else {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            return new e(string, string2, string3, str, z11);
                        }
                        throw new IllegalArgumentException("Required argument \"transactionId\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"pgRoute\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"pgRoute\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"packageId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"packageId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f18499a, eVar.f18499a) && Intrinsics.a(this.f18500b, eVar.f18500b) && Intrinsics.a(this.f18501c, eVar.f18501c) && this.f18502d == eVar.f18502d && Intrinsics.a(this.f18503e, eVar.f18503e);
    }

    public final int hashCode() {
        int hashCode;
        int g10 = jr.h.g(this.f18500b, this.f18499a.hashCode() * 31, 31);
        int i10 = 0;
        String str = this.f18501c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = v.e.d(this.f18502d, (g10 + hashCode) * 31, 31);
        String str2 = this.f18503e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriptionPurchaseStatusFragmentArgs(packageId=");
        sb2.append(this.f18499a);
        sb2.append(", pgRoute=");
        sb2.append(this.f18500b);
        sb2.append(", transactionId=");
        sb2.append(this.f18501c);
        sb2.append(", mandateCreated=");
        sb2.append(this.f18502d);
        sb2.append(", mandateMessage=");
        return nn.d.o(sb2, this.f18503e, ")");
    }
}
