package m0;

import android.content.Intent;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.chat.create_compose.screens.create_group.GroupCreateHostActivityCompose;
import com.assetgro.stockgro.ui.chat.detail.members.compose.AddMembersHostComposeActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i10, Object obj, Object obj2, Object obj3) {
        super(3);
        this.f26267a = i10;
        this.f26268b = obj;
        this.f26269c = obj2;
        this.f26270d = obj3;
    }

    public final void a(b0.z ExposedDropdownMenu, t0.n nVar, int i10) {
        String str;
        to.e eVar = t0.m.f35080a;
        int i11 = this.f26267a;
        int i12 = 9;
        int i13 = 10;
        int i14 = 4;
        int i15 = 0;
        Object obj = this.f26270d;
        Object obj2 = this.f26269c;
        Object obj3 = this.f26268b;
        int i16 = 16;
        switch (i11) {
            case 1:
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                Function1 function1 = (Function1) obj2;
                t0.g1 g1Var = (t0.g1) obj;
                for (FnoPortfolio fnoPortfolio : (List) obj3) {
                    pp.b.e(new c0.s(i13, function1, fnoPortfolio, g1Var), null, false, null, null, b1.d.c(-516858049, new v.g(fnoPortfolio, i12), nVar), nVar, 196608, 30);
                }
                return;
            case 2:
            case 3:
            case 4:
            case 7:
            case 9:
            default:
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ModalBottomSheetLayout");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                UserProfileActivity userProfileActivity = (UserProfileActivity) obj3;
                Intent intent = userProfileActivity.getIntent();
                if (intent == null || (str = intent.getStringExtra("USER_NAME")) == null) {
                    str = "User";
                }
                qu.f0 f0Var = (qu.f0) obj2;
                w4 w4Var = (w4) obj;
                yk.j.e(str, false, new c0.s(25, userProfileActivity, f0Var, w4Var), new ib.j(13, w4Var, f0Var), nVar, 0, 2);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ModalBottomSheetLayout");
                if ((i10 & 81) == 16) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                ib.j jVar = new ib.j(i14, (w4) obj, (qu.f0) obj2);
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(1583360429);
                GroupCreateHostActivityCompose groupCreateHostActivityCompose = (GroupCreateHostActivityCompose) obj3;
                boolean h10 = rVar4.h(groupCreateHostActivityCompose);
                Object Q = rVar4.Q();
                if (h10 || Q == eVar) {
                    Q = new lc.b(groupCreateHostActivityCompose, 8);
                    rVar4.k0(Q);
                }
                rVar4.s(false);
                yk.j.P(jVar, (Function0) Q, rVar4, 0);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ModalBottomSheetLayout");
                if ((i10 & 81) == 16) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                ib.j jVar2 = new ib.j(i12, (w4) obj, (qu.f0) obj2);
                t0.r rVar6 = (t0.r) nVar;
                rVar6.b0(862803572);
                AddMembersHostComposeActivity addMembersHostComposeActivity = (AddMembersHostComposeActivity) obj3;
                boolean h11 = rVar6.h(addMembersHostComposeActivity);
                Object Q2 = rVar6.Q();
                if (h11 || Q2 == eVar) {
                    Q2 = new lc.b(addMembersHostComposeActivity, i16);
                    rVar6.k0(Q2);
                }
                rVar6.s(false);
                yk.j.P(jVar2, (Function0) Q2, rVar6, 0);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$DropdownMenu");
                if ((i10 & 81) == 16) {
                    t0.r rVar7 = (t0.r) nVar;
                    if (rVar7.G()) {
                        rVar7.V();
                        return;
                    }
                }
                Function1 function12 = (Function1) obj2;
                Function1 function13 = (Function1) obj;
                int i17 = 0;
                for (Object obj4 : (List) obj3) {
                    int i18 = i17 + 1;
                    if (i17 >= 0) {
                        String str2 = (String) obj4;
                        t0.r rVar8 = (t0.r) nVar;
                        rVar8.b0(1670250340);
                        boolean h12 = rVar8.h(function12) | rVar8.f(i17) | rVar8.h(function13);
                        Object Q3 = rVar8.Q();
                        if (h12 || Q3 == eVar) {
                            Q3 = new ka.c1(function12, i17, function13, 3);
                            rVar8.k0(Q3);
                        }
                        rVar8.s(false);
                        pp.b.e((Function0) Q3, null, false, null, null, b1.d.c(1679488144, new ug.d(str2, i15), rVar8), rVar8, 196608, 30);
                        i17 = i18;
                    } else {
                        vt.y.j();
                        throw null;
                    }
                }
                return;
            case 10:
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ModalBottomSheetLayout");
                if ((i10 & 81) == 16) {
                    t0.r rVar9 = (t0.r) nVar;
                    if (rVar9.G()) {
                        rVar9.V();
                        return;
                    }
                }
                ReportEntityActivity reportEntityActivity = (ReportEntityActivity) obj3;
                yk.j.W(new hh.a(reportEntityActivity, i14), new rb.f(i13, reportEntityActivity, (qu.f0) obj2, (w4) obj), reportEntityActivity.f10009k, nVar, 0, 0);
                return;
            case 11:
                Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ModalBottomSheetLayout");
                if ((i10 & 81) == 16) {
                    t0.r rVar10 = (t0.r) nVar;
                    if (rVar10.G()) {
                        rVar10.V();
                        return;
                    }
                }
                kh.y yVar = (kh.y) obj3;
                String str3 = yVar.f23188g;
                if (str3 != null) {
                    qu.f0 f0Var2 = (qu.f0) obj2;
                    w4 w4Var2 = (w4) obj;
                    yk.j.e(str3, false, new c0.s(24, yVar, f0Var2, w4Var2), new ib.j(11, w4Var2, f0Var2), nVar, 48, 0);
                    return;
                }
                Intrinsics.k("userName");
                throw null;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        switch (this.f26267a) {
            case 0:
                b0.p1 p1Var = (b0.p1) obj;
                t0.n nVar = (t0.n) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((t0.r) nVar).h(p1Var)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 19) == 18) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                Function2 function2 = (Function2) this.f26268b;
                g1.f fVar = g1.a.f16389k;
                int i11 = 0;
                if (function2 == null) {
                    t0.r rVar2 = (t0.r) nVar;
                    rVar2.b0(-512812154);
                    androidx.compose.foundation.layout.a.c(l0.f26441c, rVar2);
                    rVar2.s(false);
                } else {
                    t0.r rVar3 = (t0.r) nVar;
                    rVar3.b0(-512812095);
                    g1.o oVar = l0.f26442d;
                    rVar3.b0(693286680);
                    b0.l1 a10 = b0.o1.a(b0.n.f2935a, fVar, rVar3, 48);
                    rVar3.b0(-1323940314);
                    int i12 = rVar3.P;
                    t0.r1 o10 = rVar3.o();
                    c2.l.M.getClass();
                    c2.j jVar = c2.k.f7746b;
                    b1.c j10 = androidx.compose.ui.layout.a.j(oVar);
                    if (rVar3.f35166a instanceof t0.f) {
                        rVar3.e0();
                        if (rVar3.O) {
                            rVar3.n(jVar);
                        } else {
                            rVar3.n0();
                        }
                        t0.t.v0(rVar3, a10, c2.k.f7749e);
                        t0.t.v0(rVar3, o10, c2.k.f7748d);
                        c2.i iVar = c2.k.f7750f;
                        if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i12))) {
                            nn.d.s(i12, rVar3, i12, iVar);
                        }
                        nn.d.q(0, j10, new t0.m2(rVar3), rVar3, 2058660585);
                        dp.b.p(d1.f26028a.b(Float.valueOf(vl.b.u(rVar3))), function2, rVar3, 0);
                        v.e.y(rVar3, false, true, false, false);
                        rVar3.s(false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                }
                g1.o b10 = p1Var.b(androidx.compose.foundation.layout.d.c(g1.l.f16404b, 1.0f), 1.0f, true);
                Function2 function22 = (Function2) this.f26269c;
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(693286680);
                b0.l1 a11 = b0.o1.a(b0.n.f2935a, fVar, rVar4, 48);
                rVar4.b0(-1323940314);
                int i13 = rVar4.P;
                t0.r1 o11 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(b10);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, a11, c2.k.f7749e);
                    t0.t.v0(rVar4, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar4, i13, iVar2);
                    }
                    nn.d.q(0, j11, new t0.m2(rVar4), rVar4, 2058660585);
                    b9.a(((c9) rVar4.m(d9.f26076b)).f26015f, b1.d.b(rVar4, -1654084516, new g0(function22, i11)), rVar4, 48);
                    v.e.y(rVar4, false, true, false, false);
                    dp.b.p(d1.f26028a.b(Float.valueOf(vl.b.w(rVar4))), b1.d.b(rVar4, 2129753671, new h0((hu.c) this.f26270d, i11)), rVar4, 48);
                    return Unit.f23355a;
                }
                al.d.v0();
                throw null;
            case 1:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 2:
                d((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 3:
                ((Number) obj3).intValue();
                e((v.r) obj, (t0.n) obj2);
                return Unit.f23355a;
            case 4:
                d((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 5:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 6:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 7:
                ((Number) obj3).intValue();
                e((v.r) obj, (t0.n) obj2);
                return Unit.f23355a;
            case 8:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 9:
                d((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 10:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 11:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }

    public final void d(c0.c item, t0.n nVar, int i10) {
        to.e eVar = t0.m.f35080a;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f26267a;
        Object obj = this.f26270d;
        Object obj2 = this.f26268b;
        Object obj3 = this.f26269c;
        switch (i11) {
            case 2:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                yk.o.l((List) obj2, (nb.b) obj3, androidx.compose.foundation.layout.a.v(lVar, s0.g.f34069a, kp.j.R(16, nVar), 1), (Function1) obj, nVar, 8, 0);
                return;
            case 3:
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                t0.g1 g1Var = (t0.g1) obj3;
                boolean booleanValue = ((Boolean) g1Var.getValue()).booleanValue();
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(613251025);
                Object Q = rVar3.Q();
                if (Q == eVar) {
                    Q = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var, 25, rVar3);
                }
                Function1 function1 = (Function1) Q;
                rVar3.s(false);
                List list = (List) obj2;
                t0.g1 g1Var2 = (t0.g1) obj;
                int intValue = ((Number) g1Var2.getValue()).intValue();
                rVar3.b0(613256214);
                Object Q2 = rVar3.Q();
                if (Q2 == eVar) {
                    Q2 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var2, 26, rVar3);
                }
                rVar3.s(false);
                dp.b.t(booleanValue, function1, list, intValue, (Function1) Q2, rVar3, 24624);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) obj2;
                t0.g1 g1Var3 = (t0.g1) obj3;
                t0.g1 g1Var4 = (t0.g1) obj;
                t0.r rVar5 = (t0.r) nVar;
                rVar5.b0(-2033384074);
                w.e.x(0, 0, null, 7);
                rVar5.b0(-270254335);
                rVar5.s(false);
                w2.b bVar = (w2.b) rVar5.m(d2.s1.f13620e);
                rVar5.b0(-492369756);
                Object Q3 = rVar5.Q();
                if (Q3 == eVar) {
                    Q3 = new b3.s(bVar);
                    rVar5.k0(Q3);
                }
                rVar5.s(false);
                b3.s sVar = (b3.s) Q3;
                rVar5.b0(-492369756);
                Object Q4 = rVar5.Q();
                if (Q4 == eVar) {
                    Q4 = new b3.l();
                    rVar5.k0(Q4);
                }
                rVar5.s(false);
                b3.l lVar2 = (b3.l) Q4;
                rVar5.b0(-492369756);
                Object Q5 = rVar5.Q();
                if (Q5 == eVar) {
                    Q5 = t0.t.n0(Boolean.FALSE, t0.o3.f35116a);
                    rVar5.k0(Q5);
                }
                rVar5.s(false);
                t0.g1 g1Var5 = (t0.g1) Q5;
                rVar5.b0(-492369756);
                Object Q6 = rVar5.Q();
                if (Q6 == eVar) {
                    Q6 = new b3.n(lVar2);
                    rVar5.k0(Q6);
                }
                rVar5.s(false);
                b3.n nVar2 = (b3.n) Q6;
                rVar5.b0(-492369756);
                Object Q7 = rVar5.Q();
                if (Q7 == eVar) {
                    Q7 = t0.t.n0(Unit.f23355a, t0.h1.f35033a);
                    rVar5.k0(Q7);
                }
                rVar5.s(false);
                t0.g1 g1Var6 = (t0.g1) Q7;
                androidx.compose.ui.layout.a.a(h2.l.a(lVar, false, new pd.m(sVar, 0)), b1.d.b(rVar5, -1908965773, new v.q(g1Var6, lVar2, new pd.l(g1Var5, nVar2, 0), groupCreateViewModel, g1Var3, g1Var4)), new pd.k(g1Var6, sVar, nVar2, g1Var5, 0), rVar5, 48, 0);
                rVar5.s(false);
                return;
        }
    }

    public final void e(v.r AnimatedVisibility, t0.n nVar) {
        int i10 = this.f26267a;
        Object obj = this.f26270d;
        Object obj2 = this.f26269c;
        Object obj3 = this.f26268b;
        switch (i10) {
            case 3:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                t0.l3 l3Var = (t0.l3) obj;
                kp.j.v((String) obj3, ((sb.d) l3Var.getValue()).f34462t, ((sb.d) l3Var.getValue()).f34461s, (Function1) obj2, nVar, 3072, 0);
                return;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                pp.b.j(androidx.compose.foundation.layout.d.f1286c, null, 0L, 0L, null, s0.g.f34069a, b1.d.c(1035619833, new o0(10, (t0.g1) obj3, (e1.s) obj2, (Function1) obj), nVar), nVar, 1572870, 62);
                return;
        }
    }
}
