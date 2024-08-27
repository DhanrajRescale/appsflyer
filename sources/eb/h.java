package eb;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15312b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15313c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15314d;

    public h(String phoneNumber, String invitationCode, String secret, boolean z10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.f15311a = phoneNumber;
        this.f15312b = invitationCode;
        this.f15313c = secret;
        this.f15314d = z10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.f15311a);
        bundle.putString("invitationCode", this.f15312b);
        bundle.putString("secret", this.f15313c);
        bundle.putBoolean("whatsappConsent", this.f15314d);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.verifyOtp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.a(this.f15311a, hVar.f15311a) && Intrinsics.a(this.f15312b, hVar.f15312b) && Intrinsics.a(this.f15313c, hVar.f15313c) && this.f15314d == hVar.f15314d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15314d) + jr.h.g(this.f15313c, jr.h.g(this.f15312b, this.f15311a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerifyOtp(phoneNumber=");
        sb2.append(this.f15311a);
        sb2.append(", invitationCode=");
        sb2.append(this.f15312b);
        sb2.append(", secret=");
        sb2.append(this.f15313c);
        sb2.append(", whatsappConsent=");
        return da.e.o(sb2, this.f15314d, ")");
    }
}
