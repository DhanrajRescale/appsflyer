package com.google.android.gms.internal.icing;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzag extends zzaj<Status> {
    final /* synthetic */ zzx[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, GoogleApiClient googleApiClient, zzx[] zzxVarArr) {
        super(googleApiClient);
        this.zza = zzxVarArr;
    }

    @Override // com.google.android.gms.internal.icing.zzai
    public final void zza(zzaa zzaaVar) throws RemoteException {
        zzaaVar.zzd(new zzak(this), null, this.zza);
    }
}
