package gh;

import au.i;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.profile.portfolio.LeaguePortfolioHoldingViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaguePortfolioHoldingViewModel f17426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f17426b = leaguePortfolioHoldingViewModel;
        this.f17427c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f17426b, this.f17427c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17425a;
        LeaguePortfolioHoldingViewModel leaguePortfolioHoldingViewModel = this.f17426b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            PortfolioRepository portfolioRepository = leaguePortfolioHoldingViewModel.f9991n;
            String str2 = leaguePortfolioHoldingViewModel.f9992o;
            String str3 = this.f17427c;
            String str4 = leaguePortfolioHoldingViewModel.f9995r;
            this.f17425a = 1;
            obj = portfolioRepository.getUnifiedLeaguePortfolioData(str2, str3, str4, false, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        leaguePortfolioHoldingViewModel.f9084g.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null) {
                if (baseResponseDto.getSuccess()) {
                    LeagueUnifiedResponseDto leagueUnifiedResponseDto = (LeagueUnifiedResponseDto) baseResponseDto.getData();
                    if (leagueUnifiedResponseDto != null) {
                        leaguePortfolioHoldingViewModel.f9993p.setValue(leagueUnifiedResponseDto.getPortfolio());
                    }
                } else {
                    leaguePortfolioHoldingViewModel.f9996s.postValue(baseResponseDto.getMessage());
                }
            }
        } else {
            Gson gson = new Gson();
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.string();
            } else {
                str = null;
            }
            leaguePortfolioHoldingViewModel.f9996s.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
        }
        return Unit.f23355a;
    }
}
