package fb;

import android.os.Bundle;
import androidx.navigation.h;
import da.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15993b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15994c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15995d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15996e;

    public b(String phoneNumber, String invitationCode, String sessionId, String otp, boolean z10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f15992a = phoneNumber;
        this.f15993b = invitationCode;
        this.f15994c = sessionId;
        this.f15995d = otp;
        this.f15996e = z10;
    }

    @NotNull
    public static final b fromBundle(@NotNull Bundle bundle) {
        if (e.y(bundle, "bundle", b.class, "phoneNumber")) {
            String string = bundle.getString("phoneNumber");
            if (string != null) {
                if (bundle.containsKey("invitationCode")) {
                    String string2 = bundle.getString("invitationCode");
                    if (string2 != null) {
                        if (bundle.containsKey("sessionId")) {
                            String string3 = bundle.getString("sessionId");
                            if (string3 != null) {
                                if (bundle.containsKey("otp")) {
                                    String string4 = bundle.getString("otp");
                                    if (string4 != null) {
                                        if (bundle.containsKey("whatsappConsent")) {
                                            return new b(string, string2, string3, string4, bundle.getBoolean("whatsappConsent"));
                                        }
                                        throw new IllegalArgumentException("Required argument \"whatsappConsent\" is missing and does not have an android:defaultValue");
                                    }
                                    throw new IllegalArgumentException("Argument \"otp\" is marked as non-null but was passed a null value.");
                                }
                                throw new IllegalArgumentException("Required argument \"otp\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"sessionId\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"sessionId\" is missing and does not have an android:defaultValue");
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f15992a, bVar.f15992a) && Intrinsics.a(this.f15993b, bVar.f15993b) && Intrinsics.a(this.f15994c, bVar.f15994c) && Intrinsics.a(this.f15995d, bVar.f15995d) && this.f15996e == bVar.f15996e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15996e) + jr.h.g(this.f15995d, jr.h.g(this.f15994c, jr.h.g(this.f15993b, this.f15992a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetPinFragmentArgs(phoneNumber=");
        sb2.append(this.f15992a);
        sb2.append(", invitationCode=");
        sb2.append(this.f15993b);
        sb2.append(", sessionId=");
        sb2.append(this.f15994c);
        sb2.append(", otp=");
        sb2.append(this.f15995d);
        sb2.append(", whatsappConsent=");
        return e.o(sb2, this.f15996e, ")");
    }
}
