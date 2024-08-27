package ga;

import com.assetgro.stockgro.data.model.KycFAQ;
import com.assetgro.stockgro.data.model.NotificationDto;
import com.assetgro.stockgro.data.model.PrizeDistributionDto;
import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import com.assetgro.stockgro.data.model.WalletTransaction;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSection;
import com.assetgro.stockgro.data.remote.response.ExpiryOption;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import k7.w;
import kotlin.jvm.internal.Intrinsics;
import ni.s;

/* loaded from: classes.dex */
public final class a extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17174b;

    public /* synthetic */ a(int i10) {
        this.f17174b = i10;
    }

    @Override // k7.w
    public final boolean b(Object obj, Object obj2) {
        switch (this.f17174b) {
            case 0:
                OptionContract oldItem = (OptionContract) obj;
                OptionContract newItem = (OptionContract) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (!Intrinsics.a(oldItem.getName(), newItem.getName()) || oldItem.getStrikePrice() != newItem.getStrikePrice() || !Intrinsics.a(oldItem.getChange(), newItem.getChange())) {
                    return false;
                }
                return true;
            case 1:
                FnoOption oldItem2 = (FnoOption) obj;
                FnoOption newItem2 = (FnoOption) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                if (oldItem2.getLtp() != newItem2.getLtp() || !Intrinsics.a(oldItem2.getImageUrl(), newItem2.getImageUrl()) || !Intrinsics.a(oldItem2.getChange(), newItem2.getChange())) {
                    return false;
                }
                return true;
            case 2:
                return j((UserTask) obj, (UserTask) obj2);
            case 3:
                return j((UserTask) obj, (UserTask) obj2);
            case 4:
                ArenaSection oldItem3 = (ArenaSection) obj;
                ArenaSection newItem3 = (ArenaSection) obj2;
                Intrinsics.checkNotNullParameter(oldItem3, "oldItem");
                Intrinsics.checkNotNullParameter(newItem3, "newItem");
                return Intrinsics.a(oldItem3, newItem3);
            case 5:
                PrizeDistributionDto oldItem4 = (PrizeDistributionDto) obj;
                PrizeDistributionDto newItem4 = (PrizeDistributionDto) obj2;
                Intrinsics.checkNotNullParameter(oldItem4, "oldItem");
                Intrinsics.checkNotNullParameter(newItem4, "newItem");
                if (oldItem4.getAmount() != newItem4.getAmount()) {
                    return false;
                }
                return true;
            case 6:
                NotificationDto oldItem5 = (NotificationDto) obj;
                NotificationDto newItem5 = (NotificationDto) obj2;
                Intrinsics.checkNotNullParameter(oldItem5, "oldItem");
                Intrinsics.checkNotNullParameter(newItem5, "newItem");
                if (!Intrinsics.a(oldItem5.getMessage(), newItem5.getMessage()) || oldItem5.getCreatedAt() != newItem5.getCreatedAt() || !Intrinsics.a(oldItem5.getType(), newItem5.getType())) {
                    return false;
                }
                return true;
            case 7:
                KycFAQ oldItem6 = (KycFAQ) obj;
                KycFAQ newItem6 = (KycFAQ) obj2;
                Intrinsics.checkNotNullParameter(oldItem6, "oldItem");
                Intrinsics.checkNotNullParameter(newItem6, "newItem");
                if (!Intrinsics.a(oldItem6.getQuestion(), newItem6.getQuestion()) || !Intrinsics.a(oldItem6.getAnswer(), newItem6.getAnswer())) {
                    return false;
                }
                return true;
            case 8:
                WalletTransaction oldItem7 = (WalletTransaction) obj;
                WalletTransaction newItem7 = (WalletTransaction) obj2;
                Intrinsics.checkNotNullParameter(oldItem7, "oldItem");
                Intrinsics.checkNotNullParameter(newItem7, "newItem");
                if (!Intrinsics.a(oldItem7.getTxnStatus(), newItem7.getTxnStatus()) || !Intrinsics.a(oldItem7.getSubTitle(), newItem7.getSubTitle()) || !Intrinsics.a(oldItem7.getReason(), newItem7.getReason())) {
                    return false;
                }
                return true;
            case 9:
                return i((UnifiedStockTransaction) obj, (UnifiedStockTransaction) obj2);
            case 10:
                return i((UnifiedStockTransaction) obj, (UnifiedStockTransaction) obj2);
            case 11:
                ExpiryOption oldItem8 = (ExpiryOption) obj;
                ExpiryOption newItem8 = (ExpiryOption) obj2;
                Intrinsics.checkNotNullParameter(oldItem8, "oldItem");
                Intrinsics.checkNotNullParameter(newItem8, "newItem");
                if (oldItem8.getPrice() != newItem8.getPrice() || oldItem8.getPricePerDay() != newItem8.getPricePerDay() || !Intrinsics.a(oldItem8.getSavePercentage(), newItem8.getSavePercentage()) || oldItem8.getMostPopular() != newItem8.getMostPopular()) {
                    return false;
                }
                return true;
            default:
                s oldItem9 = (s) obj;
                s newItem9 = (s) obj2;
                Intrinsics.checkNotNullParameter(oldItem9, "oldItem");
                Intrinsics.checkNotNullParameter(newItem9, "newItem");
                if (oldItem9.f28763b != newItem9.f28763b || oldItem9.f28762a != newItem9.f28762a || oldItem9.f28765d != newItem9.f28765d) {
                    return false;
                }
                return true;
        }
    }

    @Override // k7.w
    public final boolean d(Object obj, Object obj2) {
        switch (this.f17174b) {
            case 0:
                OptionContract oldItem = (OptionContract) obj;
                OptionContract newItem = (OptionContract) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.a(oldItem.getIdentifier(), newItem.getIdentifier());
            case 1:
                FnoOption oldItem2 = (FnoOption) obj;
                FnoOption newItem2 = (FnoOption) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                return Intrinsics.a(oldItem2.getIdentifier(), newItem2.getIdentifier());
            case 2:
                return l((UserTask) obj, (UserTask) obj2);
            case 3:
                return l((UserTask) obj, (UserTask) obj2);
            case 4:
                ArenaSection oldItem3 = (ArenaSection) obj;
                ArenaSection newItem3 = (ArenaSection) obj2;
                Intrinsics.checkNotNullParameter(oldItem3, "oldItem");
                Intrinsics.checkNotNullParameter(newItem3, "newItem");
                return Intrinsics.a(oldItem3, newItem3);
            case 5:
                PrizeDistributionDto oldItem4 = (PrizeDistributionDto) obj;
                PrizeDistributionDto newItem4 = (PrizeDistributionDto) obj2;
                Intrinsics.checkNotNullParameter(oldItem4, "oldItem");
                Intrinsics.checkNotNullParameter(newItem4, "newItem");
                return Intrinsics.a(oldItem4.getRank(), newItem4.getRank());
            case 6:
                NotificationDto oldItem5 = (NotificationDto) obj;
                NotificationDto newItem5 = (NotificationDto) obj2;
                Intrinsics.checkNotNullParameter(oldItem5, "oldItem");
                Intrinsics.checkNotNullParameter(newItem5, "newItem");
                return Intrinsics.a(oldItem5.getNotificationId(), newItem5.getNotificationId());
            case 7:
                KycFAQ oldItem6 = (KycFAQ) obj;
                KycFAQ newItem6 = (KycFAQ) obj2;
                Intrinsics.checkNotNullParameter(oldItem6, "oldItem");
                Intrinsics.checkNotNullParameter(newItem6, "newItem");
                return Intrinsics.a(oldItem6.getQuestion(), newItem6.getQuestion());
            case 8:
                WalletTransaction oldItem7 = (WalletTransaction) obj;
                WalletTransaction newItem7 = (WalletTransaction) obj2;
                Intrinsics.checkNotNullParameter(oldItem7, "oldItem");
                Intrinsics.checkNotNullParameter(newItem7, "newItem");
                return Intrinsics.a(oldItem7.getId(), newItem7.getId());
            case 9:
                return k((UnifiedStockTransaction) obj, (UnifiedStockTransaction) obj2);
            case 10:
                return k((UnifiedStockTransaction) obj, (UnifiedStockTransaction) obj2);
            case 11:
                ExpiryOption oldItem8 = (ExpiryOption) obj;
                ExpiryOption newItem8 = (ExpiryOption) obj2;
                Intrinsics.checkNotNullParameter(oldItem8, "oldItem");
                Intrinsics.checkNotNullParameter(newItem8, "newItem");
                return Intrinsics.a(oldItem8.getDuration(), newItem8.getDuration());
            default:
                s oldItem9 = (s) obj;
                s newItem9 = (s) obj2;
                Intrinsics.checkNotNullParameter(oldItem9, "oldItem");
                Intrinsics.checkNotNullParameter(newItem9, "newItem");
                if (oldItem9.f28764c == newItem9.f28764c) {
                    return true;
                }
                return false;
        }
    }

    public final boolean i(UnifiedStockTransaction oldItem, UnifiedStockTransaction newItem) {
        switch (this.f17174b) {
            case 9:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (!Intrinsics.a(oldItem.getName(), newItem.getName()) || !Intrinsics.a(oldItem.getQuantity(), newItem.getQuantity()) || !Intrinsics.a(oldItem.getAveragePriceSide1(), newItem.getAveragePriceSide1()) || !Intrinsics.a(oldItem.getAveragePriceSide2(), newItem.getAveragePriceSide1()) || !Intrinsics.a(oldItem.getMarketValue(), newItem.getMarketValue()) || !Intrinsics.a(oldItem.getProfitPercentage(), newItem.getProfitPercentage()) || !Intrinsics.a(oldItem.getUnrealizedProfitPercentage(), newItem.getUnrealizedProfitPercentage())) {
                    return false;
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (!Intrinsics.a(oldItem.getName(), newItem.getName()) || !Intrinsics.a(oldItem.getQuantity(), newItem.getQuantity()) || !Intrinsics.a(oldItem.getAveragePriceSide1(), newItem.getAveragePriceSide1()) || !Intrinsics.a(oldItem.getAveragePriceSide2(), newItem.getAveragePriceSide1()) || !Intrinsics.a(oldItem.getMarketValue(), newItem.getMarketValue()) || !Intrinsics.a(oldItem.getProfitPercentage(), newItem.getProfitPercentage()) || !Intrinsics.a(oldItem.getUnrealizedProfitPercentage(), newItem.getUnrealizedProfitPercentage())) {
                    return false;
                }
                return true;
        }
    }

    public final boolean j(UserTask oldItem, UserTask newItem) {
        switch (this.f17174b) {
            case 2:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (oldItem.getId() != newItem.getId() || !Intrinsics.a(oldItem.getTitle(), newItem.getTitle())) {
                    return false;
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (!Intrinsics.a(oldItem.getTitle(), newItem.getTitle()) || !Intrinsics.a(oldItem.getStatus(), newItem.getStatus()) || !Intrinsics.a(oldItem.getLiveDate(), newItem.getLiveDate())) {
                    return false;
                }
                return true;
        }
    }

    public final boolean k(UnifiedStockTransaction oldItem, UnifiedStockTransaction newItem) {
        switch (this.f17174b) {
            case 9:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.a(oldItem.getCode(), newItem.getCode());
            default:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.a(oldItem.getCode(), newItem.getCode());
        }
    }

    public final boolean l(UserTask oldItem, UserTask newItem) {
        switch (this.f17174b) {
            case 2:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (oldItem.getId() != newItem.getId()) {
                    return false;
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (oldItem.getId() != newItem.getId()) {
                    return false;
                }
                return true;
        }
    }
}
