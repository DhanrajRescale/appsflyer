package f5;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;
import yk.j;

/* loaded from: classes.dex */
public final class c implements p0 {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(20);

    /* renamed from: a, reason: collision with root package name */
    public final float f15922a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15923b;

    public c(float f10, float f11) {
        j.F0(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f15922a = f10;
        this.f15923b = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15922a == cVar.f15922a && this.f15923b == cVar.f15923b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f15923b).hashCode() + ((Float.valueOf(this.f15922a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f15922a + ", longitude=" + this.f15923b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f15922a);
        parcel.writeFloat(this.f15923b);
    }

    public c(Parcel parcel) {
        this.f15922a = parcel.readFloat();
        this.f15923b = parcel.readFloat();
    }
}
