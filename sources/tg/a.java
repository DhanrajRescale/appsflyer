package tg;

import androidx.compose.foundation.layout.FillElement;
import b0.l1;
import b0.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.l5;
import t0.m2;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36023a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        g1.e eVar = g1.a.f16392n;
        b0.g gVar = b0.n.f2939e;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-483455358);
        l1 a10 = y.a(gVar, eVar, rVar2, 54);
        rVar2.b0(-1323940314);
        int i10 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(fillElement);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, a10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar2, i10, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar2, 0, 31);
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
