package ie;

import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GroupChatHostViewModel groupChatHostViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19922b = groupChatHostViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f19922b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List<GroupMember> members;
        GroupMember groupMember;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19921a;
        GroupChatHostViewModel groupChatHostViewModel = this.f19922b;
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
                String currentUserId = groupChatHostViewModel.f9081d.getCurrentUserId();
                String str = groupChatHostViewModel.A;
                this.f19921a = 1;
                obj = chatRepository.getUserGlobalRole(currentUserId, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                GroupMembersDto groupMembersDto = (GroupMembersDto) v0Var.f29303b;
                if (groupMembersDto != null && (members = groupMembersDto.getMembers()) != null && (groupMember = members.get(0)) != null) {
                    String globalRole = groupMember.getGlobalRole();
                    if (globalRole != null) {
                        Intrinsics.checkNotNullParameter(globalRole, "<set-?>");
                        groupChatHostViewModel.I = globalRole;
                    }
                    String role = groupMember.getRole();
                    Intrinsics.checkNotNullParameter(role, "<set-?>");
                    groupChatHostViewModel.H = role;
                }
            } else {
                groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupChatHostViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
