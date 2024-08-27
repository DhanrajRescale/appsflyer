package td;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b0 implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f35826a;

    public b0(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f35826a = groupId;
    }

    @NotNull
    public static final b0 fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", b0.class, "groupId")) {
            String string = bundle.getString("groupId");
            if (string != null) {
                return new b0(string);
            }
            throw new IllegalArgumentException("Argument \"groupId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.a(this.f35826a, ((b0) obj).f35826a);
    }

    public final int hashCode() {
        return this.f35826a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("GroupInfoV2FragmentArgs(groupId="), this.f35826a, ")");
    }
}
