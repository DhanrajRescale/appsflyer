package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzm extends zzc {
    private final /* synthetic */ zzj zzco;

    public zzm(zzj zzjVar) {
        this.zzco = zzjVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzr
    public final void zze(Status status) throws RemoteException {
        this.zzco.setResult((zzj) status);
    }
}
