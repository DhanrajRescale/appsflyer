package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzl extends zzam {
    private final zzab zzb;

    public zzl(zzab zzabVar) {
        this.zzb = zzabVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzam, com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                return super.zzbU(str, zzgVar, list);
                            }
                            zzh.zzh("setParamValue", 2, list);
                            String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                            zzap zzb = zzgVar.zzb((zzap) list.get(1));
                            this.zzb.zzb().zzg(zzi, zzh.zzf(zzb));
                            return zzb;
                        }
                        zzh.zzh("setEventName", 1, list);
                        zzap zzb2 = zzgVar.zzb((zzap) list.get(0));
                        if (!zzap.zzf.equals(zzb2) && !zzap.zzg.equals(zzb2)) {
                            this.zzb.zzb().zzf(zzb2.zzi());
                            return new zzat(zzb2.zzi());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    zzh.zzh("getTimestamp", 0, list);
                    return new zzah(Double.valueOf(this.zzb.zzb().zza()));
                }
                zzh.zzh("getParams", 0, list);
                Map zze = this.zzb.zzb().zze();
                zzam zzamVar = new zzam();
                for (String str2 : zze.keySet()) {
                    zzamVar.zzr(str2, zzi.zzb(zze.get(str2)));
                }
                return zzamVar;
            }
            zzh.zzh("getParamValue", 1, list);
            return zzi.zzb(this.zzb.zzb().zzc(zzgVar.zzb((zzap) list.get(0)).zzi()));
        }
        zzh.zzh("getEventName", 0, list);
        return new zzat(this.zzb.zzb().zzd());
    }
}
