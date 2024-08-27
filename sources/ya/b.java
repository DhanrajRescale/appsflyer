package ya;

import android.os.Bundle;
import androidx.navigation.h;
import da.e;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f41417a;

    public b(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f41417a = phoneNumber;
    }

    @NotNull
    public static final b fromBundle(@NotNull Bundle bundle) {
        if (e.y(bundle, "bundle", b.class, "phoneNumber")) {
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
        return (obj instanceof b) && Intrinsics.a(this.f41417a, ((b) obj).f41417a);
    }

    public final int hashCode() {
        return this.f41417a.hashCode();
    }

    public final String toString() {
        return d.o(new StringBuilder("UserBlockedFragmentArgs(phoneNumber="), this.f41417a, ")");
    }
}
