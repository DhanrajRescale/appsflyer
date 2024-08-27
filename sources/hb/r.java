package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new e(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f18214a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18215b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18216c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18217d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18218e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18219f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18220g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18221h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18222i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f18223j;

    public r(String title, boolean z10, boolean z11, String str, String groupId, String userId, boolean z12, String creatorName, String str2, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(creatorName, "creatorName");
        this.f18214a = title;
        this.f18215b = z10;
        this.f18216c = z11;
        this.f18217d = str;
        this.f18218e = groupId;
        this.f18219f = userId;
        this.f18220g = z12;
        this.f18221h = creatorName;
        this.f18222i = str2;
        this.f18223j = z13;
    }

    public static r a(r rVar, boolean z10) {
        String title = rVar.f18214a;
        boolean z11 = rVar.f18215b;
        boolean z12 = rVar.f18216c;
        String str = rVar.f18217d;
        String groupId = rVar.f18218e;
        String userId = rVar.f18219f;
        String creatorName = rVar.f18221h;
        String str2 = rVar.f18222i;
        boolean z13 = rVar.f18223j;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(creatorName, "creatorName");
        return new r(title, z11, z12, str, groupId, userId, z10, creatorName, str2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.a(this.f18214a, rVar.f18214a) && this.f18215b == rVar.f18215b && this.f18216c == rVar.f18216c && Intrinsics.a(this.f18217d, rVar.f18217d) && Intrinsics.a(this.f18218e, rVar.f18218e) && Intrinsics.a(this.f18219f, rVar.f18219f) && this.f18220g == rVar.f18220g && Intrinsics.a(this.f18221h, rVar.f18221h) && Intrinsics.a(this.f18222i, rVar.f18222i) && this.f18223j == rVar.f18223j;
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f18216c, v.e.d(this.f18215b, this.f18214a.hashCode() * 31, 31), 31);
        int i10 = 0;
        String str = this.f18217d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = jr.h.g(this.f18221h, v.e.d(this.f18220g, jr.h.g(this.f18219f, jr.h.g(this.f18218e, (d10 + hashCode) * 31, 31), 31), 31), 31);
        String str2 = this.f18222i;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return Boolean.hashCode(this.f18223j) + ((g10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header(title=");
        sb2.append(this.f18214a);
        sb2.append(", isSebiRegistered=");
        sb2.append(this.f18215b);
        sb2.append(", isRiaRra=");
        sb2.append(this.f18216c);
        sb2.append(", displayImage=");
        sb2.append(this.f18217d);
        sb2.append(", groupId=");
        sb2.append(this.f18218e);
        sb2.append(", userId=");
        sb2.append(this.f18219f);
        sb2.append(", isFollowed=");
        sb2.append(this.f18220g);
        sb2.append(", creatorName=");
        sb2.append(this.f18221h);
        sb2.append(", groupName=");
        sb2.append(this.f18222i);
        sb2.append(", isCalledFromChat=");
        return da.e.o(sb2, this.f18223j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18214a);
        out.writeInt(this.f18215b ? 1 : 0);
        out.writeInt(this.f18216c ? 1 : 0);
        out.writeString(this.f18217d);
        out.writeString(this.f18218e);
        out.writeString(this.f18219f);
        out.writeInt(this.f18220g ? 1 : 0);
        out.writeString(this.f18221h);
        out.writeString(this.f18222i);
        out.writeInt(this.f18223j ? 1 : 0);
    }
}
