package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class zzcn {
    private final zzcm zza;

    private zzcn(zzcm zzcmVar) {
        zzdh.zzb(zzcmVar, "output");
        this.zza = zzcmVar;
        zzcmVar.zza = this;
    }

    public static zzcn zza(zzcm zzcmVar) {
        zzcn zzcnVar = zzcmVar.zza;
        if (zzcnVar != null) {
            return zzcnVar;
        }
        return new zzcn(zzcmVar);
    }

    public final void zzA(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzcm.zzv(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzB(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).booleanValue();
                i12++;
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzg(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void zzC(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof zzdo) {
            zzdo zzdoVar = (zzdo) list;
            while (i11 < list.size()) {
                Object zzg = zzdoVar.zzg(i11);
                if (zzg instanceof String) {
                    this.zza.zzh(i10, (String) zzg);
                } else {
                    this.zza.zzi(i10, (zzcf) zzg);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11));
            i11++;
        }
    }

    public final void zzD(int i10, List<zzcf> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzi(i10, list.get(i11));
        }
    }

    public final void zzE(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzcm.zzw(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzc(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzF(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzG(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzo(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzH(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = list.get(i13).intValue();
                i12 += zzcm.zzw((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                zzcm zzcmVar = this.zza;
                int intValue2 = list.get(i11).intValue();
                zzcmVar.zzl((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzcm zzcmVar2 = this.zza;
            int intValue3 = list.get(i11).intValue();
            zzcmVar2.zzc(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void zzI(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = list.get(i13).longValue();
                i12 += zzcm.zzx((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                zzcm zzcmVar = this.zza;
                long longValue2 = list.get(i11).longValue();
                zzcmVar.zzn((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzcm zzcmVar2 = this.zza;
            long longValue3 = list.get(i11).longValue();
            zzcmVar2.zze(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zzd(i10, i11);
    }

    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zze(i10, j10);
    }

    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    public final void zze(int i10, float f10) throws IOException {
        this.zza.zzd(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, int i11) throws IOException {
        this.zza.zzb(i10, i11);
    }

    public final void zzh(int i10, long j10) throws IOException {
        this.zza.zze(i10, j10);
    }

    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzb(i10, i11);
    }

    public final void zzj(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzd(i10, i11);
    }

    public final void zzl(int i10, boolean z10) throws IOException {
        this.zza.zzg(i10, z10);
    }

    public final void zzm(int i10, String str) throws IOException {
        this.zza.zzh(i10, str);
    }

    public final void zzn(int i10, zzcf zzcfVar) throws IOException {
        this.zza.zzi(i10, zzcfVar);
    }

    public final void zzo(int i10, int i11) throws IOException {
        this.zza.zzc(i10, i11);
    }

    public final void zzp(int i10, int i11) throws IOException {
        this.zza.zzc(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void zzq(int i10, long j10) throws IOException {
        this.zza.zze(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzr(int i10, Object obj, zzep zzepVar) throws IOException {
        zzee zzeeVar = (zzee) obj;
        zzck zzckVar = (zzck) this.zza;
        zzckVar.zzl((i10 << 3) | 2);
        zzbs zzbsVar = (zzbs) zzeeVar;
        int zzi = zzbsVar.zzi();
        if (zzi == -1) {
            zzi = zzepVar.zzd(zzbsVar);
            zzbsVar.zzj(zzi);
        }
        zzckVar.zzl(zzi);
        zzepVar.zzi(zzeeVar, zzckVar.zza);
    }

    public final void zzs(int i10, Object obj, zzep zzepVar) throws IOException {
        zzcm zzcmVar = this.zza;
        zzcmVar.zza(i10, 3);
        zzepVar.zzi((zzee) obj, zzcmVar.zza);
        zzcmVar.zza(i10, 4);
    }

    public final void zzt(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzcm.zzv(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzu(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzv(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzcm.zzx(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzn(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zze(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzw(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzcm.zzx(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzn(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zze(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzx(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzo(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzy(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).floatValue();
                i12 += 4;
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzm(Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public final void zzz(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zza(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).doubleValue();
                i12 += 8;
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzo(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }
}
