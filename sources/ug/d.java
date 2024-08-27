package ug;

import b0.l1;
import b0.o1;
import b0.p1;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import n1.t;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;

/* loaded from: classes.dex */
public final class d extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, int i10) {
        super(3);
        this.f37166a = i10;
        this.f37167b = str;
    }

    public final void a(p1 DropdownMenuItem, n nVar, int i10) {
        switch (this.f37166a) {
            case 0:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
                if ((i10 & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                al.d.C(this.f37167b, null, t.f28173e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 384, 0, 131066);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$OutlinedButton");
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                b9.b(this.f37167b, null, 0L, yk.j.e1(12), null, null, jh.c.f21375d, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130486);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$OutlinedButton");
                if ((i10 & 81) == 16) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                b9.b(this.f37167b, null, 0L, yk.j.e1(14), null, null, jh.c.f21375d, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130486);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$OutlinedButton");
                if ((i10 & 81) == 16) {
                    r rVar4 = (r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                b9.b(this.f37167b, null, 0L, yk.j.e1(12), null, null, jh.c.f21375d, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130486);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$OutlinedButton");
                if ((i10 & 81) == 16) {
                    r rVar5 = (r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                b9.b(this.f37167b, null, 0L, yk.j.e1(14), null, null, jh.c.f21375d, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130486);
                return;
            default:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$OutlinedButton");
                if ((i10 & 81) == 16) {
                    r rVar6 = (r) nVar;
                    if (rVar6.G()) {
                        rVar6.V();
                        return;
                    }
                }
                g1.f fVar = g1.a.f16389k;
                String str = this.f37167b;
                r rVar7 = (r) nVar;
                rVar7.b0(693286680);
                g1.l lVar = g1.l.f16404b;
                l1 a10 = o1.a(b0.n.f2935a, fVar, rVar7, 48);
                rVar7.b0(-1323940314);
                int i11 = rVar7.P;
                r1 o10 = rVar7.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar7.f35166a instanceof t0.f) {
                    rVar7.e0();
                    if (rVar7.O) {
                        rVar7.n(jVar);
                    } else {
                        rVar7.n0();
                    }
                    t0.t.v0(rVar7, a10, c2.k.f7749e);
                    t0.t.v0(rVar7, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar7.O || !Intrinsics.a(rVar7.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar7, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar7), rVar7, 2058660585);
                    androidx.compose.foundation.a.c(w0.u(R.drawable.ic_share_offer, rVar7, 6), "Share Icon", null, null, null, s0.g.f34069a, null, rVar7, 56, 124);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 8), rVar7);
                    b9.b(str, null, 0L, yk.j.e1(14), null, null, jh.c.f21373b, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar7, 1575936, 0, 130998);
                    v.e.y(rVar7, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f37166a) {
            case 0:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 2:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 3:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 4:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((p1) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
