package com.google.android.gms.internal.p002firebaseauthapi;

import da.e;
import jr.h;

/* loaded from: classes2.dex */
final class zzaez extends zzafc {
    private final int zzc;

    public zzaez(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzaff.zzl(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc, com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(h.n("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(e.m("Index > length: ", i10, ", ", i11));
        }
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc, com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc, com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc, com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }
}
