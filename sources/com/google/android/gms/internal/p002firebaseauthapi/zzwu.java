package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import zp.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzwu implements zzabl {
    final /* synthetic */ zzabk zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Boolean zzd;
    final /* synthetic */ d0 zze;
    final /* synthetic */ zzaae zzf;
    final /* synthetic */ zzade zzg;

    public zzwu(zzyh zzyhVar, zzabk zzabkVar, String str, String str2, Boolean bool, d0 d0Var, zzaae zzaaeVar, zzade zzadeVar) {
        this.zza = zzabkVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = d0Var;
        this.zzf = zzaaeVar;
        this.zzg = zzadeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        List zzb = ((zzacu) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            int i10 = 0;
            zzacv zzacvVar = (zzacv) zzb.get(0);
            zzadk zzl = zzacvVar.zzl();
            if (zzl != null) {
                list = zzl.zzc();
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                if (TextUtils.isEmpty(this.zzb)) {
                    ((zzadj) list.get(0)).zzh(this.zzc);
                } else {
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        }
                        if (((zzadj) list.get(i10)).zzf().equals(this.zzb)) {
                            ((zzadj) list.get(i10)).zzh(this.zzc);
                            break;
                        }
                        i10++;
                    }
                }
            }
            zzacvVar.zzh(this.zzd.booleanValue());
            zzacvVar.zze(this.zze);
            this.zzf.zzk(this.zzg, zzacvVar);
            return;
        }
        this.zza.zza("No users.");
    }
}
