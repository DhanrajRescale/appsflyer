package com.google.android.gms.internal.p002firebaseauthapi;

import da.e;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import jr.h;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzaff implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzaff zzb = new zzafc(zzagq.zzd);
    private static final zzafe zzd;
    private int zzc = 0;

    static {
        int i10 = zzaer.zza;
        zzd = new zzafe(null);
        zza = new zzaex();
    }

    public static int zzl(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(e.m("Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(e.m("End index: ", i11, " >= ", i12));
            }
            throw new IndexOutOfBoundsException(h.o("Beginning index: ", i10, " < 0"));
        }
        return i13;
    }

    public static zzaff zzn(byte[] bArr, int i10, int i11) {
        zzl(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzafc(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzf(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzaew(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = zzaiq.zza(this);
        } else {
            concat = zzaiq.zza(zzg(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf(int i10, int i11, int i12);

    public abstract zzaff zzg(int i10, int i11);

    public abstract zzafl zzh();

    public abstract String zzi(Charset charset);

    public abstract void zzj(zzaev zzaevVar) throws IOException;

    public abstract boolean zzk();

    public final int zzm() {
        return this.zzc;
    }

    public final String zzo(Charset charset) {
        if (zzd() == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return zzi(charset);
    }

    public final boolean zzp() {
        return zzd() == 0;
    }

    public final byte[] zzq() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzagq.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
