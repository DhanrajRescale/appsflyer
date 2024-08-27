package q6;

import androidx.media3.common.ParserException;
import e5.x;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import z5.b0;
import z5.c0;
import z5.y;
import z5.z;

/* loaded from: classes.dex */
public final class n implements z5.p, y {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f31734w = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f31743i;

    /* renamed from: j, reason: collision with root package name */
    public long f31744j;

    /* renamed from: k, reason: collision with root package name */
    public int f31745k;

    /* renamed from: l, reason: collision with root package name */
    public e5.p f31746l;

    /* renamed from: n, reason: collision with root package name */
    public int f31748n;

    /* renamed from: o, reason: collision with root package name */
    public int f31749o;

    /* renamed from: p, reason: collision with root package name */
    public int f31750p;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f31753s;

    /* renamed from: t, reason: collision with root package name */
    public int f31754t;

    /* renamed from: u, reason: collision with root package name */
    public long f31755u;

    /* renamed from: v, reason: collision with root package name */
    public int f31756v;

    /* renamed from: h, reason: collision with root package name */
    public int f31742h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final p f31740f = new p();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f31741g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final e5.p f31738d = new e5.p(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f31739e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final e5.p f31735a = new e5.p(f5.g.f15954a);

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f31736b = new e5.p(4);

    /* renamed from: c, reason: collision with root package name */
    public final e5.p f31737c = new e5.p();

    /* renamed from: m, reason: collision with root package name */
    public int f31747m = -1;

    /* renamed from: q, reason: collision with root package name */
    public z5.r f31751q = z5.r.f42115d0;

    /* renamed from: r, reason: collision with root package name */
    public m[] f31752r = new m[0];

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    @Override // z5.p
    public final void d(z5.r rVar) {
        this.f31751q = rVar;
    }

    @Override // z5.p
    public final int e(z5.q qVar, mj.b bVar) {
        boolean z10;
        long j10;
        int i10;
        ArrayList arrayList;
        char c10;
        char c11;
        int i11;
        a aVar;
        boolean z11;
        boolean z12;
        while (true) {
            int i12 = this.f31742h;
            ArrayDeque arrayDeque = this.f31739e;
            int i13 = 4;
            boolean z13 = false;
            e5.p pVar = this.f31737c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            ArrayList arrayList2 = this.f31741g;
                            p pVar2 = this.f31740f;
                            int i14 = pVar2.f31762b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    ArrayList arrayList3 = pVar2.f31761a;
                                    short s7 = 2816;
                                    char c12 = 2819;
                                    short s10 = 2192;
                                    if (i14 != 2) {
                                        if (i14 == 3) {
                                            long position = qVar.getPosition();
                                            int f10 = (int) ((qVar.f() - qVar.getPosition()) - pVar2.f31763c);
                                            e5.p pVar3 = new e5.p(f10);
                                            qVar.readFully(pVar3.f15036a, 0, f10);
                                            int i15 = 0;
                                            while (i15 < arrayList3.size()) {
                                                o oVar = (o) arrayList3.get(i15);
                                                ArrayList arrayList4 = arrayList3;
                                                pVar3.F((int) (oVar.f31757a - position));
                                                pVar3.G(i13);
                                                int i16 = pVar3.i();
                                                Charset charset = kp.e.f23433c;
                                                String s11 = pVar3.s(i16, charset);
                                                switch (s11.hashCode()) {
                                                    case -1711564334:
                                                        if (s11.equals("SlowMotion_Data")) {
                                                            c10 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    case -1332107749:
                                                        if (s11.equals("Super_SlowMotion_Edit_Data")) {
                                                            c10 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    case -1251387154:
                                                        if (s11.equals("Super_SlowMotion_Data")) {
                                                            c10 = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case -830665521:
                                                        if (s11.equals("Super_SlowMotion_Deflickering_On")) {
                                                            c10 = 3;
                                                            break;
                                                        }
                                                        break;
                                                    case 1760745220:
                                                        if (s11.equals("Super_SlowMotion_BGM")) {
                                                            c10 = 4;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                c10 = 65535;
                                                switch (c10) {
                                                    case 0:
                                                        c11 = 2192;
                                                        break;
                                                    case 1:
                                                        c11 = c12;
                                                        break;
                                                    case 2:
                                                        c11 = 2816;
                                                        break;
                                                    case 3:
                                                        c11 = 2820;
                                                        break;
                                                    case 4:
                                                        c11 = 2817;
                                                        break;
                                                    default:
                                                        throw ParserException.a("Invalid SEF name", null);
                                                }
                                                int i17 = oVar.f31758b - (i16 + 8);
                                                if (c11 != 2192) {
                                                    if (c11 != 2816 && c11 != 2817 && c11 != c12 && c11 != 2820) {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    List a10 = p.f31760e.a(pVar3.s(i17, charset));
                                                    for (int i18 = 0; i18 < a10.size(); i18++) {
                                                        List a11 = p.f31759d.a((CharSequence) a10.get(i18));
                                                        if (a11.size() == 3) {
                                                            try {
                                                                arrayList5.add(new l6.b(1 << (Integer.parseInt((String) a11.get(2)) - 1), Long.parseLong((String) a11.get(0)), Long.parseLong((String) a11.get(1))));
                                                            } catch (NumberFormatException e10) {
                                                                throw ParserException.a(null, e10);
                                                            }
                                                        } else {
                                                            throw ParserException.a(null, null);
                                                        }
                                                    }
                                                    arrayList2.add(new l6.c(arrayList5));
                                                }
                                                i15++;
                                                arrayList3 = arrayList4;
                                                i13 = 4;
                                                c12 = 2819;
                                            }
                                            bVar.f27810a = 0L;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        ArrayList arrayList6 = arrayList3;
                                        long f11 = qVar.f();
                                        int i19 = pVar2.f31763c - 20;
                                        e5.p pVar4 = new e5.p(i19);
                                        qVar.readFully(pVar4.f15036a, 0, i19);
                                        int i20 = 0;
                                        while (i20 < i19 / 12) {
                                            pVar4.G(2);
                                            short k10 = pVar4.k();
                                            if (k10 != s10 && k10 != s7) {
                                                if (k10 != 2817) {
                                                    if (k10 != 2819 && k10 != 2820) {
                                                        pVar4.G(8);
                                                        arrayList = arrayList6;
                                                        i20++;
                                                        arrayList6 = arrayList;
                                                        s10 = 2192;
                                                        s7 = 2816;
                                                    }
                                                    arrayList = arrayList6;
                                                    arrayList.add(new o(pVar4.i(), (f11 - pVar2.f31763c) - pVar4.i()));
                                                    i20++;
                                                    arrayList6 = arrayList;
                                                    s10 = 2192;
                                                    s7 = 2816;
                                                }
                                            }
                                            arrayList = arrayList6;
                                            arrayList.add(new o(pVar4.i(), (f11 - pVar2.f31763c) - pVar4.i()));
                                            i20++;
                                            arrayList6 = arrayList;
                                            s10 = 2192;
                                            s7 = 2816;
                                        }
                                        ArrayList arrayList7 = arrayList6;
                                        if (arrayList7.isEmpty()) {
                                            bVar.f27810a = 0L;
                                        } else {
                                            pVar2.f31762b = 3;
                                            bVar.f27810a = ((o) arrayList7.get(0)).f31757a;
                                        }
                                    }
                                } else {
                                    e5.p pVar5 = new e5.p(8);
                                    qVar.readFully(pVar5.f15036a, 0, 8);
                                    pVar2.f31763c = pVar5.i() + 8;
                                    if (pVar5.g() != 1397048916) {
                                        bVar.f27810a = 0L;
                                    } else {
                                        bVar.f27810a = qVar.getPosition() - (pVar2.f31763c - 12);
                                        pVar2.f31762b = 2;
                                    }
                                }
                                i10 = 1;
                            } else {
                                long f12 = qVar.f();
                                if (f12 != -1 && f12 >= 8) {
                                    j10 = f12 - 8;
                                } else {
                                    j10 = 0;
                                }
                                bVar.f27810a = j10;
                                i10 = 1;
                                pVar2.f31762b = 1;
                            }
                            if (bVar.f27810a == 0) {
                                this.f31742h = 0;
                                this.f31745k = 0;
                            }
                            return i10;
                        }
                        throw new IllegalStateException();
                    }
                    long position2 = qVar.getPosition();
                    if (this.f31747m == -1) {
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        int i21 = 0;
                        int i22 = -1;
                        int i23 = -1;
                        boolean z14 = true;
                        boolean z15 = true;
                        while (true) {
                            m[] mVarArr = this.f31752r;
                            if (i21 >= mVarArr.length) {
                                break;
                            }
                            m mVar = mVarArr[i21];
                            int i24 = mVar.f31733e;
                            t tVar = mVar.f31730b;
                            if (i24 != tVar.f31798b) {
                                long j14 = tVar.f31799c[i24];
                                long[][] jArr = this.f31753s;
                                int i25 = x.f15050a;
                                long j15 = jArr[i21][i24];
                                long j16 = j14 - position2;
                                if (j16 >= 0 && j16 < 262144) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if ((!z10 && z15) || (z10 == z15 && j16 < j13)) {
                                    i23 = i21;
                                    z15 = z10;
                                    j12 = j15;
                                    j13 = j16;
                                }
                                if (j15 < j11) {
                                    i22 = i21;
                                    z14 = z10;
                                    j11 = j15;
                                }
                            }
                            i21++;
                        }
                        if (j11 == Long.MAX_VALUE || !z14 || j12 < j11 + 10485760) {
                            i22 = i23;
                        }
                        this.f31747m = i22;
                        if (i22 == -1) {
                            return -1;
                        }
                    }
                    m mVar2 = this.f31752r[this.f31747m];
                    b0 b0Var = mVar2.f31731c;
                    int i26 = mVar2.f31733e;
                    t tVar2 = mVar2.f31730b;
                    long j17 = tVar2.f31799c[i26];
                    int i27 = tVar2.f31800d[i26];
                    long j18 = (j17 - position2) + this.f31748n;
                    if (j18 >= 0 && j18 < 262144) {
                        q qVar2 = mVar2.f31729a;
                        if (qVar2.f31770g == 1) {
                            j18 += 8;
                            i27 -= 8;
                        }
                        qVar.j((int) j18);
                        int i28 = qVar2.f31773j;
                        c0 c0Var = mVar2.f31732d;
                        if (i28 != 0) {
                            e5.p pVar6 = this.f31736b;
                            byte[] bArr = pVar6.f15036a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i29 = 4 - i28;
                            while (this.f31749o < i27) {
                                int i30 = this.f31750p;
                                if (i30 == 0) {
                                    qVar.readFully(bArr, i29, i28);
                                    this.f31748n += i28;
                                    pVar6.F(0);
                                    int g10 = pVar6.g();
                                    if (g10 >= 0) {
                                        this.f31750p = g10;
                                        e5.p pVar7 = this.f31735a;
                                        pVar7.F(0);
                                        b0Var.c(4, pVar7);
                                        this.f31749o += 4;
                                        i27 += i29;
                                    } else {
                                        throw ParserException.a("Invalid NAL length", null);
                                    }
                                } else {
                                    int a12 = b0Var.a(qVar, i30, false);
                                    this.f31748n += a12;
                                    this.f31749o += a12;
                                    this.f31750p -= a12;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(qVar2.f31769f.f3652l)) {
                                if (this.f31749o == 0) {
                                    z5.a.b(i27, pVar);
                                    b0Var.c(7, pVar);
                                    this.f31749o += 7;
                                }
                                i27 += 7;
                            } else if (c0Var != null) {
                                c0Var.c(qVar);
                            }
                            while (true) {
                                int i31 = this.f31749o;
                                if (i31 >= i27) {
                                    break;
                                }
                                int a13 = b0Var.a(qVar, i27 - i31, false);
                                this.f31748n += a13;
                                this.f31749o += a13;
                                this.f31750p -= a13;
                            }
                        }
                        int i32 = i27;
                        long j19 = tVar2.f31802f[i26];
                        int i33 = tVar2.f31803g[i26];
                        if (c0Var != null) {
                            c0Var.b(b0Var, j19, i33, i32, 0, null);
                            if (i26 + 1 == tVar2.f31798b) {
                                c0Var.a(b0Var, null);
                            }
                        } else {
                            b0Var.b(j19, i33, i32, 0, null);
                        }
                        mVar2.f31733e++;
                        this.f31747m = -1;
                        this.f31748n = 0;
                        this.f31749o = 0;
                        this.f31750p = 0;
                        return 0;
                    }
                    bVar.f27810a = j17;
                    return 1;
                }
                long j20 = this.f31744j - this.f31745k;
                long position3 = qVar.getPosition() + j20;
                e5.p pVar8 = this.f31746l;
                if (pVar8 != null) {
                    qVar.readFully(pVar8.f15036a, this.f31745k, (int) j20);
                    if (this.f31743i == 1718909296) {
                        pVar8.F(8);
                        int g11 = pVar8.g();
                        if (g11 != 1751476579) {
                            if (g11 != 1903435808) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            pVar8.G(4);
                            while (true) {
                                if (pVar8.a() > 0) {
                                    int g12 = pVar8.g();
                                    if (g12 != 1751476579) {
                                        if (g12 != 1903435808) {
                                            i11 = 0;
                                        } else {
                                            i11 = 1;
                                        }
                                    } else {
                                        i11 = 2;
                                    }
                                    if (i11 != 0) {
                                        break;
                                    }
                                } else {
                                    i11 = 0;
                                    break;
                                }
                            }
                        }
                        this.f31756v = i11;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f31662d.add(new b(this.f31743i, pVar8));
                    }
                } else if (j20 < 262144) {
                    qVar.j((int) j20);
                } else {
                    bVar.f27810a = qVar.getPosition() + j20;
                    z13 = true;
                }
                j(position3);
                if (z13 && this.f31742h != 2) {
                    return 1;
                }
            } else {
                int i34 = this.f31745k;
                e5.p pVar9 = this.f31738d;
                if (i34 == 0) {
                    if (!qVar.a(pVar9.f15036a, 0, 8, true)) {
                        return -1;
                    }
                    this.f31745k = 8;
                    pVar9.F(0);
                    this.f31744j = pVar9.v();
                    this.f31743i = pVar9.g();
                }
                long j21 = this.f31744j;
                if (j21 == 1) {
                    qVar.readFully(pVar9.f15036a, 8, 8);
                    this.f31745k += 8;
                    this.f31744j = pVar9.y();
                } else if (j21 == 0) {
                    long f13 = qVar.f();
                    if (f13 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        f13 = aVar.f31661c;
                    }
                    if (f13 != -1) {
                        this.f31744j = (f13 - qVar.getPosition()) + this.f31745k;
                    }
                }
                long j22 = this.f31744j;
                int i35 = this.f31745k;
                if (j22 >= i35) {
                    int i36 = this.f31743i;
                    if (i36 != 1836019574 && i36 != 1953653099 && i36 != 1835297121 && i36 != 1835626086 && i36 != 1937007212 && i36 != 1701082227 && i36 != 1835365473) {
                        if (i36 != 1835296868 && i36 != 1836476516 && i36 != 1751411826 && i36 != 1937011556 && i36 != 1937011827 && i36 != 1937011571 && i36 != 1668576371 && i36 != 1701606260 && i36 != 1937011555 && i36 != 1937011578 && i36 != 1937013298 && i36 != 1937007471 && i36 != 1668232756 && i36 != 1953196132 && i36 != 1718909296 && i36 != 1969517665 && i36 != 1801812339 && i36 != 1768715124) {
                            qVar.getPosition();
                            this.f31746l = null;
                            this.f31742h = 1;
                        } else {
                            if (i35 == 8) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            yk.j.H0(z11);
                            if (this.f31744j <= 2147483647L) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            yk.j.H0(z12);
                            e5.p pVar10 = new e5.p((int) this.f31744j);
                            System.arraycopy(pVar9.f15036a, 0, pVar10.f15036a, 0, 8);
                            this.f31746l = pVar10;
                            this.f31742h = 1;
                        }
                    } else {
                        long position4 = qVar.getPosition();
                        long j23 = this.f31744j;
                        long j24 = this.f31745k;
                        long j25 = (position4 + j23) - j24;
                        if (j23 != j24 && this.f31743i == 1835365473) {
                            pVar.C(8);
                            qVar.n(pVar.f15036a, 0, 8);
                            byte[] bArr2 = f.f31678a;
                            int i37 = pVar.f15037b;
                            pVar.G(4);
                            if (pVar.g() != 1751411826) {
                                i37 += 4;
                            }
                            pVar.F(i37);
                            qVar.j(pVar.f15037b);
                            qVar.i();
                        }
                        arrayDeque.push(new a(this.f31743i, j25));
                        if (this.f31744j == this.f31745k) {
                            j(j25);
                        } else {
                            this.f31742h = 0;
                            this.f31745k = 0;
                        }
                    }
                } else {
                    throw ParserException.c("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.f31739e.clear();
        this.f31745k = 0;
        this.f31747m = -1;
        this.f31748n = 0;
        this.f31749o = 0;
        this.f31750p = 0;
        if (j10 == 0) {
            if (this.f31742h != 3) {
                this.f31742h = 0;
                this.f31745k = 0;
                return;
            } else {
                p pVar = this.f31740f;
                pVar.f31761a.clear();
                pVar.f31762b = 0;
                this.f31741g.clear();
                return;
            }
        }
        for (m mVar : this.f31752r) {
            t tVar = mVar.f31730b;
            int f10 = x.f(tVar.f31802f, j11, false);
            while (true) {
                if (f10 >= 0) {
                    if ((tVar.f31803g[f10] & 1) != 0) {
                        break;
                    } else {
                        f10--;
                    }
                } else {
                    f10 = -1;
                    break;
                }
            }
            if (f10 == -1) {
                f10 = tVar.a(j11);
            }
            mVar.f31733e = f10;
            c0 c0Var = mVar.f31732d;
            if (c0Var != null) {
                c0Var.f42054b = false;
                c0Var.f42055c = 0;
            }
        }
    }

    @Override // z5.p
    public final boolean g(z5.q qVar) {
        return l.w(qVar, false, false);
    }

    @Override // z5.y
    public final z5.x h(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        boolean z10;
        int[] iArr;
        long j15;
        int a10;
        n nVar = this;
        long j16 = j10;
        m[] mVarArr = nVar.f31752r;
        int length = mVarArr.length;
        z zVar = z.f42140c;
        if (length == 0) {
            return new z5.x(zVar, zVar);
        }
        int i10 = nVar.f31754t;
        boolean z11 = false;
        if (i10 != -1) {
            t tVar = mVarArr[i10].f31730b;
            int f10 = x.f(tVar.f31802f, j16, false);
            while (true) {
                if (f10 >= 0) {
                    if ((tVar.f31803g[f10] & 1) != 0) {
                        break;
                    }
                    f10--;
                } else {
                    f10 = -1;
                    break;
                }
            }
            if (f10 == -1) {
                f10 = tVar.a(j16);
            }
            if (f10 == -1) {
                return new z5.x(zVar, zVar);
            }
            long[] jArr = tVar.f31802f;
            long j17 = jArr[f10];
            long[] jArr2 = tVar.f31799c;
            j11 = jArr2[f10];
            if (j17 < j16 && f10 < tVar.f31798b - 1 && (a10 = tVar.a(j16)) != -1 && a10 != f10) {
                j15 = jArr[a10];
                j13 = jArr2[a10];
            } else {
                j15 = -9223372036854775807L;
                j13 = -1;
            }
            j12 = j15;
            j16 = j17;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
            j13 = -1;
        }
        int i11 = 0;
        long j18 = j11;
        while (true) {
            m[] mVarArr2 = nVar.f31752r;
            if (i11 >= mVarArr2.length) {
                break;
            }
            if (i11 != nVar.f31754t) {
                t tVar2 = mVarArr2[i11].f31730b;
                int f11 = x.f(tVar2.f31802f, j16, z11);
                while (true) {
                    iArr = tVar2.f31803g;
                    if (f11 >= 0) {
                        if ((iArr[f11] & 1) != 0) {
                            break;
                        }
                        f11--;
                    } else {
                        f11 = -1;
                        break;
                    }
                }
                if (f11 == -1) {
                    f11 = tVar2.a(j16);
                }
                long[] jArr3 = tVar2.f31799c;
                if (f11 == -1) {
                    j14 = j16;
                } else {
                    j14 = j16;
                    j18 = Math.min(jArr3[f11], j18);
                }
                if (j12 != -9223372036854775807L) {
                    z10 = false;
                    int f12 = x.f(tVar2.f31802f, j12, false);
                    while (true) {
                        if (f12 >= 0) {
                            if ((iArr[f12] & 1) != 0) {
                                break;
                            }
                            f12--;
                        } else {
                            f12 = -1;
                            break;
                        }
                    }
                    if (f12 == -1) {
                        f12 = tVar2.a(j12);
                    }
                    if (f12 != -1) {
                        j13 = Math.min(jArr3[f12], j13);
                    }
                } else {
                    z10 = false;
                }
            } else {
                j14 = j16;
                z10 = z11;
            }
            i11++;
            nVar = this;
            z11 = z10;
            j16 = j14;
        }
        z zVar2 = new z(j16, j18);
        if (j12 == -9223372036854775807L) {
            return new z5.x(zVar2, zVar2);
        }
        return new z5.x(zVar2, new z(j12, j13));
    }

    @Override // z5.y
    public final long i() {
        return this.f31755u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bb, code lost:
    
        r15 = r6.f15037b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bd, code lost:
    
        if (r15 >= r7) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bf, code lost:
    
        r24 = r6.g();
        r13 = r6.g();
        r6.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d0, code lost:
    
        if (r13 != 1835360622) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d2, code lost:
    
        r9 = r6.q(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01dc, code lost:
    
        if (r13 != 1851878757) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01de, code lost:
    
        r12 = r6.q(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e8, code lost:
    
        if (r13 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ea, code lost:
    
        r8 = r24;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ee, code lost:
    
        r6.G(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f5, code lost:
    
        if (r9 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f7, code lost:
    
        if (r12 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01fa, code lost:
    
        if (r4 != (-1)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01fd, code lost:
    
        r6.F(r4);
        r6.G(16);
        r9 = new k6.l(r9, r12, r6.q(r8 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0213, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0296, code lost:
    
        e5.m.b("MetadataUtil", "Skipped unknown metadata entry: " + h5.a.f(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a9, code lost:
    
        r6.F(r7);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00c5, code lost:
    
        r4 = q6.l.q(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00c9, code lost:
    
        if (r4 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00cd, code lost:
    
        if (r4 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00cf, code lost:
    
        r4 = q6.l.f31725a[r4 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00d7, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00d9, code lost:
    
        r9 = new k6.o("TCON", null, lp.o0.v(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00e4, code lost:
    
        e5.m.f("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00ea, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d6, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02cd, code lost:
    
        r6.F(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0216, code lost:
    
        r4 = 16777215 & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x021d, code lost:
    
        if (r4 != 6516084) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x021f, code lost:
    
        r9 = q6.l.l(r9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0228, code lost:
    
        if (r4 == 7233901) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x022d, code lost:
    
        if (r4 != 7631467) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0234, code lost:
    
        if (r4 == 6516589) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0239, code lost:
    
        if (r4 != 7828084) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0240, code lost:
    
        if (r4 != 6578553) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0242, code lost:
    
        r9 = q6.l.o(r9, r6, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x024d, code lost:
    
        if (r4 != 4280916) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x024f, code lost:
    
        r9 = q6.l.o(r9, r6, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x025a, code lost:
    
        if (r4 != 7630703) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x025c, code lost:
    
        r9 = q6.l.o(r9, r6, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0267, code lost:
    
        if (r4 != 6384738) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0269, code lost:
    
        r9 = q6.l.o(r9, r6, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0274, code lost:
    
        if (r4 != 7108978) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0276, code lost:
    
        r9 = q6.l.o(r9, r6, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0281, code lost:
    
        if (r4 != 6776174) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0283, code lost:
    
        r9 = q6.l.o(r9, r6, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x028c, code lost:
    
        if (r4 != 6779504) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x028e, code lost:
    
        r9 = q6.l.o(r9, r6, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02ae, code lost:
    
        r9 = q6.l.o(r9, r6, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b6, code lost:
    
        r9 = q6.l.o(r9, r6, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02d5, code lost:
    
        if (r3.isEmpty() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02d7, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02de, code lost:
    
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02d9, code lost:
    
        r4 = new b5.q0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r6.F(r8);
        r8 = r8 + r12;
        r6.G(r9);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r7 = r6.f15037b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r7 >= r8) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r7 = r6.g() + r7;
        r9 = r6.g();
        r4 = (r9 >> 24) & 255;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r4 == 169) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        if (r4 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        if (r9 != 1735291493) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r9 != 1684632427) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r9 = q6.l.n(r9, r6, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02be, code lost:
    
        if (r9 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02c0, code lost:
    
        r3.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02c3, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        if (r9 != 1953655662) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r9 = q6.l.n(r9, r6, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        if (r9 != 1953329263) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
    
        r9 = q6.l.p(r9, "TBPM", r6, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
    
        if (r9 != 1668311404) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011f, code lost:
    
        r9 = q6.l.p(r9, "TCMP", r6, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012a, code lost:
    
        if (r9 != 1668249202) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        r9 = q6.l.m(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
    
        if (r9 != 1631670868) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0136, code lost:
    
        r9 = q6.l.o(r9, r6, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0140, code lost:
    
        if (r9 != 1936682605) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
    
        r9 = q6.l.o(r9, r6, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014c, code lost:
    
        if (r9 != 1936679276) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014e, code lost:
    
        r9 = q6.l.o(r9, r6, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0158, code lost:
    
        if (r9 != 1936679282) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
    
        r9 = q6.l.o(r9, r6, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        if (r9 != 1936679265) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0166, code lost:
    
        r9 = q6.l.o(r9, r6, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0171, code lost:
    
        if (r9 != 1936679791) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
    
        r9 = q6.l.o(r9, r6, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017e, code lost:
    
        if (r9 != 1920233063) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0180, code lost:
    
        r9 = q6.l.p(r9, "ITUNESADVISORY", r6, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018c, code lost:
    
        if (r9 != 1885823344) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018e, code lost:
    
        r9 = q6.l.p(r9, "ITUNESGAPLESS", r6, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019b, code lost:
    
        if (r9 != 1936683886) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019d, code lost:
    
        r9 = q6.l.o(r9, r6, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a8, code lost:
    
        if (r9 != 1953919848) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01aa, code lost:
    
        r9 = q6.l.o(r9, r6, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b5, code lost:
    
        if (r9 != 757935405) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b7, code lost:
    
        r9 = null;
        r12 = null;
        r4 = -1;
        r8 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x060e A[EDGE_INSN: B:344:0x060e->B:345:0x060e BREAK  A[LOOP:9: B:270:0x04e1->B:276:0x05fe], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x062e A[LOOP:12: B:346:0x062b->B:348:0x062e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x064a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r28) {
        /*
            Method dump skipped, instructions count: 1721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.n.j(long):void");
    }

    @Override // z5.p
    public final void release() {
    }
}
