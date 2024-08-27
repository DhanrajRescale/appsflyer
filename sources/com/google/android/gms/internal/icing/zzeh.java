package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import nn.d;
import s0.g;
import sun.misc.Unsafe;
import v.e;

/* loaded from: classes2.dex */
final class zzeh<T> implements zzep<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfn.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzee zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzds zzk;
    private final zzfd<?, ?> zzl;
    private final zzcq<?> zzm;
    private final zzej zzn;
    private final zzdz zzo;

    /* JADX WARN: Multi-variable type inference failed */
    private zzeh(int[] iArr, int[] iArr2, Object[] objArr, int i10, int i11, zzee zzeeVar, boolean z10, boolean z11, int[] iArr3, int i12, int i13, zzej zzejVar, zzds zzdsVar, zzfd<?, ?> zzfdVar, zzcq<?> zzcqVar, zzdz zzdzVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zzg = zzeeVar;
        boolean z12 = false;
        if (zzfdVar != 0 && zzfdVar.zza(i11)) {
            z12 = true;
        }
        this.zzf = z12;
        this.zzh = z11;
        this.zzi = iArr3;
        this.zzj = i12;
        this.zzn = i13;
        this.zzk = zzejVar;
        this.zzl = zzdsVar;
        this.zzm = zzfdVar;
        this.zze = i11;
        this.zzo = zzcqVar;
    }

    private final boolean zzA(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzB(t10, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzB(T t10, int i10) {
        int zzs = zzs(i10);
        long j10 = zzs & 1048575;
        if (j10 == 1048575) {
            int zzr = zzr(i10);
            long j11 = zzr & 1048575;
            switch (zzt(zzr)) {
                case 0:
                    if (zzfn.zzl(t10, j11) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (zzfn.zzj(t10, j11) == g.f34069a) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzfn.zzf(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzfn.zzf(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzfn.zzd(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzfn.zzf(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzfn.zzd(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzfn.zzh(t10, j11);
                case 8:
                    Object zzn = zzfn.zzn(t10, j11);
                    if (zzn instanceof String) {
                        if (((String) zzn).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzn instanceof zzcf) {
                        if (zzcf.zzb.equals(zzn)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzfn.zzn(t10, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzcf.zzb.equals(zzfn.zzn(t10, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzfn.zzd(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzfn.zzd(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzfn.zzd(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzfn.zzf(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzfn.zzd(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzfn.zzf(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzfn.zzn(t10, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzfn.zzd(t10, j10) & (1 << (zzs >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final void zzC(T t10, int i10) {
        int zzs = zzs(i10);
        long j10 = 1048575 & zzs;
        if (j10 == 1048575) {
            return;
        }
        zzfn.zze(t10, j10, (1 << (zzs >>> 20)) | zzfn.zzd(t10, j10));
    }

    private final boolean zzD(T t10, int i10, int i11) {
        if (zzfn.zzd(t10, zzs(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private final void zzE(T t10, int i10, int i11) {
        zzfn.zze(t10, zzs(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0040. Please report as an issue. */
    private final void zzF(T t10, zzcn zzcnVar) throws IOException {
        int i10;
        boolean z10;
        if (!this.zzf) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i11 = 1048575;
            int i12 = 1048575;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                int zzr = zzr(i13);
                int i15 = this.zzc[i13];
                int zzt = zzt(zzr);
                if (zzt <= 17) {
                    int i16 = this.zzc[i13 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i12) {
                        i14 = unsafe.getInt(t10, i17);
                        i12 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = zzr & i11;
                switch (zzt) {
                    case 0:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzf(i15, zzfn.zzl(t10, j10));
                            break;
                        }
                    case 1:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zze(i15, zzfn.zzj(t10, j10));
                            break;
                        }
                    case 2:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzc(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 3:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzh(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 4:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzi(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 5:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzj(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 6:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzk(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 7:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzl(i15, zzfn.zzh(t10, j10));
                            break;
                        }
                    case 8:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzH(i15, unsafe.getObject(t10, j10), zzcnVar);
                            break;
                        }
                    case 9:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzr(i15, unsafe.getObject(t10, j10), zzo(i13));
                            break;
                        }
                    case 10:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzn(i15, (zzcf) unsafe.getObject(t10, j10));
                            break;
                        }
                    case 11:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzo(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 12:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzg(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 13:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzb(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 14:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzd(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 15:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzp(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 16:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzq(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 17:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzcnVar.zzs(i15, unsafe.getObject(t10, j10), zzo(i13));
                            break;
                        }
                    case 18:
                        zzer.zzH(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 19:
                        zzer.zzI(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 20:
                        zzer.zzJ(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 21:
                        zzer.zzK(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 22:
                        zzer.zzO(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 23:
                        zzer.zzM(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 24:
                        zzer.zzR(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 25:
                        zzer.zzU(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 26:
                        zzer.zzV(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar);
                        break;
                    case 27:
                        zzer.zzX(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, zzo(i13));
                        break;
                    case 28:
                        zzer.zzW(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar);
                        break;
                    case 29:
                        z10 = false;
                        zzer.zzP(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 30:
                        z10 = false;
                        zzer.zzT(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 31:
                        z10 = false;
                        zzer.zzS(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 32:
                        z10 = false;
                        zzer.zzN(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 33:
                        z10 = false;
                        zzer.zzQ(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 34:
                        z10 = false;
                        zzer.zzL(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, false);
                        break;
                    case 35:
                        zzer.zzH(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 36:
                        zzer.zzI(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 37:
                        zzer.zzJ(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 38:
                        zzer.zzK(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 39:
                        zzer.zzO(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 40:
                        zzer.zzM(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 41:
                        zzer.zzR(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 42:
                        zzer.zzU(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 43:
                        zzer.zzP(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 44:
                        zzer.zzT(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 45:
                        zzer.zzS(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 46:
                        zzer.zzN(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 47:
                        zzer.zzQ(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 48:
                        zzer.zzL(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, true);
                        break;
                    case 49:
                        zzer.zzY(this.zzc[i13], (List) unsafe.getObject(t10, j10), zzcnVar, zzo(i13));
                        break;
                    case 50:
                        zzG(zzcnVar, i15, unsafe.getObject(t10, j10), i13);
                        break;
                    case 51:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzf(i15, zzu(t10, j10));
                        }
                        break;
                    case 52:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zze(i15, zzv(t10, j10));
                        }
                        break;
                    case 53:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzc(i15, zzx(t10, j10));
                        }
                        break;
                    case 54:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzh(i15, zzx(t10, j10));
                        }
                        break;
                    case 55:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzi(i15, zzw(t10, j10));
                        }
                        break;
                    case 56:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzj(i15, zzx(t10, j10));
                        }
                        break;
                    case 57:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzk(i15, zzw(t10, j10));
                        }
                        break;
                    case 58:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzl(i15, zzy(t10, j10));
                        }
                        break;
                    case 59:
                        if (zzD(t10, i15, i13)) {
                            zzH(i15, unsafe.getObject(t10, j10), zzcnVar);
                        }
                        break;
                    case 60:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzr(i15, unsafe.getObject(t10, j10), zzo(i13));
                        }
                        break;
                    case 61:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzn(i15, (zzcf) unsafe.getObject(t10, j10));
                        }
                        break;
                    case 62:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzo(i15, zzw(t10, j10));
                        }
                        break;
                    case 63:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzg(i15, zzw(t10, j10));
                        }
                        break;
                    case 64:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzb(i15, zzw(t10, j10));
                        }
                        break;
                    case 65:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzd(i15, zzx(t10, j10));
                        }
                        break;
                    case 66:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzp(i15, zzw(t10, j10));
                        }
                        break;
                    case 67:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzq(i15, zzx(t10, j10));
                        }
                        break;
                    case 68:
                        if (zzD(t10, i15, i13)) {
                            zzcnVar.zzs(i15, unsafe.getObject(t10, j10), zzo(i13));
                        }
                        break;
                }
                i13 += 3;
                i11 = 1048575;
            }
            zzfd<?, ?> zzfdVar = this.zzl;
            zzfdVar.zzg(zzfdVar.zzb(t10), zzcnVar);
            return;
        }
        this.zzm.zzb(t10);
        throw null;
    }

    private final <K, V> void zzG(zzcn zzcnVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzH(int i10, Object obj, zzcn zzcnVar) throws IOException {
        if (obj instanceof String) {
            zzcnVar.zzm(i10, (String) obj);
        } else {
            zzcnVar.zzn(i10, (zzcf) obj);
        }
    }

    public static <T> zzeh<T> zzg(Class<T> cls, zzeb zzebVar, zzej zzejVar, zzds zzdsVar, zzfd<?, ?> zzfdVar, zzcq<?> zzcqVar, zzdz zzdzVar) {
        if (zzebVar instanceof zzeo) {
            return zzh((zzeo) zzebVar, zzejVar, zzdsVar, zzfdVar, zzcqVar, zzdzVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.icing.zzeh<T> zzh(com.google.android.gms.internal.icing.zzeo r34, com.google.android.gms.internal.icing.zzej r35, com.google.android.gms.internal.icing.zzds r36, com.google.android.gms.internal.icing.zzfd<?, ?> r37, com.google.android.gms.internal.icing.zzcq<?> r38, com.google.android.gms.internal.icing.zzdz r39) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.zzh(com.google.android.gms.internal.icing.zzeo, com.google.android.gms.internal.icing.zzej, com.google.android.gms.internal.icing.zzds, com.google.android.gms.internal.icing.zzfd, com.google.android.gms.internal.icing.zzcq, com.google.android.gms.internal.icing.zzdz):com.google.android.gms.internal.icing.zzeh");
    }

    private static Field zzj(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            e.v(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(d.o(sb2, " not found. Known fields are ", arrays));
        }
    }

    private final void zzk(T t10, T t11, int i10) {
        long zzr = zzr(i10) & 1048575;
        if (!zzB(t11, i10)) {
            return;
        }
        Object zzn = zzfn.zzn(t10, zzr);
        Object zzn2 = zzfn.zzn(t11, zzr);
        if (zzn != null && zzn2 != null) {
            zzfn.zzo(t10, zzr, zzdh.zzi(zzn, zzn2));
            zzC(t10, i10);
        } else if (zzn2 != null) {
            zzfn.zzo(t10, zzr, zzn2);
            zzC(t10, i10);
        }
    }

    private final void zzl(T t10, T t11, int i10) {
        Object obj;
        int zzr = zzr(i10);
        int i11 = this.zzc[i10];
        long j10 = zzr & 1048575;
        if (!zzD(t11, i11, i10)) {
            return;
        }
        if (zzD(t10, i11, i10)) {
            obj = zzfn.zzn(t10, j10);
        } else {
            obj = null;
        }
        Object zzn = zzfn.zzn(t11, j10);
        if (obj != null && zzn != null) {
            zzfn.zzo(t10, j10, zzdh.zzi(obj, zzn));
            zzE(t10, i11, i10);
        } else if (zzn != null) {
            zzfn.zzo(t10, j10, zzn);
            zzE(t10, i11, i10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0040. Please report as an issue. */
    private final int zzm(T t10) {
        int i10;
        int zzw;
        int zzx;
        int i11;
        int zzw2;
        int zzv;
        int zzw3;
        int zzv2;
        boolean z10;
        int zzi;
        int zzw4;
        int zzx2;
        int i12;
        int zzw5;
        int zzv3;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.zzc.length) {
            int zzr = zzr(i15);
            int i18 = this.zzc[i15];
            int zzt = zzt(zzr);
            if (zzt <= 17) {
                int i19 = this.zzc[i15 + 2];
                int i20 = i19 & i13;
                i10 = 1 << (i19 >>> 20);
                if (i20 != i14) {
                    i17 = unsafe.getInt(t10, i20);
                    i14 = i20;
                }
            } else {
                i10 = 0;
            }
            long j10 = zzr & i13;
            switch (zzt) {
                case 0:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(i18 << 3, 8, i16);
                        break;
                    }
                case 1:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(i18 << 3, 4, i16);
                        break;
                    }
                case 2:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(t10, j10);
                        zzw = zzcm.zzw(i18 << 3);
                        zzx = zzcm.zzx(j11);
                        i11 = zzx + zzw;
                        i16 += i11;
                        break;
                    }
                case 3:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(t10, j10);
                        zzw = zzcm.zzw(i18 << 3);
                        zzx = zzcm.zzx(j12);
                        i11 = zzx + zzw;
                        i16 += i11;
                        break;
                    }
                case 4:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(t10, j10);
                        zzw2 = zzcm.zzw(i18 << 3);
                        zzv = zzcm.zzv(i21);
                        i11 = zzv + zzw2;
                        i16 += i11;
                        break;
                    }
                case 5:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(i18 << 3, 8, i16);
                        break;
                    }
                case 6:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(i18 << 3, 4, i16);
                        break;
                    }
                case 7:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(i18 << 3, 1, i16);
                        break;
                    }
                case 8:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t10, j10);
                        if (object instanceof zzcf) {
                            int zzw6 = zzcm.zzw(i18 << 3);
                            int zzc = ((zzcf) object).zzc();
                            i16 = a.u(zzc, zzc, zzw6, i16);
                            break;
                        } else {
                            zzw2 = zzcm.zzw(i18 << 3);
                            zzv = zzcm.zzy((String) object);
                            i11 = zzv + zzw2;
                            i16 += i11;
                            break;
                        }
                    }
                case 9:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzw3 = zzer.zzw(i18, unsafe.getObject(t10, j10), zzo(i15));
                        i16 += zzw3;
                        break;
                    }
                case 10:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzcf zzcfVar = (zzcf) unsafe.getObject(t10, j10);
                        int zzw7 = zzcm.zzw(i18 << 3);
                        int zzc2 = zzcfVar.zzc();
                        i16 = a.u(zzc2, zzc2, zzw7, i16);
                        break;
                    }
                case 11:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(unsafe.getInt(t10, j10), zzcm.zzw(i18 << 3), i16);
                        break;
                    }
                case 12:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(t10, j10);
                        zzw2 = zzcm.zzw(i18 << 3);
                        zzv = zzcm.zzv(i22);
                        i11 = zzv + zzw2;
                        i16 += i11;
                        break;
                    }
                case 13:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(i18 << 3, 4, i16);
                        break;
                    }
                case 14:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i16 = a.t(i18 << 3, 8, i16);
                        break;
                    }
                case 15:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(t10, j10);
                        i16 = a.t((i23 >> 31) ^ (i23 + i23), zzcm.zzw(i18 << 3), i16);
                        break;
                    }
                case 16:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(t10, j10);
                        i11 = zzcm.zzx((j13 >> 63) ^ (j13 + j13)) + zzcm.zzw(i18 << 3);
                        i16 += i11;
                        break;
                    }
                case 17:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        i11 = zzcm.zzE(i18, (zzee) unsafe.getObject(t10, j10), zzo(i15));
                        i16 += i11;
                        break;
                    }
                case 18:
                    zzw3 = zzer.zzs(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 19:
                    zzw3 = zzer.zzq(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 20:
                    zzw3 = zzer.zzc(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 21:
                    zzw3 = zzer.zze(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 22:
                    zzw3 = zzer.zzk(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 23:
                    zzw3 = zzer.zzs(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 24:
                    zzw3 = zzer.zzq(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 25:
                    zzw3 = zzer.zzu(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzw3;
                    break;
                case 26:
                    zzv2 = zzer.zzv(i18, (List) unsafe.getObject(t10, j10));
                    i16 += zzv2;
                    break;
                case 27:
                    zzv2 = zzer.zzx(i18, (List) unsafe.getObject(t10, j10), zzo(i15));
                    i16 += zzv2;
                    break;
                case 28:
                    zzv2 = zzer.zzy(i18, (List) unsafe.getObject(t10, j10));
                    i16 += zzv2;
                    break;
                case 29:
                    zzv2 = zzer.zzm(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzv2;
                    break;
                case 30:
                    z10 = false;
                    zzi = zzer.zzi(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzi;
                    break;
                case 31:
                    z10 = false;
                    zzi = zzer.zzq(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzi;
                    break;
                case 32:
                    z10 = false;
                    zzi = zzer.zzs(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzi;
                    break;
                case 33:
                    z10 = false;
                    zzi = zzer.zzo(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzi;
                    break;
                case 34:
                    z10 = false;
                    zzi = zzer.zzg(i18, (List) unsafe.getObject(t10, j10), false);
                    i16 += zzi;
                    break;
                case 35:
                    int zzr2 = zzer.zzr((List) unsafe.getObject(t10, j10));
                    if (zzr2 > 0) {
                        i16 = a.u(zzr2, zzcm.zzu(i18), zzr2, i16);
                    }
                    break;
                case 36:
                    int zzp = zzer.zzp((List) unsafe.getObject(t10, j10));
                    if (zzp > 0) {
                        i16 = a.u(zzp, zzcm.zzu(i18), zzp, i16);
                    }
                    break;
                case 37:
                    int zzb2 = zzer.zzb((List) unsafe.getObject(t10, j10));
                    if (zzb2 > 0) {
                        i16 = a.u(zzb2, zzcm.zzu(i18), zzb2, i16);
                    }
                    break;
                case 38:
                    int zzd = zzer.zzd((List) unsafe.getObject(t10, j10));
                    if (zzd > 0) {
                        i16 = a.u(zzd, zzcm.zzu(i18), zzd, i16);
                    }
                    break;
                case 39:
                    int zzj = zzer.zzj((List) unsafe.getObject(t10, j10));
                    if (zzj > 0) {
                        i16 = a.u(zzj, zzcm.zzu(i18), zzj, i16);
                    }
                    break;
                case 40:
                    int zzr3 = zzer.zzr((List) unsafe.getObject(t10, j10));
                    if (zzr3 > 0) {
                        i16 = a.u(zzr3, zzcm.zzu(i18), zzr3, i16);
                    }
                    break;
                case 41:
                    int zzp2 = zzer.zzp((List) unsafe.getObject(t10, j10));
                    if (zzp2 > 0) {
                        i16 = a.u(zzp2, zzcm.zzu(i18), zzp2, i16);
                    }
                    break;
                case 42:
                    int zzt2 = zzer.zzt((List) unsafe.getObject(t10, j10));
                    if (zzt2 > 0) {
                        i16 = a.u(zzt2, zzcm.zzu(i18), zzt2, i16);
                    }
                    break;
                case 43:
                    int zzl = zzer.zzl((List) unsafe.getObject(t10, j10));
                    if (zzl > 0) {
                        i16 = a.u(zzl, zzcm.zzu(i18), zzl, i16);
                    }
                    break;
                case 44:
                    int zzh = zzer.zzh((List) unsafe.getObject(t10, j10));
                    if (zzh > 0) {
                        i16 = a.u(zzh, zzcm.zzu(i18), zzh, i16);
                    }
                    break;
                case 45:
                    int zzp3 = zzer.zzp((List) unsafe.getObject(t10, j10));
                    if (zzp3 > 0) {
                        i16 = a.u(zzp3, zzcm.zzu(i18), zzp3, i16);
                    }
                    break;
                case 46:
                    int zzr4 = zzer.zzr((List) unsafe.getObject(t10, j10));
                    if (zzr4 > 0) {
                        i16 = a.u(zzr4, zzcm.zzu(i18), zzr4, i16);
                    }
                    break;
                case 47:
                    int zzn = zzer.zzn((List) unsafe.getObject(t10, j10));
                    if (zzn > 0) {
                        i16 = a.u(zzn, zzcm.zzu(i18), zzn, i16);
                    }
                    break;
                case 48:
                    int zzf = zzer.zzf((List) unsafe.getObject(t10, j10));
                    if (zzf > 0) {
                        i16 = a.u(zzf, zzcm.zzu(i18), zzf, i16);
                    }
                    break;
                case 49:
                    zzv2 = zzer.zzz(i18, (List) unsafe.getObject(t10, j10), zzo(i15));
                    i16 += zzv2;
                    break;
                case 50:
                    zzdz.zza(i18, unsafe.getObject(t10, j10), zzp(i15));
                    break;
                case 51:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(i18 << 3, 8, i16);
                    }
                    break;
                case 52:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(i18 << 3, 4, i16);
                    }
                    break;
                case 53:
                    if (zzD(t10, i18, i15)) {
                        long zzx3 = zzx(t10, j10);
                        zzw4 = zzcm.zzw(i18 << 3);
                        zzx2 = zzcm.zzx(zzx3);
                        i12 = zzx2 + zzw4;
                        i16 += i12;
                    }
                    break;
                case 54:
                    if (zzD(t10, i18, i15)) {
                        long zzx4 = zzx(t10, j10);
                        zzw4 = zzcm.zzw(i18 << 3);
                        zzx2 = zzcm.zzx(zzx4);
                        i12 = zzx2 + zzw4;
                        i16 += i12;
                    }
                    break;
                case 55:
                    if (zzD(t10, i18, i15)) {
                        int zzw8 = zzw(t10, j10);
                        zzw5 = zzcm.zzw(i18 << 3);
                        zzv3 = zzcm.zzv(zzw8);
                        i12 = zzv3 + zzw5;
                        i16 += i12;
                    }
                    break;
                case 56:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(i18 << 3, 8, i16);
                    }
                    break;
                case 57:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(i18 << 3, 4, i16);
                    }
                    break;
                case 58:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(i18 << 3, 1, i16);
                    }
                    break;
                case 59:
                    if (zzD(t10, i18, i15)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        if (object2 instanceof zzcf) {
                            int zzw9 = zzcm.zzw(i18 << 3);
                            int zzc3 = ((zzcf) object2).zzc();
                            i16 = a.u(zzc3, zzc3, zzw9, i16);
                        } else {
                            zzw5 = zzcm.zzw(i18 << 3);
                            zzv3 = zzcm.zzy((String) object2);
                            i12 = zzv3 + zzw5;
                            i16 += i12;
                        }
                    }
                    break;
                case 60:
                    if (zzD(t10, i18, i15)) {
                        zzv2 = zzer.zzw(i18, unsafe.getObject(t10, j10), zzo(i15));
                        i16 += zzv2;
                    }
                    break;
                case 61:
                    if (zzD(t10, i18, i15)) {
                        zzcf zzcfVar2 = (zzcf) unsafe.getObject(t10, j10);
                        int zzw10 = zzcm.zzw(i18 << 3);
                        int zzc4 = zzcfVar2.zzc();
                        i16 = a.u(zzc4, zzc4, zzw10, i16);
                    }
                    break;
                case 62:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(zzw(t10, j10), zzcm.zzw(i18 << 3), i16);
                    }
                    break;
                case 63:
                    if (zzD(t10, i18, i15)) {
                        int zzw11 = zzw(t10, j10);
                        zzw5 = zzcm.zzw(i18 << 3);
                        zzv3 = zzcm.zzv(zzw11);
                        i12 = zzv3 + zzw5;
                        i16 += i12;
                    }
                    break;
                case 64:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(i18 << 3, 4, i16);
                    }
                    break;
                case 65:
                    if (zzD(t10, i18, i15)) {
                        i16 = a.t(i18 << 3, 8, i16);
                    }
                    break;
                case 66:
                    if (zzD(t10, i18, i15)) {
                        int zzw12 = zzw(t10, j10);
                        i16 = a.t((zzw12 >> 31) ^ (zzw12 + zzw12), zzcm.zzw(i18 << 3), i16);
                    }
                    break;
                case 67:
                    if (zzD(t10, i18, i15)) {
                        long zzx5 = zzx(t10, j10);
                        i12 = zzcm.zzx((zzx5 >> 63) ^ (zzx5 + zzx5)) + zzcm.zzw(i18 << 3);
                        i16 += i12;
                    }
                    break;
                case 68:
                    if (zzD(t10, i18, i15)) {
                        i12 = zzcm.zzE(i18, (zzee) unsafe.getObject(t10, j10), zzo(i15));
                        i16 += i12;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        zzfd<?, ?> zzfdVar = this.zzl;
        int zzf2 = i16 + zzfdVar.zzf(zzfdVar.zzb(t10));
        if (!this.zzf) {
            return zzf2;
        }
        this.zzm.zzb(t10);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0037. Please report as an issue. */
    private final int zzn(T t10) {
        int zzw;
        int zzx;
        int zzw2;
        int zzv;
        int zzw3;
        int zzE;
        Unsafe unsafe = zzb;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzr = zzr(i11);
            int zzt = zzt(zzr);
            int i12 = this.zzc[i11];
            long j10 = zzr & 1048575;
            if (zzt >= zzcv.zzJ.zza() && zzt <= zzcv.zzW.zza()) {
                int i13 = this.zzc[i11 + 2];
            }
            switch (zzt) {
                case 0:
                    if (zzB(t10, i11)) {
                        i10 = a.t(i12 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzB(t10, i11)) {
                        i10 = a.t(i12 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzB(t10, i11)) {
                        long zzf = zzfn.zzf(t10, j10);
                        zzw = zzcm.zzw(i12 << 3);
                        zzx = zzcm.zzx(zzf);
                        zzE = zzx + zzw;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzB(t10, i11)) {
                        long zzf2 = zzfn.zzf(t10, j10);
                        zzw = zzcm.zzw(i12 << 3);
                        zzx = zzcm.zzx(zzf2);
                        zzE = zzx + zzw;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzB(t10, i11)) {
                        int zzd = zzfn.zzd(t10, j10);
                        zzw2 = zzcm.zzw(i12 << 3);
                        zzv = zzcm.zzv(zzd);
                        zzE = zzv + zzw2;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzB(t10, i11)) {
                        i10 = a.t(i12 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzB(t10, i11)) {
                        i10 = a.t(i12 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzB(t10, i11)) {
                        i10 = a.t(i12 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzB(t10, i11)) {
                        Object zzn = zzfn.zzn(t10, j10);
                        if (zzn instanceof zzcf) {
                            int zzw4 = zzcm.zzw(i12 << 3);
                            int zzc = ((zzcf) zzn).zzc();
                            i10 = a.u(zzc, zzc, zzw4, i10);
                            break;
                        } else {
                            zzw2 = zzcm.zzw(i12 << 3);
                            zzv = zzcm.zzy((String) zzn);
                            zzE = zzv + zzw2;
                            i10 += zzE;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzB(t10, i11)) {
                        zzw3 = zzer.zzw(i12, zzfn.zzn(t10, j10), zzo(i11));
                        i10 += zzw3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzB(t10, i11)) {
                        zzcf zzcfVar = (zzcf) zzfn.zzn(t10, j10);
                        int zzw5 = zzcm.zzw(i12 << 3);
                        int zzc2 = zzcfVar.zzc();
                        i10 = a.u(zzc2, zzc2, zzw5, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzB(t10, i11)) {
                        i10 = a.t(zzfn.zzd(t10, j10), zzcm.zzw(i12 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzB(t10, i11)) {
                        int zzd2 = zzfn.zzd(t10, j10);
                        zzw2 = zzcm.zzw(i12 << 3);
                        zzv = zzcm.zzv(zzd2);
                        zzE = zzv + zzw2;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzB(t10, i11)) {
                        i10 = a.t(i12 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzB(t10, i11)) {
                        i10 = a.t(i12 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzB(t10, i11)) {
                        int zzd3 = zzfn.zzd(t10, j10);
                        i10 = a.t((zzd3 >> 31) ^ (zzd3 + zzd3), zzcm.zzw(i12 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzB(t10, i11)) {
                        long zzf3 = zzfn.zzf(t10, j10);
                        zzw = zzcm.zzw(i12 << 3);
                        zzx = zzcm.zzx((zzf3 >> 63) ^ (zzf3 + zzf3));
                        zzE = zzx + zzw;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzB(t10, i11)) {
                        zzE = zzcm.zzE(i12, (zzee) zzfn.zzn(t10, j10), zzo(i11));
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzw3 = zzer.zzs(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 19:
                    zzw3 = zzer.zzq(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 20:
                    zzw3 = zzer.zzc(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 21:
                    zzw3 = zzer.zze(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 22:
                    zzw3 = zzer.zzk(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 23:
                    zzw3 = zzer.zzs(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 24:
                    zzw3 = zzer.zzq(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 25:
                    zzw3 = zzer.zzu(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 26:
                    zzw3 = zzer.zzv(i12, (List) zzfn.zzn(t10, j10));
                    i10 += zzw3;
                    break;
                case 27:
                    zzw3 = zzer.zzx(i12, (List) zzfn.zzn(t10, j10), zzo(i11));
                    i10 += zzw3;
                    break;
                case 28:
                    zzw3 = zzer.zzy(i12, (List) zzfn.zzn(t10, j10));
                    i10 += zzw3;
                    break;
                case 29:
                    zzw3 = zzer.zzm(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 30:
                    zzw3 = zzer.zzi(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 31:
                    zzw3 = zzer.zzq(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 32:
                    zzw3 = zzer.zzs(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 33:
                    zzw3 = zzer.zzo(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 34:
                    zzw3 = zzer.zzg(i12, (List) zzfn.zzn(t10, j10), false);
                    i10 += zzw3;
                    break;
                case 35:
                    int zzr2 = zzer.zzr((List) unsafe.getObject(t10, j10));
                    if (zzr2 > 0) {
                        i10 = a.u(zzr2, zzcm.zzu(i12), zzr2, i10);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzp = zzer.zzp((List) unsafe.getObject(t10, j10));
                    if (zzp > 0) {
                        i10 = a.u(zzp, zzcm.zzu(i12), zzp, i10);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzb2 = zzer.zzb((List) unsafe.getObject(t10, j10));
                    if (zzb2 > 0) {
                        i10 = a.u(zzb2, zzcm.zzu(i12), zzb2, i10);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzd4 = zzer.zzd((List) unsafe.getObject(t10, j10));
                    if (zzd4 > 0) {
                        i10 = a.u(zzd4, zzcm.zzu(i12), zzd4, i10);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzj = zzer.zzj((List) unsafe.getObject(t10, j10));
                    if (zzj > 0) {
                        i10 = a.u(zzj, zzcm.zzu(i12), zzj, i10);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzr3 = zzer.zzr((List) unsafe.getObject(t10, j10));
                    if (zzr3 > 0) {
                        i10 = a.u(zzr3, zzcm.zzu(i12), zzr3, i10);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzp2 = zzer.zzp((List) unsafe.getObject(t10, j10));
                    if (zzp2 > 0) {
                        i10 = a.u(zzp2, zzcm.zzu(i12), zzp2, i10);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzt2 = zzer.zzt((List) unsafe.getObject(t10, j10));
                    if (zzt2 > 0) {
                        i10 = a.u(zzt2, zzcm.zzu(i12), zzt2, i10);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzl = zzer.zzl((List) unsafe.getObject(t10, j10));
                    if (zzl > 0) {
                        i10 = a.u(zzl, zzcm.zzu(i12), zzl, i10);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zzh = zzer.zzh((List) unsafe.getObject(t10, j10));
                    if (zzh > 0) {
                        i10 = a.u(zzh, zzcm.zzu(i12), zzh, i10);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzp3 = zzer.zzp((List) unsafe.getObject(t10, j10));
                    if (zzp3 > 0) {
                        i10 = a.u(zzp3, zzcm.zzu(i12), zzp3, i10);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzr4 = zzer.zzr((List) unsafe.getObject(t10, j10));
                    if (zzr4 > 0) {
                        i10 = a.u(zzr4, zzcm.zzu(i12), zzr4, i10);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzn2 = zzer.zzn((List) unsafe.getObject(t10, j10));
                    if (zzn2 > 0) {
                        i10 = a.u(zzn2, zzcm.zzu(i12), zzn2, i10);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzf4 = zzer.zzf((List) unsafe.getObject(t10, j10));
                    if (zzf4 > 0) {
                        i10 = a.u(zzf4, zzcm.zzu(i12), zzf4, i10);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzw3 = zzer.zzz(i12, (List) zzfn.zzn(t10, j10), zzo(i11));
                    i10 += zzw3;
                    break;
                case 50:
                    zzdz.zza(i12, zzfn.zzn(t10, j10), zzp(i11));
                    break;
                case 51:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(i12 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(i12 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(t10, i12, i11)) {
                        long zzx2 = zzx(t10, j10);
                        zzw = zzcm.zzw(i12 << 3);
                        zzx = zzcm.zzx(zzx2);
                        zzE = zzx + zzw;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(t10, i12, i11)) {
                        long zzx3 = zzx(t10, j10);
                        zzw = zzcm.zzw(i12 << 3);
                        zzx = zzcm.zzx(zzx3);
                        zzE = zzx + zzw;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(t10, i12, i11)) {
                        int zzw6 = zzw(t10, j10);
                        zzw2 = zzcm.zzw(i12 << 3);
                        zzv = zzcm.zzv(zzw6);
                        zzE = zzv + zzw2;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(i12 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(i12 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(i12 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzD(t10, i12, i11)) {
                        Object zzn3 = zzfn.zzn(t10, j10);
                        if (zzn3 instanceof zzcf) {
                            int zzw7 = zzcm.zzw(i12 << 3);
                            int zzc3 = ((zzcf) zzn3).zzc();
                            i10 = a.u(zzc3, zzc3, zzw7, i10);
                            break;
                        } else {
                            zzw2 = zzcm.zzw(i12 << 3);
                            zzv = zzcm.zzy((String) zzn3);
                            zzE = zzv + zzw2;
                            i10 += zzE;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzD(t10, i12, i11)) {
                        zzw3 = zzer.zzw(i12, zzfn.zzn(t10, j10), zzo(i11));
                        i10 += zzw3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(t10, i12, i11)) {
                        zzcf zzcfVar2 = (zzcf) zzfn.zzn(t10, j10);
                        int zzw8 = zzcm.zzw(i12 << 3);
                        int zzc4 = zzcfVar2.zzc();
                        i10 = a.u(zzc4, zzc4, zzw8, i10);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(zzw(t10, j10), zzcm.zzw(i12 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(t10, i12, i11)) {
                        int zzw9 = zzw(t10, j10);
                        zzw2 = zzcm.zzw(i12 << 3);
                        zzv = zzcm.zzv(zzw9);
                        zzE = zzv + zzw2;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(i12 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(t10, i12, i11)) {
                        i10 = a.t(i12 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(t10, i12, i11)) {
                        int zzw10 = zzw(t10, j10);
                        i10 = a.t((zzw10 >> 31) ^ (zzw10 + zzw10), zzcm.zzw(i12 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(t10, i12, i11)) {
                        long zzx4 = zzx(t10, j10);
                        zzw = zzcm.zzw(i12 << 3);
                        zzx = zzcm.zzx((zzx4 >> 63) ^ (zzx4 + zzx4));
                        zzE = zzx + zzw;
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(t10, i12, i11)) {
                        zzE = zzcm.zzE(i12, (zzee) zzfn.zzn(t10, j10), zzo(i11));
                        i10 += zzE;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzfd<?, ?> zzfdVar = this.zzl;
        return i10 + zzfdVar.zzf(zzfdVar.zzb(t10));
    }

    private final zzep zzo(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzep zzepVar = (zzep) this.zzd[i12];
        if (zzepVar != null) {
            return zzepVar;
        }
        zzep<T> zzb2 = zzem.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzp(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzq(Object obj, int i10, zzep zzepVar) {
        return zzepVar.zzf(zzfn.zzn(obj, i10 & 1048575));
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static <T> double zzu(T t10, long j10) {
        return ((Double) zzfn.zzn(t10, j10)).doubleValue();
    }

    private static <T> float zzv(T t10, long j10) {
        return ((Float) zzfn.zzn(t10, j10)).floatValue();
    }

    private static <T> int zzw(T t10, long j10) {
        return ((Integer) zzfn.zzn(t10, j10)).intValue();
    }

    private static <T> long zzx(T t10, long j10) {
        return ((Long) zzfn.zzn(t10, j10)).longValue();
    }

    private static <T> boolean zzy(T t10, long j10) {
        return ((Boolean) zzfn.zzn(t10, j10)).booleanValue();
    }

    private final boolean zzz(T t10, T t11, int i10) {
        if (zzB(t10, i10) == zzB(t11, i10)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.icing.zzep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(T r9, T r10) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.zza(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.icing.zzep
    public final int zzb(T t10) {
        int i10;
        int zze;
        int i11;
        int zzd;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzr = zzr(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & zzr;
            int i15 = 37;
            switch (zzt(zzr)) {
                case 0:
                    i10 = i12 * 53;
                    zze = zzdh.zze(Double.doubleToLongBits(zzfn.zzl(t10, j10)));
                    i12 = zze + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    zze = Float.floatToIntBits(zzfn.zzj(t10, j10));
                    i12 = zze + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    zze = zzdh.zze(zzfn.zzf(t10, j10));
                    i12 = zze + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    zze = zzdh.zze(zzfn.zzf(t10, j10));
                    i12 = zze + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    zzd = zzfn.zzd(t10, j10);
                    i12 = i11 + zzd;
                    break;
                case 5:
                    i10 = i12 * 53;
                    zze = zzdh.zze(zzfn.zzf(t10, j10));
                    i12 = zze + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    zzd = zzfn.zzd(t10, j10);
                    i12 = i11 + zzd;
                    break;
                case 7:
                    i10 = i12 * 53;
                    zze = zzdh.zzf(zzfn.zzh(t10, j10));
                    i12 = zze + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    zze = ((String) zzfn.zzn(t10, j10)).hashCode();
                    i12 = zze + i10;
                    break;
                case 9:
                    Object zzn = zzfn.zzn(t10, j10);
                    if (zzn != null) {
                        i15 = zzn.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i10 = i12 * 53;
                    zze = zzfn.zzn(t10, j10).hashCode();
                    i12 = zze + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    zzd = zzfn.zzd(t10, j10);
                    i12 = i11 + zzd;
                    break;
                case 12:
                    i11 = i12 * 53;
                    zzd = zzfn.zzd(t10, j10);
                    i12 = i11 + zzd;
                    break;
                case 13:
                    i11 = i12 * 53;
                    zzd = zzfn.zzd(t10, j10);
                    i12 = i11 + zzd;
                    break;
                case 14:
                    i10 = i12 * 53;
                    zze = zzdh.zze(zzfn.zzf(t10, j10));
                    i12 = zze + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    zzd = zzfn.zzd(t10, j10);
                    i12 = i11 + zzd;
                    break;
                case 16:
                    i10 = i12 * 53;
                    zze = zzdh.zze(zzfn.zzf(t10, j10));
                    i12 = zze + i10;
                    break;
                case 17:
                    Object zzn2 = zzfn.zzn(t10, j10);
                    if (zzn2 != null) {
                        i15 = zzn2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    zze = zzfn.zzn(t10, j10).hashCode();
                    i12 = zze + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    zze = zzfn.zzn(t10, j10).hashCode();
                    i12 = zze + i10;
                    break;
                case 51:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzdh.zze(Double.doubleToLongBits(zzu(t10, j10)));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = Float.floatToIntBits(zzv(t10, j10));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzdh.zze(zzx(t10, j10));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzdh.zze(zzx(t10, j10));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(t10, i14, i13)) {
                        i11 = i12 * 53;
                        zzd = zzw(t10, j10);
                        i12 = i11 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzdh.zze(zzx(t10, j10));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(t10, i14, i13)) {
                        i11 = i12 * 53;
                        zzd = zzw(t10, j10);
                        i12 = i11 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzdh.zzf(zzy(t10, j10));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = ((String) zzfn.zzn(t10, j10)).hashCode();
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzfn.zzn(t10, j10).hashCode();
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzfn.zzn(t10, j10).hashCode();
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(t10, i14, i13)) {
                        i11 = i12 * 53;
                        zzd = zzw(t10, j10);
                        i12 = i11 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(t10, i14, i13)) {
                        i11 = i12 * 53;
                        zzd = zzw(t10, j10);
                        i12 = i11 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(t10, i14, i13)) {
                        i11 = i12 * 53;
                        zzd = zzw(t10, j10);
                        i12 = i11 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzdh.zze(zzx(t10, j10));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(t10, i14, i13)) {
                        i11 = i12 * 53;
                        zzd = zzw(t10, j10);
                        i12 = i11 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzdh.zze(zzx(t10, j10));
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(t10, i14, i13)) {
                        i10 = i12 * 53;
                        zze = zzfn.zzn(t10, j10).hashCode();
                        i12 = zze + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzl.zzb(t10).hashCode() + (i12 * 53);
        if (!this.zzf) {
            return hashCode;
        }
        this.zzm.zzb(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final void zzc(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzr = zzr(i10);
            long j10 = 1048575 & zzr;
            int i11 = this.zzc[i10];
            switch (zzt(zzr)) {
                case 0:
                    if (zzB(t11, i10)) {
                        zzfn.zzm(t10, j10, zzfn.zzl(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzB(t11, i10)) {
                        zzfn.zzk(t10, j10, zzfn.zzj(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzB(t11, i10)) {
                        zzfn.zzg(t10, j10, zzfn.zzf(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzB(t11, i10)) {
                        zzfn.zzg(t10, j10, zzfn.zzf(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzB(t11, i10)) {
                        zzfn.zze(t10, j10, zzfn.zzd(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzB(t11, i10)) {
                        zzfn.zzg(t10, j10, zzfn.zzf(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzB(t11, i10)) {
                        zzfn.zze(t10, j10, zzfn.zzd(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzB(t11, i10)) {
                        zzfn.zzi(t10, j10, zzfn.zzh(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzB(t11, i10)) {
                        zzfn.zzo(t10, j10, zzfn.zzn(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzk(t10, t11, i10);
                    break;
                case 10:
                    if (zzB(t11, i10)) {
                        zzfn.zzo(t10, j10, zzfn.zzn(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzB(t11, i10)) {
                        zzfn.zze(t10, j10, zzfn.zzd(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzB(t11, i10)) {
                        zzfn.zze(t10, j10, zzfn.zzd(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzB(t11, i10)) {
                        zzfn.zze(t10, j10, zzfn.zzd(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzB(t11, i10)) {
                        zzfn.zzg(t10, j10, zzfn.zzf(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzB(t11, i10)) {
                        zzfn.zze(t10, j10, zzfn.zzd(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzB(t11, i10)) {
                        zzfn.zzg(t10, j10, zzfn.zzf(t11, j10));
                        zzC(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzk(t10, t11, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(t10, t11, j10);
                    break;
                case 50:
                    zzer.zzG(this.zzo, t10, t11, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzD(t11, i11, i10)) {
                        zzfn.zzo(t10, j10, zzfn.zzn(t11, j10));
                        zzE(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzl(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzD(t11, i11, i10)) {
                        zzfn.zzo(t10, j10, zzfn.zzn(t11, j10));
                        zzE(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzl(t10, t11, i10);
                    break;
            }
        }
        zzer.zzF(this.zzl, t10, t11);
        if (this.zzf) {
            zzer.zzE(this.zzm, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final int zzd(T t10) {
        if (this.zzg) {
            return zzn(t10);
        }
        return zzm(t10);
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final void zze(T t10) {
        int i10;
        int i11 = this.zzi;
        while (true) {
            i10 = this.zzj;
            if (i11 >= i10) {
                break;
            }
            long zzr = zzr(this.zzh[i11]) & 1048575;
            Object zzn = zzfn.zzn(t10, zzr);
            if (zzn != null) {
                ((zzdy) zzn).zzc();
                zzfn.zzo(t10, zzr, zzn);
            }
            i11++;
        }
        int length = this.zzh.length;
        while (i10 < length) {
            this.zzk.zza(t10, this.zzh[i10]);
            i10++;
        }
        this.zzl.zzc(t10);
        if (this.zzf) {
            this.zzm.zzc(t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.icing.zzep
    public final boolean zzf(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzi) {
            int i15 = this.zzh[i14];
            int i16 = this.zzc[i15];
            int zzr = zzr(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t10, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzr) != 0 && !zzA(t10, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzr);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzdy) zzfn.zzn(t10, zzr & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzD(t10, i16, i15) && !zzq(t10, zzr, zzo(i15))) {
                        return false;
                    }
                }
                List list = (List) zzfn.zzn(t10, zzr & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzep zzo = zzo(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzo.zzf(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzA(t10, i15, i10, i11, i19) && !zzq(t10, zzr, zzo(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zzb(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final void zzi(T t10, zzcn zzcnVar) throws IOException {
        if (this.zzg) {
            if (!this.zzf) {
                int length = this.zzc.length;
                for (int i10 = 0; i10 < length; i10 += 3) {
                    int zzr = zzr(i10);
                    int i11 = this.zzc[i10];
                    switch (zzt(zzr)) {
                        case 0:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzf(i11, zzfn.zzl(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzB(t10, i10)) {
                                zzcnVar.zze(i11, zzfn.zzj(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzc(i11, zzfn.zzf(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzh(i11, zzfn.zzf(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzi(i11, zzfn.zzd(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzj(i11, zzfn.zzf(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzk(i11, zzfn.zzd(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzl(i11, zzfn.zzh(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzB(t10, i10)) {
                                zzH(i11, zzfn.zzn(t10, zzr & 1048575), zzcnVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzr(i11, zzfn.zzn(t10, zzr & 1048575), zzo(i10));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzn(i11, (zzcf) zzfn.zzn(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzo(i11, zzfn.zzd(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzg(i11, zzfn.zzd(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzb(i11, zzfn.zzd(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzd(i11, zzfn.zzf(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzp(i11, zzfn.zzd(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzq(i11, zzfn.zzf(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzB(t10, i10)) {
                                zzcnVar.zzs(i11, zzfn.zzn(t10, zzr & 1048575), zzo(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzer.zzH(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 19:
                            zzer.zzI(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 20:
                            zzer.zzJ(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 21:
                            zzer.zzK(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 22:
                            zzer.zzO(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 23:
                            zzer.zzM(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 24:
                            zzer.zzR(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 25:
                            zzer.zzU(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 26:
                            zzer.zzV(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar);
                            break;
                        case 27:
                            zzer.zzX(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, zzo(i10));
                            break;
                        case 28:
                            zzer.zzW(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar);
                            break;
                        case 29:
                            zzer.zzP(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 30:
                            zzer.zzT(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 31:
                            zzer.zzS(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 32:
                            zzer.zzN(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 33:
                            zzer.zzQ(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 34:
                            zzer.zzL(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, false);
                            break;
                        case 35:
                            zzer.zzH(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 36:
                            zzer.zzI(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 37:
                            zzer.zzJ(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 38:
                            zzer.zzK(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 39:
                            zzer.zzO(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 40:
                            zzer.zzM(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 41:
                            zzer.zzR(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 42:
                            zzer.zzU(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 43:
                            zzer.zzP(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 44:
                            zzer.zzT(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 45:
                            zzer.zzS(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 46:
                            zzer.zzN(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 47:
                            zzer.zzQ(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 48:
                            zzer.zzL(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, true);
                            break;
                        case 49:
                            zzer.zzY(this.zzc[i10], (List) zzfn.zzn(t10, zzr & 1048575), zzcnVar, zzo(i10));
                            break;
                        case 50:
                            zzG(zzcnVar, i11, zzfn.zzn(t10, zzr & 1048575), i10);
                            break;
                        case 51:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzf(i11, zzu(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zze(i11, zzv(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzc(i11, zzx(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzh(i11, zzx(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzi(i11, zzw(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzj(i11, zzx(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzk(i11, zzw(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzl(i11, zzy(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzD(t10, i11, i10)) {
                                zzH(i11, zzfn.zzn(t10, zzr & 1048575), zzcnVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzr(i11, zzfn.zzn(t10, zzr & 1048575), zzo(i10));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzn(i11, (zzcf) zzfn.zzn(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzo(i11, zzw(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzg(i11, zzw(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzb(i11, zzw(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzd(i11, zzx(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzp(i11, zzw(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzq(i11, zzx(t10, zzr & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzD(t10, i11, i10)) {
                                zzcnVar.zzs(i11, zzfn.zzn(t10, zzr & 1048575), zzo(i10));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzfd<?, ?> zzfdVar = this.zzl;
                zzfdVar.zzg(zzfdVar.zzb(t10), zzcnVar);
                return;
            }
            this.zzm.zzb(t10);
            throw null;
        }
        zzF(t10, zzcnVar);
    }
}
