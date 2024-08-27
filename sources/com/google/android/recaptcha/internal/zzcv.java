package com.google.android.recaptcha.internal;

import au.c;
import org.jetbrains.annotations.NotNull;
import ut.l;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcv extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzda zzb;
    int zzc;
    zzda zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzda zzdaVar, a aVar) {
        super(aVar);
        this.zzb = zzdaVar;
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf(null, this);
        if (zzf == zt.a.f42823a) {
            return zzf;
        }
        return new l(zzf);
    }
}
