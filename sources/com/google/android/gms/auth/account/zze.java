package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zze extends com.google.android.gms.internal.auth.zza implements zzc {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zza(zza zzaVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(obtainAndWriteInterfaceToken, zzaVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zzb(boolean z10) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.writeBoolean(obtainAndWriteInterfaceToken, z10);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zza(zza zzaVar, Account account) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(obtainAndWriteInterfaceToken, zzaVar);
        com.google.android.gms.internal.auth.zzc.zza(obtainAndWriteInterfaceToken, account);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }
}
