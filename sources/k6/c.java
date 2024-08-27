package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends k {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(29);

    /* renamed from: b, reason: collision with root package name */
    public final String f22226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22227c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22228d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22229e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22230f;

    /* renamed from: g, reason: collision with root package name */
    public final k[] f22231g;

    public c(String str, int i10, int i11, long j10, long j11, k[] kVarArr) {
        super("CHAP");
        this.f22226b = str;
        this.f22227c = i10;
        this.f22228d = i11;
        this.f22229e = j10;
        this.f22230f = j11;
        this.f22231g = kVarArr;
    }

    @Override // k6.k, android.os.Parcelable
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
        if (this.f22227c == cVar.f22227c && this.f22228d == cVar.f22228d && this.f22229e == cVar.f22229e && this.f22230f == cVar.f22230f && x.a(this.f22226b, cVar.f22226b) && Arrays.equals(this.f22231g, cVar.f22231g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f22227c) * 31) + this.f22228d) * 31) + ((int) this.f22229e)) * 31) + ((int) this.f22230f)) * 31;
        String str = this.f22226b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22226b);
        parcel.writeInt(this.f22227c);
        parcel.writeInt(this.f22228d);
        parcel.writeLong(this.f22229e);
        parcel.writeLong(this.f22230f);
        k[] kVarArr = this.f22231g;
        parcel.writeInt(kVarArr.length);
        for (k kVar : kVarArr) {
            parcel.writeParcelable(kVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f22226b = readString;
        this.f22227c = parcel.readInt();
        this.f22228d = parcel.readInt();
        this.f22229e = parcel.readLong();
        this.f22230f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f22231g = new k[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f22231g[i11] = (k) parcel.readParcelable(k.class.getClassLoader());
        }
    }
}
