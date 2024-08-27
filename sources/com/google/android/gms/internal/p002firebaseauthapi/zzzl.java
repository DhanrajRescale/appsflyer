package com.google.android.gms.internal.p002firebaseauthapi;

import aq.d0;
import aq.g0;
import aq.y;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import kp.j;
import zp.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzl extends zzabg {
    private final zzaec zza;

    public zzzl(d dVar, String str) {
        super(2);
        Preconditions.checkNotNull(dVar, "credential cannot be null");
        this.zza = j.g0(dVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "signInWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        g0 zzQ = zzaac.zzQ(this.zzg, this.zzo);
        ((y) this.zzi).a(this.zzn, zzQ);
        zzm(new d0(zzQ));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzw(this.zza, this.zzf);
    }
}
