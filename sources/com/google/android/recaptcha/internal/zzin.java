package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzin {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzjf zzc;
    private static final zzjf zzd;
    private static final zzjf zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzZ(false);
        zzd = zzZ(true);
        zze = new zzjh();
    }

    public static zzjf zzA() {
        return zze;
    }

    public static Object zzB(Object obj, int i10, List list, zzgs zzgsVar, Object obj2, zzjf zzjfVar) {
        if (zzgsVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgsVar.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzC(obj, i10, intValue, obj2, zzjfVar);
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
                if (!zzgsVar.zza()) {
                    obj2 = zzC(obj, i10, intValue2, obj2, zzjfVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzC(Object obj, int i10, int i11, Object obj2, zzjf zzjfVar) {
        if (obj2 == null) {
            obj2 = zzjfVar.zzc(obj);
        }
        zzjfVar.zzl(obj2, i10, i11);
        return obj2;
    }

    public static void zzD(zzga zzgaVar, Object obj, Object obj2) {
        zzge zzb2 = zzgaVar.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzgaVar.zzc(obj).zzh(zzb2);
        }
    }

    public static void zzE(zzjf zzjfVar, Object obj, Object obj2) {
        zzjfVar.zzo(obj, zzjfVar.zze(zzjfVar.zzd(obj), zzjfVar.zzd(obj2)));
    }

    public static void zzF(Class cls) {
        Class cls2;
        if (!zzgo.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzG(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzc(i10, list, z10);
        }
    }

    public static void zzH(int i10, List list, zzjx zzjxVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zze(i10, list);
        }
    }

    public static void zzI(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzg(i10, list, z10);
        }
    }

    public static void zzJ(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzj(i10, list, z10);
        }
    }

    public static void zzK(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzl(i10, list, z10);
        }
    }

    public static void zzL(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzn(i10, list, z10);
        }
    }

    public static void zzM(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzp(i10, list, z10);
        }
    }

    public static void zzN(int i10, List list, zzjx zzjxVar, zzil zzilVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzfl) zzjxVar).zzq(i10, list.get(i11), zzilVar);
            }
        }
    }

    public static void zzO(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzs(i10, list, z10);
        }
    }

    public static void zzP(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzu(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List list, zzjx zzjxVar, zzil zzilVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzfl) zzjxVar).zzv(i10, list.get(i11), zzilVar);
            }
        }
    }

    public static void zzR(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzy(i10, list, z10);
        }
    }

    public static void zzS(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzA(i10, list, z10);
        }
    }

    public static void zzT(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzC(i10, list, z10);
        }
    }

    public static void zzU(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzE(i10, list, z10);
        }
    }

    public static void zzV(int i10, List list, zzjx zzjxVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzH(i10, list);
        }
    }

    public static void zzW(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzJ(i10, list, z10);
        }
    }

    public static void zzX(int i10, List list, zzjx zzjxVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjxVar.zzL(i10, list, z10);
        }
    }

    public static boolean zzY(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    private static zzjf zzZ(boolean z10) {
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
            return (zzjf) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfk.zzy(i10 << 3) + 1) * size;
    }

    public static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzfk.zzy(i10 << 3) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int zzd2 = ((zzez) list.get(i11)).zzd();
            zzy = a.z(zzd2, zzd2, zzy);
        }
        return zzy;
    }

    public static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfk.zzy(i10 << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzu(zzgpVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzu(((Integer) list.get(i11)).intValue());
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
        return (zzfk.zzy(i10 << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfk.zzy(i10 << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i10, List list, zzil zzilVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzfk.zzt(i10, (zzhy) list.get(i12), zzilVar);
        }
        return i11;
    }

    public static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfk.zzy(i10 << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzu(zzgpVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzfk.zzy(i10 << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzz(zzhnVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzn(int i10, Object obj, zzil zzilVar) {
        if (obj instanceof zzhe) {
            int i11 = zzfk.zzb;
            int zza2 = ((zzhe) obj).zza();
            return zzfk.zzy(i10 << 3) + zzfk.zzy(zza2) + zza2;
        }
        return zzfk.zzy(i10 << 3) + zzfk.zzw((zzhy) obj, zzilVar);
    }

    public static int zzo(int i10, List list, zzil zzilVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzfk.zzy(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzhe) {
                int zza2 = ((zzhe) obj).zza();
                zzy = a.z(zza2, zza2, zzy);
            } else {
                zzy = zzfk.zzw((zzhy) obj, zzilVar) + zzy;
            }
        }
        return zzy;
    }

    public static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfk.zzy(i10 << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                int zze2 = zzgpVar.zze(i11);
                i10 += zzfk.zzy((zze2 >> 31) ^ (zze2 + zze2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzfk.zzy((intValue >> 31) ^ (intValue + intValue));
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
        return (zzfk.zzy(i10 << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            i10 = 0;
            while (i11 < size) {
                long zze2 = zzhnVar.zze(i11);
                i10 += zzfk.zzz((zze2 >> 63) ^ (zze2 + zze2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzfk.zzz((longValue >> 63) ^ (longValue + longValue));
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
        int i12 = zzfk.zzb;
        boolean z10 = list instanceof zzhg;
        int zzy = zzfk.zzy(i10 << 3) * size;
        if (z10) {
            zzhg zzhgVar = (zzhg) list;
            while (i11 < size) {
                Object zzf = zzhgVar.zzf(i11);
                if (zzf instanceof zzez) {
                    int zzd2 = ((zzez) zzf).zzd();
                    zzy = a.z(zzd2, zzd2, zzy);
                } else {
                    zzy = zzfk.zzx((String) zzf) + zzy;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzez) {
                    int zzd3 = ((zzez) obj).zzd();
                    zzy = a.z(zzd3, zzd3, zzy);
                } else {
                    zzy = zzfk.zzx((String) obj) + zzy;
                }
                i11++;
            }
        }
        return zzy;
    }

    public static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfk.zzy(i10 << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgpVar = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzy(zzgpVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzy(((Integer) list.get(i11)).intValue());
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
        return (zzfk.zzy(i10 << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhnVar = (zzhn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzz(zzhnVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzjf zzy() {
        return zzc;
    }

    public static zzjf zzz() {
        return zzd;
    }
}
