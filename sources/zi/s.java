package zi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f42525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42526b;

    /* renamed from: c, reason: collision with root package name */
    public final i f42527c;

    public s(String displayValue, boolean z10, i iVar) {
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f42525a = displayValue;
        this.f42526b = z10;
        this.f42527c = iVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f42525a, sVar.f42525a) && this.f42526b == sVar.f42526b && Intrinsics.a(this.f42527c, sVar.f42527c);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f42526b, this.f42525a.hashCode() * 31, 31);
        i iVar = this.f42527c;
        if (iVar == null) {
            hashCode = 0;
        } else {
            hashCode = iVar.hashCode();
        }
        return d10 + hashCode;
    }

    public final String toString() {
        return "TabularCells(displayValue=" + this.f42525a + ", trophy=" + this.f42526b + ", narration=" + this.f42527c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f42525a);
        out.writeInt(this.f42526b ? 1 : 0);
        i iVar = this.f42527c;
        if (iVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            iVar.writeToParcel(out, i10);
        }
    }
}
