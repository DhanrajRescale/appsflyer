package m6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.p;

/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new k6.d(16);

    /* renamed from: a, reason: collision with root package name */
    public final long f27627a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27628b;

    public j(long j10, long j11) {
        this.f27627a = j10;
        this.f27628b = j11;
    }

    public static long a(long j10, p pVar) {
        long u10 = pVar.u();
        if ((128 & u10) != 0) {
            return 8589934591L & ((((u10 & 1) << 32) | pVar.v()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // m6.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f27627a);
        sb2.append(", playbackPositionUs= ");
        return a3.a.j(sb2, this.f27628b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27627a);
        parcel.writeLong(this.f27628b);
    }
}
