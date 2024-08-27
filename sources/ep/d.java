package ep;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class d extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        i iVar = (i) this;
        Parcelable parcelable = null;
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i12 = e.f15787a;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                iVar.g(bundle);
                return true;
            }
            throw new BadParcelableException(jr.h.n("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i13 = e.f15787a;
        if (parcel.readInt() != 0) {
            parcelable = (Parcelable) creator2.createFromParcel(parcel);
        }
        Bundle bundle2 = (Bundle) parcelable;
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            iVar.f(bundle2);
            return true;
        }
        throw new BadParcelableException(jr.h.n("Parcel data not fully consumed, unread size: ", dataAvail2));
    }
}
