package com.google.android.gms.internal.p002firebaseauthapi;

import da.e;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzafc extends zzafb {
    protected final byte[] zza;

    public zzafc(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaff) || zzd() != ((zzaff) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzafc) {
            zzafc zzafcVar = (zzafc) obj;
            int zzm = zzm();
            int zzm2 = zzafcVar.zzm();
            if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzafcVar.zzd()) {
                if (zzd <= zzafcVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzafcVar.zza;
                    zzafcVar.zzc();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < zzd) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(e.m("Ran off end of other: 0, ", zzd, ", ", zzafcVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final int zzf(int i10, int i11, int i12) {
        return zzagq.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final zzaff zzg(int i10, int i11) {
        int zzl = zzaff.zzl(0, i11, zzd());
        if (zzl == 0) {
            return zzaff.zzb;
        }
        return new zzaez(this.zza, 0, zzl);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final zzafl zzh() {
        return zzafl.zzH(this.zza, 0, zzd(), true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzj(zzaev zzaevVar) throws IOException {
        zzaevVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final boolean zzk() {
        return zzajk.zzf(this.zza, 0, zzd());
    }
}
