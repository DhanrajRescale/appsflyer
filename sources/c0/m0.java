package c0;

import a2.c1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import t0.g1;
import t0.h1;
import t0.n1;
import t0.o3;
import w.i1;
import w.z1;
import x.s1;
import y.d2;

/* loaded from: classes.dex */
public final class m0 implements d2 {

    /* renamed from: v, reason: collision with root package name */
    public static final d1.r f7529v = t0.t.g0(f0.f7495a, y.f7620d);

    /* renamed from: a, reason: collision with root package name */
    public final c0 f7530a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7531b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f7532c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f7533d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f7534e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.l f7535f;

    /* renamed from: g, reason: collision with root package name */
    public float f7536g;

    /* renamed from: h, reason: collision with root package name */
    public final y.y f7537h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7538i;

    /* renamed from: j, reason: collision with root package name */
    public c1 f7539j;

    /* renamed from: k, reason: collision with root package name */
    public final h0 f7540k;

    /* renamed from: l, reason: collision with root package name */
    public final d0.c f7541l;

    /* renamed from: m, reason: collision with root package name */
    public final m f7542m;

    /* renamed from: n, reason: collision with root package name */
    public final d0.k f7543n;

    /* renamed from: o, reason: collision with root package name */
    public final d0.f0 f7544o;

    /* renamed from: p, reason: collision with root package name */
    public final g0 f7545p;

    /* renamed from: q, reason: collision with root package name */
    public final d0.d0 f7546q;

    /* renamed from: r, reason: collision with root package name */
    public final n1 f7547r;

    /* renamed from: s, reason: collision with root package name */
    public final n1 f7548s;

    /* renamed from: t, reason: collision with root package name */
    public final g1 f7549t;

    /* renamed from: u, reason: collision with root package name */
    public w.o f7550u;

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.c0, java.lang.Object, c0.a] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, d0.f0] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, d0.c] */
    public m0(int i10, int i11) {
        ?? obj = new Object();
        obj.f7435a = -1;
        this.f7530a = obj;
        this.f7533d = new e0(i10, i11);
        a0 a0Var = p0.f7564b;
        h1 h1Var = h1.f35033a;
        this.f7534e = t0.t.n0(a0Var, h1Var);
        this.f7535f = new a0.l();
        this.f7537h = new y.y(new t.g0(this, 10));
        this.f7538i = true;
        this.f7540k = new h0(this, 0);
        this.f7541l = new Object();
        this.f7542m = new m();
        this.f7543n = new d0.k();
        this.f7544o = new Object();
        this.f7545p = new g0(this);
        this.f7546q = new d0.d0();
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f35116a;
        this.f7547r = t0.t.n0(bool, o3Var);
        this.f7548s = t0.t.n0(bool, o3Var);
        this.f7549t = t0.t.n0(Unit.f23355a, h1Var);
        this.f7550u = new w.o(z1.f38739a, Float.valueOf(s0.g.f34069a), (w.t) i1.f38529g.invoke(Float.valueOf(s0.g.f34069a)), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static Object i(m0 m0Var, int i10, yt.a aVar) {
        m0Var.getClass();
        Object b10 = m0Var.b(s1.f39717a, new j0(m0Var, i10, 0, null), aVar);
        if (b10 != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return b10;
    }

    @Override // y.d2
    public final boolean a() {
        return this.f7537h.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // y.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(x.s1 r6, kotlin.jvm.functions.Function2 r7, yt.a r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof c0.i0
            if (r0 == 0) goto L13
            r0 = r8
            c0.i0 r0 = (c0.i0) r0
            int r1 = r0.f7511f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7511f = r1
            goto L18
        L13:
            c0.i0 r0 = new c0.i0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f7509d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f7511f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ut.n.b(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.jvm.functions.Function2 r7 = r0.f7508c
            x.s1 r6 = r0.f7507b
            c0.m0 r2 = r0.f7506a
            ut.n.b(r8)
            goto L51
        L3c:
            ut.n.b(r8)
            r0.f7506a = r5
            r0.f7507b = r6
            r0.f7508c = r7
            r0.f7511f = r4
            d0.c r8 = r5.f7541l
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            y.y r8 = r2.f7537h
            r2 = 0
            r0.f7506a = r2
            r0.f7507b = r2
            r0.f7508c = r2
            r0.f7511f = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.m0.b(x.s1, kotlin.jvm.functions.Function2, yt.a):java.lang.Object");
    }

    @Override // y.d2
    public final boolean c() {
        return ((Boolean) this.f7548s.getValue()).booleanValue();
    }

    @Override // y.d2
    public final boolean d() {
        return ((Boolean) this.f7547r.getValue()).booleanValue();
    }

    @Override // y.d2
    public final float e(float f10) {
        return this.f7537h.e(f10);
    }

    public final void f(a0 a0Var, boolean z10, boolean z11) {
        boolean z12;
        Object obj;
        int i10;
        Function1 function1;
        if (!z10 && this.f7531b) {
            this.f7532c = a0Var;
            return;
        }
        if (z10) {
            this.f7531b = true;
        }
        b0 b0Var = a0Var.f7438a;
        int i11 = 0;
        if ((b0Var != null && b0Var.f7464a != 0) || a0Var.f7439b != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f7548s.setValue(Boolean.valueOf(z12));
        this.f7547r.setValue(Boolean.valueOf(a0Var.f7440c));
        this.f7536g -= a0Var.f7441d;
        this.f7534e.setValue(a0Var);
        e0 e0Var = this.f7533d;
        if (z11) {
            int i12 = a0Var.f7439b;
            if (i12 >= s0.g.f34069a) {
                e0Var.f7489b.j(i12);
            } else {
                e0Var.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i12 + ')').toString());
            }
        } else {
            e0Var.getClass();
            if (b0Var != null) {
                obj = b0Var.f7473j;
            } else {
                obj = null;
            }
            e0Var.f7491d = obj;
            if (e0Var.f7490c || a0Var.f7450m > 0) {
                e0Var.f7490c = true;
                int i13 = a0Var.f7439b;
                if (i13 >= s0.g.f34069a) {
                    if (b0Var != null) {
                        i11 = b0Var.f7464a;
                    }
                    e0Var.a(i11, i13);
                } else {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i13 + ')').toString());
                }
            }
            if (this.f7538i) {
                a aVar = (a) this.f7530a;
                if (aVar.f7435a != -1) {
                    List list = a0Var.f7447j;
                    if (!list.isEmpty()) {
                        if (aVar.f7437c) {
                            i10 = ((b0) ((n) vt.g0.C(list))).f7464a + 1;
                        } else {
                            i10 = ((b0) ((n) vt.g0.u(list))).f7464a - 1;
                        }
                        if (aVar.f7435a != i10) {
                            aVar.f7435a = -1;
                            d0.e0 e0Var2 = aVar.f7436b;
                            if (e0Var2 != null) {
                                e0Var2.cancel();
                            }
                            aVar.f7436b = null;
                        }
                    }
                }
            }
        }
        if (z10) {
            float c02 = a0Var.f7445h.c0(p0.f7563a);
            float f10 = a0Var.f7442e;
            if (f10 > c02) {
                e1.i h10 = yq.b.h();
                if (h10 != null) {
                    function1 = h10.f();
                } else {
                    function1 = null;
                }
                e1.i i14 = yq.b.i(h10);
                try {
                    float floatValue = ((Number) this.f7550u.f38622b.getValue()).floatValue();
                    w.o oVar = this.f7550u;
                    boolean z13 = oVar.f38626f;
                    qu.f0 f0Var = a0Var.f7444g;
                    if (z13) {
                        this.f7550u = w.e.m(oVar, floatValue - f10, s0.g.f34069a, 30);
                        yk.g.H(f0Var, null, null, new k0(this, null), 3);
                    } else {
                        this.f7550u = new w.o(z1.f38739a, Float.valueOf(-f10), null, 60);
                        yk.g.H(f0Var, null, null, new l0(this, null), 3);
                    }
                    yq.b.l(h10, i14, function1);
                } catch (Throwable th2) {
                    yq.b.l(h10, i14, function1);
                    throw th2;
                }
            }
        }
    }

    public final x g() {
        return (x) this.f7534e.getValue();
    }

    public final void h(float f10, x xVar) {
        boolean z10;
        int i10;
        Function1 function1;
        d0.e0 e0Var;
        if (this.f7538i) {
            a aVar = (a) this.f7530a;
            aVar.getClass();
            a0 a0Var = (a0) xVar;
            if (!a0Var.f7447j.isEmpty()) {
                if (f10 < s0.g.f34069a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                List list = a0Var.f7447j;
                if (z10) {
                    i10 = ((b0) ((n) vt.g0.C(list))).f7464a + 1;
                } else {
                    i10 = ((b0) ((n) vt.g0.u(list))).f7464a - 1;
                }
                if (i10 != aVar.f7435a && i10 >= 0 && i10 < a0Var.f7450m) {
                    if (aVar.f7437c != z10 && (e0Var = aVar.f7436b) != null) {
                        e0Var.cancel();
                    }
                    aVar.f7437c = z10;
                    aVar.f7435a = i10;
                    g0 g0Var = this.f7545p;
                    g0Var.getClass();
                    m0 m0Var = g0Var.f7499a;
                    e1.i h10 = yq.b.h();
                    if (h10 != null) {
                        function1 = h10.f();
                    } else {
                        function1 = null;
                    }
                    e1.i i11 = yq.b.i(h10);
                    try {
                        long j10 = ((a0) m0Var.f7534e.getValue()).f7446i;
                        yq.b.l(h10, i11, function1);
                        aVar.f7436b = m0Var.f7544o.a(i10, j10);
                    } catch (Throwable th2) {
                        yq.b.l(h10, i11, function1);
                        throw th2;
                    }
                }
            }
        }
    }
}
