package yc;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaguePortfolioViewModel f41510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LeaguePortfolioViewModel leaguePortfolioViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f41510b = leaguePortfolioViewModel;
        this.f41511c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f41510b, this.f41511c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ArenaGame arenaGame;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f41509a;
        LeaguePortfolioViewModel leaguePortfolioViewModel = this.f41510b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                leaguePortfolioViewModel.f9084g.postValue(Boolean.TRUE);
                ArenaRepository arenaRepository = leaguePortfolioViewModel.f8999n;
                String str2 = this.f41511c;
                this.f41509a = 1;
                obj = arenaRepository.getLeagueInfo(str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            boolean isSuccessful = v0Var.f29302a.isSuccessful();
            if (isSuccessful) {
                leaguePortfolioViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (arenaGame = (ArenaGame) baseResponseDto.getData()) != null) {
                    leaguePortfolioViewModel.f9000o.postValue(arenaGame);
                    if (!Intrinsics.a(arenaGame.getStatus(), "FL")) {
                        leaguePortfolioViewModel.f9001p = arenaGame.getDerivedPortfolioId();
                        leaguePortfolioViewModel.h();
                    }
                }
            } else if (!isSuccessful) {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str = responseBody.string();
                } else {
                    str = null;
                }
                leaguePortfolioViewModel.D.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            leaguePortfolioViewModel.f9084g.postValue(Boolean.FALSE);
            leaguePortfolioViewModel.D.postValue("Technical Error Occurred");
        }
        return Unit.f23355a;
    }
}
