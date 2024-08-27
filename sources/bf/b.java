package bf;

import com.assetgro.stockgro.data.model.DisplayPicture;
import com.assetgro.stockgro.data.model.StockGyanCard;
import com.assetgro.stockgro.data.model.StockGyanGroup;
import com.assetgro.stockgro.data.model.StockGyanIndex;
import java.util.List;
import k7.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends w {
    public static boolean i(DisplayPicture displayPicture, DisplayPicture displayPicture2) {
        if (Intrinsics.a(displayPicture.getId(), displayPicture2.getId()) && Intrinsics.a(displayPicture.getUrl(), displayPicture2.getUrl())) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        StockGyanGroup oldItem = (StockGyanGroup) obj;
        StockGyanGroup newItem = (StockGyanGroup) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.a(oldItem.getId(), newItem.getId()) || !Intrinsics.a(oldItem.getName(), newItem.getName()) || !i(oldItem.getDisplayPicture(), newItem.getDisplayPicture())) {
            return false;
        }
        List<StockGyanIndex> stockGyanIndices = oldItem.getStockGyanIndices();
        List<StockGyanIndex> stockGyanIndices2 = newItem.getStockGyanIndices();
        if (stockGyanIndices.size() != stockGyanIndices2.size()) {
            return false;
        }
        int size = stockGyanIndices.size();
        for (int i10 = 0; i10 < size; i10++) {
            StockGyanIndex stockGyanIndex = stockGyanIndices.get(i10);
            StockGyanIndex stockGyanIndex2 = stockGyanIndices2.get(i10);
            if (!Intrinsics.a(stockGyanIndex.getId(), stockGyanIndex2.getId()) || !Intrinsics.a(stockGyanIndex.getName(), stockGyanIndex2.getName()) || !i(stockGyanIndex.getDisplayPicture(), stockGyanIndex2.getDisplayPicture())) {
                return false;
            }
            List<StockGyanCard> stockGyanCards = stockGyanIndex.getStockGyanCards();
            List<StockGyanCard> stockGyanCards2 = stockGyanIndex2.getStockGyanCards();
            if (stockGyanCards.size() != stockGyanCards2.size()) {
                return false;
            }
            int size2 = stockGyanCards.size();
            for (int i11 = 0; i11 < size2; i11++) {
                StockGyanCard stockGyanCard = stockGyanCards.get(i11);
                StockGyanCard stockGyanCard2 = stockGyanCards2.get(i11);
                if (!Intrinsics.a(stockGyanCard.getId(), stockGyanCard2.getId()) || !i(stockGyanCard.getDisplayPicture(), stockGyanCard2.getDisplayPicture()) || !Intrinsics.a(stockGyanCard.getTotalLikes(), stockGyanCard2.getTotalLikes())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        StockGyanGroup oldItem = (StockGyanGroup) obj;
        StockGyanGroup newItem = (StockGyanGroup) obj2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.a(oldItem.getId(), newItem.getId());
    }
}
