package i0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import d2.g3;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.o3;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f19244a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f19245b = t0.t.n0(null, o3.f35116a);

    public w2(j2.e eVar) {
        this.f19244a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [t0.r, t0.n] */
    /* JADX WARN: Type inference failed for: r4v10, types: [g1.o] */
    public final void a(t0.n nVar, int i10) {
        int i11;
        n1.h hVar;
        u2 u2Var;
        boolean z10;
        boolean z11;
        ?? b10;
        j2.e0 e0Var;
        float f10;
        int i12;
        ?? r22 = (t0.r) nVar;
        r22.c0(1154651354);
        int i13 = 2;
        if ((i10 & 6) == 0) {
            if (r22.h(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && r22.G()) {
            r22.V();
        } else {
            x.j1 j1Var = (x.j1) r22.m(androidx.compose.foundation.e.f1221a);
            g3 g3Var = (g3) r22.m(d2.s1.f13630o);
            j2.e eVar = this.f19244a;
            List a10 = eVar.a(eVar.f20699a.length());
            int size = a10.size();
            int i14 = 0;
            while (i14 < size) {
                j2.d dVar = (j2.d) a10.get(i14);
                if (((Boolean) new o(this, i13).mo2invoke()).booleanValue() && (e0Var = (j2.e0) this.f19245b.getValue()) != null) {
                    int i15 = dVar.f20686b;
                    int i16 = dVar.f20687c;
                    hVar = e0Var.n(i15, i16);
                    int i17 = dVar.f20686b;
                    m1.d b11 = e0Var.b(i17);
                    m1.d b12 = e0Var.b(i16 - 1);
                    if (e0Var.f(i17) == e0Var.f(i16)) {
                        f10 = Math.min(b12.f27239a, b11.f27239a);
                    } else {
                        f10 = s0.g.f34069a;
                    }
                    hVar.j(m1.c.k(t0.t.g(f10, b11.f27240b)));
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    u2Var = new u2(hVar);
                } else {
                    u2Var = null;
                }
                g1.l lVar = g1.l.f16404b;
                if (u2Var != null && (b10 = androidx.compose.ui.draw.a.b(lVar, u2Var)) != 0) {
                    lVar = b10;
                }
                g1.o g10 = lVar.g(new a3(new t2(dVar.f20686b, dVar.f20687c, this)));
                r22.b0(-566158166);
                int i18 = i11 & 14;
                if (i18 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean h10 = z10 | r22.h(dVar);
                Object Q = r22.Q();
                Object obj = t0.m.f35080a;
                if (h10 || Q == obj) {
                    Q = new x.z(16, this, dVar);
                    r22.k0(Q);
                }
                r22.s(false);
                g1.o a11 = h2.l.a(g10, false, (Function1) Q);
                x1.p.f39905a.getClass();
                g1.o g11 = a11.g(new PointerHoverIconModifierElement(x1.r.f39907b, false));
                r22.b0(-566157421);
                if (i18 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean h11 = z11 | r22.h(dVar) | r22.j(g3Var);
                Object Q2 = r22.Q();
                if (h11 || Q2 == obj) {
                    Q2 = new c0.s(3, this, dVar, g3Var);
                    r22.k0(Q2);
                }
                r22.s(false);
                b0.s.a(d2.w0.s(g11, androidx.compose.foundation.a.l(true, null, j1Var, new androidx.compose.foundation.c(null, null, null, (Function0) Q2, null, null, true))), r22, 0);
                i14++;
                i13 = 2;
            }
        }
        t0.x1 w10 = r22.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, 6, this);
        }
    }
}
