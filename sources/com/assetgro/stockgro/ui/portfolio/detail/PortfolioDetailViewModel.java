package com.assetgro.stockgro.ui.portfolio.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import el.l;
import fg.g;
import ft.b;
import ig.d;
import ig.h;
import ig.i;
import java.util.concurrent.TimeUnit;
import jt.e;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mt.c;
import mt.f;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/detail/PortfolioDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioDetailViewModel extends BaseViewModel {
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

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9777n;

    /* renamed from: o, reason: collision with root package name */
    public final ArenaRepository f9778o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9779p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9780q;

    /* renamed from: r, reason: collision with root package name */
    public String f9781r;

    /* renamed from: s, reason: collision with root package name */
    public String f9782s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9783t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9784u;

    /* renamed from: v, reason: collision with root package name */
    public e f9785v;

    /* renamed from: w, reason: collision with root package name */
    public String f9786w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9787x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9788y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9789z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v21, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v22, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v24, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v25, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PortfolioDetailViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, ArenaRepository arenaRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9777n = portfolioRepository;
        this.f9778o = arenaRepository;
        portfolioRepository.getUserId();
        new LiveData();
        this.f9779p = new LiveData();
        this.f9780q = new LiveData();
        this.f9781r = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9782s = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9783t = new LiveData();
        this.f9784u = new LiveData();
        this.f9787x = new LiveData();
        this.f9788y = new LiveData();
        this.f9789z = new LiveData();
        Boolean bool = Boolean.FALSE;
        this.A = new LiveData(bool);
        this.B = new LiveData();
        this.C = new LiveData(bool);
        this.D = new LiveData();
        this.E = new LiveData();
        this.F = new LiveData();
        this.G = new LiveData();
        this.H = new LiveData();
        this.I = new LiveData();
        ?? liveData = new LiveData();
        this.J = liveData;
        this.K = liveData;
        ?? liveData2 = new LiveData(8);
        this.L = liveData2;
        this.M = liveData2;
        ?? liveData3 = new LiveData();
        this.N = liveData3;
        this.O = liveData3;
        ?? liveData4 = new LiveData();
        this.P = liveData4;
        this.Q = liveData4;
        ?? liveData5 = new LiveData();
        this.R = liveData5;
        this.S = liveData5;
        ?? liveData6 = new LiveData();
        this.T = liveData6;
        this.U = liveData6;
        ?? liveData7 = new LiveData();
        this.V = liveData7;
        this.W = liveData7;
        ?? liveData8 = new LiveData();
        this.X = liveData8;
        this.Y = liveData8;
    }

    public static final void h(PortfolioDetailViewModel portfolioDetailViewModel) {
        portfolioDetailViewModel.j();
        f g10 = new c(at.e.a(1L, TimeUnit.SECONDS), new g(6, i.f19983a)).g(((kq.e) portfolioDetailViewModel.f9079b).J());
        e eVar = new e(new g(7, new h(portfolioDetailViewModel, 2)), gt.e.f17572d);
        g10.e(eVar);
        portfolioDetailViewModel.f9785v = eVar;
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void i() {
        e0 e0Var = this.f9084g;
        e0Var.postValue(Boolean.TRUE);
        try {
            yk.g.H(u0.f(this), null, null, new ig.e(this, null), 3);
        } catch (Exception e10) {
            e0Var.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
    }

    public final void j() {
        ArenaGame arenaGame = (ArenaGame) this.B.getValue();
        if (arenaGame != null) {
            int i10 = ig.c.f19969a[arenaGame.getLeagueStatus().ordinal()];
            e0 e0Var = this.L;
            e0 e0Var2 = this.C;
            e0 e0Var3 = this.A;
            if (i10 != 1) {
                e0 e0Var4 = this.H;
                e0 e0Var5 = this.G;
                e0 e0Var6 = this.F;
                e0 e0Var7 = this.D;
                e0 e0Var8 = this.E;
                e0 e0Var9 = this.f9787x;
                e0 e0Var10 = this.f9788y;
                e0 e0Var11 = this.f9789z;
                UserRepository userRepository = this.f9081d;
                long j10 = 0;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                Boolean bool = Boolean.FALSE;
                                e0Var3.postValue(bool);
                                e0Var2.postValue(bool);
                                e0Var.postValue(8);
                                return;
                            }
                            return;
                        }
                        e0Var3.postValue(Boolean.TRUE);
                        e0Var2.postValue(Boolean.FALSE);
                        Long winnerAnnounce = arenaGame.getWinnerAnnounce();
                        if (winnerAnnounce != null) {
                            j10 = winnerAnnounce.longValue();
                        }
                        String Q0 = l.Q0(j10, Long.valueOf(userRepository.getTimeDiff()));
                        e0Var11.postValue(Integer.valueOf(R.drawable.rounded_white_rectangle_corner_radius_12dp));
                        e0Var10.postValue(Integer.valueOf(R.string.winner_will_be_declared_in));
                        e0Var9.postValue(Q0);
                        e0Var.postValue(8);
                        e0Var8.postValue(Integer.valueOf(R.drawable.ic_timer_black));
                        e0Var7.postValue(Integer.valueOf(R.color.black_1A1A1A));
                        e0Var6.postValue(Integer.valueOf(R.drawable.rounded_orange_rectangle_bottom_corner_radius_32dp));
                        e0Var5.postValue(Integer.valueOf(R.color.orange));
                        e0Var4.postValue(Integer.valueOf(R.color.white));
                        return;
                    }
                    e0Var3.postValue(Boolean.TRUE);
                    e0Var2.postValue(Boolean.FALSE);
                    Long endDate = arenaGame.getEndDate();
                    if (endDate != null) {
                        j10 = endDate.longValue();
                    }
                    String Q02 = l.Q0(j10, Long.valueOf(userRepository.getTimeDiff()));
                    e0Var11.postValue(Integer.valueOf(R.drawable.rounded_orange_rectangle_corner_radius_12dp));
                    e0Var10.postValue(Integer.valueOf(R.string.game_end_message));
                    e0Var9.postValue(Q02);
                    e0Var.postValue(0);
                    e0Var8.postValue(Integer.valueOf(R.drawable.ic_timer));
                    e0Var7.postValue(Integer.valueOf(R.color.white));
                    e0Var6.postValue(Integer.valueOf(R.drawable.rounded_grey_rectangle_bottom_corner_radius_32dp));
                    e0Var5.postValue(Integer.valueOf(R.color.gray_light));
                    e0Var4.postValue(Integer.valueOf(R.color.black_1A1A1A));
                    return;
                }
                Boolean bool2 = Boolean.TRUE;
                e0Var3.postValue(bool2);
                e0Var2.postValue(bool2);
                Long portfolioSubmissionTime = arenaGame.getPortfolioSubmissionTime();
                if (portfolioSubmissionTime != null) {
                    j10 = portfolioSubmissionTime.longValue();
                }
                String Q03 = l.Q0(j10, Long.valueOf(userRepository.getTimeDiff()));
                e0Var11.postValue(Integer.valueOf(R.drawable.rounded_timer_green_rectangle_corner_radius_12dp));
                e0Var10.postValue(Integer.valueOf(R.string.game_is_about_to_start_in));
                e0Var9.postValue(Q03);
                e0Var.postValue(0);
                e0Var8.postValue(Integer.valueOf(R.drawable.ic_timer));
                e0Var7.postValue(Integer.valueOf(R.color.white));
                e0Var6.postValue(Integer.valueOf(R.drawable.rounded_grey_rectangle_bottom_corner_radius_32dp));
                e0Var5.postValue(Integer.valueOf(R.color.gray_light));
                e0Var4.postValue(Integer.valueOf(R.color.black_1A1A1A));
                return;
            }
            Boolean bool3 = Boolean.FALSE;
            e0Var2.postValue(bool3);
            e0Var3.postValue(bool3);
            e0Var.postValue(8);
        }
    }

    public final void k(Portfolio portfolio) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        this.I.postValue(portfolio);
        this.X.postValue(new j(portfolio));
        String portfolioStatus = portfolio.getPortfolioStatus();
        String portfolioName = HttpUrl.FRAGMENT_ENCODE_SET;
        if (portfolioStatus == null) {
            portfolioStatus = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        this.f9781r = portfolioStatus;
        String portfolioName2 = portfolio.getPortfolioName();
        if (portfolioName2 != null) {
            portfolioName = portfolioName2;
        }
        String portfolioId = portfolio.getPortfolioId();
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f9780q.postValue(new BottomSheetItem(portfolioName, portfolioId));
        e eVar = this.f9785v;
        if (eVar != null) {
            b.b(eVar);
        }
        e0 e0Var = this.A;
        Boolean bool = Boolean.FALSE;
        e0Var.postValue(bool);
        String assetClass = portfolio.getAssetClass();
        boolean a10 = Intrinsics.a(assetClass, "EQUITY");
        e0 e0Var2 = this.J;
        if (a10) {
            e0Var2.postValue(new z9.h(R.string.text_add_stocks, new Object[0]));
        } else if (Intrinsics.a(assetClass, "OPTIONS")) {
            e0Var2.postValue(new z9.h(R.string.add_options, new Object[0]));
        }
        if (!portfolio.isPortfolioLinkedToPrepZone()) {
            this.C.setValue(bool);
            this.L.setValue(0);
            return;
        }
        this.f9786w = portfolio.getLeagueId();
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(ni.j.i("Not connected to internet"));
        } else {
            yk.g.H(u0.f(this), null, null, new d(this, null), 3);
        }
    }
}
