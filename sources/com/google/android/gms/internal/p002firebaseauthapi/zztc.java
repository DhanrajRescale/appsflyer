package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class zztc extends zzagk implements zzahq {
    private static final zztc zzb;
    private int zzd;
    private zzagp zze = zzagk.zzA();

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zzagk.zzH(zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zzsz zzc() {
        return (zzsz) zzb.zzt();
    }

    public static zztc zzf(InputStream inputStream, zzafx zzafxVar) throws IOException {
        return (zztc) zzagk.zzy(zzb, inputStream, zzafxVar);
    }

    public static zztc zzg(byte[] bArr, zzafx zzafxVar) throws zzags {
        return (zztc) zzagk.zzz(zzb, bArr, zzafxVar);
    }

    public static /* synthetic */ void zzk(zztc zztcVar, zztb zztbVar) {
        zztbVar.getClass();
        zzagp zzagpVar = zztcVar.zze;
        if (!zzagpVar.zzc()) {
            zztcVar.zze = zzagk.zzB(zzagpVar);
        }
        zztcVar.zze.add(zztbVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    public final int zzb() {
        return this.zzd;
    }

    public final zztb zzd(int i10) {
        return (zztb) this.zze.get(i10);
    }

    public final List zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzsy zzsyVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzsz(zzsyVar);
                }
                return new zztc();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zztb.class});
        }
        return (byte) 1;
    }
}
