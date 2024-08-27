package com.google.android.recaptcha;

import android.app.Application;
import au.i;
import com.google.android.recaptcha.internal.zzaa;
import com.google.android.recaptcha.internal.zzw;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;

/* loaded from: classes2.dex */
public final class Recaptcha$getTasksClient$1 extends i implements Function2<f0, a<? super zzaa>, Object> {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getTasksClient$1(Application application, String str, a aVar) {
        super(2, aVar);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new Recaptcha$getTasksClient$1(this.zzb, this.zzc, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Recaptcha$getTasksClient$1) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.zza;
        n.b(obj);
        if (i10 == 0) {
            zzw zzwVar = zzaa.zza;
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzw.zzb(zzwVar, application, str, null, null, this, 12, null);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
