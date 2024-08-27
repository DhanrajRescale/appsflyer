package ge;

import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchContactViewModel f17346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InviteTemplateDto f17347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SearchContactViewModel searchContactViewModel, InviteTemplateDto inviteTemplateDto, yt.a aVar) {
        super(2, aVar);
        this.f17346b = searchContactViewModel;
        this.f17347c = inviteTemplateDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f17346b, this.f17347c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        InviteTemplateResponse inviteTemplateResponse;
        String inviteTemplate;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17345a;
        SearchContactViewModel searchContactViewModel = this.f17346b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                searchContactViewModel.f9084g.postValue(Boolean.TRUE);
                UserRepository userRepository = searchContactViewModel.f9081d;
                InviteTemplateDto inviteTemplateDto = this.f17347c;
                this.f17345a = 1;
                obj = userRepository.getInviteTemplate(inviteTemplateDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (inviteTemplateResponse = (InviteTemplateResponse) baseResponseDto.getData()) != null && (inviteTemplate = inviteTemplateResponse.getInviteTemplate()) != null) {
                searchContactViewModel.f9363z.postValue(inviteTemplate);
            }
            searchContactViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            searchContactViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
