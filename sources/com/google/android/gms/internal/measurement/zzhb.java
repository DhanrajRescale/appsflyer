package com.google.android.gms.internal.measurement;

import android.os.UserManager;

/* loaded from: classes2.dex */
public final class zzhb {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzhb() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r8) {
        /*
            boolean r0 = zzb()
            r1 = 0
            if (r0 == 0) goto L60
            boolean r0 = com.google.android.gms.internal.measurement.zzhb.zzb
            if (r0 == 0) goto Lc
            goto L60
        Lc:
            java.lang.Class<com.google.android.gms.internal.measurement.zzhb> r0 = com.google.android.gms.internal.measurement.zzhb.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.zzhb.zzb     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L60
        L15:
            r8 = move-exception
            goto L5e
        L17:
            r2 = 1
            r3 = r2
        L19:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L43
            android.os.UserManager r4 = com.google.android.gms.internal.measurement.zzhb.zza     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L2b
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r8.getSystemService(r4)     // Catch: java.lang.Throwable -> L15
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.measurement.zzhb.zza = r4     // Catch: java.lang.Throwable -> L15
        L2b:
            android.os.UserManager r4 = com.google.android.gms.internal.measurement.zzhb.zza     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L31
            r8 = r2
            goto L56
        L31:
            boolean r6 = r4.isUserUnlocked()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r6 != 0) goto L41
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            boolean r8 = r4.isUserRunning(r6)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r8 != 0) goto L43
        L41:
            r8 = r2
            goto L52
        L43:
            r8 = r1
            goto L52
        L45:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.measurement.zzhb.zza = r5     // Catch: java.lang.Throwable -> L15
            int r3 = r3 + 1
            goto L19
        L52:
            if (r8 == 0) goto L56
            com.google.android.gms.internal.measurement.zzhb.zza = r5     // Catch: java.lang.Throwable -> L15
        L56:
            if (r8 == 0) goto L5a
            com.google.android.gms.internal.measurement.zzhb.zzb = r2     // Catch: java.lang.Throwable -> L15
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto L60
            return r2
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r8
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhb.zza(android.content.Context):boolean");
    }

    public static boolean zzb() {
        return true;
    }
}
