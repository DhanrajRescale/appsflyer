package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import pp.g;

/* loaded from: classes2.dex */
final class zzaat extends zzabm implements zzacd {

    @VisibleForTesting
    zzaau zza;
    private zzaan zzb;
    private zzaao zzc;
    private zzabr zzd;
    private final zzaas zze;
    private final g zzf;
    private final String zzg;

    @VisibleForTesting
    public zzaat(g gVar, zzaas zzaasVar, zzabr zzabrVar, zzaan zzaanVar, zzaao zzaaoVar) {
        this.zzf = gVar;
        gVar.a();
        String str = gVar.f31273c.f31280a;
        this.zzg = str;
        this.zze = (zzaas) Preconditions.checkNotNull(zzaasVar);
        zzy(null, null, null);
        zzace.zze(str, this);
    }

    @NonNull
    private final zzaau zzx() {
        if (this.zza == null) {
            g gVar = this.zzf;
            String zzb = this.zze.zzb();
            gVar.a();
            this.zza = new zzaau(gVar.f31271a, gVar, zzb);
        }
        return this.zza;
    }

    private final void zzy(zzabr zzabrVar, zzaan zzaanVar, zzaao zzaaoVar) {
        this.zzd = null;
        this.zzb = null;
        this.zzc = null;
        String zza = zzacb.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzace.zzd(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(zza)));
        }
        if (this.zzd == null) {
            this.zzd = new zzabr(zza, zzx());
        }
        String zza2 = zzacb.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzace.zzb(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(zza2)));
        }
        if (this.zzb == null) {
            this.zzb = new zzaan(zza2, zzx());
        }
        String zza3 = zzacb.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzace.zzc(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(zza3)));
        }
        if (this.zzc == null) {
            this.zzc = new zzaao(zza3, zzx());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zza(zzaci zzaciVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaciVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/createAuthUri", this.zzg), zzaciVar, zzablVar, zzacj.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzb(zzack zzackVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzackVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/deleteAccount", this.zzg), zzackVar, zzablVar, Void.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzc(zzacl zzaclVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaclVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/emailLinkSignin", this.zzg), zzaclVar, zzablVar, zzacm.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzd(zzacs zzacsVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzacsVar);
        Preconditions.checkNotNull(zzablVar);
        zzabr zzabrVar = this.zzd;
        zzabo.zzb(zzabrVar.zza("/token", this.zzg), zzacsVar, zzablVar, zzade.class, zzabrVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zze(zzact zzactVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzactVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/getAccountInfo", this.zzg), zzactVar, zzablVar, zzacu.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzf(zzacx zzacxVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzacxVar);
        Preconditions.checkNotNull(zzablVar);
        if (zzacxVar.zzb() != null) {
            zzx().zzc(zzacxVar.zzb().f42719h);
        }
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/getOobConfirmationCode", this.zzg), zzacxVar, zzablVar, zzacy.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzg(zzacz zzaczVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaczVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zza(zzaanVar.zza("/getRecaptchaParam", this.zzg), zzablVar, zzada.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzh(zzadc zzadcVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzadcVar);
        Preconditions.checkNotNull(zzablVar);
        zzaao zzaaoVar = this.zzc;
        zzabo.zza(zzaaoVar.zza("/recaptchaConfig", this.zzg) + "&clientType=" + zzadcVar.zzc() + "&version=" + zzadcVar.zzd(), zzablVar, zzadd.class, zzaaoVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacd
    public final void zzi() {
        zzy(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzj(zzadm zzadmVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzadmVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/resetPassword", this.zzg), zzadmVar, zzablVar, zzadn.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzk(zzado zzadoVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzadoVar);
        Preconditions.checkNotNull(zzablVar);
        if (!TextUtils.isEmpty(zzadoVar.zzc())) {
            zzx().zzc(zzadoVar.zzc());
        }
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/sendVerificationCode", this.zzg), zzadoVar, zzablVar, zzadp.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzl(zzadq zzadqVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzadqVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/setAccountInfo", this.zzg), zzadqVar, zzablVar, zzadr.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzm(String str, zzabl zzablVar) {
        Preconditions.checkNotNull(zzablVar);
        zzx().zzb(str);
        ((zzxy) zzablVar).zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzn(zzads zzadsVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzadsVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/signupNewUser", this.zzg), zzadsVar, zzablVar, zzadt.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzo(zzadv zzadvVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzadvVar);
        Preconditions.checkNotNull(zzablVar);
        if (!TextUtils.isEmpty(zzadvVar.zzc())) {
            zzx().zzc(zzadvVar.zzc());
        }
        zzaao zzaaoVar = this.zzc;
        zzabo.zzb(zzaaoVar.zza("/accounts/mfaSignIn:start", this.zzg), zzadvVar, zzablVar, zzadw.class, zzaaoVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzp(zzaec zzaecVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaecVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/verifyAssertion", this.zzg), zzaecVar, zzablVar, zzaee.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzq(zzaef zzaefVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaefVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/verifyCustomToken", this.zzg), zzaefVar, zzablVar, zzaeg.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzr(zzaeh zzaehVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaehVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/verifyPassword", this.zzg), zzaehVar, zzablVar, zzaei.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzs(zzaej zzaejVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaejVar);
        Preconditions.checkNotNull(zzablVar);
        zzaan zzaanVar = this.zzb;
        zzabo.zzb(zzaanVar.zza("/verifyPhoneNumber", this.zzg), zzaejVar, zzablVar, zzaek.class, zzaanVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzt(zzael zzaelVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzaelVar);
        Preconditions.checkNotNull(zzablVar);
        zzaao zzaaoVar = this.zzc;
        zzabo.zzb(zzaaoVar.zza("/accounts/mfaEnrollment:withdraw", this.zzg), zzaelVar, zzablVar, zzaem.class, zzaaoVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzu(zzacp zzacpVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzacpVar);
        Preconditions.checkNotNull(zzablVar);
        zzaao zzaaoVar = this.zzc;
        zzabo.zzb(zzaaoVar.zza("/accounts/mfaEnrollment:finalize", this.zzg), zzacpVar, zzablVar, zzacn.class, zzaaoVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzv(zzadx zzadxVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzadxVar);
        Preconditions.checkNotNull(zzablVar);
        if (!TextUtils.isEmpty(zzadxVar.zzc())) {
            zzx().zzc(zzadxVar.zzc());
        }
        zzaao zzaaoVar = this.zzc;
        zzabo.zzb(zzaaoVar.zza("/accounts/mfaEnrollment:start", this.zzg), zzadxVar, zzablVar, zzadu.class, zzaaoVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabm
    public final void zzw(zzacq zzacqVar, zzabl zzablVar) {
        Preconditions.checkNotNull(zzacqVar);
        Preconditions.checkNotNull(zzablVar);
        zzaao zzaaoVar = this.zzc;
        zzabo.zzb(zzaaoVar.zza("/accounts/mfaSignIn:finalize", this.zzg), zzacqVar, zzablVar, zzaco.class, zzaaoVar.zzb);
    }
}
