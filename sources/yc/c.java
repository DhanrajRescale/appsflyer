package yc;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ServerTimeResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPostJoiningViewModel f41478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel, int i10) {
        super(1);
        this.f41477a = i10;
        this.f41478b = leagueDetailPostJoiningViewModel;
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f41477a;
        LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = this.f41478b;
        switch (i10) {
            case 0:
                leagueDetailPostJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                leagueDetailPostJoiningViewModel.f8989q.postValue(Boolean.TRUE);
                return;
            default:
                leagueDetailPostJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                leagueDetailPostJoiningViewModel.f8989q.postValue(Boolean.TRUE);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f41477a;
        LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = this.f41478b;
        switch (i10) {
            case 0:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 1:
                switch (i10) {
                    case 1:
                        leagueDetailPostJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        leagueDetailPostJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                }
                return Unit.f23355a;
            case 2:
                long currentTimeMillis = (System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) - ((ServerTimeResponse) obj).getUnixtime();
                if (Math.abs(currentTimeMillis) > 5) {
                    leagueDetailPostJoiningViewModel.f9081d.setTimeDiff(currentTimeMillis);
                }
                return Unit.f23355a;
            case 3:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 4:
                switch (i10) {
                    case 1:
                        leagueDetailPostJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        leagueDetailPostJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                }
                return Unit.f23355a;
            default:
                ArenaGame arenaGame = leagueDetailPostJoiningViewModel.f8988p;
                if (arenaGame != null) {
                    LeagueStatus leagueStatus = arenaGame.getLeagueStatus();
                    leagueDetailPostJoiningViewModel.f8997y.postValue(leagueStatus);
                    int i11 = b.f41476a[leagueStatus.ordinal()];
                    e0 e0Var = leagueDetailPostJoiningViewModel.D;
                    e0 e0Var2 = leagueDetailPostJoiningViewModel.C;
                    e0 e0Var3 = leagueDetailPostJoiningViewModel.B;
                    e0 e0Var4 = leagueDetailPostJoiningViewModel.f8998z;
                    e0 e0Var5 = leagueDetailPostJoiningViewModel.A;
                    e0 e0Var6 = leagueDetailPostJoiningViewModel.f8991s;
                    e0 e0Var7 = leagueDetailPostJoiningViewModel.f8992t;
                    e0 e0Var8 = leagueDetailPostJoiningViewModel.f8993u;
                    e0 e0Var9 = leagueDetailPostJoiningViewModel.f8996x;
                    e0 e0Var10 = leagueDetailPostJoiningViewModel.f8995w;
                    e0 e0Var11 = leagueDetailPostJoiningViewModel.f8994v;
                    UserRepository userRepository = leagueDetailPostJoiningViewModel.f9081d;
                    switch (i11) {
                        case 1:
                            Boolean bool = Boolean.FALSE;
                            e0Var10.postValue(bool);
                            e0Var11.postValue(bool);
                            e0Var9.postValue(Boolean.TRUE);
                            break;
                        case 2:
                            Boolean bool2 = Boolean.FALSE;
                            e0Var10.postValue(bool2);
                            e0Var11.postValue(bool2);
                            e0Var9.postValue(bool2);
                            break;
                        case 3:
                            Boolean bool3 = Boolean.TRUE;
                            e0Var11.postValue(bool3);
                            e0Var10.postValue(bool3);
                            e0Var9.postValue(Boolean.FALSE);
                            String Q0 = el.l.Q0(arenaGame.getTradeStart(), Long.valueOf(userRepository.getTimeDiff()));
                            e0Var8.postValue(Integer.valueOf(R.drawable.rounded_timer_green_rectangle_corner_radius_12dp));
                            e0Var7.postValue(Integer.valueOf(R.string.game_is_about_to_start_in));
                            e0Var6.postValue(String.valueOf(Q0));
                            e0Var5.postValue(Integer.valueOf(R.drawable.ic_timer));
                            e0Var4.postValue(Integer.valueOf(R.color.white));
                            e0Var3.postValue(Integer.valueOf(R.drawable.rounded_grey_rectangle_bottom_corner_radius_32dp));
                            e0Var2.postValue(Integer.valueOf(R.color.gray_light));
                            e0Var.postValue(Integer.valueOf(R.color.black_1A1A1A));
                            break;
                        case 4:
                            e0Var11.postValue(Boolean.TRUE);
                            Boolean bool4 = Boolean.FALSE;
                            e0Var10.postValue(bool4);
                            e0Var9.postValue(bool4);
                            String Q02 = el.l.Q0(arenaGame.getTradeEnd(), Long.valueOf(userRepository.getTimeDiff()));
                            e0Var8.postValue(Integer.valueOf(R.drawable.rounded_orange_rectangle_corner_radius_12dp));
                            e0Var7.postValue(Integer.valueOf(R.string.game_end_message));
                            e0Var6.postValue(String.valueOf(Q02));
                            e0Var5.postValue(Integer.valueOf(R.drawable.ic_timer));
                            e0Var4.postValue(Integer.valueOf(R.color.white));
                            e0Var3.postValue(Integer.valueOf(R.drawable.rounded_grey_rectangle_bottom_corner_radius_32dp));
                            e0Var2.postValue(Integer.valueOf(R.color.gray_light));
                            e0Var.postValue(Integer.valueOf(R.color.black_1A1A1A));
                            break;
                        case 5:
                            e0Var11.postValue(Boolean.TRUE);
                            Boolean bool5 = Boolean.FALSE;
                            e0Var10.postValue(bool5);
                            e0Var9.postValue(bool5);
                            Long winnerTime = arenaGame.getWinnerTime();
                            String Q03 = el.l.Q0(winnerTime != null ? winnerTime.longValue() : 0L, Long.valueOf(userRepository.getTimeDiff()));
                            e0Var8.postValue(Integer.valueOf(R.drawable.rounded_white_rectangle_corner_radius_12dp));
                            e0Var7.postValue(Integer.valueOf(R.string.winner_will_be_declared_in));
                            e0Var6.postValue(String.valueOf(Q03));
                            e0Var5.postValue(Integer.valueOf(R.drawable.ic_timer_black));
                            e0Var4.postValue(Integer.valueOf(R.color.black_1A1A1A));
                            e0Var3.postValue(Integer.valueOf(R.drawable.rounded_orange_rectangle_bottom_corner_radius_32dp));
                            e0Var2.postValue(Integer.valueOf(R.color.orange));
                            e0Var.postValue(Integer.valueOf(R.color.white));
                            break;
                        case 6:
                            Boolean bool6 = Boolean.FALSE;
                            e0Var11.postValue(bool6);
                            e0Var10.postValue(bool6);
                            e0Var9.postValue(bool6);
                            break;
                    }
                }
                return Unit.f23355a;
        }
    }
}
