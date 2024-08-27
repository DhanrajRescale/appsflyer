package ie;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f19949a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19950b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19951c;

    public t(String groupId, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f19949a = groupId;
        this.f19950b = i10;
        this.f19951c = z10;
    }

    @NotNull
    public static final t fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", t.class, "groupId")) {
            String string = bundle.getString("groupId");
            if (string != null) {
                if (bundle.containsKey("activeTab")) {
                    int i10 = bundle.getInt("activeTab");
                    if (bundle.containsKey("callFromChat")) {
                        return new t(string, i10, bundle.getBoolean("callFromChat"));
                    }
                    throw new IllegalArgumentException("Required argument \"callFromChat\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"activeTab\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"groupId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.a(this.f19949a, tVar.f19949a) && this.f19950b == tVar.f19950b && this.f19951c == tVar.f19951c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19951c) + da.e.f(this.f19950b, this.f19949a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupFeedAndChatHostFragmentArgs(groupId=");
        sb2.append(this.f19949a);
        sb2.append(", activeTab=");
        sb2.append(this.f19950b);
        sb2.append(", callFromChat=");
        return da.e.o(sb2, this.f19951c, ")");
    }
}
