package cv;

import bv.a0;
import bv.f0;
import bv.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13079a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f13079a = bytes;
    }

    public static final boolean a(f0 segment, int i10, byte[] bytes, int i11) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i12 = segment.f7345c;
        byte[] bArr = segment.f7343a;
        for (int i13 = 1; i13 < i11; i13++) {
            if (i10 == i12) {
                segment = segment.f7348f;
                Intrinsics.c(segment);
                i10 = segment.f7344b;
                i12 = segment.f7345c;
                bArr = segment.f7343a;
            }
            if (bArr[i10] != bytes[i13]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static final String b(j jVar, long j10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (jVar.f(j11) == 13) {
                String z10 = jVar.z(j11, Charsets.UTF_8);
                jVar.skip(2L);
                return z10;
            }
        }
        jVar.getClass();
        String z11 = jVar.z(j10, Charsets.UTF_8);
        jVar.skip(1L);
        return z11;
    }

    public static final int c(j jVar, a0 options, boolean z10) {
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        boolean z11;
        f0 f0Var;
        byte[] bArr2;
        int i13;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        f0 f0Var2 = jVar.f7364a;
        if (f0Var2 == null) {
            if (z10) {
                return -2;
            }
            return -1;
        }
        int i14 = f0Var2.f7344b;
        int i15 = f0Var2.f7345c;
        int[] iArr = options.f7321c;
        byte[] bArr3 = f0Var2.f7343a;
        f0 f0Var3 = f0Var2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArr[i17];
            int i20 = i17 + 2;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (f0Var3 == null) {
                break;
            }
            if (i19 < 0) {
                int i22 = (i19 * (-1)) + i20;
                while (true) {
                    int i23 = i14 + 1;
                    int i24 = i20 + 1;
                    if ((bArr3[i14] & 255) != iArr[i20]) {
                        return i16;
                    }
                    if (i24 == i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i23 == i15) {
                        Intrinsics.c(f0Var3);
                        f0 f0Var4 = f0Var3.f7348f;
                        Intrinsics.c(f0Var4);
                        i13 = f0Var4.f7344b;
                        int i25 = f0Var4.f7345c;
                        bArr2 = f0Var4.f7343a;
                        if (f0Var4 == f0Var2) {
                            if (!z11) {
                                break loop0;
                            }
                            i15 = i25;
                            f0Var = null;
                        } else {
                            f0Var = f0Var4;
                            i15 = i25;
                        }
                    } else {
                        f0Var = f0Var3;
                        bArr2 = bArr3;
                        i13 = i23;
                    }
                    if (z11) {
                        i10 = iArr[i24];
                        int i26 = i13;
                        i11 = i15;
                        i12 = i26;
                        byte[] bArr4 = bArr2;
                        f0Var3 = f0Var;
                        bArr = bArr4;
                        break;
                    }
                    i14 = i13;
                    bArr3 = bArr2;
                    f0Var3 = f0Var;
                    i20 = i24;
                }
            } else {
                int i27 = i14 + 1;
                int i28 = bArr3[i14] & 255;
                int i29 = i20 + i19;
                while (i20 != i29) {
                    if (i28 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i27 == i15) {
                            f0Var3 = f0Var3.f7348f;
                            Intrinsics.c(f0Var3);
                            i12 = f0Var3.f7344b;
                            i11 = f0Var3.f7345c;
                            bArr = f0Var3.f7343a;
                            if (f0Var3 == f0Var2) {
                                f0Var3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i11 = i15;
                            i12 = i27;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            byte[] bArr5 = bArr;
            i17 = -i10;
            i14 = i12;
            i15 = i11;
            bArr3 = bArr5;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }
}
