package dd;

import androidx.compose.foundation.layout.LayoutWeightElement;
import b0.i;
import b0.l1;
import b0.m;
import b0.o1;
import b0.y;
import c2.j;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.l;
import g1.o;
import h0.h;
import iu.k;
import ja.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import n1.s0;
import o2.v;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class b extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z10, Object obj, int i10) {
        super(2);
        this.f14303a = i10;
        this.f14304b = z10;
        this.f14305c = obj;
    }

    public final void a(n nVar, int i10) {
        l lVar = l.f16404b;
        int i11 = this.f14303a;
        boolean z10 = this.f14304b;
        Object obj = this.f14305c;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                o e10 = androidx.compose.foundation.a.e(lVar, w0.e(R.color.white, nVar), h.b(10));
                b0.d dVar = b0.n.f2935a;
                i iVar = new i(24, false, new m(g1.a.f16388j, 0));
                g1.e eVar = g1.a.f16391m;
                ArenaGame arenaGame = (ArenaGame) obj;
                r rVar2 = (r) nVar;
                rVar2.b0(-483455358);
                l1 a10 = y.a(iVar, eVar, rVar2, 54);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(e10);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t.v0(rVar2, a10, c2.k.f7749e);
                    t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar2);
                    }
                    v.e.w(rVar2, j10, rVar2, 0, 2058660585);
                    y2.m.b(new g(z10, arenaGame, 2), androidx.compose.foundation.layout.d.e(lVar, 1.0f), null, rVar2, 48, 4);
                    v.e.y(rVar2, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                o e11 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.e(lVar, 1.0f), w0.e(R.color.blue_F8F6FF, nVar), s0.f28162a);
                b0.g gVar = b0.n.f2939e;
                g1.f fVar = g1.a.f16389k;
                Function0 function0 = (Function0) obj;
                r rVar4 = (r) nVar;
                rVar4.b0(693286680);
                l1 a11 = o1.a(gVar, fVar, rVar4, 54);
                rVar4.b0(-1323940314);
                int i13 = rVar4.P;
                r1 o11 = rVar4.o();
                c2.l.M.getClass();
                j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(e11);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t.v0(rVar4, a11, c2.k.f7749e);
                    t.v0(rVar4, o11, c2.k.f7748d);
                    c2.i iVar3 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar4, i13, iVar3);
                    }
                    v.e.w(rVar4, j11, rVar4, 0, 2058660585);
                    if (z10) {
                        rVar4.b0(982910795);
                        androidx.compose.foundation.a.c(w0.u(R.drawable.icon_error_filled, rVar4, 6), "Warning Sign", null, null, null, s0.g.f34069a, null, rVar4, 56, 124);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 4), rVar4);
                        b9.b(hl.f.c1(R.string.not_receiving_messages_right_now, rVar4), null, w0.e(R.color.black_1A1A1A, rVar4), yk.j.e1(12), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1575936, 0, 130994);
                        rVar4.s(false);
                    } else {
                        rVar4.b0(983445917);
                        b9.b(hl.f.c1(R.string.you_have_blocked_this_user, rVar4), null, w0.e(R.color.black_1A1A1A, rVar4), yk.j.e1(12), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1575936, 0, 130994);
                        if (1.0f > 0.0d) {
                            androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar4);
                            String c12 = hl.f.c1(R.string.text_unblock, rVar4);
                            long e12 = w0.e(R.color.blue_4A20E6, rVar4);
                            long e13 = yk.j.e1(12);
                            v vVar = jh.c.f21373b;
                            u2.j jVar3 = u2.j.f36685c;
                            rVar4.b0(-799539317);
                            boolean h10 = rVar4.h(function0);
                            Object Q = rVar4.Q();
                            if (h10 || Q == t0.m.f35080a) {
                                Q = v.e.n(function0, 22, rVar4);
                            }
                            rVar4.s(false);
                            b9.b(c12, androidx.compose.foundation.a.k(lVar, (Function0) Q, 7), e12, e13, null, null, vVar, 0L, jVar3, null, 0L, 0, false, 0, 0, null, null, rVar4, 102239232, 0, 130736);
                            rVar4.s(false);
                        } else {
                            throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                        }
                    }
                    v.e.y(rVar4, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f14303a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
