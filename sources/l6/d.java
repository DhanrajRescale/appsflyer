package l6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;

/* loaded from: classes.dex */
public final class d implements p0 {
    public static final Parcelable.Creator<d> CREATOR = new k6.d(11);

    /* renamed from: a, reason: collision with root package name */
    public final float f24104a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24105b;

    public d(int i10, float f10) {
        this.f24104a = f10;
        this.f24105b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f24104a == dVar.f24104a && this.f24105b == dVar.f24105b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f24104a).hashCode() + 527) * 31) + this.f24105b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f24104a + ", svcTemporalLayerCount=" + this.f24105b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f24104a);
        parcel.writeInt(this.f24105b);
    }

    public d(Parcel parcel) {
        this.f24104a = parcel.readFloat();
        this.f24105b = parcel.readInt();
    }
}
