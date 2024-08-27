package com.google.android.recaptcha;

import au.c;
import org.jetbrains.annotations.NotNull;
import ut.l;
import yt.a;

/* loaded from: classes2.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, a aVar) {
        super(aVar);
        this.zzb = recaptcha;
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m19getClient0E7RQCE = this.zzb.m19getClient0E7RQCE(null, null, this);
        if (m19getClient0E7RQCE == zt.a.f42823a) {
            return m19getClient0E7RQCE;
        }
        return new l(m19getClient0E7RQCE);
    }
}
