package t;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import kotlin.jvm.internal.Intrinsics;
import ut.t;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f34899a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f34900b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f34901c;

    /* renamed from: d, reason: collision with root package name */
    public int f34902d;

    /* renamed from: e, reason: collision with root package name */
    public int f34903e;

    /* renamed from: f, reason: collision with root package name */
    public int f34904f;

    public t(int i10) {
        this.f34899a = f0.f34855a;
        this.f34900b = l.f34879a;
        this.f34901c = u.a.f36601c;
        if (i10 >= 0) {
            i(f0.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void a() {
        this.f34903e = 0;
        long[] jArr = this.f34899a;
        if (jArr != f0.f34855a) {
            vt.t.l(jArr);
            long[] jArr2 = this.f34899a;
            int i10 = this.f34902d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        vt.t.k(0, this.f34902d, this.f34901c);
        this.f34904f = f0.a(this.f34902d) - this.f34903e;
    }

    public final boolean b(int i10) {
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f34902d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f34899a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f34900b[numberOfTrailingZeros] == i10) {
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

    public final boolean c(int i10) {
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f34902d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f34899a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f34900b[numberOfTrailingZeros] == i10) {
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
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (tVar.f34903e != this.f34903e) {
            return false;
        }
        int[] iArr = this.f34900b;
        Object[] objArr = this.f34901c;
        long[] jArr = this.f34899a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            int i14 = iArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (tVar.g(i14) != null || !tVar.c(i14)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.a(obj2, tVar.g(i14))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int e(int i10) {
        int i11;
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f34902d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f34899a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j11 = i14;
            int i20 = i17;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                if (this.f34900b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int f10 = f(i13);
                if (this.f34904f == 0 && ((this.f34899a[f10 >> 3] >> ((f10 & 7) << 3)) & 255) != 254) {
                    int i21 = this.f34902d;
                    if (i21 > 8) {
                        long j14 = this.f34903e;
                        t.Companion companion = ut.t.INSTANCE;
                        if (Long.compare((j14 * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) <= 0) {
                            j(f0.b(this.f34902d));
                            f10 = f(i13);
                        }
                    }
                    j(f0.b(this.f34902d));
                    f10 = f(i13);
                }
                this.f34903e++;
                int i22 = this.f34904f;
                long[] jArr2 = this.f34899a;
                int i23 = f10 >> 3;
                long j15 = jArr2[i23];
                int i24 = (f10 & 7) << 3;
                if (((j15 >> i24) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f34904f = i22 - i11;
                jArr2[i23] = ((~(255 << i24)) & j15) | (j11 << i24);
                int i25 = this.f34902d;
                int i26 = ((f10 - 7) & i25) + (i25 & 7);
                int i27 = i26 >> 3;
                int i28 = (i26 & 7) << 3;
                jArr2[i27] = ((~(255 << i28)) & jArr2[i27]) | (j11 << i28);
                return f10;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    public final int f(int i10) {
        int i11 = this.f34902d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f34899a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f34902d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f34899a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f34900b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r13.f34901c
            r14 = r14[r10]
            goto L6c
        L6b:
            r14 = 0
        L6c:
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: t.t.g(int):java.lang.Object");
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i10;
        int[] iArr = this.f34900b;
        Object[] objArr = this.f34901c;
        long[] jArr = this.f34899a;
        int length = jArr.length - 2;
        int i11 = 0;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            int i17 = iArr[i16];
                            Object obj = objArr[i16];
                            int hashCode = Integer.hashCode(i17);
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

    public final void i(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, f0.c(i10));
        } else {
            i11 = 0;
        }
        this.f34902d = i11;
        if (i11 == 0) {
            jArr = f0.f34855a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        this.f34899a = jArr;
        int i12 = i11 >> 3;
        long j10 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f34904f = f0.a(this.f34902d) - this.f34903e;
        this.f34900b = new int[i11];
        this.f34901c = new Object[i11];
    }

    public final void j(int i10) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f34899a;
        int[] iArr2 = this.f34900b;
        Object[] objArr = this.f34901c;
        int i11 = this.f34902d;
        i(i10);
        int[] iArr3 = this.f34900b;
        Object[] objArr2 = this.f34901c;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr2[i12];
                int hashCode = Integer.hashCode(i13) * (-862048943);
                int i14 = hashCode ^ (hashCode << 16);
                int f10 = f(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr3 = this.f34899a;
                int i15 = f10 >> 3;
                int i16 = (f10 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i15] = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f34902d;
                int i18 = ((f10 - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr3[i19] = ((~(255 << i20)) & jArr3[i19]) | (j10 << i20);
                iArr3[f10] = i13;
                objArr2[f10] = objArr[i12];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i12++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    public final void k(int i10, Object obj) {
        int e10 = e(i10);
        this.f34900b[e10] = i10;
        this.f34901c[e10] = obj;
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f34903e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(UrlTreeKt.componentParamPrefix);
        int[] iArr = this.f34900b;
        Object[] objArr = this.f34901c;
        long[] jArr = this.f34899a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj = objArr[i14];
                            sb2.append(i15);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i11++;
                            if (i11 < this.f34903e) {
                                sb2.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "s.append('}').toString()");
        return sb3;
    }

    public /* synthetic */ t() {
        this(6);
    }
}
