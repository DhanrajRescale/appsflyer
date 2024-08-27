package zd;

import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f42416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupPinnedMessagesViewModel f42417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GroupPinnedMessagesViewModel groupPinnedMessagesViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f42417b = groupPinnedMessagesViewModel;
        this.f42418c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f42417b, this.f42418c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List<GroupMember> members;
        GroupMember groupMember;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f42416a;
        GroupPinnedMessagesViewModel groupPinnedMessagesViewModel = this.f42417b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = groupPinnedMessagesViewModel.f9303n;
                String str = this.f42418c;
                String str2 = groupPinnedMessagesViewModel.f9313x;
                this.f42416a = 1;
                obj = chatRepository.getUserGlobalRole(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                GroupMembersDto groupMembersDto = (GroupMembersDto) v0Var.f29303b;
                if (groupMembersDto != null && (members = groupMembersDto.getMembers()) != null && (groupMember = members.get(0)) != null) {
                    String globalRole = groupMember.getGlobalRole();
                    if (globalRole != null) {
                        Intrinsics.checkNotNullParameter(globalRole, "<set-?>");
                        groupPinnedMessagesViewModel.f9311v = globalRole;
                    }
                    Intrinsics.checkNotNullParameter(groupMember.getRole(), "<set-?>");
                }
            } else {
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupPinnedMessagesViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
