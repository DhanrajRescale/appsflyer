package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzsp extends zzagk implements zzahq {
    private static final zzsp zzb;
    private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzaff zze = zzaff.zzb;
    private int zzf;

    static {
        zzsp zzspVar = new zzsp();
        zzb = zzspVar;
        zzagk.zzH(zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    public static zzsm zza() {
        return (zzsm) zzb.zzt();
    }

    public static zzsp zzd() {
        return zzb;
    }

    public final zzso zzb() {
        zzso zzsoVar;
        int i10 = this.zzf;
        zzso zzsoVar2 = zzso.UNKNOWN_KEYMATERIAL;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            zzsoVar = null;
                        } else {
                            zzsoVar = zzso.REMOTE;
                        }
                    } else {
                        zzsoVar = zzso.ASYMMETRIC_PUBLIC;
                    }
                } else {
                    zzsoVar = zzso.ASYMMETRIC_PRIVATE;
                }
            } else {
                zzsoVar = zzso.SYMMETRIC;
            }
        } else {
            zzsoVar = zzso.UNKNOWN_KEYMATERIAL;
        }
        if (zzsoVar == null) {
            return zzso.UNRECOGNIZED;
        }
        return zzsoVar;
    }

    public final zzaff zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagk
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzsl zzslVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzsm(zzslVar);
                }
                return new zzsp();
            }
            return zzagk.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
