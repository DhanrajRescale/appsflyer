package v9;

import bv.a0;
import bv.e0;
import bv.j;
import bv.l;
import bv.m;
import java.io.EOFException;
import java.io.IOException;
import kotlin.text.Charsets;
import tr.e;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: l, reason: collision with root package name */
    public static final m f37806l;

    /* renamed from: m, reason: collision with root package name */
    public static final m f37807m;

    /* renamed from: n, reason: collision with root package name */
    public static final m f37808n;

    /* renamed from: f, reason: collision with root package name */
    public final l f37809f;

    /* renamed from: g, reason: collision with root package name */
    public final j f37810g;

    /* renamed from: h, reason: collision with root package name */
    public int f37811h;

    /* renamed from: i, reason: collision with root package name */
    public long f37812i;

    /* renamed from: j, reason: collision with root package name */
    public int f37813j;

    /* renamed from: k, reason: collision with root package name */
    public String f37814k;

    static {
        m mVar = m.f7367d;
        f37806l = gt.d.e("'\\");
        f37807m = gt.d.e("\"\\");
        f37808n = gt.d.e("{}[]:, \n\t\r\f/\\;#=");
        gt.d.e("\n\r");
        gt.d.e("*/");
    }

    public d(e0 e0Var) {
        this.f37803b = new int[32];
        this.f37804c = new String[32];
        this.f37805d = new int[32];
        this.f37811h = 0;
        this.f37809f = e0Var;
        this.f37810g = e0Var.f7341b;
        z(6);
    }

    @Override // v9.c
    public final int H(e eVar) {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return X(eVar, this.f37814k);
        }
        int M = this.f37809f.M((a0) eVar.f36362c);
        if (M != -1) {
            this.f37811h = 0;
            this.f37804c[this.f37802a - 1] = ((String[]) eVar.f36361b)[M];
            return M;
        }
        String str = this.f37804c[this.f37802a - 1];
        String c02 = c0();
        int X = X(eVar, c02);
        if (X == -1) {
            this.f37811h = 15;
            this.f37814k = c02;
            this.f37804c[this.f37802a - 1] = str;
        }
        return X;
    }

    @Override // v9.c
    public final void I() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 14) {
            long P = this.f37809f.P(f37808n);
            j jVar = this.f37810g;
            if (P == -1) {
                P = jVar.f7365b;
            }
            jVar.skip(P);
        } else if (i10 == 13) {
            h0(f37807m);
        } else if (i10 == 12) {
            h0(f37806l);
        } else if (i10 != 15) {
            throw new RuntimeException("Expected a name but was " + v.e.A(x()) + " at path " + f());
        }
        this.f37811h = 0;
        this.f37804c[this.f37802a - 1] = "null";
    }

    @Override // v9.c
    public final void J() {
        int i10 = 0;
        do {
            int i11 = this.f37811h;
            if (i11 == 0) {
                i11 = U();
            }
            if (i11 == 3) {
                z(1);
            } else if (i11 == 1) {
                z(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 >= 0) {
                        this.f37802a--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + v.e.A(x()) + " at path " + f());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f37802a--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + v.e.A(x()) + " at path " + f());
                    }
                } else {
                    j jVar = this.f37810g;
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 9 && i11 != 13) {
                            if (i11 != 8 && i11 != 12) {
                                if (i11 == 17) {
                                    jVar.skip(this.f37813j);
                                } else if (i11 == 18) {
                                    throw new RuntimeException("Expected a value but was " + v.e.A(x()) + " at path " + f());
                                }
                            } else {
                                h0(f37806l);
                            }
                        } else {
                            h0(f37807m);
                        }
                    } else {
                        long P = this.f37809f.P(f37808n);
                        if (P == -1) {
                            P = jVar.f7365b;
                        }
                        jVar.skip(P);
                    }
                }
                this.f37811h = 0;
            }
            i10++;
            this.f37811h = 0;
        } while (i10 != 0);
        int[] iArr = this.f37805d;
        int i12 = this.f37802a - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f37804c[i12] = "null";
    }

    public final void S() {
        R("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b2, code lost:
    
        r21.f37812i = r10;
        r9.skip(r5);
        r1 = 16;
        r21.f37811h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bf, code lost:
    
        if (r4 == 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c2, code lost:
    
        if (r4 == 4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c5, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c7, code lost:
    
        r21.f37813j = r5;
        r1 = 17;
        r21.f37811h = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        if (b0(r1) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019a, code lost:
    
        if (r4 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019c, code lost:
    
        if (r8 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a4, code lost:
    
        if (r13 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01aa, code lost:
    
        if (r10 != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        if (r13 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ae, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int U() {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.d.U():int");
    }

    public final int X(e eVar, String str) {
        int length = ((String[]) eVar.f36361b).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) eVar.f36361b)[i10])) {
                this.f37811h = 0;
                this.f37804c[this.f37802a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // v9.c
    public final void a() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 3) {
            z(1);
            this.f37805d[this.f37802a - 1] = 0;
            this.f37811h = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_ARRAY but was " + v.e.A(x()) + " at path " + f());
        }
    }

    @Override // v9.c
    public final void b() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 1) {
            z(3);
            this.f37811h = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_OBJECT but was " + v.e.A(x()) + " at path " + f());
        }
    }

    public final boolean b0(int i10) {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 != 35) {
                if (i10 != 44) {
                    if (i10 != 47 && i10 != 61) {
                        if (i10 != 123 && i10 != 125 && i10 != 58) {
                            if (i10 != 59) {
                                switch (i10) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            S();
            throw null;
        }
        return false;
    }

    @Override // v9.c
    public final void c() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 4) {
            int i11 = this.f37802a;
            this.f37802a = i11 - 1;
            int[] iArr = this.f37805d;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f37811h = 0;
            return;
        }
        throw new RuntimeException("Expected END_ARRAY but was " + v.e.A(x()) + " at path " + f());
    }

    public final String c0() {
        String str;
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 14) {
            str = f0();
        } else if (i10 == 13) {
            str = e0(f37807m);
        } else if (i10 == 12) {
            str = e0(f37806l);
        } else if (i10 == 15) {
            str = this.f37814k;
        } else {
            throw new RuntimeException("Expected a name but was " + v.e.A(x()) + " at path " + f());
        }
        this.f37811h = 0;
        this.f37804c[this.f37802a - 1] = str;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37811h = 0;
        this.f37803b[0] = 8;
        this.f37802a = 1;
        this.f37810g.a();
        this.f37809f.close();
    }

    @Override // v9.c
    public final void d() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 2) {
            int i11 = this.f37802a;
            int i12 = i11 - 1;
            this.f37802a = i12;
            this.f37804c[i12] = null;
            int[] iArr = this.f37805d;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f37811h = 0;
            return;
        }
        throw new RuntimeException("Expected END_OBJECT but was " + v.e.A(x()) + " at path " + f());
    }

    public final int d0(boolean z10) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            l lVar = this.f37809f;
            if (lVar.F(i11)) {
                j jVar = this.f37810g;
                byte f10 = jVar.f(i10);
                if (f10 != 10 && f10 != 32 && f10 != 13 && f10 != 9) {
                    jVar.skip(i10);
                    if (f10 == 47) {
                        if (!lVar.F(2L)) {
                            return f10;
                        }
                        S();
                        throw null;
                    }
                    if (f10 != 35) {
                        return f10;
                    }
                    S();
                    throw null;
                }
                i10 = i11;
            } else {
                if (!z10) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public final String e0(m mVar) {
        StringBuilder sb2 = null;
        while (true) {
            long P = this.f37809f.P(mVar);
            if (P != -1) {
                j jVar = this.f37810g;
                if (jVar.f(P) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(jVar.z(P, Charsets.UTF_8));
                    jVar.readByte();
                    sb2.append(g0());
                } else {
                    if (sb2 == null) {
                        String z10 = jVar.z(P, Charsets.UTF_8);
                        jVar.readByte();
                        return z10;
                    }
                    sb2.append(jVar.z(P, Charsets.UTF_8));
                    jVar.readByte();
                    return sb2.toString();
                }
            } else {
                R("Unterminated string");
                throw null;
            }
        }
    }

    public final String f0() {
        long P = this.f37809f.P(f37808n);
        j jVar = this.f37810g;
        if (P != -1) {
            jVar.getClass();
            return jVar.z(P, Charsets.UTF_8);
        }
        return jVar.H();
    }

    @Override // v9.c
    public final boolean g() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 != 2 && i10 != 4 && i10 != 18) {
            return true;
        }
        return false;
    }

    public final char g0() {
        int i10;
        l lVar = this.f37809f;
        if (lVar.F(1L)) {
            j jVar = this.f37810g;
            byte readByte = jVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (lVar.F(4L)) {
                                        char c10 = 0;
                                        for (int i11 = 0; i11 < 4; i11++) {
                                            byte f10 = jVar.f(i11);
                                            char c11 = (char) (c10 << 4);
                                            if (f10 >= 48 && f10 <= 57) {
                                                i10 = f10 - 48;
                                            } else if (f10 >= 97 && f10 <= 102) {
                                                i10 = f10 - 87;
                                            } else {
                                                if (f10 < 65 || f10 > 70) {
                                                    R("\\u".concat(jVar.z(4L, Charsets.UTF_8)));
                                                    throw null;
                                                }
                                                i10 = f10 - 55;
                                            }
                                            c10 = (char) (i10 + c11);
                                        }
                                        jVar.skip(4L);
                                        return c10;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + f());
                                }
                                R("Invalid escape sequence: \\" + ((char) readByte));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        R("Unterminated escape sequence");
        throw null;
    }

    public final void h0(m mVar) {
        while (true) {
            long P = this.f37809f.P(mVar);
            if (P != -1) {
                j jVar = this.f37810g;
                if (jVar.f(P) == 92) {
                    jVar.skip(P + 1);
                    g0();
                } else {
                    jVar.skip(P + 1);
                    return;
                }
            } else {
                R("Unterminated string");
                throw null;
            }
        }
    }

    @Override // v9.c
    public final boolean j() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 5) {
            this.f37811h = 0;
            int[] iArr = this.f37805d;
            int i11 = this.f37802a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f37811h = 0;
            int[] iArr2 = this.f37805d;
            int i12 = this.f37802a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new RuntimeException("Expected a boolean but was " + v.e.A(x()) + " at path " + f());
    }

    @Override // v9.c
    public final double l() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 16) {
            this.f37811h = 0;
            int[] iArr = this.f37805d;
            int i11 = this.f37802a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f37812i;
        }
        if (i10 == 17) {
            long j10 = this.f37813j;
            j jVar = this.f37810g;
            jVar.getClass();
            this.f37814k = jVar.z(j10, Charsets.UTF_8);
        } else if (i10 == 9) {
            this.f37814k = e0(f37807m);
        } else if (i10 == 8) {
            this.f37814k = e0(f37806l);
        } else if (i10 == 10) {
            this.f37814k = f0();
        } else if (i10 != 11) {
            throw new RuntimeException("Expected a double but was " + v.e.A(x()) + " at path " + f());
        }
        this.f37811h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f37814k);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.f37814k = null;
                this.f37811h = 0;
                int[] iArr2 = this.f37805d;
                int i12 = this.f37802a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.f37814k + " at path " + f());
        }
    }

    @Override // v9.c
    public final int n() {
        String e02;
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 16) {
            long j10 = this.f37812i;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f37811h = 0;
                int[] iArr = this.f37805d;
                int i12 = this.f37802a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new RuntimeException("Expected an int but was " + this.f37812i + " at path " + f());
        }
        if (i10 == 17) {
            long j11 = this.f37813j;
            j jVar = this.f37810g;
            jVar.getClass();
            this.f37814k = jVar.z(j11, Charsets.UTF_8);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                throw new RuntimeException("Expected an int but was " + v.e.A(x()) + " at path " + f());
            }
        } else {
            if (i10 == 9) {
                e02 = e0(f37807m);
            } else {
                e02 = e0(f37806l);
            }
            this.f37814k = e02;
            try {
                int parseInt = Integer.parseInt(e02);
                this.f37811h = 0;
                int[] iArr2 = this.f37805d;
                int i13 = this.f37802a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f37811h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f37814k);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f37814k = null;
                this.f37811h = 0;
                int[] iArr3 = this.f37805d;
                int i15 = this.f37802a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new RuntimeException("Expected an int but was " + this.f37814k + " at path " + f());
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.f37814k + " at path " + f());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f37809f + ")";
    }

    @Override // v9.c
    public final String v() {
        String z10;
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        if (i10 == 10) {
            z10 = f0();
        } else if (i10 == 9) {
            z10 = e0(f37807m);
        } else if (i10 == 8) {
            z10 = e0(f37806l);
        } else if (i10 == 11) {
            z10 = this.f37814k;
            this.f37814k = null;
        } else if (i10 == 16) {
            z10 = Long.toString(this.f37812i);
        } else if (i10 == 17) {
            long j10 = this.f37813j;
            j jVar = this.f37810g;
            jVar.getClass();
            z10 = jVar.z(j10, Charsets.UTF_8);
        } else {
            throw new RuntimeException("Expected a string but was " + v.e.A(x()) + " at path " + f());
        }
        this.f37811h = 0;
        int[] iArr = this.f37805d;
        int i11 = this.f37802a - 1;
        iArr[i11] = iArr[i11] + 1;
        return z10;
    }

    @Override // v9.c
    public final int x() {
        int i10 = this.f37811h;
        if (i10 == 0) {
            i10 = U();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }
}
