package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzcq {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzcq.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzbs());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzcq() {
    }

    public static zzbm zza(String str) throws GeneralSecurityException {
        return ((zzbs) zzc.get()).zzb(str);
    }

    public static synchronized zzsp zzb(zzsu zzsuVar) throws GeneralSecurityException {
        zzsp zza2;
        synchronized (zzcq.class) {
            zzbm zza3 = zza(zzsuVar.zzf());
            if (((Boolean) zze.get(zzsuVar.zzf())).booleanValue()) {
                zza2 = zza3.zza(zzsuVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzsuVar.zzf())));
            }
        }
        return zza2;
    }

    public static synchronized zzahp zzc(zzsu zzsuVar) throws GeneralSecurityException {
        zzahp zzb2;
        synchronized (zzcq.class) {
            zzbm zza2 = zza(zzsuVar.zzf());
            if (((Boolean) zze.get(zzsuVar.zzf())).booleanValue()) {
                zzb2 = zza2.zzb(zzsuVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzsuVar.zzf())));
            }
        }
        return zzb2;
    }

    public static Class zzd(Class cls) {
        try {
            return zzks.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zze(String str, zzaff zzaffVar, Class cls) throws GeneralSecurityException {
        return ((zzbs) zzc.get()).zza(str, cls).zzc(zzaffVar);
    }

    public static Object zzf(String str, zzahp zzahpVar, Class cls) throws GeneralSecurityException {
        return ((zzbs) zzc.get()).zza(str, cls).zzd(zzahpVar);
    }

    public static synchronized Map zzg() {
        Map unmodifiableMap;
        synchronized (zzcq.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzh(zzlm zzlmVar, zzkj zzkjVar, boolean z10) throws GeneralSecurityException {
        synchronized (zzcq.class) {
            try {
                AtomicReference atomicReference = zzc;
                zzbs zzbsVar = new zzbs((zzbs) atomicReference.get());
                zzbsVar.zzc(zzlmVar, zzkjVar);
                Map zzc2 = zzlmVar.zza().zzc();
                String zzd2 = zzlmVar.zzd();
                zzk(zzd2, zzc2, true);
                String zzd3 = zzkjVar.zzd();
                zzk(zzd3, Collections.emptyMap(), false);
                if (!((zzbs) atomicReference.get()).zze(zzd2)) {
                    zzd.put(zzd2, new zzcp(zzlmVar));
                    zzl(zzlmVar.zzd(), zzlmVar.zza().zzc());
                }
                ConcurrentMap concurrentMap = zze;
                concurrentMap.put(zzd2, Boolean.TRUE);
                concurrentMap.put(zzd3, Boolean.FALSE);
                atomicReference.set(zzbsVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void zzi(zzkj zzkjVar, boolean z10) throws GeneralSecurityException {
        synchronized (zzcq.class) {
            try {
                AtomicReference atomicReference = zzc;
                zzbs zzbsVar = new zzbs((zzbs) atomicReference.get());
                zzbsVar.zzd(zzkjVar);
                Map zzc2 = zzkjVar.zza().zzc();
                String zzd2 = zzkjVar.zzd();
                zzk(zzd2, zzc2, true);
                if (!((zzbs) atomicReference.get()).zze(zzd2)) {
                    zzd.put(zzd2, new zzcp(zzkjVar));
                    zzl(zzd2, zzkjVar.zza().zzc());
                }
                zze.put(zzd2, Boolean.TRUE);
                atomicReference.set(zzbsVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void zzj(zzcm zzcmVar) throws GeneralSecurityException {
        synchronized (zzcq.class) {
            zzks.zza().zzf(zzcmVar);
        }
    }

    private static synchronized void zzk(String str, Map map, boolean z10) throws GeneralSecurityException {
        synchronized (zzcq.class) {
            if (z10) {
                try {
                    ConcurrentMap concurrentMap = zze;
                    if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                    if (((zzbs) zzc.get()).zze(str)) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!zzg.containsKey(entry.getKey())) {
                                throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                            }
                        }
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (zzg.containsKey(entry2.getKey())) {
                                throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.firebase-auth-api.zzahp, java.lang.Object] */
    private static void zzl(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzbu.zze(str, ((zzkh) entry.getValue()).zza.zzq(), ((zzkh) entry.getValue()).zzb));
        }
    }
}
