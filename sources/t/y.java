package t;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import ut.t;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f34925a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f34926b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f34927c;

    /* renamed from: d, reason: collision with root package name */
    public int f34928d;

    /* renamed from: e, reason: collision with root package name */
    public int f34929e;

    /* renamed from: f, reason: collision with root package name */
    public int f34930f;

    public y(int i10) {
        this.f34925a = f0.f34855a;
        this.f34926b = u.a.f36601c;
        this.f34927c = l.f34879a;
        if (i10 >= 0) {
            f(f0.d(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f34929e != this.f34929e) {
            return false;
        }
        Object[] objArr = this.f34926b;
        int[] iArr = this.f34927c;
        long[] jArr = this.f34925a;
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
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            int d10 = yVar.d(obj2);
                            if (d10 >= 0) {
                                if (i14 != yVar.f34927c[d10]) {
                                    return false;
                                }
                            } else {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
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
        int i11 = this.f34928d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f34925a;
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

    public final int c(Object obj) {
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
        int i16 = this.f34928d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f34925a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j10 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j11 = i15;
            int i21 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                if (Intrinsics.a(this.f34926b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int b10 = b(i14);
                if (this.f34930f == 0 && ((this.f34925a[b10 >> 3] >> ((b10 & 7) << 3)) & 255) != 254) {
                    int i22 = this.f34928d;
                    if (i22 > 8) {
                        long j14 = this.f34929e;
                        t.Companion companion = ut.t.INSTANCE;
                        if (Long.compare((j14 * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            h(f0.b(this.f34928d));
                            b10 = b(i14);
                        }
                    }
                    h(f0.b(this.f34928d));
                    b10 = b(i14);
                }
                this.f34929e++;
                int i23 = this.f34930f;
                long[] jArr2 = this.f34925a;
                int i24 = b10 >> 3;
                long j15 = jArr2[i24];
                int i25 = (b10 & 7) << 3;
                if (((j15 >> i25) & 255) == 128) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                this.f34930f = i23 - i11;
                jArr2[i24] = (j15 & (~(255 << i25))) | (j11 << i25);
                int i26 = this.f34928d;
                int i27 = ((b10 - 7) & i26) + (i26 & 7);
                int i28 = i27 >> 3;
                int i29 = (i27 & 7) << 3;
                jArr2[i28] = ((~(255 << i29)) & jArr2[i28]) | (j11 << i29);
                return ~b10;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
    }

    public final int d(Object obj) {
        int i10;
        int i11 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 & 127;
        int i15 = this.f34928d;
        int i16 = i13 >>> 7;
        while (true) {
            int i17 = i16 & i15;
            long[] jArr = this.f34925a;
            int i18 = i17 >> 3;
            int i19 = (i17 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j11 = (i14 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i17) & i15;
                if (Intrinsics.a(this.f34926b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i16 = i17 + i11;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i10;
        Object[] objArr = this.f34926b;
        int[] iArr = this.f34927c;
        long[] jArr = this.f34925a;
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
                            Object obj = objArr[i16];
                            int i17 = iArr[i16];
                            if (obj != null) {
                                i10 = obj.hashCode();
                            } else {
                                i10 = 0;
                            }
                            i13 += Integer.hashCode(i17) ^ i10;
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

    public final void f(int i10) {
        int i11;
        long[] jArr;
        if (i10 > 0) {
            i11 = Math.max(7, f0.c(i10));
        } else {
            i11 = 0;
        }
        this.f34928d = i11;
        if (i11 == 0) {
            jArr = f0.f34855a;
        } else {
            jArr = new long[((i11 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        this.f34925a = jArr;
        int i12 = i11 >> 3;
        long j10 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f34930f = f0.a(this.f34928d) - this.f34929e;
        this.f34926b = new Object[i11];
        this.f34927c = new int[i11];
    }

    public final void g(int i10) {
        this.f34929e--;
        long[] jArr = this.f34925a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f34928d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f34926b[i10] = null;
    }

    public final void h(int i10) {
        int i11;
        int i12;
        long[] jArr = this.f34925a;
        Object[] objArr = this.f34926b;
        int[] iArr = this.f34927c;
        int i13 = this.f34928d;
        f(i10);
        Object[] objArr2 = this.f34926b;
        int[] iArr2 = this.f34927c;
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
                int b10 = b(i16 >>> 7);
                long j10 = i16 & 127;
                long[] jArr2 = this.f34925a;
                int i17 = b10 >> 3;
                int i18 = (b10 & 7) << 3;
                i11 = i14;
                jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (j10 << i18);
                int i19 = this.f34928d;
                int i20 = ((b10 - 7) & i19) + (i19 & 7);
                int i21 = i20 >> 3;
                int i22 = (i20 & 7) << 3;
                jArr2[i21] = (jArr2[i21] & (~(255 << i22))) | (j10 << i22);
                objArr2[b10] = obj;
                iArr2[b10] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f34929e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(UrlTreeKt.componentParamPrefix);
        Object[] objArr = this.f34926b;
        int[] iArr = this.f34927c;
        long[] jArr = this.f34925a;
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
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i15);
                            i11++;
                            if (i11 < this.f34929e) {
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

    public /* synthetic */ y() {
        this(6);
    }
}
