package cd;

import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPreJoiningViewModel f8112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InviteTemplateDto f8113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel, InviteTemplateDto inviteTemplateDto, yt.a aVar) {
        super(2, aVar);
        this.f8112b = leagueDetailPreJoiningViewModel;
        this.f8113c = inviteTemplateDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f8112b, this.f8113c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        InviteTemplateResponse inviteTemplateResponse;
        String inviteTemplate;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8111a;
        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = this.f8112b;
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
                InviteTemplateDto inviteTemplateDto = this.f8113c;
                this.f8111a = 1;
                obj = arenaRepository.getInviteTemplate(inviteTemplateDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (inviteTemplateResponse = (InviteTemplateResponse) baseResponseDto.getData()) != null && (inviteTemplate = inviteTemplateResponse.getInviteTemplate()) != null) {
                leagueDetailPreJoiningViewModel.f9054u.postValue(inviteTemplate);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
