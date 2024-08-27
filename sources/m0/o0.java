package m0;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.compose.ChatMediaViewerActivity;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.home.homepage.data.HomePortfolioDto;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26564c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, Object obj, Object obj2, Object obj3) {
        super(2);
        this.f26562a = i10;
        this.f26564c = obj;
        this.f26565d = obj2;
        this.f26563b = obj3;
    }

    private final void d(t0.n nVar, int i10) {
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        g1.o r10 = androidx.compose.foundation.a.r(androidx.compose.foundation.layout.a.B(androidx.compose.foundation.layout.a.v((g1.o) this.f26564c, s0.g.f34069a, a4.f25871d, 1)), (x.o2) this.f26565d);
        hu.c cVar = (hu.c) this.f26563b;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-483455358);
        b0.l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(r10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, a10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j10, new t0.m2(rVar2), rVar2, 2058660585);
            cVar.b(b0.a0.f2818a, rVar2, 6);
            rVar2.s(false);
            v.e.x(rVar2, true, false, false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void e(t0.n nVar, int i10) {
        int i11 = 3;
        if ((i10 & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        g1.o i12 = androidx.compose.ui.layout.a.i("border");
        long j10 = ((m1.f) ((t0.g1) this.f26564c).getValue()).f27254a;
        b0.h1 h1Var = (b0.h1) this.f26565d;
        float f10 = f5.f26167a;
        g1.o f11 = androidx.compose.ui.draw.a.f(i12, new x.v(h1Var, i11, j10));
        Function2 function2 = (Function2) this.f26563b;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, true, rVar2, 48);
        rVar2.b0(-1323940314);
        int i13 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j11 = androidx.compose.ui.layout.a.j(f11);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, c10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar2, i13, iVar);
            }
            nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
            rVar2.b0(1661575907);
            if (function2 != null) {
                function2.invoke(rVar2, 0);
            }
            v.e.y(rVar2, false, false, true, false);
            rVar2.s(false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void f(t0.n nVar, int i10) {
        hb.y yVar;
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        g1.l lVar = g1.l.f16404b;
        hb.s sVar = (hb.s) this.f26564c;
        Function0 function0 = (Function0) this.f26565d;
        hb.k kVar = (hb.k) this.f26563b;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-483455358);
        b0.l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, a10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j10, new t0.m2(rVar2), rVar2, 2058660585);
            v.e.s(12, rVar2, lVar, rVar2);
            hb.r rVar3 = sVar.f18227d;
            String str = rVar3.f18214a;
            if (rVar3.f18220g) {
                yVar = hb.y.f18242b;
            } else {
                yVar = hb.y.f18243c;
            }
            hb.y yVar2 = yVar;
            boolean z10 = rVar3.f18215b;
            rVar2.b0(-1763996924);
            boolean h10 = rVar2.h(function0);
            Object Q = rVar2.Q();
            to.e eVar = t0.m.f35080a;
            if (h10 || Q == eVar) {
                Q = new d0.i0(function0, 2);
                rVar2.k0(Q);
            }
            rVar2.s(false);
            yk.o.i(str, false, yVar2, z10, (Function1) Q, rVar2, 48);
            hb.j jVar2 = sVar.f18228e;
            yk.o.k(jVar2.f18192b, jVar2.f18193c, jVar2.f18195e, kVar, null, yb.h.f41433a, rVar2, 221696, 0);
            hb.q qVar = sVar.f18229f;
            hb.p pVar = qVar.f18210a;
            boolean z11 = pVar.f18208a;
            int i12 = pVar.f18209b;
            int i13 = qVar.f18211b.f18207b;
            g1.o e10 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.w(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(16, rVar2), kp.j.R(4, rVar2), kp.j.R(16, rVar2), kp.j.R(8, rVar2)), n1.t.f28173e, n1.s0.f28162a);
            rVar2.b0(-1763971292);
            boolean h11 = rVar2.h(function0);
            Object Q2 = rVar2.Q();
            if (h11 || Q2 == eVar) {
                Q2 = new d0.i0(function0, 3);
                rVar2.k0(Q2);
            }
            rVar2.s(false);
            yk.j.x(true, z11, i12, i13, false, false, false, e10, (Function1) Q2, function0, function0, rVar2, 1794054, 0, 0);
            v.e.y(rVar2, false, true, false, false);
            return;
        }
        al.d.v0();
        throw null;
    }

    private final void i(t0.n nVar, int i10) {
        t0.r rVar;
        int i11;
        int i12;
        if ((i10 & 11) == 2) {
            t0.r rVar2 = (t0.r) nVar;
            if (rVar2.G()) {
                rVar2.V();
                return;
            }
        }
        g1.o a10 = ((b0.w) this.f26564c).a(g1.l.f16404b, g1.a.f16383e);
        String str = ((hb.v) this.f26565d).f18232b;
        if (str != null && str.length() != 0) {
            rVar = (t0.r) nVar;
            i11 = -1806878513;
            i12 = 34;
        } else {
            rVar = (t0.r) nVar;
            i11 = -1806878897;
            i12 = 24;
        }
        r0.n3.b((j2.e) this.f26563b, h2.l.a(androidx.compose.foundation.layout.d.g(a10, jr.h.d(rVar, i11, i12, rVar, false)), false, ac.h.f335d), 0L, 0L, null, null, null, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, null, nVar, 0, 0, 261628);
    }

    private final void j(t0.n nVar, int i10) {
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        Media media = (Media) this.f26564c;
        if (media != null) {
            ChatMediaViewerActivity chatMediaViewerActivity = (ChatMediaViewerActivity) this.f26565d;
            GroupChatViewModel groupChatViewModel = (GroupChatViewModel) chatMediaViewerActivity.x();
            ChatMessage chatMessage = (ChatMessage) this.f26563b;
            String senderId = chatMessage.getSenderId();
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.a(senderId, groupChatViewModel.f9081d.getCurrentUserId())) {
                arrayList.add(yd.f.f41541c);
            } else {
                arrayList.add(yd.f.f41540b);
            }
            t0.r rVar2 = (t0.r) nVar;
            rVar2.b0(-2101101203);
            boolean h10 = rVar2.h(chatMediaViewerActivity);
            Object Q = rVar2.Q();
            if (h10 || Q == t0.m.f35080a) {
                Q = new lc.b(chatMediaViewerActivity, 5);
                rVar2.k0(Q);
            }
            rVar2.s(false);
            yk.j.g(media, arrayList, (Function0) Q, new d2.y0(27, chatMediaViewerActivity, chatMessage), ld.g.f24558b, rVar2, 24648);
        }
    }

    private final void k(t0.n nVar, int i10) {
        c2.j jVar;
        c2.i iVar;
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        g1.l lVar = g1.l.f16404b;
        g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, 24);
        g1.e eVar = g1.a.f16391m;
        t0.g1 g1Var = (t0.g1) this.f26564c;
        Function0 function0 = (Function0) this.f26565d;
        Function1 function1 = (Function1) this.f26563b;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-483455358);
        b0.l1 a10 = b0.y.a(b0.n.f2937c, eVar, rVar2, 48);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar2 = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(t10);
        boolean z10 = rVar2.f35166a instanceof t0.f;
        if (z10) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar2);
            } else {
                rVar2.n0();
            }
            c2.i iVar2 = c2.k.f7749e;
            t0.t.v0(rVar2, a10, iVar2);
            c2.i iVar3 = c2.k.f7748d;
            t0.t.v0(rVar2, o10, iVar3);
            c2.i iVar4 = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar4);
            }
            nn.d.q(0, j10, new t0.m2(rVar2), rVar2, 2058660585);
            g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            g1.f fVar = g1.a.f16389k;
            rVar2.b0(693286680);
            b0.d dVar = b0.n.f2935a;
            b0.l1 a11 = b0.o1.a(dVar, fVar, rVar2, 48);
            rVar2.b0(-1323940314);
            int i12 = rVar2.P;
            t0.r1 o11 = rVar2.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(e10);
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar2);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a11, iVar2);
                t0.t.v0(rVar2, o11, iVar3);
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                    nn.d.s(i12, rVar2, i12, iVar4);
                }
                nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
                androidx.compose.foundation.a.c(d2.w0.u(R.drawable.ic_cross, rVar2, 6), "Cross", null, null, null, s0.g.f34069a, null, rVar2, 56, 124);
                float f10 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                b9.b(hl.f.c1(R.string.report_group_to_stockgro, rVar2), null, d2.w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(14), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                v.e.y(rVar2, false, true, false, false);
                b9.b(v.e.i(lVar, 18, rVar2, R.string.report_body_text, rVar2), androidx.compose.foundation.layout.d.e(lVar, 1.0f), n1.t.f28170b, yk.j.e1(12), null, null, jh.c.f21372a, 0L, null, new u2.i(5), 0L, 0, false, 0, 0, null, null, rVar2, 1576368, 0, 130480);
                float f11 = 20;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar2);
                g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, 0, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14);
                rVar2.b0(693286680);
                b0.l1 a12 = b0.o1.a(dVar, fVar, rVar2, 54);
                rVar2.b0(-1323940314);
                int i13 = rVar2.P;
                t0.r1 o12 = rVar2.o();
                b1.c j12 = androidx.compose.ui.layout.a.j(x10);
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        jVar = jVar2;
                        rVar2.n(jVar);
                    } else {
                        jVar = jVar2;
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a12, iVar2);
                    t0.t.v0(rVar2, o12, iVar3);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                        iVar = iVar4;
                        nn.d.s(i13, rVar2, i13, iVar);
                    } else {
                        iVar = iVar4;
                    }
                    nn.d.q(0, j12, new t0.m2(rVar2), rVar2, 2058660585);
                    dp.b.p(u3.f26878b.b(Boolean.FALSE), b1.d.c(-330841163, new ka.a1(g1Var, 3), rVar2), rVar2, 48);
                    v.e.y(rVar2, false, true, false, false);
                    g1.o f12 = v.e.f(lVar, f11, rVar2, lVar, 1.0f);
                    rVar2.b0(693286680);
                    b0.l1 a13 = b0.o1.a(dVar, g1.a.f16388j, rVar2, 0);
                    rVar2.b0(-1323940314);
                    int i14 = rVar2.P;
                    t0.r1 o13 = rVar2.o();
                    b1.c j13 = androidx.compose.ui.layout.a.j(f12);
                    if (z10) {
                        rVar2.e0();
                        if (rVar2.O) {
                            rVar2.n(jVar);
                        } else {
                            rVar2.n0();
                        }
                        t0.t.v0(rVar2, a13, iVar2);
                        t0.t.v0(rVar2, o13, iVar3);
                        if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                            nn.d.s(i14, rVar2, i14, iVar);
                        }
                        nn.d.q(0, j13, new t0.m2(rVar2), rVar2, 2058660585);
                        b0.q1 q1Var = b0.q1.f2981a;
                        String c12 = hl.f.c1(R.string.cancel, rVar2);
                        float f13 = 48;
                        g1.o b10 = q1Var.b(androidx.compose.foundation.layout.d.g(lVar, f13), 1.0f, true);
                        rVar2.b0(-1671591056);
                        boolean h10 = rVar2.h(function0);
                        Object Q = rVar2.Q();
                        to.e eVar2 = t0.m.f35080a;
                        if (h10 || Q == eVar2) {
                            Q = v.e.p(function0, 24, rVar2);
                        }
                        rVar2.s(false);
                        al.d.q(0, 54, 0L, 0L, null, rVar2, b10, c12, (Function0) Q, false);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                        String c13 = hl.f.c1(R.string.text_yes, rVar2);
                        g1.o b11 = q1Var.b(androidx.compose.foundation.layout.d.g(lVar, f13), 1.0f, true);
                        rVar2.b0(-1671578941);
                        boolean h11 = rVar2.h(function1);
                        Object Q2 = rVar2.Q();
                        if (h11 || Q2 == eVar2) {
                            Q2 = new ld.n(function1, g1Var, 2);
                            rVar2.k0(Q2);
                        }
                        rVar2.s(false);
                        al.d.n(b11, false, null, c13, (Function0) Q2, rVar2, 0, 6);
                        v.e.y(rVar2, false, true, false, false);
                        v.e.y(rVar2, false, true, false, false);
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
        al.d.v0();
        throw null;
    }

    private final void l(t0.n nVar, int i10) {
        boolean z10;
        int i11 = 2;
        if ((i10 & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return;
            }
        }
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-1115007505);
        t0.g1 g1Var = (t0.g1) this.f26564c;
        Object Q = rVar2.Q();
        to.e eVar = t0.m.f35080a;
        if (Q == eVar) {
            Q = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 14, rVar2);
        }
        rVar2.s(false);
        iu.j.f(false, (Function0) Q, rVar2, 48, 1);
        e1.s sVar = (e1.s) this.f26565d;
        Function1 function1 = (Function1) this.f26563b;
        rVar2.b0(733328855);
        g1.l lVar = g1.l.f16404b;
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i12 = rVar2.P;
        t0.r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, c10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar2, i12, iVar);
            }
            nn.d.q(0, j10, new t0.m2(rVar2), rVar2, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
            float f10 = 16;
            g1.o g10 = androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, 56, 2).g(androidx.compose.foundation.layout.d.f1286c);
            rVar2.b0(-2033666414);
            Object Q2 = rVar2.Q();
            if (Q2 == eVar) {
                Q2 = new pd.s(sVar, i11);
                rVar2.k0(Q2);
            }
            rVar2.s(false);
            qu.i0.c(g10, null, null, false, null, null, null, false, (Function1) Q2, rVar2, 100663302, 254);
            g1.o e10 = androidx.compose.foundation.layout.d.e(bVar.a(lVar, g1.a.f16386h), 1.0f);
            if (sVar.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rVar2.b0(-2033606085);
            boolean h10 = rVar2.h(function1);
            Object Q3 = rVar2.Q();
            if (h10 || Q3 == eVar) {
                Q3 = new pd.f(function1, sVar, 2);
                rVar2.k0(Q3);
            }
            rVar2.s(false);
            yk.j.a(e10, z10, (Function0) Q3, rVar2, 0, 0);
            v.e.y(rVar2, false, true, false, false);
            return;
        }
        al.d.v0();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0211, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r15.Q(), java.lang.Integer.valueOf(r10)) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m(t0.n r63, int r64) {
        /*
            Method dump skipped, instructions count: 2422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.o0.m(t0.n, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r8.Q(), java.lang.Integer.valueOf(r11)) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(t0.n r84, int r85) {
        /*
            Method dump skipped, instructions count: 3172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.o0.a(t0.n, int):void");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rd.m mVar;
        int i10 = this.f26562a;
        Object obj3 = this.f26563b;
        Object obj4 = this.f26565d;
        Object obj5 = this.f26564c;
        switch (i10) {
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
                String mentionedUserId = (String) obj;
                String mentionedUsername = (String) obj2;
                Intrinsics.checkNotNullParameter(mentionedUserId, "mentionedUserId");
                Intrinsics.checkNotNullParameter(mentionedUsername, "mentionedUsername");
                if (!Intrinsics.a(mentionedUserId, ((yd.r) obj5).f41587f) && (mVar = (rd.m) obj4) != null) {
                    ChatMessage message = (ChatMessage) obj3;
                    Intrinsics.checkNotNullParameter(message, "message");
                    GroupChatFragment.I(mVar.f33634a, mentionedUserId, mentionedUsername);
                }
                return Unit.f23355a;
            case 12:
                String deeplink = (String) obj;
                AnalyticEvent analyticEvent = (AnalyticEvent) obj2;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                if (((HomePortfolioDto) obj5).getPortfolioListItems().size() == 1) {
                    ((Function2) obj4).invoke(deeplink, analyticEvent);
                } else {
                    ((t0.g1) obj3).setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                }
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
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
