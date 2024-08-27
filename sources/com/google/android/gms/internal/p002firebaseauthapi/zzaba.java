package com.google.android.gms.internal.p002firebaseauthapi;

import zp.r;

/* loaded from: classes2.dex */
final class zzaba implements zzabe {
    final /* synthetic */ String zza;

    public zzaba(zzabd zzabdVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabe
    public final void zza(r rVar, Object... objArr) {
        rVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
