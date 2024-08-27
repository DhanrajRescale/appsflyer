package com.google.android.gms.internal.icing;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzck extends zzcm {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzck(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zza(int i10, int i11) throws IOException {
        zzl((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzb(int i10, int i11) throws IOException {
        zzl(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzc(int i10, int i11) throws IOException {
        zzl(i10 << 3);
        zzl(i11);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzd(int i10, int i11) throws IOException {
        zzl((i10 << 3) | 5);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zze(int i10, long j10) throws IOException {
        zzl(i10 << 3);
        zzn(j10);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzf(int i10, long j10) throws IOException {
        zzl((i10 << 3) | 1);
        zzo(j10);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzg(int i10, boolean z10) throws IOException {
        zzl(i10 << 3);
        zzj(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzh(int i10, String str) throws IOException {
        zzl((i10 << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzi(int i10, zzcf zzcfVar) throws IOException {
        zzl((i10 << 3) | 2);
        zzl(zzcfVar.zzc());
        zzcfVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzj(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzk(int i10) throws IOException {
        if (i10 >= 0) {
            zzl(i10);
        } else {
            zzn(i10);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzl(int i10) throws IOException {
        boolean z10;
        z10 = zzcm.zzc;
        if (z10) {
            int i11 = zzbu.zza;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }
        byte[] bArr2 = this.zzb;
        int i13 = this.zzd;
        this.zzd = i13 + 1;
        bArr2[i13] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzm(int i10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.zzd = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzn(long j10) throws IOException {
        boolean z10;
        z10 = zzcm.zzc;
        if (z10 && this.zzc - this.zzd >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                zzfn.zzp(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzfn.zzp(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }
        byte[] bArr4 = this.zzb;
        int i13 = this.zzd;
        this.zzd = i13 + 1;
        bArr4[i13] = (byte) j10;
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzo(long j10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzd = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    public final void zzp(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final void zzq(byte[] bArr, int i10, int i11) throws IOException {
        zzp(bArr, 0, i11);
    }

    public final void zzr(String str) throws IOException {
        int i10 = this.zzd;
        try {
            int zzw = zzcm.zzw(str.length() * 3);
            int zzw2 = zzcm.zzw(str.length());
            if (zzw2 == zzw) {
                int i11 = i10 + zzw2;
                this.zzd = i11;
                int zzd = zzfr.zzd(str, this.zzb, i11, this.zzc - i11);
                this.zzd = i10;
                zzl((zzd - i10) - zzw2);
                this.zzd = zzd;
                return;
            }
            zzl(zzfr.zzc(str));
            byte[] bArr = this.zzb;
            int i12 = this.zzd;
            this.zzd = zzfr.zzd(str, bArr, i12, this.zzc - i12);
        } catch (zzfq e10) {
            this.zzd = i10;
            zzD(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzcl(e11);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzcm
    public final int zzs() {
        return this.zzc - this.zzd;
    }
}
