package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzla extends zzgo implements zzhz {
    private static final zzla zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzla zzlaVar = new zzla();
        zzb = zzlaVar;
        zzgo.zzC(zzla.class, zzlaVar);
    }

    private zzla() {
    }

    public static zzkz zzf() {
        return (zzkz) zzb.zzp();
    }

    public static /* synthetic */ zzla zzg() {
        return zzb;
    }

    public static zzla zzi(byte[] bArr) throws zzgy {
        return (zzla) zzgo.zzu(zzb, bArr);
    }

    public static /* synthetic */ void zzk(zzla zzlaVar, zzkx zzkxVar) {
        zzkxVar.getClass();
        zzgv zzgvVar = zzlaVar.zzd;
        if (!zzgvVar.zzc()) {
            zzlaVar.zzd = zzgo.zzx(zzgvVar);
        }
        zzlaVar.zzd.add(zzkxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzky zzkyVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzkz(zzkyVar);
                }
                return new zzla();
            }
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzkx.class});
        }
        return (byte) 1;
    }

    public final List zzj() {
        return this.zzd;
    }
}
