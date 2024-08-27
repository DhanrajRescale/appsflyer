package ye;

import androidx.lifecycle.e0;
import au.i;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.drawer.invite.InviteViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InviteViewModel f41607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InviteTemplateDto f41608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InviteViewModel inviteViewModel, InviteTemplateDto inviteTemplateDto, yt.a aVar) {
        super(2, aVar);
        this.f41607b = inviteViewModel;
        this.f41608c = inviteTemplateDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f41607b, this.f41608c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        InviteTemplateResponse inviteTemplateResponse;
        String inviteTemplate;
        String referralCode;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f41606a;
        InviteViewModel inviteViewModel = this.f41607b;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    inviteViewModel.f9084g.postValue(Boolean.TRUE);
                    UserRepository userRepository = inviteViewModel.f9081d;
                    InviteTemplateDto inviteTemplateDto = this.f41608c;
                    this.f41606a = 1;
                    obj = userRepository.getInviteTemplate(inviteTemplateDto, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                v0 v0Var = (v0) obj;
                if (v0Var.f29302a.isSuccessful()) {
                    BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                    if (baseResponseDto != null) {
                        inviteTemplateResponse = (InviteTemplateResponse) baseResponseDto.getData();
                    } else {
                        inviteTemplateResponse = null;
                    }
                    if (inviteTemplateResponse != null && (referralCode = inviteTemplateResponse.getReferralCode()) != null) {
                        inviteViewModel.f9489o.postValue(referralCode);
                        inviteViewModel.f9081d.saveUserReferralCode(referralCode);
                    }
                    if (inviteTemplateResponse != null && (inviteTemplate = inviteTemplateResponse.getInviteTemplate()) != null) {
                        inviteViewModel.f9488n.postValue(inviteTemplate);
                    }
                }
                e0Var = inviteViewModel.f9084g;
            } catch (Exception e10) {
                e10.printStackTrace();
                e0Var = inviteViewModel.f9084g;
            }
            e0Var.postValue(Boolean.FALSE);
            return Unit.f23355a;
        } catch (Throwable th2) {
            inviteViewModel.f9084g.postValue(Boolean.FALSE);
            throw th2;
        }
    }
}
