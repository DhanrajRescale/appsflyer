package w;

import kotlin.jvm.internal.Intrinsics;
import t0.l3;
import t0.o3;
import t0.v2;

/* loaded from: classes.dex */
public final class q1 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f38647a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f38648b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.n1 f38649c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f38650d;

    /* renamed from: e, reason: collision with root package name */
    public final t0.n1 f38651e;

    /* renamed from: f, reason: collision with root package name */
    public final t0.n1 f38652f;

    /* renamed from: g, reason: collision with root package name */
    public final t0.m1 f38653g;

    /* renamed from: h, reason: collision with root package name */
    public final t0.n1 f38654h;

    /* renamed from: i, reason: collision with root package name */
    public final t0.n1 f38655i;

    /* renamed from: j, reason: collision with root package name */
    public t f38656j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f38657k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f38658l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u1 f38659m;

    public q1(u1 u1Var, Object obj, t tVar, y1 y1Var) {
        this.f38659m = u1Var;
        this.f38647a = y1Var;
        o3 o3Var = o3.f35116a;
        t0.n1 n0 = t0.t.n0(obj, o3Var);
        this.f38648b = n0;
        Object obj2 = null;
        this.f38649c = t0.t.n0(e.v(s0.g.f34069a, null, 7), o3Var);
        this.f38650d = t0.t.n0(new m1(d(), y1Var, obj, n0.getValue(), tVar), o3Var);
        this.f38651e = t0.t.n0(null, o3Var);
        this.f38652f = t0.t.n0(Boolean.TRUE, o3Var);
        int i10 = t0.c.f34957b;
        this.f38653g = new t0.m1(0L);
        this.f38654h = t0.t.n0(Boolean.FALSE, o3Var);
        this.f38655i = t0.t.n0(obj, o3Var);
        this.f38656j = tVar;
        Float f10 = (Float) l2.f38595a.get(y1Var);
        if (f10 != null) {
            float floatValue = f10.floatValue();
            t tVar2 = (t) y1Var.f38734a.invoke(obj);
            int b10 = tVar2.b();
            for (int i11 = 0; i11 < b10; i11++) {
                tVar2.e(i11, floatValue);
            }
            obj2 = this.f38647a.f38735b.invoke(tVar2);
        }
        this.f38658l = e.v(s0.g.f34069a, obj2, 3);
    }

    public static void f(q1 q1Var, Object obj, boolean z10, int i10) {
        f0 d10;
        if ((i10 & 1) != 0) {
            obj = q1Var.f38655i.getValue();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        t0.n1 n1Var = q1Var.f38648b;
        boolean a10 = Intrinsics.a(null, n1Var.getValue());
        t0.n1 n1Var2 = q1Var.f38650d;
        if (a10) {
            f1 f1Var = q1Var.f38658l;
            y1 y1Var = q1Var.f38647a;
            t c10 = q1Var.f38656j.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            n1Var2.setValue(new m1(f1Var, y1Var, obj, obj, c10));
            return;
        }
        if (z10 && !q1Var.f38657k) {
            if (q1Var.d() instanceof f1) {
                d10 = q1Var.d();
            } else {
                d10 = q1Var.f38658l;
            }
        } else {
            d10 = q1Var.d();
        }
        n1Var2.setValue(new m1(d10, q1Var.f38647a, obj, n1Var.getValue(), q1Var.f38656j));
        u1 u1Var = q1Var.f38659m;
        u1Var.f38693g.setValue(Boolean.TRUE);
        if (u1Var.f()) {
            e1.s sVar = u1Var.f38694h;
            int size = sVar.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                q1 q1Var2 = (q1) sVar.get(i11);
                j10 = Math.max(j10, q1Var2.b().b());
                q1Var2.e(u1Var.f38697k);
            }
            u1Var.f38693g.setValue(Boolean.FALSE);
        }
    }

    public final m1 b() {
        return (m1) this.f38650d.getValue();
    }

    public final f0 d() {
        return (f0) this.f38649c.getValue();
    }

    public final void e(long j10) {
        if (((Boolean) this.f38654h.getValue()).booleanValue()) {
            return;
        }
        this.f38657k = true;
        boolean a10 = Intrinsics.a(b().f38609c, b().f38610d);
        t0.n1 n1Var = this.f38655i;
        if (a10) {
            n1Var.setValue(b().f38609c);
        } else {
            n1Var.setValue(b().f(j10));
            this.f38656j = b().d(j10);
        }
    }

    public final void g(Object obj, Object obj2, f0 f0Var) {
        this.f38648b.setValue(obj2);
        this.f38649c.setValue(f0Var);
        if (Intrinsics.a(b().f38610d, obj) && Intrinsics.a(b().f38609c, obj2)) {
            return;
        }
        f(this, obj, false, 2);
    }

    @Override // t0.l3
    public final Object getValue() {
        return this.f38655i.getValue();
    }

    public final void h(Object obj, f0 f0Var) {
        t0.n1 n1Var = this.f38648b;
        boolean a10 = Intrinsics.a(n1Var.getValue(), obj);
        t0.n1 n1Var2 = this.f38654h;
        if (!a10 || ((Boolean) n1Var2.getValue()).booleanValue()) {
            n1Var.setValue(obj);
            this.f38649c.setValue(f0Var);
            t0.n1 n1Var3 = this.f38652f;
            f(this, null, !((Boolean) n1Var3.getValue()).booleanValue(), 1);
            Boolean bool = Boolean.FALSE;
            n1Var3.setValue(bool);
            t0.m1 m1Var = this.f38659m.f38691e;
            this.f38653g.i(((v2) e1.p.r(m1Var.f35229b, m1Var)).f35223c);
            n1Var2.setValue(bool);
        }
    }

    public final String toString() {
        return "current value: " + this.f38655i.getValue() + ", target: " + this.f38648b.getValue() + ", spec: " + d();
    }
}
