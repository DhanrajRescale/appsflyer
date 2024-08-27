package com.google.protobuf;

/* loaded from: classes2.dex */
public final class s1 extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11986c;

    public static int d(long j10, byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return u1.d(i10, r1.g(bArr, j10), r1.g(bArr, j10 + 1));
                }
                throw new AssertionError();
            }
            return u1.c(i10, r1.g(bArr, j10));
        }
        s1 s1Var = u1.f11992a;
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.CharSequence r26, byte[] r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s1.b(java.lang.CharSequence, byte[], int, int):int");
    }

    public final int c(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = i10;
        byte b10 = -62;
        switch (this.f11986c) {
            case 0:
                break;
            default:
                if ((i13 | i11 | (bArr.length - i11)) >= 0) {
                    long j10 = i13;
                    int i14 = (int) (i11 - j10);
                    if (i14 < 16) {
                        i12 = 0;
                    } else {
                        int i15 = 8 - (((int) j10) & 7);
                        long j11 = j10;
                        i12 = 0;
                        while (true) {
                            if (i12 < i15) {
                                long j12 = j11 + 1;
                                if (r1.g(bArr, j11) >= 0) {
                                    i12++;
                                    j11 = j12;
                                }
                            } else {
                                while (true) {
                                    int i16 = i12 + 8;
                                    if (i16 <= i14) {
                                        if ((r1.f11981c.h(r1.f11984f + j11, bArr) & (-9187201950435737472L)) == 0) {
                                            j11 += 8;
                                            i12 = i16;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i12 < i14) {
                                        long j13 = j11 + 1;
                                        if (r1.g(bArr, j11) >= 0) {
                                            i12++;
                                            j11 = j13;
                                        }
                                    } else {
                                        i12 = i14;
                                    }
                                }
                            }
                        }
                    }
                    int i17 = i14 - i12;
                    long j14 = j10 + i12;
                    while (true) {
                        byte b11 = 0;
                        while (true) {
                            if (i17 > 0) {
                                long j15 = j14 + 1;
                                byte g10 = r1.g(bArr, j14);
                                if (g10 >= 0) {
                                    i17--;
                                    j14 = j15;
                                    b11 = g10;
                                } else {
                                    j14 = j15;
                                    b11 = g10;
                                }
                            }
                        }
                        if (i17 == 0) {
                            return 0;
                        }
                        int i18 = i17 - 1;
                        if (b11 < -32) {
                            if (i18 == 0) {
                                return b11;
                            }
                            i17 -= 2;
                            if (b11 >= b10) {
                                long j16 = j14 + 1;
                                if (r1.g(bArr, j14) <= -65) {
                                    j14 = j16;
                                    b10 = -62;
                                }
                            }
                        } else if (b11 < -16) {
                            if (i18 < 2) {
                                return d(j14, bArr, b11, i18);
                            }
                            i17 -= 3;
                            long j17 = j14 + 1;
                            byte g11 = r1.g(bArr, j14);
                            if (g11 <= -65 && ((b11 != -32 || g11 >= -96) && (b11 != -19 || g11 < -96))) {
                                j14 += 2;
                                if (r1.g(bArr, j17) <= -65) {
                                    b10 = -62;
                                }
                            }
                        } else {
                            if (i18 < 3) {
                                return d(j14, bArr, b11, i18);
                            }
                            i17 -= 4;
                            long j18 = j14 + 1;
                            byte g12 = r1.g(bArr, j14);
                            if (g12 <= -65) {
                                if ((((g12 + 112) + (b11 << 28)) >> 30) == 0) {
                                    long j19 = 2 + j14;
                                    if (r1.g(bArr, j18) <= -65) {
                                        j14 += 3;
                                        if (r1.g(bArr, j19) <= -65) {
                                            b10 = -62;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        while (i13 < i11 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i11) {
            while (i13 < i11) {
                int i19 = i13 + 1;
                byte b12 = bArr[i13];
                if (b12 < 0) {
                    if (b12 < -32) {
                        if (i19 >= i11) {
                            return b12;
                        }
                        if (b12 >= -62) {
                            i13 += 2;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b12 < -16) {
                        if (i19 >= i11 - 1) {
                            return u1.a(bArr, i19, i11);
                        }
                        int i20 = i13 + 2;
                        byte b13 = bArr[i19];
                        if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                            i13 += 3;
                            if (bArr[i20] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i19 >= i11 - 2) {
                        return u1.a(bArr, i19, i11);
                    }
                    int i21 = i13 + 2;
                    byte b14 = bArr[i19];
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b12 << 28)) >> 30) == 0) {
                            int i22 = i13 + 3;
                            if (bArr[i21] <= -65) {
                                i13 += 4;
                                if (bArr[i22] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i19;
            }
        }
        return 0;
    }
}
