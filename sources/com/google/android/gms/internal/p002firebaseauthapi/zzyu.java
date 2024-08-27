package com.google.android.gms.internal.p002firebaseauthapi;

import aq.d0;
import aq.g0;
import aq.y;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import zp.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyu extends zzabg {
    private final f zza;

    public zzyu(f fVar) {
        super(2);
        this.zza = (f) Preconditions.checkNotNull(fVar, "credential cannot be null");
        Preconditions.checkNotEmpty(fVar.f42740a, "email cannot be null");
        Preconditions.checkNotEmpty(fVar.f42741b, "password cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "linkEmailAuthCredential";
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
        f fVar = this.zza;
        zzaafVar.zzn(fVar.f42740a, Preconditions.checkNotEmpty(fVar.f42741b), ((g0) this.zzh).f2716a.zzh(), this.zzf);
    }
}
