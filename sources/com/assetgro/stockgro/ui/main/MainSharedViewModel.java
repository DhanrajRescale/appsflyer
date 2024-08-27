package com.assetgro.stockgro.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.NotificationsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fd.c;
import jj.a;
import jt.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.f;
import nf.j;
import nf.k;
import nf.m;
import nf.n;
import nt.h;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/main/MainSharedViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MainSharedViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final e0 L;
    public final e0 M;
    public final e0 N;
    public final e0 O;
    public final e0 P;
    public c Q;
    public final e0 R;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9583n;

    /* renamed from: o, reason: collision with root package name */
    public final NotificationsRepository f9584o;

    /* renamed from: p, reason: collision with root package name */
    public final a f9585p;

    /* renamed from: q, reason: collision with root package name */
    public final qf.a f9586q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9587r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9588s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9589t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9590u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9591v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9592w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9593x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9594y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9595z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v20, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MainSharedViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ChatRepository chatRepository, NotificationsRepository notificationsRepository, LogoutSubject logoutSubject, a appsFlyerAnalyticsEngineImpl, qf.a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(notificationsRepository, "notificationsRepository");
        Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9583n = chatRepository;
        this.f9584o = notificationsRepository;
        this.f9585p = appsFlyerAnalyticsEngineImpl;
        this.f9586q = maintenanceConfigManager;
        this.f9587r = new LiveData();
        this.f9588s = new LiveData();
        this.f9589t = new LiveData();
        this.f9590u = new LiveData();
        this.f9591v = new LiveData();
        this.f9592w = new LiveData();
        this.f9593x = new LiveData();
        this.f9594y = new LiveData();
        this.f9595z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData();
        this.D = new LiveData();
        this.E = new LiveData();
        this.F = new LiveData("arena-upcoming-leagues");
        this.G = "market-stocks";
        this.H = "social-discover";
        this.L = new LiveData();
        ?? liveData = new LiveData();
        this.M = liveData;
        this.N = liveData;
        ?? liveData2 = new LiveData();
        this.O = liveData2;
        this.P = liveData2;
        g.H(u0.f(this), null, null, new j(this, null), 3);
        f g10 = logoutSubject.getLogout().g(((e) schedulerProvider).J());
        jt.e eVar = new jt.e(new jf.g(10, new k(this, 0)), gt.e.f17572d);
        g10.e(eVar);
        compositeDisposable.c(eVar);
        this.R = new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(boolean z10) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9081d.logoutOffline();
            this.L.postValue(Boolean.FALSE);
        } else {
            g.H(u0.f(this), null, null, new n(z10, this, null), 3);
        }
    }

    public final void i() {
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9583n.getSocialGlobalRole().c(((e) this.f9079b).J());
        int i10 = 6;
        d dVar = new d(new jf.g(i10, new k(this, 5)), new jf.g(7, new k(this, i10)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void j() {
        this.M.postValue(new kj.j(Unit.f23355a));
    }

    public final void k() {
        h c10 = this.f9584o.getUnreadNotificationsCount().c(((e) this.f9079b).J());
        d dVar = new d(new jf.g(4, new k(this, 7)), new jf.g(5, m.f28654d));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
