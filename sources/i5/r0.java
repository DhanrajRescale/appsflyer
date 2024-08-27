package i5;

import android.util.Pair;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final b5.g1 f19627a = new b5.g1();

    /* renamed from: b, reason: collision with root package name */
    public final b5.h1 f19628b = new b5.h1();

    /* renamed from: c, reason: collision with root package name */
    public final j5.a f19629c;

    /* renamed from: d, reason: collision with root package name */
    public final e5.h f19630d;

    /* renamed from: e, reason: collision with root package name */
    public long f19631e;

    /* renamed from: f, reason: collision with root package name */
    public int f19632f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19633g;

    /* renamed from: h, reason: collision with root package name */
    public p0 f19634h;

    /* renamed from: i, reason: collision with root package name */
    public p0 f19635i;

    /* renamed from: j, reason: collision with root package name */
    public p0 f19636j;

    /* renamed from: k, reason: collision with root package name */
    public int f19637k;

    /* renamed from: l, reason: collision with root package name */
    public Object f19638l;

    /* renamed from: m, reason: collision with root package name */
    public long f19639m;

    public r0(j5.a aVar, e5.t tVar) {
        this.f19629c = aVar;
        this.f19630d = tVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b5.o0, r5.w] */
    public static r5.w m(b5.i1 i1Var, Object obj, long j10, long j11, b5.h1 h1Var, b5.g1 g1Var) {
        int i10;
        i1Var.h(obj, g1Var);
        i1Var.o(g1Var.f3318c, h1Var);
        int b10 = i1Var.b(obj);
        Object obj2 = obj;
        while (true) {
            int i11 = g1Var.f3322g.f3211b;
            if (i11 == 0) {
                break;
            }
            if ((i11 == 1 && g1Var.h(0)) || !g1Var.i(g1Var.f3322g.f3214e)) {
                break;
            }
            long j12 = 0;
            if (g1Var.c(0L) != -1) {
                break;
            }
            if (g1Var.f3319d != 0) {
                if (g1Var.h(i11 - 1)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                int i12 = i11 - i10;
                for (int i13 = 0; i13 <= i12; i13++) {
                    j12 += g1Var.f3322g.a(i13).f3200g;
                }
                if (g1Var.f3319d > j12) {
                    break;
                }
            }
            if (b10 > h1Var.f3347p) {
                break;
            }
            i1Var.g(b10, g1Var, true);
            obj2 = g1Var.f3317b;
            obj2.getClass();
            b10++;
        }
        i1Var.h(obj2, g1Var);
        int c10 = g1Var.c(j10);
        if (c10 == -1) {
            return new r5.w(obj2, g1Var.b(j10), j11);
        }
        return new b5.o0(c10, g1Var.f(c10), -1, j11, obj2);
    }

    public final p0 a() {
        p0 p0Var = this.f19634h;
        if (p0Var == null) {
            return null;
        }
        if (p0Var == this.f19635i) {
            this.f19635i = p0Var.f19593l;
        }
        p0Var.f();
        int i10 = this.f19637k - 1;
        this.f19637k = i10;
        if (i10 == 0) {
            this.f19636j = null;
            p0 p0Var2 = this.f19634h;
            this.f19638l = p0Var2.f19583b;
            this.f19639m = p0Var2.f19587f.f19618a.f3559d;
        }
        this.f19634h = this.f19634h.f19593l;
        k();
        return this.f19634h;
    }

    public final void b() {
        if (this.f19637k == 0) {
            return;
        }
        p0 p0Var = this.f19634h;
        yk.j.I0(p0Var);
        this.f19638l = p0Var.f19583b;
        this.f19639m = p0Var.f19587f.f19618a.f3559d;
        while (p0Var != null) {
            p0Var.f();
            p0Var = p0Var.f19593l;
        }
        this.f19634h = null;
        this.f19636j = null;
        this.f19635i = null;
        this.f19637k = 0;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        if (r0 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i5.q0 c(b5.i1 r26, i5.p0 r27, long r28) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.r0.c(b5.i1, i5.p0, long):i5.q0");
    }

    public final q0 d(b5.i1 i1Var, p0 p0Var, long j10) {
        boolean z10;
        long j11;
        long j12;
        q0 q0Var = p0Var.f19587f;
        long j13 = (p0Var.f19596o + q0Var.f19622e) - j10;
        if (q0Var.f19624g) {
            return c(i1Var, p0Var, j13);
        }
        r5.w wVar = q0Var.f19618a;
        Object obj = wVar.f3556a;
        b5.g1 g1Var = this.f19627a;
        i1Var.h(obj, g1Var);
        boolean a10 = wVar.a();
        Object obj2 = wVar.f3556a;
        if (a10) {
            int i10 = wVar.f3557b;
            int i11 = g1Var.f3322g.a(i10).f3195b;
            if (i11 != -1) {
                int a11 = g1Var.f3322g.a(i10).a(wVar.f3558c);
                if (a11 < i11) {
                    return f(i1Var, wVar.f3556a, i10, a11, q0Var.f19620c, wVar.f3559d);
                }
                long j14 = q0Var.f19620c;
                if (j14 == -9223372036854775807L) {
                    Pair k10 = i1Var.k(this.f19628b, g1Var, g1Var.f3318c, -9223372036854775807L, Math.max(0L, j13));
                    if (k10 != null) {
                        j14 = ((Long) k10.second).longValue();
                    }
                }
                i1Var.h(obj2, g1Var);
                int i12 = wVar.f3557b;
                long d10 = g1Var.d(i12);
                if (d10 == Long.MIN_VALUE) {
                    j12 = g1Var.f3319d;
                } else {
                    j12 = g1Var.f3322g.a(i12).f3200g + d10;
                }
                return g(i1Var, wVar.f3556a, Math.max(j12, j14), q0Var.f19620c, wVar.f3559d);
            }
            return null;
        }
        int i13 = wVar.f3560e;
        if (i13 != -1 && g1Var.h(i13)) {
            return c(i1Var, p0Var, j13);
        }
        int f10 = g1Var.f(i13);
        if (g1Var.i(i13) && g1Var.e(i13, f10) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 != g1Var.f3322g.a(i13).f3195b && !z10) {
            return f(i1Var, wVar.f3556a, wVar.f3560e, f10, q0Var.f19622e, wVar.f3559d);
        }
        i1Var.h(obj2, g1Var);
        long d11 = g1Var.d(i13);
        if (d11 == Long.MIN_VALUE) {
            j11 = g1Var.f3319d;
        } else {
            j11 = g1Var.f3322g.a(i13).f3200g + d11;
        }
        return g(i1Var, wVar.f3556a, j11, q0Var.f19622e, wVar.f3559d);
    }

    public final q0 e(b5.i1 i1Var, r5.w wVar, long j10, long j11) {
        i1Var.h(wVar.f3556a, this.f19627a);
        if (wVar.a()) {
            return f(i1Var, wVar.f3556a, wVar.f3557b, wVar.f3558c, j10, wVar.f3559d);
        }
        return g(i1Var, wVar.f3556a, j11, j10, wVar.f3559d);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [b5.o0, r5.w] */
    public final q0 f(b5.i1 i1Var, Object obj, int i10, int i11, long j10, long j11) {
        long j12;
        long j13;
        ?? o0Var = new b5.o0(i10, i11, -1, j11, obj);
        b5.g1 g1Var = this.f19627a;
        long a10 = i1Var.h(obj, g1Var).a(i10, i11);
        if (i11 == g1Var.f(i10)) {
            j12 = g1Var.f3322g.f3212c;
        } else {
            j12 = 0;
        }
        boolean i12 = g1Var.i(i10);
        if (a10 != -9223372036854775807L && j12 >= a10) {
            j13 = Math.max(0L, a10 - 1);
        } else {
            j13 = j12;
        }
        return new q0(o0Var, j13, j10, -9223372036854775807L, a10, i12, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i5.q0 g(b5.i1 r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.r0.g(b5.i1, java.lang.Object, long, long, long):i5.q0");
    }

    public final q0 h(b5.i1 i1Var, q0 q0Var) {
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        r5.w wVar = q0Var.f19618a;
        boolean a10 = wVar.a();
        int i10 = wVar.f3560e;
        if (!a10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean j12 = j(i1Var, wVar);
        boolean i11 = i(i1Var, wVar, z10);
        Object obj = q0Var.f19618a.f3556a;
        b5.g1 g1Var = this.f19627a;
        i1Var.h(obj, g1Var);
        if (!wVar.a() && i10 != -1) {
            j10 = g1Var.d(i10);
        } else {
            j10 = -9223372036854775807L;
        }
        boolean a11 = wVar.a();
        int i12 = wVar.f3557b;
        if (a11) {
            j11 = g1Var.a(i12, wVar.f3558c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = g1Var.f3319d;
        }
        if (wVar.a()) {
            z11 = g1Var.i(i12);
        } else if (i10 != -1 && g1Var.i(i10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new q0(wVar, q0Var.f19619b, q0Var.f19620c, j10, j11, z11, z10, j12, i11);
    }

    public final boolean i(b5.i1 i1Var, r5.w wVar, boolean z10) {
        int b10 = i1Var.b(wVar.f3556a);
        if (i1Var.n(i1Var.g(b10, this.f19627a, false).f3318c, this.f19628b, 0L).f3340i || i1Var.d(b10, this.f19627a, this.f19628b, this.f19632f, this.f19633g) != -1 || !z10) {
            return false;
        }
        return true;
    }

    public final boolean j(b5.i1 i1Var, r5.w wVar) {
        boolean z10;
        if (!wVar.a() && wVar.f3560e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Object obj = wVar.f3556a;
        if (i1Var.n(i1Var.h(obj, this.f19627a).f3318c, this.f19628b, 0L).f3347p != i1Var.b(obj)) {
            return false;
        }
        return true;
    }

    public final void k() {
        r5.w wVar;
        lp.l0 l0Var = lp.o0.f25025b;
        lp.h0 h0Var = new lp.h0();
        for (p0 p0Var = this.f19634h; p0Var != null; p0Var = p0Var.f19593l) {
            h0Var.a0(p0Var.f19587f.f19618a);
        }
        p0 p0Var2 = this.f19635i;
        if (p0Var2 == null) {
            wVar = null;
        } else {
            wVar = p0Var2.f19587f.f19618a;
        }
        ((e5.t) this.f19630d).c(new androidx.fragment.app.e(3, this, h0Var, wVar));
    }

    public final boolean l(p0 p0Var) {
        boolean z10;
        boolean z11 = false;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        if (p0Var.equals(this.f19636j)) {
            return false;
        }
        this.f19636j = p0Var;
        while (true) {
            p0Var = p0Var.f19593l;
            if (p0Var == null) {
                break;
            }
            if (p0Var == this.f19635i) {
                this.f19635i = this.f19634h;
                z11 = true;
            }
            p0Var.f();
            this.f19637k--;
        }
        p0 p0Var2 = this.f19636j;
        if (p0Var2.f19593l != null) {
            p0Var2.b();
            p0Var2.f19593l = null;
            p0Var2.c();
        }
        k();
        return z11;
    }

    public final r5.w n(b5.i1 i1Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        b5.g1 g1Var = this.f19627a;
        int i10 = i1Var.h(obj2, g1Var).f3318c;
        Object obj3 = this.f19638l;
        if (obj3 != null && (b10 = i1Var.b(obj3)) != -1 && i1Var.g(b10, g1Var, false).f3318c == i10) {
            j11 = this.f19639m;
        } else {
            p0 p0Var = this.f19634h;
            while (true) {
                if (p0Var != null) {
                    if (p0Var.f19583b.equals(obj2)) {
                        j11 = p0Var.f19587f.f19618a.f3559d;
                        break;
                    }
                    p0Var = p0Var.f19593l;
                } else {
                    p0 p0Var2 = this.f19634h;
                    while (true) {
                        if (p0Var2 != null) {
                            int b11 = i1Var.b(p0Var2.f19583b);
                            if (b11 != -1 && i1Var.g(b11, g1Var, false).f3318c == i10) {
                                j11 = p0Var2.f19587f.f19618a.f3559d;
                                break;
                            }
                            p0Var2 = p0Var2.f19593l;
                        } else {
                            j11 = this.f19631e;
                            this.f19631e = 1 + j11;
                            if (this.f19634h == null) {
                                this.f19638l = obj2;
                                this.f19639m = j11;
                            }
                        }
                    }
                }
            }
        }
        long j12 = j11;
        i1Var.h(obj2, g1Var);
        int i11 = g1Var.f3318c;
        b5.h1 h1Var = this.f19628b;
        i1Var.o(i11, h1Var);
        boolean z10 = false;
        for (int b12 = i1Var.b(obj); b12 >= h1Var.f3346o; b12--) {
            boolean z11 = true;
            i1Var.g(b12, g1Var, true);
            if (g1Var.f3322g.f3211b <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (g1Var.c(g1Var.f3319d) != -1) {
                obj2 = g1Var.f3317b;
                obj2.getClass();
            }
            if (z10 && (!z11 || g1Var.f3319d != 0)) {
                break;
            }
        }
        return m(i1Var, obj2, j10, j12, this.f19628b, this.f19627a);
    }

    public final boolean o(b5.i1 i1Var) {
        p0 p0Var;
        p0 p0Var2 = this.f19634h;
        if (p0Var2 == null) {
            return true;
        }
        int b10 = i1Var.b(p0Var2.f19583b);
        while (true) {
            b10 = i1Var.d(b10, this.f19627a, this.f19628b, this.f19632f, this.f19633g);
            while (true) {
                p0Var = p0Var2.f19593l;
                if (p0Var == null || p0Var2.f19587f.f19624g) {
                    break;
                }
                p0Var2 = p0Var;
            }
            if (b10 == -1 || p0Var == null || i1Var.b(p0Var.f19583b) != b10) {
                break;
            }
            p0Var2 = p0Var;
        }
        boolean l10 = l(p0Var2);
        p0Var2.f19587f = h(i1Var, p0Var2.f19587f);
        return !l10;
    }

    public final boolean p(b5.i1 i1Var, long j10, long j11) {
        q0 q0Var;
        long j12;
        boolean z10;
        p0 p0Var = null;
        for (p0 p0Var2 = this.f19634h; p0Var2 != null; p0Var2 = p0Var2.f19593l) {
            q0 q0Var2 = p0Var2.f19587f;
            if (p0Var == null) {
                q0Var = h(i1Var, q0Var2);
            } else {
                q0 d10 = d(i1Var, p0Var, j10);
                if (d10 == null) {
                    return !l(p0Var);
                }
                if (q0Var2.f19619b == d10.f19619b && q0Var2.f19618a.equals(d10.f19618a)) {
                    q0Var = d10;
                } else {
                    return !l(p0Var);
                }
            }
            p0Var2.f19587f = q0Var.a(q0Var2.f19620c);
            long j13 = q0Var2.f19622e;
            if (j13 != -9223372036854775807L) {
                long j14 = q0Var.f19622e;
                if (j13 != j14) {
                    p0Var2.h();
                    if (j14 == -9223372036854775807L) {
                        j12 = Long.MAX_VALUE;
                    } else {
                        j12 = p0Var2.f19596o + j14;
                    }
                    if (p0Var2 == this.f19635i && !p0Var2.f19587f.f19623f && (j11 == Long.MIN_VALUE || j11 >= j12)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!l(p0Var2) && !z10) {
                        return true;
                    }
                    return false;
                }
            }
            p0Var = p0Var2;
        }
        return true;
    }
}
