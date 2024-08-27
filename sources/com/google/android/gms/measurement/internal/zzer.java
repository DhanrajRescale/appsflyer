package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import nn.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzer implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzeu zzf;

    public zzer(zzeu zzeuVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzeuVar;
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        zzfj zzm = this.zzf.zzt.zzm();
        if (zzm.zzy()) {
            zzeu zzeuVar = this.zzf;
            c10 = zzeuVar.zza;
            if (c10 == 0) {
                if (zzeuVar.zzt.zzf().zzy()) {
                    zzeu zzeuVar2 = this.zzf;
                    zzeuVar2.zzt.zzay();
                    zzeuVar2.zza = 'C';
                } else {
                    zzeu zzeuVar3 = this.zzf;
                    zzeuVar3.zzt.zzay();
                    zzeuVar3.zza = 'c';
                }
            }
            zzeu zzeuVar4 = this.zzf;
            j10 = zzeuVar4.zzb;
            if (j10 < 0) {
                zzeuVar4.zzt.zzf().zzh();
                zzeuVar4.zzb = 77000L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzeu zzeuVar5 = this.zzf;
            c11 = zzeuVar5.zza;
            j11 = zzeuVar5.zzb;
            String zzo = zzeu.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb2 = new StringBuilder("2");
            sb2.append(charAt);
            sb2.append(c11);
            sb2.append(j11);
            String o10 = d.o(sb2, ":", zzo);
            if (o10.length() > 1024) {
                o10 = this.zzb.substring(0, UserMetadata.MAX_ATTRIBUTE_SIZE);
            }
            zzfh zzfhVar = zzm.zzb;
            if (zzfhVar != null) {
                zzfhVar.zzb(o10, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzr(), "Persisted config not initialized. Not logging error/warn");
    }
}
