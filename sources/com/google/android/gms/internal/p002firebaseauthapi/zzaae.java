package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import zp.o;

/* loaded from: classes2.dex */
public class zzaae {
    private final zzaad zza;
    private final Logger zzb;

    public zzaae(zzaad zzaadVar, Logger logger) {
        this.zza = (zzaad) Preconditions.checkNotNull(zzaadVar);
        this.zzb = (Logger) Preconditions.checkNotNull(logger);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void zzc(zzacj zzacjVar) {
        try {
            this.zza.zzc(zzacjVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void zzd() {
        try {
            this.zza.zzd();
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public final void zze(zzwm zzwmVar) {
        try {
            this.zza.zze(zzwmVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void zzf(zzwn zzwnVar) {
        try {
            this.zza.zzf(zzwnVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void zzg(Status status, o oVar) {
        try {
            this.zza.zzg(status, oVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public void zzh(Status status) {
        try {
            this.zza.zzh(status);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zzi(zzada zzadaVar) {
        try {
            this.zza.zzi(zzadaVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending Play Integrity Producer project response.", e10, new Object[0]);
        }
    }

    public final void zzj(zzadd zzaddVar) {
        try {
            this.zza.zzj(zzaddVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending get recaptcha config response.", e10, new Object[0]);
        }
    }

    public final void zzk(zzade zzadeVar, zzacv zzacvVar) {
        try {
            this.zza.zzk(zzadeVar, zzacvVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zzl(zzadn zzadnVar) {
        try {
            this.zza.zzl(zzadnVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void zzm() {
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public final void zzn(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }

    public final void zzo() {
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when setting FirebaseUI Version", e10, new Object[0]);
        }
    }

    public final void zzp(zzade zzadeVar) {
        try {
            this.zza.zzp(zzadeVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void zzq(o oVar) {
        try {
            this.zza.zzq(oVar);
        } catch (RemoteException e10) {
            this.zzb.e("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }

    public zzaae(zzaae zzaaeVar) {
        this(zzaaeVar.zza, zzaaeVar.zzb);
    }
}
