package l6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;
import lp.g0;

/* loaded from: classes.dex */
public final class a implements p0 {
    public static final Parcelable.Creator<a> CREATOR = new k6.d(8);

    /* renamed from: a, reason: collision with root package name */
    public final long f24095a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24096b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24097c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24098d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24099e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f24095a = j10;
        this.f24096b = j11;
        this.f24097c = j12;
        this.f24098d = j13;
        this.f24099e = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f24095a == aVar.f24095a && this.f24096b == aVar.f24096b && this.f24097c == aVar.f24097c && this.f24098d == aVar.f24098d && this.f24099e == aVar.f24099e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return g0.g(this.f24099e) + ((g0.g(this.f24098d) + ((g0.g(this.f24097c) + ((g0.g(this.f24096b) + ((g0.g(this.f24095a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f24095a + ", photoSize=" + this.f24096b + ", photoPresentationTimestampUs=" + this.f24097c + ", videoStartPosition=" + this.f24098d + ", videoSize=" + this.f24099e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24095a);
        parcel.writeLong(this.f24096b);
        parcel.writeLong(this.f24097c);
        parcel.writeLong(this.f24098d);
        parcel.writeLong(this.f24099e);
    }

    public a(Parcel parcel) {
        this.f24095a = parcel.readLong();
        this.f24096b = parcel.readLong();
        this.f24097c = parcel.readLong();
        this.f24098d = parcel.readLong();
        this.f24099e = parcel.readLong();
    }
}
