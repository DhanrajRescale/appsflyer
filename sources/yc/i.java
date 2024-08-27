package yc;

import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.arena.detail.post.LeaguePortfolioViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaguePortfolioViewModel f41513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InviteTemplateDto f41514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LeaguePortfolioViewModel leaguePortfolioViewModel, InviteTemplateDto inviteTemplateDto, yt.a aVar) {
        super(2, aVar);
        this.f41513b = leaguePortfolioViewModel;
        this.f41514c = inviteTemplateDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f41513b, this.f41514c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        InviteTemplateResponse inviteTemplateResponse;
        String inviteTemplate;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f41512a;
        LeaguePortfolioViewModel leaguePortfolioViewModel = this.f41513b;
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
                UserRepository userRepository = leaguePortfolioViewModel.f9081d;
                InviteTemplateDto inviteTemplateDto = this.f41514c;
                this.f41512a = 1;
                obj = userRepository.getInviteTemplate(inviteTemplateDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (inviteTemplateResponse = (InviteTemplateResponse) baseResponseDto.getData()) != null && (inviteTemplate = inviteTemplateResponse.getInviteTemplate()) != null) {
                leaguePortfolioViewModel.f9010y.postValue(inviteTemplate);
            }
            leaguePortfolioViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            leaguePortfolioViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
