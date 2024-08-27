package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import lp.g0;
import zp.b;
import zp.d0;
import zp.f;
import zp.x;

/* loaded from: classes2.dex */
public final class zzyh {
    private final zzabm zza;

    public zzyh(zzabm zzabmVar) {
        this.zza = (zzabm) Preconditions.checkNotNull(zzabmVar);
    }

    private final void zzO(String str, zzabl zzablVar) {
        Preconditions.checkNotNull(zzablVar);
        Preconditions.checkNotEmpty(str);
        zzade zzd = zzade.zzd(str);
        if (zzd.zzj()) {
            zzablVar.zzb(zzd);
        } else {
            this.zza.zzd(new zzacs(zzd.zzf()), new zzyg(this, zzablVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(zzacl zzaclVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzaclVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzc(zzaclVar, new zzwr(this, zzaaeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(zzade zzadeVar, String str, String str2, Boolean bool, d0 d0Var, zzaae zzaaeVar, zzabk zzabkVar) {
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(zzabkVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zze(new zzact(zzadeVar.zze()), new zzwu(this, zzabkVar, str2, str, bool, d0Var, zzaaeVar, zzadeVar));
    }

    private final void zzR(zzacx zzacxVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzacxVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzf(zzacxVar, new zzxz(this, zzaaeVar));
    }

    public static /* bridge */ /* synthetic */ void zzd(zzyh zzyhVar, zzaee zzaeeVar, zzaae zzaaeVar, zzabk zzabkVar) {
        Status p10;
        if (zzaeeVar.zzp()) {
            d0 zzc = zzaeeVar.zzc();
            String zzd = zzaeeVar.zzd();
            String zzk = zzaeeVar.zzk();
            if (zzaeeVar.zzn()) {
                p10 = new Status(17012);
            } else {
                p10 = g0.p(zzaeeVar.zze());
            }
            zzaaeVar.zze(new zzwm(p10, zzc, zzd, zzk));
            return;
        }
        zzyhVar.zzQ(new zzade(zzaeeVar.zzj(), zzaeeVar.zzf(), Long.valueOf(zzaeeVar.zzb()), "Bearer"), zzaeeVar.zzi(), zzaeeVar.zzh(), Boolean.valueOf(zzaeeVar.zzo()), zzaeeVar.zzc(), zzaaeVar, zzabkVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzyh zzyhVar, zzaae zzaaeVar, zzade zzadeVar, zzadq zzadqVar, zzabk zzabkVar) {
        Preconditions.checkNotNull(zzaaeVar);
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(zzadqVar);
        Preconditions.checkNotNull(zzabkVar);
        zzyhVar.zza.zze(new zzact(zzadeVar.zze()), new zzws(zzyhVar, zzabkVar, zzaaeVar, zzadeVar, zzadqVar));
    }

    public static /* bridge */ /* synthetic */ void zzf(zzyh zzyhVar, zzaae zzaaeVar, zzade zzadeVar, zzacv zzacvVar, zzadq zzadqVar, zzabk zzabkVar) {
        Preconditions.checkNotNull(zzaaeVar);
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(zzacvVar);
        Preconditions.checkNotNull(zzadqVar);
        Preconditions.checkNotNull(zzabkVar);
        zzyhVar.zza.zzl(zzadqVar, new zzwt(zzyhVar, zzadqVar, zzacvVar, zzaaeVar, zzadeVar, zzabkVar));
    }

    public final void zzA(zzaec zzaecVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzaecVar);
        Preconditions.checkNotNull(zzaaeVar);
        zzaecVar.zzd(true);
        this.zza.zzp(zzaecVar, new zzya(this, zzaaeVar));
    }

    public final void zzB(zzaef zzaefVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzaefVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzq(zzaefVar, new zzxn(this, zzaaeVar));
    }

    public final void zzC(String str, String str2, String str3, String str4, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzr(new zzaeh(str, str2, str3, str4), new zzwp(this, zzaaeVar));
    }

    public final void zzD(f fVar, String str, zzaae zzaaeVar) {
        Preconditions.checkNotNull(fVar);
        Preconditions.checkNotNull(zzaaeVar);
        if (fVar.f42744e) {
            zzO(fVar.f42743d, new zzwq(this, fVar, str, zzaaeVar));
        } else {
            zzP(new zzacl(fVar, null, str), zzaaeVar);
        }
    }

    public final void zzE(zzaej zzaejVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzaejVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzs(zzaejVar, new zzxb(this, zzaaeVar));
    }

    public final void zzF(zzadv zzadvVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzadvVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzo(zzadvVar, new zzxr(this, zzaaeVar));
    }

    public final void zzG(String str, String str2, String str3, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzxl(this, str2, str3, zzaaeVar));
    }

    public final void zzH(String str, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzxh(this, zzaaeVar));
    }

    public final void zzI(String str, String str2, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str2, new zzxj(this, str, zzaaeVar));
    }

    public final void zzJ(String str, x xVar, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(xVar);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzyc(this, xVar, zzaaeVar));
    }

    public final void zzK(zzacx zzacxVar, zzaae zzaaeVar) {
        zzR(zzacxVar, zzaaeVar);
    }

    public final void zzL(zzacp zzacpVar, String str, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzacpVar);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzxp(this, zzacpVar, zzaaeVar));
    }

    public final void zzM(zzadx zzadxVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzadxVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzv(zzadxVar, new zzxm(this, zzaaeVar));
    }

    public final void zzN(zzacq zzacqVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzacqVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzw(zzacqVar, new zzxq(this, zzaaeVar));
    }

    public final void zzg(String str, String str2, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        zzadq zzadqVar = new zzadq();
        zzadqVar.zzf(str);
        zzadqVar.zzi(str2);
        this.zza.zzl(zzadqVar, new zzyf(this, zzaaeVar));
    }

    public final void zzh(String str, String str2, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzyd(this, str2, zzaaeVar));
    }

    public final void zzi(String str, String str2, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzye(this, str2, zzaaeVar));
    }

    public final void zzj(String str, String str2, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzj(new zzadm(str, null, str2), new zzwx(this, zzaaeVar));
    }

    public final void zzk(String str, String str2, String str3, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzj(new zzadm(str, str2, str3), new zzwz(this, zzaaeVar));
    }

    public final void zzl(String str, String str2, String str3, String str4, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzn(new zzads(str, str2, null, str3, str4), new zzwo(this, zzaaeVar));
    }

    public final void zzm(String str, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzxx(this, zzaaeVar));
    }

    public final void zzn(String str, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzd(new zzacs(str), new zzwy(this, zzaaeVar));
    }

    public final void zzo(zzacz zzaczVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzaczVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzg(zzaczVar, new zzxt(this, zzaaeVar));
    }

    public final void zzp(String str, String str2, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zza(new zzaci(str, str2), new zzwv(this, zzaaeVar));
    }

    public final void zzq(zzadc zzadcVar, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzadcVar);
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzh(zzadcVar, new zzxs(this, zzaaeVar));
    }

    public final void zzr(String str, String str2, String str3, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str3, new zzxc(this, str, str2, zzaaeVar));
    }

    public final void zzs(String str, zzaec zzaecVar, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaecVar);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzxg(this, zzaecVar, zzaaeVar));
    }

    public final void zzt(String str, zzaej zzaejVar, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaejVar);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzxe(this, zzaejVar, zzaaeVar));
    }

    public final void zzu(String str, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        zzO(str, new zzxv(this, zzaaeVar));
    }

    public final void zzv(String str, b bVar, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        zzacx zzacxVar = new zzacx(4);
        zzacxVar.zzh(str);
        if (bVar != null) {
            zzacxVar.zzd(bVar);
        }
        zzR(zzacxVar, zzaaeVar);
    }

    public final void zzw(String str, b bVar, String str2, String str3, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaaeVar);
        zzacx zzacxVar = new zzacx(bVar.f42720i);
        zzacxVar.zzf(str);
        zzacxVar.zzd(bVar);
        zzacxVar.zzg(str2);
        zzacxVar.zze(str3);
        this.zza.zzf(zzacxVar, new zzww(this, zzaaeVar));
    }

    public final void zzx(zzado zzadoVar, zzaae zzaaeVar) {
        Preconditions.checkNotEmpty(zzadoVar.zzd());
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzk(zzadoVar, new zzxa(this, zzaaeVar));
    }

    public final void zzy(String str, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzm(str, new zzxy(this, zzaaeVar));
    }

    public final void zzz(String str, zzaae zzaaeVar) {
        Preconditions.checkNotNull(zzaaeVar);
        this.zza.zzn(new zzads(str), new zzyb(this, zzaaeVar));
    }
}
