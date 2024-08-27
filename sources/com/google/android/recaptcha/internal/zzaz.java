package com.google.android.recaptcha.internal;

import au.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;

/* loaded from: classes2.dex */
final class zzaz extends i implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzba zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzba zzbaVar, String str, zzn zznVar, a aVar) {
        super(2, aVar);
        this.zzc = zzbaVar;
        this.zzd = str;
        this.zze = zznVar;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzaz(this.zzc, this.zzd, this.zze, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaz) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzu;
        zzmh zzy;
        Object zzt;
        zt.a aVar = zt.a.f42823a;
        zzn zznVar = this.zzb;
        try {
        } catch (Exception e10) {
            zzba zzbaVar = this.zzc;
            zzn zznVar2 = this.zze;
            this.zza = null;
            this.zzb = 2;
            zzu = zzbaVar.zzu(e10, "recaptcha.m.Main.rge", zznVar2, zznVar, 0, this);
            if (zzu == aVar) {
                return aVar;
            }
        }
        if (zznVar != 0) {
            if (zznVar != 1) {
                n.b(obj);
                return Unit.f23355a;
            }
            Object obj2 = this.zza;
            n.b(obj);
            zznVar = obj2;
        } else {
            n.b(obj);
            zzn zznVar3 = new zzn();
            zzmp zzg = zzmp.zzg(zzeb.zzh().zzj(this.zzd));
            zzdk zzb = zzdk.zzb();
            zzba zzbaVar2 = this.zzc;
            zzy = zzba.zzy(zzg.zzi(), zzg.zzj());
            zzb.zzf();
            long zza = zzb.zza(TimeUnit.MICROSECONDS);
            zzj zzjVar = zzj.zza;
            zzj.zza(zzl.zzm.zza(), zza);
            zzba zzbaVar3 = this.zzc;
            List zzi = zzy.zzi();
            zzn zznVar4 = this.zze;
            this.zza = zznVar3;
            this.zzb = 1;
            zzt = zzbaVar3.zzt(zzi, zznVar4, zznVar3, this);
            zznVar = zznVar3;
            if (zzt == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
