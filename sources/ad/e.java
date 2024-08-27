package ad;

import android.content.Intent;
import android.widget.ImageView;
import ba.q1;
import com.assetgro.stockgro.data.model.WinnersDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnerViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnersActivity;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueWinnersActivity f361b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(LeagueWinnersActivity leagueWinnersActivity, int i10) {
        super(1);
        this.f360a = i10;
        this.f361b = leagueWinnersActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f360a;
        LeagueWinnersActivity leagueWinnersActivity = this.f361b;
        switch (i10) {
            case 1:
                ImageView imageView = (ImageView) ((q1) leagueWinnersActivity.w()).f5820s.findViewById(R.id.next);
                Intrinsics.c(bool);
                imageView.setEnabled(bool.booleanValue());
                ((ImageView) ((q1) leagueWinnersActivity.w()).f5820s.findViewById(R.id.previous)).setEnabled(bool.booleanValue());
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((q1) leagueWinnersActivity.w()).f5823v.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((q1) leagueWinnersActivity.w()).f5823v.setVisibility(8);
                        return;
                    }
                    return;
                }
        }
    }

    public final void d(List list) {
        int i10 = this.f360a;
        LeagueWinnersActivity leagueWinnersActivity = this.f361b;
        switch (i10) {
            case 0:
                a aVar = leagueWinnersActivity.f9044k;
                if (aVar != null) {
                    aVar.u(list);
                    ((LeagueWinnerViewModel) leagueWinnersActivity.x()).f9038r.postValue(Boolean.TRUE);
                    return;
                } else {
                    Intrinsics.k("leagueDeclaredWinnerAdapter");
                    throw null;
                }
            default:
                ((q1) leagueWinnersActivity.w()).f5820s.setTitleList(list);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f360a) {
            case 0:
                d((List) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                d((List) obj);
                return Unit.f23355a;
            default:
                WinnersDto data = (WinnersDto) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                int i10 = LeagueWinnersActivity.f9043l;
                LeagueWinnersActivity leagueWinnersActivity = this.f361b;
                LeagueWinnerViewModel leagueWinnerViewModel = (LeagueWinnerViewModel) leagueWinnersActivity.x();
                String userId = data.getUserId();
                Intrinsics.checkNotNullParameter(userId, "userId");
                if (!Intrinsics.a(userId, leagueWinnerViewModel.f9081d.getCurrentUserId())) {
                    Intent intent = new Intent(leagueWinnersActivity, (Class<?>) UserProfileActivity.class);
                    intent.putExtra("USER_IDENTIFIER", data.getUserId());
                    intent.putExtra("USER_NAME", data.getDisplayName());
                    leagueWinnersActivity.startActivity(intent);
                } else {
                    leagueWinnersActivity.startActivity(new Intent(leagueWinnersActivity, (Class<?>) MyProfileActivity.class));
                }
                return Unit.f23355a;
        }
    }
}
