package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import sun.misc.Unsafe;
import v.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzib<T> implements zzil<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhy zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzhm zzn;
    private final zzjf zzo;
    private final zzga zzp;
    private final zzie zzq;
    private final zzht zzr;

    private zzib(int[] iArr, Object[] objArr, int i10, int i11, zzhy zzhyVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzie zzieVar, zzhm zzhmVar, zzjf zzjfVar, zzga zzgaVar, zzht zzhtVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzhyVar instanceof zzgo;
        this.zzj = z10;
        boolean z12 = false;
        if (zzgaVar != null && zzgaVar.zzj(zzhyVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzq = zzieVar;
        this.zzn = zzhmVar;
        this.zzo = zzjfVar;
        this.zzp = zzgaVar;
        this.zzg = zzhyVar;
        this.zzr = zzhtVar;
    }

    private static long zzA(Object obj, long j10) {
        return ((Long) zzjp.zzf(obj, j10)).longValue();
    }

    private final zzgs zzB(int i10) {
        int i11 = i10 / 3;
        return (zzgs) this.zzd[i11 + i11 + 1];
    }

    private final zzil zzC(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzil zzilVar = (zzil) this.zzd[i12];
        if (zzilVar != null) {
            return zzilVar;
        }
        zzil zzb2 = zzih.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i10, Object obj2, zzjf zzjfVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzjp.zzf(obj, zzz(i10) & 1048575);
        if (zzf == null) {
            return obj2;
        }
        if (zzB(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzE(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzF(Object obj, int i10) {
        zzil zzC = zzC(i10);
        int zzz = zzz(i10) & 1048575;
        if (!zzT(obj, i10)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzG(Object obj, int i10, int i11) {
        zzil zzC = zzC(i11);
        if (!zzX(obj, i10, i11)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i11) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzH(Class cls, String str) {
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
            StringBuilder l10 = e.l("Field ", str, " for ", name, " not found. Known fields are ");
            l10.append(arrays);
            throw new RuntimeException(l10.toString());
        }
    }

    private static void zzI(Object obj) {
        if (zzW(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i10) {
        if (!zzT(obj2, i10)) {
            return;
        }
        int zzz = zzz(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzz;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzil zzC = zzC(i10);
            if (!zzT(obj, i10)) {
                if (!zzW(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzM(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzK(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzX(obj2, i11, i10)) {
            return;
        }
        int zzz = zzz(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzz;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzil zzC = zzC(i10);
            if (!zzX(obj, i11, i10)) {
                if (!zzW(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzN(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzL(Object obj, int i10, zzik zzikVar) throws IOException {
        if (zzS(i10)) {
            zzjp.zzs(obj, i10 & 1048575, zzikVar.zzs());
        } else if (this.zzi) {
            zzjp.zzs(obj, i10 & 1048575, zzikVar.zzr());
        } else {
            zzjp.zzs(obj, i10 & 1048575, zzikVar.zzp());
        }
    }

    private final void zzM(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = 1048575 & zzw;
        if (j10 == 1048575) {
            return;
        }
        zzjp.zzq(obj, j10, (1 << (zzw >>> 20)) | zzjp.zzc(obj, j10));
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzjp.zzq(obj, zzw(i11) & 1048575, i10);
    }

    private final void zzO(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzz(i10) & 1048575, obj2);
        zzM(obj, i10);
    }

    private final void zzP(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzz(i11) & 1048575, obj2);
        zzN(obj, i10, i11);
    }

    private final void zzQ(zzjx zzjxVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzR(Object obj, Object obj2, int i10) {
        if (zzT(obj, i10) == zzT(obj2, i10)) {
            return true;
        }
        return false;
    }

    private static boolean zzS(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzT(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = zzw & 1048575;
        if (j10 == 1048575) {
            int zzz = zzz(i10);
            long j11 = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzjp.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzjp.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzjp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzjp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzjp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzjp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzjp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzjp.zzw(obj, j11);
                case 8:
                    Object zzf = zzjp.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzez) {
                        if (zzez.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzjp.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzez.zzb.equals(zzjp.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzjp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzjp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzjp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzjp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzjp.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzjp.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzjp.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzjp.zzc(obj, j10) & (1 << (zzw >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzU(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzT(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzV(Object obj, int i10, zzil zzilVar) {
        return zzilVar.zzl(zzjp.zzf(obj, i10 & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgo) {
            return ((zzgo) obj).zzF();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i10, int i11) {
        if (zzjp.zzc(obj, zzw(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzY(Object obj, long j10) {
        return ((Boolean) zzjp.zzf(obj, j10)).booleanValue();
    }

    private static final void zzZ(int i10, Object obj, zzjx zzjxVar) throws IOException {
        if (obj instanceof String) {
            zzjxVar.zzG(i10, (String) obj);
        } else {
            zzjxVar.zzd(i10, (zzez) obj);
        }
    }

    public static zzjg zzd(Object obj) {
        zzgo zzgoVar = (zzgo) obj;
        zzjg zzjgVar = zzgoVar.zzc;
        if (zzjgVar == zzjg.zzc()) {
            zzjg zzf = zzjg.zzf();
            zzgoVar.zzc = zzf;
            return zzf;
        }
        return zzjgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.recaptcha.internal.zzib zzm(java.lang.Class r32, com.google.android.recaptcha.internal.zzhv r33, com.google.android.recaptcha.internal.zzie r34, com.google.android.recaptcha.internal.zzhm r35, com.google.android.recaptcha.internal.zzjf r36, com.google.android.recaptcha.internal.zzga r37, com.google.android.recaptcha.internal.zzht r38) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzhv, com.google.android.recaptcha.internal.zzie, com.google.android.recaptcha.internal.zzhm, com.google.android.recaptcha.internal.zzjf, com.google.android.recaptcha.internal.zzga, com.google.android.recaptcha.internal.zzht):com.google.android.recaptcha.internal.zzib");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzjp.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzjp.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003e. Please report as an issue. */
    private final int zzp(Object obj) {
        int i10;
        int zzn;
        int zzz;
        int zzt;
        boolean z10;
        int zzc;
        int zzz2;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.zzc.length) {
            int zzz3 = zzz(i13);
            int[] iArr = this.zzc;
            int i16 = iArr[i13];
            int zzy = zzy(zzz3);
            if (zzy <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                int i19 = i17 >>> 20;
                if (i18 != i12) {
                    i15 = unsafe.getInt(obj, i18);
                    i12 = i18;
                }
                i10 = 1 << i19;
            } else {
                i10 = 0;
            }
            long j10 = zzz3 & i11;
            switch (zzy) {
                case 0:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, zzfk.zzz(unsafe.getLong(obj, j10)), i14);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, zzfk.zzz(unsafe.getLong(obj, j10)), i14);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, zzfk.zzu(unsafe.getInt(obj, j10)), i14);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i15 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzez) {
                            int i20 = zzfk.zzb;
                            int zzd = ((zzez) object).zzd();
                            i14 = a.z(i16 << 3, zzfk.zzy(zzd) + zzd, i14);
                            break;
                        } else {
                            i14 = a.z(i16 << 3, zzfk.zzx((String) object), i14);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i15 & i10) != 0) {
                        zzn = zzin.zzn(i16, unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i15 & i10) != 0) {
                        zzez zzezVar = (zzez) unsafe.getObject(obj, j10);
                        int i21 = zzfk.zzb;
                        int zzd2 = zzezVar.zzd();
                        i14 = a.z(i16 << 3, zzfk.zzy(zzd2) + zzd2, i14);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, zzfk.zzy(unsafe.getInt(obj, j10)), i14);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, zzfk.zzu(unsafe.getInt(obj, j10)), i14);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i15 & i10) != 0) {
                        i14 = a.z(i16 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i15 & i10) != 0) {
                        int i22 = unsafe.getInt(obj, j10);
                        i14 = a.z((i22 >> 31) ^ (i22 + i22), zzfk.zzy(i16 << 3), i14);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i15) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        zzz = zzfk.zzz((j11 >> 63) ^ (j11 + j11)) + zzfk.zzy(i16 << 3);
                        i14 += zzz;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i15 & i10) != 0) {
                        zzz = zzfk.zzt(i16, (zzhy) unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzz;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzin.zzg(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 19:
                    zzn = zzin.zze(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 20:
                    zzn = zzin.zzl(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 21:
                    zzn = zzin.zzw(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 22:
                    zzn = zzin.zzj(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 23:
                    zzn = zzin.zzg(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 24:
                    zzn = zzin.zze(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 25:
                    zzn = zzin.zza(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 26:
                    zzt = zzin.zzt(i16, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 27:
                    zzt = zzin.zzo(i16, (List) unsafe.getObject(obj, j10), zzC(i13));
                    i14 += zzt;
                    break;
                case 28:
                    zzt = zzin.zzb(i16, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 29:
                    zzt = zzin.zzu(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 30:
                    z10 = false;
                    zzc = zzin.zzc(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 31:
                    z10 = false;
                    zzc = zzin.zze(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 32:
                    z10 = false;
                    zzc = zzin.zzg(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 33:
                    z10 = false;
                    zzc = zzin.zzp(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 34:
                    z10 = false;
                    zzc = zzin.zzr(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 35:
                    int zzh = zzin.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzh), zzh, i14);
                    }
                    break;
                case 36:
                    int zzf = zzin.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzf), zzf, i14);
                    }
                    break;
                case 37:
                    int zzm = zzin.zzm((List) unsafe.getObject(obj, j10));
                    if (zzm > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzm), zzm, i14);
                    }
                    break;
                case 38:
                    int zzx = zzin.zzx((List) unsafe.getObject(obj, j10));
                    if (zzx > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzx), zzx, i14);
                    }
                    break;
                case 39:
                    int zzk = zzin.zzk((List) unsafe.getObject(obj, j10));
                    if (zzk > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzk), zzk, i14);
                    }
                    break;
                case 40:
                    int zzh2 = zzin.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh2 > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzh2), zzh2, i14);
                    }
                    break;
                case 41:
                    int zzf2 = zzin.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf2 > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzf2), zzf2, i14);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i23 = zzin.zza;
                    int size = list.size();
                    if (size > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(size), size, i14);
                    }
                    break;
                case 43:
                    int zzv = zzin.zzv((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzv), zzv, i14);
                    }
                    break;
                case 44:
                    int zzd3 = zzin.zzd((List) unsafe.getObject(obj, j10));
                    if (zzd3 > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzd3), zzd3, i14);
                    }
                    break;
                case 45:
                    int zzf3 = zzin.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf3 > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzf3), zzf3, i14);
                    }
                    break;
                case 46:
                    int zzh3 = zzin.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh3 > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzh3), zzh3, i14);
                    }
                    break;
                case 47:
                    int zzq = zzin.zzq((List) unsafe.getObject(obj, j10));
                    if (zzq > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzq), zzq, i14);
                    }
                    break;
                case 48:
                    int zzs = zzin.zzs((List) unsafe.getObject(obj, j10));
                    if (zzs > 0) {
                        i14 = a.A(i16 << 3, zzfk.zzy(zzs), zzs, i14);
                    }
                    break;
                case 49:
                    zzt = zzin.zzi(i16, (List) unsafe.getObject(obj, j10), zzC(i13));
                    i14 += zzt;
                    break;
                case 50:
                    zzht.zza(i16, unsafe.getObject(obj, j10), zzE(i13));
                    break;
                case 51:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, 8, i14);
                    }
                    break;
                case 52:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, 4, i14);
                    }
                    break;
                case 53:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, zzfk.zzz(zzA(obj, j10)), i14);
                    }
                    break;
                case 54:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, zzfk.zzz(zzA(obj, j10)), i14);
                    }
                    break;
                case 55:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, zzfk.zzu(zzq(obj, j10)), i14);
                    }
                    break;
                case 56:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, 8, i14);
                    }
                    break;
                case 57:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, 4, i14);
                    }
                    break;
                case 58:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, 1, i14);
                    }
                    break;
                case 59:
                    if (zzX(obj, i16, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzez) {
                            int i24 = zzfk.zzb;
                            int zzd4 = ((zzez) object2).zzd();
                            i14 = a.z(i16 << 3, zzfk.zzy(zzd4) + zzd4, i14);
                        } else {
                            i14 = a.z(i16 << 3, zzfk.zzx((String) object2), i14);
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i16, i13)) {
                        zzt = zzin.zzn(i16, unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzt;
                    }
                    break;
                case 61:
                    if (zzX(obj, i16, i13)) {
                        zzez zzezVar2 = (zzez) unsafe.getObject(obj, j10);
                        int i25 = zzfk.zzb;
                        int zzd5 = zzezVar2.zzd();
                        i14 = a.z(i16 << 3, zzfk.zzy(zzd5) + zzd5, i14);
                    }
                    break;
                case 62:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, zzfk.zzy(zzq(obj, j10)), i14);
                    }
                    break;
                case 63:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, zzfk.zzu(zzq(obj, j10)), i14);
                    }
                    break;
                case 64:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, 4, i14);
                    }
                    break;
                case 65:
                    if (zzX(obj, i16, i13)) {
                        i14 = a.z(i16 << 3, 8, i14);
                    }
                    break;
                case 66:
                    if (zzX(obj, i16, i13)) {
                        int zzq2 = zzq(obj, j10);
                        i14 = a.z((zzq2 >> 31) ^ (zzq2 + zzq2), zzfk.zzy(i16 << 3), i14);
                    }
                    break;
                case 67:
                    if (zzX(obj, i16, i13)) {
                        long zzA = zzA(obj, j10);
                        zzz2 = zzfk.zzz((zzA >> 63) ^ (zzA + zzA)) + zzfk.zzy(i16 << 3);
                        i14 += zzz2;
                    }
                    break;
                case 68:
                    if (zzX(obj, i16, i13)) {
                        zzz2 = zzfk.zzt(i16, (zzhy) unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzz2;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        int i26 = 0;
        zzjf zzjfVar = this.zzo;
        int zza2 = i14 + zzjfVar.zza(zzjfVar.zzd(obj));
        if (this.zzh) {
            zzge zzb2 = this.zzp.zzb(obj);
            for (int i27 = 0; i27 < zzb2.zza.zzb(); i27++) {
                Map.Entry zzg = zzb2.zza.zzg(i27);
                i26 += zzge.zza((zzgd) zzg.getKey(), zzg.getValue());
            }
            for (Map.Entry entry : zzb2.zza.zzc()) {
                i26 += zzge.zza((zzgd) entry.getKey(), entry.getValue());
            }
            return zza2 + i26;
        }
        return zza2;
    }

    private static int zzq(Object obj, long j10) {
        return ((Integer) zzjp.zzf(obj, j10)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzem zzemVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzht.zzb(object)) {
            zzhs zzb2 = zzhs.zza().zzb();
            zzht.zzc(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzem zzemVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzen.zzq(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzen.zzb(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzen.zzm(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzemVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzen.zzj(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzemVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzen.zzq(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzen.zzb(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzen.zzm(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzemVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzen.zzj(bArr, i10, zzemVar);
                    int i22 = zzemVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        if ((i15 & 536870912) != 0 && !zzju.zzf(bArr, zzj2, zzj2 + i22)) {
                            throw zzgy.zzd();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i22, zzgw.zzb));
                        zzj2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object zzG = zzG(obj, i13, i17);
                    int zzo = zzen.zzo(zzG, zzC(i17), bArr, i10, i11, zzemVar);
                    zzP(obj, i13, i17, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzen.zza(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, zzemVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzen.zzj(bArr, i10, zzemVar);
                    int i23 = zzemVar.zza;
                    zzgs zzB = zzB(i17);
                    if (zzB != null && !zzB.zza()) {
                        zzd(obj).zzj(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzen.zzj(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzff.zzF(zzemVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzen.zzm(bArr, i10, zzemVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzff.zzG(zzemVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object zzG2 = zzG(obj, i13, i17);
                    int zzn = zzen.zzn(zzG2, zzC(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzemVar);
                    zzP(obj, i13, i17, zzG2);
                    return zzn;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzem zzemVar) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int zzj;
        int i21 = i10;
        Unsafe unsafe = zzb;
        zzgv zzgvVar = (zzgv) unsafe.getObject(obj, j11);
        if (!zzgvVar.zzc()) {
            int size = zzgvVar.size();
            zzgvVar = zzgvVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzgvVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzft zzftVar = (zzft) zzgvVar;
                    int zzj2 = zzen.zzj(bArr, i21, zzemVar);
                    int i22 = zzemVar.zza + zzj2;
                    while (zzj2 < i22) {
                        zzftVar.zze(Double.longBitsToDouble(zzen.zzq(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i22) {
                        return zzj2;
                    }
                    throw zzgy.zzj();
                }
                if (i14 == 1) {
                    zzft zzftVar2 = (zzft) zzgvVar;
                    zzftVar2.zze(Double.longBitsToDouble(zzen.zzq(bArr, i10)));
                    while (true) {
                        i17 = i21 + 8;
                        if (i17 < i11) {
                            i21 = zzen.zzj(bArr, i17, zzemVar);
                            if (i12 == zzemVar.zza) {
                                zzftVar2.zze(Double.longBitsToDouble(zzen.zzq(bArr, i21)));
                            }
                        }
                    }
                    return i17;
                }
                return i21;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzgg zzggVar = (zzgg) zzgvVar;
                    int zzj3 = zzen.zzj(bArr, i21, zzemVar);
                    int i23 = zzemVar.zza + zzj3;
                    while (zzj3 < i23) {
                        zzggVar.zze(Float.intBitsToFloat(zzen.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i23) {
                        return zzj3;
                    }
                    throw zzgy.zzj();
                }
                if (i14 == 5) {
                    zzgg zzggVar2 = (zzgg) zzgvVar;
                    zzggVar2.zze(Float.intBitsToFloat(zzen.zzb(bArr, i10)));
                    while (true) {
                        i18 = i21 + 4;
                        if (i18 < i11) {
                            i21 = zzen.zzj(bArr, i18, zzemVar);
                            if (i12 == zzemVar.zza) {
                                zzggVar2.zze(Float.intBitsToFloat(zzen.zzb(bArr, i21)));
                            }
                        }
                    }
                    return i18;
                }
                return i21;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzhn zzhnVar = (zzhn) zzgvVar;
                    int zzj4 = zzen.zzj(bArr, i21, zzemVar);
                    int i24 = zzemVar.zza + zzj4;
                    while (zzj4 < i24) {
                        zzj4 = zzen.zzm(bArr, zzj4, zzemVar);
                        zzhnVar.zzf(zzemVar.zzb);
                    }
                    if (zzj4 == i24) {
                        return zzj4;
                    }
                    throw zzgy.zzj();
                }
                if (i14 == 0) {
                    zzhn zzhnVar2 = (zzhn) zzgvVar;
                    int zzm = zzen.zzm(bArr, i21, zzemVar);
                    zzhnVar2.zzf(zzemVar.zzb);
                    while (zzm < i11) {
                        int zzj5 = zzen.zzj(bArr, zzm, zzemVar);
                        if (i12 != zzemVar.zza) {
                            return zzm;
                        }
                        zzm = zzen.zzm(bArr, zzj5, zzemVar);
                        zzhnVar2.zzf(zzemVar.zzb);
                    }
                    return zzm;
                }
                return i21;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzen.zzf(bArr, i21, zzgvVar, zzemVar);
                }
                if (i14 == 0) {
                    return zzen.zzl(i12, bArr, i10, i11, zzgvVar, zzemVar);
                }
                return i21;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzhn zzhnVar3 = (zzhn) zzgvVar;
                    int zzj6 = zzen.zzj(bArr, i21, zzemVar);
                    int i25 = zzemVar.zza + zzj6;
                    while (zzj6 < i25) {
                        zzhnVar3.zzf(zzen.zzq(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i25) {
                        return zzj6;
                    }
                    throw zzgy.zzj();
                }
                if (i14 == 1) {
                    zzhn zzhnVar4 = (zzhn) zzgvVar;
                    zzhnVar4.zzf(zzen.zzq(bArr, i10));
                    while (true) {
                        i19 = i21 + 8;
                        if (i19 < i11) {
                            i21 = zzen.zzj(bArr, i19, zzemVar);
                            if (i12 == zzemVar.zza) {
                                zzhnVar4.zzf(zzen.zzq(bArr, i21));
                            }
                        }
                    }
                    return i19;
                }
                return i21;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzgp zzgpVar = (zzgp) zzgvVar;
                    int zzj7 = zzen.zzj(bArr, i21, zzemVar);
                    int i26 = zzemVar.zza + zzj7;
                    while (zzj7 < i26) {
                        zzgpVar.zzg(zzen.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i26) {
                        return zzj7;
                    }
                    throw zzgy.zzj();
                }
                if (i14 == 5) {
                    zzgp zzgpVar2 = (zzgp) zzgvVar;
                    zzgpVar2.zzg(zzen.zzb(bArr, i10));
                    while (true) {
                        i20 = i21 + 4;
                        if (i20 < i11) {
                            i21 = zzen.zzj(bArr, i20, zzemVar);
                            if (i12 == zzemVar.zza) {
                                zzgpVar2.zzg(zzen.zzb(bArr, i21));
                            }
                        }
                    }
                    return i20;
                }
                return i21;
            case 25:
            case 42:
                if (i14 == 2) {
                    zzeo zzeoVar = (zzeo) zzgvVar;
                    zzj = zzen.zzj(bArr, i21, zzemVar);
                    int i27 = zzemVar.zza + zzj;
                    while (zzj < i27) {
                        zzj = zzen.zzm(bArr, zzj, zzemVar);
                        zzeoVar.zze(zzemVar.zzb != 0);
                    }
                    if (zzj != i27) {
                        throw zzgy.zzj();
                    }
                    return zzj;
                }
                if (i14 == 0) {
                    zzeo zzeoVar2 = (zzeo) zzgvVar;
                    int zzm2 = zzen.zzm(bArr, i21, zzemVar);
                    zzeoVar2.zze(zzemVar.zzb != 0);
                    while (zzm2 < i11) {
                        int zzj8 = zzen.zzj(bArr, zzm2, zzemVar);
                        if (i12 != zzemVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzen.zzm(bArr, zzj8, zzemVar);
                        zzeoVar2.zze(zzemVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i21;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int zzj9 = zzen.zzj(bArr, i21, zzemVar);
                        int i28 = zzemVar.zza;
                        if (i28 < 0) {
                            throw zzgy.zzf();
                        }
                        if (i28 == 0) {
                            zzgvVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            zzgvVar.add(new String(bArr, zzj9, i28, zzgw.zzb));
                            zzj9 += i28;
                        }
                        while (zzj9 < i11) {
                            int zzj10 = zzen.zzj(bArr, zzj9, zzemVar);
                            if (i12 != zzemVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzen.zzj(bArr, zzj10, zzemVar);
                            int i29 = zzemVar.zza;
                            if (i29 < 0) {
                                throw zzgy.zzf();
                            }
                            if (i29 == 0) {
                                zzgvVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
                                zzgvVar.add(new String(bArr, zzj9, i29, zzgw.zzb));
                                zzj9 += i29;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzen.zzj(bArr, i21, zzemVar);
                    int i30 = zzemVar.zza;
                    if (i30 < 0) {
                        throw zzgy.zzf();
                    }
                    if (i30 == 0) {
                        zzgvVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        int i31 = zzj11 + i30;
                        if (zzju.zzf(bArr, zzj11, i31)) {
                            zzgvVar.add(new String(bArr, zzj11, i30, zzgw.zzb));
                            zzj11 = i31;
                        } else {
                            throw zzgy.zzd();
                        }
                    }
                    while (zzj11 < i11) {
                        int zzj12 = zzen.zzj(bArr, zzj11, zzemVar);
                        if (i12 != zzemVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzen.zzj(bArr, zzj12, zzemVar);
                        int i32 = zzemVar.zza;
                        if (i32 < 0) {
                            throw zzgy.zzf();
                        }
                        if (i32 == 0) {
                            zzgvVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            int i33 = zzj11 + i32;
                            if (zzju.zzf(bArr, zzj11, i33)) {
                                zzgvVar.add(new String(bArr, zzj11, i32, zzgw.zzb));
                                zzj11 = i33;
                            } else {
                                throw zzgy.zzd();
                            }
                        }
                    }
                    return zzj11;
                }
                return i21;
            case 27:
                if (i14 == 2) {
                    return zzen.zze(zzC(i15), i12, bArr, i10, i11, zzgvVar, zzemVar);
                }
                return i21;
            case 28:
                if (i14 == 2) {
                    int zzj13 = zzen.zzj(bArr, i21, zzemVar);
                    int i34 = zzemVar.zza;
                    if (i34 >= 0) {
                        if (i34 > bArr.length - zzj13) {
                            throw zzgy.zzj();
                        }
                        if (i34 == 0) {
                            zzgvVar.add(zzez.zzb);
                        } else {
                            zzgvVar.add(zzez.zzm(bArr, zzj13, i34));
                            zzj13 += i34;
                        }
                        while (zzj13 < i11) {
                            int zzj14 = zzen.zzj(bArr, zzj13, zzemVar);
                            if (i12 != zzemVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzen.zzj(bArr, zzj14, zzemVar);
                            int i35 = zzemVar.zza;
                            if (i35 >= 0) {
                                if (i35 > bArr.length - zzj13) {
                                    throw zzgy.zzj();
                                }
                                if (i35 == 0) {
                                    zzgvVar.add(zzez.zzb);
                                } else {
                                    zzgvVar.add(zzez.zzm(bArr, zzj13, i35));
                                    zzj13 += i35;
                                }
                            } else {
                                throw zzgy.zzf();
                            }
                        }
                        return zzj13;
                    }
                    throw zzgy.zzf();
                }
                return i21;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        zzj = zzen.zzl(i12, bArr, i10, i11, zzgvVar, zzemVar);
                    }
                    return i21;
                }
                zzj = zzen.zzf(bArr, i21, zzgvVar, zzemVar);
                zzin.zzB(obj, i13, zzgvVar, zzB(i15), null, this.zzo);
                return zzj;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzgp zzgpVar3 = (zzgp) zzgvVar;
                    int zzj15 = zzen.zzj(bArr, i21, zzemVar);
                    int i36 = zzemVar.zza + zzj15;
                    while (zzj15 < i36) {
                        zzj15 = zzen.zzj(bArr, zzj15, zzemVar);
                        zzgpVar3.zzg(zzff.zzF(zzemVar.zza));
                    }
                    if (zzj15 == i36) {
                        return zzj15;
                    }
                    throw zzgy.zzj();
                }
                if (i14 == 0) {
                    zzgp zzgpVar4 = (zzgp) zzgvVar;
                    int zzj16 = zzen.zzj(bArr, i21, zzemVar);
                    zzgpVar4.zzg(zzff.zzF(zzemVar.zza));
                    while (zzj16 < i11) {
                        int zzj17 = zzen.zzj(bArr, zzj16, zzemVar);
                        if (i12 != zzemVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzen.zzj(bArr, zzj17, zzemVar);
                        zzgpVar4.zzg(zzff.zzF(zzemVar.zza));
                    }
                    return zzj16;
                }
                return i21;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzhn zzhnVar5 = (zzhn) zzgvVar;
                    int zzj18 = zzen.zzj(bArr, i21, zzemVar);
                    int i37 = zzemVar.zza + zzj18;
                    while (zzj18 < i37) {
                        zzj18 = zzen.zzm(bArr, zzj18, zzemVar);
                        zzhnVar5.zzf(zzff.zzG(zzemVar.zzb));
                    }
                    if (zzj18 == i37) {
                        return zzj18;
                    }
                    throw zzgy.zzj();
                }
                if (i14 == 0) {
                    zzhn zzhnVar6 = (zzhn) zzgvVar;
                    int zzm3 = zzen.zzm(bArr, i21, zzemVar);
                    zzhnVar6.zzf(zzff.zzG(zzemVar.zzb));
                    while (zzm3 < i11) {
                        int zzj19 = zzen.zzj(bArr, zzm3, zzemVar);
                        if (i12 != zzemVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzen.zzm(bArr, zzj19, zzemVar);
                        zzhnVar6.zzf(zzff.zzG(zzemVar.zzb));
                    }
                    return zzm3;
                }
                return i21;
            default:
                if (i14 == 3) {
                    zzil zzC = zzC(i15);
                    int i38 = (i12 & (-8)) | 4;
                    int zzc = zzen.zzc(zzC, bArr, i10, i11, i38, zzemVar);
                    zzgvVar.add(zzemVar.zzc);
                    while (zzc < i11) {
                        int zzj20 = zzen.zzj(bArr, zzc, zzemVar);
                        if (i12 != zzemVar.zza) {
                            return zzc;
                        }
                        zzc = zzen.zzc(zzC, bArr, zzj20, i11, i38, zzemVar);
                        zzgvVar.add(zzemVar.zzc);
                    }
                    return zzc;
                }
                return i21;
        }
    }

    private final int zzu(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzx(i10, 0);
        }
        return -1;
    }

    private final int zzv(int i10, int i11) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzx(i10, i11);
        }
        return -1;
    }

    private final int zzw(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzx(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzy(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzz(int i10) {
        return this.zzc[i10 + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzil
    public final int zza(Object obj) {
        int zzn;
        int zzy;
        int zzz;
        int zzt;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
                int zzz2 = zzz(i11);
                int zzy2 = zzy(zzz2);
                int i12 = this.zzc[i11];
                int i13 = zzz2 & 1048575;
                if (zzy2 >= zzgf.zzJ.zza() && zzy2 <= zzgf.zzW.zza()) {
                    int i14 = this.zzc[i11 + 2];
                }
                long j10 = i13;
                switch (zzy2) {
                    case 0:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzz(zzjp.zzd(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzz(zzjp.zzd(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzu(zzjp.zzc(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzT(obj, i11)) {
                            Object zzf = zzjp.zzf(obj, j10);
                            if (zzf instanceof zzez) {
                                int i15 = i12 << 3;
                                int i16 = zzfk.zzb;
                                int zzd = ((zzez) zzf).zzd();
                                i10 = a.z(i15, zzfk.zzy(zzd) + zzd, i10);
                                break;
                            } else {
                                i10 = a.z(i12 << 3, zzfk.zzx((String) zzf), i10);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzT(obj, i11)) {
                            zzn = zzin.zzn(i12, zzjp.zzf(obj, j10), zzC(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzT(obj, i11)) {
                            zzez zzezVar = (zzez) zzjp.zzf(obj, j10);
                            int i17 = i12 << 3;
                            int i18 = zzfk.zzb;
                            int zzd2 = zzezVar.zzd();
                            i10 = a.z(i17, zzfk.zzy(zzd2) + zzd2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzy(zzjp.zzc(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzu(zzjp.zzc(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzT(obj, i11)) {
                            i10 = a.z(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzT(obj, i11)) {
                            int zzc = zzjp.zzc(obj, j10);
                            i10 = a.z((zzc >> 31) ^ (zzc + zzc), zzfk.zzy(i12 << 3), i10);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzT(obj, i11)) {
                            long zzd3 = zzjp.zzd(obj, j10);
                            zzy = zzfk.zzy(i12 << 3);
                            zzz = zzfk.zzz((zzd3 >> 63) ^ (zzd3 + zzd3));
                            zzt = zzz + zzy;
                            i10 += zzt;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzT(obj, i11)) {
                            zzt = zzfk.zzt(i12, (zzhy) zzjp.zzf(obj, j10), zzC(i11));
                            i10 += zzt;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzin.zzg(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 19:
                        zzn = zzin.zze(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 20:
                        zzn = zzin.zzl(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 21:
                        zzn = zzin.zzw(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 22:
                        zzn = zzin.zzj(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 23:
                        zzn = zzin.zzg(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 24:
                        zzn = zzin.zze(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 25:
                        zzn = zzin.zza(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 26:
                        zzn = zzin.zzt(i12, (List) zzjp.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 27:
                        zzn = zzin.zzo(i12, (List) zzjp.zzf(obj, j10), zzC(i11));
                        i10 += zzn;
                        break;
                    case 28:
                        zzn = zzin.zzb(i12, (List) zzjp.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 29:
                        zzn = zzin.zzu(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 30:
                        zzn = zzin.zzc(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 31:
                        zzn = zzin.zze(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 32:
                        zzn = zzin.zzg(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 33:
                        zzn = zzin.zzp(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 34:
                        zzn = zzin.zzr(i12, (List) zzjp.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 35:
                        int zzh = zzin.zzh((List) unsafe.getObject(obj, j10));
                        if (zzh > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzh), zzh, i10);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int zzf2 = zzin.zzf((List) unsafe.getObject(obj, j10));
                        if (zzf2 > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzf2), zzf2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int zzm = zzin.zzm((List) unsafe.getObject(obj, j10));
                        if (zzm > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzm), zzm, i10);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int zzx = zzin.zzx((List) unsafe.getObject(obj, j10));
                        if (zzx > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzx), zzx, i10);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int zzk = zzin.zzk((List) unsafe.getObject(obj, j10));
                        if (zzk > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzk), zzk, i10);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int zzh2 = zzin.zzh((List) unsafe.getObject(obj, j10));
                        if (zzh2 > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzh2), zzh2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int zzf3 = zzin.zzf((List) unsafe.getObject(obj, j10));
                        if (zzf3 > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzf3), zzf3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j10);
                        int i19 = zzin.zza;
                        int size = list.size();
                        if (size > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(size), size, i10);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int zzv = zzin.zzv((List) unsafe.getObject(obj, j10));
                        if (zzv > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzv), zzv, i10);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int zzd4 = zzin.zzd((List) unsafe.getObject(obj, j10));
                        if (zzd4 > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzd4), zzd4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int zzf4 = zzin.zzf((List) unsafe.getObject(obj, j10));
                        if (zzf4 > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzf4), zzf4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int zzh3 = zzin.zzh((List) unsafe.getObject(obj, j10));
                        if (zzh3 > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzh3), zzh3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int zzq = zzin.zzq((List) unsafe.getObject(obj, j10));
                        if (zzq > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzq), zzq, i10);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int zzs = zzin.zzs((List) unsafe.getObject(obj, j10));
                        if (zzs > 0) {
                            i10 = a.A(i12 << 3, zzfk.zzy(zzs), zzs, i10);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzin.zzi(i12, (List) zzjp.zzf(obj, j10), zzC(i11));
                        i10 += zzn;
                        break;
                    case 50:
                        zzht.zza(i12, zzjp.zzf(obj, j10), zzE(i11));
                        break;
                    case 51:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzz(zzA(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzz(zzA(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzu(zzq(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzX(obj, i12, i11)) {
                            Object zzf5 = zzjp.zzf(obj, j10);
                            if (zzf5 instanceof zzez) {
                                int i20 = i12 << 3;
                                int i21 = zzfk.zzb;
                                int zzd5 = ((zzez) zzf5).zzd();
                                i10 = a.z(i20, zzfk.zzy(zzd5) + zzd5, i10);
                                break;
                            } else {
                                i10 = a.z(i12 << 3, zzfk.zzx((String) zzf5), i10);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzX(obj, i12, i11)) {
                            zzn = zzin.zzn(i12, zzjp.zzf(obj, j10), zzC(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzX(obj, i12, i11)) {
                            zzez zzezVar2 = (zzez) zzjp.zzf(obj, j10);
                            int i22 = i12 << 3;
                            int i23 = zzfk.zzb;
                            int zzd6 = zzezVar2.zzd();
                            i10 = a.z(i22, zzfk.zzy(zzd6) + zzd6, i10);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzy(zzq(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, zzfk.zzu(zzq(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzX(obj, i12, i11)) {
                            i10 = a.z(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzX(obj, i12, i11)) {
                            int zzq2 = zzq(obj, j10);
                            i10 = a.z((zzq2 >> 31) ^ (zzq2 + zzq2), zzfk.zzy(i12 << 3), i10);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzX(obj, i12, i11)) {
                            long zzA = zzA(obj, j10);
                            zzy = zzfk.zzy(i12 << 3);
                            zzz = zzfk.zzz((zzA >> 63) ^ (zzA + zzA));
                            zzt = zzz + zzy;
                            i10 += zzt;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzX(obj, i12, i11)) {
                            zzt = zzfk.zzt(i12, (zzhy) zzjp.zzf(obj, j10), zzC(i11));
                            i10 += zzt;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzjf zzjfVar = this.zzo;
            return i10 + zzjfVar.zza(zzjfVar.zzd(obj));
        }
        return zzp(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzil
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzz = zzz(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & zzz;
            int i15 = 37;
            switch (zzy(zzz)) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzjp.zza(obj, j10));
                    byte[] bArr = zzgw.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzjp.zzb(obj, j10));
                    i12 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zzjp.zzd(obj, j10);
                    byte[] bArr2 = zzgw.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zzjp.zzd(obj, j10);
                    byte[] bArr3 = zzgw.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 4:
                    i10 = i12 * 53;
                    zzc = zzjp.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zzjp.zzd(obj, j10);
                    byte[] bArr4 = zzgw.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 6:
                    i10 = i12 * 53;
                    zzc = zzjp.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = zzgw.zza(zzjp.zzw(obj, j10));
                    i12 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) zzjp.zzf(obj, j10)).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 9:
                    Object zzf = zzjp.zzf(obj, j10);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = zzjp.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 11:
                    i10 = i12 * 53;
                    zzc = zzjp.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 12:
                    i10 = i12 * 53;
                    zzc = zzjp.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 13:
                    i10 = i12 * 53;
                    zzc = zzjp.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zzjp.zzd(obj, j10);
                    byte[] bArr5 = zzgw.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 15:
                    i10 = i12 * 53;
                    zzc = zzjp.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zzjp.zzd(obj, j10);
                    byte[] bArr6 = zzgw.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzjp.zzf(obj, j10);
                    if (zzf2 != null) {
                        i15 = zzf2.hashCode();
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
                    i11 = i12 * 53;
                    floatToIntBits = zzjp.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = zzjp.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 51:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzgw.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr8 = zzgw.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr9 = zzgw.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr10 = zzgw.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzgw.zza(zzY(obj, j10));
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) zzjp.zzf(obj, j10)).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzjp.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzjp.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr11 = zzgw.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr12 = zzgw.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzjp.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(obj).hashCode() + (i12 * 53);
        if (this.zzh) {
            return (hashCode * 53) + this.zzp.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x04b0, code lost:
    
        if (r0 == r1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x04b2, code lost:
    
        r29.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x04b8, code lost:
    
        r10 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x04bd, code lost:
    
        if (r10 >= r9.zzm) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x04bf, code lost:
    
        zzD(r31, r9.zzk[r10], null, r9.zzo, r31);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04d2, code lost:
    
        if (r7 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04d6, code lost:
    
        if (r6 != r34) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04dd, code lost:
    
        throw com.google.android.recaptcha.internal.zzgy.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04e4, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04e0, code lost:
    
        if (r6 > r34) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04e2, code lost:
    
        if (r8 != r7) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04e9, code lost:
    
        throw com.google.android.recaptcha.internal.zzgy.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x009a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x03af. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzem r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzem):int");
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final Object zze() {
        return ((zzgo) this.zzg).zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzf(Object obj) {
        if (!zzW(obj)) {
            return;
        }
        if (obj instanceof zzgo) {
            zzgo zzgoVar = (zzgo) obj;
            zzgoVar.zzD(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            zzgoVar.zza = 0;
            zzgoVar.zzB();
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzz = zzz(i10);
            int i11 = 1048575 & zzz;
            int zzy = zzy(zzz);
            long j10 = i11;
            if (zzy != 9) {
                if (zzy != 60 && zzy != 68) {
                    switch (zzy) {
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
                            this.zzn.zzb(obj, j10);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((zzhs) object).zzc();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzX(obj, this.zzc[i10], i10)) {
                    zzC(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            if (zzT(obj, i10)) {
                zzC(i10).zzf(zzb.getObject(obj, j10));
            }
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zzf(obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzz = zzz(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzT(obj2, i10)) {
                        zzjp.zzo(obj, j10, zzjp.zza(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i10)) {
                        zzjp.zzp(obj, j10, zzjp.zzb(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i10)) {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i10)) {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i10)) {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i10)) {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i10)) {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i10)) {
                        zzjp.zzm(obj, j10, zzjp.zzw(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj2, i10)) {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i10);
                    break;
                case 10:
                    if (zzT(obj2, i10)) {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj2, i10)) {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i10)) {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i10)) {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i10)) {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i10)) {
                        zzjp.zzq(obj, j10, zzjp.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i10)) {
                        zzjp.zzr(obj, j10, zzjp.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i10);
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
                    this.zzn.zzc(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzin.zza;
                    zzjp.zzs(obj, j10, zzht.zzc(zzjp.zzf(obj, j10), zzjp.zzf(obj2, j10)));
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
                    if (zzX(obj2, i11, i10)) {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                        zzN(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzX(obj2, i11, i10)) {
                        zzjp.zzs(obj, j10, zzjp.zzf(obj2, j10));
                        zzN(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i10);
                    break;
            }
        }
        zzin.zzE(this.zzo, obj, obj2);
        if (this.zzh) {
            zzin.zzD(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00d0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x065d A[LOOP:2: B:36:0x0659->B:38:0x065d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x062d A[Catch: all -> 0x0108, TryCatch #2 {all -> 0x0108, blocks: (B:16:0x00e0, B:45:0x0628, B:47:0x062d, B:48:0x0632, B:105:0x02eb, B:108:0x02f4, B:109:0x0304, B:110:0x0314, B:111:0x0324, B:112:0x0334, B:113:0x0344, B:114:0x0354, B:115:0x0364, B:116:0x0375, B:117:0x0386, B:118:0x0397, B:119:0x03a8, B:120:0x03b9, B:121:0x03ca, B:122:0x03e6, B:123:0x03f7, B:124:0x0408, B:125:0x041d, B:127:0x0426, B:128:0x0438, B:129:0x044a, B:130:0x045b, B:131:0x046c, B:132:0x047d, B:133:0x048e, B:134:0x049f, B:135:0x04b0, B:136:0x04c1, B:137:0x04d2, B:138:0x04e7, B:139:0x04f9, B:140:0x050b, B:141:0x051d, B:142:0x052f, B:144:0x053c, B:147:0x0543, B:148:0x0549, B:149:0x0554, B:150:0x0566, B:151:0x0578, B:152:0x058d, B:153:0x0598, B:154:0x05aa, B:155:0x05bc, B:156:0x05ce, B:157:0x05e0, B:158:0x05f2, B:159:0x0604, B:160:0x0616), top: B:15:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0638 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzik r19, com.google.android.recaptcha.internal.zzfz r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzik, com.google.android.recaptcha.internal.zzfz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        if (r0 != r24) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e9, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0301, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0331, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0350, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.recaptcha.internal.zzem r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzem):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:319:0x0599. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x09e7  */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r18, com.google.android.recaptcha.internal.zzjx r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzjx):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzib.zzk(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzl) {
            int i15 = this.zzk[i13];
            int i16 = this.zzc[i15];
            int zzz = zzz(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & zzz) != 0 && !zzU(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy != 60 && zzy != 68) {
                        if (zzy != 49) {
                            if (zzy == 50 && !((zzhs) zzjp.zzf(obj, zzz & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzX(obj, i16, i15) && !zzV(obj, zzz, zzC(i15))) {
                        return false;
                    }
                }
                List list = (List) zzjp.zzf(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzil zzC = zzC(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzC.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzU(obj, i15, i10, i11, i19) && !zzV(obj, zzz, zzC(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (this.zzh && !this.zzp.zzb(obj).zzk()) {
            return false;
        }
        return true;
    }
}
