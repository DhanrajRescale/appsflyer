package rd;

import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class a0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(GroupChatViewModel groupChatViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f33605b = groupChatViewModel;
        this.f33606c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a0(this.f33605b, this.f33606c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        GroupMember groupMember;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33604a;
        GroupChatViewModel groupChatViewModel = this.f33605b;
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
                String str = this.f33606c;
                String str2 = groupChatViewModel.f9196x0;
                this.f33604a = 1;
                obj = chatRepository.getUserGlobalRole(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                GroupMembersDto groupMembersDto = (GroupMembersDto) v0Var.f29303b;
                if (groupMembersDto != null) {
                    List<GroupMember> members = groupMembersDto.getMembers();
                    if (members != null && (groupMember = members.get(0)) != null) {
                        groupChatViewModel.N.postValue(groupMember);
                    }
                    groupChatViewModel.f9171i0.postValue(Boolean.TRUE);
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
