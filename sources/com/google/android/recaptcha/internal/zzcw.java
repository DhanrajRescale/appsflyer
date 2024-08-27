package com.google.android.recaptcha.internal;

import android.content.Context;
import au.i;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;
import zt.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcw extends i implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzda zzf;
    final /* synthetic */ String zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(RecaptchaAction recaptchaAction, zzda zzdaVar, String str, a aVar) {
        super(2, aVar);
        this.zze = recaptchaAction;
        this.zzf = zzdaVar;
        this.zzg = str;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzcw(this.zze, this.zzf, this.zzg, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Map map;
        String str;
        String str2;
        Context context;
        zzr zzrVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.zzd;
        n.b(obj);
        if (i10 == 0) {
            zzda zzdaVar = this.zzf;
            String str3 = this.zzg;
            RecaptchaAction recaptchaAction = this.zze;
            this.zza = zzdaVar;
            this.zzb = str3;
            this.zzc = recaptchaAction;
            this.zzd = 1;
            qu.i iVar = new qu.i(1, f.b(this));
            iVar.s();
            map = zzdaVar.zzk;
            map.put(str3, iVar);
            zzma zzf = zzmb.zzf();
            zzf.zze(str3);
            zzf.zzd(recaptchaAction.getAction());
            byte[] zzd = ((zzmb) zzf.zzj()).zzd();
            String zzi = zzeb.zzh().zzi(zzd, 0, zzd.length);
            zzai zzaiVar = zzai.zza;
            zzkw zzkwVar = zzkw.EXECUTE_NATIVE;
            str = zzdaVar.zzg;
            str2 = zzdaVar.zzh;
            zzaf zzafVar = new zzaf(zzkwVar, str, str2, str3, null);
            context = zzdaVar.zze;
            zzrVar = zzdaVar.zzf;
            zzai.zzc(zzafVar, context, zzrVar);
            zzdaVar.zzb().evaluateJavascript("recaptcha.m.Main.execute(\"" + zzi + "\")", null);
            obj = iVar.p();
            if (obj == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
