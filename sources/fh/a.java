package fh;

import android.content.Intent;
import android.widget.LinearLayout;
import androidx.lifecycle.e0;
import androidx.recyclerview.widget.RecyclerView;
import ba.dl;
import com.assetgro.stockgro.data.enums.GroupJoinStatus;
import com.assetgro.stockgro.data.model.socialgroups.GroupInfo;
import com.assetgro.stockgro.data.model.socialgroups.SocialGroupsItem;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.profile.group.GroupMyProfileViewModel;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f16099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(1);
        this.f16098a = i10;
        this.f16099b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GroupJoinStatus groupJoinStatus;
        int i10 = this.f16098a;
        b bVar = this.f16099b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    RecyclerView rvSocialGroupsList = ((dl) bVar.q()).f4505v;
                    Intrinsics.checkNotNullExpressionValue(rvSocialGroupsList, "rvSocialGroupsList");
                    zq.f.m0(rvSocialGroupsList);
                    LinearLayout noSocialGroupContainer = ((dl) bVar.q()).f4503t;
                    Intrinsics.checkNotNullExpressionValue(noSocialGroupContainer, "noSocialGroupContainer");
                    zq.f.M(noSocialGroupContainer);
                    g gVar = bVar.f16101g;
                    if (gVar != null) {
                        gVar.u(list);
                    } else {
                        Intrinsics.k("socialGroupsAdapter");
                        throw null;
                    }
                } else {
                    RecyclerView rvSocialGroupsList2 = ((dl) bVar.q()).f4505v;
                    Intrinsics.checkNotNullExpressionValue(rvSocialGroupsList2, "rvSocialGroupsList");
                    zq.f.M(rvSocialGroupsList2);
                    LinearLayout noSocialGroupContainer2 = ((dl) bVar.q()).f4503t;
                    Intrinsics.checkNotNullExpressionValue(noSocialGroupContainer2, "noSocialGroupContainer");
                    zq.f.m0(noSocialGroupContainer2);
                }
                return Unit.f23355a;
            case 1:
                GroupInfo chatGroup = (GroupInfo) obj;
                Intrinsics.c(chatGroup);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(chatGroup, "chatGroup");
                Intent intent = new Intent(bVar.requireActivity(), (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", chatGroup.getGroupId());
                bVar.f16103i.a(intent);
                return Unit.f23355a;
            case 2:
                String groupId = (String) obj;
                Intrinsics.c(groupId);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intent intent2 = new Intent(bVar.requireActivity(), (Class<?>) GroupDetailActivity.class);
                intent2.putExtra("GROUP_CHAT_ID", groupId);
                bVar.f16103i.a(intent2);
                return Unit.f23355a;
            default:
                SocialGroupsItem it = (SocialGroupsItem) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                GroupMyProfileViewModel groupMyProfileViewModel = (GroupMyProfileViewModel) bVar.r();
                GroupInfo chatGroup2 = it.getGroupInfo();
                Intrinsics.checkNotNullParameter(chatGroup2, "chatGroup");
                boolean isEmpty = groupMyProfileViewModel.f9985p.isEmpty();
                e0 e0Var = groupMyProfileViewModel.f9986q;
                if (isEmpty) {
                    e0Var.postValue(chatGroup2.getGroupId());
                }
                String str = (String) groupMyProfileViewModel.f9985p.get(chatGroup2.getGroupId());
                if (s.j(str, "Joined", false)) {
                    groupJoinStatus = GroupJoinStatus.Joined;
                } else if (s.j(str, "Requested", false)) {
                    groupJoinStatus = GroupJoinStatus.Requested;
                } else if (s.j(str, "Cancelled", false)) {
                    groupJoinStatus = GroupJoinStatus.Cancelled;
                } else if (s.j(str, "Exited", false)) {
                    groupJoinStatus = GroupJoinStatus.Exited;
                } else {
                    groupJoinStatus = GroupJoinStatus.None;
                }
                int i11 = c.f16104a[groupJoinStatus.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                chatGroup2.setJoinStatus("None");
                                e0Var.postValue(chatGroup2.getGroupId());
                            } else {
                                chatGroup2.setJoinStatus("Exited");
                                e0Var.postValue(chatGroup2.getGroupId());
                            }
                        } else {
                            chatGroup2.setJoinStatus("Cancelled");
                            e0Var.postValue(chatGroup2.getGroupId());
                        }
                    } else {
                        chatGroup2.setJoinStatus("Requested");
                        e0Var.postValue(chatGroup2.getGroupId());
                    }
                } else {
                    chatGroup2.setJoinStatus("Joined");
                    groupMyProfileViewModel.f9987r.postValue(chatGroup2);
                }
                if (groupMyProfileViewModel.f9985p.isEmpty()) {
                    e0Var.postValue(chatGroup2.getGroupId());
                }
                return Unit.f23355a;
        }
    }
}
