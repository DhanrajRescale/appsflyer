package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzjn implements zzjc {
    private final zzvx zza;
    private final zzvx zzb;

    private zzjn(byte[] bArr, byte[] bArr2) {
        this.zza = zzvx.zzb(bArr);
        this.zzb = zzvx.zzb(bArr2);
    }

    public static zzjn zzc(byte[] bArr) throws GeneralSecurityException {
        return new zzjn(bArr, zzvv.zzb(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjc
    public final zzvx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjc
    public final zzvx zzb() {
        return this.zzb;
    }
}
