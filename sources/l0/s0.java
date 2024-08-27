package l0;

import i0.a2;
import i0.q1;
import i0.s2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f23824b;

    public /* synthetic */ s0(v0 v0Var, int i10) {
        this.f23823a = i10;
        this.f23824b = v0Var;
    }

    @Override // i0.a2
    public final void a() {
    }

    @Override // i0.a2
    public final void b(long j10) {
        s2 d10;
        s2 d11;
        s2 d12;
        int i10 = this.f23823a;
        v0 v0Var = this.f23824b;
        switch (i10) {
            case 0:
                long j11 = v0Var.j(true);
                float f10 = e0.f23744a;
                long g10 = t0.t.g(m1.c.d(j11), m1.c.e(j11) - 1.0f);
                q1 q1Var = v0Var.f23839d;
                if (q1Var != null && (d10 = q1Var.d()) != null) {
                    long e10 = d10.e(g10);
                    v0Var.f23846k = e10;
                    v0Var.f23850o.setValue(new m1.c(e10));
                    v0Var.f23848m = m1.c.f27233b;
                    v0Var.f23849n.setValue(i0.z0.f19288a);
                    v0Var.r(false);
                    return;
                }
                return;
            default:
                if (((i0.z0) v0Var.f23849n.getValue()) == null) {
                    v0Var.f23849n.setValue(i0.z0.f19290c);
                    v0Var.f23851p = -1;
                    v0Var.l();
                    q1 q1Var2 = v0Var.f23839d;
                    if (q1Var2 != null && (d12 = q1Var2.d()) != null && d12.c(j10)) {
                        if (v0Var.k().f30522a.f20699a.length() != 0) {
                            v0Var.h(false);
                            v0Var.f23847l = Integer.valueOf((int) (v0.c(v0Var, p2.c0.a(v0Var.k(), null, j2.f0.f20710b, 5), j10, true, false, s.f23822d, true) >> 32));
                        } else {
                            return;
                        }
                    } else {
                        q1 q1Var3 = v0Var.f23839d;
                        if (q1Var3 != null && (d11 = q1Var3.d()) != null) {
                            int a10 = v0Var.f23837b.a(d11.b(j10, true));
                            p2.c0 e11 = v0.e(v0Var.k().f30522a, d2.w0.b(a10, a10));
                            v0Var.h(false);
                            v0Var.o(i0.a1.f18784c);
                            t1.a aVar = v0Var.f23843h;
                            if (aVar != null) {
                                ((t1.b) aVar).a();
                            }
                            v0Var.f23838c.invoke(e11);
                        }
                    }
                    v0Var.f23846k = j10;
                    v0Var.f23850o.setValue(new m1.c(j10));
                    v0Var.f23848m = m1.c.f27233b;
                    return;
                }
                return;
        }
    }

    @Override // i0.a2
    public final void c() {
        switch (this.f23823a) {
            case 0:
                v0 v0Var = this.f23824b;
                v0.b(v0Var, null);
                v0Var.f23850o.setValue(null);
                return;
            default:
                return;
        }
    }

    @Override // i0.a2
    public final void d() {
    }

    @Override // i0.a2
    public final void e(long j10) {
        s2 d10;
        t1.a aVar;
        s2 d11;
        int b10;
        int i10 = this.f23823a;
        v0 v0Var = this.f23824b;
        switch (i10) {
            case 0:
                v0Var.f23848m = m1.c.h(v0Var.f23848m, j10);
                q1 q1Var = v0Var.f23839d;
                if (q1Var != null && (d10 = q1Var.d()) != null) {
                    v0Var.f23850o.setValue(new m1.c(m1.c.h(v0Var.f23846k, v0Var.f23848m)));
                    p2.v vVar = v0Var.f23837b;
                    m1.c i11 = v0Var.i();
                    Intrinsics.c(i11);
                    int a10 = vVar.a(d10.b(i11.f27237a, true));
                    long b11 = d2.w0.b(a10, a10);
                    if (!j2.f0.a(b11, v0Var.k().f30523b)) {
                        q1 q1Var2 = v0Var.f23839d;
                        if ((q1Var2 == null || ((Boolean) q1Var2.f19150q.getValue()).booleanValue()) && (aVar = v0Var.f23843h) != null) {
                            ((t1.b) aVar).a();
                        }
                        v0Var.f23838c.invoke(v0.e(v0Var.k().f30522a, b11));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (v0Var.k().f30522a.f20699a.length() != 0) {
                    v0Var.f23848m = m1.c.h(v0Var.f23848m, j10);
                    q1 q1Var3 = v0Var.f23839d;
                    if (q1Var3 != null && (d11 = q1Var3.d()) != null) {
                        v0Var.f23850o.setValue(new m1.c(m1.c.h(v0Var.f23846k, v0Var.f23848m)));
                        Integer num = v0Var.f23847l;
                        i5.w wVar = s.f23822d;
                        if (num == null) {
                            m1.c i12 = v0Var.i();
                            Intrinsics.c(i12);
                            if (!d11.c(i12.f27237a)) {
                                int a11 = v0Var.f23837b.a(d11.b(v0Var.f23846k, true));
                                p2.v vVar2 = v0Var.f23837b;
                                m1.c i13 = v0Var.i();
                                Intrinsics.c(i13);
                                if (a11 == vVar2.a(d11.b(i13.f27237a, true))) {
                                    wVar = s.f23819a;
                                }
                                p2.c0 k10 = v0Var.k();
                                m1.c i14 = v0Var.i();
                                Intrinsics.c(i14);
                                v0.c(v0Var, k10, i14.f27237a, false, false, wVar, true);
                                int i15 = j2.f0.f20711c;
                            }
                        }
                        Integer num2 = v0Var.f23847l;
                        if (num2 != null) {
                            b10 = num2.intValue();
                        } else {
                            b10 = d11.b(v0Var.f23846k, false);
                        }
                        m1.c i16 = v0Var.i();
                        Intrinsics.c(i16);
                        int b12 = d11.b(i16.f27237a, false);
                        if (v0Var.f23847l != null || b10 != b12) {
                            p2.c0 k11 = v0Var.k();
                            m1.c i17 = v0Var.i();
                            Intrinsics.c(i17);
                            v0.c(v0Var, k11, i17.f27237a, false, false, wVar, true);
                            int i152 = j2.f0.f20711c;
                        } else {
                            return;
                        }
                    }
                    v0Var.r(false);
                    return;
                }
                return;
        }
    }

    @Override // i0.a2
    public final void onStop() {
        int i10 = this.f23823a;
        v0 v0Var = this.f23824b;
        switch (i10) {
            case 0:
                v0.b(v0Var, null);
                v0Var.f23850o.setValue(null);
                return;
            default:
                v0.b(v0Var, null);
                v0Var.f23850o.setValue(null);
                v0Var.r(true);
                v0Var.f23847l = null;
                return;
        }
    }
}
