package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new k6.d(15);

    /* renamed from: a, reason: collision with root package name */
    public final List f27626a;

    public i(ArrayList arrayList) {
        this.f27626a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f27626a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f27615a);
            parcel.writeByte(hVar.f27616b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f27617c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f27618d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f27620f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.f27613a);
                parcel.writeLong(gVar.f27614b);
            }
            parcel.writeLong(hVar.f27619e);
            parcel.writeByte(hVar.f27621g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f27622h);
            parcel.writeInt(hVar.f27623i);
            parcel.writeInt(hVar.f27624j);
            parcel.writeInt(hVar.f27625k);
        }
    }

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel));
        }
        this.f27626a = Collections.unmodifiableList(arrayList);
    }
}
