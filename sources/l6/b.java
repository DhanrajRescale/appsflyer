package l6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;
import java.util.Arrays;
import java.util.Locale;
import yk.j;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new k6.d(10);

    /* renamed from: a, reason: collision with root package name */
    public final long f24100a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24102c;

    public b(int i10, long j10, long j11) {
        boolean z10;
        if (j10 < j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.E0(z10);
        this.f24100a = j10;
        this.f24101b = j11;
        this.f24102c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f24100a == bVar.f24100a && this.f24101b == bVar.f24101b && this.f24102c == bVar.f24102c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f24100a), Long.valueOf(this.f24101b), Integer.valueOf(this.f24102c)});
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f24100a), Long.valueOf(this.f24101b), Integer.valueOf(this.f24102c)};
        int i10 = x.f15050a;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24100a);
        parcel.writeLong(this.f24101b);
        parcel.writeInt(this.f24102c);
    }
}
