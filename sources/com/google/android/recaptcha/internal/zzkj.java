package com.google.android.recaptcha.internal;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzkj extends zzgo implements zzhz {
    private static final zzgu zzb = new zzkh();
    private static final zzkj zzd;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzgt zzk = zzgo.zzv();

    static {
        zzkj zzkjVar = new zzkj();
        zzd = zzkjVar;
        zzgo.zzC(zzkj.class, zzkjVar);
    }

    private zzkj() {
    }

    public static /* synthetic */ void zzG(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzf = str;
    }

    public static /* synthetic */ void zzI(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzh = str;
    }

    public static zzki zzf() {
        return (zzki) zzd.zzp();
    }

    public static /* synthetic */ void zzj(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzi = str;
    }

    public static /* synthetic */ void zzk(zzkj zzkjVar, String str) {
        str.getClass();
        zzkjVar.zzj = str;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new zzki(null);
                }
                return new zzkj();
            }
            return zzgo.zzz(zzd, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
