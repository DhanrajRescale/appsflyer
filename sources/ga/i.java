package ga;

import b0.l1;
import b0.m;
import b0.o1;
import b0.y;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.l;
import g1.o;
import j2.b0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import o2.v;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f17192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Boolean bool, int i10) {
        super(2);
        this.f17191a = i10;
        this.f17192b = bool;
    }

    public final void a(n nVar, int i10) {
        int i11;
        int i12 = this.f17191a;
        Boolean bool = this.f17192b;
        switch (i12) {
            case 0:
                if ((i10 & 11) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.k0(bool, nVar, 0, 0);
                return;
            default:
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                l lVar = l.f16404b;
                g1.e eVar = g1.a.f16392n;
                r rVar3 = (r) nVar;
                rVar3.b0(-483455358);
                l1 a10 = y.a(b0.n.f2937c, eVar, rVar3, 48);
                rVar3.b0(-1323940314);
                int i13 = rVar3.P;
                r1 o10 = rVar3.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                boolean z10 = rVar3.f35166a instanceof t0.f;
                if (z10) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    c2.i iVar = c2.k.f7749e;
                    t.v0(rVar3, a10, iVar);
                    c2.i iVar2 = c2.k.f7748d;
                    t.v0(rVar3, o10, iVar2);
                    c2.i iVar3 = c2.k.f7750f;
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar3, i13, iVar3);
                    }
                    v.e.w(rVar3, j10, rVar3, 0, 2058660585);
                    float f10 = 16;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar3);
                    b0.i iVar4 = new b0.i(10, true, new b0.l(eVar, 0));
                    g1.f fVar = g1.a.f16389k;
                    rVar3.b0(693286680);
                    l1 a11 = o1.a(iVar4, fVar, rVar3, 54);
                    rVar3.b0(-1323940314);
                    int i14 = rVar3.P;
                    r1 o11 = rVar3.o();
                    b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                    if (z10) {
                        rVar3.e0();
                        if (rVar3.O) {
                            rVar3.n(jVar);
                        } else {
                            rVar3.n0();
                        }
                        t.v0(rVar3, a11, iVar);
                        t.v0(rVar3, o11, iVar2);
                        if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i14))) {
                            nn.d.s(i14, rVar3, i14, iVar3);
                        }
                        v.e.w(rVar3, j11, rVar3, 0, 2058660585);
                        androidx.compose.foundation.a.c(w0.u(R.drawable.ic_understanding, rVar3, 6), "image description", null, null, a2.k.f100e, s0.g.f34069a, null, rVar3, 24632, 108);
                        List list = jh.b.f21371a;
                        j2.c cVar = new j2.c();
                        cVar.h(new b0(0L, 0L, null, null, null, jh.c.f21372a, null, 0L, null, null, null, 0L, null, null, 65503));
                        cVar.d("Understanding \n");
                        cVar.h(new b0(0L, 0L, null, null, null, jh.c.f21375d, null, 0L, null, null, null, 0L, null, null, 65503));
                        cVar.d("Options");
                        b9.c(cVar.i(), lVar, n1.t.f28170b, yk.j.e1(24), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar3, 3504, 0, 262128);
                        v.e.y(rVar3, false, true, false, false);
                        float f11 = 20;
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar3);
                        if (Intrinsics.a(bool, Boolean.FALSE)) {
                            i11 = R.drawable.ic_understanding_call;
                        } else {
                            i11 = R.drawable.ic_understanding_put;
                        }
                        androidx.compose.foundation.a.c(w0.u(i11, rVar3, 0), "image description", androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), 1.0f), null, a2.k.f98c, s0.g.f34069a, null, rVar3, 25016, 104);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar3);
                        o x10 = androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
                        g1.f fVar2 = g1.a.f16388j;
                        b0.i iVar5 = new b0.i(11, false, new m(fVar2, 0));
                        g1.e eVar2 = g1.a.f16391m;
                        rVar3.b0(-483455358);
                        l1 a12 = y.a(iVar5, eVar2, rVar3, 54);
                        rVar3.b0(-1323940314);
                        int i15 = rVar3.P;
                        r1 o12 = rVar3.o();
                        b1.c j12 = androidx.compose.ui.layout.a.j(x10);
                        if (z10) {
                            rVar3.e0();
                            if (rVar3.O) {
                                rVar3.n(jVar);
                            } else {
                                rVar3.n0();
                            }
                            t.v0(rVar3, a12, iVar);
                            t.v0(rVar3, o12, iVar2);
                            if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i15))) {
                                nn.d.s(i15, rVar3, i15, iVar3);
                            }
                            v.e.w(rVar3, j12, rVar3, 0, 2058660585);
                            for (jh.a aVar : jh.b.f21371a) {
                                rVar3.b0(693286680);
                                l1 a13 = o1.a(b0.n.f2935a, fVar2, rVar3, 0);
                                rVar3.b0(-1323940314);
                                int i16 = rVar3.P;
                                r1 o13 = rVar3.o();
                                c2.l.M.getClass();
                                c2.j jVar2 = c2.k.f7746b;
                                b1.c j13 = androidx.compose.ui.layout.a.j(lVar);
                                if (z10) {
                                    rVar3.e0();
                                    if (rVar3.O) {
                                        rVar3.n(jVar2);
                                    } else {
                                        rVar3.n0();
                                    }
                                    t.v0(rVar3, a13, c2.k.f7749e);
                                    t.v0(rVar3, o13, c2.k.f7748d);
                                    c2.i iVar6 = c2.k.f7750f;
                                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i16))) {
                                        nn.d.s(i16, rVar3, i16, iVar6);
                                    }
                                    v.e.w(rVar3, j13, rVar3, 0, 2058660585);
                                    String str = aVar.f21368a + ".";
                                    long e10 = w0.e(R.color.maintainence_black, rVar3);
                                    v vVar = jh.c.f21375d;
                                    al.d.C(str, null, e10, yk.j.e1(12), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 1575936, 0, 130994);
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 2), rVar3);
                                    String detailTitle = aVar.f21369b;
                                    Intrinsics.checkNotNullParameter(detailTitle, "detailTitle");
                                    String detailDescription = aVar.f21370c;
                                    Intrinsics.checkNotNullParameter(detailDescription, "detailDescription");
                                    j2.c cVar2 = new j2.c();
                                    cVar2.h(new b0(0L, 0L, null, null, null, vVar, null, 0L, null, null, null, 0L, null, null, 65503));
                                    cVar2.d(detailTitle);
                                    cVar2.h(new b0(0L, 0L, null, null, null, jh.c.f21372a, null, 0L, null, null, null, 0L, null, null, 65503));
                                    cVar2.d(": " + detailDescription);
                                    b9.c(cVar2.i(), androidx.compose.foundation.layout.d.e(lVar, 1.0f), w0.e(R.color.maintainence_black, rVar3), yk.j.e1(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar3, 3120, 0, 262128);
                                    rVar3.s(false);
                                    v.e.x(rVar3, true, false, false);
                                    fVar2 = fVar2;
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            }
                            v.e.y(rVar3, false, true, false, false);
                            v.e.u(lVar, f10, rVar3, false, true);
                            rVar3.s(false);
                            rVar3.s(false);
                            return;
                        }
                        al.d.v0();
                        throw null;
                    }
                    al.d.v0();
                    throw null;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f17191a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
