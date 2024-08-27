package e0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.h1;
import t0.l1;
import t0.n1;
import t0.o3;
import x.s1;
import y.d2;

/* loaded from: classes.dex */
public abstract class j0 implements d2 {
    public final d0.d0 A;
    public final g1 B;
    public final n1 C;
    public final n1 D;

    /* renamed from: a, reason: collision with root package name */
    public final n1 f14715a;

    /* renamed from: b, reason: collision with root package name */
    public final v f14716b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f14717c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f14718d;

    /* renamed from: e, reason: collision with root package name */
    public int f14719e;

    /* renamed from: f, reason: collision with root package name */
    public int f14720f;

    /* renamed from: g, reason: collision with root package name */
    public long f14721g;

    /* renamed from: h, reason: collision with root package name */
    public long f14722h;

    /* renamed from: i, reason: collision with root package name */
    public float f14723i;

    /* renamed from: j, reason: collision with root package name */
    public float f14724j;

    /* renamed from: k, reason: collision with root package name */
    public final y.y f14725k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14726l;

    /* renamed from: m, reason: collision with root package name */
    public int f14727m;

    /* renamed from: n, reason: collision with root package name */
    public d0.e0 f14728n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14729o;

    /* renamed from: p, reason: collision with root package name */
    public final n1 f14730p;

    /* renamed from: q, reason: collision with root package name */
    public w2.b f14731q;

    /* renamed from: r, reason: collision with root package name */
    public final a0.l f14732r;

    /* renamed from: s, reason: collision with root package name */
    public final l1 f14733s;

    /* renamed from: t, reason: collision with root package name */
    public final l1 f14734t;

    /* renamed from: u, reason: collision with root package name */
    public final d0.f0 f14735u;

    /* renamed from: v, reason: collision with root package name */
    public final d0.k f14736v;

    /* renamed from: w, reason: collision with root package name */
    public final d0.c f14737w;

    /* renamed from: x, reason: collision with root package name */
    public final n1 f14738x;

    /* renamed from: y, reason: collision with root package name */
    public final c0.h0 f14739y;

    /* renamed from: z, reason: collision with root package name */
    public long f14740z;

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, d0.f0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, d0.c] */
    public j0(int i10, float f10) {
        double d10 = f10;
        if (-0.5d <= d10 && d10 <= 0.5d) {
            m1.c cVar = new m1.c(m1.c.f27233b);
            o3 o3Var = o3.f35116a;
            this.f14715a = t0.t.n0(cVar, o3Var);
            this.f14716b = new v(this);
            Boolean bool = Boolean.FALSE;
            this.f14717c = t0.t.n0(bool, o3Var);
            this.f14718d = new c0(i10, f10, this);
            this.f14719e = i10;
            this.f14721g = Long.MAX_VALUE;
            this.f14725k = new y.y(new t.g0(this, 13));
            this.f14726l = true;
            this.f14727m = -1;
            z zVar = m0.f14760b;
            h1 h1Var = h1.f35033a;
            this.f14730p = t0.t.n0(zVar, h1Var);
            this.f14731q = m0.f14761c;
            this.f14732r = new a0.l();
            this.f14733s = al.d.D0(-1);
            this.f14734t = al.d.D0(i10);
            t0.t.O(o3Var, new g(this, 2));
            t0.t.O(o3Var, new g(this, 3));
            this.f14735u = new Object();
            this.f14736v = new d0.k();
            this.f14737w = new Object();
            this.f14738x = t0.t.n0(null, o3Var);
            this.f14739y = new c0.h0(this, 1);
            this.f14740z = hl.f.c(0, 0, 15);
            this.A = new d0.d0();
            this.B = t0.t.n0(Unit.f23355a, h1Var);
            this.C = t0.t.n0(bool, o3Var);
            this.D = t0.t.n0(bool, o3Var);
            return;
        }
        throw new IllegalArgumentException(jr.h.m("currentPageOffsetFraction ", f10, " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object p(e0.j0 r5, x.s1 r6, kotlin.jvm.functions.Function2 r7, yt.a r8) {
        /*
            boolean r0 = r8 instanceof e0.h0
            if (r0 == 0) goto L13
            r0 = r8
            e0.h0 r0 = (e0.h0) r0
            int r1 = r0.f14704f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14704f = r1
            goto L18
        L13:
            e0.h0 r0 = new e0.h0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f14702d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f14704f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            e0.j0 r5 = r0.f14699a
            ut.n.b(r8)
            goto L7e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.jvm.functions.Function2 r7 = r0.f14701c
            x.s1 r6 = r0.f14700b
            e0.j0 r5 = r0.f14699a
            ut.n.b(r8)
            goto L57
        L3e:
            ut.n.b(r8)
            r0.f14699a = r5
            r0.f14700b = r6
            r0.f14701c = r7
            r0.f14704f = r4
            d0.c r8 = r5.f14737w
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r8 = kotlin.Unit.f23355a
        L54:
            if (r8 != r1) goto L57
            return r1
        L57:
            y.y r8 = r5.f14725k
            boolean r8 = r8.a()
            if (r8 != 0) goto L6c
            e0.c0 r8 = r5.f14718d
            t0.l1 r8 = r8.f14650b
            int r8 = r8.i()
            t0.l1 r2 = r5.f14734t
            r2.j(r8)
        L6c:
            r0.f14699a = r5
            r8 = 0
            r0.f14700b = r8
            r0.f14701c = r8
            r0.f14704f = r3
            y.y r8 = r5.f14725k
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L7e
            return r1
        L7e:
            t0.l1 r5 = r5.f14733s
            r6 = -1
            r5.j(r6)
            kotlin.Unit r5 = kotlin.Unit.f23355a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j0.p(e0.j0, x.s1, kotlin.jvm.functions.Function2, yt.a):java.lang.Object");
    }

    public static Object q(j0 j0Var, int i10, yt.a aVar) {
        j0Var.getClass();
        Object b10 = j0Var.b(s1.f39717a, new i0(j0Var, s0.g.f34069a, i10, null), aVar);
        if (b10 != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return b10;
    }

    @Override // y.d2
    public final boolean a() {
        return this.f14725k.a();
    }

    @Override // y.d2
    public final Object b(s1 s1Var, Function2 function2, yt.a aVar) {
        return p(this, s1Var, function2, aVar);
    }

    @Override // y.d2
    public final boolean c() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // y.d2
    public final boolean d() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // y.d2
    public final float e(float f10) {
        return this.f14725k.e(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(int r12, float r13, w.n r14, yt.a r15) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j0.f(int, float, w.n, yt.a):java.lang.Object");
    }

    public final void g(z zVar, boolean z10) {
        Object obj;
        int i10;
        int i11;
        long j10;
        long f10;
        c0 c0Var = this.f14718d;
        boolean z11 = true;
        Function1 function1 = null;
        if (z10) {
            c0Var.f14651c.j(zVar.f14830k);
        } else {
            c0Var.getClass();
            k kVar = zVar.f14829j;
            if (kVar != null) {
                obj = kVar.f14745e;
            } else {
                obj = null;
            }
            c0Var.f14653e = obj;
            boolean z12 = c0Var.f14652d;
            List list = zVar.f14820a;
            if (z12 || (!list.isEmpty())) {
                c0Var.f14652d = true;
                if (kVar != null) {
                    i10 = kVar.f14741a;
                } else {
                    i10 = 0;
                }
                float f11 = zVar.f14830k;
                c0Var.f14650b.j(i10);
                c0Var.f14654f.b(i10);
                c0Var.f14651c.j(f11);
            }
            if (this.f14727m != -1 && (!list.isEmpty())) {
                boolean z13 = this.f14729o;
                int i12 = zVar.f14827h;
                if (z13) {
                    i11 = ((k) ((l) vt.g0.C(list))).f14741a + i12 + 1;
                } else {
                    i11 = (((k) ((l) vt.g0.u(list))).f14741a - i12) - 1;
                }
                if (this.f14727m != i11) {
                    this.f14727m = -1;
                    d0.e0 e0Var = this.f14728n;
                    if (e0Var != null) {
                        e0Var.cancel();
                    }
                    this.f14728n = null;
                }
            }
        }
        this.f14730p.setValue(zVar);
        this.C.setValue(Boolean.valueOf(zVar.f14832m));
        k kVar2 = zVar.f14828i;
        if ((kVar2 == null || kVar2.f14741a == 0) && zVar.f14831l == 0) {
            z11 = false;
        }
        this.D.setValue(Boolean.valueOf(z11));
        if (kVar2 != null) {
            this.f14719e = kVar2.f14741a;
        }
        this.f14720f = zVar.f14831l;
        e1.i h10 = yq.b.h();
        if (h10 != null) {
            function1 = h10.f();
        }
        e1.i i13 = yq.b.i(h10);
        try {
            if (Math.abs(this.f14724j) > 0.5f && this.f14726l && n(this.f14724j)) {
                o(this.f14724j, zVar);
            }
            Unit unit = Unit.f23355a;
            yq.b.l(h10, i13, function1);
            int j11 = j();
            float f12 = m0.f14759a;
            long j12 = (j11 * (zVar.f14822c + zVar.f14821b)) + (-zVar.f14825f) + zVar.f14823d;
            y.g1 g1Var = y.g1.f40724b;
            y.g1 g1Var2 = zVar.f14824e;
            long f13 = zVar.f();
            if (g1Var2 == g1Var) {
                j10 = f13 >> 32;
            } else {
                j10 = f13 & 4294967295L;
            }
            int i14 = (int) j10;
            zVar.f14833n.getClass();
            this.f14721g = kotlin.ranges.d.b(j12 - (i14 - kotlin.ranges.d.f(0, 0, i14)));
            j();
            if (g1Var2 == g1Var) {
                f10 = zVar.f() >> 32;
            } else {
                f10 = zVar.f() & 4294967295L;
            }
            this.f14722h = kotlin.ranges.d.f(0, 0, (int) f10);
        } catch (Throwable th2) {
            yq.b.l(h10, i13, function1);
            throw th2;
        }
    }

    public final int h(int i10) {
        if (j() <= 0) {
            return 0;
        }
        return kotlin.ranges.d.f(i10, 0, j() - 1);
    }

    public final t i() {
        return (t) this.f14730p.getValue();
    }

    public abstract int j();

    public final int k() {
        return ((z) this.f14730p.getValue()).f14821b;
    }

    public final int l() {
        return ((z) this.f14730p.getValue()).f14822c + k();
    }

    public final long m() {
        return ((m1.c) this.f14715a.getValue()).f27237a;
    }

    public final boolean n(float f10) {
        if (((z) i()).f14824e != y.g1.f40723a ? Math.signum(f10) != Math.signum(-m1.c.d(m())) : Math.signum(f10) != Math.signum(-m1.c.e(m()))) {
            if (((int) m1.c.d(m())) != 0 || ((int) m1.c.e(m())) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void o(float f10, t tVar) {
        boolean z10;
        int i10;
        d0.e0 e0Var;
        if (!this.f14726l) {
            return;
        }
        z zVar = (z) tVar;
        List list = zVar.f14820a;
        if (!list.isEmpty()) {
            if (f10 > s0.g.f34069a) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = zVar.f14827h;
            if (z10) {
                i10 = ((k) ((l) vt.g0.C(list))).f14741a + i11 + 1;
            } else {
                i10 = (((k) ((l) vt.g0.u(list))).f14741a - i11) - 1;
            }
            if (i10 != this.f14727m && i10 >= 0 && i10 < j()) {
                if (this.f14729o != z10 && (e0Var = this.f14728n) != null) {
                    e0Var.cancel();
                }
                this.f14729o = z10;
                this.f14727m = i10;
                this.f14728n = this.f14735u.a(i10, this.f14740z);
            }
        }
    }
}
