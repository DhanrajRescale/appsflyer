package bd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.RecyclerView;
import ba.kj;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.RedirectConfig;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.TemplateParams;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.options.OptionsListHostActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.stock.list.StockListHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n;
import ea.n0;
import el.l;
import gd.m;
import iu.a0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import ni.j;
import okhttp3.HttpUrl;
import rg.e;
import ut.g;
import ut.h;
import yc.f;
import yc.i;
import yc.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbd/d;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/arena/detail/post/LeaguePortfolioViewModel;", "Lba/kj;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends m<LeaguePortfolioViewModel, kj> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f6945m = 0;

    /* renamed from: g, reason: collision with root package name */
    public sg.a f6946g;

    /* renamed from: h, reason: collision with root package name */
    public rg.a f6947h;

    /* renamed from: i, reason: collision with root package name */
    public kg.a f6948i;

    /* renamed from: j, reason: collision with root package name */
    public e f6949j;

    /* renamed from: k, reason: collision with root package name */
    public LeagueSharedViewModel f6950k;

    /* renamed from: l, reason: collision with root package name */
    public final g f6951l = h.a(new lc.b(this, 3));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_leagues_porfolio;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        LeaguePortfolioViewModel leaguePortfolioViewModel = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel.E.observe(this, new eb.c(21, new b(this, 10)));
        LeaguePortfolioViewModel leaguePortfolioViewModel2 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel2.F.observe(this, new eb.c(21, new b(this, 21)));
        LeaguePortfolioViewModel leaguePortfolioViewModel3 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel3.G.observe(this, new eb.c(21, new b(this, 27)));
        LeaguePortfolioViewModel leaguePortfolioViewModel4 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel4.I.observe(this, new eb.c(21, new b(this, 28)));
        LeaguePortfolioViewModel leaguePortfolioViewModel5 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel5.H.observe(this, new eb.c(21, new b(this, 29)));
        LeaguePortfolioViewModel leaguePortfolioViewModel6 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel6.K.observe(this, new eb.c(21, new c(this, 0)));
        LeaguePortfolioViewModel leaguePortfolioViewModel7 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel7.V.observe(this, new eb.c(21, new c(this, 1)));
        LeaguePortfolioViewModel leaguePortfolioViewModel8 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel8.L.observe(this, new eb.c(21, new c(this, 2)));
        LeaguePortfolioViewModel leaguePortfolioViewModel9 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel9.M.observe(this, new eb.c(21, new c(this, 3)));
        LeaguePortfolioViewModel leaguePortfolioViewModel10 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel10.N.observe(this, new eb.c(21, new b(this, 0)));
        LeaguePortfolioViewModel leaguePortfolioViewModel11 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel11.P.observe(this, new eb.c(21, new b(this, 1)));
        LeaguePortfolioViewModel leaguePortfolioViewModel12 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel12.O.observe(this, new eb.c(21, new b(this, 2)));
        LeaguePortfolioViewModel leaguePortfolioViewModel13 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel13.J.observe(this, new eb.c(21, new b(this, 3)));
        LeaguePortfolioViewModel leaguePortfolioViewModel14 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel14.Q.observe(this, new eb.c(21, new b(this, 4)));
        LeaguePortfolioViewModel leaguePortfolioViewModel15 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel15.R.observe(this, new eb.c(21, new b(this, 5)));
        LeaguePortfolioViewModel leaguePortfolioViewModel16 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel16.S.observe(this, new eb.c(21, new b(this, 6)));
        LeaguePortfolioViewModel leaguePortfolioViewModel17 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel17.T.observe(this, new eb.c(21, new b(this, 7)));
        LeaguePortfolioViewModel leaguePortfolioViewModel18 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel18.U.observe(this, new eb.c(21, new b(this, 8)));
        LeaguePortfolioViewModel leaguePortfolioViewModel19 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel19.W.observe(this, new eb.c(21, new b(this, 9)));
        LeaguePortfolioViewModel leaguePortfolioViewModel20 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel20.X.observe(this, new eb.c(21, new b(this, 11)));
        ((LeaguePortfolioViewModel) r()).f9084g.observe(this, new eb.c(21, new b(this, 12)));
        LeaguePortfolioViewModel leaguePortfolioViewModel21 = (LeaguePortfolioViewModel) r();
        leaguePortfolioViewModel21.Y.observe(this, new eb.c(21, new b(this, 13)));
        ((LeaguePortfolioViewModel) r()).f9008w.observe(this, new eb.c(21, new b(this, 14)));
        ((LeaguePortfolioViewModel) r()).f9005t.observe(this, new eb.c(21, new b(this, 15)));
        ((LeaguePortfolioViewModel) r()).f9009x.observe(this, new eb.c(21, new b(this, 16)));
        g gVar = this.f6951l;
        ((LeagueDetailPostJoiningViewModel) gVar.getValue()).f8995w.observe(this, new eb.c(21, new b(this, 17)));
        ((LeagueDetailPostJoiningViewModel) gVar.getValue()).f8996x.observe(this, new eb.c(21, new b(this, 18)));
        ((LeagueDetailPostJoiningViewModel) gVar.getValue()).f8997y.observe(this, new eb.c(21, new b(this, 19)));
        ((LeaguePortfolioViewModel) r()).A.observe(this, new eb.c(21, new b(this, 20)));
        ((LeaguePortfolioViewModel) r()).f9010y.observe(this, new eb.c(21, new b(this, 22)));
        ((LeaguePortfolioViewModel) r()).f9011z.observe(this, new eb.c(21, new b(this, 23)));
        ((LeaguePortfolioViewModel) r()).f9087j.observe(this, new eb.c(21, new b(this, 24)));
        LeagueSharedViewModel leagueSharedViewModel = this.f6950k;
        if (leagueSharedViewModel != null) {
            leagueSharedViewModel.f9063n.observe(this, new eb.c(21, new b(this, 25)));
            ((LeaguePortfolioViewModel) r()).f9007v.observe(this, new eb.c(21, new b(this, 26)));
        } else {
            Intrinsics.k("leagueSharedViewModel");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [k7.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [k7.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [sg.a, gd.d] */
    /* JADX WARN: Type inference failed for: r7v49, types: [gd.d, rg.a] */
    @Override // gd.m
    public final void E(View view) {
        ArenaGame arenaGame;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            arenaGame = (ArenaGame) arguments.getParcelable("LEAGUE");
        } else {
            arenaGame = null;
        }
        if (!(arenaGame instanceof ArenaGame)) {
            arenaGame = null;
        }
        if (arenaGame != null) {
            ((LeaguePortfolioViewModel) r()).f9084g.postValue(Boolean.TRUE);
            LeaguePortfolioViewModel leaguePortfolioViewModel = (LeaguePortfolioViewModel) r();
            String assetClass = arenaGame.getAssetClass();
            Intrinsics.checkNotNullParameter(assetClass, "<set-?>");
            leaguePortfolioViewModel.B = assetClass;
            ((LeaguePortfolioViewModel) r()).f9002q = arenaGame.getGameId();
            LeaguePortfolioViewModel leaguePortfolioViewModel2 = (LeaguePortfolioViewModel) r();
            String leagueId = arenaGame.getGameId();
            Intrinsics.checkNotNullParameter(leagueId, "leagueId");
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                leaguePortfolioViewModel2.f9083f.setValue(j.i("Not connected to internet"));
            } else {
                yk.g.H(u0.f(leaguePortfolioViewModel2), null, null, new yc.h(leaguePortfolioViewModel2, leagueId, null), 3);
            }
            String assetClass2 = arenaGame.getAssetClass();
            if (Intrinsics.a(assetClass2, "EQUITY")) {
                ((kj) q()).f5255t.f6347s.setText(getString(R.string.total_traded_stocks));
                ((kj) q()).f5255t.f6352x.setText(getString(R.string.order_pending_league_portfolio_page_message_two));
            } else if (Intrinsics.a(assetClass2, "OPTIONS")) {
                ((kj) q()).f5255t.f6347s.setText(getString(R.string.total_traded_options));
                ((kj) q()).f5255t.f6352x.setText(getString(R.string.options_order_pending_league_portfolio_page_message_two));
            }
        }
        ((kj) q()).f5255t.f6347s.setVisibility(8);
        final int i10 = 2;
        ((kj) q()).f5256u.setOnRefreshListener(new vc.b(this, 2));
        String str = ((LeaguePortfolioViewModel) r()).B;
        if (str != null) {
            if (Intrinsics.a(str, "OPTIONS")) {
                o parentLifecycle = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(parentLifecycle, "<get-lifecycle>(...)");
                Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
                this.f6947h = new gd.d(parentLifecycle, new Object());
                RecyclerView recyclerView = ((kj) q()).f5255t.G;
                rg.a aVar = this.f6947h;
                if (aVar != null) {
                    recyclerView.setAdapter(aVar);
                    o lifecycle = getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    this.f6949j = new e(lifecycle);
                    RecyclerView recyclerView2 = ((kj) q()).f5255t.C;
                    e eVar = this.f6949j;
                    if (eVar != null) {
                        recyclerView2.setAdapter(eVar);
                    } else {
                        Intrinsics.k("frozenPortfolioOptionAdapter");
                        throw null;
                    }
                } else {
                    Intrinsics.k("portfolioSectorOptionsAdapter");
                    throw null;
                }
            } else {
                o parentLifecycle2 = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(parentLifecycle2, "<get-lifecycle>(...)");
                Intrinsics.checkNotNullParameter(parentLifecycle2, "parentLifecycle");
                this.f6946g = new gd.d(parentLifecycle2, new Object());
                RecyclerView recyclerView3 = ((kj) q()).f5255t.G;
                sg.a aVar2 = this.f6946g;
                if (aVar2 != null) {
                    recyclerView3.setAdapter(aVar2);
                    o lifecycle2 = getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
                    this.f6948i = new kg.a(lifecycle2);
                    RecyclerView recyclerView4 = ((kj) q()).f5255t.C;
                    kg.a aVar3 = this.f6948i;
                    if (aVar3 != null) {
                        recyclerView4.setAdapter(aVar3);
                    } else {
                        Intrinsics.k("frozenPortfolioStocksAdapter");
                        throw null;
                    }
                } else {
                    Intrinsics.k("portfolioSectorStocksAdapter");
                    throw null;
                }
            }
            final int i11 = 0;
            ((kj) q()).f5254s.setOnClickListener(new View.OnClickListener(this) { // from class: bd.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f6940b;

                {
                    this.f6940b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12;
                    InviteTemplateDto inviteTemplateDto;
                    int i13 = i11;
                    String str2 = null;
                    d this$0 = this.f6940b;
                    switch (i13) {
                        case 0:
                            int i14 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            f fVar = (f) ((LeaguePortfolioViewModel) this$0.r()).f9008w.getValue();
                            if (fVar != null) {
                                int ordinal = fVar.ordinal();
                                int i15 = 0;
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal == 2) {
                                            ArenaGame arenaGame2 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                            if (arenaGame2 != null) {
                                                i15 = l.o0(arenaGame2);
                                            }
                                            if (i15 == 0) {
                                                Intent intent = new Intent(this$0.requireContext(), (Class<?>) OptionsListHostActivity.class);
                                                UnifiedPortfolio unifiedPortfolio = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                                if (unifiedPortfolio != null) {
                                                    intent.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", unifiedPortfolio.getPortfolioId()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", unifiedPortfolio.toSimplePortfolio())));
                                                }
                                                this$0.startActivityForResult(intent, 10014);
                                                return;
                                            }
                                            Context requireContext = this$0.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                            hl.f.U0(requireContext, i15);
                                            return;
                                        }
                                        return;
                                    }
                                    ArenaGame arenaGame3 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                    if (arenaGame3 != null) {
                                        i15 = l.o0(arenaGame3);
                                    }
                                    if (i15 == 0) {
                                        Intent intent2 = new Intent(this$0.requireContext(), (Class<?>) StockListHostActivity.class);
                                        UnifiedPortfolio unifiedPortfolio2 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                        if (unifiedPortfolio2 != null) {
                                            intent2.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", unifiedPortfolio2.getPortfolioId()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", unifiedPortfolio2.toSimplePortfolio())));
                                        }
                                        this$0.startActivityForResult(intent2, 10014);
                                        return;
                                    }
                                    Context requireContext2 = this$0.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                    hl.f.U0(requireContext2, i15);
                                    return;
                                }
                                ArenaGame arenaGame4 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                if (arenaGame4 != null) {
                                    i12 = l.o0(arenaGame4);
                                } else {
                                    i12 = 0;
                                }
                                if (i12 == 0) {
                                    Intent intent3 = new Intent(this$0.getContext(), (Class<?>) PortfolioDetailActivity.class);
                                    UnifiedPortfolio unifiedPortfolio3 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                    if (unifiedPortfolio3 != null) {
                                        Portfolio simplePortfolio = unifiedPortfolio3.toSimplePortfolio();
                                        Pair[] pairArr = new Pair[3];
                                        UnifiedPortfolio unifiedPortfolio4 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                        if (unifiedPortfolio4 != null) {
                                            str2 = unifiedPortfolio4.getPortfolioId();
                                        }
                                        pairArr[0] = new Pair("PORTFOLIO_ID", str2);
                                        pairArr[1] = new Pair("PORTFOLIO", simplePortfolio);
                                        pairArr[2] = new Pair("SHOW_SPINNER", Boolean.FALSE);
                                        intent3.putExtras(hl.f.y(pairArr));
                                    }
                                    this$0.startActivityForResult(intent3, 10013);
                                    return;
                                }
                                Context requireContext3 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                hl.f.U0(requireContext3, i12);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            LeaguePortfolioViewModel leaguePortfolioViewModel3 = (LeaguePortfolioViewModel) this$0.r();
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                leaguePortfolioViewModel3.f9083f.setValue(j.i("Not connected to internet"));
                                return;
                            }
                            ArenaGame arenaGame5 = (ArenaGame) leaguePortfolioViewModel3.f9000o.getValue();
                            if (arenaGame5 != null) {
                                inviteTemplateDto = new InviteTemplateDto("league_invite", new TemplateParams(arenaGame5.getName(), String.valueOf(arenaGame5.getPrizePool()), HttpUrl.FRAGMENT_ENCODE_SET), Boolean.TRUE, new RedirectConfig(a3.a.f("app.stockgro://stockgro.com/arena/league/", arenaGame5.getGameId()), arenaGame5.getGameId(), "appsflyer", leaguePortfolioViewModel3.f9081d.getUserReferralCode()));
                            } else {
                                inviteTemplateDto = null;
                            }
                            leaguePortfolioViewModel3.f9084g.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(leaguePortfolioViewModel3), null, null, new i(leaguePortfolioViewModel3, inviteTemplateDto, null), 3);
                            return;
                        default:
                            int i17 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i18 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            final int i12 = 1;
            ((kj) q()).f5255t.f6350v.setOnClickListener(new View.OnClickListener(this) { // from class: bd.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f6940b;

                {
                    this.f6940b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122;
                    InviteTemplateDto inviteTemplateDto;
                    int i13 = i12;
                    String str2 = null;
                    d this$0 = this.f6940b;
                    switch (i13) {
                        case 0:
                            int i14 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            f fVar = (f) ((LeaguePortfolioViewModel) this$0.r()).f9008w.getValue();
                            if (fVar != null) {
                                int ordinal = fVar.ordinal();
                                int i15 = 0;
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal == 2) {
                                            ArenaGame arenaGame2 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                            if (arenaGame2 != null) {
                                                i15 = l.o0(arenaGame2);
                                            }
                                            if (i15 == 0) {
                                                Intent intent = new Intent(this$0.requireContext(), (Class<?>) OptionsListHostActivity.class);
                                                UnifiedPortfolio unifiedPortfolio = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                                if (unifiedPortfolio != null) {
                                                    intent.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", unifiedPortfolio.getPortfolioId()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", unifiedPortfolio.toSimplePortfolio())));
                                                }
                                                this$0.startActivityForResult(intent, 10014);
                                                return;
                                            }
                                            Context requireContext = this$0.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                            hl.f.U0(requireContext, i15);
                                            return;
                                        }
                                        return;
                                    }
                                    ArenaGame arenaGame3 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                    if (arenaGame3 != null) {
                                        i15 = l.o0(arenaGame3);
                                    }
                                    if (i15 == 0) {
                                        Intent intent2 = new Intent(this$0.requireContext(), (Class<?>) StockListHostActivity.class);
                                        UnifiedPortfolio unifiedPortfolio2 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                        if (unifiedPortfolio2 != null) {
                                            intent2.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", unifiedPortfolio2.getPortfolioId()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", unifiedPortfolio2.toSimplePortfolio())));
                                        }
                                        this$0.startActivityForResult(intent2, 10014);
                                        return;
                                    }
                                    Context requireContext2 = this$0.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                    hl.f.U0(requireContext2, i15);
                                    return;
                                }
                                ArenaGame arenaGame4 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                if (arenaGame4 != null) {
                                    i122 = l.o0(arenaGame4);
                                } else {
                                    i122 = 0;
                                }
                                if (i122 == 0) {
                                    Intent intent3 = new Intent(this$0.getContext(), (Class<?>) PortfolioDetailActivity.class);
                                    UnifiedPortfolio unifiedPortfolio3 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                    if (unifiedPortfolio3 != null) {
                                        Portfolio simplePortfolio = unifiedPortfolio3.toSimplePortfolio();
                                        Pair[] pairArr = new Pair[3];
                                        UnifiedPortfolio unifiedPortfolio4 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                        if (unifiedPortfolio4 != null) {
                                            str2 = unifiedPortfolio4.getPortfolioId();
                                        }
                                        pairArr[0] = new Pair("PORTFOLIO_ID", str2);
                                        pairArr[1] = new Pair("PORTFOLIO", simplePortfolio);
                                        pairArr[2] = new Pair("SHOW_SPINNER", Boolean.FALSE);
                                        intent3.putExtras(hl.f.y(pairArr));
                                    }
                                    this$0.startActivityForResult(intent3, 10013);
                                    return;
                                }
                                Context requireContext3 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                hl.f.U0(requireContext3, i122);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            LeaguePortfolioViewModel leaguePortfolioViewModel3 = (LeaguePortfolioViewModel) this$0.r();
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                leaguePortfolioViewModel3.f9083f.setValue(j.i("Not connected to internet"));
                                return;
                            }
                            ArenaGame arenaGame5 = (ArenaGame) leaguePortfolioViewModel3.f9000o.getValue();
                            if (arenaGame5 != null) {
                                inviteTemplateDto = new InviteTemplateDto("league_invite", new TemplateParams(arenaGame5.getName(), String.valueOf(arenaGame5.getPrizePool()), HttpUrl.FRAGMENT_ENCODE_SET), Boolean.TRUE, new RedirectConfig(a3.a.f("app.stockgro://stockgro.com/arena/league/", arenaGame5.getGameId()), arenaGame5.getGameId(), "appsflyer", leaguePortfolioViewModel3.f9081d.getUserReferralCode()));
                            } else {
                                inviteTemplateDto = null;
                            }
                            leaguePortfolioViewModel3.f9084g.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(leaguePortfolioViewModel3), null, null, new i(leaguePortfolioViewModel3, inviteTemplateDto, null), 3);
                            return;
                        default:
                            int i17 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i18 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            if (kj.a.f23207b) {
                ((kj) q()).f5255t.B.setVisibility(8);
            } else {
                ((kj) q()).f5255t.B.setVisibility(0);
            }
            ((kj) q()).f5255t.B.setOnClickListener(new View.OnClickListener(this) { // from class: bd.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f6940b;

                {
                    this.f6940b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122;
                    InviteTemplateDto inviteTemplateDto;
                    int i13 = i10;
                    String str2 = null;
                    d this$0 = this.f6940b;
                    switch (i13) {
                        case 0:
                            int i14 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            f fVar = (f) ((LeaguePortfolioViewModel) this$0.r()).f9008w.getValue();
                            if (fVar != null) {
                                int ordinal = fVar.ordinal();
                                int i15 = 0;
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal == 2) {
                                            ArenaGame arenaGame2 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                            if (arenaGame2 != null) {
                                                i15 = l.o0(arenaGame2);
                                            }
                                            if (i15 == 0) {
                                                Intent intent = new Intent(this$0.requireContext(), (Class<?>) OptionsListHostActivity.class);
                                                UnifiedPortfolio unifiedPortfolio = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                                if (unifiedPortfolio != null) {
                                                    intent.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", unifiedPortfolio.getPortfolioId()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", unifiedPortfolio.toSimplePortfolio())));
                                                }
                                                this$0.startActivityForResult(intent, 10014);
                                                return;
                                            }
                                            Context requireContext = this$0.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                            hl.f.U0(requireContext, i15);
                                            return;
                                        }
                                        return;
                                    }
                                    ArenaGame arenaGame3 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                    if (arenaGame3 != null) {
                                        i15 = l.o0(arenaGame3);
                                    }
                                    if (i15 == 0) {
                                        Intent intent2 = new Intent(this$0.requireContext(), (Class<?>) StockListHostActivity.class);
                                        UnifiedPortfolio unifiedPortfolio2 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                        if (unifiedPortfolio2 != null) {
                                            intent2.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", unifiedPortfolio2.getPortfolioId()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", unifiedPortfolio2.toSimplePortfolio())));
                                        }
                                        this$0.startActivityForResult(intent2, 10014);
                                        return;
                                    }
                                    Context requireContext2 = this$0.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                    hl.f.U0(requireContext2, i15);
                                    return;
                                }
                                ArenaGame arenaGame4 = (ArenaGame) ((LeaguePortfolioViewModel) this$0.r()).f9000o.getValue();
                                if (arenaGame4 != null) {
                                    i122 = l.o0(arenaGame4);
                                } else {
                                    i122 = 0;
                                }
                                if (i122 == 0) {
                                    Intent intent3 = new Intent(this$0.getContext(), (Class<?>) PortfolioDetailActivity.class);
                                    UnifiedPortfolio unifiedPortfolio3 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                    if (unifiedPortfolio3 != null) {
                                        Portfolio simplePortfolio = unifiedPortfolio3.toSimplePortfolio();
                                        Pair[] pairArr = new Pair[3];
                                        UnifiedPortfolio unifiedPortfolio4 = ((LeaguePortfolioViewModel) this$0.r()).f9003r;
                                        if (unifiedPortfolio4 != null) {
                                            str2 = unifiedPortfolio4.getPortfolioId();
                                        }
                                        pairArr[0] = new Pair("PORTFOLIO_ID", str2);
                                        pairArr[1] = new Pair("PORTFOLIO", simplePortfolio);
                                        pairArr[2] = new Pair("SHOW_SPINNER", Boolean.FALSE);
                                        intent3.putExtras(hl.f.y(pairArr));
                                    }
                                    this$0.startActivityForResult(intent3, 10013);
                                    return;
                                }
                                Context requireContext3 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                hl.f.U0(requireContext3, i122);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            LeaguePortfolioViewModel leaguePortfolioViewModel3 = (LeaguePortfolioViewModel) this$0.r();
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                leaguePortfolioViewModel3.f9083f.setValue(j.i("Not connected to internet"));
                                return;
                            }
                            ArenaGame arenaGame5 = (ArenaGame) leaguePortfolioViewModel3.f9000o.getValue();
                            if (arenaGame5 != null) {
                                inviteTemplateDto = new InviteTemplateDto("league_invite", new TemplateParams(arenaGame5.getName(), String.valueOf(arenaGame5.getPrizePool()), HttpUrl.FRAGMENT_ENCODE_SET), Boolean.TRUE, new RedirectConfig(a3.a.f("app.stockgro://stockgro.com/arena/league/", arenaGame5.getGameId()), arenaGame5.getGameId(), "appsflyer", leaguePortfolioViewModel3.f9081d.getUserReferralCode()));
                            } else {
                                inviteTemplateDto = null;
                            }
                            leaguePortfolioViewModel3.f9084g.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(leaguePortfolioViewModel3), null, null, new i(leaguePortfolioViewModel3, inviteTemplateDto, null), 3);
                            return;
                        default:
                            int i17 = d.f6945m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i18 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("leagueAssetClass");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10013 || i10 == 10014) {
            ((LeaguePortfolioViewModel) r()).h();
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        jt.e eVar = ((LeaguePortfolioViewModel) r()).f9004s;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        LeaguePortfolioViewModel leaguePortfolioViewModel = (LeaguePortfolioViewModel) r();
        jt.e eVar = leaguePortfolioViewModel.f9004s;
        if (eVar != null) {
            ft.b.b(eVar);
        }
        ArenaGame arenaGame = (ArenaGame) leaguePortfolioViewModel.f9000o.getValue();
        if (arenaGame != null) {
            leaguePortfolioViewModel.f9001p = arenaGame.getDerivedPortfolioId();
            leaguePortfolioViewModel.h();
        }
        leaguePortfolioViewModel.f9009x.postValue(Boolean.TRUE);
        mt.f g10 = new mt.c(at.e.a(120L, TimeUnit.SECONDS), new za.e(18, yc.e.f41494n)).g(((kq.e) leaguePortfolioViewModel.f9079b).J());
        jt.e eVar2 = new jt.e(new za.e(19, new k(leaguePortfolioViewModel, 1)), gt.e.f17572d);
        g10.e(eVar2);
        leaguePortfolioViewModel.f9004s = eVar2;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ArenaRepository arenaRepository = bVar.a();
        yk.g.i(arenaRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(LeaguePortfolioViewModel.class), new n(k10, c10, arenaRepository, userRepository, 4));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, LeaguePortfolioViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeaguePortfolioViewModel.class, "<this>", LeaguePortfolioViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            LeaguePortfolioViewModel leaguePortfolioViewModel = (LeaguePortfolioViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(leaguePortfolioViewModel);
            this.f17284b = leaguePortfolioViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f6950k = fragmentComponent.e();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
