package ie;

import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InviteTemplateDto f19920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GroupChatHostViewModel groupChatHostViewModel, InviteTemplateDto inviteTemplateDto, yt.a aVar) {
        super(2, aVar);
        this.f19919b = groupChatHostViewModel;
        this.f19920c = inviteTemplateDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f19919b, this.f19920c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        InviteTemplateResponse inviteTemplateResponse;
        String inviteTemplate;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19918a;
        GroupChatHostViewModel groupChatHostViewModel = this.f19919b;
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
                ChatRepository chatRepository = groupChatHostViewModel.f9369n;
                InviteTemplateDto inviteTemplateDto = this.f19920c;
                this.f19918a = 1;
                obj = chatRepository.getInviteTemplate(inviteTemplateDto, this);
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
