package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import aq.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import lp.g0;
import zp.d;
import zp.o;
import zp.z;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzabd implements zzaad {
    final /* synthetic */ zzabg zza;

    public zzabd(zzabg zzabgVar) {
        this.zza = zzabgVar;
    }

    private final void zzr(zzabe zzabeVar) {
        this.zza.zzm.execute(new zzabc(this, zzabeVar));
    }

    private final void zzs(Status status, d dVar, String str, String str2) {
        zzabg.zzk(this.zza, status);
        zzabg zzabgVar = this.zza;
        zzabgVar.zzt = dVar;
        zzabgVar.zzu = str;
        zzabgVar.zzv = str2;
        h hVar = zzabgVar.zzj;
        if (hVar != null) {
            ((z) hVar).b(status);
        }
        this.zza.zzl(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zza(String str) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg zzabgVar = this.zza;
        zzabgVar.zzs = str;
        zzabgVar.zza = true;
        zzr(new zzaba(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzb(String str) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        this.zza.zzs = str;
        zzr(new zzaay(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzc(zzacj zzacjVar) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg zzabgVar = this.zza;
        zzabgVar.zzp = zzacjVar;
        zzabg.zzj(zzabgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzd() throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zze(zzwm zzwmVar) {
        zzs(zzwmVar.zza(), zzwmVar.zzb(), zzwmVar.zzc(), zzwmVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzf(zzwn zzwnVar) {
        zzabg zzabgVar = this.zza;
        zzabgVar.zzw = zzwnVar;
        zzabgVar.zzl(g0.p("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzg(Status status, o oVar) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzs(status, oVar, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzh(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzabg zzabgVar = this.zza;
        if (zzabgVar.zze == 8) {
            zzabgVar.zza = true;
            zzr(new zzabb(this, status));
        } else {
            zzabg.zzk(zzabgVar, status);
            this.zza.zzl(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzi(zzada zzadaVar) throws RemoteException {
        zzabg zzabgVar = this.zza;
        zzabgVar.zzy = zzadaVar;
        zzabg.zzj(zzabgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzj(zzadd zzaddVar) throws RemoteException {
        zzabg zzabgVar = this.zza;
        zzabgVar.zzx = zzaddVar;
        zzabg.zzj(zzabgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzk(zzade zzadeVar, zzacv zzacvVar) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type: ", i10);
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg zzabgVar = this.zza;
        zzabgVar.zzn = zzadeVar;
        zzabgVar.zzo = zzacvVar;
        zzabg.zzj(zzabgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzl(zzadn zzadnVar) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg zzabgVar = this.zza;
        zzabgVar.zzq = zzadnVar;
        zzabg.zzj(zzabgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzm() throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzn(String str) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 7) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg zzabgVar = this.zza;
        zzabgVar.zzr = str;
        zzabg.zzj(zzabgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzo() throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzp(zzade zzadeVar) throws RemoteException {
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type: ", i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        zzabg zzabgVar = this.zza;
        zzabgVar.zzn = zzadeVar;
        zzabg.zzj(zzabgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaad
    public final void zzq(o oVar) throws RemoteException {
        boolean z10;
        int i10 = this.zza.zze;
        String n10 = jr.h.n("Unexpected response type ", i10);
        if (i10 == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, n10);
        this.zza.zza = true;
        zzr(new zzaaz(this, oVar));
    }
}
