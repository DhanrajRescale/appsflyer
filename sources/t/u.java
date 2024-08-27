package t;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f34905a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f34906b;

    /* renamed from: c, reason: collision with root package name */
    public int f34907c;

    /* renamed from: d, reason: collision with root package name */
    public int f34908d;

    /* renamed from: e, reason: collision with root package name */
    public int f34909e;

    public u(int i10) {
        this.f34905a = f0.f34855a;
        this.f34906b = l.f34879a;
        if (i10 >= 0) {
            g(f0.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        r3 = e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r20.f34909e != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (((r20.f34905a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r3 = r20.f34907c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r3 <= 8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        r11 = r20.f34908d;
        r5 = ut.t.f37407b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (java.lang.Long.compare((r11 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        i(t.f0.b(r20.f34907c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        r3 = e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        i(t.f0.b(r20.f34907c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        r17 = r3;
        r19 = true;
        r20.f34908d++;
        r3 = r20.f34909e;
        r4 = r20.f34905a;
        r5 = r17 >> 3;
        r11 = r4[r5];
        r8 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        if (((r11 >> r8) & 255) != 128) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        r20.f34909e = r3 - r13;
        r4[r5] = (r11 & (~(255 << r8))) | (r9 << r8);
        r3 = r20.f34907c;
        r5 = ((r17 - 7) & r3) + (r3 & 7);
        r3 = r5 >> 3;
        r5 = (r5 & 7) << 3;
        r4[r3] = ((~(255 << r5)) & r4[r3]) | (r9 << r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        r13 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.u.a(int):boolean");
    }

    public final void b() {
        this.f34908d = 0;
        long[] jArr = this.f34905a;
        if (jArr != f0.f34855a) {
            vt.t.l(jArr);
            long[] jArr2 = this.f34905a;
            int i10 = this.f34907c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f34909e = f0.a(this.f34907c) - this.f34908d;
    }

    public final boolean c(int i10) {
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f34907c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f34905a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f34906b[numberOfTrailingZeros] == i10) {
                    if (numberOfTrailingZeros < 0) {
                        return false;
                    }
                    return true;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f34908d != this.f34908d) {
            return false;
        }
        int[] iArr = this.f34906b;
        long[] jArr = this.f34905a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !uVar.c(iArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    public final int e(int i10) {
        int i11 = this.f34907c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f34905a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int[] iArr = this.f34906b;
        long[] jArr = this.f34905a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            i12 = Integer.hashCode(iArr[(i11 << 3) + i14]) + i12;
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = i12;
                    break;
                }
            }
        }
        return i10;
    }

    public final void g(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, f0.c(i10));
        } else {
            i11 = 0;
        }
        this.f34907c = i11;
        if (i11 == 0) {
            jArr = f0.f34855a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        this.f34905a = jArr;
        int i12 = i11 >> 3;
        long j10 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f34909e = f0.a(this.f34907c) - this.f34908d;
        this.f34906b = new int[i11];
    }

    public final void h(int i10) {
        this.f34908d--;
        long[] jArr = this.f34905a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f34907c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    public final void i(int i10) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f34905a;
        int[] iArr2 = this.f34906b;
        int i11 = this.f34907c;
        g(i10);
        int[] iArr3 = this.f34906b;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr2[i12];
                int hashCode = Integer.hashCode(i13) * (-862048943);
                int i14 = hashCode ^ (hashCode << 16);
                int e10 = e(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr3 = this.f34905a;
                int i15 = e10 >> 3;
                int i16 = (e10 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i15] = ((~(255 << i16)) & jArr3[i15]) | (j10 << i16);
                int i17 = this.f34907c;
                int i18 = ((e10 - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr3[i19] = ((~(255 << i20)) & jArr3[i19]) | (j10 << i20);
                iArr3[e10] = i13;
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i12++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        int i10;
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f34906b;
        long[] jArr = this.f34905a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            int i16 = iArr[(i11 << 3) + i15];
                            if (i12 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(i16);
                            i12++;
                            i10 = 8;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        sb2.append((CharSequence) "]");
        String sb32 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb32, "StringBuilder().apply(builderAction).toString()");
        return sb32;
    }

    public /* synthetic */ u() {
        this(6);
    }
}
