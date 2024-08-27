package r0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f32716a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f32717b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f32718c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f32719d;

    /* renamed from: e, reason: collision with root package name */
    public final q f32720e;

    /* renamed from: f, reason: collision with root package name */
    public final t0.n1 f32721f;

    /* renamed from: g, reason: collision with root package name */
    public final t0.j0 f32722g;

    /* renamed from: h, reason: collision with root package name */
    public final t0.j0 f32723h;

    /* renamed from: i, reason: collision with root package name */
    public final t0.k1 f32724i;

    /* renamed from: j, reason: collision with root package name */
    public final t0.k1 f32725j;

    /* renamed from: k, reason: collision with root package name */
    public final t0.n1 f32726k;

    /* renamed from: l, reason: collision with root package name */
    public final t0.n1 f32727l;

    /* renamed from: m, reason: collision with root package name */
    public final p f32728m;

    public t(Object obj, o1 o1Var, p1 p1Var, Function1 function1) {
        w.f1 f1Var = b.f32328a;
        this.f32716a = o1Var;
        this.f32717b = p1Var;
        this.f32718c = function1;
        this.f32719d = new e1();
        this.f32720e = new q(this);
        t0.o3 o3Var = t0.o3.f35116a;
        this.f32721f = t0.t.n0(obj, o3Var);
        this.f32722g = t0.t.N(new r(this, 4));
        this.f32723h = t0.t.N(new r(this, 3));
        this.f32724i = dp.b.y1(Float.NaN);
        t0.t.O(o3Var, new r(this, 0));
        this.f32725j = dp.b.y1(s0.g.f34069a);
        this.f32726k = t0.t.n0(null, o3Var);
        this.f32727l = t0.t.n0(new f1(vt.p0.d()), o3Var);
        this.f32728m = new p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, x.s1 r8, r0.d r9, yt.a r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof r0.m
            if (r0 == 0) goto L13
            r0 = r10
            r0.m r0 = (r0.m) r0
            int r1 = r0.f32572d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32572d = r1
            goto L18
        L13:
            r0.m r0 = new r0.m
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f32570b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f32572d
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            r0.t r7 = r0.f32569a
            ut.n.b(r10)     // Catch: java.lang.Throwable -> L2c
            goto L61
        L2c:
            r8 = move-exception
            goto La3
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ut.n.b(r10)
            r0.f1 r10 = r6.d()
            java.util.Map r10 = r10.f32396a
            boolean r10 = r10.containsKey(r7)
            if (r10 == 0) goto Ldd
            r0.e1 r10 = r6.f32719d     // Catch: java.lang.Throwable -> La1
            r0.o r2 = new r0.o     // Catch: java.lang.Throwable -> La1
            r2.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> La1
            r0.f32569a = r6     // Catch: java.lang.Throwable -> La1
            r0.f32572d = r5     // Catch: java.lang.Throwable -> La1
            r10.getClass()     // Catch: java.lang.Throwable -> L9d
            r0.d1 r7 = new r0.d1     // Catch: java.lang.Throwable -> L9d
            r7.<init>(r8, r10, r2, r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = hl.f.P(r7, r0)     // Catch: java.lang.Throwable -> L9d
            if (r7 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r7.i(r3)
            r0.f1 r8 = r7.d()
            t0.k1 r9 = r7.f32724i
            float r10 = r9.i()
            java.lang.Object r8 = r8.a(r10)
            if (r8 == 0) goto Le0
            float r9 = r9.i()
            r0.f1 r10 = r7.d()
            float r10 = r10.c(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto Le0
            kotlin.jvm.functions.Function1 r9 = r7.f32718c
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Le0
            r7.h(r8)
            goto Le0
        L9b:
            r8 = r7
            goto L9f
        L9d:
            r7 = move-exception
            goto L9b
        L9f:
            r7 = r6
            goto La3
        La1:
            r8 = move-exception
            goto L9f
        La3:
            r7.i(r3)
            r0.f1 r9 = r7.d()
            t0.k1 r10 = r7.f32724i
            float r0 = r10.i()
            java.lang.Object r9 = r9.a(r0)
            if (r9 == 0) goto Ldc
            float r10 = r10.i()
            r0.f1 r0 = r7.d()
            float r0 = r0.c(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Ldc
            kotlin.jvm.functions.Function1 r10 = r7.f32718c
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Ldc
            r7.h(r9)
        Ldc:
            throw r8
        Ldd:
            r6.h(r7)
        Le0:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.t.a(java.lang.Object, x.s1, r0.d, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(x.s1 r7, m0.t r8, yt.a r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof r0.j
            if (r0 == 0) goto L13
            r0 = r9
            r0.j r0 = (r0.j) r0
            int r1 = r0.f32464d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32464d = r1
            goto L18
        L13:
            r0.j r0 = new r0.j
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f32462b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f32464d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            r0.t r7 = r0.f32461a
            ut.n.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r8 = move-exception
            goto L95
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ut.n.b(r9)
            r0.e1 r9 = r6.f32719d     // Catch: java.lang.Throwable -> L93
            r0.l r2 = new r0.l     // Catch: java.lang.Throwable -> L93
            r5 = 0
            r2.<init>(r6, r5, r8)     // Catch: java.lang.Throwable -> L93
            r0.f32461a = r6     // Catch: java.lang.Throwable -> L93
            r0.f32464d = r4     // Catch: java.lang.Throwable -> L93
            r9.getClass()     // Catch: java.lang.Throwable -> L8f
            r0.d1 r8 = new r0.d1     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r7, r9, r2, r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r7 = hl.f.P(r8, r0)     // Catch: java.lang.Throwable -> L8f
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = r6
        L54:
            r0.f1 r8 = r7.d()
            t0.k1 r9 = r7.f32724i
            float r0 = r9.i()
            java.lang.Object r8 = r8.a(r0)
            if (r8 == 0) goto L8a
            float r9 = r9.i()
            r0.f1 r0 = r7.d()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L8a
            kotlin.jvm.functions.Function1 r9 = r7.f32718c
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            r7.h(r8)
        L8a:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        L8d:
            r8 = r7
            goto L91
        L8f:
            r7 = move-exception
            goto L8d
        L91:
            r7 = r6
            goto L95
        L93:
            r8 = move-exception
            goto L91
        L95:
            r0.f1 r9 = r7.d()
            t0.k1 r0 = r7.f32724i
            float r1 = r0.i()
            java.lang.Object r9 = r9.a(r1)
            if (r9 == 0) goto Lcb
            float r0 = r0.i()
            r0.f1 r1 = r7.d()
            float r1 = r1.c(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lcb
            kotlin.jvm.functions.Function1 r0 = r7.f32718c
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcb
            r7.h(r9)
        Lcb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.t.b(x.s1, m0.t, yt.a):java.lang.Object");
    }

    public final Object c(float f10, float f11, Object obj) {
        Object b10;
        f1 d10 = d();
        float c10 = d10.c(obj);
        float floatValue = ((Number) this.f32717b.mo2invoke()).floatValue();
        if (c10 != f10 && !Float.isNaN(c10)) {
            Function1 function1 = this.f32716a;
            if (c10 < f10) {
                if (f11 >= floatValue) {
                    Object b11 = d10.b(f10, true);
                    Intrinsics.c(b11);
                    return b11;
                }
                b10 = d10.b(f10, true);
                Intrinsics.c(b10);
                if (f10 < Math.abs(Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(d10.c(b10) - c10)))).floatValue()) + c10)) {
                    return obj;
                }
            } else {
                if (f11 <= (-floatValue)) {
                    Object b12 = d10.b(f10, false);
                    Intrinsics.c(b12);
                    return b12;
                }
                b10 = d10.b(f10, false);
                Intrinsics.c(b10);
                float abs = Math.abs(c10 - Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(c10 - d10.c(b10))))).floatValue()));
                if (f10 < s0.g.f34069a) {
                    if (Math.abs(f10) < abs) {
                        return obj;
                    }
                } else if (f10 > abs) {
                    return obj;
                }
            }
            return b10;
        }
        return obj;
    }

    public final f1 d() {
        return (f1) this.f32727l.getValue();
    }

    public final float e() {
        return this.f32724i.i();
    }

    public final float f(float f10) {
        float i10;
        float f11;
        t0.k1 k1Var = this.f32724i;
        if (Float.isNaN(k1Var.i())) {
            i10 = s0.g.f34069a;
        } else {
            i10 = k1Var.i();
        }
        float f12 = i10 + f10;
        Float G = vt.g0.G(d().f32396a.values());
        float f13 = Float.NaN;
        if (G != null) {
            f11 = G.floatValue();
        } else {
            f11 = Float.NaN;
        }
        Float F = vt.g0.F(d().f32396a.values());
        if (F != null) {
            f13 = F.floatValue();
        }
        return kotlin.ranges.d.e(f12, f11, f13);
    }

    public final float g() {
        if (!Float.isNaN(e())) {
            return e();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void h(Object obj) {
        this.f32721f.setValue(obj);
    }

    public final void i(Object obj) {
        this.f32726k.setValue(obj);
    }
}
