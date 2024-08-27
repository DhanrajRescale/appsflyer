package vb;

import b0.l1;
import b0.s;
import b0.v;
import b0.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import t0.m2;
import t0.r1;
import t0.t;
import v.r;

/* loaded from: classes.dex */
public final class b extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37854a = new iu.k(3);

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        r AnimatedVisibility = (r) obj;
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        g1.l lVar = g1.l.f16404b;
        g1.o a10 = h2.l.a(lVar, false, a.f37829b);
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(-483455358);
        l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i10 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(a10);
        boolean z10 = rVar.f35166a instanceof t0.f;
        if (z10) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t.v0(rVar, a11, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar, i10, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            v.e.s(9, rVar, lVar, rVar);
            g1.o d10 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.n(lVar, kp.j.R(94, rVar), kp.j.R(22, rVar)), kq.e.R(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4294924119L)), new n1.t(androidx.compose.ui.graphics.a.d(4294901760L))), s0.g.f34069a, 14), h0.h.b(kp.j.R(20, rVar)), 4);
            g1.g gVar = g1.a.f16383e;
            rVar.b0(733328855);
            v c10 = s.c(gVar, false, rVar, 6);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o11 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(d10);
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, c10, iVar);
                t.v0(rVar, o11, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
                b9.b("Short Sell", androidx.compose.foundation.layout.a.x(bVar.a(lVar, gVar), s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(2, rVar), 7), n1.t.f28173e, kp.j.S(15, rVar, 6), null, null, jh.c.f21380i, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1573254, 0, 130992);
                v.e.y(rVar, false, true, false, false);
                v.e.y(rVar, false, true, false, false);
                return Unit.f23355a;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }
}
