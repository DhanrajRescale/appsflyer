package je;

import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.data.model.GroupInfo;
import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.ui.chat.list.UserGroupListItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserGroupListItemViewModel f21334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(UserGroupListItemViewModel userGroupListItemViewModel, int i10) {
        super(1);
        this.f21333a = i10;
        this.f21334b = userGroupListItemViewModel;
    }

    public final String a(ChatChannel chatChannel) {
        String type;
        String type2;
        int i10 = this.f21333a;
        String str = null;
        UserGroupListItemViewModel userGroupListItemViewModel = this.f21334b;
        switch (i10) {
            case 0:
                UserChatGroup group = chatChannel.getGroup();
                userGroupListItemViewModel.getClass();
                GroupInfo groupInfo = group.getGroupInfo();
                if (groupInfo != null && (type = groupInfo.getType()) != null) {
                    if (!Intrinsics.a(type, "Support") && !Intrinsics.a(type, "1on1")) {
                        return group.getGroupInfo().getImageURL();
                    }
                    return group.getGroupInfo().getFriendImageURL();
                }
                GroupInfo groupInfo2 = group.getGroupInfo();
                if (groupInfo2 != null) {
                    str = groupInfo2.getImageURL();
                }
                return str;
            default:
                UserChatGroup group2 = chatChannel.getGroup();
                userGroupListItemViewModel.getClass();
                GroupInfo groupInfo3 = group2.getGroupInfo();
                if (groupInfo3 != null && (type2 = groupInfo3.getType()) != null) {
                    if (!Intrinsics.a(type2, "Support") && !Intrinsics.a(type2, "1on1")) {
                        return group2.getGroupInfo().getGroupName();
                    }
                    return group2.getGroupInfo().getFriendUserName();
                }
                GroupInfo groupInfo4 = group2.getGroupInfo();
                if (groupInfo4 != null) {
                    str = groupInfo4.getGroupName();
                }
                return str;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f21333a) {
            case 0:
                return a((ChatChannel) obj);
            default:
                return a((ChatChannel) obj);
        }
    }
}
