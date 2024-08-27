package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;
import jr.h;

/* loaded from: classes2.dex */
class zzea extends zzeb {
    final zzdw zzb;
    final Character zzc;

    public zzea(zzdw zzdwVar, Character ch2) {
        this.zzb = zzdwVar;
        if (ch2 != null) {
            ch2.charValue();
            if (zzdwVar.zzd('=')) {
                throw new IllegalArgumentException(zzdl.zza("Padding character %s was already in alphabet", ch2));
            }
        }
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzea) {
            zzea zzeaVar = (zzea) obj;
            if (this.zzb.equals(zzeaVar.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzeaVar.zzc;
                if (ch2 != ch3) {
                    if (ch2 != null && ch2.equals(ch3)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zzb.hashCode();
        Character ch2 = this.zzc;
        if (ch2 == null) {
            hashCode = 0;
        } else {
            hashCode = ch2.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public int zza(byte[] bArr, CharSequence charSequence) throws zzdz {
        zzdw zzdwVar;
        bArr.getClass();
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zze.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    zzdwVar = this.zzb;
                    if (i12 >= zzdwVar.zzc) {
                        break;
                    }
                    j10 <<= zzdwVar.zzb;
                    if (i10 + i12 < zze.length()) {
                        j10 |= this.zzb.zzb(zze.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = zzdwVar.zzd;
                int i15 = i14 * 8;
                int i16 = i13 * zzdwVar.zzb;
                int i17 = (i14 - 1) * 8;
                while (i17 >= i15 - i16) {
                    bArr[i11] = (byte) ((j10 >>> i17) & 255);
                    i17 -= 8;
                    i11++;
                }
                i10 += this.zzb.zzc;
            }
            return i11;
        }
        throw new zzdz(h.n("Invalid input length ", zze.length()));
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzdi.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public final int zzc(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public final int zzd(int i10) {
        zzdw zzdwVar = this.zzb;
        return zzed.zza(i10, zzdwVar.zzd, RoundingMode.CEILING) * zzdwVar.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        Character ch2 = this.zzc;
        if (ch2 == null) {
            return charSequence;
        }
        ch2.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        boolean z10;
        zzdi.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        if (i11 <= this.zzb.zzd) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zza(z10);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzdw zzdwVar = this.zzb;
            appendable.append(zzdwVar.zza(zzdwVar.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    public zzea(String str, String str2, Character ch2) {
        this(new zzdw(str, str2.toCharArray()), ch2);
    }
}
