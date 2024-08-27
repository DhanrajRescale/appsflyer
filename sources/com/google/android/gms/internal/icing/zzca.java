package com.google.android.gms.internal.icing;

import nn.d;

/* loaded from: classes2.dex */
final class zzca extends zzcd {
    private final int zzc;

    public zzca(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzcf.zzm(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.icing.zzcd, com.google.android.gms.internal.icing.zzcf
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(d.h(22, "Index < 0: ", i10));
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return ((zzcd) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.icing.zzcd, com.google.android.gms.internal.icing.zzcf
    public final byte zzb(int i10) {
        return ((zzcd) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.icing.zzcd, com.google.android.gms.internal.icing.zzcf
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.icing.zzcd
    public final int zzd() {
        return 0;
    }
}
