package da;

import android.content.Context;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.NotificationsRepository;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.MarketSharedViewModel;
import com.assetgro.stockgro.missions.presentation.home.MissionSharedViewModel;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.assetgro.stockgro.ui.chat.home.SocialSharedViewModel;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQViewModel;
import com.assetgro.stockgro.ui.profile.UserProfileSharedViewModel;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import ea.i;
import ea.k;
import ea.l0;
import ea.n;
import ea.n0;
import ea.o0;
import ea.p;
import gd.m;
import iu.a0;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import yk.g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f14278a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14279b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f14280c;

    public f(n0 n0Var, o0 o0Var, b bVar) {
        this.f14278a = n0Var;
        this.f14279b = bVar;
        this.f14280c = o0Var;
    }

    public final ArenaMyLeaguesViewModel a() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ArenaRepository arenaRepository = bVar.a();
        g.i(arenaRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ArenaMyLeaguesViewModel.class), new n(k10, c10, arenaRepository, userRepository, 1));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ArenaMyLeaguesViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ArenaMyLeaguesViewModel.class, "<this>", ArenaMyLeaguesViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ArenaMyLeaguesViewModel arenaMyLeaguesViewModel = (ArenaMyLeaguesViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(arenaMyLeaguesViewModel);
            return arenaMyLeaguesViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final ChatSharedViewModel b() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        androidx.work.i0 workManager = (androidx.work.i0) bVar.f14273y.get();
        g.i(workManager);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(ChatSharedViewModel.class), new ea.f(k10, c10, userRepository, chatRepository, workManager, 1));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, ChatSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ChatSharedViewModel.class, "<this>", ChatSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ChatSharedViewModel chatSharedViewModel = (ChatSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(chatSharedViewModel);
            return chatSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final ContactsRepository c() {
        b bVar = this.f14279b;
        Context context = (Context) bVar.f14250b.get();
        g.i(context);
        NetworkService networkService = (NetworkService) bVar.f14260l.get();
        g.i(networkService);
        return new ContactsRepository(context, networkService);
    }

    public final KycFAQViewModel d() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        g.i(paymentRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(KycFAQViewModel.class), new k(k10, c10, userRepository, paymentRepository, 5));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, KycFAQViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycFAQViewModel.class, "<this>", KycFAQViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycFAQViewModel kycFAQViewModel = (KycFAQViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycFAQViewModel);
            return kycFAQViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final LeagueSharedViewModel e() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(LeagueSharedViewModel.class), new ea.d(k10, c10, userRepository, chatRepository, 11));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, LeagueSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(LeagueSharedViewModel.class, "<this>", LeagueSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            LeagueSharedViewModel leagueSharedViewModel = (LeagueSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(leagueSharedViewModel);
            return leagueSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final MainSharedViewModel f() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        NotificationsRepository notificationsRepository = (NotificationsRepository) bVar.f14270v.get();
        g.i(notificationsRepository);
        LogoutSubject logoutSubject = (LogoutSubject) bVar.f14255g.get();
        g.i(logoutSubject);
        jj.a appsFlyerAnalyticsEngineImpl = bVar.n();
        g.i(appsFlyerAnalyticsEngineImpl);
        qf.a maintenanceConfigManager = bVar.g();
        g.i(maintenanceConfigManager);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(notificationsRepository, "notificationsRepository");
        Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(MainSharedViewModel.class), new p(k10, c10, userRepository, chatRepository, notificationsRepository, logoutSubject, appsFlyerAnalyticsEngineImpl, maintenanceConfigManager, 1));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, MainSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MainSharedViewModel.class, "<this>", MainSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MainSharedViewModel mainSharedViewModel = (MainSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(mainSharedViewModel);
            return mainSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final MarketSharedViewModel g() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(MarketSharedViewModel.class), new ea.j0(k10, c10, userRepository, 2));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, MarketSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketSharedViewModel.class, "<this>", MarketSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketSharedViewModel marketSharedViewModel = (MarketSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketSharedViewModel);
            return marketSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final MissionSharedViewModel h() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        MissionsRepository missionsRepository = (MissionsRepository) bVar.G.get();
        g.i(missionsRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(MissionSharedViewModel.class), new l0(k10, c10, userRepository, missionsRepository, 1));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, MissionSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MissionSharedViewModel.class, "<this>", MissionSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MissionSharedViewModel missionSharedViewModel = (MissionSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(missionSharedViewModel);
            return missionSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final RedemptionHostViewModel i() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        PaymentRepository paymentRepository = bVar.i();
        g.i(paymentRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(RedemptionHostViewModel.class), new k(k10, c10, paymentRepository, userRepository, 9));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, RedemptionHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(RedemptionHostViewModel.class, "<this>", RedemptionHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RedemptionHostViewModel redemptionHostViewModel = (RedemptionHostViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(redemptionHostViewModel);
            return redemptionHostViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final SocialChatListViewModel j() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        FollowerRepository followerRepository = bVar.f();
        g.i(followerRepository);
        qf.a maintenanceConfigManager = bVar.g();
        g.i(maintenanceConfigManager);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(SocialChatListViewModel.class), new i(k10, c10, chatRepository, userRepository, followerRepository, maintenanceConfigManager, 2));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, SocialChatListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SocialChatListViewModel.class, "<this>", SocialChatListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(socialChatListViewModel);
            return socialChatListViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final SocialSharedViewModel k() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(SocialSharedViewModel.class), new ea.d(k10, c10, userRepository, chatRepository, 12));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, SocialSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SocialSharedViewModel.class, "<this>", SocialSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SocialSharedViewModel socialSharedViewModel = (SocialSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(socialSharedViewModel);
            return socialSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final StockSharedViewModel l() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(StockSharedViewModel.class), new ea.j0(k10, c10, userRepository, 12));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, StockSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockSharedViewModel.class, "<this>", StockSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockSharedViewModel stockSharedViewModel = (StockSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockSharedViewModel);
            return stockSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final UserProfileSharedViewModel m() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(UserProfileSharedViewModel.class), new ea.d(k10, c10, userRepository, chatRepository, 13));
        h1 h10 = e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, UserProfileSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UserProfileSharedViewModel.class, "<this>", UserProfileSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UserProfileSharedViewModel userProfileSharedViewModel = (UserProfileSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(userProfileSharedViewModel);
            return userProfileSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final UserStatisticsViewModel n() {
        b bVar = this.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        FollowerRepository followerRepository = bVar.f();
        g.i(followerRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        qf.a maintenanceConfigManager = bVar.g();
        g.i(maintenanceConfigManager);
        n0 n0Var = this.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(UserStatisticsViewModel.class), new i(k10, c10, userRepository, followerRepository, chatRepository, maintenanceConfigManager));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, UserStatisticsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UserStatisticsViewModel.class, "<this>", UserStatisticsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(userStatisticsViewModel);
            return userStatisticsViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
