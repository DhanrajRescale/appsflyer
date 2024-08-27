package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzcm extends zzbw {
    private static final Logger zzb = Logger.getLogger(zzcm.class.getName());
    private static final boolean zzc = zzfn.zza();
    zzcn zza;

    private zzcm() {
    }

    public static int zzA(zzcf zzcfVar) {
        int zzc2 = zzcfVar.zzc();
        return zzw(zzc2) + zzc2;
    }

    public static int zzB(zzee zzeeVar, zzep zzepVar) {
        zzbs zzbsVar = (zzbs) zzeeVar;
        int zzi = zzbsVar.zzi();
        if (zzi == -1) {
            zzi = zzepVar.zzd(zzbsVar);
            zzbsVar.zzj(zzi);
        }
        return zzw(zzi) + zzi;
    }

    @Deprecated
    public static int zzE(int i10, zzee zzeeVar, zzep zzepVar) {
        int zzw = zzw(i10 << 3);
        int i11 = zzw + zzw;
        zzbs zzbsVar = (zzbs) zzeeVar;
        int zzi = zzbsVar.zzi();
        if (zzi == -1) {
            zzi = zzepVar.zzd(zzbsVar);
            zzbsVar.zzj(zzi);
        }
        return i11 + zzi;
    }

    public static zzcm zzt(byte[] bArr) {
        return new zzck(bArr, 0, bArr.length);
    }

    public static int zzu(int i10) {
        return zzw(i10 << 3);
    }

    public static int zzv(int i10) {
        if (i10 >= 0) {
            return zzw(i10);
        }
        return 10;
    }

    public static int zzw(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzx(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzfr.zzc(str);
        } catch (zzfq unused) {
            length = str.getBytes(zzdh.zza).length;
        }
        return zzw(length) + length;
    }

    public static int zzz(zzdm zzdmVar) {
        int zza = zzdmVar.zza();
        return zzw(zza) + zza;
    }

    public final void zzC() {
        if (zzs() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzfq zzfqVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzfqVar);
        byte[] bytes = str.getBytes(zzdh.zza);
        try {
            int length = bytes.length;
            zzl(length);
            zzq(bytes, 0, length);
        } catch (zzcl e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new zzcl(e11);
        }
    }

    public abstract void zza(int i10, int i11) throws IOException;

    public abstract void zzb(int i10, int i11) throws IOException;

    public abstract void zzc(int i10, int i11) throws IOException;

    public abstract void zzd(int i10, int i11) throws IOException;

    public abstract void zze(int i10, long j10) throws IOException;

    public abstract void zzf(int i10, long j10) throws IOException;

    public abstract void zzg(int i10, boolean z10) throws IOException;

    public abstract void zzh(int i10, String str) throws IOException;

    public abstract void zzi(int i10, zzcf zzcfVar) throws IOException;

    public abstract void zzj(byte b10) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(int i10) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    public abstract void zzn(long j10) throws IOException;

    public abstract void zzo(long j10) throws IOException;

    public abstract void zzq(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzs();

    public /* synthetic */ zzcm(zzcj zzcjVar) {
    }
}
