package ep;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class f implements h, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f15788a;

    public f(IBinder iBinder) {
        this.f15788a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15788a;
    }

    @Override // ep.h
    public final void c(String str, Bundle bundle, dp.j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i10 = e.f15787a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f15788a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // ep.h
    public final void e(String str, Bundle bundle, dp.i iVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i10 = e.f15787a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(iVar);
        try {
            this.f15788a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
