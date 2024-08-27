package hp;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class i extends c implements j {
    @Override // hp.c
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        Parcelable parcelable;
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i12 = d.f18638a;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                b(bundle);
                return true;
            }
            throw new BadParcelableException(jr.h.n("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }
}
