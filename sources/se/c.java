package se;

import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryItem;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        SocialSearchHistoryItem oldItem = (SocialSearchHistoryItem) obj;
        SocialSearchHistoryItem newItem = (SocialSearchHistoryItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem, newItem);
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        SocialSearchHistoryItem oldItem = (SocialSearchHistoryItem) obj;
        SocialSearchHistoryItem newItem = (SocialSearchHistoryItem) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getSearchQuery(), newItem.getSearchQuery());
    }
}
