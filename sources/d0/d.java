package d0;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f13153a;

    public d(int i10) {
        this.f13153a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f13153a == ((d) obj).f13153a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13153a);
    }

    public final String toString() {
        return a3.a.i(new StringBuilder("DefaultLazyKey(index="), this.f13153a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13153a);
    }
}
