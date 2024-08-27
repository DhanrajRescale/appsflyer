package zc;

import com.assetgro.stockgro.data.model.LeaderBoardUserDto;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        LeaderBoardUserDto oldItem = (LeaderBoardUserDto) obj;
        LeaderBoardUserDto newItem = (LeaderBoardUserDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getUserId(), newItem.getUserId()) && Intrinsics.a(oldItem.getRank(), newItem.getRank()) && Intrinsics.a(oldItem.getName(), newItem.getName()) && oldItem.getPortfolioDetails().getValue() == newItem.getPortfolioDetails().getValue()) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        LeaderBoardUserDto oldItem = (LeaderBoardUserDto) obj;
        LeaderBoardUserDto newItem = (LeaderBoardUserDto) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getUserId(), newItem.getUserId());
    }
}
