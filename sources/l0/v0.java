package l0;

import android.view.ActionMode;
import d2.d1;
import d2.e3;
import i0.b3;
import i0.l1;
import i0.q1;
import i0.s2;
import i0.z1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final b3 f23836a;

    /* renamed from: b, reason: collision with root package name */
    public p2.v f23837b = l1.f19042c;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f23838c = h0.f23761d;

    /* renamed from: d, reason: collision with root package name */
    public q1 f23839d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f23840e;

    /* renamed from: f, reason: collision with root package name */
    public d2.q1 f23841f;

    /* renamed from: g, reason: collision with root package name */
    public e3 f23842g;

    /* renamed from: h, reason: collision with root package name */
    public t1.a f23843h;

    /* renamed from: i, reason: collision with root package name */
    public l1.o f23844i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f23845j;

    /* renamed from: k, reason: collision with root package name */
    public long f23846k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f23847l;

    /* renamed from: m, reason: collision with root package name */
    public long f23848m;

    /* renamed from: n, reason: collision with root package name */
    public final n1 f23849n;

    /* renamed from: o, reason: collision with root package name */
    public final n1 f23850o;

    /* renamed from: p, reason: collision with root package name */
    public int f23851p;

    /* renamed from: q, reason: collision with root package name */
    public p2.c0 f23852q;

    /* renamed from: r, reason: collision with root package name */
    public q0 f23853r;

    /* renamed from: s, reason: collision with root package name */
    public final s0 f23854s;

    /* renamed from: t, reason: collision with root package name */
    public final u0 f23855t;

    public v0(b3 b3Var) {
        this.f23836a = b3Var;
        p2.c0 c0Var = new p2.c0((String) null, 0L, 7);
        o3 o3Var = o3.f35116a;
        this.f23840e = t0.t.n0(c0Var, o3Var);
        this.f23845j = t0.t.n0(Boolean.TRUE, o3Var);
        long j10 = m1.c.f27233b;
        this.f23846k = j10;
        this.f23848m = j10;
        this.f23849n = t0.t.n0(null, o3Var);
        this.f23850o = t0.t.n0(null, o3Var);
        this.f23851p = -1;
        this.f23852q = new p2.c0((String) null, 0L, 7);
        this.f23854s = new s0(this, 1);
        this.f23855t = new u0(this);
    }

    public static final void a(v0 v0Var, m1.c cVar) {
        v0Var.f23850o.setValue(cVar);
    }

    public static final void b(v0 v0Var, i0.z0 z0Var) {
        v0Var.f23849n.setValue(z0Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v1 l0.q0, still in use, count: 2, list:
          (r10v1 l0.q0) from 0x008c: MOVE (r20v0 l0.q0) = (r10v1 l0.q0) (LINE:141)
          (r10v1 l0.q0) from 0x0067: MOVE (r20v2 l0.q0) = (r10v1 l0.q0) (LINE:104)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final long c(l0.v0 r21, p2.c0 r22, long r23, boolean r25, boolean r26, l0.t r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.v0.c(l0.v0, p2.c0, long, boolean, boolean, l0.t, boolean):long");
    }

    public static p2.c0 e(j2.e eVar, long j10) {
        return new p2.c0(eVar, j10, (j2.f0) null);
    }

    public final void d(boolean z10) {
        if (j2.f0.b(k().f30523b)) {
            return;
        }
        d2.q1 q1Var = this.f23841f;
        if (q1Var != null) {
            ((d2.l) q1Var).a(d2.w0.p(k()));
        }
        if (!z10) {
            return;
        }
        int d10 = j2.f0.d(k().f30523b);
        this.f23838c.invoke(e(k().f30522a, d2.w0.b(d10, d10)));
        o(i0.a1.f18782a);
    }

    public final void f() {
        if (j2.f0.b(k().f30523b)) {
            return;
        }
        d2.q1 q1Var = this.f23841f;
        if (q1Var != null) {
            ((d2.l) q1Var).a(d2.w0.p(k()));
        }
        j2.e r10 = d2.w0.r(k(), k().f30522a.f20699a.length());
        j2.e q10 = d2.w0.q(k(), k().f30522a.f20699a.length());
        j2.c cVar = new j2.c(r10);
        cVar.b(q10);
        j2.e i10 = cVar.i();
        int e10 = j2.f0.e(k().f30523b);
        this.f23838c.invoke(e(i10, d2.w0.b(e10, e10)));
        o(i0.a1.f18782a);
        b3 b3Var = this.f23836a;
        if (b3Var != null) {
            b3Var.f18805f = true;
        }
    }

    public final void g(m1.c cVar) {
        i0.a1 a1Var;
        s2 s2Var;
        int d10;
        if (!j2.f0.b(k().f30523b)) {
            q1 q1Var = this.f23839d;
            if (q1Var != null) {
                s2Var = q1Var.d();
            } else {
                s2Var = null;
            }
            if (cVar != null && s2Var != null) {
                d10 = this.f23837b.a(s2Var.b(cVar.f27237a, true));
            } else {
                d10 = j2.f0.d(k().f30523b);
            }
            this.f23838c.invoke(p2.c0.a(k(), null, d2.w0.b(d10, d10), 5));
        }
        if (cVar != null && k().f30522a.f20699a.length() > 0) {
            a1Var = i0.a1.f18784c;
        } else {
            a1Var = i0.a1.f18782a;
        }
        o(a1Var);
        r(false);
    }

    public final void h(boolean z10) {
        l1.o oVar;
        q1 q1Var = this.f23839d;
        if (q1Var != null && !q1Var.b() && (oVar = this.f23844i) != null) {
            oVar.a(l1.h.f23896e);
        }
        this.f23852q = k();
        r(z10);
        o(i0.a1.f18783b);
    }

    public final m1.c i() {
        return (m1.c) this.f23850o.getValue();
    }

    public final long j(boolean z10) {
        s2 d10;
        j2.e0 e0Var;
        j2.e eVar;
        long j10;
        int max;
        boolean z11;
        int a02;
        float h10;
        z1 z1Var;
        q1 q1Var = this.f23839d;
        if (q1Var != null && (d10 = q1Var.d()) != null && (e0Var = d10.f19194a) != null) {
            q1 q1Var2 = this.f23839d;
            if (q1Var2 != null && (z1Var = q1Var2.f19134a) != null) {
                eVar = z1Var.f19292a;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return m1.c.f27235d;
            }
            if (!Intrinsics.a(eVar.f20699a, e0Var.f20703a.f20689a.f20699a)) {
                return m1.c.f27235d;
            }
            p2.c0 k10 = k();
            if (z10) {
                long j11 = k10.f30523b;
                int i10 = j2.f0.f20711c;
                j10 = j11 >> 32;
            } else {
                long j12 = k10.f30523b;
                int i11 = j2.f0.f20711c;
                j10 = j12 & 4294967295L;
            }
            int b10 = this.f23837b.b((int) j10);
            boolean f10 = j2.f0.f(k().f30523b);
            int f11 = e0Var.f(b10);
            j2.l lVar = e0Var.f20704b;
            if (f11 >= lVar.f20735f) {
                return m1.c.f27235d;
            }
            if ((z10 && !f10) || (!z10 && f10)) {
                max = b10;
            } else {
                max = Math.max(b10 - 1, 0);
            }
            if (e0Var.a(max) == e0Var.m(b10)) {
                z11 = true;
            } else {
                z11 = false;
            }
            lVar.e(b10);
            int length = lVar.f20730a.f20740a.f20699a.length();
            ArrayList arrayList = lVar.f20737h;
            if (b10 == length) {
                a02 = vt.y.f(arrayList);
            } else {
                a02 = hl.f.a0(b10, arrayList);
            }
            j2.p pVar = (j2.p) arrayList.get(a02);
            j2.o oVar = pVar.f20745a;
            int a10 = pVar.a(b10);
            k2.t tVar = ((j2.a) oVar).f20630d;
            if (z11) {
                h10 = tVar.g(a10, false);
            } else {
                h10 = tVar.h(a10, false);
            }
            return t0.t.g(h10, e0Var.d(f11));
        }
        return m1.c.f27235d;
    }

    public final p2.c0 k() {
        return (p2.c0) this.f23840e.getValue();
    }

    public final void l() {
        e3 e3Var = this.f23842g;
        if (e3Var != null && ((d1) e3Var).f13404d == 1 && e3Var != null) {
            d1 d1Var = (d1) e3Var;
            d1Var.f13404d = 2;
            ActionMode actionMode = d1Var.f13402b;
            if (actionMode != null) {
                actionMode.finish();
            }
            d1Var.f13402b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0118, code lost:
    
        if (r2 == 2) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.v0.m():void");
    }

    public final void n(boolean z10) {
        this.f23845j.setValue(Boolean.valueOf(z10));
    }

    public final void o(i0.a1 a1Var) {
        q1 q1Var = this.f23839d;
        if (q1Var != null) {
            if (q1Var.a() == a1Var) {
                q1Var = null;
            }
            if (q1Var != null) {
                q1Var.f19144k.setValue(a1Var);
            }
        }
    }

    public final void p(p2.c0 c0Var) {
        this.f23840e.setValue(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.v0.q():void");
    }

    public final void r(boolean z10) {
        q1 q1Var = this.f23839d;
        if (q1Var != null) {
            q1Var.f19145l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            q();
        } else {
            l();
        }
    }
}
