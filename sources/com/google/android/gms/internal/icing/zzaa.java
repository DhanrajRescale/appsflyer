package com.google.android.gms.internal.icing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yp.b;

/* loaded from: classes2.dex */
public final class zzaa extends zza implements IInterface {
    public zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void zzd(zzac zzacVar, String str, zzx[] zzxVarArr) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzacVar);
        zza.writeString(null);
        zza.writeTypedArray(zzxVarArr, 0);
        zzc(1, zza);
    }

    public final void zze(zzac zzacVar, b[] bVarArr) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzacVar);
        zza.writeTypedArray(bVarArr, 0);
        zzc(7, zza);
    }
}
