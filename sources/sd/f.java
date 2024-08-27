package sd;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f34586a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34588c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f34589d;

    public f(String groupId, int i10, String[] strArr, String groupName) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        this.f34586a = groupId;
        this.f34587b = groupName;
        this.f34588c = i10;
        this.f34589d = strArr;
    }

    @NotNull
    public static final f fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", f.class, "groupId")) {
            String string = bundle.getString("groupId");
            if (string != null) {
                if (bundle.containsKey("groupName")) {
                    String string2 = bundle.getString("groupName");
                    if (string2 != null) {
                        if (bundle.containsKey("groupNameCharLimit")) {
                            int i10 = bundle.getInt("groupNameCharLimit");
                            if (bundle.containsKey("groupTags")) {
                                return new f(string, i10, bundle.getStringArray("groupTags"), string2);
                            }
                            throw new IllegalArgumentException("Required argument \"groupTags\" is missing and does not have an android:defaultValue");
                        }
                        throw new IllegalArgumentException("Required argument \"groupNameCharLimit\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"groupName\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"groupName\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"groupId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f34586a, fVar.f34586a) && Intrinsics.a(this.f34587b, fVar.f34587b) && this.f34588c == fVar.f34588c && Intrinsics.a(this.f34589d, fVar.f34589d);
    }

    public final int hashCode() {
        int hashCode;
        int f10 = da.e.f(this.f34588c, jr.h.g(this.f34587b, this.f34586a.hashCode() * 31, 31), 31);
        String[] strArr = this.f34589d;
        if (strArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(strArr);
        }
        return f10 + hashCode;
    }

    public final String toString() {
        return "GroupNameEditFragmentArgs(groupId=" + this.f34586a + ", groupName=" + this.f34587b + ", groupNameCharLimit=" + this.f34588c + ", groupTags=" + Arrays.toString(this.f34589d) + ")";
    }
}
