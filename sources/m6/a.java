package m6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new k6.d(12);

    /* renamed from: a, reason: collision with root package name */
    public final long f27591a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27592b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27593c;

    public a(long j10, byte[] bArr, long j11) {
        this.f27591a = j11;
        this.f27592b = j10;
        this.f27593c = bArr;
    }

    @Override // m6.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f27591a);
        sb2.append(", identifier= ");
        return a3.a.j(sb2, this.f27592b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27591a);
        parcel.writeLong(this.f27592b);
        parcel.writeByteArray(this.f27593c);
    }

    public a(Parcel parcel) {
        this.f27591a = parcel.readLong();
        this.f27592b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = x.f15050a;
        this.f27593c = createByteArray;
    }
}
