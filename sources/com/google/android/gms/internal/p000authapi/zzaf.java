package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* loaded from: classes2.dex */
public final class zzaf extends zzd implements zzac {
    public zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzac
    public final void zzc(zzag zzagVar, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzagVar);
        zzf.zzc(zzc, savePasswordRequest);
        zzc(2, zzc);
    }
}
