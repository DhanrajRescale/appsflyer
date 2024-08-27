package fc;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16012a;

    public f(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f16012a = taskId;
    }

    @NotNull
    public static final f fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", f.class, "taskId")) {
            String string = bundle.getString("taskId");
            if (string != null) {
                return new f(string);
            }
            throw new IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"taskId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.a(this.f16012a, ((f) obj).f16012a);
    }

    public final int hashCode() {
        return this.f16012a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("MissionTaskDetailFragmentArgs(taskId="), this.f16012a, ")");
    }
}
