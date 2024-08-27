package com.google.android.gms.internal.p002firebaseauthapi;

import aq.g0;
import aq.y;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzzg extends zzabg {
    public zzzg() {
        super(2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "reload";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        ((y) this.zzi).a(this.zzn, zzaac.zzQ(this.zzg, this.zzo));
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzq(((g0) this.zzh).f2716a.zzh(), this.zzf);
    }
}
