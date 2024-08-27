package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzai {

    @NotNull
    public static final zzai zza = new zzai();

    @NotNull
    private static final HashMap zzb = new HashMap();

    private zzai() {
    }

    public static final void zza(@NotNull zzaf zzafVar, Long l10, int i10) {
        zzah zzahVar = (zzah) zzb.get(zzafVar);
        if (zzahVar != null) {
            zzkf zzf = zzkg.zzf();
            zzf.zze(i10);
            if (l10 != null) {
                zzf.zzd(zzjy.zza(l10.longValue() - zzahVar.zza()));
            }
            zzahVar.zzb().zzd((zzkg) zzf.zzj());
        }
    }

    public static final void zzb(@NotNull zzaf zzafVar, @NotNull String str, @NotNull zzs zzsVar) {
        zzb.put(zzafVar, new zzah(zzafVar, str, zzsVar));
    }

    public static final void zzc(@NotNull zzaf zzafVar, @NotNull Context context, @NotNull zzr zzrVar) {
        zze(zzafVar, 3, null, context, zzrVar);
    }

    public static final void zzd(@NotNull zzaf zzafVar, @NotNull String str, int i10, @NotNull Context context, @NotNull zzr zzrVar, String str2) {
        zzkl zzg = zzkm.zzg();
        zzg.zzp(str);
        zzg.zzd(i10);
        if (str2 != null) {
            zzg.zze(str2);
        }
        zze(zzafVar, 4, (zzkm) zzg.zzj(), context, zzrVar);
    }

    private static final void zze(zzaf zzafVar, int i10, zzkm zzkmVar, Context context, zzr zzrVar) {
        zzl zzlVar;
        HashMap hashMap = zzb;
        zzah zzahVar = (zzah) hashMap.get(zzafVar);
        if (zzahVar != null) {
            zzkx zzc = zzahVar.zzc(i10, zzkmVar, context);
            zzj zzjVar = zzj.zza;
            zzkw zza2 = zzafVar.zza();
            long zzf = zzc.zzf() * 1000;
            zzkw zzkwVar = zzkw.UNKNOWN;
            int ordinal = zza2.ordinal();
            if (ordinal != 14) {
                switch (ordinal) {
                    case 1:
                        zzlVar = zzl.zzd;
                        break;
                    case 2:
                        zzlVar = zzl.zze;
                        break;
                    case 3:
                        zzlVar = zzl.zzf;
                        break;
                    case 4:
                        zzlVar = zzl.zzg;
                        break;
                    case 5:
                        zzlVar = zzl.zzh;
                        break;
                    case 6:
                        zzlVar = zzl.zzi;
                        break;
                    case 7:
                        zzlVar = zzl.zzj;
                        break;
                    default:
                        zzlVar = zzl.zzb;
                        break;
                }
            } else {
                zzlVar = zzl.zzk;
            }
            zzj.zza(zzlVar.zza(), zzf);
            new zzao(context, new zzaq(zzrVar.zzc()), null, 4, null).zzf(zzc);
        }
    }
}
