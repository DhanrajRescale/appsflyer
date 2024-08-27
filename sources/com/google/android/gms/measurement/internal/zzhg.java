package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhg implements zzeo {
    final /* synthetic */ zzge zza;

    public zzhg(zzhh zzhhVar, zzge zzgeVar) {
        this.zza = zzgeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final boolean zza() {
        if (this.zza.zzL() && Log.isLoggable(this.zza.zzaA().zzr(), 3)) {
            return true;
        }
        return false;
    }
}
