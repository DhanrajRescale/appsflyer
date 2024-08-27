package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.util.Iterator;
import java.util.Map;
import t.j0;

/* loaded from: classes2.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    /* JADX WARN: Type inference failed for: r1v1, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [t.j0, java.util.Map] */
    public zzd(zzge zzgeVar) {
        super(zzgeVar);
        this.zzb = new j0();
        this.zza = new j0();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j10;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            a.v(zzdVar.zzt, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j10));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zziq zzj = zzdVar.zzt.zzs().zzj(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzdVar.zzb.remove(str);
                Long l10 = (Long) zzdVar.zza.get(str);
                if (l10 == null) {
                    a.r(zzdVar.zzt, "First ad unit exposure time was never set");
                } else {
                    long longValue = j10 - l10.longValue();
                    zzdVar.zza.remove(str);
                    zzdVar.zzi(str, longValue, zzj);
                }
                if (zzdVar.zzb.isEmpty()) {
                    long j11 = zzdVar.zzc;
                    if (j11 == 0) {
                        a.r(zzdVar.zzt, "First ad exposure time was never set");
                        return;
                    } else {
                        zzdVar.zzh(j10 - j11, zzj);
                        zzdVar.zzc = 0L;
                        return;
                    }
                }
                return;
            }
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzt.zzaA().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zzh(long j10, zziq zziqVar) {
        if (zziqVar == null) {
            a.y(this.zzt, "Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        zzlo.zzK(zziqVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xa", bundle);
    }

    private final void zzi(String str, long j10, zziq zziqVar) {
        if (zziqVar == null) {
            a.y(this.zzt, "Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        zzlo.zzK(zziqVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j10) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j10));
        }
        if (!this.zza.isEmpty()) {
            this.zzc = j10;
        }
    }

    public final void zzd(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.zzt.zzaB().zzp(new zza(this, str, j10));
        } else {
            a.r(this.zzt, "Ad unit id must be a non-empty string");
        }
    }

    public final void zze(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.zzt.zzaB().zzp(new zzb(this, str, j10));
        } else {
            a.r(this.zzt, "Ad unit id must be a non-empty string");
        }
    }

    public final void zzf(long j10) {
        zziq zzj = this.zzt.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j10 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j10 - this.zzc, zzj);
        }
        zzj(j10);
    }
}
