package de;

import com.assetgro.stockgro.data.model.Group;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        Group oldItem = (Group) obj;
        Group newItem = (Group) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getGroupId(), newItem.getGroupId()) && Intrinsics.a(oldItem.getGroupName(), newItem.getGroupName()) && Intrinsics.a(oldItem.getJoinStatus(), newItem.getJoinStatus()) && Intrinsics.a(oldItem.getCoverImageURL(), newItem.getCoverImageURL())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        Group oldItem = (Group) obj;
        Group newItem = (Group) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getGroupId(), newItem.getGroupId()) && Intrinsics.a(oldItem.getGroupName(), newItem.getGroupName()) && Intrinsics.a(oldItem.getJoinStatus(), newItem.getJoinStatus()) && Intrinsics.a(oldItem.getCoverImageURL(), newItem.getCoverImageURL())) {
            return true;
        }
        return false;
    }
}
