package va;

import android.view.View;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchActivity;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketAdvancedSearchActivity f37816b;

    public /* synthetic */ a(MarketAdvancedSearchActivity marketAdvancedSearchActivity, int i10) {
        this.f37815a = i10;
        this.f37816b = marketAdvancedSearchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f37815a;
        MarketAdvancedSearchActivity this$0 = this.f37816b;
        switch (i10) {
            case 0:
                int i11 = MarketAdvancedSearchActivity.f8684m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i12 = i0.f24733j;
                kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
                return;
            case 1:
                int i13 = MarketAdvancedSearchActivity.f8684m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((MarketAdvancedSearchViewModel) this$0.x()).h(e.f37822b);
                return;
            case 2:
                int i14 = MarketAdvancedSearchActivity.f8684m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((MarketAdvancedSearchViewModel) this$0.x()).h(e.f37823c);
                return;
            case 3:
                int i15 = MarketAdvancedSearchActivity.f8684m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((MarketAdvancedSearchViewModel) this$0.x()).h(e.f37824d);
                return;
            case 4:
                int i16 = MarketAdvancedSearchActivity.f8684m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((MarketAdvancedSearchViewModel) this$0.x()).h(e.f37823c);
                return;
            case 5:
                int i17 = MarketAdvancedSearchActivity.f8684m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((MarketAdvancedSearchViewModel) this$0.x()).h(e.f37824d);
                return;
            default:
                int i18 = MarketAdvancedSearchActivity.f8684m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return;
        }
    }
}
