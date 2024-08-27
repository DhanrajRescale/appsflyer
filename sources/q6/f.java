package q6;

import android.util.Pair;
import androidx.media3.common.ParserException;
import b5.q0;
import b5.r0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import e5.x;
import java.util.Arrays;
import okhttp3.HttpUrl;
import z5.v;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f31678a;

    static {
        int i10 = x.f15050a;
        f31678a = "OpusHead".getBytes(kp.e.f23433c);
    }

    public static d a(int i10, e5.p pVar) {
        long j10;
        long j11;
        pVar.F(i10 + 12);
        pVar.G(1);
        b(pVar);
        pVar.G(2);
        int u10 = pVar.u();
        if ((u10 & 128) != 0) {
            pVar.G(2);
        }
        if ((u10 & 64) != 0) {
            pVar.G(pVar.u());
        }
        if ((u10 & 32) != 0) {
            pVar.G(2);
        }
        pVar.G(1);
        b(pVar);
        String e10 = r0.e(pVar.u());
        if (!"audio/mpeg".equals(e10) && !"audio/vnd.dts".equals(e10) && !"audio/vnd.dts.hd".equals(e10)) {
            pVar.G(4);
            long v10 = pVar.v();
            long v11 = pVar.v();
            pVar.G(1);
            int b10 = b(pVar);
            byte[] bArr = new byte[b10];
            pVar.e(bArr, 0, b10);
            if (v11 > 0) {
                j10 = v11;
            } else {
                j10 = -1;
            }
            if (v10 > 0) {
                j11 = v10;
            } else {
                j11 = -1;
            }
            return new d(e10, bArr, j10, j11);
        }
        return new d(e10, null, -1L, -1L);
    }

    public static int b(e5.p pVar) {
        int u10 = pVar.u();
        int i10 = u10 & 127;
        while ((u10 & 128) == 128) {
            u10 = pVar.u();
            i10 = (i10 << 7) | (u10 & 127);
        }
        return i10;
    }

    public static l5.j c(e5.p pVar) {
        long j10;
        pVar.F(8);
        if (h5.a.h(pVar.g()) == 0) {
            j10 = pVar.v();
            pVar.G(4);
        } else {
            long o10 = pVar.o();
            pVar.G(8);
            j10 = o10;
        }
        return new l5.j(new q0(new f5.a((j10 - 2082844800) * 1000)), 2, pVar.v());
    }

    public static Pair d(int i10, int i11, e5.p pVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        r rVar;
        Pair create;
        int i12;
        int i13;
        boolean z13;
        byte[] bArr;
        int i14 = pVar.f15037b;
        while (i14 - i10 < i11) {
            pVar.F(i14);
            int g10 = pVar.g();
            boolean z14 = false;
            if (g10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e5.a.e("childAtomSize must be positive", z10);
            if (pVar.g() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < g10) {
                    pVar.F(i15);
                    int g11 = pVar.g();
                    int g12 = pVar.g();
                    if (g12 == 1718775137) {
                        num2 = Integer.valueOf(pVar.g());
                    } else if (g12 == 1935894637) {
                        pVar.G(4);
                        str = pVar.s(4, kp.e.f23433c);
                    } else if (g12 == 1935894633) {
                        i17 = i15;
                        i16 = g11;
                    }
                    i15 += g11;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e5.a.e("frma atom is mandatory", z11);
                    if (i17 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e5.a.e("schi atom is mandatory", z12);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 < i16) {
                            pVar.F(i18);
                            int g13 = pVar.g();
                            if (pVar.g() == 1952804451) {
                                int h10 = h5.a.h(pVar.g());
                                pVar.G(1);
                                if (h10 == 0) {
                                    pVar.G(1);
                                    i12 = 0;
                                    i13 = 0;
                                } else {
                                    int u10 = pVar.u();
                                    int i19 = (u10 & 240) >> 4;
                                    i12 = u10 & 15;
                                    i13 = i19;
                                }
                                if (pVar.u() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int u11 = pVar.u();
                                byte[] bArr2 = new byte[16];
                                pVar.e(bArr2, 0, 16);
                                if (z13 && u11 == 0) {
                                    int u12 = pVar.u();
                                    byte[] bArr3 = new byte[u12];
                                    pVar.e(bArr3, 0, u12);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                rVar = new r(z13, str, u11, bArr2, i13, i12, bArr);
                            } else {
                                i18 += g13;
                            }
                        } else {
                            num = num2;
                            rVar = null;
                            break;
                        }
                    }
                    if (rVar != null) {
                        z14 = true;
                    }
                    e5.a.e("tenc atom is mandatory", z14);
                    int i20 = x.f15050a;
                    create = Pair.create(num, rVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += g10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [k3.o, java.lang.Object] */
    public static t e(q qVar, a aVar, v vVar) {
        r4.b bVar;
        boolean z10;
        e5.p pVar;
        e5.p pVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        b5.v vVar2;
        int i14;
        boolean z12;
        int i15;
        q qVar2;
        long[] jArr;
        int i16;
        String str;
        int[] iArr;
        long[] jArr2;
        int i17;
        int[] iArr2;
        long[] jArr3;
        int i18;
        long j10;
        int i19;
        long[] jArr4;
        int i20;
        int i21;
        int i22;
        int[] iArr3;
        int i23;
        int i24;
        long[] jArr5;
        int i25;
        int i26;
        boolean z13;
        int i27;
        long[] jArr6;
        int[] iArr4;
        int[] iArr5;
        long[] jArr7;
        int[] iArr6;
        int[] iArr7;
        long j11;
        long[] jArr8;
        int i28;
        int i29;
        int i30;
        b j12 = aVar.j(1937011578);
        b5.v vVar3 = qVar.f31769f;
        if (j12 != null) {
            bVar = new r4.b(j12, vVar3);
        } else {
            b j13 = aVar.j(1937013298);
            if (j13 != null) {
                ?? obj = new Object();
                e5.p pVar3 = j13.f31664c;
                obj.f22022e = pVar3;
                pVar3.F(12);
                obj.f22019b = ((e5.p) obj.f22022e).x() & 255;
                obj.f22018a = ((e5.p) obj.f22022e).x();
                bVar = obj;
            } else {
                throw ParserException.a("Track has no sample table size information", null);
            }
        }
        int b10 = bVar.b();
        if (b10 == 0) {
            return new t(qVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b j14 = aVar.j(1937007471);
        if (j14 == null) {
            j14 = aVar.j(1668232756);
            j14.getClass();
            z10 = true;
        } else {
            z10 = false;
        }
        b j15 = aVar.j(1937011555);
        j15.getClass();
        b j16 = aVar.j(1937011827);
        j16.getClass();
        b j17 = aVar.j(1937011571);
        if (j17 != null) {
            pVar = j17.f31664c;
        } else {
            pVar = null;
        }
        b j18 = aVar.j(1668576371);
        if (j18 != null) {
            pVar2 = j18.f31664c;
        } else {
            pVar2 = null;
        }
        c cVar = new c(j15.f31664c, j14.f31664c, z10);
        e5.p pVar4 = j16.f31664c;
        pVar4.F(12);
        int x10 = pVar4.x() - 1;
        int x11 = pVar4.x();
        int x12 = pVar4.x();
        if (pVar2 != null) {
            pVar2.F(12);
            i10 = pVar2.x();
        } else {
            i10 = 0;
        }
        if (pVar != null) {
            pVar.F(12);
            i12 = pVar.x();
            if (i12 > 0) {
                i11 = pVar.x() - 1;
            } else {
                i11 = -1;
                pVar = null;
            }
        } else {
            i11 = -1;
            i12 = 0;
        }
        int a10 = bVar.a();
        String str2 = vVar3.f3652l;
        if (a10 != -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && x10 == 0 && i10 == 0 && i12 == 0)) {
            i13 = x10;
            z11 = true;
        } else {
            i13 = x10;
            z11 = false;
        }
        if (z11) {
            int i31 = cVar.f31665a;
            long[] jArr9 = new long[i31];
            int[] iArr8 = new int[i31];
            while (cVar.a()) {
                int i32 = cVar.f31666b;
                jArr9[i32] = cVar.f31668d;
                iArr8[i32] = cVar.f31667c;
            }
            long j19 = x12;
            int i33 = UserMetadata.MAX_INTERNAL_KEY_SIZE / a10;
            int i34 = 0;
            for (int i35 = 0; i35 < i31; i35++) {
                i34 += x.g(iArr8[i35], i33);
            }
            long[] jArr10 = new long[i34];
            int[] iArr9 = new int[i34];
            long[] jArr11 = new long[i34];
            int[] iArr10 = new int[i34];
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (i37 < i31) {
                int i40 = iArr8[i37];
                long j20 = jArr9[i37];
                int i41 = i39;
                int i42 = i31;
                int i43 = i38;
                int i44 = i41;
                long[] jArr12 = jArr9;
                int i45 = i40;
                while (i45 > 0) {
                    int min = Math.min(i33, i45);
                    jArr10[i44] = j20;
                    int[] iArr11 = iArr8;
                    int i46 = a10 * min;
                    iArr9[i44] = i46;
                    i43 = Math.max(i43, i46);
                    jArr11[i44] = i36 * j19;
                    iArr10[i44] = 1;
                    j20 += iArr9[i44];
                    i36 += min;
                    i45 -= min;
                    i44++;
                    iArr8 = iArr11;
                    i33 = i33;
                }
                i37++;
                jArr9 = jArr12;
                int i47 = i44;
                i38 = i43;
                i31 = i42;
                i39 = i47;
            }
            long j21 = j19 * i36;
            i18 = b10;
            vVar2 = vVar3;
            jArr3 = jArr10;
            iArr2 = iArr10;
            iArr = iArr9;
            jArr2 = jArr11;
            i17 = i38;
            qVar2 = qVar;
            j10 = j21;
        } else {
            long[] jArr13 = new long[b10];
            int[] iArr12 = new int[b10];
            long[] jArr14 = new long[b10];
            int[] iArr13 = new int[b10];
            vVar2 = vVar3;
            int i48 = i11;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            long j22 = 0;
            int i52 = 0;
            int i53 = 0;
            long j23 = 0;
            while (true) {
                if (i49 < b10) {
                    boolean z14 = true;
                    while (i51 == 0) {
                        z14 = cVar.a();
                        if (!z14) {
                            break;
                        }
                        int i54 = x11;
                        long j24 = cVar.f31668d;
                        i51 = cVar.f31667c;
                        j23 = j24;
                        x11 = i54;
                        x12 = x12;
                        b10 = b10;
                    }
                    int i55 = b10;
                    i14 = x11;
                    int i56 = x12;
                    if (!z14) {
                        e5.m.f("AtomParsers", "Unexpected end of chunk data");
                        jArr13 = Arrays.copyOf(jArr13, i49);
                        iArr12 = Arrays.copyOf(iArr12, i49);
                        jArr14 = Arrays.copyOf(jArr14, i49);
                        iArr13 = Arrays.copyOf(iArr13, i49);
                        b10 = i49;
                        break;
                    }
                    if (pVar2 != null) {
                        while (i53 == 0 && i10 > 0) {
                            i53 = pVar2.x();
                            i52 = pVar2.g();
                            i10--;
                        }
                        i53--;
                    }
                    int i57 = i52;
                    jArr13[i49] = j23;
                    int c10 = bVar.c();
                    iArr12[i49] = c10;
                    if (c10 > i50) {
                        i50 = c10;
                    }
                    jArr14[i49] = j22 + i57;
                    if (pVar == null) {
                        i19 = 1;
                    } else {
                        i19 = 0;
                    }
                    iArr13[i49] = i19;
                    if (i49 == i48) {
                        iArr13[i49] = 1;
                        i12--;
                        if (i12 > 0) {
                            pVar.getClass();
                            i48 = pVar.x() - 1;
                        }
                    }
                    j22 += i56;
                    x11 = i14 - 1;
                    if (x11 == 0 && i13 > 0) {
                        i21 = i13 - 1;
                        jArr4 = jArr13;
                        x11 = pVar4.x();
                        i20 = pVar4.g();
                    } else {
                        jArr4 = jArr13;
                        i20 = i56;
                        i21 = i13;
                    }
                    i52 = i57;
                    j23 += iArr12[i49];
                    i51--;
                    i49++;
                    i13 = i21;
                    jArr13 = jArr4;
                    b10 = i55;
                    x12 = i20;
                } else {
                    i14 = x11;
                    break;
                }
            }
            int i58 = i51;
            long j25 = j22 + i52;
            if (pVar2 != null) {
                while (i10 > 0) {
                    if (pVar2.x() != 0) {
                        z12 = false;
                        break;
                    }
                    pVar2.g();
                    i10--;
                }
            }
            z12 = true;
            if (i12 == 0 && i14 == 0 && i58 == 0 && i13 == 0) {
                i15 = i53;
                if (i15 == 0 && z12) {
                    qVar2 = qVar;
                    jArr = jArr13;
                    i16 = b10;
                    iArr = iArr12;
                    jArr2 = jArr14;
                    i17 = i50;
                    iArr2 = iArr13;
                    jArr3 = jArr;
                    i18 = i16;
                    j10 = j25;
                }
            } else {
                i15 = i53;
            }
            StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
            qVar2 = qVar;
            jArr = jArr13;
            i16 = b10;
            jr.h.v(sb2, qVar2.f31764a, ": remainingSynchronizationSamples ", i12, ", remainingSamplesAtTimestampDelta ");
            jr.h.v(sb2, i14, ", remainingSamplesInChunk ", i58, ", remainingTimestampDeltaChanges ");
            sb2.append(i13);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i15);
            if (!z12) {
                str = ", ctts invalid";
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb2.append(str);
            e5.m.f("AtomParsers", sb2.toString());
            iArr = iArr12;
            jArr2 = jArr14;
            i17 = i50;
            iArr2 = iArr13;
            jArr3 = jArr;
            i18 = i16;
            j10 = j25;
        }
        long L = x.L(j10, 1000000L, qVar2.f31766c);
        long j26 = qVar2.f31766c;
        long[] jArr15 = qVar2.f31771h;
        if (jArr15 == null) {
            x.M(jArr2, j26);
            return new t(qVar, jArr3, iArr, i17, jArr2, iArr2, L);
        }
        int length = jArr15.length;
        int i59 = qVar2.f31765b;
        long[] jArr16 = qVar2.f31772i;
        if (length == 1 && i59 == 1 && jArr2.length >= 2) {
            jArr16.getClass();
            long j27 = jArr16[0];
            i24 = i59;
            iArr3 = iArr;
            i23 = i17;
            long L2 = x.L(jArr15[0], qVar2.f31766c, qVar2.f31767d) + j27;
            int length2 = jArr2.length - 1;
            i22 = i18;
            int i60 = x.i(4, 0, length2);
            jArr5 = jArr16;
            int i61 = x.i(jArr2.length - 4, 0, length2);
            long j28 = jArr2[0];
            if (j28 <= j27 && j27 < jArr2[i60] && jArr2[i61] < L2 && L2 <= j10) {
                long j29 = j10 - L2;
                b5.v vVar4 = vVar2;
                long L3 = x.L(j27 - j28, vVar4.f3666z, qVar2.f31766c);
                long L4 = x.L(j29, vVar4.f3666z, qVar2.f31766c);
                if ((L3 != 0 || L4 != 0) && L3 <= 2147483647L && L4 <= 2147483647L) {
                    vVar.f42132a = (int) L3;
                    vVar.f42133b = (int) L4;
                    x.M(jArr2, j26);
                    return new t(qVar, jArr3, iArr3, i23, jArr2, iArr2, x.L(jArr15[0], 1000000L, qVar2.f31767d));
                }
            }
        } else {
            i22 = i18;
            iArr3 = iArr;
            i23 = i17;
            i24 = i59;
            jArr5 = jArr16;
        }
        int i62 = 1;
        if (jArr15.length == 1) {
            i25 = 0;
            if (jArr15[0] == 0) {
                jArr5.getClass();
                long j30 = jArr5[0];
                for (int i63 = 0; i63 < jArr2.length; i63++) {
                    jArr2[i63] = x.L(jArr2[i63] - j30, 1000000L, qVar2.f31766c);
                }
                return new t(qVar, jArr3, iArr3, i23, jArr2, iArr2, x.L(j10 - j30, 1000000L, qVar2.f31766c));
            }
            i26 = i24;
            i62 = 1;
        } else {
            i25 = 0;
            i26 = i24;
        }
        if (i26 == i62) {
            z13 = 1;
        } else {
            z13 = i25;
        }
        int[] iArr14 = new int[jArr15.length];
        int[] iArr15 = new int[jArr15.length];
        jArr5.getClass();
        int i64 = i25;
        int i65 = i64;
        int i66 = i65;
        int i67 = i66;
        while (i64 < jArr15.length) {
            long[] jArr17 = jArr15;
            long j31 = jArr5[i64];
            if (j31 != -1) {
                int i68 = i67;
                jArr8 = jArr17;
                int i69 = i65;
                int i70 = i66;
                long L5 = x.L(jArr17[i64], qVar2.f31766c, qVar2.f31767d);
                int i71 = 1;
                iArr14[i64] = x.f(jArr2, j31, true);
                iArr15[i64] = x.b(jArr2, j31 + L5, z13);
                while (true) {
                    i28 = iArr14[i64];
                    i29 = iArr15[i64];
                    if (i28 >= i29 || (iArr2[i28] & i71) != 0) {
                        break;
                    }
                    iArr14[i64] = i28 + 1;
                    i71 = 1;
                }
                int i72 = (i29 - i28) + i70;
                if (i68 != i28) {
                    i30 = 1;
                } else {
                    i30 = 0;
                }
                i67 = i29;
                i66 = i72;
                i65 = i69 | i30;
            } else {
                jArr8 = jArr17;
                i66 = i66;
            }
            i64++;
            jArr15 = jArr8;
        }
        long[] jArr18 = jArr15;
        int i73 = i65;
        if (i66 != i22) {
            i27 = 1;
        } else {
            i27 = 0;
        }
        int i74 = i73 | i27;
        if (i74 != 0) {
            jArr6 = new long[i66];
        } else {
            jArr6 = jArr3;
        }
        if (i74 != 0) {
            iArr4 = new int[i66];
        } else {
            iArr4 = iArr3;
        }
        if (i74 != 0) {
            i23 = 0;
        }
        if (i74 != 0) {
            iArr5 = new int[i66];
        } else {
            iArr5 = iArr2;
        }
        long[] jArr19 = new long[i66];
        int i75 = 0;
        int i76 = 0;
        long j32 = 0;
        while (i75 < jArr18.length) {
            long j33 = jArr5[i75];
            int i77 = iArr14[i75];
            int[] iArr16 = iArr14;
            int i78 = iArr15[i75];
            if (i74 != 0) {
                iArr6 = iArr15;
                int i79 = i78 - i77;
                System.arraycopy(jArr3, i77, jArr6, i76, i79);
                jArr7 = jArr3;
                iArr7 = iArr3;
                System.arraycopy(iArr7, i77, iArr4, i76, i79);
                System.arraycopy(iArr2, i77, iArr5, i76, i79);
            } else {
                jArr7 = jArr3;
                iArr6 = iArr15;
                iArr7 = iArr3;
            }
            int i80 = i23;
            while (i77 < i78) {
                int[] iArr17 = iArr2;
                int i81 = i78;
                long L6 = x.L(j32, 1000000L, qVar2.f31767d);
                int i82 = i75;
                int[] iArr18 = iArr7;
                long L7 = x.L(jArr2[i77] - j33, 1000000L, qVar2.f31766c);
                long[] jArr20 = jArr2;
                if (i26 != 1) {
                    j11 = L6;
                    L7 = Math.max(0L, L7);
                } else {
                    j11 = L6;
                }
                jArr19[i76] = j11 + L7;
                if (i74 != 0 && iArr4[i76] > i80) {
                    i80 = iArr18[i77];
                }
                i76++;
                i77++;
                iArr2 = iArr17;
                i78 = i81;
                i75 = i82;
                iArr7 = iArr18;
                jArr2 = jArr20;
            }
            int i83 = i75;
            int[] iArr19 = iArr7;
            j32 += jArr18[i83];
            i75 = i83 + 1;
            iArr2 = iArr2;
            i23 = i80;
            iArr14 = iArr16;
            iArr15 = iArr6;
            jArr3 = jArr7;
            iArr3 = iArr19;
            jArr2 = jArr2;
        }
        return new t(qVar, jArr6, iArr4, i23, jArr19, iArr5, x.L(j32, 1000000L, qVar2.f31767d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r11 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0e19  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0e80 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(q6.a r73, z5.v r74, long r75, b5.r r77, boolean r78, boolean r79, kp.f r80) {
        /*
            Method dump skipped, instructions count: 3721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.f.f(q6.a, z5.v, long, b5.r, boolean, boolean, kp.f):java.util.ArrayList");
    }
}
