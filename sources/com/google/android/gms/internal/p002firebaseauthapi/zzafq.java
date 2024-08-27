package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzafq extends zzafn {
    private final OutputStream zzg;

    public zzafq(OutputStream outputStream, int i10) {
        super(i10);
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzJ(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzK(int i10, boolean z10) throws IOException {
        zzH(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzL(int i10, zzaff zzaffVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(zzaffVar.zzd());
        zzaffVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs, com.google.android.gms.internal.p002firebaseauthapi.zzaev
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzp(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzh(int i10, int i11) throws IOException {
        zzH(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzi(int i10) throws IOException {
        zzH(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzj(int i10, long j10) throws IOException {
        zzH(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzk(long j10) throws IOException {
        zzH(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzl(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzn(int i10, zzahp zzahpVar, zzaib zzaibVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(((zzaep) zzahpVar).zzn(zzaibVar));
        zzaibVar.zzm(zzahpVar, this.zze);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzo(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, 0, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, 0, this.zza, i13, i14);
        this.zzc = this.zzb;
        this.zzd += i14;
        zzG();
        int i15 = i11 - i14;
        if (i15 <= this.zzb) {
            System.arraycopy(bArr, i14, this.zza, 0, i15);
            this.zzc = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzd += i15;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzq(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzr(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzs(int i10) throws IOException {
        zzH(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzt(int i10, long j10) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zzu(long j10) throws IOException {
        zzH(10);
        zzg(j10);
    }

    public final void zzv(String str) throws IOException {
        int zzc;
        try {
            int length = str.length() * 3;
            int zzA = zzafs.zzA(length);
            int i10 = zzA + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int zzb = zzajk.zzb(str, bArr, 0, length);
                zzs(zzb);
                zzp(bArr, 0, zzb);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzG();
            }
            int zzA2 = zzafs.zzA(str.length());
            int i12 = this.zzc;
            try {
                if (zzA2 == zzA) {
                    int i13 = i12 + zzA2;
                    this.zzc = i13;
                    int zzb2 = zzajk.zzb(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    zzc = (zzb2 - i12) - zzA2;
                    zzf(zzc);
                    this.zzc = zzb2;
                } else {
                    zzc = zzajk.zzc(str);
                    zzf(zzc);
                    this.zzc = zzajk.zzb(str, this.zza, this.zzc, zzc);
                }
                this.zzd += zzc;
            } catch (zzajj e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzafp(e11);
            }
        } catch (zzajj e12) {
            zzE(str, e12);
        }
    }
}
