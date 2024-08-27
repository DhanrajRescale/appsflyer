package ha;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_market.data.remote.PositionItem;
import com.assetgro.stockgro.feature_market.data.remote.Value;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import qu.f0;
import vt.o0;

/* loaded from: classes.dex */
public final class x extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OptionOrderPageBottomSheetViewModel f18125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel, yt.a aVar) {
        super(2, aVar);
        this.f18125a = optionOrderPageBottomSheetViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x(this.f18125a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        double d10;
        String str3;
        int i10;
        boolean z10;
        PositionItem positionItem;
        PositionItem positionItem2;
        String type;
        FnoOption identifierInfo;
        Value value;
        String marginAvailable;
        Double e10;
        String name;
        String portfolioId;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = this.f18125a;
        e0 e0Var = optionOrderPageBottomSheetViewModel.f8616o;
        FnoPortfolioHolding fnoPortfolioHolding = optionOrderPageBottomSheetViewModel.f8615n;
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (fnoPortfolioHolding != null && (portfolioId = fnoPortfolioHolding.getPortfolioId()) != null) {
            str = portfolioId;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        FnoPortfolioHolding fnoPortfolioHolding2 = optionOrderPageBottomSheetViewModel.f8615n;
        if (fnoPortfolioHolding2 != null && (name = fnoPortfolioHolding2.getName()) != null) {
            str2 = name;
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        FnoPortfolioHolding fnoPortfolioHolding3 = optionOrderPageBottomSheetViewModel.f8615n;
        if (fnoPortfolioHolding3 != null && (value = fnoPortfolioHolding3.getValue()) != null && (marginAvailable = value.getMarginAvailable()) != null && (e10 = kotlin.text.q.e(marginAvailable)) != null) {
            d10 = e10.doubleValue();
        } else {
            d10 = 0.0d;
        }
        OptionOverview optionOverview = (OptionOverview) optionOrderPageBottomSheetViewModel.f8610i.getValue();
        if (optionOverview == null || (identifierInfo = optionOverview.getIdentifierInfo()) == null || (str3 = identifierInfo.getIdentifier()) == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        OptionContract optionContract = (OptionContract) optionOrderPageBottomSheetViewModel.f8609h.getValue();
        if (optionContract != null && (positionItem2 = optionContract.getPositionItem()) != null && (type = positionItem2.getType()) != null) {
            str4 = type;
        }
        OptionContract optionContract2 = (OptionContract) optionOrderPageBottomSheetViewModel.f8609h.getValue();
        if (optionContract2 != null && (positionItem = optionContract2.getPositionItem()) != null) {
            i10 = positionItem.getLots();
        } else {
            i10 = 0;
        }
        Map b10 = o0.b(new Pair(str3, new PositionItem(str4, i10)));
        FnoPortfolioHolding fnoPortfolioHolding4 = optionOrderPageBottomSheetViewModel.f8615n;
        if (fnoPortfolioHolding4 != null) {
            z10 = fnoPortfolioHolding4.isModel();
        } else {
            z10 = true;
        }
        e0Var.postValue(new PortfolioReviewResponse(vt.x.a(new FnoPortfolio(str, str2, d10, z10, b10))));
        return Unit.f23355a;
    }
}
