package ba;

import android.widget.CompoundButton;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_market.domain.model.OptionChain;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewSectionItemViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class ed implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4594a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.a1 f4595b;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        String str;
        String str2;
        switch (this.f4594a) {
            case 0:
                StockOverviewSectionItemViewModel stockOverviewSectionItemViewModel = (StockOverviewSectionItemViewModel) this.f4595b;
                stockOverviewSectionItemViewModel.getClass();
                Intrinsics.checkNotNullParameter(compoundButton, "switch");
                stockOverviewSectionItemViewModel.f10482j.postValue(Boolean.valueOf(z10));
                stockOverviewSectionItemViewModel.f10486n.postValue(Boolean.valueOf(!z10));
                androidx.lifecycle.e0 e0Var = stockOverviewSectionItemViewModel.f10488p;
                Pair[] pairArr = new Pair[2];
                if (z10) {
                    str = "CHART";
                } else {
                    str = "DATA";
                }
                pairArr[0] = new Pair("representation_type", str);
                zi.f fVar = (zi.f) stockOverviewSectionItemViewModel.f9075c.getValue();
                if (fVar == null || (str2 = fVar.f42472a) == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                pairArr[1] = new Pair("section", str2);
                e0Var.postValue(new kj.j(new AnalyticEvent("app_market_rep_toggle", vt.p0.f(pairArr))));
                return;
            case 1:
                OptionChainViewModel optionChainViewModel = (OptionChainViewModel) this.f4595b;
                optionChainViewModel.getClass();
                Intrinsics.checkNotNullParameter(compoundButton, "switch");
                optionChainViewModel.f8589s.setValue(Boolean.valueOf(z10));
                OptionChain optionChain = (OptionChain) optionChainViewModel.f8585o.getValue();
                if (optionChain != null) {
                    androidx.lifecycle.e0 e0Var2 = optionChainViewModel.f8587q;
                    if (z10) {
                        e0Var2.setValue(optionChain.getPutOptionData().getContracts());
                        return;
                    } else {
                        e0Var2.setValue(optionChain.getCallOptionData().getContracts());
                        return;
                    }
                }
                return;
            default:
                OptionDetailViewModel optionDetailViewModel = (OptionDetailViewModel) this.f4595b;
                optionDetailViewModel.getClass();
                Intrinsics.checkNotNullParameter(compoundButton, "switch");
                optionDetailViewModel.f8603x.setValue(Boolean.valueOf(z10));
                optionDetailViewModel.l(z10);
                optionDetailViewModel.m();
                return;
        }
    }
}
