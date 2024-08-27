package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class zzw extends com.google.android.gms.internal.p000authapi.zzd implements zzt {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzt
    public final void zzc(zzr zzrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, zzrVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, googleSignInOptions);
        zzc(101, zzc);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzt
    public final void zzd(zzr zzrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, zzrVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, googleSignInOptions);
        zzc(102, zzc);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzt
    public final void zze(zzr zzrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, zzrVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(zzc, googleSignInOptions);
        zzc(103, zzc);
    }
}
