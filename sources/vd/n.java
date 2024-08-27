package vd;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f37993b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(GroupMemberListViewModel groupMemberListViewModel, int i10) {
        super(1);
        this.f37992a = i10;
        this.f37993b = groupMemberListViewModel;
    }

    public final void a(GroupMembersDto groupMembersDto) {
        int i10 = this.f37992a;
        GroupMemberListViewModel groupMemberListViewModel = this.f37993b;
        switch (i10) {
            case 3:
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                List<GroupMember> members = groupMembersDto.getMembers();
                if (members != null) {
                    if (groupMemberListViewModel.I) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : members) {
                            if (!Intrinsics.a(((GroupMember) obj).getUserId(), groupMemberListViewModel.f9081d.getCurrentUserId())) {
                                arrayList.add(obj);
                            }
                        }
                        members = arrayList;
                    }
                    groupMemberListViewModel.f9289q.postValue(members);
                }
                Boolean endOfResponse = groupMembersDto.getEndOfResponse();
                if (endOfResponse != null) {
                    groupMemberListViewModel.G = endOfResponse.booleanValue();
                    return;
                }
                return;
            default:
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                List<GroupMember> members2 = groupMembersDto.getMembers();
                if (members2 != null) {
                    groupMemberListViewModel.f9289q.postValue(members2);
                }
                Boolean endOfResponse2 = groupMembersDto.getEndOfResponse();
                if (endOfResponse2 != null) {
                    groupMemberListViewModel.G = endOfResponse2.booleanValue();
                    return;
                }
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f37992a;
        GroupMemberListViewModel groupMemberListViewModel = this.f37993b;
        switch (i10) {
            case 0:
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 1:
            case 3:
            default:
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 4:
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37992a) {
            case 0:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 1:
                Group group = (Group) obj;
                GroupMemberListViewModel groupMemberListViewModel = this.f37993b;
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    groupMemberListViewModel.f9288p.postValue(group);
                }
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                a((GroupMembersDto) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                a((GroupMembersDto) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
