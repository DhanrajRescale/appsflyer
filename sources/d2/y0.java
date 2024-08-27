package d2;

import android.view.Choreographer;
import android.view.inputmethod.InputConnection;
import android.widget.Toast;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.FTWeekTopStocksDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.arenaV2.Option;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.remote.response.LeagueEligibiltyResponseDto;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.host.ArenaAssetHostViewModel;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i10, Object obj, Object obj2) {
        super(1);
        this.f13686a = i10;
        this.f13687b = obj;
        this.f13688c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x009e, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, t0.n0] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, t0.n0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t0.n0 a(t0.o0 r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.y0.a(t0.o0):t0.n0");
    }

    public final void d(Option it) {
        String str;
        int i10 = this.f13686a;
        Object obj = this.f13688c;
        Object obj2 = this.f13687b;
        switch (i10) {
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                sc.k kVar = (sc.k) obj2;
                Toast.makeText(kVar.requireContext(), String.valueOf(it.getLabel()), 0).show();
                ut.g gVar = kVar.f34573i;
                ArenaUpcomingViewModel arenaUpcomingViewModel = (ArenaUpcomingViewModel) gVar.getValue();
                String str2 = (String) obj;
                if (str2 == null) {
                    str = "ALL";
                } else {
                    str = str2;
                }
                arenaUpcomingViewModel.getClass();
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                arenaUpcomingViewModel.f8961r = str;
                ArenaUpcomingViewModel arenaUpcomingViewModel2 = (ArenaUpcomingViewModel) gVar.getValue();
                String key = it.getKey();
                arenaUpcomingViewModel2.getClass();
                Intrinsics.checkNotNullParameter(key, "<set-?>");
                arenaUpcomingViewModel2.f8962s = key;
                ArenaUpcomingViewModel arenaUpcomingViewModel3 = (ArenaUpcomingViewModel) gVar.getValue();
                String defaultVal = it.getDefaultVal();
                arenaUpcomingViewModel3.getClass();
                Intrinsics.checkNotNullParameter(defaultVal, "<set-?>");
                arenaUpcomingViewModel3.f8963t = defaultVal;
                ((ArenaUpcomingViewModel) gVar.getValue()).h();
                if (Intrinsics.a(str2, "ALL")) {
                    String str3 = sc.k.f34569j;
                    String label = it.getLabel();
                    Intrinsics.checkNotNullParameter(label, "<set-?>");
                    sc.k.f34569j = label;
                    sc.k.f34571l = it;
                } else if (Intrinsics.a(str2, "EQUITY")) {
                    String str4 = sc.k.f34569j;
                    String label2 = it.getLabel();
                    Intrinsics.checkNotNullParameter(label2, "<set-?>");
                    sc.k.f34570k = label2;
                    sc.k.f34572m = it;
                }
                kVar.v(new AnalyticEvent("app_arena_upcoming_sort_applied", vt.p0.f(new Pair("selected", it.getLabel()))));
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ((Function1) obj2).invoke((Option) obj);
                return;
        }
    }

    public final void invoke(Throwable th2) {
        InputConnection inputConnection;
        switch (this.f13686a) {
            case 1:
                c2 c2Var = (c2) this.f13687b;
                synchronized (c2Var.f13386c) {
                    c2Var.f13388e = true;
                    p2.s sVar = c2Var.f13387d;
                    if (sVar != null && (inputConnection = sVar.f30605b) != null) {
                        sVar.a(inputConnection);
                        sVar.f30605b = null;
                    }
                    c2Var.f13387d = null;
                    Unit unit = Unit.f23355a;
                }
                ((c1) this.f13688c).f13381b.f30532a.e();
                return;
            case 2:
                h1 h1Var = (h1) this.f13687b;
                Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.f13688c;
                synchronized (h1Var.f13431e) {
                    h1Var.f13433g.remove(frameCallback);
                }
                return;
            default:
                ((j1) this.f13687b).f13467a.removeFrameCallback((Choreographer.FrameCallback) this.f13688c);
                return;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        FTWeekTopStocksDto ftWeekHighLow;
        List<StockDto> low;
        FTWeekTopStocksDto ftWeekHighLow2;
        List<StockDto> high;
        int i10 = this.f13686a;
        Object obj = this.f13688c;
        Object obj2 = this.f13687b;
        switch (i10) {
            case 18:
                MarketStocksListViewModel marketStocksListViewModel = (MarketStocksListViewModel) obj2;
                marketStocksListViewModel.f9084g.postValue(Boolean.FALSE);
                if (Intrinsics.a((String) obj, "FT_WEEK_HIGH")) {
                    HomePageTopDataResponse homePageTopDataResponse = (HomePageTopDataResponse) baseResponseDto.getData();
                    if (homePageTopDataResponse == null || (ftWeekHighLow2 = homePageTopDataResponse.getFtWeekHighLow()) == null || (high = ftWeekHighLow2.getHigh()) == null) {
                        return;
                    }
                    marketStocksListViewModel.k(new ta.j(high));
                    return;
                }
                HomePageTopDataResponse homePageTopDataResponse2 = (HomePageTopDataResponse) baseResponseDto.getData();
                if (homePageTopDataResponse2 == null || (ftWeekHighLow = homePageTopDataResponse2.getFtWeekHighLow()) == null || (low = ftWeekHighLow.getLow()) == null) {
                    return;
                }
                marketStocksListViewModel.k(new ta.j(low));
                return;
            case 19:
                MobileLoginViewModel mobileLoginViewModel = (MobileLoginViewModel) obj2;
                mobileLoginViewModel.f9084g.postValue(Boolean.FALSE);
                boolean success = baseResponseDto.getSuccess();
                String str = (String) obj;
                if (success) {
                    mobileLoginViewModel.f8728n.postValue(new kj.j(Unit.f23355a));
                    return;
                }
                if (success) {
                    return;
                }
                mobileLoginViewModel.f9081d.clearUserData();
                if (Intrinsics.a(baseResponseDto.getErrorCode(), "BLOCKED_USER")) {
                    mobileLoginViewModel.f8730p.postValue(new kj.j(str));
                    return;
                } else {
                    mobileLoginViewModel.f8731q.postValue(new z9.h(R.string.contact_stockgro_admin, new Object[0]));
                    return;
                }
            case 23:
                ArenaAssetHostViewModel arenaAssetHostViewModel = (ArenaAssetHostViewModel) obj2;
                arenaAssetHostViewModel.f9084g.postValue(Boolean.FALSE);
                LeagueEligibiltyResponseDto leagueEligibiltyResponseDto = (LeagueEligibiltyResponseDto) baseResponseDto.getData();
                if (leagueEligibiltyResponseDto != null) {
                    String str2 = (String) obj;
                    if (leagueEligibiltyResponseDto.getUserEligible()) {
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            arenaAssetHostViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        } else {
                            yk.g.H(androidx.lifecycle.u0.f(arenaAssetHostViewModel), null, null, new mc.b(str2, arenaAssetHostViewModel, null), 3);
                            return;
                        }
                    }
                    arenaAssetHostViewModel.f8944p.postValue(leagueEligibiltyResponseDto.getFilterReason());
                    return;
                }
                return;
            default:
                LeagueLeaderBoardViewModel leagueLeaderBoardViewModel = (LeagueLeaderBoardViewModel) obj2;
                androidx.lifecycle.e0 e0Var = leagueLeaderBoardViewModel.f9084g;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                TopLeaguesDto topLeaguesDto = (TopLeaguesDto) baseResponseDto.getData();
                if (topLeaguesDto != null) {
                    ArenaGame arenaGame = (ArenaGame) obj;
                    leagueLeaderBoardViewModel.f9023t.postValue(topLeaguesDto);
                    leagueLeaderBoardViewModel.M.postValue(Boolean.TRUE);
                    leagueLeaderBoardViewModel.f9024u.postValue(bool);
                    if (leagueLeaderBoardViewModel.T) {
                        return;
                    }
                    Long winnerAnnounce = arenaGame.getWinnerAnnounce();
                    if ((winnerAnnounce != null ? winnerAnnounce.longValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT : 0L) + 1800000 > System.currentTimeMillis()) {
                        leagueLeaderBoardViewModel.T = true;
                        yk.g.H(androidx.lifecycle.u0.f(leagueLeaderBoardViewModel), null, null, new zc.p(leagueLeaderBoardViewModel, null), 3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0872  */
    /* JADX WARN: Type inference failed for: r3v65, types: [androidx.navigation.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.y0.invoke(java.lang.Object):java.lang.Object");
    }
}
