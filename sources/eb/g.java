package eb;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15310a;

    public g(String str) {
        this.f15310a = str;
    }

    @NotNull
    public static final g fromBundle(@NotNull Bundle bundle) {
        String str;
        if (da.e.y(bundle, "bundle", g.class, "phoneNumber")) {
            str = bundle.getString("phoneNumber");
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new g(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.a(this.f15310a, ((g) obj).f15310a);
    }

    public final int hashCode() {
        String str = this.f15310a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("MobileRegisterFragmentArgs(phoneNumber="), this.f15310a, ")");
    }
}
