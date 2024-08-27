package ha;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoResponseDto;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import retrofit2.HttpException;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionOrderPageBottomSheetViewModel f18119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BuySellModifyFnoRequestDto f18121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel, String str, BuySellModifyFnoRequestDto buySellModifyFnoRequestDto, yt.a aVar) {
        super(2, aVar);
        this.f18119b = optionOrderPageBottomSheetViewModel;
        this.f18120c = str;
        this.f18121d = buySellModifyFnoRequestDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v(this.f18119b, this.f18120c, this.f18121d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        BuySellModifyFnoResponseDto buySellModifyFnoResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18118a;
        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = this.f18119b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FnoRepository fnoRepository = optionOrderPageBottomSheetViewModel.f8608g;
                String str2 = this.f18120c;
                BuySellModifyFnoRequestDto buySellModifyFnoRequestDto = this.f18121d;
                this.f18118a = 1;
                obj = fnoRepository.buySellOptionFno(str2, buySellModifyFnoRequestDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (buySellModifyFnoResponseDto = (BuySellModifyFnoResponseDto) baseResponseDto.getData()) != null) {
                    optionOrderPageBottomSheetViewModel.f8618q.postValue(buySellModifyFnoResponseDto);
                }
                optionOrderPageBottomSheetViewModel.f9070f.setValue(Boolean.FALSE);
            } else {
                optionOrderPageBottomSheetViewModel.f9070f.setValue(Boolean.FALSE);
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str = responseBody.string();
                } else {
                    str = null;
                }
                optionOrderPageBottomSheetViewModel.f8620s.postValue(new z9.g(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
            }
        } catch (HttpException unused) {
            optionOrderPageBottomSheetViewModel.f9070f.setValue(Boolean.FALSE);
            optionOrderPageBottomSheetViewModel.f8620s.postValue(new z9.h(R.string.no_internet_connection, new Object[0]));
        } catch (Exception unused2) {
            optionOrderPageBottomSheetViewModel.f9070f.setValue(Boolean.FALSE);
            optionOrderPageBottomSheetViewModel.f8620s.postValue(new z9.h(R.string.try_again_later, new Object[0]));
        }
        return Unit.f23355a;
    }
}
