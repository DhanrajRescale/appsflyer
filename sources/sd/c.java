package sd;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f34579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34580b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34581c;

    public c(String groupId, String str, int i10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f34579a = groupId;
        this.f34580b = str;
        this.f34581c = i10;
    }

    @NotNull
    public static final c fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", c.class, "groupId")) {
            String string = bundle.getString("groupId");
            if (string != null) {
                if (bundle.containsKey("groupDescription")) {
                    String string2 = bundle.getString("groupDescription");
                    if (bundle.containsKey("groupDescriptionCharLimit")) {
                        return new c(string, string2, bundle.getInt("groupDescriptionCharLimit"));
                    }
                    throw new IllegalArgumentException("Required argument \"groupDescriptionCharLimit\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"groupDescription\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"groupId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f34579a, cVar.f34579a) && Intrinsics.a(this.f34580b, cVar.f34580b) && this.f34581c == cVar.f34581c;
    }

    public final int hashCode() {
        int hashCode = this.f34579a.hashCode() * 31;
        String str = this.f34580b;
        return Integer.hashCode(this.f34581c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupDescriptionEditFragmentArgs(groupId=");
        sb2.append(this.f34579a);
        sb2.append(", groupDescription=");
        sb2.append(this.f34580b);
        sb2.append(", groupDescriptionCharLimit=");
        return nn.d.m(sb2, this.f34581c, ")");
    }
}
