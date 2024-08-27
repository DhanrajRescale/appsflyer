package t;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f34914a = f0.f34855a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f34915b = n.f34885a;

    /* renamed from: c, reason: collision with root package name */
    public int f34916c;

    /* renamed from: d, reason: collision with root package name */
    public int f34917d;

    /* renamed from: e, reason: collision with root package name */
    public int f34918e;

    public w(int i10) {
        if (i10 >= 0) {
            e(f0.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean a(long j10) {
        int hashCode = Long.hashCode(j10) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f34916c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f34914a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (i11 * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f34915b[numberOfTrailingZeros] == j10) {
                    if (numberOfTrailingZeros < 0) {
                        return false;
                    }
                    return true;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f34917d != this.f34917d) {
            return false;
        }
        long[] jArr = this.f34915b;
        long[] jArr2 = this.f34914a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !wVar.a(jArr[(i10 << 3) + i12])) {
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

    public final int c(int i10) {
        int i11 = this.f34916c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f34914a;
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

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        long[] jArr = this.f34915b;
        long[] jArr2 = this.f34914a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            i12 = Long.hashCode(jArr[(i11 << 3) + i14]) + i12;
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

    public final void e(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, f0.c(i10));
        } else {
            i11 = 0;
        }
        this.f34916c = i11;
        if (i11 == 0) {
            jArr = f0.f34855a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        this.f34914a = jArr;
        int i12 = i11 >> 3;
        long j10 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f34918e = f0.a(this.f34916c) - this.f34917d;
        this.f34915b = new long[i11];
    }

    public final void f(int i10) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.f34914a;
        long[] jArr4 = this.f34915b;
        int i11 = this.f34916c;
        e(i10);
        long[] jArr5 = this.f34915b;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr3[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j10 = jArr4[i12];
                int hashCode = Long.hashCode(j10) * (-862048943);
                int i13 = hashCode ^ (hashCode << 16);
                int c10 = c(i13 >>> 7);
                long j11 = i13 & 127;
                long[] jArr6 = this.f34914a;
                int i14 = c10 >> 3;
                int i15 = (c10 & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i14] = (jArr6[i14] & (~(255 << i15))) | (j11 << i15);
                int i16 = this.f34916c;
                int i17 = ((c10 - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr6[i18] = ((~(255 << i19)) & jArr6[i18]) | (j11 << i19);
                jArr5[c10] = j10;
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i12++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f34915b;
        long[] jArr2 = this.f34914a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            loop0: while (true) {
                long j10 = jArr2[i13];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i13 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j10 & 255) < 128) {
                            i11 = i13;
                            long j11 = jArr[(i13 << 3) + i17];
                            if (i14 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i14 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(j11);
                            i14++;
                            i12 = 8;
                        } else {
                            i11 = i13;
                            i12 = i15;
                        }
                        j10 >>= i12;
                        i17++;
                        i15 = i12;
                        i13 = i11;
                    }
                    int i18 = i13;
                    if (i16 != i15) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i13;
                }
                if (i10 == length) {
                    break;
                }
                i13 = i10 + 1;
            }
        }
        sb2.append((CharSequence) "]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
