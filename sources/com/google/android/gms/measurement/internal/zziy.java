package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zziy extends zzf {

    @VisibleForTesting
    protected zziq zza;
    private volatile zziq zzb;
    private volatile zziq zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zziq zzg;
    private zziq zzh;
    private boolean zzi;
    private final Object zzj;

    public zziy(zzge zzgeVar) {
        super(zzgeVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzA(zziq zziqVar, zziq zziqVar2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        Bundle bundle2;
        String str;
        long j11;
        long j12;
        zzg();
        boolean z12 = false;
        if (zziqVar2 == null || zziqVar2.zzc != zziqVar.zzc || !zzir.zza(zziqVar2.zzb, zziqVar.zzb) || !zzir.zza(zziqVar2.zza, zziqVar.zza)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && this.zza != null) {
            z12 = true;
        }
        if (z11) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            zzlo.zzK(zziqVar, bundle3, true);
            if (zziqVar2 != null) {
                String str2 = zziqVar2.zza;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = zziqVar2.zzb;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", zziqVar2.zzc);
            }
            if (z12) {
                zzkm zzkmVar = this.zzt.zzu().zzb;
                long j13 = j10 - zzkmVar.zzb;
                zzkmVar.zzb = j10;
                if (j13 > 0) {
                    this.zzt.zzv().zzI(bundle3, j13);
                }
            }
            if (!this.zzt.zzf().zzu()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != zziqVar.zze) {
                str = "auto";
            } else {
                str = "app";
            }
            String str4 = str;
            long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
            if (zziqVar.zze) {
                j11 = currentTimeMillis;
                long j14 = zziqVar.zzf;
                if (j14 != 0) {
                    j12 = j14;
                    this.zzt.zzq().zzH(str4, "_vs", j12, bundle3);
                }
            } else {
                j11 = currentTimeMillis;
            }
            j12 = j11;
            this.zzt.zzq().zzH(str4, "_vs", j12, bundle3);
        }
        if (z12) {
            zzB(this.zza, true, j10);
        }
        this.zza = zziqVar;
        if (zziqVar.zze) {
            this.zzh = zziqVar;
        }
        this.zzt.zzt().zzG(zziqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zziq zziqVar, boolean z10, long j10) {
        boolean z11;
        this.zzt.zzd().zzf(this.zzt.zzax().elapsedRealtime());
        if (zziqVar != null && zziqVar.zzd) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.zzt.zzu().zzb.zzd(z11, z10, j10) && zziqVar != null) {
            zziqVar.zzd = false;
        }
    }

    public static /* bridge */ /* synthetic */ void zzp(zziy zziyVar, Bundle bundle, zziq zziqVar, zziq zziqVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zziyVar.zzA(zziqVar, zziqVar2, j10, true, zziyVar.zzt.zzv().zzu(null, "screen_view", bundle, null, false));
    }

    private final zziq zzy(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zziq zziqVar = (zziq) this.zzd.get(activity);
        if (zziqVar == null) {
            zziq zziqVar2 = new zziq(null, zzl(activity.getClass(), "Activity"), this.zzt.zzv().zzq());
            this.zzd.put(activity, zziqVar2);
            zziqVar = zziqVar2;
        }
        if (this.zzg != null) {
            return this.zzg;
        }
        return zziqVar;
    }

    private final void zzz(Activity activity, zziq zziqVar, boolean z10) {
        zziq zziqVar2;
        zziq zziqVar3;
        String str;
        if (this.zzb == null) {
            zziqVar2 = this.zzc;
        } else {
            zziqVar2 = this.zzb;
        }
        zziq zziqVar4 = zziqVar2;
        if (zziqVar.zzb == null) {
            if (activity != null) {
                str = zzl(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            zziqVar3 = new zziq(zziqVar.zza, str, zziqVar.zzc, zziqVar.zze, zziqVar.zzf);
        } else {
            zziqVar3 = zziqVar;
        }
        this.zzc = this.zzb;
        this.zzb = zziqVar3;
        this.zzt.zzaB().zzp(new zzit(this, zziqVar3, zziqVar4, this.zzt.zzax().elapsedRealtime(), z10));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zziq zzi() {
        return this.zzb;
    }

    public final zziq zzj(boolean z10) {
        zza();
        zzg();
        if (!z10) {
            return this.zza;
        }
        zziq zziqVar = this.zza;
        if (zziqVar != null) {
            return zziqVar;
        }
        return this.zzh;
    }

    @VisibleForTesting
    public final String zzl(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 > 100) {
            this.zzt.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zziq(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.zzt.zzf().zzu()) {
            return;
        }
        this.zzd.remove(activity);
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziv(this, elapsedRealtime));
        } else {
            zziq zzy = zzy(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziw(this, zzy, elapsedRealtime));
        }
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaB().zzp(new zzix(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaB().zzp(new zziu(this));
        } else {
            zzz(activity, zzy(activity), false);
            zzd zzd = this.zzt.zzd();
            zzd.zzt.zzaB().zzp(new zzc(zzd, zzd.zzt.zzax().elapsedRealtime()));
        }
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zziq zziqVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zziqVar = (zziq) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zziqVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zziqVar.zza);
        bundle2.putString("referrer_name", zziqVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzw(@androidx.annotation.NonNull android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzge r0 = r3.zzt
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            boolean r0 = r0.zzu()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzaA()
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.zza(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.zziq r0 = r3.zzb
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzaA()
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.zza(r5)
            return
        L30:
            java.util.Map r1 = r3.zzd
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzaA()
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.zza(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.zzl(r6, r1)
        L54:
            java.lang.String r1 = r0.zzb
            boolean r1 = com.google.android.gms.measurement.internal.zzir.zza(r1, r6)
            java.lang.String r0 = r0.zza
            boolean r0 = com.google.android.gms.measurement.internal.zzir.zza(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzaA()
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.zza(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            int r1 = r5.length()
            com.google.android.gms.measurement.internal.zzge r2 = r3.zzt
            r2.zzf()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzaA()
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzl()
            int r5 = r5.length()
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.zzb(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            int r1 = r6.length()
            com.google.android.gms.measurement.internal.zzge r2 = r3.zzt
            r2.zzf()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzaA()
            com.google.android.gms.measurement.internal.zzes r4 = r4.zzl()
            int r5 = r6.length()
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.zzb(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.zzge r0 = r3.zzt
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzj()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.zzc(r2, r1, r6)
            com.google.android.gms.measurement.internal.zziq r0 = new com.google.android.gms.measurement.internal.zziq
            com.google.android.gms.measurement.internal.zzge r1 = r3.zzt
            com.google.android.gms.measurement.internal.zzlo r1 = r1.zzv()
            long r1 = r1.zzq()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.zzd
            r5.put(r4, r0)
            r5 = 1
            r3.zzz(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziy.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziy.zzx(android.os.Bundle, long):void");
    }
}
