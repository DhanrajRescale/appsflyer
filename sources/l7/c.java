package l7;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f24113a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24113a;
    }

    @Override // l7.d
    public final void b(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f24113a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
