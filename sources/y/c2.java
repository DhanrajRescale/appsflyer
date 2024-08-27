package y;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class c2 extends c2.o implements c2.l1, c2.m, l1.m, v1.c {
    public final s A;
    public final a1 B;
    public final t1 C;

    /* renamed from: p, reason: collision with root package name */
    public d2 f40641p;

    /* renamed from: q, reason: collision with root package name */
    public g1 f40642q;

    /* renamed from: r, reason: collision with root package name */
    public x.a2 f40643r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f40644s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40645t;

    /* renamed from: u, reason: collision with root package name */
    public x0 f40646u;

    /* renamed from: v, reason: collision with root package name */
    public a0.l f40647v;

    /* renamed from: w, reason: collision with root package name */
    public final w1.d f40648w;

    /* renamed from: x, reason: collision with root package name */
    public final u f40649x;

    /* renamed from: y, reason: collision with root package name */
    public final j2 f40650y;

    /* renamed from: z, reason: collision with root package name */
    public final z1 f40651z;

    public c2(d2 d2Var, g1 g1Var, x.a2 a2Var, boolean z10, boolean z11, x0 x0Var, a0.l lVar, o oVar) {
        this.f40641p = d2Var;
        this.f40642q = g1Var;
        this.f40643r = a2Var;
        this.f40644s = z10;
        this.f40645t = z11;
        this.f40646u = x0Var;
        this.f40647v = lVar;
        w1.d dVar = new w1.d();
        this.f40648w = dVar;
        u uVar = new u(new w.b0(new v.s0(androidx.compose.foundation.gestures.a.f1242e)));
        this.f40649x = uVar;
        d2 d2Var2 = this.f40641p;
        g1 g1Var2 = this.f40642q;
        x.a2 a2Var2 = this.f40643r;
        boolean z12 = this.f40645t;
        x0 x0Var2 = this.f40646u;
        j2 j2Var = new j2(d2Var2, g1Var2, a2Var2, z12, x0Var2 == null ? uVar : x0Var2, dVar);
        this.f40650y = j2Var;
        z1 z1Var = new z1(j2Var, this.f40644s);
        this.f40651z = z1Var;
        s sVar = new s(this.f40642q, this.f40641p, this.f40645t, oVar);
        Q0(sVar);
        this.A = sVar;
        a1 a1Var = new a1(this.f40644s);
        Q0(a1Var);
        this.B = a1Var;
        b2.i iVar = w1.i.f38775a;
        Q0(new w1.g(z1Var, dVar));
        Q0(new g1.n());
        Q0(new f0.m(sVar));
        Q0(new x.d1(new t.g0(this, 6)));
        t1 t1Var = new t1(j2Var, this.f40642q, this.f40644s, dVar, this.f40647v);
        Q0(t1Var);
        this.C = t1Var;
    }

    @Override // l1.m
    public final void B0(l1.j jVar) {
        jVar.b(false);
    }

    @Override // g1.n
    public final void I0() {
        this.f40649x.f40965a = new w.b0(new v.s0((w2.b) c2.g.p(this, d2.s1.f13620e)));
        c2.g.w(this, new x.a(this, 6));
    }

    @Override // v1.c
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    @Override // c2.l1
    public final void j0() {
        this.f40649x.f40965a = new w.b0(new v.s0((w2.b) c2.g.p(this, d2.s1.f13620e)));
    }

    @Override // v1.c
    public final boolean z(KeyEvent keyEvent) {
        float f10;
        long g10;
        float f11;
        if (this.f40644s && ((v1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), v1.a.f37667l) || v1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), v1.a.f37666k)) && yk.j.S0(androidx.compose.ui.input.key.a.b(keyEvent), 2) && !keyEvent.isCtrlPressed())) {
            g1 g1Var = this.f40642q;
            g1 g1Var2 = g1.f40723a;
            s sVar = this.A;
            if (g1Var == g1Var2) {
                int i10 = (int) (sVar.f40931w & 4294967295L);
                if (v1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), v1.a.f37666k)) {
                    f11 = i10;
                } else {
                    f11 = -i10;
                }
                g10 = t0.t.g(s0.g.f34069a, f11);
            } else {
                int i11 = (int) (sVar.f40931w >> 32);
                if (v1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), v1.a.f37666k)) {
                    f10 = i11;
                } else {
                    f10 = -i11;
                }
                g10 = t0.t.g(f10, s0.g.f34069a);
            }
            yk.g.H(E0(), null, null, new b2(this.f40650y, g10, null), 3);
            return true;
        }
        return false;
    }
}
