package cb;

import android.os.Bundle;
import androidx.navigation.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f8078a;

    public b(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f8078a = phoneNumber;
    }

    @NotNull
    public static final b fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", b.class, "phoneNumber")) {
            String string = bundle.getString("phoneNumber");
            if (string != null) {
                return new b(string);
            }
            throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.a(this.f8078a, ((b) obj).f8078a);
    }

    public final int hashCode() {
        return this.f8078a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("PinLoginFragmentArgs(phoneNumber="), this.f8078a, ")");
    }
}
