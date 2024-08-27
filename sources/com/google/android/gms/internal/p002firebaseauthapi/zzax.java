package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzax extends zzap {
    static final zzap zza = new zzax(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzax(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static zzax zzg(int i10, Object[] objArr, zzao zzaoVar) {
        int i11;
        byte[] bArr;
        int i12 = i10;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return (zzax) zza;
        }
        Object obj = null;
        if (i12 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zzae.zza(obj2, obj3);
            return new zzax(null, objArr2, 1);
        }
        zzu.zzb(i12, objArr2.length >> 1, "index");
        int max = Math.max(i12, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1);
            do {
                i11 += i11;
            } while (i11 * 0.7d < max);
        } else {
            i11 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zzae.zza(obj4, obj5);
        } else {
            int i13 = i11 - 1;
            char c10 = 65535;
            if (i11 <= 128) {
                bArr = new byte[i11];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                for (int i15 = 0; i15 < i12; i15++) {
                    int i16 = i14 + i14;
                    int i17 = i15 + i15;
                    Object obj6 = objArr2[i17];
                    obj6.getClass();
                    Object obj7 = objArr2[i17 ^ 1];
                    obj7.getClass();
                    zzae.zza(obj6, obj7);
                    int zza2 = zzaf.zza(obj6.hashCode());
                    while (true) {
                        int i18 = zza2 & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i14 < i15) {
                                objArr2[i16] = obj6;
                                objArr2[i16 ^ 1] = obj7;
                            }
                            i14++;
                        } else {
                            if (obj6.equals(objArr2[i19])) {
                                int i20 = i19 ^ 1;
                                Object obj8 = objArr2[i20];
                                obj8.getClass();
                                zzan zzanVar = new zzan(obj6, obj7, obj8);
                                objArr2[i20] = obj7;
                                obj = zzanVar;
                                break;
                            }
                            zza2 = i18 + 1;
                        }
                    }
                }
                if (i14 != i12) {
                    obj = new Object[]{bArr, Integer.valueOf(i14), obj};
                }
                obj = bArr;
            } else if (i11 <= 32768) {
                bArr = new short[i11];
                Arrays.fill(bArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i12; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj9 = objArr2[i24];
                    obj9.getClass();
                    Object obj10 = objArr2[i24 ^ 1];
                    obj10.getClass();
                    zzae.zza(obj9, obj10);
                    int zza3 = zzaf.zza(obj9.hashCode());
                    while (true) {
                        int i25 = zza3 & i13;
                        char c11 = (char) bArr[i25];
                        if (c11 == 65535) {
                            bArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArr2[i23] = obj9;
                                objArr2[i23 ^ 1] = obj10;
                            }
                            i21++;
                        } else {
                            if (obj9.equals(objArr2[c11])) {
                                int i26 = c11 ^ 1;
                                Object obj11 = objArr2[i26];
                                obj11.getClass();
                                zzan zzanVar2 = new zzan(obj9, obj10, obj11);
                                objArr2[i26] = obj10;
                                obj = zzanVar2;
                                break;
                            }
                            zza3 = i25 + 1;
                        }
                    }
                }
                if (i21 != i12) {
                    obj = new Object[]{bArr, Integer.valueOf(i21), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[i11];
                Arrays.fill((int[]) bArr, -1);
                int i27 = 0;
                int i28 = 0;
                while (i27 < i12) {
                    int i29 = i28 + i28;
                    int i30 = i27 + i27;
                    Object obj12 = objArr2[i30];
                    obj12.getClass();
                    Object obj13 = objArr2[i30 ^ 1];
                    obj13.getClass();
                    zzae.zza(obj12, obj13);
                    int zza4 = zzaf.zza(obj12.hashCode());
                    while (true) {
                        int i31 = zza4 & i13;
                        ?? r15 = bArr[i31];
                        if (r15 == c10) {
                            bArr[i31] = i29;
                            if (i28 < i27) {
                                objArr2[i29] = obj12;
                                objArr2[i29 ^ 1] = obj13;
                            }
                            i28++;
                        } else {
                            if (obj12.equals(objArr2[r15])) {
                                int i32 = r15 ^ 1;
                                Object obj14 = objArr2[i32];
                                obj14.getClass();
                                zzan zzanVar3 = new zzan(obj12, obj13, obj14);
                                objArr2[i32] = obj13;
                                obj = zzanVar3;
                                break;
                            }
                            zza4 = i31 + 1;
                            c10 = 65535;
                        }
                    }
                    i27++;
                    c10 = 65535;
                }
                if (i28 != i12) {
                    obj = new Object[]{bArr, Integer.valueOf(i28), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzaoVar.zzc = (zzan) objArr3[2];
            Object obj15 = objArr3[0];
            int intValue = ((Integer) objArr3[1]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj = obj15;
            i12 = intValue;
        }
        return new zzax(obj, objArr2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zzc
            java.lang.Object[] r1 = r9.zzb
            int r2 = r9.zzd
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaf.zza(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaf.zza(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.p002firebaseauthapi.zzaf.zza(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzax.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzai zza() {
        return new zzaw(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzaq zzd() {
        return new zzau(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzaq zze() {
        return new zzav(this, new zzaw(this.zzb, 0, this.zzd));
    }
}
