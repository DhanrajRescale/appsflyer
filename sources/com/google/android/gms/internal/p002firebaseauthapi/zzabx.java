package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzabx extends zzaae {
    final /* synthetic */ zzaca zza;
    private final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzabx(zzaca zzacaVar, zzaae zzaaeVar, String str) {
        super(zzaaeVar);
        this.zza = zzacaVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final void zzb(String str) {
        Logger logger;
        HashMap hashMap;
        logger = zzaca.zza;
        logger.d("onCodeSent", new Object[0]);
        hashMap = this.zza.zzd;
        zzabz zzabzVar = (zzabz) hashMap.get(this.zzb);
        if (zzabzVar == null) {
            return;
        }
        Iterator it = zzabzVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzaae) it.next()).zzb(str);
        }
        zzabzVar.zzg = true;
        zzabzVar.zzd = str;
        if (zzabzVar.zza <= 0) {
            this.zza.zzg(this.zzb);
        } else if (!zzabzVar.zzc) {
            this.zza.zzm(this.zzb);
        } else if (!zzac.zzd(zzabzVar.zze)) {
            zzaca.zzd(this.zza, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final void zzh(Status status) {
        Logger logger;
        HashMap hashMap;
        logger = zzaca.zza;
        logger.e("SMS verification code request failed: " + CommonStatusCodes.getStatusCodeString(status.getStatusCode()) + " " + status.getStatusMessage(), new Object[0]);
        hashMap = this.zza.zzd;
        zzabz zzabzVar = (zzabz) hashMap.get(this.zzb);
        if (zzabzVar == null) {
            return;
        }
        Iterator it = zzabzVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzaae) it.next()).zzh(status);
        }
        this.zza.zzi(this.zzb);
    }
}
