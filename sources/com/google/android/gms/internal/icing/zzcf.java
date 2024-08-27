package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzcf implements Iterable<Byte>, Serializable {
    public static final zzcf zzb = new zzcd(zzdh.zzc);
    private static final Comparator<zzcf> zzc;
    private static final zzce zzd;
    private int zza = 0;

    static {
        int i10 = zzbu.zza;
        zzd = new zzce(null);
        zzc = new zzby();
    }

    public static zzcf zzj(String str) {
        return new zzcd(str.getBytes(zzdh.zza));
    }

    public static int zzm(int i10, int i11, int i12) {
        if (((i12 - i11) | i11) >= 0) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("End index: ");
        sb2.append(i11);
        sb2.append(" >= ");
        sb2.append(i12);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 == 0) {
            int zzc2 = zzc();
            i10 = zzi(zzc2, 0, zzc2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zza = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzbx(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        if (zzc() <= 50) {
            concat = zzfb.zza(this);
        } else {
            concat = String.valueOf(zzfb.zza(zze(0, 47))).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzc();

    public abstract zzcf zze(int i10, int i11);

    public abstract void zzf(zzbw zzbwVar) throws IOException;

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public abstract int zzi(int i10, int i11, int i12);

    public final String zzk(Charset charset) {
        if (zzc() == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return zzg(charset);
    }

    public final int zzl() {
        return this.zza;
    }
}
