package la;

import android.content.Intent;
import android.os.Bundle;
import ba.zj;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.presentation.fno.OptionDetailHostActivity;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchViewModel;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f24381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f24380a = i10;
        this.f24381b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        String str;
        int i10 = this.f24380a;
        Boolean bool = null;
        d dVar = this.f24381b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                ja.c cVar = dVar.f24383g;
                if (cVar != null) {
                    cVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("marketOptionLisAdapter");
                throw null;
            case 1:
                Boolean bool2 = (Boolean) obj;
                Intrinsics.c(bool2);
                if (bool2.booleanValue()) {
                    ((zj) dVar.q()).f6855t.setEnabled(false);
                }
                return Unit.f23355a;
            case 2:
                String str2 = (String) obj;
                if (str2 != null) {
                    MarketOptionSearchViewModel marketOptionSearchViewModel = (MarketOptionSearchViewModel) dVar.r();
                    Intrinsics.checkNotNullParameter(str2, "<set-?>");
                    marketOptionSearchViewModel.f8649o = str2;
                    if (str2.length() > 2) {
                        MarketOptionSearchViewModel.h((MarketOptionSearchViewModel) dVar.r());
                    }
                    if (str2.length() == 0) {
                        MarketOptionSearchViewModel.h((MarketOptionSearchViewModel) dVar.r());
                    }
                }
                return Unit.f23355a;
            default:
                FnoOption it = (FnoOption) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_fno_stocklist_click", null, 2, null);
                dVar.z(analyticEvent);
                dVar.B(analyticEvent);
                Intent intent = new Intent(dVar.requireContext(), (Class<?>) OptionDetailHostActivity.class);
                intent.putExtra("DATA", it);
                Bundle arguments = dVar.getArguments();
                if (arguments != null) {
                    z10 = arguments.getBoolean("CALL_FROM_PORTFOLIO");
                } else {
                    z10 = true;
                }
                intent.putExtra("CALL_FROM_PORTFOLIO", z10);
                Bundle arguments2 = dVar.getArguments();
                if (arguments2 != null) {
                    str = arguments2.getString("PORTFOLIO_ID");
                } else {
                    str = null;
                }
                intent.putExtra("PORTFOLIO_ID", str);
                Bundle arguments3 = dVar.getArguments();
                if (arguments3 != null) {
                    bool = Boolean.valueOf(arguments3.getBoolean("IS_MODEL"));
                }
                intent.putExtra("IS_MODEL", bool);
                dVar.startActivity(intent);
                dVar.requireActivity().finish();
                return Unit.f23355a;
        }
    }
}
