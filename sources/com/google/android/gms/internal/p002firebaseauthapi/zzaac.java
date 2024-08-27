package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import aq.e0;
import aq.g0;
import aq.h0;
import aq.y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kp.j;
import pp.g;
import zp.b;
import zp.b0;
import zp.d;
import zp.f;
import zp.h;
import zp.o;
import zp.r;
import zp.s;
import zp.t;
import zp.x;

/* loaded from: classes2.dex */
public final class zzaac extends zzabj {
    public zzaac(g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaaf(gVar, scheduledExecutorService);
        this.zzb = executor;
    }

    @NonNull
    public static g0 zzQ(g gVar, zzacv zzacvVar) {
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(zzacvVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e0(zzacvVar));
        List zzr = zzacvVar.zzr();
        if (zzr != null && !zzr.isEmpty()) {
            for (int i10 = 0; i10 < zzr.size(); i10++) {
                arrayList.add(new e0((zzadj) zzr.get(i10)));
            }
        }
        g0 g0Var = new g0(gVar, arrayList);
        g0Var.f2724i = new h0(zzacvVar.zzb(), zzacvVar.zza());
        g0Var.f2725j = zzacvVar.zzt();
        g0Var.f2726k = zzacvVar.zzd();
        g0Var.X(j.i0(zzacvVar.zzq()));
        return g0Var;
    }

    public final Task zzA(g gVar, y yVar, String str) {
        zzzk zzzkVar = new zzzk(str);
        zzzkVar.zzf(gVar);
        zzzkVar.zzd(yVar);
        return zzS(zzzkVar);
    }

    public final Task zzB(g gVar, d dVar, String str, y yVar) {
        zzzl zzzlVar = new zzzl(dVar, str);
        zzzlVar.zzf(gVar);
        zzzlVar.zzd(yVar);
        return zzS(zzzlVar);
    }

    public final Task zzC(g gVar, String str, String str2, y yVar) {
        zzzm zzzmVar = new zzzm(str, str2);
        zzzmVar.zzf(gVar);
        zzzmVar.zzd(yVar);
        return zzS(zzzmVar);
    }

    public final Task zzD(g gVar, String str, String str2, String str3, String str4, y yVar) {
        zzzn zzznVar = new zzzn(str, str2, str3, str4);
        zzznVar.zzf(gVar);
        zzznVar.zzd(yVar);
        return zzS(zzznVar);
    }

    public final Task zzE(g gVar, f fVar, String str, y yVar) {
        zzzo zzzoVar = new zzzo(fVar, str);
        zzzoVar.zzf(gVar);
        zzzoVar.zzd(yVar);
        return zzS(zzzoVar);
    }

    public final Task zzF(g gVar, o oVar, String str, y yVar) {
        zzabu.zzc();
        zzzp zzzpVar = new zzzp(oVar, str);
        zzzpVar.zzf(gVar);
        zzzpVar.zzd(yVar);
        return zzS(zzzpVar);
    }

    public final Task zzG(aq.d dVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, r rVar, Executor executor, Activity activity) {
        zzzq zzzqVar = new zzzq(dVar, str, str2, j10, z10, z11, str3, str4, z12);
        zzzqVar.zzh(rVar, activity, executor, str);
        return zzS(zzzqVar);
    }

    public final Task zzH(aq.d dVar, t tVar, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, r rVar, Executor executor, Activity activity) {
        zzzr zzzrVar = new zzzr(tVar, Preconditions.checkNotEmpty(dVar.f2694b), str, j10, z10, z11, str2, str3, z12);
        zzzrVar.zzh(rVar, activity, executor, tVar.f42779a);
        return zzS(zzzrVar);
    }

    public final Task zzI(g gVar, h hVar, String str, String str2, aq.t tVar) {
        zzzs zzzsVar = new zzzs(((g0) hVar).f2716a.zzh(), str, str2);
        zzzsVar.zzf(gVar);
        zzzsVar.zzg(hVar);
        zzzsVar.zzd(tVar);
        zzzsVar.zze(tVar);
        return zzS(zzzsVar);
    }

    public final Task zzJ(g gVar, h hVar, String str, aq.t tVar) {
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(hVar);
        Preconditions.checkNotNull(tVar);
        List list = ((g0) hVar).f2721f;
        if ((list != null && !list.contains(str)) || hVar.R()) {
            return Tasks.forException(zzaag.zza(new Status(17016, str)));
        }
        if (str.hashCode() == 1216985755 && str.equals("password")) {
            zzzt zzztVar = new zzzt();
            zzztVar.zzf(gVar);
            zzztVar.zzg(hVar);
            zzztVar.zzd(tVar);
            zzztVar.zze(tVar);
            return zzS(zzztVar);
        }
        zzzu zzzuVar = new zzzu(str);
        zzzuVar.zzf(gVar);
        zzzuVar.zzg(hVar);
        zzzuVar.zzd(tVar);
        zzzuVar.zze(tVar);
        return zzS(zzzuVar);
    }

    public final Task zzK(g gVar, h hVar, String str, aq.t tVar) {
        zzzv zzzvVar = new zzzv(str);
        zzzvVar.zzf(gVar);
        zzzvVar.zzg(hVar);
        zzzvVar.zzd(tVar);
        zzzvVar.zze(tVar);
        return zzS(zzzvVar);
    }

    public final Task zzL(g gVar, h hVar, String str, aq.t tVar) {
        zzzw zzzwVar = new zzzw(str);
        zzzwVar.zzf(gVar);
        zzzwVar.zzg(hVar);
        zzzwVar.zzd(tVar);
        zzzwVar.zze(tVar);
        return zzS(zzzwVar);
    }

    public final Task zzM(g gVar, h hVar, o oVar, aq.t tVar) {
        zzabu.zzc();
        zzzx zzzxVar = new zzzx(oVar);
        zzzxVar.zzf(gVar);
        zzzxVar.zzg(hVar);
        zzzxVar.zzd(tVar);
        zzzxVar.zze(tVar);
        return zzS(zzzxVar);
    }

    public final Task zzN(g gVar, h hVar, x xVar, aq.t tVar) {
        zzzy zzzyVar = new zzzy(xVar);
        zzzyVar.zzf(gVar);
        zzzyVar.zzg(hVar);
        zzzyVar.zzd(tVar);
        zzzyVar.zze(tVar);
        return zzS(zzzyVar);
    }

    public final Task zzO(String str, String str2, b bVar) {
        bVar.f42720i = 7;
        return zzS(new zzzz(str, str2, bVar));
    }

    public final Task zzP(g gVar, String str, String str2) {
        zzaaa zzaaaVar = new zzaaa(str, str2);
        zzaaaVar.zzf(gVar);
        return zzS(zzaaaVar);
    }

    public final void zzR(g gVar, zzado zzadoVar, r rVar, Activity activity, Executor executor) {
        zzaab zzaabVar = new zzaab(zzadoVar);
        zzaabVar.zzf(gVar);
        zzaabVar.zzh(rVar, activity, executor, zzadoVar.zzd());
        zzS(zzaabVar);
    }

    public final Task zza(g gVar, String str, String str2) {
        zzyj zzyjVar = new zzyj(str, str2);
        zzyjVar.zzf(gVar);
        return zzS(zzyjVar);
    }

    public final Task zzb(g gVar, String str, String str2) {
        zzyk zzykVar = new zzyk(str, str2);
        zzykVar.zzf(gVar);
        return zzS(zzykVar);
    }

    public final Task zzc(g gVar, String str, String str2, String str3) {
        zzyl zzylVar = new zzyl(str, str2, str3);
        zzylVar.zzf(gVar);
        return zzS(zzylVar);
    }

    public final Task zzd(g gVar, String str, String str2, String str3, String str4, y yVar) {
        zzym zzymVar = new zzym(str, str2, str3, str4);
        zzymVar.zzf(gVar);
        zzymVar.zzd(yVar);
        return zzS(zzymVar);
    }

    @NonNull
    public final Task zze(h hVar, aq.g gVar) {
        zzyn zzynVar = new zzyn();
        zzynVar.zzg(hVar);
        zzynVar.zzd(gVar);
        zzynVar.zze(gVar);
        return zzS(zzynVar);
    }

    public final Task zzf(g gVar, String str, String str2) {
        zzyo zzyoVar = new zzyo(str, str2);
        zzyoVar.zzf(gVar);
        return zzS(zzyoVar);
    }

    public final Task zzg(g gVar, s sVar, h hVar, String str, y yVar) {
        zzabu.zzc();
        zzyp zzypVar = new zzyp(sVar, ((g0) hVar).f2716a.zzh(), str, null);
        zzypVar.zzf(gVar);
        zzypVar.zzd(yVar);
        return zzS(zzypVar);
    }

    public final Task zzh(g gVar, h hVar, s sVar, String str, y yVar) {
        zzabu.zzc();
        zzyq zzyqVar = new zzyq(sVar, str, null);
        zzyqVar.zzf(gVar);
        zzyqVar.zzd(yVar);
        if (hVar != null) {
            zzyqVar.zzg(hVar);
        }
        return zzS(zzyqVar);
    }

    public final Task zzi(g gVar, h hVar, b0 b0Var, String str, y yVar, String str2) {
        zzyq zzyqVar = new zzyq(b0Var, str, str2);
        zzyqVar.zzf(gVar);
        zzyqVar.zzd(yVar);
        if (hVar != null) {
            zzyqVar.zzg(hVar);
        }
        return zzS(zzyqVar);
    }

    public final Task zzj(g gVar, h hVar, String str, aq.t tVar) {
        zzyr zzyrVar = new zzyr(str);
        zzyrVar.zzf(gVar);
        zzyrVar.zzg(hVar);
        zzyrVar.zzd(tVar);
        zzyrVar.zze(tVar);
        return zzS(zzyrVar);
    }

    public final Task zzk() {
        return zzS(new zzys());
    }

    public final Task zzl(String str, String str2) {
        return zzS(new zzyt(str, "RECAPTCHA_ENTERPRISE"));
    }

    public final Task zzm(g gVar, h hVar, d dVar, aq.t tVar) {
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(hVar);
        Preconditions.checkNotNull(tVar);
        List list = ((g0) hVar).f2721f;
        if (list != null && list.contains(dVar.J())) {
            return Tasks.forException(zzaag.zza(new Status(17015)));
        }
        if (dVar instanceof f) {
            f fVar = (f) dVar;
            if (!(!TextUtils.isEmpty(fVar.f42742c))) {
                zzyu zzyuVar = new zzyu(fVar);
                zzyuVar.zzf(gVar);
                zzyuVar.zzg(hVar);
                zzyuVar.zzd(tVar);
                zzyuVar.zze(tVar);
                return zzS(zzyuVar);
            }
            zzyx zzyxVar = new zzyx(fVar);
            zzyxVar.zzf(gVar);
            zzyxVar.zzg(hVar);
            zzyxVar.zzd(tVar);
            zzyxVar.zze(tVar);
            return zzS(zzyxVar);
        }
        if (dVar instanceof o) {
            zzabu.zzc();
            zzyw zzywVar = new zzyw((o) dVar);
            zzywVar.zzf(gVar);
            zzywVar.zzg(hVar);
            zzywVar.zzd(tVar);
            zzywVar.zze(tVar);
            return zzS(zzywVar);
        }
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(hVar);
        Preconditions.checkNotNull(tVar);
        zzyv zzyvVar = new zzyv(dVar);
        zzyvVar.zzf(gVar);
        zzyvVar.zzg(hVar);
        zzyvVar.zzd(tVar);
        zzyvVar.zze(tVar);
        return zzS(zzyvVar);
    }

    public final Task zzn(g gVar, h hVar, d dVar, String str, aq.t tVar) {
        zzyy zzyyVar = new zzyy(dVar, str);
        zzyyVar.zzf(gVar);
        zzyyVar.zzg(hVar);
        zzyyVar.zzd(tVar);
        zzyyVar.zze(tVar);
        return zzS(zzyyVar);
    }

    public final Task zzo(g gVar, h hVar, d dVar, String str, aq.t tVar) {
        zzyz zzyzVar = new zzyz(dVar, str);
        zzyzVar.zzf(gVar);
        zzyzVar.zzg(hVar);
        zzyzVar.zzd(tVar);
        zzyzVar.zze(tVar);
        return zzS(zzyzVar);
    }

    public final Task zzp(g gVar, h hVar, f fVar, String str, aq.t tVar) {
        zzza zzzaVar = new zzza(fVar, str);
        zzzaVar.zzf(gVar);
        zzzaVar.zzg(hVar);
        zzzaVar.zzd(tVar);
        zzzaVar.zze(tVar);
        return zzS(zzzaVar);
    }

    public final Task zzq(g gVar, h hVar, f fVar, String str, aq.t tVar) {
        zzzb zzzbVar = new zzzb(fVar, str);
        zzzbVar.zzf(gVar);
        zzzbVar.zzg(hVar);
        zzzbVar.zzd(tVar);
        zzzbVar.zze(tVar);
        return zzS(zzzbVar);
    }

    public final Task zzr(g gVar, h hVar, String str, String str2, String str3, String str4, aq.t tVar) {
        zzzc zzzcVar = new zzzc(str, str2, str3, str4);
        zzzcVar.zzf(gVar);
        zzzcVar.zzg(hVar);
        zzzcVar.zzd(tVar);
        zzzcVar.zze(tVar);
        return zzS(zzzcVar);
    }

    public final Task zzs(g gVar, h hVar, String str, String str2, String str3, String str4, aq.t tVar) {
        zzzd zzzdVar = new zzzd(str, str2, str3, str4);
        zzzdVar.zzf(gVar);
        zzzdVar.zzg(hVar);
        zzzdVar.zzd(tVar);
        zzzdVar.zze(tVar);
        return zzS(zzzdVar);
    }

    public final Task zzt(g gVar, h hVar, o oVar, String str, aq.t tVar) {
        zzabu.zzc();
        zzze zzzeVar = new zzze(oVar, str);
        zzzeVar.zzf(gVar);
        zzzeVar.zzg(hVar);
        zzzeVar.zzd(tVar);
        zzzeVar.zze(tVar);
        return zzS(zzzeVar);
    }

    public final Task zzu(g gVar, h hVar, o oVar, String str, aq.t tVar) {
        zzabu.zzc();
        zzzf zzzfVar = new zzzf(oVar, str);
        zzzfVar.zzf(gVar);
        zzzfVar.zzg(hVar);
        zzzfVar.zzd(tVar);
        zzzfVar.zze(tVar);
        return zzS(zzzfVar);
    }

    @NonNull
    public final Task zzv(g gVar, h hVar, aq.t tVar) {
        zzzg zzzgVar = new zzzg();
        zzzgVar.zzf(gVar);
        zzzgVar.zzg(hVar);
        zzzgVar.zzd(tVar);
        zzzgVar.zze(tVar);
        return zzS(zzzgVar);
    }

    public final Task zzw(g gVar, b bVar, String str) {
        zzzh zzzhVar = new zzzh(str, bVar);
        zzzhVar.zzf(gVar);
        return zzS(zzzhVar);
    }

    public final Task zzx(g gVar, String str, b bVar, String str2, String str3) {
        bVar.f42720i = 1;
        zzzi zzziVar = new zzzi(str, bVar, str2, str3, "sendPasswordResetEmail");
        zzziVar.zzf(gVar);
        return zzS(zzziVar);
    }

    public final Task zzy(g gVar, String str, b bVar, String str2, String str3) {
        bVar.f42720i = 6;
        zzzi zzziVar = new zzzi(str, bVar, str2, str3, "sendSignInLinkToEmail");
        zzziVar.zzf(gVar);
        return zzS(zzziVar);
    }

    @NonNull
    public final Task zzz(String str) {
        return zzS(new zzzj(str));
    }
}
