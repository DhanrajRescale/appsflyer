package k6;

import b5.q0;
import e5.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import lp.j1;
import lp.l0;
import lp.o0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j extends al.d {

    /* renamed from: c, reason: collision with root package name */
    public static final j5.d f22248c = new j5.d(6);

    /* renamed from: b, reason: collision with root package name */
    public final h f22249b;

    public j(j5.d dVar) {
        this.f22249b = dVar;
    }

    public static a k1(int i10, int i11, e5.p pVar) {
        int x12;
        String str;
        byte[] copyOfRange;
        int u10 = pVar.u();
        Charset u12 = u1(u10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        pVar.e(bArr, 0, i12);
        if (i11 == 2) {
            String str2 = "image/" + dp.b.P1(new String(bArr, 0, 3, kp.e.f23432b));
            if ("image/jpg".equals(str2)) {
                str2 = "image/jpeg";
            }
            str = str2;
            x12 = 2;
        } else {
            x12 = x1(0, bArr);
            String P1 = dp.b.P1(new String(bArr, 0, x12, kp.e.f23432b));
            if (P1.indexOf(47) == -1) {
                str = "image/".concat(P1);
            } else {
                str = P1;
            }
        }
        int i13 = bArr[x12 + 1] & 255;
        int i14 = x12 + 2;
        int w12 = w1(bArr, i14, u10);
        String str3 = new String(bArr, i14, w12 - i14, u12);
        int t12 = t1(u10) + w12;
        if (i12 <= t12) {
            copyOfRange = x.f15055f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, t12, i12);
        }
        return new a(str, str3, i13, copyOfRange);
    }

    public static c l1(e5.p pVar, int i10, int i11, boolean z10, int i12, h hVar) {
        long j10;
        long j11;
        int i13 = pVar.f15037b;
        int x12 = x1(i13, pVar.f15036a);
        String str = new String(pVar.f15036a, i13, x12 - i13, kp.e.f23432b);
        pVar.F(x12 + 1);
        int g10 = pVar.g();
        int g11 = pVar.g();
        long v10 = pVar.v();
        if (v10 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = v10;
        }
        long v11 = pVar.v();
        if (v11 == 4294967295L) {
            j11 = -1;
        } else {
            j11 = v11;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (pVar.f15037b < i14) {
            k o12 = o1(i11, pVar, z10, i12, hVar);
            if (o12 != null) {
                arrayList.add(o12);
            }
        }
        return new c(str, g10, g11, j10, j11, (k[]) arrayList.toArray(new k[0]));
    }

    public static e m1(e5.p pVar, int i10, int i11, boolean z10, int i12, h hVar) {
        boolean z11;
        boolean z12;
        int i13 = pVar.f15037b;
        int x12 = x1(i13, pVar.f15036a);
        String str = new String(pVar.f15036a, i13, x12 - i13, kp.e.f23432b);
        pVar.F(x12 + 1);
        int u10 = pVar.u();
        if ((u10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((u10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int u11 = pVar.u();
        String[] strArr = new String[u11];
        for (int i14 = 0; i14 < u11; i14++) {
            int i15 = pVar.f15037b;
            int x13 = x1(i15, pVar.f15036a);
            strArr[i14] = new String(pVar.f15036a, i15, x13 - i15, kp.e.f23432b);
            pVar.F(x13 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (pVar.f15037b < i16) {
            k o12 = o1(i11, pVar, z10, i12, hVar);
            if (o12 != null) {
                arrayList.add(o12);
            }
        }
        return new e(str, z11, z12, strArr, (k[]) arrayList.toArray(new k[0]));
    }

    public static f n1(int i10, e5.p pVar) {
        if (i10 < 4) {
            return null;
        }
        int u10 = pVar.u();
        Charset u12 = u1(u10);
        byte[] bArr = new byte[3];
        pVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        pVar.e(bArr2, 0, i11);
        int w12 = w1(bArr2, 0, u10);
        String str2 = new String(bArr2, 0, w12, u12);
        int t12 = t1(u10) + w12;
        return new f(str, str2, r1(bArr2, t12, w1(bArr2, t12, u10), u12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0245, code lost:
    
        if (r12 == 67) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r20 == 2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (r20 == 2) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0086. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c3 A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #0 {all -> 0x0184, blocks: (B:75:0x02c3, B:79:0x0135, B:83:0x0165, B:86:0x016c, B:95:0x0196, B:97:0x01c8, B:105:0x01f6, B:107:0x020a, B:108:0x0211, B:109:0x020d, B:118:0x0227, B:126:0x0247, B:134:0x025d, B:141:0x026e, B:148:0x028f, B:156:0x02ad, B:157:0x02b2), top: B:65:0x0123 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k6.k o1(int r20, e5.p r21, boolean r22, int r23, k6.h r24) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.j.o1(int, e5.p, boolean, int, k6.h):k6.k");
    }

    public static g p1(int i10, e5.p pVar) {
        byte[] copyOfRange;
        int u10 = pVar.u();
        Charset u12 = u1(u10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        pVar.e(bArr, 0, i11);
        int x12 = x1(0, bArr);
        String str = new String(bArr, 0, x12, kp.e.f23432b);
        int i12 = x12 + 1;
        int w12 = w1(bArr, i12, u10);
        String r12 = r1(bArr, i12, w12, u12);
        int t12 = t1(u10) + w12;
        int w13 = w1(bArr, t12, u10);
        String r13 = r1(bArr, t12, w13, u12);
        int t13 = t1(u10) + w13;
        if (i11 <= t13) {
            copyOfRange = x.f15055f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, t13, i11);
        }
        return new g(str, copyOfRange, r12, r13);
    }

    public static m q1(int i10, e5.p pVar) {
        int z10 = pVar.z();
        int w10 = pVar.w();
        int w11 = pVar.w();
        int u10 = pVar.u();
        int u11 = pVar.u();
        b5.m mVar = new b5.m();
        mVar.o(pVar);
        int i11 = ((i10 - 10) * 8) / (u10 + u11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = mVar.i(u10);
            int i14 = mVar.i(u11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new m(z10, w10, w11, iArr, iArr2);
    }

    public static String r1(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static j1 s1(byte[] bArr, int i10, int i11) {
        Object[] objArr;
        if (i11 >= bArr.length) {
            return o0.v(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        l0 l0Var = o0.f25025b;
        kp.j.A(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int w12 = w1(bArr, i11, i10);
        int i12 = 0;
        boolean z10 = false;
        while (i11 < w12) {
            String str = new String(bArr, i11, w12 - i11, u1(i10));
            int i13 = i12 + 1;
            if (objArr2.length < i13) {
                objArr = Arrays.copyOf(objArr2, bl.j.z(objArr2.length, i13));
            } else if (z10) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i12] = str;
                int t12 = w12 + t1(i10);
                i12++;
                i11 = t12;
                w12 = w1(bArr, t12, i10);
            }
            objArr2 = objArr;
            z10 = false;
            objArr2[i12] = str;
            int t122 = w12 + t1(i10);
            i12++;
            i11 = t122;
            w12 = w1(bArr, t122, i10);
        }
        j1 o10 = o0.o(i12, objArr2);
        if (o10.isEmpty()) {
            return o0.v(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return o10;
    }

    public static int t1(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset u1(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kp.e.f23432b;
                }
                return kp.e.f23433c;
            }
            return kp.e.f23434d;
        }
        return kp.e.f23436f;
    }

    public static String v1(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int w1(byte[] bArr, int i10, int i11) {
        int x12 = x1(i10, bArr);
        if (i11 != 0 && i11 != 3) {
            while (x12 < bArr.length - 1) {
                if ((x12 - i10) % 2 == 0 && bArr[x12 + 1] == 0) {
                    return x12;
                }
                x12 = x1(x12 + 1, bArr);
            }
            return bArr.length;
        }
        return x12;
    }

    public static int x1(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int y1(int i10, e5.p pVar) {
        byte[] bArr = pVar.f15036a;
        int i11 = pVar.f15037b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean z1(e5.p r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f15037b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.v()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.z()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.F(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.F(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.F(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.F(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.F(r2)
            return r4
        Lb0:
            r1.F(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.j.z1(e5.p, int, int, boolean):boolean");
    }

    @Override // al.d
    public final q0 d0(f6.a aVar, ByteBuffer byteBuffer) {
        return j1(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b5.q0 j1(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.j.j1(int, byte[]):b5.q0");
    }
}
