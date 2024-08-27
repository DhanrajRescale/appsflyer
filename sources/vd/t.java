package vd;

import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f38013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(GroupMemberListViewModel groupMemberListViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f38013b = groupMemberListViewModel;
        this.f38014c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f38013b, this.f38014c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List<GroupMember> members;
        GroupMember groupMember;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38012a;
        GroupMemberListViewModel groupMemberListViewModel = this.f38013b;
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
                String str = this.f38014c;
                String str2 = groupMemberListViewModel.E;
                this.f38012a = 1;
                obj = chatRepository.getUserGlobalRole(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                GroupMembersDto groupMembersDto = (GroupMembersDto) v0Var.f29303b;
                if (groupMembersDto != null && (members = groupMembersDto.getMembers()) != null && (groupMember = members.get(0)) != null) {
                    String globalRole = groupMember.getGlobalRole();
                    if (globalRole != null) {
                        Intrinsics.checkNotNullParameter(globalRole, "<set-?>");
                    }
                    String role = groupMember.getRole();
                    Intrinsics.checkNotNullParameter(role, "<set-?>");
                    groupMemberListViewModel.B.postValue(role);
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
