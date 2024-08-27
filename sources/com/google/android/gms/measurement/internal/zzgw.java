package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzgw extends zzej {
    private final zzlg zza;
    private Boolean zzb;
    private String zzc;

    public zzgw(zzlg zzlgVar, String str) {
        Preconditions.checkNotNull(zzlgVar);
        this.zza = zzlgVar;
        this.zzc = null;
    }

    private final void zzA(zzaw zzawVar, zzq zzqVar) {
        this.zza.zzA();
        this.zza.zzE(zzawVar, zzqVar);
    }

    private final void zzy(zzq zzqVar, boolean z10) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        this.zza.zzv().zzY(zzqVar.zzb, zzqVar.zzq);
    }

    private final void zzz(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.zzb == null) {
                        boolean z11 = true;
                        if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzaw(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zzaw()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z11 = false;
                        }
                        this.zzb = Boolean.valueOf(z11);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.zza.zzaA().zzd().zzb("Measurement Service called with invalid calling package. appId", zzeu.zzn(str));
                    throw e10;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaw(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (str.equals(this.zzc)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.zza.zzaA().zzd().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @VisibleForTesting
    public final zzaw zzb(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.zza) && (zzauVar = zzawVar.zzb) != null && zzauVar.zza() != 0) {
            String zzg = zzawVar.zzb.zzg("_cis");
            if ("referrer broadcast".equals(zzg) || "referrer API".equals(zzg)) {
                this.zza.zzaA().zzi().zzb("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.zzb, zzawVar.zzc, zzawVar.zzd);
            }
        }
        return zzawVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final String zzd(zzq zzqVar) {
        zzy(zzqVar, false);
        return this.zza.zzx(zzqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List zze(zzq zzqVar, boolean z10) {
        zzy(zzqVar, false);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzll> list = (List) this.zza.zzaB().zzh(new zzgt(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzll zzllVar : list) {
                if (!z10 && zzlo.zzaj(zzllVar.zzc)) {
                }
                arrayList.add(new zzlj(zzllVar));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaA().zzd().zzc("Failed to get user properties. appId", zzeu.zzn(zzqVar.zza), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaA().zzd().zzc("Failed to get user properties. appId", zzeu.zzn(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List zzf(String str, String str2, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaB().zzh(new zzgk(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaA().zzd().zzb("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaB().zzh(new zzgl(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzaA().zzd().zzb("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List zzh(String str, String str2, boolean z10, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzll> list = (List) this.zza.zzaB().zzh(new zzgi(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzll zzllVar : list) {
                if (!z10 && zzlo.zzaj(zzllVar.zzc)) {
                }
                arrayList.add(new zzlj(zzllVar));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaA().zzd().zzc("Failed to query user properties. appId", zzeu.zzn(zzqVar.zza), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaA().zzd().zzc("Failed to query user properties. appId", zzeu.zzn(zzqVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final List zzi(String str, String str2, String str3, boolean z10) {
        zzz(str, true);
        try {
            List<zzll> list = (List) this.zza.zzaB().zzh(new zzgj(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzll zzllVar : list) {
                if (!z10 && zzlo.zzaj(zzllVar.zzc)) {
                }
                arrayList.add(new zzlj(zzllVar));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaA().zzd().zzc("Failed to get user properties as. appId", zzeu.zzn(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaA().zzd().zzc("Failed to get user properties as. appId", zzeu.zzn(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzj(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzgu(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzk(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        zzy(zzqVar, false);
        zzx(new zzgp(this, zzawVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzl(zzaw zzawVar, String str, String str2) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        zzz(str, true);
        zzx(new zzgq(this, zzawVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        zzx(new zzgm(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        zzy(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        zzx(new zzgg(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        zzz(zzacVar.zza, true);
        zzx(new zzgh(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        zzgo zzgoVar = new zzgo(this, zzqVar);
        Preconditions.checkNotNull(zzgoVar);
        if (this.zza.zzaB().zzs()) {
            zzgoVar.run();
        } else {
            this.zza.zzaB().zzq(zzgoVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzq(long j10, String str, String str2, String str3) {
        zzx(new zzgv(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        zzy(zzqVar, false);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        zzx(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgf
            @Override // java.lang.Runnable
            public final void run() {
                zzgw.this.zzw(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzs(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzgn(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final void zzt(zzlj zzljVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzljVar);
        zzy(zzqVar, false);
        zzx(new zzgs(this, zzljVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzek
    public final byte[] zzu(zzaw zzawVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzawVar);
        zzz(str, true);
        this.zza.zzaA().zzc().zzb("Log and bundle. event", this.zza.zzj().zzd(zzawVar.zza));
        long nanoTime = this.zza.zzax().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzaB().zzi(new zzgr(this, zzawVar, str)).get();
            if (bArr == null) {
                this.zza.zzaA().zzd().zzb("Log and bundle returned null. appId", zzeu.zzn(str));
                bArr = new byte[0];
            }
            this.zza.zzaA().zzc().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzj().zzd(zzawVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzax().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            this.zza.zzaA().zzd().zzd("Failed to log and bundle. appId, event, error", zzeu.zzn(str), this.zza.zzj().zzd(zzawVar.zza), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.zza.zzaA().zzd().zzd("Failed to log and bundle. appId, event, error", zzeu.zzn(str), this.zza.zzj().zzd(zzawVar.zza), e);
            return null;
        }
    }

    public final void zzv(zzaw zzawVar, zzq zzqVar) {
        com.google.android.gms.internal.measurement.zzc zzcVar;
        if (!this.zza.zzo().zzo(zzqVar.zza)) {
            zzA(zzawVar, zzqVar);
            return;
        }
        this.zza.zzaA().zzj().zzb("EES config found for", zzqVar.zza);
        zzfv zzo = this.zza.zzo();
        String str = zzqVar.zza;
        if (TextUtils.isEmpty(str)) {
            zzcVar = null;
        } else {
            zzcVar = (com.google.android.gms.internal.measurement.zzc) zzo.zzd.get(str);
        }
        if (zzcVar != null) {
            try {
                Map zzs = this.zza.zzu().zzs(zzawVar.zzb.zzc(), true);
                String zza = zzhb.zza(zzawVar.zza);
                if (zza == null) {
                    zza = zzawVar.zza;
                }
                if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(zza, zzawVar.zzd, zzs))) {
                    if (zzcVar.zzg()) {
                        this.zza.zzaA().zzj().zzb("EES edited event", zzawVar.zza);
                        zzA(this.zza.zzu().zzi(zzcVar.zza().zzb()), zzqVar);
                    } else {
                        zzA(zzawVar, zzqVar);
                    }
                    if (zzcVar.zzf()) {
                        for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                            this.zza.zzaA().zzj().zzb("EES logging created event", zzaaVar.zzd());
                            zzA(this.zza.zzu().zzi(zzaaVar), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zza.zzaA().zzd().zzc("EES error. appId, eventName", zzqVar.zzb, zzawVar.zza);
            }
            this.zza.zzaA().zzj().zzb("EES was not applied to event", zzawVar.zza);
            zzA(zzawVar, zzqVar);
            return;
        }
        this.zza.zzaA().zzj().zzb("EES not loaded for", zzqVar.zza);
        zzA(zzawVar, zzqVar);
    }

    public final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzam zzi = this.zza.zzi();
        zzi.zzg();
        zzi.zzW();
        byte[] zzbx = zzi.zzf.zzu().zzj(new zzar(zzi.zzt, HttpUrl.FRAGMENT_ENCODE_SET, str, "dep", 0L, 0L, bundle)).zzbx();
        zzi.zzt.zzaA().zzj().zzc("Saving default event parameters, appId, data size", zzi.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbx);
        try {
            if (zzi.zzh().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzi.zzt.zzaA().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzeu.zzn(str));
            }
        } catch (SQLiteException e10) {
            zzi.zzt.zzaA().zzd().zzc("Error storing default event parameters. appId", zzeu.zzn(str), e10);
        }
    }

    @VisibleForTesting
    public final void zzx(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzaB().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaB().zzp(runnable);
        }
    }
}
