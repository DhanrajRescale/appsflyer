package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzbu {
    private final zzsu zza;

    private zzbu(zzsu zzsuVar) {
        this.zza = zzsuVar;
    }

    public static zzbu zze(String str, byte[] bArr, int i10) {
        zztv zztvVar;
        zzst zza = zzsu.zza();
        zza.zzb(str);
        zzaff zzaffVar = zzaff.zzb;
        zza.zzc(zzaff.zzn(bArr, 0, bArr.length));
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    zztvVar = zztv.CRUNCHY;
                } else {
                    zztvVar = zztv.RAW;
                }
            } else {
                zztvVar = zztv.LEGACY;
            }
        } else {
            zztvVar = zztv.TINK;
        }
        zza.zza(zztvVar);
        return new zzbu((zzsu) zza.zzi());
    }

    public final zzsu zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzq();
    }

    public final int zzd() {
        zztv zzd = this.zza.zzd();
        zztv zztvVar = zztv.UNKNOWN_PREFIX;
        int ordinal = zzd.ordinal();
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
