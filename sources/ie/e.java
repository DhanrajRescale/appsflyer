package ie;

import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InviteTemplateDto f19911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupChatHostViewModel groupChatHostViewModel, InviteTemplateDto inviteTemplateDto, yt.a aVar) {
        super(2, aVar);
        this.f19910b = groupChatHostViewModel;
        this.f19911c = inviteTemplateDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f19910b, this.f19911c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        InviteTemplateResponse inviteTemplateResponse;
        String inviteTemplate;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19909a;
        GroupChatHostViewModel groupChatHostViewModel = this.f19910b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                groupChatHostViewModel.f9084g.postValue(Boolean.TRUE);
                UserRepository userRepository = groupChatHostViewModel.f9081d;
                InviteTemplateDto inviteTemplateDto = this.f19911c;
                this.f19909a = 1;
                obj = userRepository.getInviteTemplate(inviteTemplateDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (inviteTemplateResponse = (InviteTemplateResponse) baseResponseDto.getData()) != null && (inviteTemplate = inviteTemplateResponse.getInviteTemplate()) != null) {
                groupChatHostViewModel.f9378w.postValue(inviteTemplate);
            }
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
