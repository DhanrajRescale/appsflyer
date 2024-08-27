package i5;

import android.util.Pair;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final r5.u f19582a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19583b;

    /* renamed from: c, reason: collision with root package name */
    public final r5.v0[] f19584c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19585d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19586e;

    /* renamed from: f, reason: collision with root package name */
    public q0 f19587f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19588g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f19589h;

    /* renamed from: i, reason: collision with root package name */
    public final f[] f19590i;

    /* renamed from: j, reason: collision with root package name */
    public final u5.v f19591j;

    /* renamed from: k, reason: collision with root package name */
    public final a1 f19592k;

    /* renamed from: l, reason: collision with root package name */
    public p0 f19593l;

    /* renamed from: m, reason: collision with root package name */
    public r5.e1 f19594m;

    /* renamed from: n, reason: collision with root package name */
    public u5.w f19595n;

    /* renamed from: o, reason: collision with root package name */
    public long f19596o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [r5.c] */
    public p0(f[] fVarArr, long j10, u5.v vVar, v5.e eVar, a1 a1Var, q0 q0Var, u5.w wVar) {
        this.f19590i = fVarArr;
        this.f19596o = j10;
        this.f19591j = vVar;
        this.f19592k = a1Var;
        r5.w wVar2 = q0Var.f19618a;
        this.f19583b = wVar2.f3556a;
        this.f19587f = q0Var;
        this.f19594m = r5.e1.f33145d;
        this.f19595n = wVar;
        this.f19584c = new r5.v0[fVarArr.length];
        this.f19589h = new boolean[fVarArr.length];
        long j11 = q0Var.f19621d;
        a1Var.getClass();
        int i10 = f1.f19424k;
        Pair pair = (Pair) wVar2.f3556a;
        Object obj = pair.first;
        r5.w b10 = wVar2.b(pair.second);
        z0 z0Var = (z0) a1Var.f19348d.get(obj);
        z0Var.getClass();
        a1Var.f19351g.add(z0Var);
        y0 y0Var = (y0) a1Var.f19350f.get(z0Var);
        if (y0Var != null) {
            y0Var.f19675a.e(y0Var.f19676b);
        }
        z0Var.f19681c.add(b10);
        r5.o b11 = z0Var.f19679a.b(b10, eVar, q0Var.f19619b);
        a1Var.f19347c.put(b11, z0Var);
        a1Var.c();
        this.f19582a = j11 != -9223372036854775807L ? new r5.c(b11, true, 0L, j11) : b11;
    }

    public final long a(u5.w wVar, long j10, boolean z10, boolean[] zArr) {
        f[] fVarArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= wVar.f36847a) {
                break;
            }
            if (z10 || !wVar.a(this.f19595n, i10)) {
                z12 = false;
            }
            this.f19589h[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            fVarArr = this.f19590i;
            int length = fVarArr.length;
            objArr = this.f19584c;
            if (i11 >= length) {
                break;
            }
            if (fVarArr[i11].f19409b == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f19595n = wVar;
        c();
        long o10 = this.f19582a.o(wVar.f36849c, this.f19589h, this.f19584c, zArr, j10);
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            if (fVarArr[i12].f19409b == -2 && this.f19595n.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f19586e = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                yk.j.H0(wVar.b(i13));
                if (fVarArr[i13].f19409b != -2) {
                    this.f19586e = true;
                }
            } else {
                if (wVar.f36849c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yk.j.H0(z11);
            }
        }
        return o10;
    }

    public final void b() {
        if (this.f19593l == null) {
            int i10 = 0;
            while (true) {
                u5.w wVar = this.f19595n;
                if (i10 < wVar.f36847a) {
                    boolean b10 = wVar.b(i10);
                    u5.s sVar = this.f19595n.f36849c[i10];
                    if (b10 && sVar != null) {
                        sVar.k();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f19593l == null) {
            int i10 = 0;
            while (true) {
                u5.w wVar = this.f19595n;
                if (i10 < wVar.f36847a) {
                    boolean b10 = wVar.b(i10);
                    u5.s sVar = this.f19595n.f36849c[i10];
                    if (b10 && sVar != null) {
                        sVar.h();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j10;
        if (!this.f19585d) {
            return this.f19587f.f19619b;
        }
        if (this.f19586e) {
            j10 = this.f19582a.G();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f19587f.f19622e;
        }
        return j10;
    }

    public final long e() {
        return this.f19587f.f19619b + this.f19596o;
    }

    public final void f() {
        b();
        r5.u uVar = this.f19582a;
        try {
            boolean z10 = uVar instanceof r5.c;
            a1 a1Var = this.f19592k;
            if (z10) {
                a1Var.f(((r5.c) uVar).f33093a);
            } else {
                a1Var.f(uVar);
            }
        } catch (RuntimeException e10) {
            e5.m.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0396, code lost:
    
        if (r6 != 2) goto L182;
     */
    /* JADX WARN: Type inference failed for: r2v28, types: [lp.h0, lp.k0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u5.w g(float r24, b5.i1 r25) {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.p0.g(float, b5.i1):u5.w");
    }

    public final void h() {
        r5.u uVar = this.f19582a;
        if (uVar instanceof r5.c) {
            long j10 = this.f19587f.f19621d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            r5.c cVar = (r5.c) uVar;
            cVar.f33097e = 0L;
            cVar.f33098f = j10;
        }
    }
}
