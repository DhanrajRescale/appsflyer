package t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f35143a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f35144b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f35145c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f35146d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f35147e;

    /* renamed from: f, reason: collision with root package name */
    public t.t f35148f;

    /* renamed from: g, reason: collision with root package name */
    public int f35149g;

    /* renamed from: h, reason: collision with root package name */
    public int f35150h;

    /* renamed from: i, reason: collision with root package name */
    public int f35151i;

    /* renamed from: j, reason: collision with root package name */
    public int f35152j;

    /* renamed from: k, reason: collision with root package name */
    public int f35153k;

    /* renamed from: l, reason: collision with root package name */
    public int f35154l;

    /* renamed from: m, reason: collision with root package name */
    public int f35155m;

    /* renamed from: n, reason: collision with root package name */
    public int f35156n;

    /* renamed from: o, reason: collision with root package name */
    public int f35157o;

    /* renamed from: p, reason: collision with root package name */
    public final t0 f35158p;

    /* renamed from: q, reason: collision with root package name */
    public final t0 f35159q;

    /* renamed from: r, reason: collision with root package name */
    public final t0 f35160r;

    /* renamed from: s, reason: collision with root package name */
    public int f35161s;

    /* renamed from: t, reason: collision with root package name */
    public int f35162t;

    /* renamed from: u, reason: collision with root package name */
    public int f35163u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35164v;

    /* renamed from: w, reason: collision with root package name */
    public s1 f35165w;

    public q2(o2 o2Var) {
        this.f35143a = o2Var;
        int[] iArr = o2Var.f35106a;
        this.f35144b = iArr;
        Object[] objArr = o2Var.f35108c;
        this.f35145c = objArr;
        this.f35146d = o2Var.f35113h;
        this.f35147e = o2Var.f35114i;
        this.f35148f = o2Var.f35115j;
        int i10 = o2Var.f35107b;
        this.f35149g = i10;
        this.f35150h = (iArr.length / 5) - i10;
        int i11 = o2Var.f35109d;
        this.f35153k = i11;
        this.f35154l = objArr.length - i11;
        this.f35155m = i10;
        this.f35158p = new t0();
        this.f35159q = new t0();
        this.f35160r = new t0();
        this.f35162t = i10;
        this.f35163u = -1;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void t(q2 q2Var) {
        int i10 = q2Var.f35163u;
        int o10 = q2Var.o(i10);
        int[] iArr = q2Var.f35144b;
        int i11 = (o10 * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) == 0) {
            iArr[i11] = i12 | 134217728;
            if (!dp.b.B0(iArr, o10)) {
                q2Var.O(q2Var.y(q2Var.f35144b, i10));
            }
        }
    }

    public final boolean A() {
        if (this.f35156n == 0) {
            int i10 = this.f35161s;
            int i11 = this.f35151i;
            int f10 = f(this.f35144b, o(i10));
            int E = E();
            I(this.f35163u);
            s1 s1Var = this.f35165w;
            if (s1Var != null) {
                while (true) {
                    List list = s1Var.f35199a;
                    if (!(!list.isEmpty()) || ((Number) vt.g0.u(list)).intValue() < i10) {
                        break;
                    }
                    s1Var.b();
                }
            }
            boolean B = B(i10, this.f35161s - i10);
            C(f10, this.f35151i - f10, i10 - 1);
            this.f35161s = i10;
            this.f35151i = i11;
            this.f35157o -= E;
            return B;
        }
        t.F("Cannot remove group while inserting");
        throw null;
    }

    public final boolean B(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f35146d;
            v(i10);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f35147e;
                int i12 = i10 + i11;
                int H0 = dp.b.H0(this.f35146d, i12, m() - this.f35150h);
                if (H0 >= this.f35146d.size()) {
                    H0--;
                }
                int i13 = H0 + 1;
                int i14 = 0;
                while (H0 >= 0) {
                    d dVar = (d) this.f35146d.get(H0);
                    int c10 = c(dVar);
                    if (c10 < i10) {
                        break;
                    }
                    if (c10 < i12) {
                        dVar.f34969a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i14 == 0) {
                            i14 = H0 + 1;
                        }
                        i13 = H0;
                    }
                    H0--;
                }
                if (i13 < i14) {
                    z10 = true;
                }
                if (z10) {
                    this.f35146d.subList(i13, i14).clear();
                }
            }
            this.f35149g = i10;
            this.f35150h += i11;
            int i15 = this.f35155m;
            if (i15 > i10) {
                this.f35155m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f35162t;
            if (i16 >= this.f35149g) {
                this.f35162t = i16 - i11;
            }
            int i17 = this.f35163u;
            if (i17 >= 0 && dp.b.B0(this.f35144b, o(i17))) {
                O(i17);
            }
        }
        return z10;
    }

    public final void C(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f35154l;
            int i14 = i10 + i11;
            w(i14, i12);
            this.f35153k = i10;
            this.f35154l = i13 + i11;
            vt.t.k(i10, i14, this.f35145c);
            int i15 = this.f35152j;
            if (i15 >= i10) {
                this.f35152j = i15 - i11;
            }
        }
    }

    public final Object D(int i10, int i11, Object obj) {
        boolean z10;
        int G = G(this.f35144b, o(i10));
        int f10 = f(this.f35144b, o(i10 + 1));
        int i12 = G + i11;
        if (i12 >= G && i12 < f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int g10 = g(i12);
            Object[] objArr = this.f35145c;
            Object obj2 = objArr[g10];
            objArr[g10] = obj;
            return obj2;
        }
        t.F("Write to an invalid slot index " + i11 + " for group " + i10);
        throw null;
    }

    public final int E() {
        int o10 = o(this.f35161s);
        int D0 = dp.b.D0(this.f35144b, o10) + this.f35161s;
        this.f35161s = D0;
        this.f35151i = f(this.f35144b, o(D0));
        if (dp.b.G0(this.f35144b, o10)) {
            return 1;
        }
        return dp.b.J0(this.f35144b, o10);
    }

    public final void F() {
        int i10 = this.f35162t;
        this.f35161s = i10;
        this.f35151i = f(this.f35144b, o(i10));
    }

    public final int G(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f35145c.length - this.f35154l;
        }
        int L0 = dp.b.L0(iArr, i10);
        int i11 = this.f35154l;
        int length = this.f35145c.length;
        if (L0 < 0) {
            return (length - i11) + L0 + 1;
        }
        return L0;
    }

    public final int H(int i10) {
        return f(this.f35144b, o(p(i10) + i10));
    }

    public final s0 I(int i10) {
        d L;
        HashMap hashMap = this.f35147e;
        if (hashMap == null || (L = L(i10)) == null) {
            return null;
        }
        return (s0) hashMap.get(L);
    }

    public final void J() {
        if (this.f35156n == 0) {
            to.e eVar = m.f35080a;
            K(eVar, eVar, false, 0);
        } else {
            t.F("Key must be supplied when inserting");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(Object obj, Object obj2, boolean z10, int i10) {
        byte b10;
        int D0;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f35163u;
        if (this.f35156n > 0) {
            b10 = true;
        } else {
            b10 = false;
        }
        this.f35160r.b(this.f35157o);
        to.e eVar = m.f35080a;
        if (b10 != false) {
            int i17 = this.f35161s;
            int f10 = f(this.f35144b, o(i17));
            r(1);
            this.f35151i = f10;
            this.f35152j = f10;
            int o10 = o(i17);
            if (obj != eVar) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!z10 && obj2 != eVar) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int h10 = h(f10, this.f35153k, this.f35154l, this.f35145c.length);
            if (h10 >= 0 && this.f35155m < i17) {
                h10 = -(((this.f35145c.length - this.f35154l) - h10) + 1);
            }
            int[] iArr = this.f35144b;
            int i18 = this.f35163u;
            if (z10) {
                i13 = 1073741824;
            } else {
                i13 = 0;
            }
            if (i11 != 0) {
                i14 = 536870912;
            } else {
                i14 = 0;
            }
            if (i12 != 0) {
                i15 = 268435456;
            } else {
                i15 = 0;
            }
            int i19 = o10 * 5;
            iArr[i19] = i10;
            iArr[i19 + 1] = i13 | i14 | i15;
            iArr[i19 + 2] = i18;
            iArr[i19 + 3] = 0;
            iArr[i19 + 4] = h10;
            int i20 = (z10 ? 1 : 0) + i11 + i12;
            if (i20 > 0) {
                s(i20, i17);
                Object[] objArr = this.f35145c;
                int i21 = this.f35151i;
                if (z10) {
                    objArr[i21] = obj2;
                    i21++;
                }
                if (i11 != 0) {
                    objArr[i21] = obj;
                    i21++;
                }
                if (i12 != 0) {
                    objArr[i21] = obj2;
                    i21++;
                }
                this.f35151i = i21;
            }
            this.f35157o = 0;
            D0 = i17 + 1;
            this.f35163u = i17;
            this.f35161s = D0;
            if (i16 >= 0) {
                I(i16);
            }
        } else {
            this.f35158p.b(i16);
            this.f35159q.b((m() - this.f35150h) - this.f35162t);
            int i22 = this.f35161s;
            int o11 = o(i22);
            if (!Intrinsics.a(obj2, eVar)) {
                if (z10) {
                    P(this.f35161s, obj2);
                } else {
                    N(obj2);
                }
            }
            this.f35151i = G(this.f35144b, o11);
            this.f35152j = f(this.f35144b, o(this.f35161s + 1));
            this.f35157o = dp.b.J0(this.f35144b, o11);
            this.f35163u = i22;
            this.f35161s = i22 + 1;
            D0 = i22 + dp.b.D0(this.f35144b, o11);
        }
        this.f35162t = D0;
    }

    public final d L(int i10) {
        ArrayList arrayList;
        int H1;
        if (i10 < 0 || i10 >= n() || (H1 = dp.b.H1((arrayList = this.f35146d), i10, n())) < 0) {
            return null;
        }
        return (d) arrayList.get(H1);
    }

    public final void M(Object obj) {
        if (this.f35156n > 0) {
            s(1, this.f35163u);
        }
        Object[] objArr = this.f35145c;
        int i10 = this.f35151i;
        this.f35151i = i10 + 1;
        Object obj2 = objArr[g(i10)];
        int i11 = this.f35151i;
        if (i11 <= this.f35152j) {
            this.f35145c[g(i11 - 1)] = obj;
        } else {
            t.F("Writing to an invalid slot");
            throw null;
        }
    }

    public final void N(Object obj) {
        int o10 = o(this.f35161s);
        if (dp.b.E0(this.f35144b, o10)) {
            Object[] objArr = this.f35145c;
            int[] iArr = this.f35144b;
            objArr[g(dp.b.X0(iArr[(o10 * 5) + 1] >> 29) + f(iArr, o10))] = obj;
            return;
        }
        t.F("Updating the data of a group that was not created with a data slot");
        throw null;
    }

    public final void O(int i10) {
        if (i10 >= 0) {
            s1 s1Var = this.f35165w;
            if (s1Var == null) {
                s1Var = new s1();
                this.f35165w = s1Var;
            }
            s1Var.a(i10);
        }
    }

    public final void P(int i10, Object obj) {
        boolean z10;
        int o10 = o(i10);
        int[] iArr = this.f35144b;
        if (o10 < iArr.length && dp.b.G0(iArr, o10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f35145c[g(f(this.f35144b, o10))] = obj;
            return;
        }
        t.F("Updating the node of a group at " + i10 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f35156n <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 == 0) {
                    return;
                }
                int i11 = this.f35161s + i10;
                if (i11 >= this.f35163u && i11 <= this.f35162t) {
                    z12 = true;
                }
                if (z12) {
                    this.f35161s = i11;
                    int f10 = f(this.f35144b, o(i11));
                    this.f35151i = f10;
                    this.f35152j = f10;
                    return;
                }
                t.F("Cannot seek outside the current group (" + this.f35163u + '-' + this.f35162t + ')');
                throw null;
            }
            al.d.f1("Cannot call seek() while inserting");
            throw null;
        }
        t.F("Cannot seek backwards");
        throw null;
    }

    public final d b(int i10) {
        ArrayList arrayList = this.f35146d;
        int H1 = dp.b.H1(arrayList, i10, n());
        if (H1 < 0) {
            if (i10 > this.f35149g) {
                i10 = -(n() - i10);
            }
            d dVar = new d(i10);
            arrayList.add(-(H1 + 1), dVar);
            return dVar;
        }
        return (d) arrayList.get(H1);
    }

    public final int c(d dVar) {
        int i10 = dVar.f34969a;
        if (i10 < 0) {
            return i10 + n();
        }
        return i10;
    }

    public final void d() {
        int i10 = this.f35156n;
        this.f35156n = i10 + 1;
        if (i10 == 0) {
            this.f35159q.b((m() - this.f35150h) - this.f35162t);
        }
    }

    public final void e(boolean z10) {
        this.f35164v = true;
        if (z10 && this.f35158p.f35210b == 0) {
            v(n());
            w(this.f35145c.length - this.f35154l, this.f35149g);
            int i10 = this.f35153k;
            vt.t.k(i10, this.f35154l + i10, this.f35145c);
            z();
        }
        int[] iArr = this.f35144b;
        int i11 = this.f35149g;
        Object[] objArr = this.f35145c;
        int i12 = this.f35153k;
        ArrayList arrayList = this.f35146d;
        HashMap hashMap = this.f35147e;
        t.t tVar = this.f35148f;
        o2 o2Var = this.f35143a;
        o2Var.getClass();
        if (o2Var.f35111f) {
            o2Var.f35111f = false;
            o2Var.f35106a = iArr;
            o2Var.f35107b = i11;
            o2Var.f35108c = objArr;
            o2Var.f35109d = i12;
            o2Var.f35113h = arrayList;
            o2Var.f35114i = hashMap;
            o2Var.f35115j = tVar;
            return;
        }
        al.d.e1("Unexpected writer close()");
        throw null;
    }

    public final int f(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f35145c.length - this.f35154l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        int i12 = this.f35154l;
        int length = this.f35145c.length;
        if (i11 < 0) {
            return (length - i12) + i11 + 1;
        }
        return i11;
    }

    public final int g(int i10) {
        return i10 < this.f35153k ? i10 : i10 + this.f35154l;
    }

    public final void i() {
        boolean z10;
        int i10;
        int o10;
        int i11 = 0;
        if (this.f35156n > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = this.f35161s;
        int i13 = this.f35162t;
        int i14 = this.f35163u;
        int o11 = o(i14);
        int i15 = this.f35157o;
        int i16 = i12 - i14;
        boolean G0 = dp.b.G0(this.f35144b, o11);
        t0 t0Var = this.f35160r;
        if (z10) {
            dp.b.N0(o11, i16, this.f35144b);
            dp.b.O0(o11, i15, this.f35144b);
            int a10 = t0Var.a();
            if (G0) {
                i15 = 1;
            }
            this.f35157o = a10 + i15;
            int y10 = y(this.f35144b, i14);
            this.f35163u = y10;
            if (y10 < 0) {
                o10 = n();
            } else {
                o10 = o(y10 + 1);
            }
            if (o10 >= 0) {
                i11 = f(this.f35144b, o10);
            }
            this.f35151i = i11;
            this.f35152j = i11;
            return;
        }
        if (i12 == i13) {
            int D0 = dp.b.D0(this.f35144b, o11);
            int J0 = dp.b.J0(this.f35144b, o11);
            dp.b.N0(o11, i16, this.f35144b);
            dp.b.O0(o11, i15, this.f35144b);
            int a11 = this.f35158p.a();
            this.f35162t = (m() - this.f35150h) - this.f35159q.a();
            this.f35163u = a11;
            int y11 = y(this.f35144b, i14);
            int a12 = t0Var.a();
            this.f35157o = a12;
            if (y11 == a11) {
                if (!G0) {
                    i11 = i15 - J0;
                }
                this.f35157o = a12 + i11;
                return;
            }
            int i17 = i16 - D0;
            if (G0) {
                i10 = 0;
            } else {
                i10 = i15 - J0;
            }
            if (i17 != 0 || i10 != 0) {
                while (y11 != 0 && y11 != a11 && (i10 != 0 || i17 != 0)) {
                    int o12 = o(y11);
                    if (i17 != 0) {
                        dp.b.N0(o12, dp.b.D0(this.f35144b, o12) + i17, this.f35144b);
                    }
                    if (i10 != 0) {
                        int[] iArr = this.f35144b;
                        dp.b.O0(o12, dp.b.J0(iArr, o12) + i10, iArr);
                    }
                    if (dp.b.G0(this.f35144b, o12)) {
                        i10 = 0;
                    }
                    y11 = y(this.f35144b, y11);
                }
            }
            this.f35157o += i10;
            return;
        }
        t.F("Expected to be at the end of a group");
        throw null;
    }

    public final void j() {
        boolean z10;
        int i10 = this.f35156n;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = i10 - 1;
            this.f35156n = i11;
            if (i11 == 0) {
                if (this.f35160r.f35210b == this.f35158p.f35210b) {
                    this.f35162t = (m() - this.f35150h) - this.f35159q.a();
                    return;
                } else {
                    t.F("startGroup/endGroup mismatch while inserting");
                    throw null;
                }
            }
            return;
        }
        al.d.f1("Unbalanced begin/end insert");
        throw null;
    }

    public final void k(int i10) {
        boolean z10;
        boolean z11 = false;
        if (this.f35156n <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = this.f35163u;
            if (i11 != i10) {
                if (i10 >= i11 && i10 < this.f35162t) {
                    z11 = true;
                }
                if (z11) {
                    int i12 = this.f35161s;
                    int i13 = this.f35151i;
                    int i14 = this.f35152j;
                    this.f35161s = i10;
                    J();
                    this.f35161s = i12;
                    this.f35151i = i13;
                    this.f35152j = i14;
                    return;
                }
                t.F("Started group at " + i10 + " must be a subgroup of the group at " + i11);
                throw null;
            }
            return;
        }
        t.F("Cannot call ensureStarted() while inserting");
        throw null;
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= this.f35149g) {
            i10 = -((n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f35144b[(o(i12) * 5) + 2] = i10;
            int D0 = dp.b.D0(this.f35144b, o(i12)) + i12;
            l(i12, D0, i12 + 1);
            i12 = D0;
        }
    }

    public final int m() {
        return this.f35144b.length / 5;
    }

    public final int n() {
        return m() - this.f35150h;
    }

    public final int o(int i10) {
        return i10 < this.f35149g ? i10 : i10 + this.f35150h;
    }

    public final int p(int i10) {
        return dp.b.D0(this.f35144b, o(i10));
    }

    public final boolean q(int i10, int i11) {
        int i12;
        int m10;
        int p10;
        if (i11 == this.f35163u) {
            m10 = this.f35162t;
        } else {
            t0 t0Var = this.f35158p;
            int i13 = t0Var.f35210b;
            if (i13 > 0) {
                i12 = t0Var.f35209a[i13 - 1];
            } else {
                i12 = 0;
            }
            if (i11 > i12) {
                p10 = p(i11);
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 < i13) {
                        if (t0Var.f35209a[i14] == i11) {
                            break;
                        }
                        i14++;
                    } else {
                        i14 = -1;
                        break;
                    }
                }
                if (i14 < 0) {
                    p10 = p(i11);
                } else {
                    m10 = (m() - this.f35150h) - this.f35159q.f35209a[i14];
                }
            }
            m10 = p10 + i11;
        }
        if (i10 <= i11 || i10 >= m10) {
            return false;
        }
        return true;
    }

    public final void r(int i10) {
        int i11;
        if (i10 > 0) {
            int i12 = this.f35161s;
            v(i12);
            int i13 = this.f35149g;
            int i14 = this.f35150h;
            int[] iArr = this.f35144b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            int i16 = 0;
            if (i14 < i10) {
                int max = Math.max(Math.max(length * 2, i15 + i10), 32);
                int[] iArr2 = new int[max * 5];
                int i17 = max - i15;
                vt.t.c(0, 0, i13 * 5, iArr, iArr2);
                vt.t.c((i13 + i17) * 5, (i14 + i13) * 5, length * 5, iArr, iArr2);
                this.f35144b = iArr2;
                i14 = i17;
            }
            int i18 = this.f35162t;
            if (i18 >= i13) {
                this.f35162t = i18 + i10;
            }
            int i19 = i13 + i10;
            this.f35149g = i19;
            this.f35150h = i14 - i10;
            if (i15 > 0) {
                i11 = f(this.f35144b, o(i12 + i10));
            } else {
                i11 = 0;
            }
            if (this.f35155m >= i13) {
                i16 = this.f35153k;
            }
            int h10 = h(i11, i16, this.f35154l, this.f35145c.length);
            for (int i20 = i13; i20 < i19; i20++) {
                this.f35144b[(i20 * 5) + 4] = h10;
            }
            int i21 = this.f35155m;
            if (i21 >= i13) {
                this.f35155m = i21 + i10;
            }
        }
    }

    public final void s(int i10, int i11) {
        if (i10 > 0) {
            w(this.f35151i, i11);
            int i12 = this.f35153k;
            int i13 = this.f35154l;
            if (i13 < i10) {
                Object[] objArr = this.f35145c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                vt.t.f(objArr, 0, objArr2, 0, i12);
                vt.t.f(objArr, i12 + i16, objArr2, i13 + i12, length);
                this.f35145c = objArr2;
                i13 = i16;
            }
            int i17 = this.f35152j;
            if (i17 >= i12) {
                this.f35152j = i17 + i10;
            }
            this.f35153k = i12 + i10;
            this.f35154l = i13 - i10;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f35161s + " end=" + this.f35162t + " size = " + n() + " gap=" + this.f35149g + '-' + (this.f35149g + this.f35150h) + ')';
    }

    public final void u(o2 o2Var, int i10) {
        boolean z10;
        if (this.f35156n > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t.u0(z10);
        if (i10 == 0 && this.f35161s == 0 && this.f35143a.f35107b == 0) {
            int D0 = dp.b.D0(o2Var.f35106a, i10);
            int i11 = o2Var.f35107b;
            if (D0 == i11) {
                int[] iArr = this.f35144b;
                Object[] objArr = this.f35145c;
                ArrayList arrayList = this.f35146d;
                HashMap hashMap = this.f35147e;
                t.t tVar = this.f35148f;
                int[] iArr2 = o2Var.f35106a;
                Object[] objArr2 = o2Var.f35108c;
                int i12 = o2Var.f35109d;
                HashMap hashMap2 = o2Var.f35114i;
                t.t tVar2 = o2Var.f35115j;
                this.f35144b = iArr2;
                this.f35145c = objArr2;
                this.f35146d = o2Var.f35113h;
                this.f35149g = i11;
                this.f35150h = (iArr2.length / 5) - i11;
                this.f35153k = i12;
                this.f35154l = objArr2.length - i12;
                this.f35155m = i11;
                this.f35147e = hashMap2;
                this.f35148f = tVar2;
                o2Var.f35106a = iArr;
                o2Var.f35107b = 0;
                o2Var.f35108c = objArr;
                o2Var.f35109d = 0;
                o2Var.f35113h = arrayList;
                o2Var.f35114i = hashMap;
                o2Var.f35115j = tVar;
                return;
            }
        }
        q2 h10 = o2Var.h();
        try {
            to.e.i(h10, i10, this, true, true, false);
            h10.e(true);
        } catch (Throwable th2) {
            h10.e(false);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r2 = r8.f35144b;
        r4 = r9 * 5;
        r5 = r0 * 5;
        r6 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        vt.t.c(r5 + r4, r4, r6, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        vt.t.c(r6, r6 + r5, r4 + r5, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(int r9) {
        /*
            r8 = this;
            int r0 = r8.f35150h
            int r1 = r8.f35149g
            if (r1 == r9) goto Lb0
            java.util.ArrayList r2 = r8.f35146d
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L5d
            int r2 = r8.f35150h
            int r4 = r8.m()
            int r4 = r4 - r2
            if (r1 >= r9) goto L3b
            java.util.ArrayList r2 = r8.f35146d
            int r2 = dp.b.H0(r2, r1, r4)
        L1f:
            java.util.ArrayList r5 = r8.f35146d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.f35146d
            java.lang.Object r5 = r5.get(r2)
            t0.d r5 = (t0.d) r5
            int r6 = r5.f34969a
            if (r6 >= 0) goto L5d
            int r6 = r6 + r4
            if (r6 >= r9) goto L5d
            r5.f34969a = r6
            int r2 = r2 + 1
            goto L1f
        L3b:
            java.util.ArrayList r2 = r8.f35146d
            int r2 = dp.b.H0(r2, r9, r4)
        L41:
            java.util.ArrayList r5 = r8.f35146d
            int r5 = r5.size()
            if (r2 >= r5) goto L5d
            java.util.ArrayList r5 = r8.f35146d
            java.lang.Object r5 = r5.get(r2)
            t0.d r5 = (t0.d) r5
            int r6 = r5.f34969a
            if (r6 < 0) goto L5d
            int r6 = r4 - r6
            int r6 = -r6
            r5.f34969a = r6
            int r2 = r2 + 1
            goto L41
        L5d:
            if (r0 <= 0) goto L74
            int[] r2 = r8.f35144b
            int r4 = r9 * 5
            int r5 = r0 * 5
            int r6 = r1 * 5
            if (r9 >= r1) goto L6e
            int r5 = r5 + r4
            vt.t.c(r5, r4, r6, r2, r2)
            goto L74
        L6e:
            int r7 = r6 + r5
            int r4 = r4 + r5
            vt.t.c(r6, r7, r4, r2, r2)
        L74:
            if (r9 >= r1) goto L78
            int r1 = r9 + r0
        L78:
            int r2 = r8.m()
            if (r1 >= r2) goto L7f
            goto L80
        L7f:
            r3 = 0
        L80:
            t0.t.u0(r3)
        L83:
            if (r1 >= r2) goto Lb0
            int[] r3 = r8.f35144b
            int r3 = dp.b.K0(r3, r1)
            r4 = -2
            if (r3 <= r4) goto L90
            r5 = r3
            goto L96
        L90:
            int r5 = r8.n()
            int r5 = r5 + r3
            int r5 = r5 - r4
        L96:
            if (r5 >= r9) goto L99
            goto La0
        L99:
            int r6 = r8.n()
            int r6 = r6 - r5
            int r6 = r6 - r4
            int r5 = -r6
        La0:
            if (r5 == r3) goto Laa
            int[] r3 = r8.f35144b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3[r4] = r5
        Laa:
            int r1 = r1 + 1
            if (r1 != r9) goto L83
            int r1 = r1 + r0
            goto L83
        Lb0:
            r8.f35149g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.q2.v(int):void");
    }

    public final void w(int i10, int i11) {
        int i12 = this.f35154l;
        int i13 = this.f35153k;
        int i14 = this.f35155m;
        if (i13 != i10) {
            Object[] objArr = this.f35145c;
            if (i10 < i13) {
                vt.t.f(objArr, i10 + i12, objArr, i10, i13);
            } else {
                vt.t.f(objArr, i13, objArr, i13 + i12, i10 + i12);
            }
        }
        int min = Math.min(i11 + 1, n());
        if (i14 != min) {
            int length = this.f35145c.length - i12;
            if (min < i14) {
                int o10 = o(min);
                int o11 = o(i14);
                int i15 = this.f35149g;
                while (o10 < o11) {
                    int C0 = dp.b.C0(this.f35144b, o10);
                    if (C0 >= 0) {
                        this.f35144b[(o10 * 5) + 4] = -((length - C0) + 1);
                        o10++;
                        if (o10 == i15) {
                            o10 += this.f35150h;
                        }
                    } else {
                        t.F("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                }
            } else {
                int o12 = o(i14);
                int o13 = o(min);
                while (o12 < o13) {
                    int C02 = dp.b.C0(this.f35144b, o12);
                    if (C02 < 0) {
                        this.f35144b[(o12 * 5) + 4] = C02 + length + 1;
                        o12++;
                        if (o12 == this.f35149g) {
                            o12 += this.f35150h;
                        }
                    } else {
                        t.F("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                }
            }
            this.f35155m = min;
        }
        this.f35153k = i10;
    }

    public final Object x(int i10) {
        int o10 = o(i10);
        if (dp.b.G0(this.f35144b, o10)) {
            return this.f35145c[g(f(this.f35144b, o10))];
        }
        return null;
    }

    public final int y(int[] iArr, int i10) {
        int i11 = iArr[(o(i10) * 5) + 2];
        if (i11 <= -2) {
            return n() + i11 + 2;
        }
        return i11;
    }

    public final void z() {
        boolean z10;
        s1 s1Var = this.f35165w;
        if (s1Var != null) {
            while (!s1Var.f35199a.isEmpty()) {
                int b10 = s1Var.b();
                int o10 = o(b10);
                int i10 = b10 + 1;
                int p10 = p(b10) + b10;
                while (true) {
                    if (i10 < p10) {
                        if ((this.f35144b[(o(i10) * 5) + 1] & 201326592) != 0) {
                            z10 = true;
                            break;
                        }
                        i10 += p(i10);
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (dp.b.B0(this.f35144b, o10) != z10) {
                    int[] iArr = this.f35144b;
                    int i11 = (o10 * 5) + 1;
                    if (z10) {
                        iArr[i11] = iArr[i11] | 67108864;
                    } else {
                        iArr[i11] = iArr[i11] & (-67108865);
                    }
                    int y10 = y(iArr, b10);
                    if (y10 >= 0) {
                        s1Var.a(y10);
                    }
                }
            }
        }
    }
}
