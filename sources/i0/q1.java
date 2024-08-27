package i0;

import d2.d3;
import kotlin.jvm.functions.Function1;
import t0.o3;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public z1 f19134a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.w1 f19135b;

    /* renamed from: c, reason: collision with root package name */
    public final d3 f19136c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.j f19137d;

    /* renamed from: e, reason: collision with root package name */
    public p2.i0 f19138e;

    /* renamed from: f, reason: collision with root package name */
    public final t0.n1 f19139f;

    /* renamed from: g, reason: collision with root package name */
    public final t0.n1 f19140g;

    /* renamed from: h, reason: collision with root package name */
    public a2.u f19141h;

    /* renamed from: i, reason: collision with root package name */
    public final t0.n1 f19142i;

    /* renamed from: j, reason: collision with root package name */
    public j2.e f19143j;

    /* renamed from: k, reason: collision with root package name */
    public final t0.n1 f19144k;

    /* renamed from: l, reason: collision with root package name */
    public final t0.n1 f19145l;

    /* renamed from: m, reason: collision with root package name */
    public final t0.n1 f19146m;

    /* renamed from: n, reason: collision with root package name */
    public final t0.n1 f19147n;

    /* renamed from: o, reason: collision with root package name */
    public final t0.n1 f19148o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19149p;

    /* renamed from: q, reason: collision with root package name */
    public final t0.n1 f19150q;

    /* renamed from: r, reason: collision with root package name */
    public final m1 f19151r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f19152s;

    /* renamed from: t, reason: collision with root package name */
    public final h0 f19153t;

    /* renamed from: u, reason: collision with root package name */
    public final h0 f19154u;

    /* renamed from: v, reason: collision with root package name */
    public final n1.f f19155v;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, p2.j] */
    public q1(z1 z1Var, t0.x1 x1Var, d3 d3Var) {
        this.f19134a = z1Var;
        this.f19135b = x1Var;
        this.f19136c = d3Var;
        ?? obj = new Object();
        j2.e eVar = j2.f.f20709a;
        p2.c0 c0Var = new p2.c0(eVar, j2.f0.f20710b, (j2.f0) null);
        obj.f30578a = c0Var;
        obj.f30579b = new p2.k(eVar, c0Var.f30523b);
        this.f19137d = obj;
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f35116a;
        this.f19139f = t0.t.n0(bool, o3Var);
        this.f19140g = t0.t.n0(new w2.e(0), o3Var);
        this.f19142i = t0.t.n0(null, o3Var);
        this.f19144k = t0.t.n0(a1.f18782a, o3Var);
        this.f19145l = t0.t.n0(bool, o3Var);
        this.f19146m = t0.t.n0(bool, o3Var);
        this.f19147n = t0.t.n0(bool, o3Var);
        this.f19148o = t0.t.n0(bool, o3Var);
        this.f19149p = true;
        this.f19150q = t0.t.n0(Boolean.TRUE, o3Var);
        this.f19151r = new m1(d3Var);
        this.f19152s = r.f19164d;
        this.f19153t = new h0(this, 4);
        this.f19154u = new h0(this, 3);
        this.f19155v = androidx.compose.ui.graphics.a.g();
    }

    public final a1 a() {
        return (a1) this.f19144k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f19139f.getValue()).booleanValue();
    }

    public final a2.u c() {
        a2.u uVar = this.f19141h;
        if (uVar == null || !uVar.m()) {
            return null;
        }
        return uVar;
    }

    public final s2 d() {
        return (s2) this.f19142i.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r1.f19299h != r18) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(j2.e r13, j2.e r14, j2.g0 r15, boolean r16, w2.b r17, o2.r r18, kotlin.jvm.functions.Function1 r19, i0.o1 r20, l1.f r21, long r22) {
        /*
            r12 = this;
            r0 = r12
            r1 = r19
            r0.f19152s = r1
            n1.f r1 = r0.f19155v
            r2 = r22
            r1.f(r2)
            i0.m1 r1 = r0.f19151r
            r2 = r20
            r1.f19055b = r2
            r2 = r21
            r1.f19056c = r2
            r1 = r13
            r0.f19143j = r1
            i0.z1 r1 = r0.f19134a
            vt.i0 r11 = vt.i0.f38321a
            r8 = 1
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 1
            j2.e r2 = r1.f19292a
            r3 = r14
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r14)
            if (r2 == 0) goto L6c
            j2.g0 r2 = r1.f19293b
            r4 = r15
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r15)
            if (r2 == 0) goto L69
            boolean r2 = r1.f19296e
            r7 = r16
            if (r2 != r7) goto L66
            int r2 = r1.f19297f
            boolean r2 = kp.j.N(r2, r8)
            if (r2 == 0) goto L66
            int r2 = r1.f19294c
            if (r2 != r5) goto L66
            int r2 = r1.f19295d
            if (r2 != r6) goto L66
            w2.b r2 = r1.f19298g
            r9 = r17
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r9)
            if (r2 == 0) goto L63
            java.util.List r2 = r1.f19300i
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r11)
            if (r2 == 0) goto L63
            o2.r r2 = r1.f19299h
            r10 = r18
            if (r2 == r10) goto L7c
            goto L6e
        L63:
            r10 = r18
            goto L6e
        L66:
            r9 = r17
            goto L63
        L69:
            r7 = r16
            goto L66
        L6c:
            r4 = r15
            goto L69
        L6e:
            i0.z1 r1 = new i0.z1
            r2 = r1
            r3 = r14
            r4 = r15
            r7 = r16
            r9 = r17
            r10 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L7c:
            i0.z1 r2 = r0.f19134a
            if (r2 == r1) goto L83
            r2 = 1
            r0.f19149p = r2
        L83:
            r0.f19134a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.q1.e(j2.e, j2.e, j2.g0, boolean, w2.b, o2.r, kotlin.jvm.functions.Function1, i0.o1, l1.f, long):void");
    }
}
