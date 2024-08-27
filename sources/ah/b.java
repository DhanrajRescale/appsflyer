package ah;

import com.assetgro.stockgro.data.remote.response.UnlockPortfolioData;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        UnlockPortfolioData oldItem = (UnlockPortfolioData) obj;
        UnlockPortfolioData newItem = (UnlockPortfolioData) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.a(oldItem.getPortfolioType(), newItem.getPortfolioType()) && Intrinsics.a(oldItem.getTransactionFeeType(), newItem.getTransactionFeeType()) && Intrinsics.a(oldItem.getExpiry_options(), newItem.getExpiry_options())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        UnlockPortfolioData oldItem = (UnlockPortfolioData) obj;
        UnlockPortfolioData newItem = (UnlockPortfolioData) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getPortfolioName(), newItem.getPortfolioName());
    }
}
