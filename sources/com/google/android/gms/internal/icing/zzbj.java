package com.google.android.gms.internal.icing;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import t.j0;

/* loaded from: classes2.dex */
public final class zzbj {
    private static final Map<String, zzbj> zza = new j0();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static synchronized void zza() {
        synchronized (zzbj.class) {
            Map<String, zzbj> map = zza;
            Iterator<zzbj> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().zzb;
                throw null;
            }
        }
    }
}
