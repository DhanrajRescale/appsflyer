package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import zp.r;

/* loaded from: classes2.dex */
final class zzaay implements zzabe {
    final /* synthetic */ String zza;

    public zzaay(zzabd zzabdVar, String str) {
        this.zza = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [zp.q, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabe
    public final void zza(r rVar, Object... objArr) {
        rVar.onCodeSent(this.zza, new AbstractSafeParcelable());
    }
}
