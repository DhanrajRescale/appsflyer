package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzafn extends zzafs {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzafn(int i10) {
        super(null);
        if (i10 >= 0) {
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b10) {
        byte[] bArr = this.zza;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        bArr[i10] = b10;
        this.zzd++;
    }

    public final void zzd(int i10) {
        byte[] bArr = this.zza;
        int i11 = this.zzc;
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
        this.zzc = i11 + 4;
        bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        this.zzd += 4;
    }

    public final void zze(long j10) {
        byte[] bArr = this.zza;
        int i10 = this.zzc;
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) (255 & (j10 >> 24));
        bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
        bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
        bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
        this.zzc = i10 + 8;
        bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        this.zzd += 8;
    }

    public final void zzf(int i10) {
        boolean z10;
        z10 = zzafs.zzb;
        if (z10) {
            long j10 = this.zzc;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzajf.zzn(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzajf.zzn(bArr2, i12, (byte) i10);
            this.zzd += (int) (this.zzc - j10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr3[i13] = (byte) ((i10 & 127) | 128);
            this.zzd++;
            i10 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        bArr4[i14] = (byte) i10;
        this.zzd++;
    }

    public final void zzg(long j10) {
        boolean z10;
        z10 = zzafs.zzb;
        if (z10) {
            long j11 = this.zzc;
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzajf.zzn(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            zzajf.zzn(bArr2, i11, (byte) j10);
            this.zzd += (int) (this.zzc - j11);
            return;
        }
        while ((j10 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
            this.zzd++;
            j10 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        bArr4[i13] = (byte) j10;
        this.zzd++;
    }
}
