package w;

import kotlin.jvm.internal.Intrinsics;
import t0.o3;
import t0.v2;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f38687a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38688b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.n1 f38689c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f38690d;

    /* renamed from: e, reason: collision with root package name */
    public final t0.m1 f38691e;

    /* renamed from: f, reason: collision with root package name */
    public final t0.m1 f38692f;

    /* renamed from: g, reason: collision with root package name */
    public final t0.n1 f38693g;

    /* renamed from: h, reason: collision with root package name */
    public final e1.s f38694h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.s f38695i;

    /* renamed from: j, reason: collision with root package name */
    public final t0.n1 f38696j;

    /* renamed from: k, reason: collision with root package name */
    public long f38697k;

    public u1(w1 w1Var, String str) {
        this.f38687a = w1Var;
        this.f38688b = str;
        Object c10 = c();
        o3 o3Var = o3.f35116a;
        this.f38689c = t0.t.n0(c10, o3Var);
        this.f38690d = t0.t.n0(new p1(c(), c()), o3Var);
        int i10 = t0.c.f34957b;
        this.f38691e = new t0.m1(0L);
        this.f38692f = new t0.m1(Long.MIN_VALUE);
        this.f38693g = t0.t.n0(Boolean.TRUE, o3Var);
        this.f38694h = new e1.s();
        this.f38695i = new e1.s();
        this.f38696j = t0.t.n0(Boolean.FALSE, o3Var);
        t0.t.N(new v.i(this, 1));
        w1Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (((java.lang.Boolean) r9.f38693g.getValue()).booleanValue() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r10, t0.n r11, int r12) {
        /*
            r9 = this;
            t0.r r11 = (t0.r) r11
            r0 = -1493585151(0xffffffffa6f9b301, float:-1.7326365E-15)
            r11.c0(r0)
            r0 = r12 & 6
            if (r0 != 0) goto L20
            r0 = r12 & 8
            if (r0 != 0) goto L15
            boolean r0 = r11.h(r10)
            goto L19
        L15:
            boolean r0 = r11.j(r10)
        L19:
            if (r0 == 0) goto L1d
            r0 = 4
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r0 = r0 | r12
            goto L21
        L20:
            r0 = r12
        L21:
            r1 = r12 & 48
            r2 = 32
            if (r1 != 0) goto L32
            boolean r1 = r11.h(r9)
            if (r1 == 0) goto L2f
            r1 = r2
            goto L31
        L2f:
            r1 = 16
        L31:
            r0 = r0 | r1
        L32:
            r1 = r0 & 19
            r3 = 18
            r4 = 0
            if (r1 != r3) goto L44
            boolean r1 = r11.G()
            if (r1 != 0) goto L40
            goto L44
        L40:
            r11.V()
            goto La0
        L44:
            boolean r1 = r9.f()
            if (r1 != 0) goto La0
            r9.k(r10)
            java.lang.Object r1 = r9.c()
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r10, r1)
            if (r1 == 0) goto L78
            t0.m1 r1 = r9.f38692f
            t0.v2 r3 = r1.f35229b
            e1.a0 r1 = e1.p.r(r3, r1)
            t0.v2 r1 = (t0.v2) r1
            long r5 = r1.f35223c
            r7 = -9223372036854775808
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L6a
            goto L78
        L6a:
            t0.n1 r1 = r9.f38693g
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La0
        L78:
            r1 = -1097561430(0xffffffffbe948aaa, float:-0.29012042)
            r11.b0(r1)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r2) goto L84
            r0 = 1
            goto L85
        L84:
            r0 = r4
        L85:
            java.lang.Object r1 = r11.Q()
            if (r0 != 0) goto L8f
            to.e r0 = t0.m.f35080a
            if (r1 != r0) goto L98
        L8f:
            w.s1 r1 = new w.s1
            r0 = 0
            r1.<init>(r9, r0)
            r11.k0(r1)
        L98:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r11.s(r4)
            t0.t.e(r9, r1, r11)
        La0:
            t0.x1 r11 = r11.w()
            if (r11 == 0) goto Lad
            w.t1 r0 = new w.t1
            r0.<init>(r9, r10, r12, r4)
            r11.f35245d = r0
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.u1.a(java.lang.Object, t0.n, int):void");
    }

    public final long b() {
        e1.s sVar = this.f38694h;
        int size = sVar.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = Math.max(j10, ((q1) sVar.get(i10)).b().b());
        }
        e1.s sVar2 = this.f38695i;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            j10 = Math.max(j10, ((u1) sVar2.get(i11)).b());
        }
        return j10;
    }

    public final Object c() {
        return ((y0) this.f38687a).f38732b.getValue();
    }

    public final boolean d() {
        e1.s sVar = this.f38694h;
        int size = sVar.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((d) ((q1) sVar.get(i10)).f38651e.getValue()) != null) {
                    break;
                }
                i10++;
            } else {
                e1.s sVar2 = this.f38695i;
                int size2 = sVar2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (!((u1) sVar2.get(i11)).d()) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final p1 e() {
        return (p1) this.f38690d.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.f38696j.getValue()).booleanValue();
    }

    public final void g(long j10, float f10) {
        int i10;
        long b10;
        t0.m1 m1Var = this.f38692f;
        if (((v2) e1.p.r(m1Var.f35229b, m1Var)).f35223c == Long.MIN_VALUE) {
            m1Var.i(j10);
            this.f38687a.f38723a.setValue(Boolean.TRUE);
        }
        this.f38693g.setValue(Boolean.FALSE);
        long j11 = j10 - ((v2) e1.p.r(m1Var.f35229b, m1Var)).f35223c;
        t0.m1 m1Var2 = this.f38691e;
        m1Var2.i(j11);
        e1.s sVar = this.f38694h;
        int size = sVar.size();
        boolean z10 = true;
        for (int i11 = 0; i11 < size; i11 = i10 + 1) {
            q1 q1Var = (q1) sVar.get(i11);
            boolean booleanValue = ((Boolean) q1Var.f38652f.getValue()).booleanValue();
            t0.n1 n1Var = q1Var.f38652f;
            if (!booleanValue) {
                long j12 = ((v2) e1.p.r(m1Var2.f35229b, m1Var2)).f35223c;
                t0.m1 m1Var3 = q1Var.f38653g;
                if (f10 > s0.g.f34069a) {
                    i10 = i11;
                    float f11 = ((float) (j12 - ((v2) e1.p.r(m1Var3.f35229b, m1Var3)).f35223c)) / f10;
                    if (!(!Float.isNaN(f11))) {
                        throw new IllegalStateException("Duration scale adjusted time is NaN. Duration scale: " + f10 + ",playTimeNanos: " + j12 + ", offsetTimeNanos: " + ((v2) e1.p.r(m1Var3.f35229b, m1Var3)).f35223c);
                    }
                    b10 = f11;
                } else {
                    i10 = i11;
                    b10 = q1Var.b().b();
                }
                q1Var.f38655i.setValue(q1Var.b().f(b10));
                q1Var.f38656j = q1Var.b().d(b10);
                if (q1Var.b().e(b10)) {
                    n1Var.setValue(Boolean.TRUE);
                    m1Var3.i(0L);
                }
            } else {
                i10 = i11;
            }
            if (!((Boolean) n1Var.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        e1.s sVar2 = this.f38695i;
        int size2 = sVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            u1 u1Var = (u1) sVar2.get(i12);
            if (!Intrinsics.a(u1Var.f38689c.getValue(), u1Var.c())) {
                u1Var.g(((v2) e1.p.r(m1Var2.f35229b, m1Var2)).f35223c, f10);
            }
            if (!Intrinsics.a(u1Var.f38689c.getValue(), u1Var.c())) {
                z10 = false;
            }
        }
        if (z10) {
            h();
        }
    }

    public final void h() {
        this.f38692f.i(Long.MIN_VALUE);
        w1 w1Var = this.f38687a;
        if (w1Var instanceof y0) {
            ((y0) w1Var).f38732b.setValue(this.f38689c.getValue());
        }
        this.f38691e.i(0L);
        w1Var.f38723a.setValue(Boolean.FALSE);
    }

    public final void i() {
        e1.s sVar = this.f38694h;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q1) sVar.get(i10)).f38654h.setValue(Boolean.TRUE);
        }
        e1.s sVar2 = this.f38695i;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((u1) sVar2.get(i11)).i();
        }
    }

    public final void j(Object obj, long j10, Object obj2) {
        this.f38692f.i(Long.MIN_VALUE);
        w1 w1Var = this.f38687a;
        w1Var.f38723a.setValue(Boolean.FALSE);
        boolean f10 = f();
        t0.n1 n1Var = this.f38689c;
        if (!f10 || !Intrinsics.a(c(), obj) || !Intrinsics.a(n1Var.getValue(), obj2)) {
            if (!Intrinsics.a(c(), obj) && (w1Var instanceof y0)) {
                ((y0) w1Var).f38732b.setValue(obj);
            }
            n1Var.setValue(obj2);
            this.f38696j.setValue(Boolean.TRUE);
            this.f38690d.setValue(new p1(obj, obj2));
        }
        e1.s sVar = this.f38695i;
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            u1 u1Var = (u1) sVar.get(i10);
            Intrinsics.d(u1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (u1Var.f()) {
                u1Var.j(u1Var.c(), j10, u1Var.f38689c.getValue());
            }
        }
        e1.s sVar2 = this.f38694h;
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q1) sVar2.get(i11)).e(j10);
        }
        this.f38697k = j10;
    }

    public final void k(Object obj) {
        t0.n1 n1Var = this.f38689c;
        if (!Intrinsics.a(n1Var.getValue(), obj)) {
            this.f38690d.setValue(new p1(n1Var.getValue(), obj));
            if (!Intrinsics.a(c(), n1Var.getValue())) {
                ((y0) this.f38687a).f38732b.setValue(n1Var.getValue());
            }
            n1Var.setValue(obj);
            t0.m1 m1Var = this.f38692f;
            if (((v2) e1.p.r(m1Var.f35229b, m1Var)).f35223c == Long.MIN_VALUE) {
                this.f38693g.setValue(Boolean.TRUE);
            }
            i();
        }
    }

    public final String toString() {
        e1.s sVar = this.f38694h;
        int size = sVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((q1) sVar.get(i10)) + ", ";
        }
        return str;
    }
}
