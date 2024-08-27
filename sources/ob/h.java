package ob;

import b0.s;
import b0.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import o2.v;
import t0.g1;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;
import yk.o;

/* loaded from: classes.dex */
public final class h extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29903a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, String str, g1 g1Var) {
        super(3);
        this.f29904b = i10;
        this.f29905c = str;
        this.f29906d = g1Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        v vVar;
        long d10;
        Object obj4 = this.f29905c;
        int i10 = this.f29903a;
        Object obj5 = this.f29906d;
        switch (i10) {
            case 0:
                c0.c item = (c0.c) obj;
                n nVar = (n) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((intValue & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                nb.b bVar = (nb.b) obj4;
                g1.l lVar = g1.l.f16404b;
                if (bVar != null) {
                    r rVar2 = (r) nVar;
                    rVar2.b0(120433575);
                    yk.j.v(androidx.compose.foundation.layout.a.v(lVar, kp.j.R(16, rVar2), s0.g.f34069a, 2), rVar2, 0, 0);
                    rVar2.s(false);
                } else {
                    r rVar3 = (r) nVar;
                    rVar3.b0(120575834);
                    o.e(this.f29904b, androidx.compose.foundation.layout.a.v(lVar, kp.j.R(16, rVar3), s0.g.f34069a, 2), (Function0) obj5, rVar3, 0, 0);
                    rVar3.s(false);
                }
                return Unit.f23355a;
            default:
                z Card = (z) obj;
                n nVar2 = (n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((intValue2 & 81) == 16) {
                    r rVar4 = (r) nVar2;
                    if (rVar4.G()) {
                        rVar4.V();
                        return Unit.f23355a;
                    }
                }
                g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.f1286c, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(2, nVar2), 7);
                g1.g gVar = g1.a.f16383e;
                String str = (String) obj4;
                g1 g1Var = (g1) obj5;
                r rVar5 = (r) nVar2;
                rVar5.b0(733328855);
                b0.v c10 = s.c(gVar, false, rVar5, 6);
                rVar5.b0(-1323940314);
                int i11 = rVar5.P;
                r1 o10 = rVar5.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(x10);
                if (rVar5.f35166a instanceof t0.f) {
                    rVar5.e0();
                    if (rVar5.O) {
                        rVar5.n(jVar);
                    } else {
                        rVar5.n0();
                    }
                    t.v0(rVar5, c10, c2.k.f7749e);
                    t.v0(rVar5, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar5.O || !Intrinsics.a(rVar5.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar5, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar5), rVar5, 2058660585);
                    int intValue3 = ((Number) g1Var.getValue()).intValue();
                    int i12 = this.f29904b;
                    if (intValue3 == i12) {
                        vVar = jh.c.f21380i;
                    } else {
                        vVar = jh.c.f21377f;
                    }
                    v vVar2 = vVar;
                    long S = kp.j.S(16, rVar5, 6);
                    if (((Number) g1Var.getValue()).intValue() == i12) {
                        d10 = n1.t.f28173e;
                    } else {
                        d10 = androidx.compose.ui.graphics.a.d(4281413937L);
                    }
                    b9.b(str, null, d10, S, null, null, vVar2, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar5, 0, 0, 130994);
                    v.e.y(rVar5, false, true, false, false);
                    return Unit.f23355a;
                }
                al.d.v0();
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nb.b bVar, int i10, Function0 function0) {
        super(3);
        this.f29905c = bVar;
        this.f29904b = i10;
        this.f29906d = function0;
    }
}
