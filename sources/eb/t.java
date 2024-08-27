package eb;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15358b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15359c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15360d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15361e;

    public t(String phoneNumber, String invitationCode, String sessionId, String otp, boolean z10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f15357a = phoneNumber;
        this.f15358b = invitationCode;
        this.f15359c = sessionId;
        this.f15360d = otp;
        this.f15361e = z10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.f15357a);
        bundle.putString("invitationCode", this.f15358b);
        bundle.putString("sessionId", this.f15359c);
        bundle.putString("otp", this.f15360d);
        bundle.putBoolean("whatsappConsent", this.f15361e);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_OTPVerificationFragment_to_setPinFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.a(this.f15357a, tVar.f15357a) && Intrinsics.a(this.f15358b, tVar.f15358b) && Intrinsics.a(this.f15359c, tVar.f15359c) && Intrinsics.a(this.f15360d, tVar.f15360d) && this.f15361e == tVar.f15361e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15361e) + jr.h.g(this.f15360d, jr.h.g(this.f15359c, jr.h.g(this.f15358b, this.f15357a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionOTPVerificationFragmentToSetPinFragment(phoneNumber=");
        sb2.append(this.f15357a);
        sb2.append(", invitationCode=");
        sb2.append(this.f15358b);
        sb2.append(", sessionId=");
        sb2.append(this.f15359c);
        sb2.append(", otp=");
        sb2.append(this.f15360d);
        sb2.append(", whatsappConsent=");
        return da.e.o(sb2, this.f15361e, ")");
    }
}
