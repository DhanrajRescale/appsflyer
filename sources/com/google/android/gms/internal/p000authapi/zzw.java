package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* loaded from: classes2.dex */
public final class zzw extends zzd implements zzx {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar, CredentialRequest credentialRequest) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzvVar);
        zzf.zzc(zzc, credentialRequest);
        zzc(1, zzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar, zzz zzzVar) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzvVar);
        zzf.zzc(zzc, zzzVar);
        zzc(2, zzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar, zzt zztVar) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzvVar);
        zzf.zzc(zzc, zztVar);
        zzc(3, zzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzvVar);
        zzc(4, zzc);
    }
}
