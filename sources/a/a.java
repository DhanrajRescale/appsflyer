package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a extends Binder implements b {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        }
        if (i10 != 1598968902) {
            switch (i10) {
                case 2:
                    parcel.readInt();
                    return true;
                case 3:
                    parcel.readString();
                    return true;
                case 4:
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.readString();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.readInt();
                    parcel.readInt();
                    return true;
                case 7:
                    parcel.readString();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 8:
                    parcel.readInt();
                    parcel.readInt();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
        return true;
    }
}
