package lb;

import androidx.compose.foundation.layout.LayoutWeightElement;
import b0.l1;
import b0.o1;
import b0.y;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import m0.s3;
import o2.v;
import t0.r1;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24514b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, int i11) {
        super(2);
        this.f24513a = i11;
        this.f24514b = i10;
    }

    public final void a(t0.n nVar, int i10) {
        String t10;
        int i11;
        int i12 = this.f24513a;
        int i13 = this.f24514b;
        switch (i12) {
            case 0:
                yk.j.q0(nVar, t0.t.H0(i13 | 1));
                return;
            case 1:
                yk.o.c(nVar, t0.t.H0(i13 | 1));
                return;
            case 2:
                yk.j.j(nVar, t0.t.H0(i13 | 1));
                return;
            case 3:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g1.l lVar = g1.l.f16404b;
                g1.o v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(52, nVar)), kp.j.R(10, nVar), s0.g.f34069a, 2);
                g1.f fVar = g1.a.f16389k;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(693286680);
                l1 a10 = o1.a(b0.n.f2935a, fVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i14 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(v10);
                boolean z10 = rVar2.f35166a instanceof t0.f;
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    c2.i iVar = c2.k.f7749e;
                    t0.t.v0(rVar2, a10, iVar);
                    c2.i iVar2 = c2.k.f7748d;
                    t0.t.v0(rVar2, o10, iVar2);
                    c2.i iVar3 = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar2, i14, iVar3);
                    }
                    v.e.w(rVar2, j10, rVar2, 0, 2058660585);
                    r1.f A = w0.A(R.drawable.ic_start_selected, rVar2, 56);
                    long j11 = n1.t.f28177i;
                    s3.b(A, null, androidx.compose.foundation.layout.d.m(lVar, kp.j.R(24, rVar2)), j11, rVar2, 3120, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(16, rVar2)), rVar2);
                    if (1.0f > 0.0d) {
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true);
                        rVar2.b0(-483455358);
                        l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
                        rVar2.b0(-1323940314);
                        int i15 = rVar2.P;
                        r1 o11 = rVar2.o();
                        b1.c j12 = androidx.compose.ui.layout.a.j(layoutWeightElement);
                        if (z10) {
                            rVar2.e0();
                            if (rVar2.O) {
                                rVar2.n(jVar);
                            } else {
                                rVar2.n0();
                            }
                            t0.t.v0(rVar2, a11, iVar);
                            t0.t.v0(rVar2, o11, iVar2);
                            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                                nn.d.s(i15, rVar2, i15, iVar3);
                            }
                            v.e.w(rVar2, j12, rVar2, 0, 2058660585);
                            if (i13 < 1) {
                                t10 = jr.h.t(rVar2, -372170890, R.string.empty_favorite_feed_message, rVar2, false);
                            } else {
                                t10 = jr.h.t(rVar2, -372060964, R.string.favorite_feed_message, rVar2, false);
                            }
                            String str = t10;
                            v vVar = jh.c.f21373b;
                            b9.b(str, h2.l.a(lVar, false, pb.a.f30816c), n1.t.f28170b, kp.j.S(12, rVar2, 6), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1573248, 0, 130992);
                            if (i13 >= 1) {
                                b9.b(hl.f.d1(R.string.favorite_feeds_count_message, new Object[]{String.valueOf(i13)}, rVar2), h2.l.a(lVar, false, pb.a.f30817d), androidx.compose.ui.graphics.a.c(1712986650), kp.j.S(10, rVar2, 6), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1573248, 0, 130992);
                            }
                            v.e.y(rVar2, false, true, false, false);
                            if (i13 > 0) {
                                i11 = R.drawable.ic_arrow_right;
                            } else {
                                i11 = R.drawable.ic_arrow_right_disabled;
                            }
                            s3.b(w0.A(i11, rVar2, 8), null, androidx.compose.foundation.layout.d.m(lVar, kp.j.R(20, rVar2)), j11, rVar2, 3120, 0);
                            v.e.y(rVar2, false, true, false, false);
                            return;
                        }
                        al.d.v0();
                        throw null;
                    }
                    throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
                al.d.v0();
                throw null;
            case 4:
                yk.j.A(nVar, t0.t.H0(i13 | 1));
                return;
            case 5:
                kp.j.h(nVar, t0.t.H0(i13 | 1));
                return;
            case 6:
                yk.o.g(nVar, t0.t.H0(i13 | 1));
                return;
            case 7:
                yk.j.f(nVar, t0.t.H0(i13 | 1));
                return;
            case 8:
                dp.b.e0(nVar, t0.t.H0(i13 | 1));
                return;
            case 9:
                dp.b.f0(nVar, t0.t.H0(i13 | 1));
                return;
            case 10:
                dp.b.g0(nVar, t0.t.H0(i13 | 1));
                return;
            case 11:
                dp.b.h0(nVar, t0.t.H0(i13 | 1));
                return;
            case 12:
                dp.b.c(nVar, t0.t.H0(i13 | 1));
                return;
            case 13:
                dp.b.w0(nVar, t0.t.H0(i13 | 1));
                return;
            case 14:
                dp.b.x0(nVar, t0.t.H0(i13 | 1));
                return;
            case 15:
                dp.b.y0(nVar, t0.t.H0(i13 | 1));
                return;
            case 16:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            t0.r rVar4 = (t0.r) nVar;
                            rVar4.b0(952744779);
                            rVar4.s(false);
                            return;
                        } else {
                            t0.r rVar5 = (t0.r) nVar;
                            rVar5.b0(584921866);
                            dp.b.y0(rVar5, 0);
                            rVar5.s(false);
                            return;
                        }
                    }
                    t0.r rVar6 = (t0.r) nVar;
                    rVar6.b0(584920426);
                    dp.b.x0(rVar6, 0);
                    rVar6.s(false);
                    return;
                }
                t0.r rVar7 = (t0.r) nVar;
                rVar7.b0(584918986);
                dp.b.w0(rVar7, 0);
                rVar7.s(false);
                return;
            case 17:
                dp.b.T(nVar, t0.t.H0(i13 | 1));
                return;
            case 18:
                dp.b.K(nVar, t0.t.H0(i13 | 1));
                return;
            case 19:
                el.l.b(nVar, t0.t.H0(i13 | 1));
                return;
            case 20:
                al.d.g(nVar, t0.t.H0(i13 | 1));
                return;
            case 21:
                al.d.u(nVar, t0.t.H0(i13 | 1));
                return;
            case 22:
                al.d.x(nVar, t0.t.H0(i13 | 1));
                return;
            case 23:
                el.l.c(nVar, t0.t.H0(i13 | 1));
                return;
            case 24:
                al.d.k(nVar, t0.t.H0(i13 | 1));
                return;
            case 25:
                al.d.v(nVar, t0.t.H0(i13 | 1));
                return;
            default:
                el.l.j(nVar, t0.t.H0(i13 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24513a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 6:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 7:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 8:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 9:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 10:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 11:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 12:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 13:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 14:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 15:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 16:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 17:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 18:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 19:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 20:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 21:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 22:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 23:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 24:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 25:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
