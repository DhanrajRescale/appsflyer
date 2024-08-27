package rd;

import com.assetgro.stockgro.data.model.UserSocialAuthStatusDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class b0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33609b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(GroupChatViewModel groupChatViewModel, yt.a aVar) {
        super(2, aVar);
        this.f33609b = groupChatViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b0(this.f33609b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        UserSocialAuthStatusDto userSocialAuthStatusDto;
        Boolean isPresent;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33608a;
        GroupChatViewModel groupChatViewModel = this.f33609b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupChatViewModel.f9176n;
                this.f33608a = 1;
                obj = chatRepository.getUserSocialAuthStatus(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (userSocialAuthStatusDto = (UserSocialAuthStatusDto) v0Var.f29303b) != null && (isPresent = userSocialAuthStatusDto.isPresent()) != null) {
                groupChatViewModel.f9180p0 = isPresent.booleanValue();
            }
        } catch (Exception e10) {
            groupChatViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
