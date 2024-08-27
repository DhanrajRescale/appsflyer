package fh;

import com.assetgro.stockgro.data.model.socialgroups.SocialGroupsItem;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        SocialGroupsItem oldItem = (SocialGroupsItem) obj;
        SocialGroupsItem newItem = (SocialGroupsItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getGroupId(), newItem.getGroupId()) && Intrinsics.a(oldItem.getUserId(), newItem.getUserId()) && oldItem.getJoinedAtSecs() == newItem.getJoinedAtSecs() && Intrinsics.a(oldItem.getApproverId(), newItem.getApproverId()) && Intrinsics.a(oldItem.getLastReadMsgId(), newItem.getLastReadMsgId()) && Intrinsics.a(oldItem.getGroupInfo().getGroupId(), newItem.getGroupInfo().getGroupId())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        SocialGroupsItem oldItem = (SocialGroupsItem) obj;
        SocialGroupsItem newItem = (SocialGroupsItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getGroupId(), newItem.getGroupId());
    }
}
