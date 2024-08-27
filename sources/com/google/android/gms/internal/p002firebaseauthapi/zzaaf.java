package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.concurrent.ScheduledExecutorService;
import pp.g;
import zp.k;
import zp.o;
import zp.x;

/* loaded from: classes2.dex */
public final class zzaaf {
    private static final Logger zza = new Logger("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyh zzb;
    private final zzaca zzc;

    public zzaaf(g gVar, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(gVar);
        gVar.a();
        Context context = gVar.f31271a;
        Preconditions.checkNotNull(context);
        this.zzb = new zzyh(new zzaat(gVar, zzaas.zza(), null, null, null));
        this.zzc = new zzaca(context, scheduledExecutorService);
    }

    private static boolean zzI(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.w("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zzA(zzwj zzwjVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzaadVar);
        Preconditions.checkNotNull(zzwjVar);
        this.zzb.zzE(zzabq.zza((o) Preconditions.checkNotNull(zzwjVar.zza())), new zzaae(zzaadVar, zza));
    }

    public final void zzB(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str, "idToken should not be empty.");
        Preconditions.checkNotNull(zzaadVar);
        zzaae zzaaeVar = new zzaae(zzaadVar, zza);
        if (this.zzc.zzk(str2)) {
            if (z10) {
                this.zzc.zzi(str2);
            } else {
                this.zzc.zzh(zzaaeVar, str2);
                return;
            }
        }
        zzadx zzb = zzadx.zzb(str, str2, str3, str4, str5, null);
        if (zzI(j10, z12)) {
            zzb.zzd(new zzacf(this.zzc.zzb()));
        }
        this.zzc.zzj(str2, zzaaeVar, j10, z12);
        this.zzb.zzM(zzb, new zzabx(this.zzc, zzaaeVar, str2));
    }

    public final void zzC(zzwk zzwkVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwkVar);
        Preconditions.checkNotNull(zzaadVar);
        String str = zzwkVar.zzb().f42782d;
        zzaae zzaaeVar = new zzaae(zzaadVar, zza);
        if (this.zzc.zzk(str)) {
            if (zzwkVar.zzg()) {
                this.zzc.zzi(str);
            } else {
                this.zzc.zzh(zzaaeVar, str);
                return;
            }
        }
        long zza2 = zzwkVar.zza();
        boolean zzh = zzwkVar.zzh();
        zzadv zzb = zzadv.zzb(zzwkVar.zzd(), zzwkVar.zzb().f42779a, zzwkVar.zzb().f42782d, zzwkVar.zzc(), zzwkVar.zzf(), zzwkVar.zze());
        if (zzI(zza2, zzh)) {
            zzb.zzd(new zzacf(this.zzc.zzb()));
        }
        this.zzc.zzj(str, zzaaeVar, zza2, zzh);
        this.zzb.zzF(zzb, new zzabx(this.zzc, zzaaeVar, str));
    }

    public final void zzD(String str, String str2, String str3, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str, "cachedTokenState should not be empty.");
        Preconditions.checkNotEmpty(str2, "uid should not be empty.");
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzG(str, str2, str3, new zzaae(zzaadVar, zza));
    }

    public final void zzE(String str, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzH(str, new zzaae(zzaadVar, zza));
    }

    public final void zzF(String str, String str2, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzI(str, str2, new zzaae(zzaadVar, zza));
    }

    public final void zzG(String str, x xVar, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(xVar);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzJ(str, xVar, new zzaae(zzaadVar, zza));
    }

    public final void zzH(zzwl zzwlVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwlVar);
        this.zzb.zzK(zzacx.zzc(zzwlVar.zza(), zzwlVar.zzb(), zzwlVar.zzc()), new zzaae(zzaadVar, zza));
    }

    public final void zza(String str, String str2, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzg(str, str2, new zzaae(zzaadVar, zza));
    }

    public final void zzb(String str, String str2, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzh(str, str2, new zzaae(zzaadVar, zza));
    }

    public final void zzc(String str, String str2, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzi(str, str2, new zzaae(zzaadVar, zza));
    }

    public final void zzd(String str, String str2, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzj(str, str2, new zzaae(zzaadVar, zza));
    }

    public final void zze(zzwa zzwaVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwaVar);
        Preconditions.checkNotEmpty(zzwaVar.zza());
        Preconditions.checkNotEmpty(zzwaVar.zzb());
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzk(zzwaVar.zza(), zzwaVar.zzb(), zzwaVar.zzc(), new zzaae(zzaadVar, zza));
    }

    public final void zzf(String str, String str2, String str3, String str4, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzl(str, str2, str3, str4, new zzaae(zzaadVar, zza));
    }

    public final void zzg(String str, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzm(str, new zzaae(zzaadVar, zza));
    }

    public final void zzh(k kVar, String str, String str2, String str3, zzaad zzaadVar) {
        Preconditions.checkNotNull(kVar);
        Preconditions.checkNotEmpty(str, "cachedTokenState should not be empty.");
        Preconditions.checkNotNull(zzaadVar);
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zzi(String str, k kVar, String str2, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(kVar);
        Preconditions.checkNotNull(zzaadVar);
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zzj(String str, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzn(str, new zzaae(zzaadVar, zza));
    }

    public final void zzk(zzwb zzwbVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwbVar);
        this.zzb.zzo(zzacz.zzb(), new zzaae(zzaadVar, zza));
    }

    public final void zzl(String str, String str2, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        this.zzb.zzp(str, str2, new zzaae(zzaadVar, zza));
    }

    public final void zzm(zzwc zzwcVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwcVar);
        this.zzb.zzq(zzadc.zzb(zzwcVar.zzb(), zzwcVar.zza()), new zzaae(zzaadVar, zza));
    }

    public final void zzn(String str, String str2, String str3, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzr(str, str2, str3, new zzaae(zzaadVar, zza));
    }

    public final void zzo(String str, zzaec zzaecVar, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaecVar);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzs(str, zzaecVar, new zzaae(zzaadVar, zza));
    }

    public final void zzp(zzwd zzwdVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzaadVar);
        Preconditions.checkNotNull(zzwdVar);
        o oVar = (o) Preconditions.checkNotNull(zzwdVar.zza());
        this.zzb.zzt(Preconditions.checkNotEmpty(zzwdVar.zzb()), zzabq.zza(oVar), new zzaae(zzaadVar, zza));
    }

    public final void zzq(String str, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzu(str, new zzaae(zzaadVar, zza));
    }

    public final void zzr(@NonNull zzwe zzweVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotEmpty(zzweVar.zzb());
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzv(zzweVar.zzb(), zzweVar.zza(), new zzaae(zzaadVar, zza));
    }

    public final void zzs(@NonNull zzwf zzwfVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwfVar);
        Preconditions.checkNotEmpty(zzwfVar.zzc());
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzw(zzwfVar.zzc(), zzwfVar.zza(), zzwfVar.zzd(), zzwfVar.zzb(), new zzaae(zzaadVar, zza));
    }

    public final void zzt(zzwg zzwgVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzaadVar);
        Preconditions.checkNotNull(zzwgVar);
        zzado zzadoVar = (zzado) Preconditions.checkNotNull(zzwgVar.zza());
        String zzd = zzadoVar.zzd();
        zzaae zzaaeVar = new zzaae(zzaadVar, zza);
        if (this.zzc.zzk(zzd)) {
            if (zzadoVar.zzf()) {
                this.zzc.zzi(zzd);
            } else {
                this.zzc.zzh(zzaaeVar, zzd);
                return;
            }
        }
        long zzb = zzadoVar.zzb();
        boolean zzg = zzadoVar.zzg();
        if (zzI(zzb, zzg)) {
            zzadoVar.zze(new zzacf(this.zzc.zzb()));
        }
        this.zzc.zzj(zzd, zzaaeVar, zzb, zzg);
        this.zzb.zzx(zzadoVar, new zzabx(this.zzc, zzaaeVar, zzd));
    }

    public final void zzu(zzwh zzwhVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwhVar);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzy(zzwhVar.zza(), new zzaae(zzaadVar, zza));
    }

    public final void zzv(String str, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzz(str, new zzaae(zzaadVar, zza));
    }

    public final void zzw(zzaec zzaecVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzaecVar);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzA(zzaecVar, new zzaae(zzaadVar, zza));
    }

    public final void zzx(zzaef zzaefVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzaefVar);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzB(zzaefVar, new zzaae(zzaadVar, zza));
    }

    public final void zzy(String str, String str2, String str3, String str4, zzaad zzaadVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzaadVar);
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzC(str, str2, str3, str4, new zzaae(zzaadVar, zza));
    }

    public final void zzz(zzwi zzwiVar, zzaad zzaadVar) {
        Preconditions.checkNotNull(zzwiVar);
        Preconditions.checkNotNull(zzwiVar.zza());
        Preconditions.checkNotNull(zzaadVar);
        this.zzb.zzD(zzwiVar.zza(), zzwiVar.zzb(), new zzaae(zzaadVar, zza));
    }
}
