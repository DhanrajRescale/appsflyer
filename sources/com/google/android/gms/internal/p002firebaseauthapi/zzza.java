package com.google.android.gms.internal.p002firebaseauthapi;

import aq.g0;
import aq.y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import zp.f;

/* loaded from: classes2.dex */
final class zzza extends zzabg {
    private final zzwi zza;

    public zzza(f fVar, String str) {
        super(2);
        Preconditions.checkNotNull(fVar, "Credential cannot be null");
        this.zza = new zzwi(fVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "reauthenticateWithEmailLink";
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
        zzaafVar.zzz(this.zza, this.zzf);
    }
}
