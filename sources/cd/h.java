package cd;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPreJoiningViewModel f8115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel, yt.a aVar) {
        super(2, aVar);
        this.f8115b = leagueDetailPreJoiningViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f8115b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8114a;
        String str2 = null;
        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = this.f8115b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ArenaRepository arenaRepository = leagueDetailPreJoiningViewModel.f9047n;
                String str3 = leagueDetailPreJoiningViewModel.f9049p;
                if (str3 != null) {
                    this.f8114a = 1;
                    obj = arenaRepository.joinLeagueWithAutomaticPortfolioSelection(str3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    Intrinsics.k("gameId");
                    throw null;
                }
            }
            v0 v0Var = (v0) obj;
            Response response = v0Var.f29302a;
            Object obj2 = v0Var.f29303b;
            boolean isSuccessful = response.isSuccessful();
            if (isSuccessful) {
                e0 e0Var = leagueDetailPreJoiningViewModel.f9055v;
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj2;
                if (baseResponseDto != null) {
                    str = baseResponseDto.getMessage();
                } else {
                    str = null;
                }
                e0Var.postValue(str);
                BaseResponseDto baseResponseDto2 = (BaseResponseDto) obj2;
                if (baseResponseDto2 != null && !baseResponseDto2.getSuccess()) {
                    e0 e0Var2 = leagueDetailPreJoiningViewModel.f9056w;
                    BaseResponseDto baseResponseDto3 = (BaseResponseDto) obj2;
                    if (baseResponseDto3 != null) {
                        str2 = baseResponseDto3.getMessage();
                    }
                    e0Var2.postValue(str2);
                }
            } else if (!isSuccessful) {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str2 = responseBody.string();
                }
                leagueDetailPreJoiningViewModel.f9056w.postValue(((ErrorResponse) gson.fromJson(str2, ErrorResponse.class)).getMessage());
            }
        } catch (Exception unused) {
            leagueDetailPreJoiningViewModel.f9056w.postValue("Technical Error Occurred");
        }
        return Unit.f23355a;
    }
}
