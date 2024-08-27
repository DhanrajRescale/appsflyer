package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d implements ILicensingService {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f8381a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8381a;
    }

    @Override // com.android.vending.licensing.ILicensingService
    public final void d(long j10, String str, b bVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
            obtain.writeLong(j10);
            obtain.writeString(str);
            obtain.writeStrongBinder(bVar.asBinder());
            if (!this.f8381a.transact(1, obtain, null, 1)) {
                int i10 = e.f8382a;
            }
        } finally {
            obtain.recycle();
        }
    }
}
