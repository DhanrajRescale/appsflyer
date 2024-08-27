package we;

import android.content.Intent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.data.model.ChampionDto;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartActivity;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartViewModel;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zq.f;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChampionsChartActivity f39034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ChampionsChartActivity championsChartActivity, int i10) {
        super(1);
        this.f39033a = i10;
        this.f39034b = championsChartActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39033a;
        ChampionsChartActivity championsChartActivity = this.f39034b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                ba.k kVar = (ba.k) championsChartActivity.w();
                Intrinsics.c(bool);
                kVar.f5189u.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    LinearLayout noChampionContainer = ((ba.k) championsChartActivity.w()).f5188t;
                    Intrinsics.checkNotNullExpressionValue(noChampionContainer, "noChampionContainer");
                    f.M(noChampionContainer);
                    RecyclerView championsRecyclerView = ((ba.k) championsChartActivity.w()).f5187s;
                    Intrinsics.checkNotNullExpressionValue(championsRecyclerView, "championsRecyclerView");
                    f.m0(championsRecyclerView);
                    xe.a aVar = championsChartActivity.f9474k;
                    if (aVar != null) {
                        aVar.u(list);
                    } else {
                        Intrinsics.k("championsAdapter");
                        throw null;
                    }
                } else {
                    LinearLayout noChampionContainer2 = ((ba.k) championsChartActivity.w()).f5188t;
                    Intrinsics.checkNotNullExpressionValue(noChampionContainer2, "noChampionContainer");
                    f.m0(noChampionContainer2);
                    RecyclerView championsRecyclerView2 = ((ba.k) championsChartActivity.w()).f5187s;
                    Intrinsics.checkNotNullExpressionValue(championsRecyclerView2, "championsRecyclerView");
                    f.M(championsRecyclerView2);
                }
                return Unit.f23355a;
            default:
                ChampionDto it = (ChampionDto) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ChampionsChartViewModel championsChartViewModel = (ChampionsChartViewModel) championsChartActivity.x();
                String userId = it.getUuid();
                Intrinsics.checkNotNullParameter(userId, "userId");
                if (!Intrinsics.a(userId, championsChartViewModel.f9081d.getCurrentUserId())) {
                    Intent intent = new Intent(championsChartActivity, (Class<?>) UserProfileActivity.class);
                    intent.putExtra("USER_IDENTIFIER", it.getUuid());
                    intent.putExtra("USER_NAME", it.getDisplayName());
                    championsChartActivity.startActivity(intent);
                } else {
                    championsChartActivity.startActivity(new Intent(championsChartActivity, (Class<?>) MyProfileActivity.class));
                }
                return Unit.f23355a;
        }
    }
}
