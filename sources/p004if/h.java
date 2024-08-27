package p004if;

import android.content.Intent;
import com.assetgro.stockgro.data.model.TopPortfolioDto;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioListActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopPortfolioListActivity f19964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TopPortfolioListActivity topPortfolioListActivity, int i10) {
        super(1);
        this.f19963a = i10;
        this.f19964b = topPortfolioListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class cls;
        int i10 = this.f19963a;
        TopPortfolioListActivity topPortfolioListActivity = this.f19964b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                a aVar = topPortfolioListActivity.f9562k;
                if (aVar != null) {
                    aVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("topPortfolioAdapter");
                throw null;
            default:
                TopPortfolioDto it = (TopPortfolioDto) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isExpert()) {
                    cls = RiaProfileActivity.class;
                } else {
                    cls = UserProfileActivity.class;
                }
                Intent intent = new Intent(topPortfolioListActivity, (Class<?>) cls);
                intent.putExtra("USER_IDENTIFIER", it.getUserId());
                intent.putExtra("USER_NAME", it.getName());
                topPortfolioListActivity.startActivity(intent);
                return Unit.f23355a;
        }
    }
}
