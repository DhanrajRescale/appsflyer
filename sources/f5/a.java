package f5;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;
import lp.g0;

/* loaded from: classes.dex */
public final class a implements p0 {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(18);

    /* renamed from: a, reason: collision with root package name */
    public final long f15917a;

    public a(long j10) {
        this.f15917a = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f15917a == ((a) obj).f15917a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return g0.g(this.f15917a);
    }

    public final String toString() {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder("Creation time: ");
        long j10 = this.f15917a;
        if (j10 == -2082844800000L) {
            valueOf = "unset";
        } else {
            valueOf = Long.valueOf(j10);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15917a);
    }

    public a(Parcel parcel) {
        this.f15917a = parcel.readLong();
    }
}
