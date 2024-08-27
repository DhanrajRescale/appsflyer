package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class zzhc extends zzhd {
    public zzhc(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhd
    public final zzhb zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzha(bArr, i10);
    }
}
