package hb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new k6.d(25);

    /* renamed from: a, reason: collision with root package name */
    public final z f18191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18192b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18193c;

    /* renamed from: d, reason: collision with root package name */
    public final i f18194d;

    /* renamed from: e, reason: collision with root package name */
    public final List f18195e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18196f;

    public j(z templateType, String str, String str2, i iVar, List list, List list2) {
        Intrinsics.checkNotNullParameter(templateType, "templateType");
        this.f18191a = templateType;
        this.f18192b = str;
        this.f18193c = str2;
        this.f18194d = iVar;
        this.f18195e = list;
        this.f18196f = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f18191a == jVar.f18191a && Intrinsics.a(this.f18192b, jVar.f18192b) && Intrinsics.a(this.f18193c, jVar.f18193c) && Intrinsics.a(this.f18194d, jVar.f18194d) && Intrinsics.a(this.f18195e, jVar.f18195e) && Intrinsics.a(this.f18196f, jVar.f18196f);
    }

    public final int hashCode() {
        int hashCode = this.f18191a.hashCode() * 31;
        String str = this.f18192b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18193c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i iVar = this.f18194d;
        int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List list = this.f18195e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f18196f;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "Body(templateType=" + this.f18191a + ", heading=" + this.f18192b + ", description=" + this.f18193c + ", tradeContent=" + this.f18194d + ", tags=" + this.f18195e + ", mentions=" + this.f18196f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18191a.name());
        out.writeString(this.f18192b);
        out.writeString(this.f18193c);
        i iVar = this.f18194d;
        if (iVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            iVar.writeToParcel(out, i10);
        }
        out.writeStringList(this.f18195e);
        out.writeStringList(this.f18196f);
    }
}
