package vd;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupUIConfig;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f38011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(GroupMemberListViewModel groupMemberListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f38011b = groupMemberListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s(this.f38011b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Group group;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38010a;
        GroupMemberListViewModel groupMemberListViewModel = this.f38011b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupMemberListViewModel.f9286n;
                String str = groupMemberListViewModel.E;
                this.f38010a = 1;
                obj = chatRepository.getChatGroupByIdV2(str, true, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (group = (Group) baseResponseDto.getData()) != null) {
                    groupMemberListViewModel.J.postValue(group);
                    GroupUIConfig groupUIConfig = group.getGroupUIConfig();
                    if (groupUIConfig != null) {
                        groupMemberListViewModel.f9293u.postValue(groupUIConfig);
                    }
                }
            } else {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupMemberListViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
