package td;

import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(GroupInfoViewModel groupInfoViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35953b = groupInfoViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t0(this.f35953b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List<GroupMember> members;
        GroupMember groupMember;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35952a;
        GroupInfoViewModel groupInfoViewModel = this.f35953b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupInfoViewModel.f9241n;
                String currentUserId = groupInfoViewModel.f9081d.getCurrentUserId();
                String str = groupInfoViewModel.F;
                this.f35952a = 1;
                obj = chatRepository.getUserGlobalRole(currentUserId, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            nv.v0 v0Var = (nv.v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                GroupMembersDto groupMembersDto = (GroupMembersDto) v0Var.f29303b;
                if (groupMembersDto != null && (members = groupMembersDto.getMembers()) != null && (groupMember = members.get(0)) != null) {
                    String globalRole = groupMember.getGlobalRole();
                    if (globalRole != null) {
                        Intrinsics.checkNotNullParameter(globalRole, "<set-?>");
                        groupInfoViewModel.E = globalRole;
                    }
                    String role = groupMember.getRole();
                    Intrinsics.checkNotNullParameter(role, "<set-?>");
                    groupInfoViewModel.f9258w.postValue(new Pair(groupInfoViewModel.E, role));
                }
            } else {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupInfoViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
