package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzer {
    private static final Class<?> zza;
    private static final zzfd<?, ?> zzb;
    private static final zzfd<?, ?> zzc;
    private static final zzfd<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzZ(false);
        zzc = zzZ(true);
        zzd = new zzff();
    }

    public static zzfd<?, ?> zzA() {
        return zzb;
    }

    public static zzfd<?, ?> zzB() {
        return zzc;
    }

    public static zzfd<?, ?> zzC() {
        return zzd;
    }

    public static boolean zzD(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static <T, FT extends zzct<FT>> void zzE(zzcq<FT> zzcqVar, T t10, T t11) {
        zzcqVar.zzb(t11);
        throw null;
    }

    public static <T, UT, UB> void zzF(zzfd<UT, UB> zzfdVar, T t10, T t11) {
        zzfdVar.zza(t10, zzfdVar.zzd(zzfdVar.zzb(t10), zzfdVar.zzb(t11)));
    }

    public static <T> void zzG(zzdz zzdzVar, T t10, T t11, long j10) {
        zzdy zzdyVar = (zzdy) zzfn.zzn(t10, j10);
        zzdy zzdyVar2 = (zzdy) zzfn.zzn(t11, j10);
        if (!zzdyVar2.isEmpty()) {
            if (!zzdyVar.zzd()) {
                zzdyVar = zzdyVar.zzb();
            }
            zzdyVar.zza(zzdyVar2);
        }
        zzfn.zzo(t10, j10, zzdyVar);
    }

    public static void zzH(int i10, List<Double> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzz(i10, list, z10);
        }
    }

    public static void zzI(int i10, List<Float> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzy(i10, list, z10);
        }
    }

    public static void zzJ(int i10, List<Long> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzv(i10, list, z10);
        }
    }

    public static void zzK(int i10, List<Long> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzw(i10, list, z10);
        }
    }

    public static void zzL(int i10, List<Long> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzI(i10, list, z10);
        }
    }

    public static void zzM(int i10, List<Long> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzx(i10, list, z10);
        }
    }

    public static void zzN(int i10, List<Long> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzG(i10, list, z10);
        }
    }

    public static void zzO(int i10, List<Integer> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzt(i10, list, z10);
        }
    }

    public static void zzP(int i10, List<Integer> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzE(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List<Integer> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzH(i10, list, z10);
        }
    }

    public static void zzR(int i10, List<Integer> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzu(i10, list, z10);
        }
    }

    public static void zzS(int i10, List<Integer> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzF(i10, list, z10);
        }
    }

    public static void zzT(int i10, List<Integer> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzA(i10, list, z10);
        }
    }

    public static void zzU(int i10, List<Boolean> list, zzcn zzcnVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzB(i10, list, z10);
        }
    }

    public static void zzV(int i10, List<String> list, zzcn zzcnVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzC(i10, list);
        }
    }

    public static void zzW(int i10, List<zzcf> list, zzcn zzcnVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzcnVar.zzD(i10, list);
        }
    }

    public static void zzX(int i10, List<?> list, zzcn zzcnVar, zzep zzepVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzcnVar.zzr(i10, list.get(i11), zzepVar);
            }
        }
    }

    public static void zzY(int i10, List<?> list, zzcn zzcnVar, zzep zzepVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzcnVar.zzs(i10, list.get(i11), zzepVar);
            }
        }
    }

    private static zzfd<?, ?> zzZ(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzfd) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzda.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int zzb(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdtVar = (zzdt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzx(zzdtVar.zzf(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzx(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzc(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzcm.zzu(i10) * list.size()) + zzb(list);
    }

    public static int zzd(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdtVar = (zzdt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzx(zzdtVar.zzf(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzx(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zze(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i10) * size) + zzd(list);
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdt) {
            zzdt zzdtVar = (zzdt) list;
            i10 = 0;
            while (i11 < size) {
                long zzf = zzdtVar.zzf(i11);
                i10 += zzcm.zzx((zzf >> 63) ^ (zzf + zzf));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += zzcm.zzx((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i10) * size) + zzf(list);
    }

    public static int zzh(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdbVar = (zzdb) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzv(zzdbVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzv(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i10) * size) + zzh(list);
    }

    public static int zzj(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdbVar = (zzdb) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzv(zzdbVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzv(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzk(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i10) * size) + zzj(list);
    }

    public static int zzl(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdbVar = (zzdb) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzw(zzdbVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzcm.zzw(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzm(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i10) * size) + zzl(list);
    }

    public static int zzn(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdb) {
            zzdb zzdbVar = (zzdb) list;
            i10 = 0;
            while (i11 < size) {
                int zzd2 = zzdbVar.zzd(i11);
                i10 += zzcm.zzw((zzd2 >> 31) ^ (zzd2 + zzd2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += zzcm.zzw((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzo(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzu(i10) * size) + zzn(list);
    }

    public static int zzp(List<?> list) {
        return list.size() * 4;
    }

    public static int zzq(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzw(i10 << 3) + 4) * size;
    }

    public static int zzr(List<?> list) {
        return list.size() * 8;
    }

    public static int zzs(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzw(i10 << 3) + 8) * size;
    }

    public static int zzt(List<?> list) {
        return list.size();
    }

    public static int zzu(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzcm.zzw(i10 << 3) + 1) * size;
    }

    public static int zzv(int i10, List<?> list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzu = zzcm.zzu(i10) * size;
        if (list instanceof zzdo) {
            zzdo zzdoVar = (zzdo) list;
            while (i11 < size) {
                Object zzg = zzdoVar.zzg(i11);
                if (zzg instanceof zzcf) {
                    zzy2 = zzcm.zzA((zzcf) zzg);
                } else {
                    zzy2 = zzcm.zzy((String) zzg);
                }
                zzu = zzy2 + zzu;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzcf) {
                    zzy = zzcm.zzA((zzcf) obj);
                } else {
                    zzy = zzcm.zzy((String) obj);
                }
                zzu = zzy + zzu;
                i11++;
            }
        }
        return zzu;
    }

    public static int zzw(int i10, Object obj, zzep zzepVar) {
        if (obj instanceof zzdm) {
            int zzw = zzcm.zzw(i10 << 3);
            int zza2 = ((zzdm) obj).zza();
            return a.t(zza2, zza2, zzw);
        }
        return zzcm.zzB((zzee) obj, zzepVar) + zzcm.zzw(i10 << 3);
    }

    public static int zzx(int i10, List<?> list, zzep zzepVar) {
        int zzB;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = zzcm.zzu(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzdm) {
                zzB = zzcm.zzz((zzdm) obj);
            } else {
                zzB = zzcm.zzB((zzee) obj, zzepVar);
            }
            zzu = zzB + zzu;
        }
        return zzu;
    }

    public static int zzy(int i10, List<zzcf> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = zzcm.zzu(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzu += zzcm.zzA(list.get(i11));
        }
        return zzu;
    }

    public static int zzz(int i10, List<zzee> list, zzep zzepVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzcm.zzE(i10, list.get(i12), zzepVar);
        }
        return i11;
    }
}
