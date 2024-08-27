package ha;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import vt.g0;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionOrderPageBottomSheetViewModel f18123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f18123b = optionOrderPageBottomSheetViewModel;
        this.f18124c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f18123b, this.f18124c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        PortfolioReviewResponse portfolioReviewResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18122a;
        String str = null;
        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = this.f18123b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    v0Var = (v0) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                v0Var = (v0) obj;
            }
        } else {
            ut.n.b(obj);
            int length = optionOrderPageBottomSheetViewModel.f8614m.length();
            FnoRepository fnoRepository = optionOrderPageBottomSheetViewModel.f8608g;
            String str2 = this.f18124c;
            if (length == 0 || optionOrderPageBottomSheetViewModel.f8613l) {
                this.f18122a = 1;
                obj = fnoRepository.getOrderReview(str2, null, null, this);
                if (obj == aVar) {
                    return aVar;
                }
                v0Var = (v0) obj;
            } else {
                Boolean valueOf = Boolean.valueOf(optionOrderPageBottomSheetViewModel.f8612k);
                String str3 = optionOrderPageBottomSheetViewModel.f8614m;
                this.f18122a = 2;
                obj = fnoRepository.getOrderReview(str2, valueOf, str3, this);
                if (obj == aVar) {
                    return aVar;
                }
                v0Var = (v0) obj;
            }
        }
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (portfolioReviewResponse = (PortfolioReviewResponse) baseResponseDto.getData()) != null) {
                optionOrderPageBottomSheetViewModel.f8616o.postValue(portfolioReviewResponse);
                if (optionOrderPageBottomSheetViewModel.f8614m.length() == 0) {
                    FnoPortfolio fnoPortfolio = (FnoPortfolio) g0.u(portfolioReviewResponse.getPortfolios());
                    String portfolioId = fnoPortfolio.getPortfolioId();
                    Intrinsics.checkNotNullParameter(portfolioId, "<set-?>");
                    optionOrderPageBottomSheetViewModel.f8614m = portfolioId;
                    optionOrderPageBottomSheetViewModel.f8612k = fnoPortfolio.isModel();
                }
            }
        } else {
            Gson gson = new Gson();
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.string();
            }
            optionOrderPageBottomSheetViewModel.f8620s.postValue(new z9.g(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
        }
        return Unit.f23355a;
    }
}
