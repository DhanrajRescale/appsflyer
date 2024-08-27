package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import pp.g;
import t.j0;

/* loaded from: classes2.dex */
public final class zzace {
    private static final Map zza = new j0();
    private static final Map zzb = new j0();

    @NonNull
    public static String zza(String str) {
        zzacc zzaccVar;
        Map map = zza;
        synchronized (map) {
            zzaccVar = (zzacc) map.get(str);
        }
        if (zzaccVar != null) {
            return zzh(zzaccVar.zzb(), zzaccVar.zza(), zzaccVar.zzb().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    @NonNull
    public static String zzb(String str) {
        zzacc zzaccVar;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzaccVar = (zzacc) map.get(str);
        }
        if (zzaccVar != null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET.concat(zzh(zzaccVar.zzb(), zzaccVar.zza(), zzaccVar.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return str2.concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    @NonNull
    public static String zzc(String str) {
        zzacc zzaccVar;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzaccVar = (zzacc) map.get(str);
        }
        if (zzaccVar != null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET.concat(zzh(zzaccVar.zzb(), zzaccVar.zza(), zzaccVar.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return str2.concat("identitytoolkit.googleapis.com/v2");
    }

    @NonNull
    public static String zzd(String str) {
        zzacc zzaccVar;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzaccVar = (zzacc) map.get(str);
        }
        if (zzaccVar != null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET.concat(zzh(zzaccVar.zzb(), zzaccVar.zza(), zzaccVar.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return str2.concat("securetoken.googleapis.com/v1");
    }

    public static void zze(String str, zzacd zzacdVar) {
        Map map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    ((List) map.get(str)).add(new WeakReference(zzacdVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzacdVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zzf(@NonNull g gVar, @NonNull String str, int i10) {
        gVar.a();
        String str2 = gVar.f31273c.f31280a;
        Map map = zza;
        synchronized (map) {
            map.put(str2, new zzacc(str, i10));
        }
        Map map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator it = ((List) map2.get(str2)).iterator();
                    boolean z10 = false;
                    while (it.hasNext()) {
                        zzacd zzacdVar = (zzacd) ((WeakReference) it.next()).get();
                        if (zzacdVar != null) {
                            zzacdVar.zzi();
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zzg(@NonNull g gVar) {
        Map map = zza;
        gVar.a();
        return map.containsKey(gVar.f31273c.f31280a);
    }

    private static String zzh(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }
}
