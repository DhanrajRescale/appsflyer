package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaid {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzaiv zzc;
    private static final zzaiv zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzaiv zzaivVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzaivVar = (zzaiv) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzaivVar;
        zzd = new zzaix();
    }

    public static Object zzA(Object obj, int i10, List list, zzago zzagoVar, Object obj2, zzaiv zzaivVar) {
        if (zzagoVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzagoVar.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzB(obj, i10, intValue, obj2, zzaivVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzagoVar.zza()) {
                    obj2 = zzB(obj, i10, intValue2, obj2, zzaivVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzB(Object obj, int i10, int i11, Object obj2, zzaiv zzaivVar) {
        if (obj2 == null) {
            obj2 = zzaivVar.zzc(obj);
        }
        zzaivVar.zzl(obj2, i10, i11);
        return obj2;
    }

    public static void zzC(zzaiv zzaivVar, Object obj, Object obj2) {
        zzaivVar.zzo(obj, zzaivVar.zze(zzaivVar.zzd(obj), zzaivVar.zzd(obj2)));
    }

    public static void zzD(Class cls) {
        Class cls2;
        if (!zzagk.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void zzF(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzc(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzaft zzaftVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zze(i10, list);
        }
    }

    public static void zzH(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzg(i10, list, z10);
        }
    }

    public static void zzI(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzj(i10, list, z10);
        }
    }

    public static void zzJ(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzl(i10, list, z10);
        }
    }

    public static void zzK(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzn(i10, list, z10);
        }
    }

    public static void zzL(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzp(i10, list, z10);
        }
    }

    public static void zzM(int i10, List list, zzaft zzaftVar, zzaib zzaibVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzaftVar.zzq(i10, list.get(i11), zzaibVar);
            }
        }
    }

    public static void zzN(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzs(i10, list, z10);
        }
    }

    public static void zzO(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzu(i10, list, z10);
        }
    }

    public static void zzP(int i10, List list, zzaft zzaftVar, zzaib zzaibVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzaftVar.zzv(i10, list.get(i11), zzaibVar);
            }
        }
    }

    public static void zzQ(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzx(i10, list, z10);
        }
    }

    public static void zzR(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzz(i10, list, z10);
        }
    }

    public static void zzS(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzB(i10, list, z10);
        }
    }

    public static void zzT(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzD(i10, list, z10);
        }
    }

    public static void zzU(int i10, List list, zzaft zzaftVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzG(i10, list);
        }
    }

    public static void zzV(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzI(i10, list, z10);
        }
    }

    public static void zzW(int i10, List list, zzaft zzaftVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzaftVar.zzK(i10, list, z10);
        }
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) + 1) * size;
    }

    public static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzA = zzafs.zzA(i10 << 3) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int zzd2 = ((zzaff) list.get(i11)).zzd();
            zzA = a.a(zzd2, zzd2, zzA);
        }
        return zzA;
    }

    public static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzx(zzaglVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i10, List list, zzaib zzaibVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzafs.zzw(i10, (zzahp) list.get(i12), zzaibVar);
        }
        return i11;
    }

    public static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzx(zzaglVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzB(zzaheVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzn(int i10, Object obj, zzaib zzaibVar) {
        if (obj instanceof zzagv) {
            int i11 = zzafs.zzf;
            int zza2 = ((zzagv) obj).zza();
            return zzafs.zzA(i10 << 3) + zzafs.zzA(zza2) + zza2;
        }
        return zzafs.zzA(i10 << 3) + zzafs.zzy((zzahp) obj, zzaibVar);
    }

    public static int zzo(int i10, List list, zzaib zzaibVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzA = zzafs.zzA(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzagv) {
                int zza2 = ((zzagv) obj).zza();
                zzA = a.a(zza2, zza2, zzA);
            } else {
                zzA = zzafs.zzy((zzahp) obj, zzaibVar) + zzA;
            }
        }
        return zzA;
    }

    public static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzaglVar.zze(i11);
                i10 += zzafs.zzA((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzafs.zzA((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzaheVar.zze(i11);
                i10 += zzafs.zzB((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzafs.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzt(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzagx;
        int zzA = zzafs.zzA(i10 << 3) * size;
        if (z10) {
            zzagx zzagxVar = (zzagx) list;
            while (i11 < size) {
                Object zzf = zzagxVar.zzf(i11);
                if (zzf instanceof zzaff) {
                    int zzd2 = ((zzaff) zzf).zzd();
                    zzA = a.a(zzd2, zzd2, zzA);
                } else {
                    zzA = zzafs.zzz((String) zzf) + zzA;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzaff) {
                    int zzd3 = ((zzaff) obj).zzd();
                    zzA = a.a(zzd3, zzd3, zzA);
                } else {
                    zzA = zzafs.zzz((String) obj) + zzA;
                }
                i11++;
            }
        }
        return zzA;
    }

    public static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagl) {
            zzagl zzaglVar = (zzagl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzA(zzaglVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzafs.zzA(i10 << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzahe) {
            zzahe zzaheVar = (zzahe) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzB(zzaheVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzafs.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzaiv zzy() {
        return zzc;
    }

    public static zzaiv zzz() {
        return zzd;
    }
}
