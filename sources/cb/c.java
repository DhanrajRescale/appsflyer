package cb;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8079a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8080b;

    public c(String phoneNumber, String secret) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.f8079a = phoneNumber;
        this.f8080b = secret;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.f8079a);
        bundle.putString("secret", this.f8080b);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_pin_login_fragment_to_forgot_pin_otp_fragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f8079a, cVar.f8079a) && Intrinsics.a(this.f8080b, cVar.f8080b);
    }

    public final int hashCode() {
        return this.f8080b.hashCode() + (this.f8079a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionPinLoginFragmentToForgotPinOtpFragment(phoneNumber=");
        sb2.append(this.f8079a);
        sb2.append(", secret=");
        return nn.d.o(sb2, this.f8080b, ")");
    }
}
