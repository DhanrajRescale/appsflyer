package gc;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f17245a;

    public m(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f17245a = status;
    }

    @NotNull
    public static final m fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", m.class, "status")) {
            String string = bundle.getString("status");
            if (string != null) {
                return new m(string);
            }
            throw new IllegalArgumentException("Argument \"status\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"status\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.a(this.f17245a, ((m) obj).f17245a);
    }

    public final int hashCode() {
        return this.f17245a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("MissionStatusDetailFragmentArgs(status="), this.f17245a, ")");
    }
}
