package fb;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import da.e;
import jr.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15998b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15999c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16000d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16002f;

    public c(String phoneNumber, String invitationCode, String pin, String sessionId, String otp, boolean z10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f15997a = phoneNumber;
        this.f15998b = invitationCode;
        this.f15999c = pin;
        this.f16000d = sessionId;
        this.f16001e = otp;
        this.f16002f = z10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.f15997a);
        bundle.putString("invitationCode", this.f15998b);
        bundle.putString("pin", this.f15999c);
        bundle.putString("sessionId", this.f16000d);
        bundle.putString("otp", this.f16001e);
        bundle.putBoolean("whatsappConsent", this.f16002f);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_setPinFragment_to_nameRegisterFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f15997a, cVar.f15997a) && Intrinsics.a(this.f15998b, cVar.f15998b) && Intrinsics.a(this.f15999c, cVar.f15999c) && Intrinsics.a(this.f16000d, cVar.f16000d) && Intrinsics.a(this.f16001e, cVar.f16001e) && this.f16002f == cVar.f16002f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16002f) + h.g(this.f16001e, h.g(this.f16000d, h.g(this.f15999c, h.g(this.f15998b, this.f15997a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionSetPinFragmentToNameRegisterFragment(phoneNumber=");
        sb2.append(this.f15997a);
        sb2.append(", invitationCode=");
        sb2.append(this.f15998b);
        sb2.append(", pin=");
        sb2.append(this.f15999c);
        sb2.append(", sessionId=");
        sb2.append(this.f16000d);
        sb2.append(", otp=");
        sb2.append(this.f16001e);
        sb2.append(", whatsappConsent=");
        return e.o(sb2, this.f16002f, ")");
    }
}
