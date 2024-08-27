package com.google.android.recaptcha.internal;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzkx extends zzgo implements zzhz {
    private static final zzkx zzb;
    private Object zze;
    private int zzf;
    private long zzk;
    private zzfw zzl;
    private int zzm;
    private zzkm zzn;
    private zzlj zzo;
    private zzjd zzq;
    private zzfw zzs;
    private int zzd = 0;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzgv zzr = zzgo.zzw();

    static {
        zzkx zzkxVar = new zzkx();
        zzb = zzkxVar;
        zzgo.zzC(zzkx.class, zzkxVar);
    }

    private zzkx() {
    }

    public static zzkx zzG(byte[] bArr) throws zzgy {
        return (zzkx) zzgo.zzu(zzb, bArr);
    }

    public static /* synthetic */ void zzJ(zzkx zzkxVar, String str) {
        str.getClass();
        zzkxVar.zzi = str;
    }

    public static /* synthetic */ void zzM(zzkx zzkxVar, zzlj zzljVar) {
        zzljVar.getClass();
        zzkxVar.zzo = zzljVar;
    }

    public static /* synthetic */ void zzP(zzkx zzkxVar, zzkg zzkgVar) {
        zzkgVar.getClass();
        zzkxVar.zze = zzkgVar;
        zzkxVar.zzd = 15;
    }

    public static /* synthetic */ void zzQ(zzkx zzkxVar, String str) {
        str.getClass();
        zzkxVar.zzg = str;
    }

    public static /* synthetic */ void zzR(zzkx zzkxVar, String str) {
        str.getClass();
        zzkxVar.zzh = str;
    }

    public static zzku zzi() {
        return (zzku) zzb.zzp();
    }

    public final String zzH() {
        return this.zzh;
    }

    public final String zzI() {
        return this.zzi;
    }

    public final boolean zzS() {
        return this.zzn != null;
    }

    public final int zzT() {
        int i10 = this.zzm;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Deprecated
    public final long zzf() {
        return this.zzk;
    }

    public final zzkm zzg() {
        zzkm zzkmVar = this.zzn;
        if (zzkmVar == null) {
            return zzkm.zzj();
        }
        return zzkmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzkt zzktVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzku(zzktVar);
                }
                return new zzkx();
            }
            return zzgo.zzz(zzb, "\u0000\u0010\u0001\u0000\u0001\u0010\u0010\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005\t\u0006\t\u0007Ȉ\bȈ\tȈ\n\t\u000b\t\f\u001b\r\t\u000eȈ\u000f<\u0000\u0010<\u0000", new Object[]{"zze", "zzd", "zzf", "zzh", "zzk", "zzm", "zzn", "zzo", "zzp", "zzi", "zzj", "zzl", "zzq", "zzr", zzlm.class, "zzs", "zzg", zzkg.class, zzkd.class});
        }
        return (byte) 1;
    }

    public final zzkw zzj() {
        zzkw zzkwVar;
        int i10 = this.zzf;
        zzkw zzkwVar2 = zzkw.UNKNOWN;
        switch (i10) {
            case 0:
                zzkwVar = zzkw.UNKNOWN;
                break;
            case 1:
                zzkwVar = zzkw.INIT_NATIVE;
                break;
            case 2:
                zzkwVar = zzkw.INIT_NETWORK;
                break;
            case 3:
                zzkwVar = zzkw.INIT_JS;
                break;
            case 4:
                zzkwVar = zzkw.INIT_TOTAL;
                break;
            case 5:
                zzkwVar = zzkw.EXECUTE_NATIVE;
                break;
            case 6:
                zzkwVar = zzkw.EXECUTE_JS;
                break;
            case 7:
                zzkwVar = zzkw.EXECUTE_TOTAL;
                break;
            case 8:
                zzkwVar = zzkw.CHALLENGE_ACCOUNT_NATIVE;
                break;
            case 9:
                zzkwVar = zzkw.CHALLENGE_ACCOUNT_JS;
                break;
            case 10:
                zzkwVar = zzkw.CHALLENGE_ACCOUNT_TOTAL;
                break;
            case 11:
                zzkwVar = zzkw.VERIFY_PIN_NATIVE;
                break;
            case 12:
                zzkwVar = zzkw.VERIFY_PIN_JS;
                break;
            case 13:
                zzkwVar = zzkw.VERIFY_PIN_TOTAL;
                break;
            case 14:
                zzkwVar = zzkw.RUN_PROGRAM;
                break;
            case 15:
                zzkwVar = zzkw.FETCH_ALLOWLIST;
                break;
            case 16:
                zzkwVar = zzkw.JS_LOAD;
                break;
            default:
                zzkwVar = null;
                break;
        }
        if (zzkwVar == null) {
            return zzkw.UNRECOGNIZED;
        }
        return zzkwVar;
    }
}
