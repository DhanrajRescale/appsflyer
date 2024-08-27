package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes2.dex */
public final class zzag extends zzgx {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    public zzag(zzge zzgeVar) {
        super(zzgeVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeh.zzD.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, HttpUrl.FRAGMENT_ENCODE_SET);
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties class", e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (IllegalAccessException e11) {
            this.zzt.zzaA().zzd().zzb("Could not access SystemProperties.get()", e11);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (NoSuchMethodException e12) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties.get() method", e12);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (InvocationTargetException e13) {
            this.zzt.zzaA().zzd().zzb("SystemProperties.get() threw an exception", e13);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static final long zzz() {
        return ((Long) zzeh.zzd.zza(null)).longValue();
    }

    public final double zza(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Double) zzegVar.zza(null)).doubleValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzegVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzegVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzegVar.zza(null)).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzf(str, zzeh.zzH, 500, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    public final int zzc() {
        if (this.zzt.zzv().zzai(201500000, true)) {
            return 100;
        }
        return 25;
    }

    public final int zzd(String str) {
        return zzf(str, zzeh.zzI, 25, 100);
    }

    public final int zze(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Integer) zzegVar.zza(null)).intValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzegVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzegVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzegVar.zza(null)).intValue();
        }
    }

    public final int zzf(String str, zzeg zzegVar, int i10, int i11) {
        return Math.max(Math.min(zze(str, zzegVar), i11), i10);
    }

    public final long zzh() {
        this.zzt.zzay();
        return 77000L;
    }

    public final long zzi(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Long) zzegVar.zza(null)).longValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzegVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzegVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzegVar.zza(null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzt.zzaw().getPackageManager() == null) {
                this.zzt.zzaA().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzt.zzaw()).getApplicationInfo(this.zzt.zzaw().getPackageName(), 128);
            if (applicationInfo == null) {
                this.zzt.zzaA().zzd().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzt.zzaA().zzd().zzb("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            a.r(this.zzt, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!zzj.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(zzj.getBoolean(str));
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String zzn() {
        this.zzt.zzay();
        return "FA";
    }

    public final String zzo(String str, zzeg zzegVar) {
        if (str == null) {
            return (String) zzegVar.zza(null);
        }
        return (String) zzegVar.zza(this.zzb.zza(str, zzegVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzp(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzt
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            com.google.android.gms.internal.p002firebaseauthapi.a.r(r4, r0)
        L13:
            r4 = r1
            goto L24
        L15:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1c
            goto L13
        L1c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L24:
            if (r4 == 0) goto L50
            com.google.android.gms.measurement.internal.zzge r0 = r3.zzt     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.Context r0 = r0.zzaw()     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            if (r4 != 0) goto L3b
            return r1
        L3b:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            return r4
        L40:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzge r0 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzd()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzp(java.lang.String):java.util.List");
    }

    public final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        if (zzk != null && !zzk.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzs(String str, zzeg zzegVar) {
        if (str == null) {
            return ((Boolean) zzegVar.zza(null)).booleanValue();
        }
        String zza = this.zzb.zza(str, zzegVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Boolean) zzegVar.zza(null)).booleanValue();
        }
        return ((Boolean) zzegVar.zza(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        if (zzk != null && !zzk.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzv() {
        this.zzt.zzay();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        if (zzk != null && zzk.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        if (!this.zza.booleanValue() && this.zzt.zzN()) {
            return false;
        }
        return true;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc == null) {
                        ApplicationInfo applicationInfo = this.zzt.zzaw().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z10 = true;
                            }
                            this.zzc = Boolean.valueOf(z10);
                        }
                        if (this.zzc == null) {
                            this.zzc = Boolean.TRUE;
                            this.zzt.zzaA().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
