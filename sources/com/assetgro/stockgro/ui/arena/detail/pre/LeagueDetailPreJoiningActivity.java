package com.assetgro.stockgro.ui.arena.detail.pre;

import ab.g;
import android.content.Intent;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import ba.o1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.RedirectConfig;
import com.assetgro.stockgro.data.model.TemplateParams;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import com.assetgro.stockgro.ui.drawer.about.AppTncActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import eb.c;
import ed.a;
import el.l;
import gd.b;
import gd.d;
import iu.a0;
import java.util.HashMap;
import kj.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import vt.p0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/pre/LeagueDetailPreJoiningActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/arena/detail/pre/LeagueDetailPreJoiningViewModel;", "Lba/o1;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueDetailPreJoiningActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9045l = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9046k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_league_pre_joining;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((LeagueDetailPreJoiningViewModel) x()).f9084g.observe(this, new c(22, new cd.b(this, 2)));
        ((LeagueDetailPreJoiningViewModel) x()).f9059z.observe(this, new c(22, new cd.b(this, 3)));
        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = (LeagueDetailPreJoiningViewModel) x();
        leagueDetailPreJoiningViewModel.A.observe(this, new c(22, new cd.b(this, 4)));
        ((LeagueDetailPreJoiningViewModel) x()).f9056w.observe(this, new c(22, new cd.b(this, 5)));
        ((LeagueDetailPreJoiningViewModel) x()).f9058y.observe(this, new c(22, new cd.b(this, 6)));
        ((LeagueDetailPreJoiningViewModel) x()).f9050q.observe(this, new c(22, new cd.b(this, 7)));
        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel2 = (LeagueDetailPreJoiningViewModel) x();
        leagueDetailPreJoiningViewModel2.B.observe(this, new c(22, new cd.b(this, 8)));
        ((LeagueDetailPreJoiningViewModel) x()).f9052s.observe(this, new c(22, new cd.b(this, 9)));
        ((LeagueDetailPreJoiningViewModel) x()).f9053t.observe(this, new c(22, new cd.b(this, 10)));
        ((LeagueDetailPreJoiningViewModel) x()).f9054u.observe(this, new c(22, new cd.b(this, 0)));
        ((LeagueDetailPreJoiningViewModel) x()).f9055v.observe(this, new c(22, new cd.b(this, 1)));
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [gd.d, ed.a] */
    @Override // gd.b
    public final void I() {
        ((o1) w()).p(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("LEAGUE");
        Intrinsics.c(parcelableExtra);
        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = (LeagueDetailPreJoiningViewModel) x();
        String gameId = ((ArenaGame) parcelableExtra).getGameId();
        Intrinsics.checkNotNullParameter(gameId, "<set-?>");
        leagueDetailPreJoiningViewModel.f9049p = gameId;
        ((LeagueDetailPreJoiningViewModel) x()).f9057x.setValue(Boolean.valueOf(((o1) w()).H.isChecked()));
        ((o1) w()).A.setVisibility(8);
        ((o1) w()).C.setVisibility(8);
        o1 o1Var = (o1) w();
        String string = getString(R.string.prezone_info);
        Toolbar toolbar = o1Var.J;
        toolbar.setTitle(string);
        v(toolbar);
        u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: cd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LeagueDetailPreJoiningActivity f8099b;

            {
                this.f8099b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                LeagueDetailPreJoiningActivity this$0 = this.f8099b;
                switch (i11) {
                    case 0:
                        int i12 = LeagueDetailPreJoiningActivity.f9045l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 1:
                        int i13 = LeagueDetailPreJoiningActivity.f9045l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((LeagueDetailPreJoiningViewModel) this$0.x()).i();
                        return;
                    case 2:
                        int i14 = LeagueDetailPreJoiningActivity.f9045l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                        this$0.D(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                        if (((o1) this$0.w()).f5639x.getVisibility() == 8) {
                            ((o1) this$0.w()).f5639x.setVisibility(0);
                            l.H(300L, new d(this$0, 2));
                            return;
                        } else {
                            ((o1) this$0.w()).f5639x.setVisibility(8);
                            ((o1) this$0.w()).f5640y.setRotation(-90.0f);
                            return;
                        }
                    default:
                        int i15 = LeagueDetailPreJoiningActivity.f9045l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0, (Class<?>) AppTncActivity.class));
                        return;
                }
            }
        });
        boolean booleanExtra = getIntent().getBooleanExtra("VIEW_ONLY", false);
        String string2 = getString(R.string.arena_league_with_league_id);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = ((LeagueDetailPreJoiningViewModel) x()).f9049p;
        if (str != null) {
            final int i11 = 1;
            this.f17260h = a3.a.m(new Object[]{str}, 1, string2, "format(...)");
            ((LeagueDetailPreJoiningViewModel) x()).f9051r = booleanExtra;
            o parentLifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(parentLifecycle, "<get-lifecycle>(...)");
            Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
            this.f9046k = new d(parentLifecycle, new ga.a(5));
            o1 o1Var2 = (o1) w();
            a aVar = this.f9046k;
            if (aVar != null) {
                o1Var2.E.setAdapter(aVar);
                ((LeagueDetailPreJoiningViewModel) x()).h();
                o1 o1Var3 = (o1) w();
                o1Var3.B.setOnClickListener(new View.OnClickListener(this) { // from class: cd.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LeagueDetailPreJoiningActivity f8099b;

                    {
                        this.f8099b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i11;
                        LeagueDetailPreJoiningActivity this$0 = this.f8099b;
                        switch (i112) {
                            case 0:
                                int i12 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                            case 1:
                                int i13 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((LeagueDetailPreJoiningViewModel) this$0.x()).i();
                                return;
                            case 2:
                                int i14 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.A(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                                this$0.D(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                                if (((o1) this$0.w()).f5639x.getVisibility() == 8) {
                                    ((o1) this$0.w()).f5639x.setVisibility(0);
                                    l.H(300L, new d(this$0, 2));
                                    return;
                                } else {
                                    ((o1) this$0.w()).f5639x.setVisibility(8);
                                    ((o1) this$0.w()).f5640y.setRotation(-90.0f);
                                    return;
                                }
                            default:
                                int i15 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getClass();
                                this$0.startActivity(new Intent(this$0, (Class<?>) AppTncActivity.class));
                                return;
                        }
                    }
                });
                o1 o1Var4 = (o1) w();
                final int i12 = 2;
                o1Var4.f5641z.setOnClickListener(new View.OnClickListener(this) { // from class: cd.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LeagueDetailPreJoiningActivity f8099b;

                    {
                        this.f8099b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i12;
                        LeagueDetailPreJoiningActivity this$0 = this.f8099b;
                        switch (i112) {
                            case 0:
                                int i122 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                            case 1:
                                int i13 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((LeagueDetailPreJoiningViewModel) this$0.x()).i();
                                return;
                            case 2:
                                int i14 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.A(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                                this$0.D(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                                if (((o1) this$0.w()).f5639x.getVisibility() == 8) {
                                    ((o1) this$0.w()).f5639x.setVisibility(0);
                                    l.H(300L, new d(this$0, 2));
                                    return;
                                } else {
                                    ((o1) this$0.w()).f5639x.setVisibility(8);
                                    ((o1) this$0.w()).f5640y.setRotation(-90.0f);
                                    return;
                                }
                            default:
                                int i15 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getClass();
                                this$0.startActivity(new Intent(this$0, (Class<?>) AppTncActivity.class));
                                return;
                        }
                    }
                });
                ((LeagueDetailPreJoiningViewModel) x()).f9052s.postValue(new j(Boolean.TRUE));
                o1 o1Var5 = (o1) w();
                o1Var5.H.setOnCheckedChangeListener(new g(this, i12));
                o1 o1Var6 = (o1) w();
                final int i13 = 3;
                o1Var6.I.setOnClickListener(new View.OnClickListener(this) { // from class: cd.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LeagueDetailPreJoiningActivity f8099b;

                    {
                        this.f8099b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i13;
                        LeagueDetailPreJoiningActivity this$0 = this.f8099b;
                        switch (i112) {
                            case 0:
                                int i122 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.onBackPressed();
                                return;
                            case 1:
                                int i132 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((LeagueDetailPreJoiningViewModel) this$0.x()).i();
                                return;
                            case 2:
                                int i14 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.A(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                                this$0.D(new AnalyticEvent("app_league_info_game_rules_tap", new HashMap()));
                                if (((o1) this$0.w()).f5639x.getVisibility() == 8) {
                                    ((o1) this$0.w()).f5639x.setVisibility(0);
                                    l.H(300L, new d(this$0, 2));
                                    return;
                                } else {
                                    ((o1) this$0.w()).f5639x.setVisibility(8);
                                    ((o1) this$0.w()).f5640y.setRotation(-90.0f);
                                    return;
                                }
                            default:
                                int i15 = LeagueDetailPreJoiningActivity.f9045l;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getClass();
                                this$0.startActivity(new Intent(this$0, (Class<?>) AppTncActivity.class));
                                return;
                        }
                    }
                });
                return;
            }
            Intrinsics.k("prizeDistributionAdapter");
            throw null;
        }
        Intrinsics.k("gameId");
        throw null;
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10019) {
            if (i11 == -1 || i11 == 0) {
                ((LeagueDetailPreJoiningViewModel) x()).h();
            }
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        LeagueStatus leagueStatus;
        super.onBackPressed();
        HashMap f10 = p0.f(new Pair("exited_from_top", Boolean.FALSE));
        ArenaGame arenaGame = (ArenaGame) ((LeagueDetailPreJoiningViewModel) x()).f9050q.getValue();
        if (arenaGame != null) {
            leagueStatus = arenaGame.getLeagueStatus();
        } else {
            leagueStatus = null;
        }
        f10.put("league_status", String.valueOf(leagueStatus));
        AnalyticEvent analyticEvent = new AnalyticEvent("app_league_info_exit", f10);
        A(analyticEvent);
        D(analyticEvent);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar_with_share, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        InviteTemplateDto inviteTemplateDto;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.action_share) {
            LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = (LeagueDetailPreJoiningViewModel) x();
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                leagueDetailPreJoiningViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
            } else {
                ArenaGame arenaGame = (ArenaGame) leagueDetailPreJoiningViewModel.f9050q.getValue();
                if (arenaGame != null) {
                    inviteTemplateDto = new InviteTemplateDto("league_invite", new TemplateParams(arenaGame.getName(), String.valueOf(arenaGame.getPrizePool()), HttpUrl.FRAGMENT_ENCODE_SET), Boolean.TRUE, new RedirectConfig(a3.a.f("app.stockgro://stockgro.com/arena/league/", arenaGame.getGameId()), arenaGame.getGameId(), "appsflyer", leagueDetailPreJoiningViewModel.f9081d.getUserReferralCode()));
                } else {
                    inviteTemplateDto = null;
                }
                yk.g.H(u0.f(leagueDetailPreJoiningViewModel), null, null, new cd.g(leagueDetailPreJoiningViewModel, inviteTemplateDto, null), 3);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        yk.g.i(userRepository);
        ArenaRepository arenaRepository = activityComponent.f14246a.a();
        yk.g.i(arenaRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        yk.g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(LeagueDetailPreJoiningViewModel.class), new ea.l(schedulerProvider, compositeDisposable, userRepository, arenaRepository, maintenanceConfigManager, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, LeagueDetailPreJoiningViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeagueDetailPreJoiningViewModel.class, "<this>", LeagueDetailPreJoiningViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = (LeagueDetailPreJoiningViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(leagueDetailPreJoiningViewModel);
            this.f17254b = leagueDetailPreJoiningViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            yk.g.i(activityComponent.f14246a.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
