package ie;

import com.assetgro.stockgro.data.model.ManageMemberResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(GroupChatHostViewModel groupChatHostViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f19924b = groupChatHostViewModel;
        this.f19925c = str;
        this.f19926d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f19924b, this.f19925c, this.f19926d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ManageMemberResponse manageMemberResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19923a;
        GroupChatHostViewModel groupChatHostViewModel = this.f19924b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupChatHostViewModel.f9369n;
                String str = this.f19925c;
                String str2 = this.f19926d;
                this.f19923a = 1;
                obj = chatRepository.manageMember(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b;
                if (baseResponseV2Dto != null) {
                    manageMemberResponse = (ManageMemberResponse) baseResponseV2Dto.getData();
                } else {
                    manageMemberResponse = null;
                }
                groupChatHostViewModel.R.postValue(manageMemberResponse);
            } else {
                groupChatHostViewModel.N.postValue("Try again later");
            }
        } catch (Exception unused) {
            groupChatHostViewModel.N.postValue("Check internet connection");
        }
        return Unit.f23355a;
    }
}
