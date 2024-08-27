package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzth extends zzagk implements zzahq {
    private static final zzth zzb;
    private int zzd;
    private zzagp zze = zzagk.zzA();

    static {
        zzth zzthVar = new zzth();
        zzb = zzthVar;
        zzagk.zzH(zzth.class, zzthVar);
    }

    private zzth() {
    }

    public static zzte zza() {
        return (zzte) zzb.zzt();
    }

    public static /* synthetic */ void zze(zzth zzthVar, zztg zztgVar) {
        zztgVar.getClass();
        zzagp zzagpVar = zzthVar.zze;
        if (!zzagpVar.zzc()) {
            zzthVar.zze = zzagk.zzB(zzagpVar);
        }
        zzthVar.zze.add(zztgVar);
    }

    public final zztg zzb(int i10) {
        return (zztg) this.zze.get(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zztd zztdVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzte(zztdVar);
                }
                return new zzth();
            }
            return zzagk.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zztg.class});
        }
        return (byte) 1;
    }
}
