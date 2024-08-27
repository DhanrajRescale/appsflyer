package r1;

import t0.l1;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class j0 extends q1.b {

    /* renamed from: e, reason: collision with root package name */
    public final n1 f32954e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f32955f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f32956g;

    /* renamed from: h, reason: collision with root package name */
    public final l1 f32957h;

    /* renamed from: i, reason: collision with root package name */
    public float f32958i;

    /* renamed from: j, reason: collision with root package name */
    public n1.u f32959j;

    /* renamed from: k, reason: collision with root package name */
    public int f32960k;

    public j0(c cVar) {
        m1.f fVar = new m1.f(m1.f.f27251b);
        o3 o3Var = o3.f35116a;
        this.f32954e = t0.t.n0(fVar, o3Var);
        this.f32955f = t0.t.n0(Boolean.FALSE, o3Var);
        e0 e0Var = new e0(cVar);
        e0Var.f32891f = new x.a(this, 23);
        this.f32956g = e0Var;
        this.f32957h = al.d.D0(0);
        this.f32958i = 1.0f;
        this.f32960k = -1;
    }

    @Override // q1.b
    public final void c(float f10) {
        this.f32958i = f10;
    }

    @Override // q1.b
    public final void e(n1.u uVar) {
        this.f32959j = uVar;
    }

    @Override // q1.b
    public final long h() {
        return ((m1.f) this.f32954e.getValue()).f27254a;
    }

    @Override // q1.b
    public final void i(p1.h hVar) {
        n1.u uVar = this.f32959j;
        e0 e0Var = this.f32956g;
        if (uVar == null) {
            uVar = (n1.u) e0Var.f32892g.getValue();
        }
        if (((Boolean) this.f32955f.getValue()).booleanValue() && hVar.getLayoutDirection() == w2.k.f38800b) {
            long p02 = hVar.p0();
            p1.b f02 = hVar.f0();
            long b10 = f02.b();
            f02.a().h();
            f02.f30498a.c(-1.0f, 1.0f, p02);
            e0Var.e(hVar, this.f32958i, uVar);
            f02.a().s();
            f02.c(b10);
        } else {
            e0Var.e(hVar, this.f32958i, uVar);
        }
        this.f32960k = this.f32957h.i();
    }
}
