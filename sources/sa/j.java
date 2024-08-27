package sa;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.j0;
import com.assetgro.stockgro.data.model.AssetInsightData;
import com.assetgro.stockgro.data.model.InsightListType;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.asset.MarketAssetInsightsViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ll.o;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f34418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, int i10) {
        super(1);
        this.f34417a = i10;
        this.f34418b = lVar;
    }

    public final void a(String it) {
        int i10 = this.f34417a;
        l lVar = this.f34418b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(it, "MarketStocksInsightsFragment")) {
                    ((MarketAssetInsightsViewModel) lVar.r()).i(ra.e.f33560g);
                    return;
                } else {
                    ((MarketAssetInsightsViewModel) lVar.r()).i(ra.e.f33561h);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                FirebaseAnalytics firebaseAnalytics = lVar.f34422g;
                if (firebaseAnalytics != null) {
                    firebaseAnalytics.a("stock_detail", (Bundle) new o(12, 0).f24937b);
                    j0 activity = lVar.getActivity();
                    if (activity != null) {
                        Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                        bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
                        bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                        bundle.putString("STOCK_NAME", it);
                        intent.putExtras(bundle);
                        lVar.requireActivity().startActivity(intent);
                        return;
                    }
                    return;
                }
                Intrinsics.k("firebaseAnalytics");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f34417a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            default:
                AssetInsightData it = (AssetInsightData) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List<StockDto> insightList = it.getInsightList();
                InsightListType type = it.getType();
                int i11 = l.f34421j;
                l lVar = this.f34418b;
                lVar.getClass();
                if (type == null) {
                    i10 = -1;
                } else {
                    i10 = i.f34416a[type.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                InsightListType insightListType = InsightListType.LOSERS;
                                String string = lVar.getString(R.string.top_losers);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                lVar.H(string, insightList, insightListType);
                            }
                        } else {
                            InsightListType insightListType2 = InsightListType.GAINERS;
                            String string2 = lVar.getString(R.string.top_gainers);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            lVar.H(string2, insightList, insightListType2);
                        }
                    } else {
                        InsightListType insightListType3 = InsightListType.VOLUMESHOCKERS;
                        String string3 = lVar.getString(R.string.volume_shockers);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        lVar.H(string3, insightList, insightListType3);
                    }
                } else {
                    InsightListType insightListType4 = InsightListType.TRENDING;
                    String string4 = lVar.getString(R.string.top_trending);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    lVar.H(string4, insightList, insightListType4);
                }
                return Unit.f23355a;
        }
    }
}
