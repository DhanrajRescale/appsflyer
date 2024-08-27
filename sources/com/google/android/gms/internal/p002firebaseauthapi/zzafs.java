package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzafs extends zzaev {
    private static final Logger zza = Logger.getLogger(zzafs.class.getName());
    private static final boolean zzb = zzajf.zzx();
    public static final /* synthetic */ int zzf = 0;
    zzaft zze;

    private zzafs() {
    }

    public static int zzA(int i10) {
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

    public static int zzB(long j10) {
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
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static zzafs zzC(byte[] bArr, int i10, int i11) {
        return new zzafo(bArr, 0, i11);
    }

    @Deprecated
    public static int zzw(int i10, zzahp zzahpVar, zzaib zzaibVar) {
        int zzn = ((zzaep) zzahpVar).zzn(zzaibVar);
        int zzA = zzA(i10 << 3);
        return zzA + zzA + zzn;
    }

    public static int zzx(int i10) {
        if (i10 >= 0) {
            return zzA(i10);
        }
        return 10;
    }

    public static int zzy(zzahp zzahpVar, zzaib zzaibVar) {
        int zzn = ((zzaep) zzahpVar).zzn(zzaibVar);
        return zzA(zzn) + zzn;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzajk.zzc(str);
        } catch (zzajj unused) {
            length = str.getBytes(zzagq.zzb).length;
        }
        return zzA(length) + length;
    }

    public final void zzD() {
        if (zzb() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzajj zzajjVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzajjVar);
        byte[] bytes = str.getBytes(zzagq.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzafp(e10);
        }
    }

    public abstract void zzI() throws IOException;

    public abstract void zzJ(byte b10) throws IOException;

    public abstract void zzK(int i10, boolean z10) throws IOException;

    public abstract void zzL(int i10, zzaff zzaffVar) throws IOException;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaev
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j10) throws IOException;

    public abstract void zzk(long j10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    public abstract void zzn(int i10, zzahp zzahpVar, zzaib zzaibVar) throws IOException;

    public abstract void zzo(int i10, String str) throws IOException;

    public abstract void zzq(int i10, int i11) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(int i10, long j10) throws IOException;

    public abstract void zzu(long j10) throws IOException;

    public /* synthetic */ zzafs(zzafr zzafrVar) {
    }
}
