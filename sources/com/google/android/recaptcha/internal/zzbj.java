package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.g0;

/* loaded from: classes2.dex */
public final class zzbj {

    @NotNull
    public static final zzbj zza = new zzbj();
    private static Set zzb;
    private static Set zzc;
    private static Long zzd;
    private static int zze;

    private zzbj() {
    }

    public static final void zza(@NotNull zzlr zzlrVar) {
        zzb = g0.V(zzlrVar.zzf().zzi());
        zzc = g0.V(zzlrVar.zzg().zzi());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object zzb(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull android.content.Context r25, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzr r26, @org.jetbrains.annotations.NotNull yt.a r27) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbj.zzb(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context, com.google.android.recaptcha.internal.zzr, yt.a):java.lang.Object");
    }

    public static final boolean zzc(@NotNull String str) {
        Set set = zzb;
        if (set != null && zzc != null) {
            if (set.isEmpty()) {
                return true;
            }
            Set set2 = zzc;
            Intrinsics.d(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            if (zzd(str, set2)) {
                return false;
            }
            return zzd(str, set);
        }
        if (zzd == null) {
            zzd = Long.valueOf(System.currentTimeMillis());
        }
        zze++;
        return true;
    }

    private static final boolean zzd(String str, Set set) {
        Iterator it = w.O(str, new char[]{'.'}).iterator();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (it.hasNext()) {
            String concat = str2.concat(String.valueOf((String) it.next()));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }
}
