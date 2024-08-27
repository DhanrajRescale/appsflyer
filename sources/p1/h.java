package p1;

import n1.h0;
import n1.p;
import n1.p0;
import n1.q0;
import n1.u;
import t0.t;

/* loaded from: classes.dex */
public interface h extends w2.b {
    public static final g S = g.f30506a;

    static void A(h hVar, long j10, long j11, long j12, long j13, i iVar, int i10) {
        long j14;
        long j15;
        long j16;
        i iVar2;
        float f10;
        int i11;
        if ((i10 & 2) != 0) {
            j14 = m1.c.f27233b;
        } else {
            j14 = j11;
        }
        if ((i10 & 4) != 0) {
            j15 = R(hVar.d(), j14);
        } else {
            j15 = j12;
        }
        if ((i10 & 8) != 0) {
            j16 = m1.a.f27227a;
        } else {
            j16 = j13;
        }
        if ((i10 & 16) != 0) {
            iVar2 = k.f30509a;
        } else {
            iVar2 = iVar;
        }
        if ((i10 & 32) != 0) {
            f10 = 1.0f;
        } else {
            f10 = s0.g.f34069a;
        }
        float f11 = f10;
        if ((i10 & 128) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.B(j10, j14, j15, j16, iVar2, f11, null, i11);
    }

    static void C(h hVar, p0 p0Var, long j10, float f10, m mVar, int i10) {
        int i11;
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        i iVar = mVar;
        if ((i10 & 8) != 0) {
            iVar = k.f30509a;
        }
        i iVar2 = iVar;
        if ((i10 & 32) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.s(p0Var, j10, f11, iVar2, null, i11);
    }

    static long R(long j10, long j11) {
        return t.j(m1.f.e(j10) - m1.c.d(j11), m1.f.c(j10) - m1.c.e(j11));
    }

    static void S(h hVar, p pVar, long j10, long j11, float f10, i iVar, int i10) {
        long j12;
        long j13;
        float f11;
        i iVar2;
        int i11;
        if ((i10 & 2) != 0) {
            j12 = m1.c.f27233b;
        } else {
            j12 = j10;
        }
        if ((i10 & 4) != 0) {
            j13 = R(hVar.d(), j12);
        } else {
            j13 = j11;
        }
        if ((i10 & 8) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i10 & 16) != 0) {
            iVar2 = k.f30509a;
        } else {
            iVar2 = iVar;
        }
        if ((i10 & 64) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.t0(pVar, j12, j13, f11, iVar2, null, i11);
    }

    static void T(h hVar, long j10, float f10, long j11, int i10) {
        float f11;
        long j12;
        float f12;
        k kVar;
        int i11;
        if ((i10 & 2) != 0) {
            f11 = m1.f.d(hVar.d()) / 2.0f;
        } else {
            f11 = f10;
        }
        if ((i10 & 4) != 0) {
            j12 = hVar.p0();
        } else {
            j12 = j11;
        }
        if ((i10 & 8) != 0) {
            f12 = 1.0f;
        } else {
            f12 = s0.g.f34069a;
        }
        float f13 = f12;
        if ((i10 & 16) != 0) {
            kVar = k.f30509a;
        } else {
            kVar = null;
        }
        k kVar2 = kVar;
        if ((i10 & 64) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.y(j10, f11, j12, f13, kVar2, null, i11);
    }

    static void U(h hVar, long j10, long j11, long j12, float f10, k kVar, int i10, int i11) {
        long j13;
        long j14;
        float f11;
        k kVar2;
        int i12;
        if ((i11 & 2) != 0) {
            j13 = m1.c.f27233b;
        } else {
            j13 = j11;
        }
        if ((i11 & 4) != 0) {
            j14 = R(hVar.d(), j13);
        } else {
            j14 = j12;
        }
        if ((i11 & 8) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 16) != 0) {
            kVar2 = k.f30509a;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 64) != 0) {
            S.getClass();
            i12 = g.f30507b;
        } else {
            i12 = i10;
        }
        hVar.w(j10, j13, j14, f11, kVar2, null, i12);
    }

    static void Z(h hVar, p pVar, long j10, long j11, float f10, float f11, int i10) {
        float f12;
        float f13;
        int i11;
        if ((i10 & 8) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f10;
        }
        if ((i10 & 64) != 0) {
            f13 = 1.0f;
        } else {
            f13 = f11;
        }
        if ((i10 & 256) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.Q(pVar, j10, j11, f12, 0, null, f13, null, i11);
    }

    static void h(h hVar, p pVar, long j10, long j11, long j12, m mVar, int i10) {
        long j13;
        long j14;
        long j15;
        float f10;
        i iVar;
        int i11;
        if ((i10 & 2) != 0) {
            j13 = m1.c.f27233b;
        } else {
            j13 = j10;
        }
        if ((i10 & 4) != 0) {
            j14 = R(hVar.d(), j13);
        } else {
            j14 = j11;
        }
        if ((i10 & 8) != 0) {
            j15 = m1.a.f27227a;
        } else {
            j15 = j12;
        }
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        } else {
            f10 = s0.g.f34069a;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            iVar = k.f30509a;
        } else {
            iVar = mVar;
        }
        if ((i10 & 128) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.e0(pVar, j13, j14, j15, f11, iVar, null, i11);
    }

    static void o0(h hVar, p0 p0Var, p pVar, float f10, m mVar, int i10) {
        int i11;
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        i iVar = mVar;
        if ((i10 & 8) != 0) {
            iVar = k.f30509a;
        }
        i iVar2 = iVar;
        if ((i10 & 32) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.k0(p0Var, pVar, f11, iVar2, null, i11);
    }

    static void r0(h hVar, h0 h0Var, u uVar) {
        long j10 = m1.c.f27233b;
        k kVar = k.f30509a;
        S.getClass();
        hVar.v(h0Var, j10, 1.0f, kVar, uVar, g.f30507b);
    }

    static void v0(h hVar, long j10, long j11, long j12, float f10, int i10, int i11) {
        float f11;
        int i12;
        int i13;
        int i14 = i11 & 8;
        float f12 = s0.g.f34069a;
        if (i14 != 0) {
            f11 = 0.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 16) != 0) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        if ((i11 & 64) != 0) {
            f12 = 1.0f;
        }
        float f13 = f12;
        if ((i11 & 256) != 0) {
            S.getClass();
            i13 = g.f30507b;
        } else {
            i13 = 0;
        }
        hVar.X(j10, j11, j12, f11, i12, null, f13, null, i13);
    }

    static void y0(h hVar, long j10, float f10, float f11, long j11, long j12, float f12, i iVar, int i10) {
        long j13;
        long j14;
        float f13;
        i iVar2;
        int i11;
        if ((i10 & 16) != 0) {
            j13 = m1.c.f27233b;
        } else {
            j13 = j11;
        }
        if ((i10 & 32) != 0) {
            j14 = R(hVar.d(), j13);
        } else {
            j14 = j12;
        }
        if ((i10 & 64) != 0) {
            f13 = 1.0f;
        } else {
            f13 = f12;
        }
        if ((i10 & 128) != 0) {
            iVar2 = k.f30509a;
        } else {
            iVar2 = iVar;
        }
        if ((i10 & 512) != 0) {
            S.getClass();
            i11 = g.f30507b;
        } else {
            i11 = 0;
        }
        hVar.i0(j10, f10, f11, j13, j14, f13, iVar2, null, i11);
    }

    static void z0(h hVar, h0 h0Var, long j10, long j11, long j12, long j13, float f10, u uVar, int i10, int i11) {
        long j14;
        long j15;
        long j16;
        long j17;
        float f11;
        k kVar;
        u uVar2;
        int i12;
        int i13;
        if ((i11 & 2) != 0) {
            j14 = w2.h.f38791b;
        } else {
            j14 = j10;
        }
        if ((i11 & 4) != 0) {
            n1.e eVar = (n1.e) h0Var;
            j15 = hl.f.k(eVar.f28128a.getWidth(), eVar.f28128a.getHeight());
        } else {
            j15 = j11;
        }
        if ((i11 & 8) != 0) {
            j16 = w2.h.f38791b;
        } else {
            j16 = j12;
        }
        if ((i11 & 16) != 0) {
            j17 = j15;
        } else {
            j17 = j13;
        }
        if ((i11 & 32) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 64) != 0) {
            kVar = k.f30509a;
        } else {
            kVar = null;
        }
        if ((i11 & 128) != 0) {
            uVar2 = null;
        } else {
            uVar2 = uVar;
        }
        int i14 = i11 & 256;
        g gVar = S;
        if (i14 != 0) {
            gVar.getClass();
            i12 = g.f30507b;
        } else {
            i12 = 0;
        }
        int i15 = i12;
        if ((i11 & 512) != 0) {
            gVar.getClass();
            i13 = g.f30508c;
        } else {
            i13 = i10;
        }
        hVar.t(h0Var, j14, j15, j16, j17, f11, kVar, uVar2, i15, i13);
    }

    void B(long j10, long j11, long j12, long j13, i iVar, float f10, u uVar, int i10);

    void Q(p pVar, long j10, long j11, float f10, int i10, q0 q0Var, float f11, u uVar, int i11);

    void X(long j10, long j11, long j12, float f10, int i10, q0 q0Var, float f11, u uVar, int i11);

    default long d() {
        return f0().b();
    }

    void e0(p pVar, long j10, long j11, long j12, float f10, i iVar, u uVar, int i10);

    b f0();

    w2.k getLayoutDirection();

    void i0(long j10, float f10, float f11, long j11, long j12, float f12, i iVar, u uVar, int i10);

    void k0(p0 p0Var, p pVar, float f10, i iVar, u uVar, int i10);

    default long p0() {
        return t.U(f0().b());
    }

    void s(p0 p0Var, long j10, float f10, i iVar, u uVar, int i10);

    void t(h0 h0Var, long j10, long j11, long j12, long j13, float f10, i iVar, u uVar, int i10, int i11);

    void t0(p pVar, long j10, long j11, float f10, i iVar, u uVar, int i10);

    void v(h0 h0Var, long j10, float f10, i iVar, u uVar, int i10);

    void w(long j10, long j11, long j12, float f10, i iVar, u uVar, int i10);

    void y(long j10, float f10, long j11, float f11, i iVar, u uVar, int i10);
}
