package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import t.j0;
import t.q;

/* loaded from: classes2.dex */
public final class zzfv extends zzkt implements zzaf {

    @VisibleForTesting
    final Map zza;

    @VisibleForTesting
    final Map zzb;

    @VisibleForTesting
    final Map zzc;

    @VisibleForTesting
    final q zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    /* JADX WARN: Type inference failed for: r2v1, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [t.j0, java.util.Map] */
    public zzfv(zzlg zzlgVar) {
        super(zzlgVar);
        this.zzg = new j0();
        this.zza = new j0();
        this.zzb = new j0();
        this.zzc = new j0();
        this.zzh = new j0();
        this.zzj = new j0();
        this.zzk = new j0();
        this.zzl = new j0();
        this.zzi = new j0();
        this.zzd = new zzfs(this, 20);
        this.zze = new zzft(this);
    }

    private final com.google.android.gms.internal.measurement.zzff zzA(String str, byte[] bArr) {
        Long l10;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzli.zzl(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaD();
            zzes zzj = this.zzt.zzaA().zzj();
            String str2 = null;
            if (zzffVar.zzu()) {
                l10 = Long.valueOf(zzffVar.zzc());
            } else {
                l10 = null;
            }
            if (zzffVar.zzt()) {
                str2 = zzffVar.zzh();
            }
            zzj.zzc("Parsed config. version, gmp_app_id", l10, str2);
            return zzffVar;
        } catch (com.google.android.gms.internal.measurement.zzll e10) {
            this.zzt.zzaA().zzk().zzc("Unable to merge remote config. appId", zzeu.zzn(str), e10);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e11) {
            this.zzt.zzaA().zzk().zzc("Unable to merge remote config. appId", zzeu.zzn(str), e11);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        j0 j0Var = new j0();
        j0 j0Var2 = new j0();
        j0 j0Var3 = new j0();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzfb) it.next()).zzb());
        }
        for (int i10 = 0; i10 < zzfeVar.zza(); i10++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzfeVar.zzb(i10).zzbB();
            if (zzfcVar.zzc().isEmpty()) {
                a.v(this.zzt, "EventConfig contained null event name");
            } else {
                String zzc = zzfcVar.zzc();
                String zzb = zzhb.zzb(zzfcVar.zzc());
                if (!TextUtils.isEmpty(zzb)) {
                    zzfcVar.zzb(zzb);
                    zzfeVar.zzd(i10, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    j0Var.put(zzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    j0Var2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() >= 2 && zzfcVar.zza() <= 65535) {
                        j0Var3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        this.zzt.zzaA().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, j0Var);
        this.zzc.put(str, j0Var2);
        this.zzi.put(str, j0Var3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzC(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfv.zzC(java.lang.String):void");
    }

    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar.zza() != 0) {
            this.zzt.zzaA().zzj().zzb("EES programs found", Integer.valueOf(zzffVar.zza()));
            com.google.android.gms.internal.measurement.zzgt zzgtVar = (com.google.android.gms.internal.measurement.zzgt) zzffVar.zzo().get(0);
            try {
                com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
                zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfu(zzfv.this, str));
                    }
                });
                zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final zzfv zzfvVar = zzfv.this;
                        final String str2 = str;
                        return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfo
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzfv zzfvVar2 = zzfv.this;
                                String str3 = str2;
                                zzh zzj = zzfvVar2.zzf.zzi().zzj(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", LogSubCategory.LifeCycle.ANDROID);
                                hashMap.put("package_name", str3);
                                zzfvVar2.zzt.zzf().zzh();
                                hashMap.put("gmp_version", 77000L);
                                if (zzj != null) {
                                    String zzx = zzj.zzx();
                                    if (zzx != null) {
                                        hashMap.put("app_version", zzx);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                    hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(zzfv.this.zze);
                    }
                });
                zzcVar.zzc(zzgtVar);
                this.zzd.put(str, zzcVar);
                this.zzt.zzaA().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
                Iterator it = zzgtVar.zza().zzd().iterator();
                while (it.hasNext()) {
                    this.zzt.zzaA().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgr) it.next()).zzb());
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zzt.zzaA().zzd().zzb("Failed to load EES program. appId", str);
                return;
            }
        }
        this.zzd.remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.j0, java.util.Map] */
    private static final Map zzE(com.google.android.gms.internal.measurement.zzff zzffVar) {
        ?? j0Var = new j0();
        if (zzffVar != null) {
            for (com.google.android.gms.internal.measurement.zzfj zzfjVar : zzffVar.zzp()) {
                j0Var.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return j0Var;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfv zzfvVar, String str) {
        zzfvVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfvVar.zzo(str)) {
            return null;
        }
        if (zzfvVar.zzh.containsKey(str) && zzfvVar.zzh.get(str) != null) {
            zzfvVar.zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfvVar.zzh.get(str));
        } else {
            zzfvVar.zzC(str);
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfvVar.zzd.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final String zza(String str, String str2) {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkt
    public final boolean zzb() {
        return false;
    }

    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.zzff zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str);
    }

    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    public final String zzi(String str) {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzff zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzs();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        if (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str)) == null || zzffVar.zza() == 0) {
            return false;
        }
        return true;
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzr(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlo.zzaj(str2)) {
            return true;
        }
        if (zzs(str) && zzlo.zzak(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, bArr).zzbB();
        zzB(str, zzfeVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzj.put(str, zzfeVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfeVar.zzf()));
        try {
            zzfeVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()).zzbx();
        } catch (RuntimeException e10) {
            this.zzt.zzaA().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeu.zzn(str), e10);
        }
        zzam zzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi.zzg();
        zzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzi.zzt.zzaA().zzd().zzb("Failed to update remote config (got 0). appId", zzeu.zzn(str));
            }
        } catch (SQLiteException e11) {
            zzi.zzt.zzaA().zzd().zzc("Error storing remote config. appId", zzeu.zzn(str), e11);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        return true;
    }

    public final boolean zzu(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean zzv(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null) {
            return false;
        }
        if (!((Set) this.zza.get(str)).contains("device_model") && !((Set) this.zza.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    public final boolean zzw(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    public final boolean zzx(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    public final boolean zzy(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null) {
            return false;
        }
        if (!((Set) this.zza.get(str)).contains("os_version") && !((Set) this.zza.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    public final boolean zzz(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }
}
