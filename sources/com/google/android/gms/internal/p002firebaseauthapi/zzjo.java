package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzjo {
    private final zzbd zza;
    private final zzbi zzb;

    public zzjo(zzbd zzbdVar) {
        this.zza = zzbdVar;
        this.zzb = null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbd zzbdVar = this.zza;
        if (zzbdVar != null) {
            return zzbdVar.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }

    public zzjo(zzbi zzbiVar) {
        this.zza = null;
        this.zzb = zzbiVar;
    }
}
