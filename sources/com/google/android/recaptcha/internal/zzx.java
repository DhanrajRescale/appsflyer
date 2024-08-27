package com.google.android.recaptcha.internal;

import au.c;
import org.jetbrains.annotations.NotNull;
import ut.l;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzx extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaa zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaaVar, a aVar) {
        super(aVar);
        this.zzb = zzaaVar;
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo20executegIAlus = this.zzb.mo20executegIAlus(null, this);
        if (mo20executegIAlus == zt.a.f42823a) {
            return mo20executegIAlus;
        }
        return new l(mo20executegIAlus);
    }
}
