package bb;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f6913a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6914b;

    public e(String phoneNumber, String secret) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(secret, "secret");
        this.f6913a = phoneNumber;
        this.f6914b = secret;
    }

    @NotNull
    public static final e fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", e.class, "phoneNumber")) {
            String string = bundle.getString("phoneNumber");
            if (string != null) {
                if (bundle.containsKey("secret")) {
                    String string2 = bundle.getString("secret");
                    if (string2 != null) {
                        return new e(string, string2);
                    }
                    throw new IllegalArgumentException("Argument \"secret\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"secret\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f6913a, eVar.f6913a) && Intrinsics.a(this.f6914b, eVar.f6914b);
    }

    public final int hashCode() {
        return this.f6914b.hashCode() + (this.f6913a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForgotPinOtpFragmentArgs(phoneNumber=");
        sb2.append(this.f6913a);
        sb2.append(", secret=");
        return nn.d.o(sb2, this.f6914b, ")");
    }
}
