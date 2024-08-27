package com.google.android.gms.internal.p002firebaseauthapi;

import aq.g0;
import aq.y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import zp.o;

/* loaded from: classes2.dex */
final class zzze extends zzabg {
    private final zzwj zza;

    public zzze(o oVar, String str) {
        super(2);
        Preconditions.checkNotNull(oVar, "credential cannot be null");
        oVar.f42769d = false;
        this.zza = new zzwj(oVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        g0 zzQ = zzaac.zzQ(this.zzg, this.zzo);
        if (((g0) this.zzh).f2717b.f2702a.equalsIgnoreCase(zzQ.f2717b.f2702a)) {
            ((y) this.zzi).a(this.zzn, zzQ);
            zzm(null);
        } else {
            zzl(new Status(17024));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzA(this.zza, this.zzf);
    }
}
