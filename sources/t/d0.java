package t;

import kotlin.jvm.internal.Intrinsics;
import ut.t;

/* loaded from: classes.dex */
public final class d0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public int f34849e;

    public d0(int i10) {
        this.f34862a = f0.f34855a;
        this.f34863b = u.a.f36601c;
        if (i10 >= 0) {
            h(f0.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean d(Object obj) {
        int i10 = this.f34865d;
        this.f34863b[f(obj)] = obj;
        if (this.f34865d != i10) {
            return true;
        }
        return false;
    }

    public final void e() {
        this.f34865d = 0;
        long[] jArr = this.f34862a;
        if (jArr != f0.f34855a) {
            vt.t.l(jArr);
            long[] jArr2 = this.f34862a;
            int i10 = this.f34864c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        vt.t.k(0, this.f34864c, this.f34863b);
        this.f34849e = f0.a(this.f34864c) - this.f34865d;
    }

    public final int f(Object obj) {
        int i10;
        int i11;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f34864c;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f34862a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j10 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j11 = i15;
            int i21 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                if (Intrinsics.a(this.f34863b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int g10 = g(i14);
                if (this.f34849e == 0 && ((this.f34862a[g10 >> 3] >> ((g10 & 7) << 3)) & 255) != 254) {
                    int i22 = this.f34864c;
                    if (i22 > 8) {
                        long j14 = this.f34865d;
                        t.Companion companion = ut.t.INSTANCE;
                        if (Long.compare((j14 * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            l(f0.b(this.f34864c));
                            g10 = g(i14);
                        }
                    }
                    l(f0.b(this.f34864c));
                    g10 = g(i14);
                }
                this.f34865d++;
                int i23 = this.f34849e;
                long[] jArr2 = this.f34862a;
                int i24 = g10 >> 3;
                long j15 = jArr2[i24];
                int i25 = (g10 & 7) << 3;
                if (((j15 >> i25) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f34849e = i23 - i11;
                jArr2[i24] = (j15 & (~(255 << i25))) | (j11 << i25);
                int i26 = this.f34864c;
                int i27 = ((g10 - 7) & i26) + (i26 & 7);
                int i28 = i27 >> 3;
                int i29 = (i27 & 7) << 3;
                jArr2[i28] = ((~(255 << i29)) & jArr2[i28]) | (j11 << i29);
                return g10;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
    }

    public final int g(int i10) {
        int i11 = this.f34864c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f34862a;
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

    public final void h(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, f0.c(i10));
        } else {
            i11 = 0;
        }
        this.f34864c = i11;
        if (i11 == 0) {
            jArr = f0.f34855a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        this.f34862a = jArr;
        int i12 = i11 >> 3;
        long j10 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f34849e = f0.a(this.f34864c) - this.f34865d;
        this.f34863b = new Object[i11];
    }

    public final void i(d0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f34863b;
        long[] jArr = elements.f34862a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            this.f34863b[f(obj)] = obj;
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f34864c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f34862a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f34863b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.k(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d0.j(java.lang.Object):boolean");
    }

    public final void k(int i10) {
        this.f34865d--;
        long[] jArr = this.f34862a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f34864c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f34863b[i10] = null;
    }

    public final void l(int i10) {
        int i11;
        int i12;
        long[] jArr = this.f34862a;
        Object[] objArr = this.f34863b;
        int i13 = this.f34864c;
        h(i10);
        Object[] objArr2 = this.f34863b;
        int i14 = 0;
        while (i14 < i13) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                if (obj != null) {
                    i12 = obj.hashCode();
                } else {
                    i12 = 0;
                }
                int i15 = i12 * (-862048943);
                int i16 = i15 ^ (i15 << 16);
                int g10 = g(i16 >>> 7);
                long j10 = i16 & 127;
                long[] jArr2 = this.f34862a;
                int i17 = g10 >> 3;
                int i18 = (g10 & 7) << 3;
                i11 = i14;
                jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (j10 << i18);
                int i19 = this.f34864c;
                int i20 = ((g10 - 7) & i19) + (i19 & 7);
                int i21 = i20 >> 3;
                int i22 = (i20 & 7) << 3;
                jArr2[i21] = ((~(255 << i22)) & jArr2[i21]) | (j10 << i22);
                objArr2[g10] = obj;
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public /* synthetic */ d0() {
        this(6);
    }
}
