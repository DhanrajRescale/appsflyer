package gc;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f17222a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17223b;

    public c(String str, String str2) {
        this.f17222a = str;
        this.f17223b = str2;
    }

    @NotNull
    public static final c fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", c.class, "earningsTitle")) {
            String string = bundle.getString("earningsTitle");
            if (bundle.containsKey("earningsAmount")) {
                return new c(string, bundle.getString("earningsAmount"));
            }
            throw new IllegalArgumentException("Required argument \"earningsAmount\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"earningsTitle\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f17222a, cVar.f17222a) && Intrinsics.a(this.f17223b, cVar.f17223b);
    }

    public final int hashCode() {
        String str = this.f17222a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17223b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MissionHistoryFragmentArgs(earningsTitle=");
        sb2.append(this.f17222a);
        sb2.append(", earningsAmount=");
        return nn.d.o(sb2, this.f17223b, ")");
    }
}
