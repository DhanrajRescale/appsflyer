package com.google.android.recaptcha.internal;

import au.i;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;

/* loaded from: classes2.dex */
final class zzam extends i implements Function2 {
    final /* synthetic */ zzao zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzao zzaoVar, a aVar) {
        super(2, aVar);
        this.zza = zzaoVar;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzam(this.zza, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        zzad zzadVar;
        Timer timer;
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        zzao zzaoVar = this.zza;
        synchronized (zzaj.class) {
            try {
                zzadVar = zzaoVar.zze;
                if (zzadVar.zzb() == 0) {
                    timer = zzao.zzb;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzao.zzb = null;
                }
                zzaoVar.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.f23355a;
    }
}
