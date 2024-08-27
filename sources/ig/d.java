package ig;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public PortfolioDetailViewModel f19970a;

    /* renamed from: b, reason: collision with root package name */
    public int f19971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PortfolioDetailViewModel f19972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PortfolioDetailViewModel portfolioDetailViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19972c = portfolioDetailViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f19972c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        PortfolioDetailViewModel portfolioDetailViewModel;
        Exception e10;
        String str;
        ArenaGame arenaGame;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19971b;
        if (i10 != 0) {
            if (i10 == 1) {
                portfolioDetailViewModel = this.f19970a;
                try {
                    n.b(obj);
                } catch (Exception e11) {
                    e10 = e11;
                    e10.printStackTrace();
                    portfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                    portfolioDetailViewModel.f9784u.postValue("Technical Error Occurred");
                    return Unit.f23355a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            PortfolioDetailViewModel portfolioDetailViewModel2 = this.f19972c;
            String str2 = portfolioDetailViewModel2.f9786w;
            if (str2 != null) {
                portfolioDetailViewModel2.f9084g.postValue(Boolean.TRUE);
                try {
                    ArenaRepository arenaRepository = portfolioDetailViewModel2.f9778o;
                    this.f19970a = portfolioDetailViewModel2;
                    this.f19971b = 1;
                    Object leagueInfo = arenaRepository.getLeagueInfo(str2, this);
                    if (leagueInfo == aVar) {
                        return aVar;
                    }
                    portfolioDetailViewModel = portfolioDetailViewModel2;
                    obj = leagueInfo;
                } catch (Exception e12) {
                    portfolioDetailViewModel = portfolioDetailViewModel2;
                    e10 = e12;
                    e10.printStackTrace();
                    portfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                    portfolioDetailViewModel.f9784u.postValue("Technical Error Occurred");
                    return Unit.f23355a;
                }
            }
            return Unit.f23355a;
        }
        v0 v0Var = (v0) obj;
        boolean isSuccessful = v0Var.f29302a.isSuccessful();
        if (isSuccessful) {
            portfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (arenaGame = (ArenaGame) baseResponseDto.getData()) != null) {
                portfolioDetailViewModel.B.postValue(arenaGame);
                PortfolioDetailViewModel.h(portfolioDetailViewModel);
            }
        } else if (!isSuccessful) {
            portfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
            Gson gson = new Gson();
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.string();
            } else {
                str = null;
            }
            portfolioDetailViewModel.f9784u.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
        }
        return Unit.f23355a;
    }
}
