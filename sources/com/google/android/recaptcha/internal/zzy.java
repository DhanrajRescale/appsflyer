package com.google.android.recaptcha.internal;

import au.i;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.l;
import ut.n;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzy extends i implements Function2 {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ RecaptchaAction zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzaa zzaaVar, RecaptchaAction recaptchaAction, a aVar) {
        super(2, aVar);
        this.zzb = zzaaVar;
        this.zzc = recaptchaAction;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzy(this.zzb, this.zzc, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzf;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.zza;
        n.b(obj);
        if (i10 != 0) {
            zzf = ((l) obj).f37395a;
        } else {
            zzda zzb = this.zzb.zzb();
            RecaptchaAction recaptchaAction = this.zzc;
            this.zza = 1;
            zzf = zzb.zzf(recaptchaAction, this);
            if (zzf == aVar) {
                return aVar;
            }
        }
        return new l(zzf);
    }
}
