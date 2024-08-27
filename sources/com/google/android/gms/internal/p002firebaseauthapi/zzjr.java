package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzjr {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb = new Object();
    private static final String zzc = "zzjr";
    private final zzca zzd;
    private final zzbd zze;
    private final zzbz zzf;

    public /* synthetic */ zzjr(zzjp zzjpVar, zzjq zzjqVar) {
        Context context;
        String str;
        String str2;
        zzbd zzbdVar;
        zzbz zzbzVar;
        context = zzjpVar.zza;
        str = zzjpVar.zzb;
        str2 = zzjpVar.zzc;
        this.zzd = new zzju(context, str, str2);
        zzbdVar = zzjpVar.zze;
        this.zze = zzbdVar;
        zzbzVar = zzjpVar.zzg;
        this.zzf = zzbzVar;
    }

    public static /* bridge */ /* synthetic */ Object zzb() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String zzc() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzby zza() throws GeneralSecurityException {
        return this.zzf.zzb();
    }
}
