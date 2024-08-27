package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzwt implements zzabl {
    final /* synthetic */ zzadq zza;
    final /* synthetic */ zzacv zzb;
    final /* synthetic */ zzaae zzc;
    final /* synthetic */ zzade zzd;
    final /* synthetic */ zzabk zze;
    final /* synthetic */ zzyh zzf;

    public zzwt(zzyh zzyhVar, zzadq zzadqVar, zzacv zzacvVar, zzaae zzaaeVar, zzade zzadeVar, zzabk zzabkVar) {
        this.zzf = zzyhVar;
        this.zza = zzadqVar;
        this.zzb = zzacvVar;
        this.zzc = zzaaeVar;
        this.zzd = zzadeVar;
        this.zze = zzabkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzadr zzadrVar = (zzadr) obj;
        if (this.zza.zzn("EMAIL")) {
            this.zzb.zzg(null);
        } else {
            zzadq zzadqVar = this.zza;
            if (zzadqVar.zzk() != null) {
                this.zzb.zzg(zzadqVar.zzk());
            }
        }
        if (this.zza.zzn(UserPreferences.KEY_USER_DISPLAY_NAME)) {
            this.zzb.zzf(null);
        } else {
            zzadq zzadqVar2 = this.zza;
            if (zzadqVar2.zzj() != null) {
                this.zzb.zzf(zzadqVar2.zzj());
            }
        }
        if (this.zza.zzn("PHOTO_URL")) {
            this.zzb.zzj(null);
        } else {
            zzadq zzadqVar3 = this.zza;
            if (zzadqVar3.zzm() != null) {
                this.zzb.zzj(zzadqVar3.zzm());
            }
        }
        if (!TextUtils.isEmpty(this.zza.zzl())) {
            this.zzb.zzi(Base64Utils.encode("redacted".getBytes()));
        }
        List zzf = zzadrVar.zzf();
        if (zzf == null) {
            zzf = new ArrayList();
        }
        this.zzb.zzk(zzf);
        zzaae zzaaeVar = this.zzc;
        zzade zzadeVar = this.zzd;
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(zzadrVar);
        String zzd = zzadrVar.zzd();
        String zze = zzadrVar.zze();
        if (!TextUtils.isEmpty(zzd) && !TextUtils.isEmpty(zze)) {
            zzadeVar = new zzade(zze, zzd, Long.valueOf(zzadrVar.zzb()), zzadeVar.zzg());
        }
        zzaaeVar.zzk(zzadeVar, this.zzb);
    }
}
