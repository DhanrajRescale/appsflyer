package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class zzcv extends zzdu {
    final /* synthetic */ zzef zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzef zzefVar) {
        super(zzefVar, true);
        this.zza = zzefVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zza.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).resetAnalyticsData(this.zzh);
    }
}
