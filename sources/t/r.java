package t;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public long[] f34891a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f34892b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f34893c;

    /* renamed from: d, reason: collision with root package name */
    public int f34894d;

    /* renamed from: e, reason: collision with root package name */
    public int f34895e;

    /* renamed from: f, reason: collision with root package name */
    public int f34896f;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f34895e != this.f34895e) {
            return false;
        }
        int[] iArr = this.f34892b;
        int[] iArr2 = this.f34893c;
        long[] jArr = this.f34891a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (iArr2[i13] != rVar.d(iArr[i13])) {
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
        }
        return true;
    }

    public final int b(int i10) {
        int i11 = this.f34894d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f34891a;
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

    public final int c(int i10) {
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f34894d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f34891a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f34892b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int d(int i10) {
        int c10 = c(i10);
        if (c10 >= 0) {
            return this.f34893c[c10];
        }
        throw new NoSuchElementException(jr.h.n("Cannot find value for key ", i10));
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int[] iArr = this.f34892b;
        int[] iArr2 = this.f34893c;
        long[] jArr = this.f34891a;
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
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr[i15];
                            i12 += Integer.hashCode(iArr2[i15]) ^ Integer.hashCode(i16);
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

    public final void f(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, f0.c(i10));
        } else {
            i11 = 0;
        }
        this.f34894d = i11;
        if (i11 == 0) {
            jArr = f0.f34855a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        this.f34891a = jArr;
        int i12 = i11 >> 3;
        long j10 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f34896f = f0.a(this.f34894d) - this.f34895e;
        this.f34892b = new int[i11];
        this.f34893c = new int[i11];
    }

    public final void g(int i10) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f34891a;
        int[] iArr2 = this.f34892b;
        int[] iArr3 = this.f34893c;
        int i11 = this.f34894d;
        f(i10);
        int[] iArr4 = this.f34892b;
        int[] iArr5 = this.f34893c;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr2[i12];
                int hashCode = Integer.hashCode(i13) * (-862048943);
                int i14 = hashCode ^ (hashCode << 16);
                int b10 = b(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr3 = this.f34891a;
                int i15 = b10 >> 3;
                int i16 = (b10 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i15] = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f34894d;
                int i18 = ((b10 - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr3[i19] = ((~(255 << i20)) & jArr3[i19]) | (j10 << i20);
                iArr4[b10] = i13;
                iArr5[b10] = iArr3[i12];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i12++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f34895e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(UrlTreeKt.componentParamPrefix);
        int[] iArr = this.f34892b;
        int[] iArr2 = this.f34893c;
        long[] jArr = this.f34891a;
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
                            int i16 = iArr2[i14];
                            sb2.append(i15);
                            sb2.append("=");
                            sb2.append(i16);
                            i11++;
                            if (i11 < this.f34895e) {
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
}
