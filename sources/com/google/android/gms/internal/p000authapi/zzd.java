package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzd implements IInterface {
    private final IBinder zzd;
    private final String zze;

    public zzd(IBinder iBinder, String str) {
        this.zzd = iBinder;
        this.zze = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzd;
    }

    public final Parcel zzc() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zze);
        return obtain;
    }

    public final void zzc(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzd.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
