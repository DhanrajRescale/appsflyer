package ha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import ba.jl;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.domain.model.StockOptionPendingDto;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.order.OptionOrderPendingActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import y.q0;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionOrderPageBottomSheetFragment f18112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(OptionOrderPageBottomSheetFragment optionOrderPageBottomSheetFragment, int i10) {
        super(1);
        this.f18111a = i10;
        this.f18112b = optionOrderPageBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d10;
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        String str4;
        String str5;
        FnoOption identifierInfo;
        String imageUrl;
        List<FnoPortfolio> list;
        PortfolioReviewResponse portfolioReviewResponse;
        Double entryPrice;
        int i12 = this.f18111a;
        int i13 = 0;
        OptionOrderPageBottomSheetFragment optionOrderPageBottomSheetFragment = this.f18112b;
        switch (i12) {
            case 0:
                FnoPortfolio it = (FnoPortfolio) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = (OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t();
                Intrinsics.checkNotNullParameter(it, "it");
                optionOrderPageBottomSheetViewModel.f8614m = it.getPortfolioId();
                optionOrderPageBottomSheetViewModel.f8612k = it.isModel();
                ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).g();
                return Unit.f23355a;
            case 1:
                ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8613l = !optionOrderPageBottomSheetFragment.f8607i;
                jl jlVar = (jl) optionOrderPageBottomSheetFragment.r();
                q0 q0Var = new q0(13, (ut.p) obj, optionOrderPageBottomSheetFragment);
                Object obj2 = b1.d.f3079a;
                jlVar.f5155s.setContent(new b1.c(q0Var, true, -724717099));
                return Unit.f23355a;
            case 2:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((jl) optionOrderPageBottomSheetFragment.r()).f5155s.setContent(e.f18077a);
                } else {
                    optionOrderPageBottomSheetFragment.dismiss();
                }
                return Unit.f23355a;
            case 3:
                BuySellModifyFnoRequestDto buySellModifyFnoRequestDto = ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8622u;
                double d11 = 0.0d;
                if (buySellModifyFnoRequestDto != null && (entryPrice = buySellModifyFnoRequestDto.getEntryPrice()) != null) {
                    d10 = kj.f.p(entryPrice.doubleValue());
                } else {
                    d10 = 0.0d;
                }
                BuySellModifyFnoRequestDto buySellModifyFnoRequestDto2 = ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8622u;
                String str6 = null;
                if (((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8614m.length() == 0) {
                    ut.p pVar = (ut.p) ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8624w.getValue();
                    if (pVar != null && (portfolioReviewResponse = (PortfolioReviewResponse) pVar.f37402c) != null) {
                        list = portfolioReviewResponse.getPortfolios();
                    } else {
                        list = null;
                    }
                    Intrinsics.c(list);
                    str = list.get(0).getPortfolioId();
                } else {
                    str = ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8614m;
                }
                String str7 = str;
                OptionContract optionContract = (OptionContract) ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8609h.getValue();
                if (optionContract != null) {
                    str2 = optionContract.getName();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str3 = str2;
                }
                if (buySellModifyFnoRequestDto2 != null) {
                    i10 = buySellModifyFnoRequestDto2.getNoOfLots();
                } else {
                    i10 = 0;
                }
                OptionOverview optionOverview = (OptionOverview) ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8610i.getValue();
                if (optionOverview != null) {
                    i11 = optionOverview.getLotSize();
                } else {
                    i11 = 0;
                }
                if (buySellModifyFnoRequestDto2 != null) {
                    str6 = buySellModifyFnoRequestDto2.getOrderType();
                }
                if (str6 == null) {
                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str4 = str6;
                }
                if (buySellModifyFnoRequestDto2 != null) {
                    i13 = buySellModifyFnoRequestDto2.getNoOfLots();
                }
                double d12 = d10 * i13;
                OptionOverview optionOverview2 = (OptionOverview) ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8610i.getValue();
                if (optionOverview2 != null && (identifierInfo = optionOverview2.getIdentifierInfo()) != null && (imageUrl = identifierInfo.getImageUrl()) != null) {
                    str5 = imageUrl;
                } else {
                    str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                StockOptionPendingDto stockOptionPendingDto = new StockOptionPendingDto(str3, i10, d10, i11, str4, d12, 0.0d, str5, str7, ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8612k, 64, null);
                Double d13 = ((OptionOrderPageBottomSheetViewModel) optionOrderPageBottomSheetFragment.t()).f8623v;
                if (d13 != null) {
                    d11 = d13.doubleValue();
                }
                stockOptionPendingDto.setMarginBalance(stockOptionPendingDto.getMarginBalance(d11));
                Intent intent = new Intent(optionOrderPageBottomSheetFragment.requireActivity(), (Class<?>) OptionOrderPendingActivity.class);
                intent.putExtra("STOCK_OPTION_PENDING", stockOptionPendingDto);
                intent.putExtra("CALL_FROM_PORTFOLIO", optionOrderPageBottomSheetFragment.f8607i);
                optionOrderPageBottomSheetFragment.startActivity(intent);
                Bundle arguments = optionOrderPageBottomSheetFragment.getArguments();
                if (arguments == null || !arguments.getBoolean("is_directly_from_options_holding")) {
                    optionOrderPageBottomSheetFragment.requireActivity().finish();
                }
                optionOrderPageBottomSheetFragment.dismiss();
                return Unit.f23355a;
            default:
                Context requireContext = optionOrderPageBottomSheetFragment.requireContext();
                Context requireContext2 = optionOrderPageBottomSheetFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                Toast.makeText(requireContext, ((z9.i) obj).a(requireContext2), 0).show();
                optionOrderPageBottomSheetFragment.dismiss();
                return Unit.f23355a;
        }
    }
}
