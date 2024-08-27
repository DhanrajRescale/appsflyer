package i0;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pair f18942a;

    static {
        vt.i0 i0Var = vt.i0.f38321a;
        f18942a = new Pair(i0Var, i0Var);
    }

    public static final void a(j2.e eVar, List list, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1794596951);
        if ((i10 & 6) == 0) {
            if (rVar.h(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(list)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && rVar.G()) {
            rVar.V();
        } else {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                j2.d dVar = (j2.d) list.get(i14);
                hu.c cVar = (hu.c) dVar.f20685a;
                g gVar = g.f18886a;
                rVar.b0(-1323940314);
                g1.l lVar = g1.l.f16404b;
                int i15 = rVar.P;
                t0.r1 o10 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar.f35166a instanceof t0.f) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, gVar, c2.k.f7749e);
                    t0.t.v0(rVar, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar, i15, iVar);
                    }
                    nn.d.q(0, j10, new t0.m2(rVar), rVar, 2058660585);
                    cVar.b(eVar.subSequence(dVar.f20686b, dVar.f20687c).f20699a, rVar, 0);
                    rVar.s(false);
                    rVar.s(true);
                    rVar.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            }
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.t1(eVar, list, i10, 3);
        }
    }
}
