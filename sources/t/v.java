package t;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f34910a = f0.f34855a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f34911b = n.f34885a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f34912c = u.a.f36601c;

    /* renamed from: d, reason: collision with root package name */
    public int f34913d;

    public v(int i10) {
        if (i10 >= 0) {
            d(f0.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr;
        long[] jArr2;
        int i11;
        int i12;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        int i13;
        int i14;
        long j10;
        int i15;
        if (obj == this) {
            return true;
        }
        int i16 = 0;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        vVar.getClass();
        long[] jArr5 = this.f34911b;
        Object[] objArr3 = this.f34912c;
        long[] jArr6 = this.f34910a;
        int length = jArr6.length - 2;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j11 = jArr6[i17];
                int i18 = 7;
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8;
                    int i20 = 8 - ((~(i17 - length)) >>> 31);
                    while (i16 < i20) {
                        if ((j11 & 255) < 128) {
                            int i21 = (i17 << 3) + i16;
                            long j13 = jArr5[i21];
                            Object obj2 = objArr3[i21];
                            if (obj2 == null) {
                                if (vVar.b(j13) == null) {
                                    int hashCode = Long.hashCode(j13) * (-862048943);
                                    int i22 = hashCode ^ (hashCode << 16);
                                    int i23 = i22 & 127;
                                    int i24 = vVar.f34913d;
                                    int i25 = (i22 >>> i18) & i24;
                                    int i26 = 0;
                                    while (true) {
                                        long[] jArr7 = vVar.f34910a;
                                        int i27 = i25 >> 3;
                                        jArr3 = jArr5;
                                        int i28 = (i25 & 7) << 3;
                                        long j14 = jArr7[i27] >>> i28;
                                        long j15 = jArr7[i27 + 1] << (64 - i28);
                                        objArr2 = objArr3;
                                        jArr4 = jArr6;
                                        long j16 = j14 | (j15 & ((-i28) >> 63));
                                        i13 = length;
                                        i14 = i17;
                                        long j17 = (i23 * 72340172838076673L) ^ j16;
                                        long j18 = (j17 - 72340172838076673L) & (~j17) & (-9187201950435737472L);
                                        while (j18 != 0) {
                                            int numberOfTrailingZeros = (i25 + (Long.numberOfTrailingZeros(j18) >> 3)) & i24;
                                            int i29 = i23;
                                            if (vVar.f34911b[numberOfTrailingZeros] == j13) {
                                                if (numberOfTrailingZeros >= 0) {
                                                    j10 = -9187201950435737472L;
                                                } else {
                                                    return false;
                                                }
                                            } else {
                                                j18 &= j18 - 1;
                                                i23 = i29;
                                            }
                                        }
                                        int i30 = i23;
                                        if ((j16 & ((~j16) << 6) & (-9187201950435737472L)) != 0) {
                                            return false;
                                        }
                                        i26 += 8;
                                        i25 = (i25 + i26) & i24;
                                        length = i13;
                                        objArr3 = objArr2;
                                        i17 = i14;
                                        jArr5 = jArr3;
                                        jArr6 = jArr4;
                                        i23 = i30;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                jArr3 = jArr5;
                                objArr2 = objArr3;
                                jArr4 = jArr6;
                                i13 = length;
                                i14 = i17;
                                j10 = -9187201950435737472L;
                                if (!Intrinsics.a(obj2, vVar.b(j13))) {
                                    return false;
                                }
                            }
                            i15 = 8;
                        } else {
                            jArr3 = jArr5;
                            objArr2 = objArr3;
                            jArr4 = jArr6;
                            i13 = length;
                            i14 = i17;
                            j10 = j12;
                            i15 = i19;
                        }
                        j11 >>= i15;
                        i16++;
                        i19 = i15;
                        j12 = j10;
                        objArr3 = objArr2;
                        i17 = i14;
                        jArr6 = jArr4;
                        i18 = 7;
                        length = i13;
                        jArr5 = jArr3;
                    }
                    jArr = jArr5;
                    objArr = objArr3;
                    jArr2 = jArr6;
                    i11 = length;
                    int i31 = i17;
                    i10 = 0;
                    if (i20 == i19) {
                        i12 = i31;
                    } else {
                        return true;
                    }
                } else {
                    jArr = jArr5;
                    i10 = i16;
                    objArr = objArr3;
                    jArr2 = jArr6;
                    i11 = length;
                    i12 = i17;
                }
                if (i12 == i11) {
                    return true;
                }
                i17 = i12 + 1;
                i16 = i10;
                length = i11;
                objArr3 = objArr;
                jArr5 = jArr;
                jArr6 = jArr2;
            }
        } else {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = java.lang.Long.hashCode(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f34913d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L14:
            long[] r5 = r0.f34910a
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L40:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L5d
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.f34911b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L57
            goto L67
        L57:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L40
        L5d:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L70
            r11 = -1
        L67:
            if (r11 < 0) goto L6e
            java.lang.Object[] r1 = r0.f34912c
            r1 = r1[r11]
            goto L6f
        L6e:
            r1 = 0
        L6f:
            return r1
        L70:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: t.v.b(long):java.lang.Object");
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i10;
        long[] jArr = this.f34911b;
        Object[] objArr = this.f34912c;
        long[] jArr2 = this.f34910a;
        int length = jArr2.length - 2;
        int i11 = 0;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            long j11 = jArr[i16];
                            Object obj = objArr[i16];
                            int hashCode = Long.hashCode(j11);
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            i13 += i10 ^ hashCode;
                        }
                        j10 >>= 8;
                    }
                    if (i14 != 8) {
                        return i13;
                    }
                }
                if (i12 != length) {
                    i12++;
                } else {
                    i11 = i13;
                    break;
                }
            }
        }
        return i11;
    }

    public final void d(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, f0.c(i10));
        } else {
            i11 = 0;
        }
        this.f34913d = i11;
        if (i11 == 0) {
            jArr = f0.f34855a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        this.f34910a = jArr;
        int i12 = i11 >> 3;
        long j10 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        f0.a(this.f34913d);
        this.f34911b = new long[i11];
        this.f34912c = new Object[i11];
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "{}";
    }
}
