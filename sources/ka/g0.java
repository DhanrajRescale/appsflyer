package ka;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.domain.model.OptionMarketType;
import com.assetgro.stockgro.feature_market.domain.model.OptionOrderType;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tu.k1;

/* loaded from: classes.dex */
public final class g0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyOrderPageBottomSheetViewModel f22788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f22788b = modifyOrderPageBottomSheetViewModel;
        this.f22789c = str;
        this.f22790d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g0(this.f22788b, this.f22789c, this.f22790d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        FnoOrderInfoResponseDto data;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22787a;
        ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel = this.f22788b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            FnoRepository fnoRepository = modifyOrderPageBottomSheetViewModel.f8632g;
            boolean z10 = modifyOrderPageBottomSheetViewModel.f8643r;
            this.f22787a = 1;
            obj = fnoRepository.fetchOrderInfo(this.f22789c, this.f22790d, z10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        nv.v0 v0Var = (nv.v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (data = (FnoOrderInfoResponseDto) baseResponseDto.getData()) != null) {
                modifyOrderPageBottomSheetViewModel.f8633h.postValue(data);
                modifyOrderPageBottomSheetViewModel.f8638m.m(new Double(data.getLtp()));
                modifyOrderPageBottomSheetViewModel.f8641p.m(OptionMarketType.INSTANCE.getOptionMarketTypeByName(data.getOrderType()));
                modifyOrderPageBottomSheetViewModel.f8640o.m(new Integer(data.getNoOfLots()));
                kj.f.p(data.getEntryPrice());
                Intrinsics.checkNotNullParameter(data, "data");
                k1 isSellOrder = modifyOrderPageBottomSheetViewModel.f8642q;
                Intrinsics.checkNotNullParameter(isSellOrder, "isSellOrder");
                int i11 = f0.f22785a[OptionOrderType.INSTANCE.getOptionOrderType(data.getTransactionType()).ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        isSellOrder.m(Boolean.TRUE);
                    }
                } else {
                    isSellOrder.m(Boolean.FALSE);
                }
            }
        } else {
            modifyOrderPageBottomSheetViewModel.f9070f.setValue(Boolean.FALSE);
            modifyOrderPageBottomSheetViewModel.f8644s.postValue(new Exception());
        }
        return Unit.f23355a;
    }
}
