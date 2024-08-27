package v;

import a2.a1;
import android.content.Intent;
import android.os.Parcelable;
import b0.l1;
import b0.o1;
import b0.p1;
import b0.x1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.RecentPerformance;
import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.data.model.User;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListActivity;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.chat.message_invites.MessageInvitesActivity;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import com.assetgro.stockgro.ui.profile.portfolio.LeaguePortfolioHoldingActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.subscription.MySubscriptionFragment;
import com.assetgro.stockgro.ui.subscription.MySubscriptionViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d2.s1;
import d2.w0;
import i0.e2;
import i0.r2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.v0;
import l0.z0;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.o3;
import t0.r1;
import x.y0;

/* loaded from: classes.dex */
public final class g extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i10) {
        super(3);
        this.f37502a = i10;
        this.f37503b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [i0.r2, java.lang.Object] */
    public final g1.o a(g1.o oVar, t0.n nVar) {
        int i10;
        Object obj = t0.m.f35080a;
        int i11 = this.f37502a;
        int i12 = 1;
        Object obj2 = this.f37503b;
        switch (i11) {
            case 2:
                t0.r rVar = (t0.r) nVar;
                rVar.b0(-1608161351);
                rVar.b0(1247446172);
                Function1 function1 = (Function1) obj2;
                boolean j10 = rVar.j(function1);
                Object Q = rVar.Q();
                if (j10 || Q == obj) {
                    Q = new b0.b0(function1);
                    rVar.k0(Q);
                }
                b0.b0 b0Var = (b0.b0) Q;
                rVar.s(false);
                rVar.s(false);
                return b0Var;
            case 3:
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-1415685722);
                rVar2.b0(1929180802);
                x1 x1Var = (x1) obj2;
                boolean h10 = rVar2.h(x1Var);
                Object Q2 = rVar2.Q();
                if (h10 || Q2 == obj) {
                    Q2 = new b0.t0(x1Var);
                    rVar2.k0(Q2);
                }
                b0.t0 t0Var = (b0.t0) Q2;
                rVar2.s(false);
                rVar2.s(false);
                return t0Var;
            case 4:
            default:
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(1980580247);
                w2.b bVar = (w2.b) rVar3.m(s1.f13620e);
                rVar3.b0(-1054027999);
                Object Q3 = rVar3.Q();
                if (Q3 == obj) {
                    Q3 = t0.t.n0(new w2.j(0L), o3.f35116a);
                    rVar3.k0(Q3);
                }
                g1 g1Var = (g1) Q3;
                rVar3.s(false);
                rVar3.b0(-1054027891);
                v0 v0Var = (v0) obj2;
                boolean j11 = rVar3.j(v0Var);
                Object Q4 = rVar3.Q();
                if (j11 || Q4 == obj) {
                    Q4 = new y0(6, v0Var, g1Var);
                    rVar3.k0(Q4);
                }
                Function0 function0 = (Function0) Q4;
                rVar3.s(false);
                rVar3.b0(-1054027761);
                boolean h11 = rVar3.h(bVar);
                Object Q5 = rVar3.Q();
                if (h11 || Q5 == obj) {
                    Q5 = new z0(bVar, g1Var, i12);
                    rVar3.k0(Q5);
                }
                rVar3.s(false);
                w.q qVar = l0.k0.f23783a;
                g1.o H = t0.t.H(oVar, d2.s.f13613k, new o(function0, (Function1) Q5));
                rVar3.s(false);
                return H;
            case 5:
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(1582736677);
                w2.b bVar2 = (w2.b) rVar4.m(s1.f13620e);
                o2.r rVar5 = (o2.r) rVar4.m(s1.f13623h);
                w2.k kVar = (w2.k) rVar4.m(s1.f13626k);
                rVar4.b0(31601728);
                j2.g0 g0Var = (j2.g0) obj2;
                boolean h12 = rVar4.h(g0Var) | rVar4.h(kVar);
                Object Q6 = rVar4.Q();
                if (h12 || Q6 == obj) {
                    Q6 = hl.f.M0(g0Var, kVar);
                    rVar4.k0(Q6);
                }
                j2.g0 g0Var2 = (j2.g0) Q6;
                rVar4.s(false);
                rVar4.b0(31601837);
                boolean h13 = rVar4.h(rVar5) | rVar4.h(g0Var2);
                Object Q7 = rVar4.Q();
                if (h13 || Q7 == obj) {
                    j2.b0 b0Var2 = g0Var2.f20722a;
                    o2.s sVar = b0Var2.f20664f;
                    o2.d0 d0Var = b0Var2.f20661c;
                    if (d0Var == null) {
                        d0Var = o2.d0.f29464f;
                    }
                    o2.z zVar = b0Var2.f20662d;
                    if (zVar != null) {
                        i10 = zVar.f29542a;
                    } else {
                        i10 = 0;
                    }
                    o2.a0 a0Var = b0Var2.f20663e;
                    if (a0Var != null) {
                        i12 = a0Var.f29453a;
                    }
                    Q7 = ((o2.t) rVar5).b(sVar, d0Var, i10, i12);
                    rVar4.k0(Q7);
                }
                l3 l3Var = (l3) Q7;
                Object h14 = e.h(rVar4, false, 31602174);
                Object obj3 = h14;
                if (h14 == obj) {
                    Object value = l3Var.getValue();
                    ?? obj4 = new Object();
                    obj4.f19181a = kVar;
                    obj4.f19182b = bVar2;
                    obj4.f19183c = rVar5;
                    obj4.f19184d = g0Var;
                    obj4.f19185e = value;
                    obj4.f19186f = e2.b(g0Var, bVar2, rVar5);
                    rVar4.k0(obj4);
                    obj3 = obj4;
                }
                r2 r2Var = (r2) obj3;
                rVar4.s(false);
                Object value2 = l3Var.getValue();
                if (kVar != r2Var.f19181a || !Intrinsics.a(bVar2, r2Var.f19182b) || !Intrinsics.a(rVar5, r2Var.f19183c) || !Intrinsics.a(g0Var2, r2Var.f19184d) || !Intrinsics.a(value2, r2Var.f19185e)) {
                    r2Var.f19181a = kVar;
                    r2Var.f19182b = bVar2;
                    r2Var.f19183c = rVar5;
                    r2Var.f19184d = g0Var2;
                    r2Var.f19185e = value2;
                    r2Var.f19186f = e2.b(g0Var2, bVar2, rVar5);
                }
                g1.l lVar = g1.l.f16404b;
                rVar4.b0(31602393);
                boolean j12 = rVar4.j(r2Var);
                Object Q8 = rVar4.Q();
                if (j12 || Q8 == obj) {
                    Q8 = new g(r2Var, 4);
                    rVar4.k0(Q8);
                }
                rVar4.s(false);
                g1.o h15 = androidx.compose.ui.layout.a.h(lVar, (hu.c) Q8);
                rVar4.s(false);
                return h15;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f37502a;
        Object obj4 = this.f37503b;
        switch (i10) {
            case 0:
                return i((a2.o0) obj, (a2.l0) obj2, ((w2.a) obj3).f38776a);
            case 1:
                ((Number) obj3).intValue();
                t0.r rVar = (t0.r) ((t0.n) obj2);
                rVar.b0(438406499);
                w.f0 f0Var = (w.f0) obj4;
                rVar.s(false);
                return f0Var;
            case 2:
                ((Number) obj3).intValue();
                return a((g1.o) obj, (t0.n) obj2);
            case 3:
                ((Number) obj3).intValue();
                return a((g1.o) obj, (t0.n) obj2);
            case 4:
                return i((a2.o0) obj, (a2.l0) obj2, ((w2.a) obj3).f38776a);
            case 5:
                ((Number) obj3).intValue();
                return a((g1.o) obj, (t0.n) obj2);
            case 6:
                ((Number) obj3).intValue();
                return a((g1.o) obj, (t0.n) obj2);
            case 7:
                t0.n nVar = ((m2) obj).f35084a;
                t0.n nVar2 = (t0.n) obj2;
                ((Number) obj3).intValue();
                int i11 = ((t0.r) nVar2).P;
                g1.o h02 = t0.t.h0(nVar2, (g1.o) obj4);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(509942095);
                c2.l.M.getClass();
                t0.t.v0(rVar2, h02, c2.k.f7747c);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar2, i11, iVar);
                }
                rVar2.s(false);
                return Unit.f23355a;
            case 8:
                String actionType = (String) obj;
                double doubleValue = ((Number) obj2).doubleValue();
                BuySellModifyFnoRequestDto body = (BuySellModifyFnoRequestDto) obj3;
                Intrinsics.checkNotNullParameter(actionType, "buyOrSell");
                Intrinsics.checkNotNullParameter(body, "buySellRequest");
                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_place_order_cta_click", null, 2, null);
                OptionOrderPageBottomSheetFragment optionOrderPageBottomSheetFragment = (OptionOrderPageBottomSheetFragment) obj4;
                optionOrderPageBottomSheetFragment.getClass();
                Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
                FirebaseAnalytics firebaseAnalytics = optionOrderPageBottomSheetFragment.f17273e;
                if (firebaseAnalytics != null) {
                    firebaseAnalytics.a(analyticEvent.getEventName(), el.l.Z(analyticEvent.getParam()));
                    Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
                    Analytics analytics = optionOrderPageBottomSheetFragment.f17274f;
                    if (analytics != null) {
                        analytics.track(analyticEvent.getEventName(), analyticEvent.getParam());
                        ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8623v = Double.valueOf(doubleValue);
                        body.setModel(((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8612k);
                        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = (OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t();
                        Intrinsics.checkNotNullParameter(actionType, "actionType");
                        Intrinsics.checkNotNullParameter(body, "body");
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            optionOrderPageBottomSheetViewModel.f9069e.setValue(ni.j.i("Not connected to internet"));
                        } else {
                            optionOrderPageBottomSheetViewModel.f9070f.setValue(Boolean.TRUE);
                            optionOrderPageBottomSheetViewModel.f8622u = body;
                            yk.g.H(androidx.lifecycle.u0.f(optionOrderPageBottomSheetViewModel), null, null, new ha.v(optionOrderPageBottomSheetViewModel, actionType, body, null), 3);
                        }
                        return Unit.f23355a;
                    }
                    Intrinsics.k("webEngageAnalytics");
                    throw null;
                }
                Intrinsics.k("_firebaseAnalytics");
                throw null;
            case 9:
                d((p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 10:
                d((p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 11:
                e((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 12:
                String groupId = (String) obj;
                ne.a inviteType = (ne.a) obj3;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(inviteType, "inviteType");
                MessageInvitesActivity messageInvitesActivity = (MessageInvitesActivity) obj4;
                Intent intent = new Intent(messageInvitesActivity, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", groupId);
                intent.putExtra("INVITE_GROUP_NAME", (String) obj2);
                intent.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) messageInvitesActivity.x()).f9100w.getValue());
                intent.putExtra("INVITE_TYPE", inviteType);
                messageInvitesActivity.f9421k.a(intent);
                return Unit.f23355a;
            case 13:
                d((p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 14:
                e((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 15:
                String parentCode = (String) obj;
                String subcode = (String) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(parentCode, "parentCode");
                Intrinsics.checkNotNullParameter(subcode, "subcode");
                ReportEntityActivity reportEntityActivity = (ReportEntityActivity) obj4;
                ReportEntityViewModel.h((ReportEntityViewModel) reportEntityActivity.x(), parentCode, subcode, null, 4);
                ((ReportEntityViewModel) reportEntityActivity.x()).f10017u = booleanValue;
                return Unit.f23355a;
            case 16:
                f((RecentPerformance) obj, (String) obj2, (kh.h) obj3);
                return Unit.f23355a;
            case 17:
                f((RecentPerformance) obj, (String) obj2, (kh.h) obj3);
                return Unit.f23355a;
            default:
                int intValue = ((Number) obj).intValue();
                SubscriptionPackages selectedSubscriptionPackages = (SubscriptionPackages) obj2;
                String interactionType = (String) obj3;
                Intrinsics.checkNotNullParameter(selectedSubscriptionPackages, "selectedSubscriptionPackages");
                Intrinsics.checkNotNullParameter(interactionType, "interactionType");
                MySubscriptionFragment mySubscriptionFragment = (MySubscriptionFragment) obj4;
                mySubscriptionFragment.y(new AnalyticEvent("app_sub_manage_plan_tapped", vt.p0.f(new Pair("interaction_type", interactionType), new Pair("tapped_on", selectedSubscriptionPackages.getTitle()))));
                MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) mySubscriptionFragment.r();
                mySubscriptionViewModel.f10510r.setValue(new kj.j(new Pair(Integer.valueOf(intValue), mySubscriptionViewModel.i())));
                return Unit.f23355a;
        }
    }

    public final void d(p1 DropdownMenuItem, t0.n nVar, int i10) {
        int i11 = this.f37502a;
        Object obj = this.f37503b;
        switch (i11) {
            case 9:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                al.d.C(((FnoPortfolio) obj).getPortfolioName(), null, n1.t.f28171c, 0L, null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1573248, 0, 131002);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                al.d.C(((yd.f) obj).f41544a, null, w0.e(R.color.black_1A1A1A, nVar), yk.j.e1(12), null, null, jh.c.f21373b, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130994);
                return;
            default:
                Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$Button");
                if ((i10 & 81) == 16) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                g1.f fVar = g1.a.f16389k;
                g1.l lVar = g1.l.f16404b;
                g1.o a10 = h2.l.a(lVar, false, lf.a0.f24637w);
                Widget widget = (Widget) obj;
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(693286680);
                l1 a11 = o1.a(b0.n.f2935a, fVar, rVar4, 48);
                rVar4.b0(-1323940314);
                int i12 = rVar4.P;
                r1 o10 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, a11, c2.k.f7749e);
                    t0.t.v0(rVar4, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar4, i12, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar4), rVar4, 2058660585);
                    String extraActionCtaTitle = widget.getExtraActionCtaTitle();
                    if (extraActionCtaTitle == null) {
                        extraActionCtaTitle = "Refer";
                    }
                    float f10 = 16;
                    al.d.C(extraActionCtaTitle, h2.l.a(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), false, lf.a0.f24638x), 0L, yk.j.e1(12), null, null, jh.c.f21375d, 0L, null, null, 0L, 1, false, 1, 0, null, null, rVar4, 1575936, 3120, 120756);
                    e.y(rVar4, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    public final void e(c0.c item, t0.n nVar, int i10) {
        int i11 = this.f37502a;
        Object obj = this.f37503b;
        switch (i11) {
            case 11:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                GroupInvitedListActivity groupInvitedListActivity = (GroupInvitedListActivity) obj;
                String string = groupInvitedListActivity.getString(R.string.invited_group_activity, groupInvitedListActivity.f9273k);
                long e10 = w0.e(R.color.black_1A1A1A, nVar);
                o2.v vVar = jh.c.f21375d;
                long e12 = yk.j.e1(14);
                Intrinsics.c(string);
                al.d.C(string, null, e10, e12, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130994);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                dp.b.v((PortfolioFnoHoldingsViewModel) obj, nVar, 8);
                return;
        }
    }

    public final void f(RecentPerformance recentPerformance, String str, kh.h portfolioUserType) {
        boolean i10;
        User user;
        int i11 = this.f37502a;
        Object obj = this.f37503b;
        switch (i11) {
            case 16:
                Intrinsics.checkNotNullParameter(recentPerformance, "recentPerformance");
                Intrinsics.checkNotNullParameter(portfolioUserType, "portfolioUserType");
                kh.g gVar = (kh.g) obj;
                UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) gVar.r();
                qf.b bVar = qf.b.f31941p;
                boolean z10 = true;
                if (userStatisticsViewModel.f10053p.b(bVar)) {
                    androidx.fragment.app.j0 activity = gVar.getActivity();
                    if (activity != null) {
                        Intent intent = new Intent(activity, (Class<?>) MaintenanceWindowActivity.class);
                        intent.putExtra("DATA", bVar);
                        intent.putExtra("SHOW_TOOLBAR", true);
                        intent.putExtra("TOOLBAR_TITLE", activity.getString(R.string.portfolio));
                        activity.startActivity(intent);
                        return;
                    }
                    return;
                }
                kh.h hVar = kh.h.f23140a;
                if (portfolioUserType != hVar) {
                    z10 = false;
                }
                if (portfolioUserType == hVar) {
                    i10 = ((UserStatisticsViewModel) gVar.r()).i(recentPerformance.getWinner().getUserId());
                } else {
                    i10 = ((UserStatisticsViewModel) gVar.r()).i(recentPerformance.getUser().getUserId());
                }
                if ((z10 && !i10) || (!z10 && !i10)) {
                    gVar.y(new AnalyticEvent("app_user_profile_league_portfolio", null, 2, null));
                }
                if (z10 && !i10) {
                    user = recentPerformance.getWinner();
                } else {
                    user = recentPerformance.getUser();
                }
                Intent intent2 = new Intent(gVar.getActivity(), (Class<?>) LeaguePortfolioHoldingActivity.class);
                intent2.putExtra("LEAGUE_ID", recentPerformance.getLeagueId());
                intent2.putExtra("PLAYER_USER", user);
                intent2.putExtra("LEAGUE_NAME", recentPerformance.getName());
                intent2.putExtra("IMAGE_URL_KEY", str);
                intent2.putExtra("ASSET_CLASS_TYPE", recentPerformance.getAssetClass());
                gVar.startActivity(intent2);
                return;
            default:
                Intrinsics.checkNotNullParameter(recentPerformance, "item");
                Intrinsics.checkNotNullParameter(portfolioUserType, "type");
                ((kh.k) obj).f23150h.b(recentPerformance, str, portfolioUserType);
                return;
        }
    }

    public final a2.n0 i(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        a2.n0 n02;
        int i10 = this.f37502a;
        Object obj = this.f37503b;
        switch (i10) {
            case 0:
                a1 E = l0Var.E(j10);
                a3.a.u(obj);
                if (!o0Var.a0()) {
                    n0 = o0Var.n0(E.f29a, E.f30b, vt.p0.d(), new f(0, E));
                    return n0;
                }
                int i11 = E.f29a;
                throw null;
            default:
                androidx.compose.foundation.layout.d.b(g1.l.f16404b, s0.g.f34069a, s0.g.f34069a, 3);
                long j11 = ((r2) obj).f19186f;
                a1 E2 = l0Var.E(w2.a.a(j10, kotlin.ranges.d.f((int) (j11 >> 32), w2.a.j(j10), w2.a.h(j10)), 0, kotlin.ranges.d.f((int) (j11 & 4294967295L), w2.a.i(j10), w2.a.g(j10)), 0, 10));
                n02 = o0Var.n0(E2.f29a, E2.f30b, vt.p0.d(), new f(10, E2));
                return n02;
        }
    }
}
