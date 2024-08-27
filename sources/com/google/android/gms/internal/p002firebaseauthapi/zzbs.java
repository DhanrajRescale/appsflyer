package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.e;

/* loaded from: classes2.dex */
final class zzbs {
    private static final Logger zza = Logger.getLogger(zzbs.class.getName());
    private final ConcurrentMap zzb;

    public zzbs() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzbr zzf(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbr) this.zzb.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r6.zzb.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzg(com.google.android.gms.internal.p002firebaseauthapi.zzbr r7, boolean r8) throws java.security.GeneralSecurityException {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.firebase-auth-api.zzbm r0 = r7.zzb()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r0.zze()     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.ConcurrentMap r1 = r6.zzb     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.internal.firebase-auth-api.zzbr r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzbr) r1     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5d
            java.lang.Class r2 = r1.zzc()     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r3 = r7.zzc()     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L22
            goto L5d
        L22:
            java.lang.String r8 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r8 = r8.concat(r0)     // Catch: java.lang.Throwable -> L5b
            java.util.logging.Logger r2 = com.google.android.gms.internal.p002firebaseauthapi.zzbs.zza     // Catch: java.lang.Throwable -> L5b
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r5 = "registerKeyManagerContainer"
            r2.logp(r3, r4, r5, r8)     // Catch: java.lang.Throwable -> L5b
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L5b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r0 = r1.zzc()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5b
            r1 = 1
            r2[r1] = r0     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r7 = r7.zzc()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L5b
            r0 = 2
            r2[r0] = r7     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            throw r8     // Catch: java.lang.Throwable -> L5b
        L5b:
            r7 = move-exception
            goto L6d
        L5d:
            if (r8 != 0) goto L66
            java.util.concurrent.ConcurrentMap r8 = r6.zzb     // Catch: java.lang.Throwable -> L5b
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r6)
            return
        L66:
            java.util.concurrent.ConcurrentMap r8 = r6.zzb     // Catch: java.lang.Throwable -> L5b
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r6)
            return
        L6d:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbs.zzg(com.google.android.gms.internal.firebase-auth-api.zzbr, boolean):void");
    }

    public final zzbm zza(String str, Class cls) throws GeneralSecurityException {
        zzbr zzf = zzf(str);
        if (zzf.zze().contains(cls)) {
            return zzf.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzf.zzc());
        Set<Class> zze = zzf.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : zze) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        StringBuilder l10 = e.l("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        l10.append(sb3);
        throw new GeneralSecurityException(l10.toString());
    }

    public final zzbm zzb(String str) throws GeneralSecurityException {
        return zzf(str).zzb();
    }

    public final synchronized void zzc(zzlm zzlmVar, zzkj zzkjVar) throws GeneralSecurityException {
        Class zzd;
        try {
            if (zzhj.zza(1)) {
                if (zzhj.zza(zzkjVar.zzf())) {
                    String zzd2 = zzlmVar.zzd();
                    String zzd3 = zzkjVar.zzd();
                    if (this.zzb.containsKey(zzd2) && ((zzbr) this.zzb.get(zzd2)).zzd() != null && (zzd = ((zzbr) this.zzb.get(zzd2)).zzd()) != null && !zzd.getName().equals(zzkjVar.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzd2 + " with inconsistent public key type " + zzd3);
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzlmVar.getClass().getName(), zzd.getName(), zzkjVar.getClass().getName()));
                    }
                    zzg(new zzbq(zzlmVar, zzkjVar), true);
                    zzg(new zzbp(zzkjVar), false);
                } else {
                    throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzkjVar.getClass()) + " as it is not FIPS compatible.");
                }
            } else {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzlmVar.getClass()) + " as it is not FIPS compatible.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd(zzkj zzkjVar) throws GeneralSecurityException {
        if (zzhj.zza(zzkjVar.zzf())) {
            zzg(new zzbp(zzkjVar), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzkjVar.getClass()) + " as it is not FIPS compatible.");
        }
    }

    public final boolean zze(String str) {
        return this.zzb.containsKey(str);
    }

    public zzbs(zzbs zzbsVar) {
        this.zzb = new ConcurrentHashMap(zzbsVar.zzb);
    }
}
