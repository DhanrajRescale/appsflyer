package l7;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f24114a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24114a;
    }

    @Override // l7.f
    public final void h(String[] strArr, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            obtain.writeInt(i10);
            obtain.writeStringArray(strArr);
            this.f24114a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
