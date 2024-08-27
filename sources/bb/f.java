package bb;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6915a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6916b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6917c;

    public f(String phoneNumber, String otp, String sessionId) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f6915a = phoneNumber;
        this.f6916b = otp;
        this.f6917c = sessionId;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.f6915a);
        bundle.putString("otp", this.f6916b);
        bundle.putString("sessionId", this.f6917c);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_forgot_pin_otp_fragment_to_re_set_pin_fragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f6915a, fVar.f6915a) && Intrinsics.a(this.f6916b, fVar.f6916b) && Intrinsics.a(this.f6917c, fVar.f6917c);
    }

    public final int hashCode() {
        return this.f6917c.hashCode() + jr.h.g(this.f6916b, this.f6915a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionForgotPinOtpFragmentToReSetPinFragment(phoneNumber=");
        sb2.append(this.f6915a);
        sb2.append(", otp=");
        sb2.append(this.f6916b);
        sb2.append(", sessionId=");
        return nn.d.o(sb2, this.f6917c, ")");
    }
}
