package rd;

import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(GroupChatViewModel groupChatViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f33658b = groupChatViewModel;
        this.f33659c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v(this.f33658b, this.f33659c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List<GroupMember> members;
        GroupMember groupMember;
        String globalRole;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33657a;
        GroupChatViewModel groupChatViewModel = this.f33658b;
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
                String str = this.f33659c;
                String str2 = groupChatViewModel.f9196x0;
                this.f33657a = 1;
                obj = chatRepository.getUserGlobalRole(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                GroupMembersDto groupMembersDto = (GroupMembersDto) v0Var.f29303b;
                if (groupMembersDto != null && (members = groupMembersDto.getMembers()) != null && (groupMember = members.get(0)) != null && (globalRole = groupMember.getGlobalRole()) != null) {
                    Intrinsics.checkNotNullParameter(globalRole, "<set-?>");
                    groupChatViewModel.f9192v0 = globalRole;
                }
            } else {
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupChatViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
