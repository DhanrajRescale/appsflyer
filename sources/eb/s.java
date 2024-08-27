package eb;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15353a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15354b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15355c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15356d;

    public s(String phoneNumber, String invitationCode, String secret, boolean z10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.f15353a = phoneNumber;
        this.f15354b = invitationCode;
        this.f15355c = secret;
        this.f15356d = z10;
    }

    @NotNull
    public static final s fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", s.class, "phoneNumber")) {
            String string = bundle.getString("phoneNumber");
            if (string != null) {
                if (bundle.containsKey("invitationCode")) {
                    String string2 = bundle.getString("invitationCode");
                    if (string2 != null) {
                        if (bundle.containsKey("secret")) {
                            String string3 = bundle.getString("secret");
                            if (string3 != null) {
                                if (bundle.containsKey("whatsappConsent")) {
                                    return new s(string, string2, string3, bundle.getBoolean("whatsappConsent"));
                                }
                                throw new IllegalArgumentException("Required argument \"whatsappConsent\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"secret\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"secret\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"invitationCode\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"invitationCode\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f15353a, sVar.f15353a) && Intrinsics.a(this.f15354b, sVar.f15354b) && Intrinsics.a(this.f15355c, sVar.f15355c) && this.f15356d == sVar.f15356d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15356d) + jr.h.g(this.f15355c, jr.h.g(this.f15354b, this.f15353a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegistrationOtpVerificationFragmentArgs(phoneNumber=");
        sb2.append(this.f15353a);
        sb2.append(", invitationCode=");
        sb2.append(this.f15354b);
        sb2.append(", secret=");
        sb2.append(this.f15355c);
        sb2.append(", whatsappConsent=");
        return da.e.o(sb2, this.f15356d, ")");
    }
}
