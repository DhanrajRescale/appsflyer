package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new e(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f18197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18198b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18199c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18200d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18201e;

    /* renamed from: f, reason: collision with root package name */
    public final l f18202f;

    public k(String str, String type, String name, String source, String contentId, l lVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        this.f18197a = str;
        this.f18198b = type;
        this.f18199c = name;
        this.f18200d = source;
        this.f18201e = contentId;
        this.f18202f = lVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.a(this.f18197a, kVar.f18197a) && Intrinsics.a(this.f18198b, kVar.f18198b) && Intrinsics.a(this.f18199c, kVar.f18199c) && Intrinsics.a(this.f18200d, kVar.f18200d) && Intrinsics.a(this.f18201e, kVar.f18201e) && Intrinsics.a(this.f18202f, kVar.f18202f);
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.f18197a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = jr.h.g(this.f18201e, jr.h.g(this.f18200d, jr.h.g(this.f18199c, jr.h.g(this.f18198b, hashCode * 31, 31), 31), 31), 31);
        l lVar = this.f18202f;
        if (lVar != null) {
            i10 = lVar.f18203a.hashCode();
        }
        return g10 + i10;
    }

    public final String toString() {
        return "Media(url=" + this.f18197a + ", type=" + this.f18198b + ", name=" + this.f18199c + ", source=" + this.f18200d + ", contentId=" + this.f18201e + ", thumbnail=" + this.f18202f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18197a);
        out.writeString(this.f18198b);
        out.writeString(this.f18199c);
        out.writeString(this.f18200d);
        out.writeString(this.f18201e);
        l lVar = this.f18202f;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i10);
        }
    }
}
