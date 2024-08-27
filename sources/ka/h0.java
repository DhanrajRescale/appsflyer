package ka;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoResponseDto;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f22792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyOrderPageBottomSheetViewModel f22793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BuySellModifyFnoRequestDto f22795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel, String str, BuySellModifyFnoRequestDto buySellModifyFnoRequestDto, yt.a aVar) {
        super(2, aVar);
        this.f22793b = modifyOrderPageBottomSheetViewModel;
        this.f22794c = str;
        this.f22795d = buySellModifyFnoRequestDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h0(this.f22793b, this.f22794c, this.f22795d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BuySellModifyFnoResponseDto buySellModifyFnoResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f22792a;
        ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel = this.f22793b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            FnoRepository fnoRepository = modifyOrderPageBottomSheetViewModel.f8632g;
            this.f22792a = 1;
            obj = fnoRepository.modifyOptionFno(this.f22794c, this.f22795d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        nv.v0 v0Var = (nv.v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (buySellModifyFnoResponseDto = (BuySellModifyFnoResponseDto) baseResponseDto.getData()) != null) {
                modifyOrderPageBottomSheetViewModel.f8635j.postValue(buySellModifyFnoResponseDto);
            }
            modifyOrderPageBottomSheetViewModel.f9070f.setValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
