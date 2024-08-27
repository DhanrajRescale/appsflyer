package ie;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.social.data.remote.UserGroupLevelPermissionsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public GroupChatHostViewModel f19912a;

    /* renamed from: b, reason: collision with root package name */
    public int f19913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GroupChatHostViewModel groupChatHostViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19914c = groupChatHostViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f19914c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        GroupChatHostViewModel groupChatHostViewModel;
        UserGroupLevelPermissionsDto userGroupLevelPermissionsDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19913b;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (i10 != 0) {
            if (i10 == 1) {
                groupChatHostViewModel = this.f19912a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            GroupChatHostViewModel groupChatHostViewModel2 = this.f19914c;
            String str = groupChatHostViewModel2.A;
            if (str != null) {
                ChatRepository chatRepository = groupChatHostViewModel2.f9369n;
                this.f19912a = groupChatHostViewModel2;
                this.f19913b = 1;
                Object groupMessageLevelPermissions = chatRepository.getGroupMessageLevelPermissions(str, this);
                if (groupMessageLevelPermissions == aVar) {
                    return aVar;
                }
                groupChatHostViewModel = groupChatHostViewModel2;
                obj = groupMessageLevelPermissions;
            }
            return Unit.f23355a;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (userGroupLevelPermissionsDto = (UserGroupLevelPermissionsDto) baseResponseDto.getData()) != null) {
                groupChatHostViewModel.f9380y.postValue(userGroupLevelPermissionsDto.toUserGroupLevelPermissions());
            }
        }
        return Unit.f23355a;
    }
}
