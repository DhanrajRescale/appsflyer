package og;

import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.domain.model.OptionType;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetFragment;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.x;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f30045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FnoPortfolioHolding f30046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, FnoPortfolioHolding fnoPortfolioHolding, int i10) {
        super(2);
        this.f30044a = i10;
        this.f30045b = jVar;
        this.f30046c = fnoPortfolioHolding;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OptionType optionType;
        int i10 = this.f30044a;
        FnoPortfolioHolding fnoPortfolioHolding = this.f30046c;
        j jVar = this.f30045b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                OptionValue optionValue = (OptionValue) obj2;
                Intrinsics.checkNotNullParameter(optionValue, "optionValue");
                int i11 = OptionOrderPageBottomSheetFragment.f8606j;
                OptionContract optionContract = PortfolioFnoHoldingsViewModel.h(optionValue);
                Intrinsics.checkNotNullParameter(optionValue, "optionValue");
                String optionType2 = optionValue.getOptionType();
                if (Intrinsics.a(optionType2, "call")) {
                    optionType = OptionType.CALL;
                } else if (Intrinsics.a(optionType2, "put")) {
                    optionType = OptionType.PUT;
                } else {
                    optionType = OptionType.CALL;
                }
                OptionType optionType3 = optionType;
                OptionOverview optionOverview = new OptionOverview(Integer.parseInt(optionValue.getLotSize()), optionType3, new FnoOption(optionValue.getOptionName(), optionValue.getContractSym(), Double.parseDouble(optionValue.getLtp()), null, optionValue.getImageUrl(), optionValue.getSector(), HttpUrl.FRAGMENT_ENCODE_SET), x.a(0L), 0L, x.a(PortfolioFnoHoldingsViewModel.h(optionValue)), optionValue.getOptionType());
                Boolean valueOf = Boolean.valueOf(booleanValue);
                Boolean bool = Boolean.TRUE;
                Intrinsics.checkNotNullParameter(optionContract, "optionContract");
                OptionOrderPageBottomSheetFragment optionOrderPageBottomSheetFragment = new OptionOrderPageBottomSheetFragment();
                optionOrderPageBottomSheetFragment.setArguments(hl.f.y(new Pair("option_bottom_sheet_contract", optionContract), new Pair("option_bottom_sheet_identifier", optionOverview), new Pair("is_sell_option", valueOf), new Pair("order_is_from_holdings", bool), new Pair("CALL_FROM_PORTFOLIO", bool), new Pair("fno_portfolio_in_holdings", fnoPortfolioHolding), new Pair("is_directly_from_options_holding", bool)));
                optionOrderPageBottomSheetFragment.show(jVar.getChildFragmentManager(), "OptionOrderPageBottomSheetFragment");
                return Unit.f23355a;
            default:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel = (PortfolioFnoHoldingsViewModel) jVar.r();
                PortfolioDetailViewModel portfolioDetailViewModel = jVar.f30050g;
                if (portfolioDetailViewModel != null) {
                    int i12 = 0;
                    dp.b.Q(portfolioFnoHoldingsViewModel, portfolioDetailViewModel, new ag.b(jVar, 8), new h(jVar, fnoPortfolioHolding, i12), new i(jVar, i12), nVar, 72, 0);
                    return Unit.f23355a;
                }
                Intrinsics.k("model");
                throw null;
        }
    }
}
