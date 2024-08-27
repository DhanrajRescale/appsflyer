package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class b extends Binder implements c {
    private static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseResultListener";
    static final int TRANSACTION_verifyLicense = 1;

    public b() {
        attachInterface(this, DESCRIPTOR);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.android.vending.licensing.c, com.android.vending.licensing.a] */
    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
            return (c) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f8380a = iBinder;
        return obj;
    }

    public static c getDefaultImpl() {
        return a.f8379b;
    }

    public static boolean setDefaultImpl(c cVar) {
        if (a.f8379b == null) {
            if (cVar != null) {
                a.f8379b = cVar;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("setDefaultImpl() called twice");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
        parcel.enforceInterface(DESCRIPTOR);
        verifyLicense(parcel.readInt(), parcel.readString(), parcel.readString());
        return true;
    }
}
