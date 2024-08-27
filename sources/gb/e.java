package gb;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("group_id")
    @NotNull
    private final String f17211a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("image_url")
    @NotNull
    private final String f17212b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String f17213c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17214d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17215e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17216f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17217g;

    public e(String groupId, String imageUrl, String name, String str, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17211a = groupId;
        this.f17212b = imageUrl;
        this.f17213c = name;
        this.f17214d = str;
        this.f17215e = z10;
        this.f17216f = z11;
        this.f17217g = z12;
    }

    public static e a(e eVar, boolean z10, boolean z11) {
        String groupId = eVar.f17211a;
        String imageUrl = eVar.f17212b;
        String name = eVar.f17213c;
        String str = eVar.f17214d;
        boolean z12 = eVar.f17215e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        return new e(groupId, imageUrl, name, str, z12, z10, z11);
    }

    public final String b() {
        return this.f17211a;
    }

    public final String c() {
        return this.f17212b;
    }

    public final String d() {
        return this.f17213c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f17211a, eVar.f17211a) && Intrinsics.a(this.f17212b, eVar.f17212b) && Intrinsics.a(this.f17213c, eVar.f17213c) && Intrinsics.a(this.f17214d, eVar.f17214d) && this.f17215e == eVar.f17215e && this.f17216f == eVar.f17216f && this.f17217g == eVar.f17217g;
    }

    public final int hashCode() {
        int hashCode;
        int g10 = h.g(this.f17213c, h.g(this.f17212b, this.f17211a.hashCode() * 31, 31), 31);
        String str = this.f17214d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.f17217g) + v.e.d(this.f17216f, v.e.d(this.f17215e, (g10 + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f17211a;
        String str2 = this.f17212b;
        String str3 = this.f17213c;
        StringBuilder l10 = v.e.l("SocialStoryGroup(groupId=", str, ", imageUrl=", str2, ", name=");
        l10.append(str3);
        l10.append(", postId=");
        l10.append(this.f17214d);
        l10.append(", hasJoinedGroup=");
        l10.append(this.f17215e);
        l10.append(", isFirst=");
        l10.append(this.f17216f);
        l10.append(", isLast=");
        return da.e.o(l10, this.f17217g, ")");
    }
}
