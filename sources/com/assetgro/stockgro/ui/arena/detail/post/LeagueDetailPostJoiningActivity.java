package com.assetgro.stockgro.ui.arena.detail.post;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import ba.m1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.j;
import ea.v;
import eb.c;
import el.l;
import gd.b;
import iu.a0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jt.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import mt.f;
import nt.h;
import qu.i0;
import yc.a;
import yc.d;
import yc.m;
import yk.g;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/LeagueDetailPostJoiningActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/arena/detail/post/LeagueDetailPostJoiningViewModel;", "Lba/m1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueDetailPostJoiningActivity extends b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f8982n = 0;

    /* renamed from: k, reason: collision with root package name */
    public LeagueSharedViewModel f8983k;

    /* renamed from: l, reason: collision with root package name */
    public ChatSharedViewModel f8984l;

    /* renamed from: m, reason: collision with root package name */
    public m f8985m;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_league_post_joining;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((LeagueDetailPostJoiningViewModel) x()).E.observe(this, new c(15, new a(this, 9)));
        ((LeagueDetailPostJoiningViewModel) x()).f8989q.observe(this, new c(15, new a(this, 10)));
        ((LeagueDetailPostJoiningViewModel) x()).f8990r.observe(this, new c(15, new a(this, 11)));
        ((LeagueDetailPostJoiningViewModel) x()).f8991s.observe(this, new c(15, new a(this, 12)));
        ((LeagueDetailPostJoiningViewModel) x()).f8992t.observe(this, new c(15, new a(this, 13)));
        ((LeagueDetailPostJoiningViewModel) x()).f8994v.observe(this, new c(15, new a(this, 14)));
        ((LeagueDetailPostJoiningViewModel) x()).f8993u.observe(this, new c(15, new a(this, 15)));
        ((LeagueDetailPostJoiningViewModel) x()).A.observe(this, new c(15, new a(this, 16)));
        ((LeagueDetailPostJoiningViewModel) x()).f8998z.observe(this, new c(15, new a(this, 17)));
        ((LeagueDetailPostJoiningViewModel) x()).B.observe(this, new c(15, new a(this, 0)));
        ((LeagueDetailPostJoiningViewModel) x()).C.observe(this, new c(15, new a(this, 1)));
        ((LeagueDetailPostJoiningViewModel) x()).D.observe(this, new c(15, new a(this, 2)));
        LeagueSharedViewModel leagueSharedViewModel = this.f8983k;
        if (leagueSharedViewModel != null) {
            leagueSharedViewModel.f9064o.observe(this, new c(15, new a(this, 3)));
            LeagueSharedViewModel leagueSharedViewModel2 = this.f8983k;
            if (leagueSharedViewModel2 != null) {
                leagueSharedViewModel2.f9065p.observe(this, new c(15, new a(this, 4)));
                ((LeagueDetailPostJoiningViewModel) x()).F.observe(this, new c(15, new a(this, 5)));
                K().C.observe(this, new c(15, new a(this, 6)));
                K().D.observe(this, new c(15, new a(this, 7)));
                K().E.observe(this, new c(15, new a(this, 8)));
                return;
            }
            Intrinsics.k("leagueSharedViewModel");
            throw null;
        }
        Intrinsics.k("leagueSharedViewModel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [yo.c, java.lang.Object] */
    @Override // gd.b
    public final void I() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("LEAGUE");
        Intrinsics.d(parcelableExtra, "null cannot be cast to non-null type com.assetgro.stockgro.data.model.arenaV2.ArenaGame");
        ArenaGame arenaGame = (ArenaGame) parcelableExtra;
        int intExtra = getIntent().getIntExtra("LEAGUE DETAIL POSITION", 0);
        ((LeagueDetailPostJoiningViewModel) x()).f8988p = arenaGame;
        u(((m1) w()).f5421x);
        m1 m1Var = (m1) w();
        m1Var.f5417t.m(arenaGame.getName(), arenaGame.getAssetClass(), arenaGame.getDisplayPic());
        LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = (LeagueDetailPostJoiningViewModel) x();
        e eVar = leagueDetailPostJoiningViewModel.H;
        if (eVar != null) {
            ft.b.b(eVar);
        }
        f g10 = new mt.c(at.e.a(1L, TimeUnit.SECONDS), new za.e(12, yc.e.f41483c)).g(((kq.e) leagueDetailPostJoiningViewModel.f9079b).J());
        e eVar2 = new e(new za.e(13, new yc.c(leagueDetailPostJoiningViewModel, 5)), gt.e.f17572d);
        g10.e(eVar2);
        leagueDetailPostJoiningViewModel.H = eVar2;
        d1 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        m mVar = new m(supportFragmentManager, lifecycle, getIntent().getExtras());
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f8985m = mVar;
        m1 m1Var2 = (m1) w();
        m mVar2 = this.f8985m;
        if (mVar2 != null) {
            m1Var2.f5422y.setAdapter(mVar2);
            if (intExtra != 0) {
                ((m1) w()).f5422y.setCurrentItem(intExtra);
            }
            ((m1) w()).f5422y.setUserInputEnabled(true);
            m1 m1Var3 = (m1) w();
            m1 m1Var4 = (m1) w();
            new n(m1Var3.f5420w, m1Var4.f5422y, new vc.b(this, 1)).a();
            m1 m1Var5 = (m1) w();
            m1Var5.f5420w.a(new Object());
            m1 m1Var6 = (m1) w();
            m1Var6.f5421x.setNavigationOnClickListener(new j(this, 23));
            Toolbar toolbar = ((m1) w()).f5421x;
            Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
            v(toolbar);
            m1 m1Var7 = (m1) w();
            m1Var7.f5416s.setOnOptionSelected(new va.b(this, 0));
            LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel2 = (LeagueDetailPostJoiningViewModel) x();
            String groupId = arenaGame.getGameId();
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            g.H(u0.f(leagueDetailPostJoiningViewModel2), null, null, new d(leagueDetailPostJoiningViewModel2, groupId, null), 3);
            return;
        }
        Intrinsics.k("leaguePostJoiningTabAdapter");
        throw null;
    }

    public final ChatSharedViewModel K() {
        ChatSharedViewModel chatSharedViewModel = this.f8984l;
        if (chatSharedViewModel != null) {
            return chatSharedViewModel;
        }
        Intrinsics.k("chatSharedViewModel");
        throw null;
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (((m1) w()).f5416s.D.getVisibility() == 0) {
            e0 e0Var = K().G;
            Unit unit = Unit.f23355a;
            e0Var.postValue(new kj.j(unit));
            K().E.postValue(new kj.j(unit));
            return;
        }
        if (K().f9133n) {
            K().F.postValue(new kj.j(Unit.f23355a));
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.menu_league, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId != R.id.menu_options_exit_league) {
            if (itemId != R.id.menu_options_league_info) {
                if (itemId == R.id.menu_options_report_league) {
                    int i10 = lc.e.f24523j;
                    Bundle bundle = new Bundle();
                    lc.e eVar = new lc.e();
                    eVar.setArguments(bundle);
                    eVar.show(getSupportFragmentManager(), "LeagueReportBottomSheetDialogFragment");
                }
            } else {
                LeagueStatus leagueStatus = null;
                AnalyticEvent analyticEvent = new AnalyticEvent("app_league_info_open", null, 2, null);
                ArenaGame arenaGame = ((LeagueDetailPostJoiningViewModel) x()).f8988p;
                if (arenaGame != null) {
                    analyticEvent.getParam().putAll(l.j0(arenaGame));
                }
                HashMap<String, Object> param = analyticEvent.getParam();
                ArenaGame arenaGame2 = ((LeagueDetailPostJoiningViewModel) x()).f8988p;
                if (arenaGame2 != null) {
                    leagueStatus = arenaGame2.getLeagueStatus();
                }
                param.put("league_status", String.valueOf(leagueStatus));
                analyticEvent.getParam().put("is_continue", Boolean.TRUE);
                A(analyticEvent);
                D(analyticEvent);
                Intent intent = new Intent(this, (Class<?>) LeagueDetailPreJoiningActivity.class);
                intent.putExtra("LEAGUE", ((LeagueDetailPostJoiningViewModel) x()).f8988p);
                intent.putExtra("VIEW_ONLY", true);
                startActivity(intent);
            }
        } else {
            ((LeagueDetailPostJoiningViewModel) x()).E.postValue(Unit.f23355a);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!kj.a.f23207b) {
            LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = (LeagueDetailPostJoiningViewModel) x();
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                leagueDetailPostJoiningViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                return;
            }
            ct.b[] bVarArr = new ct.b[1];
            h c10 = leagueDetailPostJoiningViewModel.f9081d.getIndianTimeZoneTime().c(((kq.e) leagueDetailPostJoiningViewModel.f9079b).J());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            at.l lVar = st.e.f34774b;
            if (timeUnit != null) {
                if (lVar != null) {
                    jt.d dVar = new jt.d(new za.e(10, new yc.c(leagueDetailPostJoiningViewModel, 2)), new za.e(11, yc.e.f41482b));
                    try {
                        nt.l lVar2 = new nt.l(dVar, null, 2L, timeUnit);
                        dVar.c(lVar2);
                        ft.b.d(lVar2.f29152b, lVar.c(lVar2, 2L, timeUnit));
                        c10.a(lVar2);
                        bVarArr[0] = dVar;
                        leagueDetailPostJoiningViewModel.f9080c.e(bVarArr);
                        return;
                    } catch (NullPointerException e10) {
                        throw e10;
                    } catch (Throwable th2) {
                        zq.f.l0(th2);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th2);
                        throw nullPointerException;
                    }
                }
                throw new NullPointerException("scheduler is null");
            }
            throw new NullPointerException("unit is null");
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        ArenaRepository arenaRepository = activityComponent.f14246a.a();
        g.i(arenaRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(LeagueDetailPostJoiningViewModel.class), new ea.g(schedulerProvider, compositeDisposable, arenaRepository, chatRepository, userRepository, maintenanceConfigManager));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, LeagueDetailPostJoiningViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeagueDetailPostJoiningViewModel.class, "<this>", LeagueDetailPostJoiningViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = (LeagueDetailPostJoiningViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(leagueDetailPostJoiningViewModel);
            this.f17254b = leagueDetailPostJoiningViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            v vVar2 = (v) activityComponent.f14247b;
            kq.e schedulerProvider2 = activityComponent.f14246a.k();
            ct.a compositeDisposable2 = activityComponent.f14246a.c();
            UserRepository userRepository2 = activityComponent.f14246a.m();
            g.i(userRepository2);
            ChatRepository chatRepository2 = activityComponent.f14246a.b();
            g.i(chatRepository2);
            vVar2.getClass();
            Intrinsics.checkNotNullParameter(schedulerProvider2, "schedulerProvider");
            Intrinsics.checkNotNullParameter(compositeDisposable2, "compositeDisposable");
            Intrinsics.checkNotNullParameter(userRepository2, "userRepository");
            Intrinsics.checkNotNullParameter(chatRepository2, "chatRepository");
            ca.c factory2 = new ca.c(a0.a(LeagueSharedViewModel.class), new ea.d(schedulerProvider2, compositeDisposable2, userRepository2, chatRepository2, 5));
            b bVar2 = vVar2.f15290a;
            h1 c11 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar2, "owner", factory2, "factory");
            y4.c defaultCreationExtras2 = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar2, "owner", c11, "store");
            Intrinsics.checkNotNullParameter(factory2, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
            h.c h12 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c11, factory2, defaultCreationExtras2, LeagueSharedViewModel.class, "modelClass");
            iu.e b11 = a3.a.b(LeagueSharedViewModel.class, "<this>", LeagueSharedViewModel.class, "modelClass", "modelClass");
            String s10 = i0.s(b11);
            if (s10 != null) {
                LeagueSharedViewModel leagueSharedViewModel = (LeagueSharedViewModel) h12.G(b11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s10));
                g.j(leagueSharedViewModel);
                this.f8983k = leagueSharedViewModel;
                this.f8984l = activityComponent.b();
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
