package ka;

import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.domain.model.OptionMarketType;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import t0.g1;
import t0.l3;
import tu.k1;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModifyOrderPageBottomSheetViewModel f22948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f22950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel, g1 g1Var, l3 l3Var, yt.a aVar) {
        super(2, aVar);
        this.f22948a = modifyOrderPageBottomSheetViewModel;
        this.f22949b = g1Var;
        this.f22950c = l3Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s(this.f22948a, this.f22949b, this.f22950c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Double d10;
        double d11;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        OptionMarketType.Companion companion = OptionMarketType.INSTANCE;
        l3 l3Var = this.f22950c;
        FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) l3Var.getValue();
        if (fnoOrderInfoResponseDto == null || (str = fnoOrderInfoResponseDto.getOrderType()) == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        OptionMarketType optionMarketTypeByName = companion.getOptionMarketTypeByName(str);
        int i10 = r.f22938a[optionMarketTypeByName.ordinal()];
        double d12 = 0.0d;
        ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel = this.f22948a;
        if (i10 != 1) {
            if (i10 == 2) {
                k1 k1Var = modifyOrderPageBottomSheetViewModel.f8638m;
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto2 = (FnoOrderInfoResponseDto) l3Var.getValue();
                if (fnoOrderInfoResponseDto2 != null) {
                    d11 = kj.f.p(fnoOrderInfoResponseDto2.getEntryPrice());
                } else {
                    FnoOrderInfoResponseDto fnoOrderInfoResponseDto3 = (FnoOrderInfoResponseDto) l3Var.getValue();
                    if (fnoOrderInfoResponseDto3 != null) {
                        d11 = fnoOrderInfoResponseDto3.getLtp();
                    } else {
                        d11 = 0.0d;
                    }
                }
                k1Var.m(new Double(d11));
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto4 = (FnoOrderInfoResponseDto) l3Var.getValue();
                if (fnoOrderInfoResponseDto4 != null) {
                    d12 = kj.f.p(fnoOrderInfoResponseDto4.getEntryPrice());
                } else {
                    FnoOrderInfoResponseDto fnoOrderInfoResponseDto5 = (FnoOrderInfoResponseDto) l3Var.getValue();
                    if (fnoOrderInfoResponseDto5 != null) {
                        d12 = fnoOrderInfoResponseDto5.getLtp();
                    }
                }
                modifyOrderPageBottomSheetViewModel.f8639n.m(String.valueOf(d12));
            }
        } else {
            k1 k1Var2 = modifyOrderPageBottomSheetViewModel.f8638m;
            FnoOrderInfoResponseDto fnoOrderInfoResponseDto6 = (FnoOrderInfoResponseDto) l3Var.getValue();
            if (fnoOrderInfoResponseDto6 != null) {
                d12 = fnoOrderInfoResponseDto6.getLtp();
            }
            k1Var2.m(new Double(d12));
            FnoOrderInfoResponseDto fnoOrderInfoResponseDto7 = (FnoOrderInfoResponseDto) l3Var.getValue();
            if (fnoOrderInfoResponseDto7 != null) {
                d10 = new Double(fnoOrderInfoResponseDto7.getLtp());
            } else {
                d10 = null;
            }
            modifyOrderPageBottomSheetViewModel.f8639n.m(String.valueOf(d10));
        }
        this.f22949b.setValue(new Integer(companion.getTabIndexOf(optionMarketTypeByName)));
        return Unit.f23355a;
    }
}
