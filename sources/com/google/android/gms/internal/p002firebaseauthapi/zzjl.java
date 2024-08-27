package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzjl implements zzjc {
    private final zzvx zza;
    private final zzvx zzb;

    private zzjl(byte[] bArr, byte[] bArr2) {
        this.zza = zzvx.zzb(bArr);
        this.zzb = zzvx.zzb(bArr2);
    }

    public static zzjl zzc(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        zzut.zzd(zzut.zzh(zzut.zzi(i10), 1, bArr2), zzut.zzg(i10, bArr));
        return new zzjl(bArr, bArr2);
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
