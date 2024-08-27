package lb;

import b0.l1;
import b0.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import o2.v;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class b extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f24408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, Function0 function0, boolean z10) {
        super(3);
        this.f24408a = function0;
        this.f24409b = z10;
        this.f24410c = i10;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        v.r AnimatedVisibility = (v.r) obj;
        t0.n nVar = (t0.n) obj2;
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        g1.l lVar = g1.l.f16404b;
        g1.o a10 = h2.l.a(androidx.compose.foundation.a.k(androidx.compose.foundation.layout.a.v(lVar, s0.g.f34069a, kp.j.R(8, nVar), 1), this.f24408a, 7), false, a.f24392j);
        g1.f fVar = g1.a.f16389k;
        boolean z10 = this.f24409b;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(693286680);
        l1 a11 = o1.a(b0.n.f2935a, fVar, rVar, 48);
        rVar.b0(-1323940314);
        int i10 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(a10);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t0.t.v0(rVar, a11, c2.k.f7749e);
            t0.t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar, i10, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            yk.j.Q(h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(20, rVar)), false, a.f24393k), true, z10, null, rVar, 48, 8);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(4, rVar)), rVar);
            String m10 = nn.d.m(new StringBuilder(), this.f24410c, " likes");
            v vVar = jh.c.f21377f;
            long S = kp.j.S(12, rVar, 6);
            b9.b(m10, h2.l.a(lVar, false, a.f24394l), n1.t.f28170b, S, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1573248, 0, 130992);
            v.e.y(rVar, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
