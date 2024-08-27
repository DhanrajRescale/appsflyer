package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzka extends zzkt {
    public final zzff zza;
    public final zzff zzb;
    public final zzff zzc;
    public final zzff zzd;
    public final zzff zze;
    private final Map zzg;

    public zzka(zzlg zzlgVar) {
        super(zzlgVar);
        this.zzg = new HashMap();
        zzfj zzm = this.zzt.zzm();
        zzm.getClass();
        this.zza = new zzff(zzm, "last_delete_stale", 0L);
        zzfj zzm2 = this.zzt.zzm();
        zzm2.getClass();
        this.zzb = new zzff(zzm2, "backoff", 0L);
        zzfj zzm3 = this.zzt.zzm();
        zzm3.getClass();
        this.zzc = new zzff(zzm3, "last_upload", 0L);
        zzfj zzm4 = this.zzt.zzm();
        zzm4.getClass();
        this.zzd = new zzff(zzm4, "last_upload_attempt", 0L);
        zzfj zzm5 = this.zzt.zzm();
        zzm5.getClass();
        this.zze = new zzff(zzm5, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair zza(String str) {
        zzjz zzjzVar;
        AdvertisingIdClient.Info info;
        zzg();
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        zzjz zzjzVar2 = (zzjz) this.zzg.get(str);
        if (zzjzVar2 != null && elapsedRealtime < zzjzVar2.zzc) {
            return new Pair(zzjzVar2.zza, Boolean.valueOf(zzjzVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzi = this.zzt.zzf().zzi(str, zzeh.zza) + elapsedRealtime;
        try {
            long zzi2 = this.zzt.zzf().zzi(str, zzeh.zzb);
            if (zzi2 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (zzjzVar2 != null && elapsedRealtime < zzjzVar2.zzc + zzi2) {
                        return new Pair(zzjzVar2.zza, Boolean.valueOf(zzjzVar2.zzb));
                    }
                    info = null;
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
            }
        } catch (Exception e10) {
            this.zzt.zzaA().zzc().zzb("Unable to get advertising id", e10);
            zzjzVar = new zzjz(HttpUrl.FRAGMENT_ENCODE_SET, false, zzi);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        if (id2 != null) {
            zzjzVar = new zzjz(id2, info.isLimitAdTrackingEnabled(), zzi);
        } else {
            zzjzVar = new zzjz(HttpUrl.FRAGMENT_ENCODE_SET, info.isLimitAdTrackingEnabled(), zzi);
        }
        this.zzg.put(str, zzjzVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(zzjzVar.zza, Boolean.valueOf(zzjzVar.zzb));
    }

    @Override // com.google.android.gms.measurement.internal.zzkt
    public final boolean zzb() {
        return false;
    }

    public final Pair zzd(String str, zzai zzaiVar) {
        if (zzaiVar.zzi(zzah.AD_STORAGE)) {
            return zza(str);
        }
        return new Pair(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE);
    }

    @Deprecated
    public final String zzf(String str, boolean z10) {
        String str2;
        zzg();
        if (z10) {
            str2 = (String) zza(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest zzF = zzlo.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzF.digest(str2.getBytes())));
    }
}
