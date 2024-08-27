package cd;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import qu.r0;
import ut.n;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public LeagueDetailPreJoiningViewModel f8106a;

    /* renamed from: b, reason: collision with root package name */
    public int f8107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPreJoiningViewModel f8108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel, yt.a aVar) {
        super(2, aVar);
        this.f8108c = leagueDetailPreJoiningViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f8108c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel;
        Exception e10;
        ArenaGame arenaGame;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8107b;
        String str = null;
        if (i10 != 0) {
            if (i10 == 1) {
                leagueDetailPreJoiningViewModel = this.f8106a;
                try {
                    n.b(obj);
                } catch (Exception e11) {
                    e10 = e11;
                    leagueDetailPreJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                    e10.printStackTrace();
                    leagueDetailPreJoiningViewModel.f9056w.postValue("Technical Error Occurred");
                    return Unit.f23355a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel2 = this.f8108c;
            String str2 = leagueDetailPreJoiningViewModel2.f9049p;
            if (str2 != null) {
                leagueDetailPreJoiningViewModel2.f9084g.postValue(Boolean.TRUE);
                try {
                    ArenaRepository arenaRepository = leagueDetailPreJoiningViewModel2.f9047n;
                    this.f8106a = leagueDetailPreJoiningViewModel2;
                    this.f8107b = 1;
                    Object leagueInfo = arenaRepository.getLeagueInfo(str2, this);
                    if (leagueInfo == aVar) {
                        return aVar;
                    }
                    leagueDetailPreJoiningViewModel = leagueDetailPreJoiningViewModel2;
                    obj = leagueInfo;
                } catch (Exception e12) {
                    leagueDetailPreJoiningViewModel = leagueDetailPreJoiningViewModel2;
                    e10 = e12;
                    leagueDetailPreJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                    e10.printStackTrace();
                    leagueDetailPreJoiningViewModel.f9056w.postValue("Technical Error Occurred");
                    return Unit.f23355a;
                }
            } else {
                Intrinsics.k("gameId");
                throw null;
            }
        }
        v0 v0Var = (v0) obj;
        boolean isSuccessful = v0Var.f29302a.isSuccessful();
        if (isSuccessful) {
            leagueDetailPreJoiningViewModel.f9084g.postValue(Boolean.FALSE);
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (arenaGame = (ArenaGame) baseResponseDto.getData()) != null) {
                leagueDetailPreJoiningViewModel.f9050q.postValue(arenaGame);
                leagueDetailPreJoiningViewModel.f9058y.postValue(Boolean.TRUE);
                if (arenaGame.getJoiningFee() > 0) {
                    qf.b section = qf.b.f31932g;
                    Intrinsics.checkNotNullParameter(section, "section");
                    yk.g.H(u0.f(leagueDetailPreJoiningViewModel), r0.f32256b, null, new f(leagueDetailPreJoiningViewModel, null), 2);
                }
            }
        } else if (!isSuccessful) {
            leagueDetailPreJoiningViewModel.f9084g.postValue(Boolean.FALSE);
            Gson gson = new Gson();
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.string();
            }
            leagueDetailPreJoiningViewModel.f9056w.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
        }
        return Unit.f23355a;
    }
}
