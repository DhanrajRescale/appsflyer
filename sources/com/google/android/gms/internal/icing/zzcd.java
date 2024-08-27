package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzcd extends zzcc {
    protected final byte[] zza;

    public zzcd(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcf) || zzc() != ((zzcf) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            int zzl = zzl();
            int zzl2 = zzcdVar.zzl();
            if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
                return false;
            }
            int zzc = zzc();
            if (zzc <= zzcdVar.zzc()) {
                if (zzc <= zzcdVar.zzc()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzcdVar.zza;
                    zzcdVar.zzd();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < zzc) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                int zzc2 = zzcdVar.zzc();
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("Ran off end of other: 0, ");
                sb2.append(zzc);
                sb2.append(", ");
                sb2.append(zzc2);
                throw new IllegalArgumentException(sb2.toString());
            }
            int zzc3 = zzc();
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(zzc);
            sb3.append(zzc3);
            throw new IllegalArgumentException(sb3.toString());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final zzcf zze(int i10, int i11) {
        zzcf.zzm(0, i11, zzc());
        if (i11 == 0) {
            return zzcf.zzb;
        }
        return new zzca(this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final void zzf(zzbw zzbwVar) throws IOException {
        ((zzck) zzbwVar).zzp(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final boolean zzh() {
        return zzfr.zzb(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.icing.zzcf
    public final int zzi(int i10, int i11, int i12) {
        return zzdh.zzh(i10, this.zza, 0, i12);
    }
}
