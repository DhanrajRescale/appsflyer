package ab;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f301a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f303c;

    public l(boolean z10, boolean z11, String str) {
        this.f301a = z10;
        this.f302b = z11;
        this.f303c = str;
    }

    @NotNull
    public static final l fromBundle(@NotNull Bundle bundle) {
        boolean z10;
        String str;
        boolean z11 = false;
        if (da.e.y(bundle, "bundle", l.class, "isForcedLogout")) {
            z10 = bundle.getBoolean("isForcedLogout");
        } else {
            z10 = false;
        }
        if (bundle.containsKey("invalidSession")) {
            z11 = bundle.getBoolean("invalidSession");
        }
        if (bundle.containsKey("phoneNumber")) {
            str = bundle.getString("phoneNumber");
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new l(z10, z11, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f301a == lVar.f301a && this.f302b == lVar.f302b && Intrinsics.a(this.f303c, lVar.f303c);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f302b, Boolean.hashCode(this.f301a) * 31, 31);
        String str = this.f303c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return d10 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MobileLoginFragmentArgs(isForcedLogout=");
        sb2.append(this.f301a);
        sb2.append(", invalidSession=");
        sb2.append(this.f302b);
        sb2.append(", phoneNumber=");
        return nn.d.o(sb2, this.f303c, ")");
    }

    public /* synthetic */ l(boolean z10, boolean z11, String str, int i10) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str);
    }
}
