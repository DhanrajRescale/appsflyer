package ka;

import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.domain.model.OptionOrderType;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f22791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(2);
        this.f22791a = iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) obj;
        BuySellModifyFnoRequestDto buySellModifyFnoRequestDto = (BuySellModifyFnoRequestDto) obj2;
        Intrinsics.checkNotNullParameter(buySellModifyFnoRequestDto, "buySellModifyFnoRequestDto");
        OptionOrderType.Companion companion = OptionOrderType.INSTANCE;
        if (fnoOrderInfoResponseDto == null || (str = fnoOrderInfoResponseDto.getTransactionType()) == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i10 = g.f22786a[companion.getOptionOrderType(str).ordinal()];
        i iVar = this.f22791a;
        if (i10 != 1) {
            if (i10 == 2) {
                ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f("sell", buySellModifyFnoRequestDto);
            }
        } else {
            ((ModifyOrderPageBottomSheetViewModel) iVar.t()).f("buy", buySellModifyFnoRequestDto);
        }
        return Unit.f23355a;
    }
}
