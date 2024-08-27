package me;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.ui.chat.members.BannedMemberListViewModel;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannedMemberListViewModel f27720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BannedMemberListViewModel bannedMemberListViewModel, int i10) {
        super(1);
        this.f27719a = i10;
        this.f27720b = bannedMemberListViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f27719a;
        BannedMemberListViewModel bannedMemberListViewModel = this.f27720b;
        switch (i10) {
            case 0:
                bannedMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 1:
            default:
                bannedMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
                bannedMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<GroupMember> members;
        int i10 = this.f27719a;
        BannedMemberListViewModel bannedMemberListViewModel = this.f27720b;
        switch (i10) {
            case 0:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 1:
                Group group = (Group) obj;
                bannedMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    bannedMemberListViewModel.f9408o.postValue(group);
                }
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                GroupMembersDto groupMembersDto = (GroupMembersDto) obj;
                bannedMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                if (groupMembersDto != null && (members = groupMembersDto.getMembers()) != null) {
                    bannedMemberListViewModel.f9410q.postValue(members);
                }
                Boolean endOfResponse = groupMembersDto.getEndOfResponse();
                if (endOfResponse != null) {
                    bannedMemberListViewModel.f9416w = endOfResponse.booleanValue();
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
