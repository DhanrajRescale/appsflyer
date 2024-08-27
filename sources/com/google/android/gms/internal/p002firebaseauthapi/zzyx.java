package com.google.android.gms.internal.p002firebaseauthapi;

import aq.d0;
import aq.g0;
import aq.y;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import zp.f;
import zp.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyx extends zzabg {
    private final f zza;

    public zzyx(f fVar) {
        super(2);
        this.zza = (f) Preconditions.checkNotNull(fVar, "credential cannot be null");
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
        h hVar = this.zzh;
        fVar.getClass();
        fVar.f42743d = ((g0) hVar).f2716a.zzh();
        fVar.f42744e = true;
        zzaafVar.zzz(new zzwi(fVar, null), this.zzf);
    }
}
