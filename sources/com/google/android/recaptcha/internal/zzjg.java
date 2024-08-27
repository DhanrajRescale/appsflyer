package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzjg {
    private static final zzjg zza = new zzjg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjg(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzjg zzc() {
        return zza;
    }

    public static zzjg zze(zzjg zzjgVar, zzjg zzjgVar2) {
        int i10 = zzjgVar.zzb + zzjgVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzjgVar.zzc, i10);
        System.arraycopy(zzjgVar2.zzc, 0, copyOf, zzjgVar.zzb, zzjgVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzjgVar.zzd, i10);
        System.arraycopy(zzjgVar2.zzd, 0, copyOf2, zzjgVar.zzb, zzjgVar2.zzb);
        return new zzjg(i10, copyOf, copyOf2, true);
    }

    public static zzjg zzf() {
        return new zzjg(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzjg)) {
            return false;
        }
        zzjg zzjgVar = (zzjg) obj;
        int i10 = this.zzb;
        if (i10 == zzjgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjgVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjgVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    public final int zza() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12];
                int i14 = i13 >>> 3;
                int i15 = i13 & 7;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 5) {
                                    ((Integer) this.zzd[i12]).intValue();
                                    i11 = a.z(i14 << 3, 4, i11);
                                } else {
                                    throw new IllegalStateException(zzgy.zza());
                                }
                            } else {
                                int i16 = i14 << 3;
                                int i17 = zzfk.zzb;
                                int zza2 = ((zzjg) this.zzd[i12]).zza();
                                int zzy = zzfk.zzy(i16);
                                i11 = zzy + zzy + zza2 + i11;
                            }
                        } else {
                            zzez zzezVar = (zzez) this.zzd[i12];
                            int i18 = zzfk.zzb;
                            int zzd = zzezVar.zzd();
                            i11 = a.z(i14 << 3, zzfk.zzy(zzd) + zzd, i11);
                        }
                    } else {
                        ((Long) this.zzd[i12]).longValue();
                        i11 = a.z(i14 << 3, 8, i11);
                    }
                } else {
                    i11 = a.z(i14 << 3, zzfk.zzz(((Long) this.zzd[i12]).longValue()), i11);
                }
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12] >>> 3;
                zzez zzezVar = (zzez) this.zzd[i12];
                int i14 = zzfk.zzb;
                int zzd = zzezVar.zzd();
                int zzy = zzfk.zzy(zzd) + zzd;
                int zzy2 = zzfk.zzy(16);
                int zzy3 = zzfk.zzy(i13);
                int zzy4 = zzfk.zzy(8);
                i11 = a.A(24, zzy, zzy2 + zzy3 + zzy4 + zzy4, i11);
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    public final zzjg zzd(zzjg zzjgVar) {
        if (zzjgVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzjgVar.zzb;
        zzm(i10);
        System.arraycopy(zzjgVar.zzc, 0, this.zzc, this.zzb, zzjgVar.zzb);
        System.arraycopy(zzjgVar.zzd, 0, this.zzd, this.zzb, zzjgVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzia.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzjx zzjxVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzjxVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzjx zzjxVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    zzjxVar.zzk(i13, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzgy.zza());
                                }
                            } else {
                                zzjxVar.zzF(i13);
                                ((zzjg) obj).zzl(zzjxVar);
                                zzjxVar.zzh(i13);
                            }
                        } else {
                            zzjxVar.zzd(i13, (zzez) obj);
                        }
                    } else {
                        zzjxVar.zzm(i13, ((Long) obj).longValue());
                    }
                } else {
                    zzjxVar.zzt(i13, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzjg() {
        this(0, new int[8], new Object[8], true);
    }
}
