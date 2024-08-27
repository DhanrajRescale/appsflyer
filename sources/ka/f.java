package ka;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import ba.jl;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.IdentifierInfo;
import com.assetgro.stockgro.feature_market.domain.model.StockOptionPendingDto;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.order.OptionOrderPendingActivity;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f22784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i10) {
        super(1);
        this.f22783a = i10;
        this.f22784b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d10;
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        int i12;
        String str4;
        double d11;
        Double marginPrice;
        IdentifierInfo identifierInfo;
        String imageUrl;
        IdentifierInfo identifierInfo2;
        String name;
        Double entryPrice;
        int i13 = this.f22783a;
        boolean z10 = false;
        i iVar = this.f22784b;
        switch (i13) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((jl) iVar.r()).f5155s.setContent(b.f22743a);
                } else {
                    iVar.dismiss();
                }
                return Unit.f23355a;
            case 1:
                jl jlVar = (jl) iVar.r();
                androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(iVar, 11);
                Object obj2 = b1.d.f3079a;
                jlVar.f5155s.setContent(new b1.c(eVar, true, 11987809));
                return Unit.f23355a;
            case 2:
                Toast.makeText(iVar.requireContext(), iVar.getResources().getString(R.string.sell_order_error), 0).show();
                iVar.dismiss();
                return Unit.f23355a;
            default:
                BuySellModifyFnoRequestDto buySellModifyFnoRequestDto = ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f8637l;
                if (buySellModifyFnoRequestDto != null && (entryPrice = buySellModifyFnoRequestDto.getEntryPrice()) != null) {
                    d10 = kj.f.p(entryPrice.doubleValue());
                } else {
                    d10 = 0.0d;
                }
                BuySellModifyFnoRequestDto buySellModifyFnoRequestDto2 = ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f8637l;
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f8634i.getValue();
                if (fnoOrderInfoResponseDto != null && (identifierInfo2 = fnoOrderInfoResponseDto.getIdentifierInfo()) != null && (name = identifierInfo2.getName()) != null) {
                    str = name;
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (buySellModifyFnoRequestDto2 != null) {
                    i10 = buySellModifyFnoRequestDto2.getNoOfLots();
                } else {
                    i10 = 0;
                }
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto2 = (FnoOrderInfoResponseDto) ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f8634i.getValue();
                if (fnoOrderInfoResponseDto2 != null) {
                    i11 = fnoOrderInfoResponseDto2.getLotSize();
                } else {
                    i11 = 0;
                }
                if (buySellModifyFnoRequestDto2 != null) {
                    str2 = buySellModifyFnoRequestDto2.getOrderType();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str3 = str2;
                }
                if (buySellModifyFnoRequestDto2 != null) {
                    i12 = buySellModifyFnoRequestDto2.getNoOfLots();
                } else {
                    i12 = 0;
                }
                double p10 = kj.f.p(i12 * d10);
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto3 = (FnoOrderInfoResponseDto) ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f8634i.getValue();
                if (fnoOrderInfoResponseDto3 != null && (identifierInfo = fnoOrderInfoResponseDto3.getIdentifierInfo()) != null && (imageUrl = identifierInfo.getImageUrl()) != null) {
                    str4 = imageUrl;
                } else {
                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                StockOptionPendingDto stockOptionPendingDto = new StockOptionPendingDto(str, i10, d10, i11, str3, p10, 0.0d, str4, iVar.f22797i, false, 576, null);
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto4 = (FnoOrderInfoResponseDto) ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f8634i.getValue();
                if (fnoOrderInfoResponseDto4 != null && (marginPrice = fnoOrderInfoResponseDto4.getMarginPrice()) != null) {
                    d11 = marginPrice.doubleValue();
                } else {
                    d11 = 0.0d;
                }
                stockOptionPendingDto.setMarginBalance(kj.f.p(stockOptionPendingDto.getMarginBalance(d11)));
                Intent intent = new Intent(iVar.requireActivity(), (Class<?>) OptionOrderPendingActivity.class);
                intent.putExtra("STOCK_OPTION_PENDING", stockOptionPendingDto);
                Bundle arguments = iVar.getArguments();
                if (arguments != null) {
                    z10 = arguments.getBoolean("CALL_FROM_PORTFOLIO");
                }
                intent.putExtra("CALL_FROM_PORTFOLIO", z10);
                iVar.startActivity(intent);
                iVar.dismiss();
                return Unit.f23355a;
        }
    }
}
