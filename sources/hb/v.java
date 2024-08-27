package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<v> CREATOR = new e(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f18231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18232b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18233c;

    public v(String str, String str2, boolean z10) {
        this.f18231a = str;
        this.f18232b = str2;
        this.f18233c = z10;
    }

    public static v a(v vVar, boolean z10) {
        String str = vVar.f18231a;
        String str2 = vVar.f18232b;
        vVar.getClass();
        return new v(str, str2, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.a(this.f18231a, vVar.f18231a) && Intrinsics.a(this.f18232b, vVar.f18232b) && this.f18233c == vVar.f18233c;
    }

    public final int hashCode() {
        String str = this.f18231a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18232b;
        return Boolean.hashCode(this.f18233c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Filter(name=");
        sb2.append(this.f18231a);
        sb2.append(", title=");
        sb2.append(this.f18232b);
        sb2.append(", isSelected=");
        return da.e.o(sb2, this.f18233c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18231a);
        out.writeString(this.f18232b);
        out.writeInt(this.f18233c ? 1 : 0);
    }
}
