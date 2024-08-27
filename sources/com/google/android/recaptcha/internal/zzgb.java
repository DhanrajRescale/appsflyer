package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgb extends zzga {
    @Override // com.google.android.recaptcha.internal.zzga
    public final int zza(Map.Entry entry) {
        return ((zzgl) entry.getKey()).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final zzge zzb(Object obj) {
        return ((zzgk) obj).zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final zzge zzc(Object obj) {
        return ((zzgk) obj).zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final Object zzd(zzfz zzfzVar, zzhy zzhyVar, int i10) {
        return zzfzVar.zza(zzhyVar, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final Object zze(Object obj, zzik zzikVar, Object obj2, zzfz zzfzVar, zzge zzgeVar, Object obj3, zzjf zzjfVar) throws IOException {
        Object zze;
        zzgm zzgmVar = (zzgm) obj2;
        zzjv zzjvVar = zzgmVar.zzb.zzb;
        Object obj4 = null;
        if (zzjvVar != zzjv.zzn) {
            switch (zzjvVar.ordinal()) {
                case 0:
                    obj4 = Double.valueOf(zzikVar.zza());
                    break;
                case 1:
                    obj4 = Float.valueOf(zzikVar.zzb());
                    break;
                case 2:
                    obj4 = Long.valueOf(zzikVar.zzl());
                    break;
                case 3:
                    obj4 = Long.valueOf(zzikVar.zzo());
                    break;
                case 4:
                    obj4 = Integer.valueOf(zzikVar.zzg());
                    break;
                case 5:
                    obj4 = Long.valueOf(zzikVar.zzk());
                    break;
                case 6:
                    obj4 = Integer.valueOf(zzikVar.zzf());
                    break;
                case 7:
                    obj4 = Boolean.valueOf(zzikVar.zzN());
                    break;
                case 8:
                    obj4 = zzikVar.zzr();
                    break;
                case 9:
                    Object zze2 = zzgeVar.zze(zzgmVar.zzb);
                    if (zze2 instanceof zzgo) {
                        zzil zzb = zzih.zza().zzb(zze2.getClass());
                        if (!((zzgo) zze2).zzF()) {
                            Object zze3 = zzb.zze();
                            zzb.zzg(zze3, zze2);
                            zzgeVar.zzi(zzgmVar.zzb, zze3);
                            zze2 = zze3;
                        }
                        zzikVar.zzt(zze2, zzb, zzfzVar);
                        return obj3;
                    }
                    throw null;
                case 10:
                    Object zze4 = zzgeVar.zze(zzgmVar.zzb);
                    if (zze4 instanceof zzgo) {
                        zzil zzb2 = zzih.zza().zzb(zze4.getClass());
                        if (!((zzgo) zze4).zzF()) {
                            Object zze5 = zzb2.zze();
                            zzb2.zzg(zze5, zze4);
                            zzgeVar.zzi(zzgmVar.zzb, zze5);
                            zze4 = zze5;
                        }
                        zzikVar.zzu(zze4, zzb2, zzfzVar);
                        return obj3;
                    }
                    throw null;
                case 11:
                    obj4 = zzikVar.zzp();
                    break;
                case 12:
                    obj4 = Integer.valueOf(zzikVar.zzj());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    obj4 = Integer.valueOf(zzikVar.zzh());
                    break;
                case 15:
                    obj4 = Long.valueOf(zzikVar.zzm());
                    break;
                case 16:
                    obj4 = Integer.valueOf(zzikVar.zzi());
                    break;
                case 17:
                    obj4 = Long.valueOf(zzikVar.zzn());
                    break;
            }
            int ordinal = zzgmVar.zzb.zzb.ordinal();
            if ((ordinal == 9 || ordinal == 10) && (zze = zzgeVar.zze(zzgmVar.zzb)) != null) {
                byte[] bArr = zzgw.zzd;
                obj4 = ((zzhy) zze).zzW().zzc((zzhy) obj4).zzk();
            }
            zzgeVar.zzi(zzgmVar.zzb, obj4);
            return obj3;
        }
        zzikVar.zzg();
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzf(Object obj) {
        ((zzgk) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzg(zzik zzikVar, Object obj, zzfz zzfzVar, zzge zzgeVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzh(zzez zzezVar, Object obj, zzfz zzfzVar, zzge zzgeVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzi(zzjx zzjxVar, Map.Entry entry) throws IOException {
        zzgl zzglVar = (zzgl) entry.getKey();
        zzjv zzjvVar = zzjv.zza;
        switch (zzglVar.zzb.ordinal()) {
            case 0:
                zzjxVar.zzf(zzglVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzjxVar.zzo(zzglVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzjxVar.zzt(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzjxVar.zzK(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzjxVar.zzr(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzjxVar.zzm(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzjxVar.zzk(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzjxVar.zzb(zzglVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzjxVar.zzG(zzglVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzjxVar.zzq(zzglVar.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzjxVar.zzv(zzglVar.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzjxVar.zzd(zzglVar.zza, (zzez) entry.getValue());
                return;
            case 12:
                zzjxVar.zzI(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzjxVar.zzr(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzjxVar.zzx(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzjxVar.zzz(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzjxVar.zzB(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzjxVar.zzD(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzga
    public final boolean zzj(zzhy zzhyVar) {
        return zzhyVar instanceof zzgk;
    }
}
