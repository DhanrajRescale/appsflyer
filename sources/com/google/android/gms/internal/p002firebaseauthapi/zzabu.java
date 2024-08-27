package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Map;
import java.util.concurrent.Executor;
import t.j0;
import zp.r;

/* loaded from: classes2.dex */
public final class zzabu {
    private static final Map zza = new j0();

    public static r zza(String str, r rVar, zzabg zzabgVar) {
        zze(str, zzabgVar);
        return new zzabs(rVar, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, r rVar, Activity activity, Executor executor) {
        Map map = zza;
        if (map.containsKey(str)) {
            zzabt zzabtVar = (zzabt) map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzabtVar.zzb < 120000) {
                zzabg zzabgVar = zzabtVar.zza;
                if (zzabgVar != null) {
                    zzabgVar.zzh(rVar, activity, executor, str);
                    return true;
                }
                return true;
            }
            zze(str, null);
            return false;
        }
        zze(str, null);
        return false;
    }

    private static void zze(String str, zzabg zzabgVar) {
        zza.put(str, new zzabt(zzabgVar, DefaultClock.getInstance().currentTimeMillis()));
    }
}
