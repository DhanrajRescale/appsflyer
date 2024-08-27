package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import nn.d;
import v.e;

/* loaded from: classes2.dex */
public final class zzar {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzau zzf;

    public zzar(zzge zzgeVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgeVar.zzaA().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeu.zzn(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgeVar.zzaA().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzgeVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgeVar.zzaA().zzk().zzb("Param value can't be null", zzgeVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzgeVar.zzv().zzP(bundle2, next, zzA);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.zzf = zzauVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return d.o(e.l("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), UrlTreeKt.componentParamSuffix);
    }

    public final zzar zza(zzge zzgeVar, long j10) {
        return new zzar(zzgeVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }

    private zzar(zzge zzgeVar, String str, String str2, String str3, long j10, long j11, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgeVar.zzaA().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeu.zzn(str2), zzeu.zzn(str3));
        }
        this.zzf = zzauVar;
    }
}
