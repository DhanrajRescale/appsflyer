package o3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import m.f3;

/* loaded from: classes.dex */
public final class g extends k4.b {
    public static final Parcelable.Creator<g> CREATOR = new f3(3);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f29563c;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f29563c = new SparseArray(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f29563c.append(iArr[i10], readParcelableArray[i10]);
        }
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeParcelable(this.f22040a, i10);
        SparseArray sparseArray = this.f29563c;
        if (sparseArray != null) {
            i11 = sparseArray.size();
        } else {
            i11 = 0;
        }
        parcel.writeInt(i11);
        int[] iArr = new int[i11];
        Parcelable[] parcelableArr = new Parcelable[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = this.f29563c.keyAt(i12);
            parcelableArr[i12] = (Parcelable) this.f29563c.valueAt(i12);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
