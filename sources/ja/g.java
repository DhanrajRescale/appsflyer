package ja;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.e0;
import ba.x9;
import ba.y9;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.AppVersionResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.presentation.fno.OptionDetailHostActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnerViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, boolean z10, int i10) {
        super(1);
        this.f21264a = i10;
        this.f21266c = obj;
        this.f21265b = z10;
    }

    public final void a() {
        int i10 = this.f21264a;
        boolean z10 = this.f21265b;
        Object obj = this.f21266c;
        switch (i10) {
            case 5:
                ReportEntityViewModel reportEntityViewModel = (ReportEntityViewModel) obj;
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                reportEntityViewModel.f10021y.postValue(Boolean.valueOf(z10));
                return;
            default:
                UserProfileViewModel userProfileViewModel = (UserProfileViewModel) obj;
                userProfileViewModel.f9084g.postValue(Boolean.FALSE);
                userProfileViewModel.f10076t.postValue(Boolean.valueOf(z10));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21264a) {
            case 0:
                FnoOption it = (FnoOption) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_fno_stocklist_click", null, 2, null);
                i iVar = (i) this.f21266c;
                iVar.z(analyticEvent);
                iVar.B(analyticEvent);
                Intent intent = new Intent(iVar.requireContext(), (Class<?>) OptionDetailHostActivity.class);
                intent.putExtra("DATA", it);
                intent.putExtra("CALL_FROM_PORTFOLIO", this.f21265b);
                Bundle arguments = iVar.getArguments();
                if (arguments != null) {
                    intent.putExtras(arguments);
                }
                iVar.startActivity(intent);
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 2:
                Context ctx = (Context) obj;
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                LayoutInflater from = LayoutInflater.from(ctx);
                int i10 = x9.P;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                x9 x9Var = (x9) m4.m.g(from, R.layout.cell_league_upcoming_league_info, null, false, null);
                Intrinsics.checkNotNullExpressionValue(x9Var, "inflate(...)");
                if (this.f21265b) {
                    LinearLayout playerMinMax = x9Var.E;
                    Intrinsics.checkNotNullExpressionValue(playerMinMax, "playerMinMax");
                    zq.f.M(playerMinMax);
                    View playerMinMaxSeperator = x9Var.F;
                    Intrinsics.checkNotNullExpressionValue(playerMinMaxSeperator, "playerMinMaxSeperator");
                    zq.f.M(playerMinMaxSeperator);
                }
                if (kj.a.f23207b) {
                    x9Var.G.setText(ctx.getString(R.string.reward_pool));
                } else {
                    x9Var.G.setText(ctx.getString(R.string.bonus_pool));
                }
                y9 y9Var = (y9) x9Var;
                y9Var.O = (ArenaGame) this.f21266c;
                synchronized (y9Var) {
                    y9Var.S |= 1;
                }
                y9Var.a(6);
                y9Var.m();
                return x9Var.f27491e;
            case 3:
                GroupMember it2 = (GroupMember) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = this.f21265b;
                Object obj2 = this.f21266c;
                if (z10) {
                    GroupMemberListActivity groupMemberListActivity = (GroupMemberListActivity) obj2;
                    ((GroupMemberListViewModel) groupMemberListActivity.x()).f9290r.postValue(it2);
                    GroupMemberListActivity.L(groupMemberListActivity, it2);
                } else {
                    GroupMemberListActivity.K((GroupMemberListActivity) obj2, it2);
                }
                return Unit.f23355a;
            case 4:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(boolean z10, Object obj, int i10) {
        super(1);
        this.f21264a = i10;
        this.f21265b = z10;
        this.f21266c = obj;
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f21264a;
        boolean z10 = this.f21265b;
        Object obj = this.f21266c;
        switch (i10) {
            case 1:
                LeagueWinnerViewModel leagueWinnerViewModel = (LeagueWinnerViewModel) obj;
                leagueWinnerViewModel.f9084g.postValue(Boolean.FALSE);
                TopLeaguesDto topLeaguesDto = (TopLeaguesDto) baseResponseDto.getData();
                if (topLeaguesDto != null) {
                    leagueWinnerViewModel.f9036p = topLeaguesDto.getWinners();
                    leagueWinnerViewModel.f9039s.postValue(Boolean.TRUE);
                    leagueWinnerViewModel.f9041u = topLeaguesDto.getTotalPages();
                    if (z10) {
                        e0 e0Var = leagueWinnerViewModel.f9040t;
                        ArrayList arrayList = new ArrayList();
                        if (leagueWinnerViewModel.f9036p != null) {
                            int i11 = leagueWinnerViewModel.f9041u;
                            int i12 = 1;
                            if (1 <= i11) {
                                while (true) {
                                    arrayList.add("Page " + i12 + "/" + leagueWinnerViewModel.f9041u);
                                    if (i12 != i11) {
                                        i12++;
                                    }
                                }
                            }
                        }
                        e0Var.postValue(arrayList);
                    }
                    leagueWinnerViewModel.f9037q.postValue(leagueWinnerViewModel.f9036p);
                    return;
                }
                return;
            default:
                AppVersionResponseDto appVersionResponseDto = (AppVersionResponseDto) baseResponseDto.getData();
                if (appVersionResponseDto != null) {
                    MainViewModel mainViewModel = (MainViewModel) obj;
                    if (appVersionResponseDto.getVersionCode() <= 220) {
                        if (z10) {
                            mainViewModel.f9082e.postValue(ni.j.r(Integer.valueOf(R.string.app_upto_date)));
                            return;
                        }
                        return;
                    } else {
                        if (((AppVersionResponseDto) baseResponseDto.getData()).getUpdateFromPlaystore()) {
                            boolean isBlocker = ((AppVersionResponseDto) baseResponseDto.getData()).isBlocker();
                            mainViewModel.f9596a0 = isBlocker ? 1 : 0;
                            mainViewModel.R.postValue(Integer.valueOf(isBlocker ? 1 : 0));
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
