package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;
import sun.misc.Unsafe;
import v.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzahs<T> implements zzaib<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzajf.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzahp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzahd zzn;
    private final zzaiv zzo;
    private final zzafy zzp;
    private final zzahu zzq;
    private final zzahk zzr;

    private zzahs(int[] iArr, Object[] objArr, int i10, int i11, zzahp zzahpVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzahu zzahuVar, zzahd zzahdVar, zzaiv zzaivVar, zzafy zzafyVar, zzahk zzahkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzahpVar instanceof zzagk;
        this.zzj = z10;
        boolean z12 = false;
        if (zzafyVar != null && zzafyVar.zzh(zzahpVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzq = zzahuVar;
        this.zzn = zzahdVar;
        this.zzo = zzaivVar;
        this.zzp = zzafyVar;
        this.zzg = zzahpVar;
        this.zzr = zzahkVar;
    }

    private static long zzA(Object obj, long j10) {
        return ((Long) zzajf.zzf(obj, j10)).longValue();
    }

    private final zzago zzB(int i10) {
        int i11 = i10 / 3;
        return (zzago) this.zzd[i11 + i11 + 1];
    }

    private final zzaib zzC(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzaib zzaibVar = (zzaib) this.zzd[i12];
        if (zzaibVar != null) {
            return zzaibVar;
        }
        zzaib zzb2 = zzahx.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i10, Object obj2, zzaiv zzaivVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzajf.zzf(obj, zzz(i10) & 1048575);
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
        zzaib zzC = zzC(i10);
        int zzz = zzz(i10) & 1048575;
        if (!zzS(obj, i10)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz);
        if (zzV(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzG(Object obj, int i10, int i11) {
        zzaib zzC = zzC(i11);
        if (!zzW(obj, i10, i11)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i11) & 1048575);
        if (zzV(object)) {
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
        if (zzV(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i10) {
        if (!zzS(obj2, i10)) {
            return;
        }
        int zzz = zzz(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzz;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzaib zzC = zzC(i10);
            if (!zzS(obj, i10)) {
                if (!zzV(object)) {
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
            if (!zzV(object2)) {
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
        if (!zzW(obj2, i11, i10)) {
            return;
        }
        int zzz = zzz(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzz;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzaib zzC = zzC(i10);
            if (!zzW(obj, i11, i10)) {
                if (!zzV(object)) {
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
            if (!zzV(object2)) {
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

    private final void zzL(Object obj, int i10, zzaia zzaiaVar) throws IOException {
        if (zzR(i10)) {
            zzajf.zzs(obj, i10 & 1048575, zzaiaVar.zzs());
        } else if (this.zzi) {
            zzajf.zzs(obj, i10 & 1048575, zzaiaVar.zzr());
        } else {
            zzajf.zzs(obj, i10 & 1048575, zzaiaVar.zzp());
        }
    }

    private final void zzM(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = 1048575 & zzw;
        if (j10 == 1048575) {
            return;
        }
        zzajf.zzq(obj, j10, (1 << (zzw >>> 20)) | zzajf.zzc(obj, j10));
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzajf.zzq(obj, zzw(i11) & 1048575, i10);
    }

    private final void zzO(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzz(i10) & 1048575, obj2);
        zzM(obj, i10);
    }

    private final void zzP(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzz(i11) & 1048575, obj2);
        zzN(obj, i10, i11);
    }

    private final boolean zzQ(Object obj, Object obj2, int i10) {
        if (zzS(obj, i10) == zzS(obj2, i10)) {
            return true;
        }
        return false;
    }

    private static boolean zzR(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzS(Object obj, int i10) {
        int zzw = zzw(i10);
        long j10 = zzw & 1048575;
        if (j10 == 1048575) {
            int zzz = zzz(i10);
            long j11 = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzajf.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzajf.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzajf.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzajf.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzajf.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzajf.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzajf.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzajf.zzw(obj, j11);
                case 8:
                    Object zzf = zzajf.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzaff) {
                        if (zzaff.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzajf.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzaff.zzb.equals(zzajf.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzajf.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzajf.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzajf.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzajf.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzajf.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzajf.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzajf.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzajf.zzc(obj, j10) & (1 << (zzw >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzT(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzS(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, int i10, zzaib zzaibVar) {
        return zzaibVar.zzk(zzajf.zzf(obj, i10 & 1048575));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzagk) {
            return ((zzagk) obj).zzL();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i10, int i11) {
        if (zzajf.zzc(obj, zzw(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzX(Object obj, long j10) {
        return ((Boolean) zzajf.zzf(obj, j10)).booleanValue();
    }

    private final void zzY(zzaft zzaftVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzZ(int i10, Object obj, zzaft zzaftVar) throws IOException {
        if (obj instanceof String) {
            zzaftVar.zzF(i10, (String) obj);
        } else {
            zzaftVar.zzd(i10, (zzaff) obj);
        }
    }

    public static zzaiw zzd(Object obj) {
        zzagk zzagkVar = (zzagk) obj;
        zzaiw zzaiwVar = zzagkVar.zzc;
        if (zzaiwVar == zzaiw.zzc()) {
            zzaiw zzf = zzaiw.zzf();
            zzagkVar.zzc = zzf;
            return zzf;
        }
        return zzaiwVar;
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
    public static com.google.android.gms.internal.p002firebaseauthapi.zzahs zzl(java.lang.Class r32, com.google.android.gms.internal.p002firebaseauthapi.zzahm r33, com.google.android.gms.internal.p002firebaseauthapi.zzahu r34, com.google.android.gms.internal.p002firebaseauthapi.zzahd r35, com.google.android.gms.internal.p002firebaseauthapi.zzaiv r36, com.google.android.gms.internal.p002firebaseauthapi.zzafy r37, com.google.android.gms.internal.p002firebaseauthapi.zzahk r38) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzahs.zzl(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzahm, com.google.android.gms.internal.firebase-auth-api.zzahu, com.google.android.gms.internal.firebase-auth-api.zzahd, com.google.android.gms.internal.firebase-auth-api.zzaiv, com.google.android.gms.internal.firebase-auth-api.zzafy, com.google.android.gms.internal.firebase-auth-api.zzahk):com.google.android.gms.internal.firebase-auth-api.zzahs");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzajf.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzajf.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003e. Please report as an issue. */
    private final int zzp(Object obj) {
        int i10;
        int zzn;
        int zzB;
        int zzt;
        boolean z10;
        int zzc;
        int zzB2;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.zzc.length) {
            int zzz = zzz(i13);
            int[] iArr = this.zzc;
            int i16 = iArr[i13];
            int zzy = zzy(zzz);
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
            long j10 = zzz & i11;
            switch (zzy) {
                case 0:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, 8, i14);
                        break;
                    }
                case 1:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, 4, i14);
                        break;
                    }
                case 2:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, zzafs.zzB(unsafe.getLong(obj, j10)), i14);
                        break;
                    }
                case 3:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, zzafs.zzB(unsafe.getLong(obj, j10)), i14);
                        break;
                    }
                case 4:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, zzafs.zzx(unsafe.getInt(obj, j10)), i14);
                        break;
                    }
                case 5:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, 8, i14);
                        break;
                    }
                case 6:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, 4, i14);
                        break;
                    }
                case 7:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, 1, i14);
                        break;
                    }
                case 8:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzaff) {
                            int i20 = zzafs.zzf;
                            int zzd = ((zzaff) object).zzd();
                            i14 = a.a(i16 << 3, zzafs.zzA(zzd) + zzd, i14);
                            break;
                        } else {
                            i14 = a.a(i16 << 3, zzafs.zzz((String) object), i14);
                            break;
                        }
                    }
                case 9:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzn = zzaid.zzn(i16, unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzn;
                        break;
                    }
                case 10:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzaff zzaffVar = (zzaff) unsafe.getObject(obj, j10);
                        int i21 = zzafs.zzf;
                        int zzd2 = zzaffVar.zzd();
                        i14 = a.a(i16 << 3, zzafs.zzA(zzd2) + zzd2, i14);
                        break;
                    }
                case 11:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, zzafs.zzA(unsafe.getInt(obj, j10)), i14);
                        break;
                    }
                case 12:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, zzafs.zzx(unsafe.getInt(obj, j10)), i14);
                        break;
                    }
                case 13:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, 4, i14);
                        break;
                    }
                case 14:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i14 = a.a(i16 << 3, 8, i14);
                        break;
                    }
                case 15:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j10);
                        i14 = a.a((i22 >> 31) ^ (i22 + i22), zzafs.zzA(i16 << 3), i14);
                        break;
                    }
                case 16:
                    if ((i10 & i15) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        zzB = zzafs.zzB((j11 >> 63) ^ (j11 + j11)) + zzafs.zzA(i16 << 3);
                        i14 += zzB;
                        break;
                    }
                case 17:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzB = zzafs.zzw(i16, (zzahp) unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzB;
                        break;
                    }
                case 18:
                    zzn = zzaid.zzg(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 19:
                    zzn = zzaid.zze(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 20:
                    zzn = zzaid.zzl(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 21:
                    zzn = zzaid.zzw(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 22:
                    zzn = zzaid.zzj(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 23:
                    zzn = zzaid.zzg(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 24:
                    zzn = zzaid.zze(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 25:
                    zzn = zzaid.zza(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzn;
                    break;
                case 26:
                    zzt = zzaid.zzt(i16, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 27:
                    zzt = zzaid.zzo(i16, (List) unsafe.getObject(obj, j10), zzC(i13));
                    i14 += zzt;
                    break;
                case 28:
                    zzt = zzaid.zzb(i16, (List) unsafe.getObject(obj, j10));
                    i14 += zzt;
                    break;
                case 29:
                    zzt = zzaid.zzu(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzt;
                    break;
                case 30:
                    z10 = false;
                    zzc = zzaid.zzc(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 31:
                    z10 = false;
                    zzc = zzaid.zze(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 32:
                    z10 = false;
                    zzc = zzaid.zzg(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 33:
                    z10 = false;
                    zzc = zzaid.zzp(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 34:
                    z10 = false;
                    zzc = zzaid.zzr(i16, (List) unsafe.getObject(obj, j10), false);
                    i14 += zzc;
                    break;
                case 35:
                    int zzh = zzaid.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzh), zzh, i14);
                    }
                    break;
                case 36:
                    int zzf = zzaid.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzf), zzf, i14);
                    }
                    break;
                case 37:
                    int zzm = zzaid.zzm((List) unsafe.getObject(obj, j10));
                    if (zzm > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzm), zzm, i14);
                    }
                    break;
                case 38:
                    int zzx = zzaid.zzx((List) unsafe.getObject(obj, j10));
                    if (zzx > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzx), zzx, i14);
                    }
                    break;
                case 39:
                    int zzk = zzaid.zzk((List) unsafe.getObject(obj, j10));
                    if (zzk > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzk), zzk, i14);
                    }
                    break;
                case 40:
                    int zzh2 = zzaid.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh2 > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzh2), zzh2, i14);
                    }
                    break;
                case 41:
                    int zzf2 = zzaid.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf2 > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzf2), zzf2, i14);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i23 = zzaid.zza;
                    int size = list.size();
                    if (size > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(size), size, i14);
                    }
                    break;
                case 43:
                    int zzv = zzaid.zzv((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzv), zzv, i14);
                    }
                    break;
                case 44:
                    int zzd3 = zzaid.zzd((List) unsafe.getObject(obj, j10));
                    if (zzd3 > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzd3), zzd3, i14);
                    }
                    break;
                case 45:
                    int zzf3 = zzaid.zzf((List) unsafe.getObject(obj, j10));
                    if (zzf3 > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzf3), zzf3, i14);
                    }
                    break;
                case 46:
                    int zzh3 = zzaid.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh3 > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzh3), zzh3, i14);
                    }
                    break;
                case 47:
                    int zzq = zzaid.zzq((List) unsafe.getObject(obj, j10));
                    if (zzq > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzq), zzq, i14);
                    }
                    break;
                case 48:
                    int zzs = zzaid.zzs((List) unsafe.getObject(obj, j10));
                    if (zzs > 0) {
                        i14 = a.b(i16 << 3, zzafs.zzA(zzs), zzs, i14);
                    }
                    break;
                case 49:
                    zzt = zzaid.zzi(i16, (List) unsafe.getObject(obj, j10), zzC(i13));
                    i14 += zzt;
                    break;
                case 50:
                    zzahk.zza(i16, unsafe.getObject(obj, j10), zzE(i13));
                    break;
                case 51:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, 8, i14);
                    }
                    break;
                case 52:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, 4, i14);
                    }
                    break;
                case 53:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, zzafs.zzB(zzA(obj, j10)), i14);
                    }
                    break;
                case 54:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, zzafs.zzB(zzA(obj, j10)), i14);
                    }
                    break;
                case 55:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, zzafs.zzx(zzq(obj, j10)), i14);
                    }
                    break;
                case 56:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, 8, i14);
                    }
                    break;
                case 57:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, 4, i14);
                    }
                    break;
                case 58:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, 1, i14);
                    }
                    break;
                case 59:
                    if (zzW(obj, i16, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzaff) {
                            int i24 = zzafs.zzf;
                            int zzd4 = ((zzaff) object2).zzd();
                            i14 = a.a(i16 << 3, zzafs.zzA(zzd4) + zzd4, i14);
                        } else {
                            i14 = a.a(i16 << 3, zzafs.zzz((String) object2), i14);
                        }
                    }
                    break;
                case 60:
                    if (zzW(obj, i16, i13)) {
                        zzt = zzaid.zzn(i16, unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzt;
                    }
                    break;
                case 61:
                    if (zzW(obj, i16, i13)) {
                        zzaff zzaffVar2 = (zzaff) unsafe.getObject(obj, j10);
                        int i25 = zzafs.zzf;
                        int zzd5 = zzaffVar2.zzd();
                        i14 = a.a(i16 << 3, zzafs.zzA(zzd5) + zzd5, i14);
                    }
                    break;
                case 62:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, zzafs.zzA(zzq(obj, j10)), i14);
                    }
                    break;
                case 63:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, zzafs.zzx(zzq(obj, j10)), i14);
                    }
                    break;
                case 64:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, 4, i14);
                    }
                    break;
                case 65:
                    if (zzW(obj, i16, i13)) {
                        i14 = a.a(i16 << 3, 8, i14);
                    }
                    break;
                case 66:
                    if (zzW(obj, i16, i13)) {
                        int zzq2 = zzq(obj, j10);
                        i14 = a.a((zzq2 >> 31) ^ (zzq2 + zzq2), zzafs.zzA(i16 << 3), i14);
                    }
                    break;
                case 67:
                    if (zzW(obj, i16, i13)) {
                        long zzA = zzA(obj, j10);
                        zzB2 = zzafs.zzB((zzA >> 63) ^ (zzA + zzA)) + zzafs.zzA(i16 << 3);
                        i14 += zzB2;
                    }
                    break;
                case 68:
                    if (zzW(obj, i16, i13)) {
                        zzB2 = zzafs.zzw(i16, (zzahp) unsafe.getObject(obj, j10), zzC(i13));
                        i14 += zzB2;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzaiv zzaivVar = this.zzo;
        int zza2 = i14 + zzaivVar.zza(zzaivVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private static int zzq(Object obj, long j10) {
        return ((Integer) zzajf.zzf(obj, j10)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzaes zzaesVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzahk.zzb(object)) {
            zzahj zzb2 = zzahj.zza().zzb();
            zzahk.zzc(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzaes zzaesVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzaet.zzp(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzaet.zzb(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzaet.zzm(bArr, i10, zzaesVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzaesVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzaet.zzj(bArr, i10, zzaesVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzaesVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzaet.zzp(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzaet.zzb(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzaet.zzm(bArr, i10, zzaesVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzaesVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzaet.zzj(bArr, i10, zzaesVar);
                    int i22 = zzaesVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        if ((i15 & 536870912) != 0 && !zzajk.zzf(bArr, zzj2, zzj2 + i22)) {
                            throw zzags.zzd();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i22, zzagq.zzb));
                        zzj2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object zzG = zzG(obj, i13, i17);
                    int zzo = zzaet.zzo(zzG, zzC(i17), bArr, i10, i11, zzaesVar);
                    zzP(obj, i13, i17, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzaet.zza(bArr, i10, zzaesVar);
                    unsafe.putObject(obj, j10, zzaesVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzaet.zzj(bArr, i10, zzaesVar);
                    int i23 = zzaesVar.zza;
                    zzago zzB = zzB(i17);
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
                    int zzj4 = zzaet.zzj(bArr, i10, zzaesVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzafl.zzF(zzaesVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzaet.zzm(bArr, i10, zzaesVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzafl.zzG(zzaesVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object zzG2 = zzG(obj, i13, i17);
                    int zzn = zzaet.zzn(zzG2, zzC(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzaesVar);
                    zzP(obj, i13, i17, zzG2);
                    return zzn;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzaes zzaesVar) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int zzj;
        int i21 = i10;
        Unsafe unsafe = zzb;
        zzagp zzagpVar = (zzagp) unsafe.getObject(obj, j11);
        if (!zzagpVar.zzc()) {
            int size = zzagpVar.size();
            zzagpVar = zzagpVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzagpVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzafu zzafuVar = (zzafu) zzagpVar;
                    int zzj2 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i22 = zzaesVar.zza + zzj2;
                    while (zzj2 < i22) {
                        zzafuVar.zze(Double.longBitsToDouble(zzaet.zzp(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i22) {
                        return zzj2;
                    }
                    throw zzags.zzj();
                }
                if (i14 == 1) {
                    zzafu zzafuVar2 = (zzafu) zzagpVar;
                    zzafuVar2.zze(Double.longBitsToDouble(zzaet.zzp(bArr, i10)));
                    while (true) {
                        i17 = i21 + 8;
                        if (i17 < i11) {
                            i21 = zzaet.zzj(bArr, i17, zzaesVar);
                            if (i12 == zzaesVar.zza) {
                                zzafuVar2.zze(Double.longBitsToDouble(zzaet.zzp(bArr, i21)));
                            }
                        }
                    }
                    return i17;
                }
                return i21;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzage zzageVar = (zzage) zzagpVar;
                    int zzj3 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i23 = zzaesVar.zza + zzj3;
                    while (zzj3 < i23) {
                        zzageVar.zze(Float.intBitsToFloat(zzaet.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i23) {
                        return zzj3;
                    }
                    throw zzags.zzj();
                }
                if (i14 == 5) {
                    zzage zzageVar2 = (zzage) zzagpVar;
                    zzageVar2.zze(Float.intBitsToFloat(zzaet.zzb(bArr, i10)));
                    while (true) {
                        i18 = i21 + 4;
                        if (i18 < i11) {
                            i21 = zzaet.zzj(bArr, i18, zzaesVar);
                            if (i12 == zzaesVar.zza) {
                                zzageVar2.zze(Float.intBitsToFloat(zzaet.zzb(bArr, i21)));
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
                    zzahe zzaheVar = (zzahe) zzagpVar;
                    int zzj4 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i24 = zzaesVar.zza + zzj4;
                    while (zzj4 < i24) {
                        zzj4 = zzaet.zzm(bArr, zzj4, zzaesVar);
                        zzaheVar.zzf(zzaesVar.zzb);
                    }
                    if (zzj4 == i24) {
                        return zzj4;
                    }
                    throw zzags.zzj();
                }
                if (i14 == 0) {
                    zzahe zzaheVar2 = (zzahe) zzagpVar;
                    int zzm = zzaet.zzm(bArr, i21, zzaesVar);
                    zzaheVar2.zzf(zzaesVar.zzb);
                    while (zzm < i11) {
                        int zzj5 = zzaet.zzj(bArr, zzm, zzaesVar);
                        if (i12 != zzaesVar.zza) {
                            return zzm;
                        }
                        zzm = zzaet.zzm(bArr, zzj5, zzaesVar);
                        zzaheVar2.zzf(zzaesVar.zzb);
                    }
                    return zzm;
                }
                return i21;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzaet.zzf(bArr, i21, zzagpVar, zzaesVar);
                }
                if (i14 == 0) {
                    return zzaet.zzl(i12, bArr, i10, i11, zzagpVar, zzaesVar);
                }
                return i21;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzahe zzaheVar3 = (zzahe) zzagpVar;
                    int zzj6 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i25 = zzaesVar.zza + zzj6;
                    while (zzj6 < i25) {
                        zzaheVar3.zzf(zzaet.zzp(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i25) {
                        return zzj6;
                    }
                    throw zzags.zzj();
                }
                if (i14 == 1) {
                    zzahe zzaheVar4 = (zzahe) zzagpVar;
                    zzaheVar4.zzf(zzaet.zzp(bArr, i10));
                    while (true) {
                        i19 = i21 + 8;
                        if (i19 < i11) {
                            i21 = zzaet.zzj(bArr, i19, zzaesVar);
                            if (i12 == zzaesVar.zza) {
                                zzaheVar4.zzf(zzaet.zzp(bArr, i21));
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
                    zzagl zzaglVar = (zzagl) zzagpVar;
                    int zzj7 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i26 = zzaesVar.zza + zzj7;
                    while (zzj7 < i26) {
                        zzaglVar.zzf(zzaet.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i26) {
                        return zzj7;
                    }
                    throw zzags.zzj();
                }
                if (i14 == 5) {
                    zzagl zzaglVar2 = (zzagl) zzagpVar;
                    zzaglVar2.zzf(zzaet.zzb(bArr, i10));
                    while (true) {
                        i20 = i21 + 4;
                        if (i20 < i11) {
                            i21 = zzaet.zzj(bArr, i20, zzaesVar);
                            if (i12 == zzaesVar.zza) {
                                zzaglVar2.zzf(zzaet.zzb(bArr, i21));
                            }
                        }
                    }
                    return i20;
                }
                return i21;
            case 25:
            case 42:
                if (i14 == 2) {
                    zzaeu zzaeuVar = (zzaeu) zzagpVar;
                    zzj = zzaet.zzj(bArr, i21, zzaesVar);
                    int i27 = zzaesVar.zza + zzj;
                    while (zzj < i27) {
                        zzj = zzaet.zzm(bArr, zzj, zzaesVar);
                        zzaeuVar.zze(zzaesVar.zzb != 0);
                    }
                    if (zzj != i27) {
                        throw zzags.zzj();
                    }
                    return zzj;
                }
                if (i14 == 0) {
                    zzaeu zzaeuVar2 = (zzaeu) zzagpVar;
                    int zzm2 = zzaet.zzm(bArr, i21, zzaesVar);
                    zzaeuVar2.zze(zzaesVar.zzb != 0);
                    while (zzm2 < i11) {
                        int zzj8 = zzaet.zzj(bArr, zzm2, zzaesVar);
                        if (i12 != zzaesVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzaet.zzm(bArr, zzj8, zzaesVar);
                        zzaeuVar2.zze(zzaesVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i21;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int zzj9 = zzaet.zzj(bArr, i21, zzaesVar);
                        int i28 = zzaesVar.zza;
                        if (i28 < 0) {
                            throw zzags.zzf();
                        }
                        if (i28 == 0) {
                            zzagpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            zzagpVar.add(new String(bArr, zzj9, i28, zzagq.zzb));
                            zzj9 += i28;
                        }
                        while (zzj9 < i11) {
                            int zzj10 = zzaet.zzj(bArr, zzj9, zzaesVar);
                            if (i12 != zzaesVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzaet.zzj(bArr, zzj10, zzaesVar);
                            int i29 = zzaesVar.zza;
                            if (i29 < 0) {
                                throw zzags.zzf();
                            }
                            if (i29 == 0) {
                                zzagpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
                                zzagpVar.add(new String(bArr, zzj9, i29, zzagq.zzb));
                                zzj9 += i29;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i30 = zzaesVar.zza;
                    if (i30 < 0) {
                        throw zzags.zzf();
                    }
                    if (i30 == 0) {
                        zzagpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        int i31 = zzj11 + i30;
                        if (zzajk.zzf(bArr, zzj11, i31)) {
                            zzagpVar.add(new String(bArr, zzj11, i30, zzagq.zzb));
                            zzj11 = i31;
                        } else {
                            throw zzags.zzd();
                        }
                    }
                    while (zzj11 < i11) {
                        int zzj12 = zzaet.zzj(bArr, zzj11, zzaesVar);
                        if (i12 != zzaesVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzaet.zzj(bArr, zzj12, zzaesVar);
                        int i32 = zzaesVar.zza;
                        if (i32 < 0) {
                            throw zzags.zzf();
                        }
                        if (i32 == 0) {
                            zzagpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            int i33 = zzj11 + i32;
                            if (zzajk.zzf(bArr, zzj11, i33)) {
                                zzagpVar.add(new String(bArr, zzj11, i32, zzagq.zzb));
                                zzj11 = i33;
                            } else {
                                throw zzags.zzd();
                            }
                        }
                    }
                    return zzj11;
                }
                return i21;
            case 27:
                if (i14 == 2) {
                    return zzaet.zze(zzC(i15), i12, bArr, i10, i11, zzagpVar, zzaesVar);
                }
                return i21;
            case 28:
                if (i14 == 2) {
                    int zzj13 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i34 = zzaesVar.zza;
                    if (i34 >= 0) {
                        if (i34 > bArr.length - zzj13) {
                            throw zzags.zzj();
                        }
                        if (i34 == 0) {
                            zzagpVar.add(zzaff.zzb);
                        } else {
                            zzagpVar.add(zzaff.zzn(bArr, zzj13, i34));
                            zzj13 += i34;
                        }
                        while (zzj13 < i11) {
                            int zzj14 = zzaet.zzj(bArr, zzj13, zzaesVar);
                            if (i12 != zzaesVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzaet.zzj(bArr, zzj14, zzaesVar);
                            int i35 = zzaesVar.zza;
                            if (i35 >= 0) {
                                if (i35 > bArr.length - zzj13) {
                                    throw zzags.zzj();
                                }
                                if (i35 == 0) {
                                    zzagpVar.add(zzaff.zzb);
                                } else {
                                    zzagpVar.add(zzaff.zzn(bArr, zzj13, i35));
                                    zzj13 += i35;
                                }
                            } else {
                                throw zzags.zzf();
                            }
                        }
                        return zzj13;
                    }
                    throw zzags.zzf();
                }
                return i21;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        zzj = zzaet.zzl(i12, bArr, i10, i11, zzagpVar, zzaesVar);
                    }
                    return i21;
                }
                zzj = zzaet.zzf(bArr, i21, zzagpVar, zzaesVar);
                zzaid.zzA(obj, i13, zzagpVar, zzB(i15), null, this.zzo);
                return zzj;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzagl zzaglVar3 = (zzagl) zzagpVar;
                    int zzj15 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i36 = zzaesVar.zza + zzj15;
                    while (zzj15 < i36) {
                        zzj15 = zzaet.zzj(bArr, zzj15, zzaesVar);
                        zzaglVar3.zzf(zzafl.zzF(zzaesVar.zza));
                    }
                    if (zzj15 == i36) {
                        return zzj15;
                    }
                    throw zzags.zzj();
                }
                if (i14 == 0) {
                    zzagl zzaglVar4 = (zzagl) zzagpVar;
                    int zzj16 = zzaet.zzj(bArr, i21, zzaesVar);
                    zzaglVar4.zzf(zzafl.zzF(zzaesVar.zza));
                    while (zzj16 < i11) {
                        int zzj17 = zzaet.zzj(bArr, zzj16, zzaesVar);
                        if (i12 != zzaesVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzaet.zzj(bArr, zzj17, zzaesVar);
                        zzaglVar4.zzf(zzafl.zzF(zzaesVar.zza));
                    }
                    return zzj16;
                }
                return i21;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzahe zzaheVar5 = (zzahe) zzagpVar;
                    int zzj18 = zzaet.zzj(bArr, i21, zzaesVar);
                    int i37 = zzaesVar.zza + zzj18;
                    while (zzj18 < i37) {
                        zzj18 = zzaet.zzm(bArr, zzj18, zzaesVar);
                        zzaheVar5.zzf(zzafl.zzG(zzaesVar.zzb));
                    }
                    if (zzj18 == i37) {
                        return zzj18;
                    }
                    throw zzags.zzj();
                }
                if (i14 == 0) {
                    zzahe zzaheVar6 = (zzahe) zzagpVar;
                    int zzm3 = zzaet.zzm(bArr, i21, zzaesVar);
                    zzaheVar6.zzf(zzafl.zzG(zzaesVar.zzb));
                    while (zzm3 < i11) {
                        int zzj19 = zzaet.zzj(bArr, zzm3, zzaesVar);
                        if (i12 != zzaesVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzaet.zzm(bArr, zzj19, zzaesVar);
                        zzaheVar6.zzf(zzafl.zzG(zzaesVar.zzb));
                    }
                    return zzm3;
                }
                return i21;
            default:
                if (i14 == 3) {
                    zzaib zzC = zzC(i15);
                    int i38 = (i12 & (-8)) | 4;
                    int zzc = zzaet.zzc(zzC, bArr, i10, i11, i38, zzaesVar);
                    zzagpVar.add(zzaesVar.zzc);
                    while (zzc < i11) {
                        int zzj20 = zzaet.zzj(bArr, zzc, zzaesVar);
                        if (i12 != zzaesVar.zza) {
                            return zzc;
                        }
                        zzc = zzaet.zzc(zzC, bArr, zzj20, i11, i38, zzaesVar);
                        zzagpVar.add(zzaesVar.zzc);
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
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zza(Object obj) {
        int zzn;
        int zzA;
        int zzB;
        int zzw;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
                int zzz = zzz(i11);
                int zzy = zzy(zzz);
                int i12 = this.zzc[i11];
                int i13 = zzz & 1048575;
                if (zzy >= zzagd.zzJ.zza() && zzy <= zzagd.zzW.zza()) {
                    int i14 = this.zzc[i11 + 2];
                }
                long j10 = i13;
                switch (zzy) {
                    case 0:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzB(zzajf.zzd(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzB(zzajf.zzd(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzx(zzajf.zzc(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzS(obj, i11)) {
                            Object zzf = zzajf.zzf(obj, j10);
                            if (zzf instanceof zzaff) {
                                int i15 = i12 << 3;
                                int i16 = zzafs.zzf;
                                int zzd = ((zzaff) zzf).zzd();
                                i10 = a.a(i15, zzafs.zzA(zzd) + zzd, i10);
                                break;
                            } else {
                                i10 = a.a(i12 << 3, zzafs.zzz((String) zzf), i10);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzS(obj, i11)) {
                            zzn = zzaid.zzn(i12, zzajf.zzf(obj, j10), zzC(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzS(obj, i11)) {
                            zzaff zzaffVar = (zzaff) zzajf.zzf(obj, j10);
                            int i17 = i12 << 3;
                            int i18 = zzafs.zzf;
                            int zzd2 = zzaffVar.zzd();
                            i10 = a.a(i17, zzafs.zzA(zzd2) + zzd2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzA(zzajf.zzc(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzx(zzajf.zzc(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzS(obj, i11)) {
                            i10 = a.a(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzS(obj, i11)) {
                            int zzc = zzajf.zzc(obj, j10);
                            i10 = a.a((zzc >> 31) ^ (zzc + zzc), zzafs.zzA(i12 << 3), i10);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzS(obj, i11)) {
                            long zzd3 = zzajf.zzd(obj, j10);
                            zzA = zzafs.zzA(i12 << 3);
                            zzB = zzafs.zzB((zzd3 >> 63) ^ (zzd3 + zzd3));
                            zzw = zzB + zzA;
                            i10 += zzw;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzS(obj, i11)) {
                            zzw = zzafs.zzw(i12, (zzahp) zzajf.zzf(obj, j10), zzC(i11));
                            i10 += zzw;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzaid.zzg(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 19:
                        zzn = zzaid.zze(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 20:
                        zzn = zzaid.zzl(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 21:
                        zzn = zzaid.zzw(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 22:
                        zzn = zzaid.zzj(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 23:
                        zzn = zzaid.zzg(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 24:
                        zzn = zzaid.zze(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 25:
                        zzn = zzaid.zza(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 26:
                        zzn = zzaid.zzt(i12, (List) zzajf.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 27:
                        zzn = zzaid.zzo(i12, (List) zzajf.zzf(obj, j10), zzC(i11));
                        i10 += zzn;
                        break;
                    case 28:
                        zzn = zzaid.zzb(i12, (List) zzajf.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 29:
                        zzn = zzaid.zzu(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 30:
                        zzn = zzaid.zzc(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 31:
                        zzn = zzaid.zze(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 32:
                        zzn = zzaid.zzg(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 33:
                        zzn = zzaid.zzp(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 34:
                        zzn = zzaid.zzr(i12, (List) zzajf.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 35:
                        int zzh = zzaid.zzh((List) unsafe.getObject(obj, j10));
                        if (zzh > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzh), zzh, i10);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int zzf2 = zzaid.zzf((List) unsafe.getObject(obj, j10));
                        if (zzf2 > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzf2), zzf2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int zzm = zzaid.zzm((List) unsafe.getObject(obj, j10));
                        if (zzm > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzm), zzm, i10);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int zzx = zzaid.zzx((List) unsafe.getObject(obj, j10));
                        if (zzx > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzx), zzx, i10);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int zzk = zzaid.zzk((List) unsafe.getObject(obj, j10));
                        if (zzk > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzk), zzk, i10);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int zzh2 = zzaid.zzh((List) unsafe.getObject(obj, j10));
                        if (zzh2 > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzh2), zzh2, i10);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int zzf3 = zzaid.zzf((List) unsafe.getObject(obj, j10));
                        if (zzf3 > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzf3), zzf3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j10);
                        int i19 = zzaid.zza;
                        int size = list.size();
                        if (size > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(size), size, i10);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int zzv = zzaid.zzv((List) unsafe.getObject(obj, j10));
                        if (zzv > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzv), zzv, i10);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int zzd4 = zzaid.zzd((List) unsafe.getObject(obj, j10));
                        if (zzd4 > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzd4), zzd4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int zzf4 = zzaid.zzf((List) unsafe.getObject(obj, j10));
                        if (zzf4 > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzf4), zzf4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int zzh3 = zzaid.zzh((List) unsafe.getObject(obj, j10));
                        if (zzh3 > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzh3), zzh3, i10);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int zzq = zzaid.zzq((List) unsafe.getObject(obj, j10));
                        if (zzq > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzq), zzq, i10);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int zzs = zzaid.zzs((List) unsafe.getObject(obj, j10));
                        if (zzs > 0) {
                            i10 = a.b(i12 << 3, zzafs.zzA(zzs), zzs, i10);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzaid.zzi(i12, (List) zzajf.zzf(obj, j10), zzC(i11));
                        i10 += zzn;
                        break;
                    case 50:
                        zzahk.zza(i12, zzajf.zzf(obj, j10), zzE(i11));
                        break;
                    case 51:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzB(zzA(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzB(zzA(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzx(zzq(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, 1, i10);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzW(obj, i12, i11)) {
                            Object zzf5 = zzajf.zzf(obj, j10);
                            if (zzf5 instanceof zzaff) {
                                int i20 = i12 << 3;
                                int i21 = zzafs.zzf;
                                int zzd5 = ((zzaff) zzf5).zzd();
                                i10 = a.a(i20, zzafs.zzA(zzd5) + zzd5, i10);
                                break;
                            } else {
                                i10 = a.a(i12 << 3, zzafs.zzz((String) zzf5), i10);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzW(obj, i12, i11)) {
                            zzn = zzaid.zzn(i12, zzajf.zzf(obj, j10), zzC(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzW(obj, i12, i11)) {
                            zzaff zzaffVar2 = (zzaff) zzajf.zzf(obj, j10);
                            int i22 = i12 << 3;
                            int i23 = zzafs.zzf;
                            int zzd6 = zzaffVar2.zzd();
                            i10 = a.a(i22, zzafs.zzA(zzd6) + zzd6, i10);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzA(zzq(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, zzafs.zzx(zzq(obj, j10)), i10);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, 4, i10);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzW(obj, i12, i11)) {
                            i10 = a.a(i12 << 3, 8, i10);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzW(obj, i12, i11)) {
                            int zzq2 = zzq(obj, j10);
                            i10 = a.a((zzq2 >> 31) ^ (zzq2 + zzq2), zzafs.zzA(i12 << 3), i10);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzW(obj, i12, i11)) {
                            long zzA2 = zzA(obj, j10);
                            zzA = zzafs.zzA(i12 << 3);
                            zzB = zzafs.zzB((zzA2 >> 63) ^ (zzA2 + zzA2));
                            zzw = zzB + zzA;
                            i10 += zzw;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzW(obj, i12, i11)) {
                            zzw = zzafs.zzw(i12, (zzahp) zzajf.zzf(obj, j10), zzC(i11));
                            i10 += zzw;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzaiv zzaivVar = this.zzo;
            return i10 + zzaivVar.zza(zzaivVar.zzd(obj));
        }
        return zzp(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
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
                    doubleToLongBits = Double.doubleToLongBits(zzajf.zza(obj, j10));
                    byte[] bArr = zzagq.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzajf.zzb(obj, j10));
                    i12 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zzajf.zzd(obj, j10);
                    byte[] bArr2 = zzagq.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zzajf.zzd(obj, j10);
                    byte[] bArr3 = zzagq.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 4:
                    i10 = i12 * 53;
                    zzc = zzajf.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zzajf.zzd(obj, j10);
                    byte[] bArr4 = zzagq.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 6:
                    i10 = i12 * 53;
                    zzc = zzajf.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = zzagq.zza(zzajf.zzw(obj, j10));
                    i12 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) zzajf.zzf(obj, j10)).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 9:
                    Object zzf = zzajf.zzf(obj, j10);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = zzajf.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 11:
                    i10 = i12 * 53;
                    zzc = zzajf.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 12:
                    i10 = i12 * 53;
                    zzc = zzajf.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 13:
                    i10 = i12 * 53;
                    zzc = zzajf.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zzajf.zzd(obj, j10);
                    byte[] bArr5 = zzagq.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 15:
                    i10 = i12 * 53;
                    zzc = zzajf.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zzajf.zzd(obj, j10);
                    byte[] bArr6 = zzagq.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzajf.zzf(obj, j10);
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
                    floatToIntBits = zzajf.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = zzajf.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 51:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzagq.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr8 = zzagq.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr9 = zzagq.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr10 = zzagq.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzagq.zza(zzX(obj, j10));
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) zzajf.zzf(obj, j10)).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzajf.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzajf.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr11 = zzagq.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzq(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzA(obj, j10);
                        byte[] bArr12 = zzagq.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzajf.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x0361, code lost:
    
        if (r0 != r13) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0363, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r8 = r18;
        r5 = r19;
        r3 = r19;
        r6 = r21;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037f, code lost:
    
        r2 = r0;
        r7 = r19;
        r6 = r21;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03b5, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03da, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x008c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.p002firebaseauthapi.zzaes r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzahs.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaes):int");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final Object zze() {
        return ((zzagk) this.zzg).zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzf(Object obj) {
        if (!zzV(obj)) {
            return;
        }
        if (obj instanceof zzagk) {
            zzagk zzagkVar = (zzagk) obj;
            zzagkVar.zzI(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            zzagkVar.zza = 0;
            zzagkVar.zzG();
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
                                ((zzahj) object).zzc();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzW(obj, this.zzc[i10], i10)) {
                    zzC(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            if (zzS(obj, i10)) {
                zzC(i10).zzf(zzb.getObject(obj, j10));
            }
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzz = zzz(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzS(obj2, i10)) {
                        zzajf.zzo(obj, j10, zzajf.zza(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj2, i10)) {
                        zzajf.zzp(obj, j10, zzajf.zzb(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzS(obj2, i10)) {
                        zzajf.zzr(obj, j10, zzajf.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzS(obj2, i10)) {
                        zzajf.zzr(obj, j10, zzajf.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzS(obj2, i10)) {
                        zzajf.zzq(obj, j10, zzajf.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzS(obj2, i10)) {
                        zzajf.zzr(obj, j10, zzajf.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzS(obj2, i10)) {
                        zzajf.zzq(obj, j10, zzajf.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzS(obj2, i10)) {
                        zzajf.zzm(obj, j10, zzajf.zzw(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzS(obj2, i10)) {
                        zzajf.zzs(obj, j10, zzajf.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i10);
                    break;
                case 10:
                    if (zzS(obj2, i10)) {
                        zzajf.zzs(obj, j10, zzajf.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzS(obj2, i10)) {
                        zzajf.zzq(obj, j10, zzajf.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzS(obj2, i10)) {
                        zzajf.zzq(obj, j10, zzajf.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzS(obj2, i10)) {
                        zzajf.zzq(obj, j10, zzajf.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzS(obj2, i10)) {
                        zzajf.zzr(obj, j10, zzajf.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzS(obj2, i10)) {
                        zzajf.zzq(obj, j10, zzajf.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzS(obj2, i10)) {
                        zzajf.zzr(obj, j10, zzajf.zzd(obj2, j10));
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
                    int i12 = zzaid.zza;
                    zzajf.zzs(obj, j10, zzahk.zzc(zzajf.zzf(obj, j10), zzajf.zzf(obj2, j10)));
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
                    if (zzW(obj2, i11, i10)) {
                        zzajf.zzs(obj, j10, zzajf.zzf(obj2, j10));
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
                    if (zzW(obj2, i11, i10)) {
                        zzajf.zzs(obj, j10, zzajf.zzf(obj2, j10));
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
        zzaid.zzC(this.zzo, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0662 A[LOOP:2: B:36:0x065e->B:38:0x0662, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0631 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:16:0x00db, B:44:0x062c, B:46:0x0631, B:47:0x0636), top: B:15:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x063c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.p002firebaseauthapi.zzaia r19, com.google.android.gms.internal.p002firebaseauthapi.zzafx r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzahs.zzh(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaia, com.google.android.gms.internal.firebase-auth-api.zzafx):void");
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
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzaes r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzahs.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaes):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzj(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzahs.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final boolean zzk(Object obj) {
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
            if ((268435456 & zzz) != 0 && !zzT(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy != 60 && zzy != 68) {
                        if (zzy != 49) {
                            if (zzy == 50 && !((zzahj) zzajf.zzf(obj, zzz & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzW(obj, i16, i15) && !zzU(obj, zzz, zzC(i15))) {
                        return false;
                    }
                }
                List list = (List) zzajf.zzf(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzaib zzC = zzC(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzC.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzT(obj, i15, i10, i11, i19) && !zzU(obj, zzz, zzC(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:274:0x0496. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzm(Object obj, zzaft zzaftVar) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1048575;
        if (this.zzj) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i15 = 0; i15 < length; i15 += 3) {
                    int zzz = zzz(i15);
                    int i16 = this.zzc[i15];
                    switch (zzy(zzz)) {
                        case 0:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzf(i16, zzajf.zza(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzo(i16, zzajf.zzb(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzt(i16, zzajf.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzJ(i16, zzajf.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzr(i16, zzajf.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzm(i16, zzajf.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzk(i16, zzajf.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzb(i16, zzajf.zzw(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzS(obj, i15)) {
                                zzZ(i16, zzajf.zzf(obj, zzz & 1048575), zzaftVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzv(i16, zzajf.zzf(obj, zzz & 1048575), zzC(i15));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzd(i16, (zzaff) zzajf.zzf(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzH(i16, zzajf.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzi(i16, zzajf.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzw(i16, zzajf.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzy(i16, zzajf.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzA(i16, zzajf.zzc(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzC(i16, zzajf.zzd(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzS(obj, i15)) {
                                zzaftVar.zzq(i16, zzajf.zzf(obj, zzz & 1048575), zzC(i15));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzaid.zzH(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 19:
                            zzaid.zzL(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 20:
                            zzaid.zzO(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 21:
                            zzaid.zzW(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 22:
                            zzaid.zzN(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 23:
                            zzaid.zzK(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 24:
                            zzaid.zzJ(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 25:
                            zzaid.zzF(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 26:
                            zzaid.zzU(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar);
                            break;
                        case 27:
                            zzaid.zzP(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, zzC(i15));
                            break;
                        case 28:
                            zzaid.zzG(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar);
                            break;
                        case 29:
                            zzaid.zzV(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 30:
                            zzaid.zzI(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 31:
                            zzaid.zzQ(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 32:
                            zzaid.zzR(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 33:
                            zzaid.zzS(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 34:
                            zzaid.zzT(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, false);
                            break;
                        case 35:
                            zzaid.zzH(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 36:
                            zzaid.zzL(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 37:
                            zzaid.zzO(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 38:
                            zzaid.zzW(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 39:
                            zzaid.zzN(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 40:
                            zzaid.zzK(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 41:
                            zzaid.zzJ(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 42:
                            zzaid.zzF(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 43:
                            zzaid.zzV(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 44:
                            zzaid.zzI(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 45:
                            zzaid.zzQ(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 46:
                            zzaid.zzR(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 47:
                            zzaid.zzS(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 48:
                            zzaid.zzT(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, true);
                            break;
                        case 49:
                            zzaid.zzM(i16, (List) zzajf.zzf(obj, zzz & 1048575), zzaftVar, zzC(i15));
                            break;
                        case 50:
                            zzY(zzaftVar, i16, zzajf.zzf(obj, zzz & 1048575), i15);
                            break;
                        case 51:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzf(i16, zzn(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzo(i16, zzo(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzt(i16, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzJ(i16, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzr(i16, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzm(i16, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzk(i16, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzb(i16, zzX(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzW(obj, i16, i15)) {
                                zzZ(i16, zzajf.zzf(obj, zzz & 1048575), zzaftVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzv(i16, zzajf.zzf(obj, zzz & 1048575), zzC(i15));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzd(i16, (zzaff) zzajf.zzf(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzH(i16, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzi(i16, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzw(i16, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzy(i16, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzA(i16, zzq(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzC(i16, zzA(obj, zzz & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzW(obj, i16, i15)) {
                                zzaftVar.zzq(i16, zzajf.zzf(obj, zzz & 1048575), zzC(i15));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzaiv zzaivVar = this.zzo;
                zzaivVar.zzr(zzaivVar.zzd(obj), zzaftVar);
                return;
            }
            this.zzp.zza(obj);
            throw null;
        }
        if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i17 = 0;
            int i18 = 0;
            int i19 = 1048575;
            while (i17 < length2) {
                int zzz2 = zzz(i17);
                int[] iArr = this.zzc;
                int i20 = iArr[i17];
                int zzy = zzy(zzz2);
                if (zzy <= 17) {
                    int i21 = iArr[i17 + 2];
                    int i22 = i21 & i14;
                    if (i22 != i19) {
                        i18 = unsafe.getInt(obj, i22);
                        i19 = i22;
                    }
                    i10 = 1 << (i21 >>> 20);
                } else {
                    i10 = i13;
                }
                long j10 = zzz2 & i14;
                switch (zzy) {
                    case 0:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzf(i20, zzajf.zza(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzo(i20, zzajf.zzb(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzt(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzJ(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzr(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzm(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzk(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzb(i20, zzajf.zzw(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzZ(i20, unsafe.getObject(obj, j10), zzaftVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzv(i20, unsafe.getObject(obj, j10), zzC(i17));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzd(i20, (zzaff) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzH(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzi(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzw(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzy(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzA(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzC(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzaftVar.zzq(i20, unsafe.getObject(obj, j10), zzC(i17));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i11 = 0;
                        zzaid.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 19:
                        i11 = 0;
                        zzaid.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 20:
                        i11 = 0;
                        zzaid.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 21:
                        i11 = 0;
                        zzaid.zzW(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 22:
                        i11 = 0;
                        zzaid.zzN(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 23:
                        i11 = 0;
                        zzaid.zzK(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 24:
                        i11 = 0;
                        zzaid.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 25:
                        i11 = 0;
                        zzaid.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        break;
                    case 26:
                        zzaid.zzU(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar);
                        i11 = 0;
                        break;
                    case 27:
                        zzaid.zzP(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, zzC(i17));
                        i11 = 0;
                        break;
                    case 28:
                        zzaid.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar);
                        i11 = 0;
                        break;
                    case 29:
                        i12 = 0;
                        zzaid.zzV(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        i11 = i12;
                        break;
                    case 30:
                        i12 = 0;
                        zzaid.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        i11 = i12;
                        break;
                    case 31:
                        i12 = 0;
                        zzaid.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        i11 = i12;
                        break;
                    case 32:
                        i12 = 0;
                        zzaid.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        i11 = i12;
                        break;
                    case 33:
                        i12 = 0;
                        zzaid.zzS(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        i11 = i12;
                        break;
                    case 34:
                        i12 = 0;
                        zzaid.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, false);
                        i11 = i12;
                        break;
                    case 35:
                        zzaid.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 36:
                        zzaid.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 37:
                        zzaid.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 38:
                        zzaid.zzW(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 39:
                        zzaid.zzN(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 40:
                        zzaid.zzK(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 41:
                        zzaid.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 42:
                        zzaid.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 43:
                        zzaid.zzV(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 44:
                        zzaid.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 45:
                        zzaid.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 46:
                        zzaid.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 47:
                        zzaid.zzS(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 48:
                        zzaid.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, true);
                        i11 = 0;
                        break;
                    case 49:
                        zzaid.zzM(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzaftVar, zzC(i17));
                        i11 = 0;
                        break;
                    case 50:
                        zzY(zzaftVar, i20, unsafe.getObject(obj, j10), i17);
                        i11 = 0;
                        break;
                    case 51:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzf(i20, zzn(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 52:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzo(i20, zzo(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 53:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzt(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 54:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzJ(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 55:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzr(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 56:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzm(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 57:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzk(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 58:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzb(i20, zzX(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 59:
                        if (zzW(obj, i20, i17)) {
                            zzZ(i20, unsafe.getObject(obj, j10), zzaftVar);
                        }
                        i11 = 0;
                        break;
                    case 60:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzv(i20, unsafe.getObject(obj, j10), zzC(i17));
                        }
                        i11 = 0;
                        break;
                    case 61:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzd(i20, (zzaff) unsafe.getObject(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 62:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzH(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 63:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzi(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 64:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzw(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 65:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzy(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 66:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzA(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 67:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzC(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 68:
                        if (zzW(obj, i20, i17)) {
                            zzaftVar.zzq(i20, unsafe.getObject(obj, j10), zzC(i17));
                        }
                        i11 = 0;
                        break;
                    default:
                        i11 = 0;
                        break;
                }
                i17 += 3;
                i13 = i11;
                i14 = 1048575;
            }
            zzaiv zzaivVar2 = this.zzo;
            zzaivVar2.zzr(zzaivVar2.zzd(obj), zzaftVar);
            return;
        }
        this.zzp.zza(obj);
        throw null;
    }
}
