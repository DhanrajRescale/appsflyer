package com.google.android.gms.internal.p002firebaseauthapi;

import zp.o;
import zp.r;

/* loaded from: classes2.dex */
final class zzaaz implements zzabe {
    final /* synthetic */ o zza;

    public zzaaz(zzabd zzabdVar, o oVar) {
        this.zza = oVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabe
    public final void zza(r rVar, Object... objArr) {
        rVar.onVerificationCompleted(this.zza);
    }
}
