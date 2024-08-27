package eb;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15333b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15334c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15335d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15336e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15337f;

    public n(String phoneNumber, String invitationCode, String pin, String sessionId, String otp, boolean z10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f15332a = phoneNumber;
        this.f15333b = invitationCode;
        this.f15334c = pin;
        this.f15335d = sessionId;
        this.f15336e = otp;
        this.f15337f = z10;
    }

    @NotNull
    public static final n fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", n.class, "phoneNumber")) {
            String string = bundle.getString("phoneNumber");
            if (string != null) {
                if (bundle.containsKey("invitationCode")) {
                    String string2 = bundle.getString("invitationCode");
                    if (string2 != null) {
                        if (bundle.containsKey("pin")) {
                            String string3 = bundle.getString("pin");
                            if (string3 != null) {
                                if (bundle.containsKey("sessionId")) {
                                    String string4 = bundle.getString("sessionId");
                                    if (string4 != null) {
                                        if (bundle.containsKey("otp")) {
                                            String string5 = bundle.getString("otp");
                                            if (string5 != null) {
                                                if (bundle.containsKey("whatsappConsent")) {
                                                    return new n(string, string2, string3, string4, string5, bundle.getBoolean("whatsappConsent"));
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
                            throw new IllegalArgumentException("Argument \"pin\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"pin\" is missing and does not have an android:defaultValue");
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
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.a(this.f15332a, nVar.f15332a) && Intrinsics.a(this.f15333b, nVar.f15333b) && Intrinsics.a(this.f15334c, nVar.f15334c) && Intrinsics.a(this.f15335d, nVar.f15335d) && Intrinsics.a(this.f15336e, nVar.f15336e) && this.f15337f == nVar.f15337f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15337f) + jr.h.g(this.f15336e, jr.h.g(this.f15335d, jr.h.g(this.f15334c, jr.h.g(this.f15333b, this.f15332a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NameRegisterFragmentArgs(phoneNumber=");
        sb2.append(this.f15332a);
        sb2.append(", invitationCode=");
        sb2.append(this.f15333b);
        sb2.append(", pin=");
        sb2.append(this.f15334c);
        sb2.append(", sessionId=");
        sb2.append(this.f15335d);
        sb2.append(", otp=");
        sb2.append(this.f15336e);
        sb2.append(", whatsappConsent=");
        return da.e.o(sb2, this.f15337f, ")");
    }
}
