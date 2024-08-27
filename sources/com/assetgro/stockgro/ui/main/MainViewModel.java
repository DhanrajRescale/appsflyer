package com.assetgro.stockgro.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import at.m;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.remote.request.AppCloneDataRequest;
import com.assetgro.stockgro.data.remote.response.AppVersionResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jt.d;
import kj.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mj.a;
import nf.s;
import nf.u;
import nf.v;
import nf.w;
import nf.y;
import nf.z;
import nt.h;
import okhttp3.HttpUrl;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/main/MainViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MainViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;
    public final e0 H;
    public final e0 I;
    public final e0 J;
    public final e0 K;
    public final e0 L;
    public final e0 M;
    public final e0 N;
    public final e0 O;
    public final e0 P;
    public final e0 Q;
    public final e0 R;
    public final e0 S;
    public final e0 T;
    public final e0 U;
    public final e0 V;
    public final e0 W;
    public final e0 X;
    public final e0 Y;
    public Boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f9596a0;

    /* renamed from: n, reason: collision with root package name */
    public final a f9597n;

    /* renamed from: o, reason: collision with root package name */
    public final qf.a f9598o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9599p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9600q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9601r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9602s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9603t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9604u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9605v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9606w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9607x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9608y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9609z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v16, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v21, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v22, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v24, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v25, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v26, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v27, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v28, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v29, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v30, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v31, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v32, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v33, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v34, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v35, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v36, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MainViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, a remoteConfigUtils, qf.a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(remoteConfigUtils, "remoteConfigUtils");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9597n = remoteConfigUtils;
        this.f9598o = maintenanceConfigManager;
        this.f9599p = new LiveData();
        this.f9600q = new LiveData();
        this.f9601r = new LiveData();
        this.f9602s = new LiveData();
        this.f9603t = new LiveData();
        this.f9604u = new LiveData();
        this.f9605v = new LiveData();
        this.f9606w = new LiveData();
        this.f9607x = new LiveData();
        this.f9608y = new LiveData();
        this.f9609z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData();
        this.D = new LiveData();
        this.E = new LiveData();
        this.F = new LiveData();
        this.G = new LiveData();
        this.H = new LiveData();
        this.I = new LiveData();
        this.J = new LiveData();
        this.K = new LiveData();
        this.L = new LiveData();
        this.M = new LiveData();
        this.N = new LiveData();
        this.O = new LiveData();
        this.P = new LiveData();
        this.Q = new LiveData();
        this.R = new LiveData();
        this.S = new LiveData();
        this.T = new LiveData();
        this.U = new LiveData();
        this.V = new LiveData();
        this.W = new LiveData();
        this.X = new LiveData();
        this.Y = new LiveData(Boolean.FALSE);
        g.H(u0.f(this), null, null, new w(this, null), 3);
        UserRepository userRepository2 = this.f9081d;
        if (!userRepository2.getNotificationIdUpdated()) {
            m<BaseResponseDto<String>> updateNotificationId = userRepository2.updateNotificationId(userRepository2.getFirebaseToken());
            e eVar = (e) this.f9079b;
            h hVar = new h(updateNotificationId.c(eVar.J()), eVar.Q(), 0);
            d dVar = new d(new jf.g(21, new s(this, 3)), new jf.g(22, nf.m.f28657g));
            hVar.a(dVar);
            this.f9080c.c(dVar);
        }
        g.H(u0.f(this), null, null, new y(this, null), 3);
        g.H(u0.f(this), null, null, new u(this, null), 3);
        if (WifiService.INSTANCE.getInstance().isOnline()) {
            g.H(u0.f(this), null, null, new v(this, null), 3);
        }
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        String deepLinkPath;
        UserRepository userRepository = this.f9081d;
        if (userRepository.getIsDeepLinkActive() && (deepLinkPath = userRepository.getDeepLinkPath()) != null && deepLinkPath.length() != 0) {
            int hashCode = deepLinkPath.hashCode();
            e0 e0Var = this.f9604u;
            e0 e0Var2 = this.f9605v;
            switch (hashCode) {
                case -2017814003:
                    if (deepLinkPath.equals("unlock_portfolio")) {
                        k();
                        this.N.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -1849961962:
                    if (deepLinkPath.equals("my_profile")) {
                        k();
                        this.L.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -1328149800:
                    if (deepLinkPath.equals("chat_group")) {
                        e0Var.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -1081306052:
                    if (deepLinkPath.equals("market")) {
                        k();
                        this.f9607x.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -897050771:
                    if (deepLinkPath.equals("social")) {
                        k();
                        e0Var.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -795192327:
                    if (deepLinkPath.equals("wallet")) {
                        k();
                        this.A.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -704332663:
                    if (deepLinkPath.equals("champions_chart")) {
                        k();
                        this.f9608y.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -600094315:
                    if (deepLinkPath.equals("friends")) {
                        k();
                        this.f9609z.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -371786843:
                    if (deepLinkPath.equals("exchange-redeemed")) {
                        k();
                        this.C.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case -251645283:
                    if (deepLinkPath.equals("check_for_updates")) {
                        k();
                        this.K.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 101142:
                    if (deepLinkPath.equals("faq")) {
                        k();
                        this.I.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 93078279:
                    if (deepLinkPath.equals("arena")) {
                        k();
                        e0Var2.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 148033975:
                    if (deepLinkPath.equals("manage_subscription")) {
                        k();
                        this.E.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 193276766:
                    if (deepLinkPath.equals("tutorial")) {
                        k();
                        this.J.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 229373044:
                    if (deepLinkPath.equals("edit_profile")) {
                        k();
                        this.M.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 422610498:
                    if (deepLinkPath.equals("rate_app")) {
                        k();
                        this.G.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1121781064:
                    if (deepLinkPath.equals("portfolio")) {
                        k();
                        this.f9606w.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1268654261:
                    if (deepLinkPath.equals("stockgyan")) {
                        k();
                        this.D.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1272354024:
                    if (deepLinkPath.equals("notifications")) {
                        k();
                        this.O.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1825383407:
                    if (deepLinkPath.equals("app_about")) {
                        k();
                        this.H.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1837678689:
                    if (deepLinkPath.equals("league_detail")) {
                        e0Var2.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1986759828:
                    if (deepLinkPath.equals("invite_friend")) {
                        k();
                        this.F.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1989774883:
                    if (deepLinkPath.equals("exchange")) {
                        k();
                        this.B.postValue(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            this.f9082e.postValue(new kj.h(k.f23231c, Integer.valueOf(R.string.checking_app_update)));
        }
        m<BaseResponseDto<AppVersionResponseDto>> latestAppVersion = this.f9081d.getLatestAppVersion();
        e eVar = (e) this.f9079b;
        h hVar = new h(latestAppVersion.c(eVar.J()), eVar.Q(), 0);
        d dVar = new d(new jf.g(15, new ja.g(this, z10, 4)), new jf.g(16, new s(this, 1)));
        hVar.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void j(AppCloneDataRequest appCloneData) {
        Intrinsics.checkNotNullParameter(appCloneData, "appCloneData");
        g.H(u0.f(this), null, null, new z(this, appCloneData, null), 3);
    }

    public final void k() {
        UserRepository userRepository = this.f9081d;
        userRepository.setIsDeepLinkActive(false);
        userRepository.setDeepLinkPath(HttpUrl.FRAGMENT_ENCODE_SET);
        userRepository.setDeepLinkPath(HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
