package com.google.android.gms.internal.p002firebaseauthapi;

import aq.g0;
import aq.y;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import zp.o;

/* loaded from: classes2.dex */
final class zzzx extends zzabg {
    private final o zza;

    public zzzx(o oVar) {
        super(2);
        this.zza = (o) Preconditions.checkNotNull(oVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        ((y) this.zzi).a(this.zzn, zzaac.zzQ(this.zzg, this.zzo));
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzp(new zzwd(((g0) this.zzh).f2716a.zzh(), this.zza), this.zzf);
    }
}
