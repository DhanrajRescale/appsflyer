package com.google.android.recaptcha.internal;

import au.i;
import hl.f;
import iu.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzay extends i implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzn zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzba zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(Exception exc, int i10, zzn zznVar, zzn zznVar2, String str, zzba zzbaVar, a aVar) {
        super(2, aVar);
        this.zza = exc;
        this.zzb = i10;
        this.zzc = zznVar;
        this.zzd = zznVar2;
        this.zze = str;
        this.zzf = zzbaVar;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        zzay zzayVar = new zzay(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, aVar);
        zzayVar.zzg = obj;
        return zzayVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        zzmi zzf;
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        f0 f0Var = (f0) this.zzg;
        Exception exc = this.zza;
        if (exc instanceof zzt) {
            zzf = ((zzt) exc).zza();
            zzf.zzd(this.zzb);
        } else {
            zzf = zzmj.zzf();
            zzf.zzd(this.zzb);
            zzf.zzp(2);
            zzf.zze(2);
        }
        zzmj zzmjVar = (zzmj) zzf.zzj();
        zzmjVar.zzk();
        zzmjVar.zzj();
        a0.a(this.zza.getClass()).b();
        this.zza.getMessage();
        zzlg zza = zzar.zza(this.zzc, this.zzd);
        String str = this.zze;
        if (str.length() == 0) {
            str = "recaptcha.m.Main.rge";
        }
        if (f.u0(f0Var)) {
            zzba zzbaVar = this.zzf;
            zzeb zzh = zzeb.zzh();
            byte[] zzd = zzmjVar.zzd();
            String zzi = zzh.zzi(zzd, 0, zzd.length);
            zzeb zzh2 = zzeb.zzh();
            byte[] zzd2 = zza.zzd();
            zzbaVar.zzv(str, zzi, zzh2.zzi(zzd2, 0, zzd2.length));
        }
        return Unit.f23355a;
    }
}
