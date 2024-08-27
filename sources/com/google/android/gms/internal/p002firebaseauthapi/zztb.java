package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zztb extends zzagk implements zzahq {
    private static final zztb zzb;
    private zzsp zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zztb zztbVar = new zztb();
        zzb = zztbVar;
        zzagk.zzH(zztb.class, zztbVar);
    }

    private zztb() {
    }

    public static zzta zzc() {
        return (zzta) zzb.zzt();
    }

    public static /* synthetic */ void zzf(zztb zztbVar, zzsp zzspVar) {
        zzspVar.getClass();
        zztbVar.zzd = zzspVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsp zzb() {
        zzsp zzspVar = this.zzd;
        if (zzspVar == null) {
            return zzsp.zzd();
        }
        return zzspVar;
    }

    public final zztv zze() {
        zztv zzb2 = zztv.zzb(this.zzg);
        if (zzb2 == null) {
            return zztv.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final boolean zzi() {
        return this.zzd != null;
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
                    return new zzta(zzsyVar);
                }
                return new zztb();
            }
            return zzagk.zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int zzk() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
