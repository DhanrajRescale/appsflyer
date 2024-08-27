package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzah {

    @NotNull
    public static final zzag zza = new zzag(null);
    private static zzkj zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final zzs zzd;

    @NotNull
    private final zzku zze;
    private final long zzf;

    public zzah(@NotNull zzaf zzafVar, @NotNull String str, @NotNull zzs zzsVar) {
        this.zzc = str;
        this.zzd = zzsVar;
        zzku zzi = zzkx.zzi();
        this.zze = zzi;
        this.zzf = System.currentTimeMillis();
        zzi.zzq(zzafVar.zza());
        zzi.zze(zzafVar.zzb());
        zzi.zzs(zzafVar.zzc());
        zzi.zzv(zzafVar.zzd());
        zzi.zzu(zzka.zzc(zzka.zzb(System.currentTimeMillis())));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0023
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private static final com.google.android.recaptcha.internal.zzkj zzd(android.content.Context r7) {
        /*
            java.lang.String r0 = "unknown"
            r1 = 33
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r3 = "com.google.android.gms.version"
            r4 = -1
            if (r2 < r1) goto L2a
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r5 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.PackageManager$ApplicationInfoFlags r6 = androidx.activity.n.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ApplicationInfo r2 = androidx.activity.n.a(r2, r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r2 != r4) goto L25
        L23:
            r2 = r0
            goto L45
        L25:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L45
        L2a:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r5 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r2 != r4) goto L41
            goto L23
        L41:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
        L45:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            if (r3 < r1) goto L62
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            android.content.pm.PackageManager$PackageInfoFlags r3 = androidx.activity.n.e()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            android.content.pm.PackageInfo r7 = androidx.activity.n.b(r1, r7, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            long r3 = b4.g.c(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            goto L8e
        L62:
            r1 = 28
            r4 = 0
            if (r3 < r1) goto L7c
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            long r3 = b4.g.c(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            goto L8e
        L7c:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            int r7 = r7.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
        L8e:
            com.google.android.recaptcha.internal.zzki r7 = com.google.android.recaptcha.internal.zzkj.zzf()
            int r1 = android.os.Build.VERSION.SDK_INT
            r7.zzd(r1)
            r7.zzq(r2)
            java.lang.String r1 = "18.1.2"
            r7.zzs(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r7.zzp(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r7.zzr(r1)
            r7.zze(r0)
            com.google.android.recaptcha.internal.zzgo r7 = r7.zzj()
            com.google.android.recaptcha.internal.zzkj r7 = (com.google.android.recaptcha.internal.zzkj) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzah.zzd(android.content.Context):com.google.android.recaptcha.internal.zzkj");
    }

    public final long zza() {
        return this.zzf;
    }

    @NotNull
    public final zzku zzb() {
        return this.zze;
    }

    @NotNull
    public final zzkx zzc(@NotNull int i10, zzkm zzkmVar, @NotNull Context context) {
        zzku zzkuVar = this.zze;
        zzkuVar.zzp(System.currentTimeMillis() - this.zzf);
        zzkuVar.zzw(i10);
        if (zzkmVar != null) {
            this.zze.zzr(zzkmVar);
        }
        if (zzb == null) {
            zzb = zzd(context);
        }
        zzku zzkuVar2 = this.zze;
        zzli zzf = zzlj.zzf();
        zzf.zzq(this.zzc);
        zzkj zzkjVar = zzb;
        if (zzkjVar == null) {
            zzkjVar = zzd(context);
        }
        zzf.zzd(zzkjVar);
        zzf.zzp(Locale.getDefault().getISO3Language());
        zzf.zze(Locale.getDefault().getISO3Country());
        zzkuVar2.zzt((zzlj) zzf.zzj());
        return (zzkx) this.zze.zzj();
    }
}
