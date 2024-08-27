package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import zp.r;

/* loaded from: classes2.dex */
final class zzabb implements zzabe {
    final /* synthetic */ Status zza;

    public zzabb(zzabd zzabdVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabe
    public final void zza(r rVar, Object... objArr) {
        rVar.onVerificationFailed(zzaag.zza(this.zza));
    }
}
