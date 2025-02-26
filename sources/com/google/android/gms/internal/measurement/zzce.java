package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzce extends zzbn implements zzcf {
    public zzce() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
            zzbo.zzc(parcel);
            zze(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
