package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends k {
    public static final Parcelable.Creator<m> CREATOR = new d(4);

    /* renamed from: b, reason: collision with root package name */
    public final int f22254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22255c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22256d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f22257e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f22258f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f22254b = i10;
        this.f22255c = i11;
        this.f22256d = i12;
        this.f22257e = iArr;
        this.f22258f = iArr2;
    }

    @Override // k6.k, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f22254b == mVar.f22254b && this.f22255c == mVar.f22255c && this.f22256d == mVar.f22256d && Arrays.equals(this.f22257e, mVar.f22257e) && Arrays.equals(this.f22258f, mVar.f22258f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22258f) + ((Arrays.hashCode(this.f22257e) + ((((((527 + this.f22254b) * 31) + this.f22255c) * 31) + this.f22256d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22254b);
        parcel.writeInt(this.f22255c);
        parcel.writeInt(this.f22256d);
        parcel.writeIntArray(this.f22257e);
        parcel.writeIntArray(this.f22258f);
    }

    public m(Parcel parcel) {
        super("MLLT");
        this.f22254b = parcel.readInt();
        this.f22255c = parcel.readInt();
        this.f22256d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = x.f15050a;
        this.f22257e = createIntArray;
        this.f22258f = parcel.createIntArray();
    }
}
