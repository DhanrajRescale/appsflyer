package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.portfolio.holdings.Followers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003¢\u0006\u0002\u0010#J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0012HÆ\u0003J\t\u0010J\u001a\u00020\u0012HÆ\u0003J\t\u0010K\u001a\u00020\u0012HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J±\u0002\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0003HÆ\u0001J\t\u0010a\u001a\u00020bHÖ\u0001J\u0013\u0010c\u001a\u00020\u00122\b\u0010d\u001a\u0004\u0018\u00010eHÖ\u0003J\t\u0010f\u001a\u00020bHÖ\u0001J\t\u0010g\u001a\u00020\u0003HÖ\u0001J\u0019\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00100R\u0016\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00100R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00100R\u0016\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%¨\u0006m"}, d2 = {"Lcom/assetgro/stockgro/data/model/UnifiedStockTransaction;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "code", "quantity", "totalQuantity", "averagePriceSide1", "averagePriceSide2", "currentMarketPrice", "marketValue", "purchaseValue", "netPNL", "realizedProfitGained", "unrealizedPNL", "profitPercentage", "unrealizedProfitPercentage", "isLong", HttpUrl.FRAGMENT_ENCODE_SET, "isShort", "isPNLPositive", "marketSentiment", "sector", "followers", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Followers;", "imageUrl", "stockType", "lotsBought", "lotsSold", "buyAveragePrice", "sellAveragePrice", "contractName", "noOfLots", "lotSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAveragePriceSide1", "()Ljava/lang/String;", "getAveragePriceSide2", "getBuyAveragePrice", "getCode", "getContractName", "getCurrentMarketPrice", "getFollowers", "()Ljava/util/List;", "setFollowers", "(Ljava/util/List;)V", "getImageUrl", "()Z", "getLotSize", "getLotsBought", "getLotsSold", "getMarketSentiment", "getMarketValue", "getName", "getNetPNL", "getNoOfLots", "getProfitPercentage", "getPurchaseValue", "getQuantity", "getRealizedProfitGained", "getSector", "getSellAveragePrice", "getStockType", "getTotalQuantity", "getUnrealizedPNL", "getUnrealizedProfitPercentage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnifiedStockTransaction implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UnifiedStockTransaction> CREATOR = new Creator();

    @SerializedName("average_price_side_1")
    @NotNull
    private final String averagePriceSide1;

    @SerializedName("average_price_side_2")
    @NotNull
    private final String averagePriceSide2;

    @SerializedName("buy_average_price")
    @NotNull
    private final String buyAveragePrice;

    @SerializedName("stock_id")
    @NotNull
    private final String code;

    @SerializedName("contract_name")
    @NotNull
    private final String contractName;

    @SerializedName("ltp")
    @NotNull
    private final String currentMarketPrice;

    @SerializedName("followers")
    @NotNull
    private List<Followers> followers;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("is_long")
    private final boolean isLong;

    @SerializedName("is_pnl_positive")
    private final boolean isPNLPositive;

    @SerializedName("is_short")
    private final boolean isShort;

    @SerializedName("lot_size")
    @NotNull
    private final String lotSize;

    @SerializedName("lots_bought")
    @NotNull
    private final String lotsBought;

    @SerializedName("lots_sold")
    @NotNull
    private final String lotsSold;

    @SerializedName("market_sentiment")
    @NotNull
    private final String marketSentiment;

    @SerializedName("open_pos_market_value")
    @NotNull
    private final String marketValue;

    @SerializedName("stock_name")
    @NotNull
    private final String name;

    @SerializedName("net_pnl")
    @NotNull
    private final String netPNL;

    @SerializedName("no_of_lots")
    @NotNull
    private final String noOfLots;

    @SerializedName("total_profit_percentage")
    @NotNull
    private final String profitPercentage;

    @SerializedName("open_pos_purchase_value")
    @NotNull
    private final String purchaseValue;

    @SerializedName("balance_quantity")
    @NotNull
    private final String quantity;

    @SerializedName("realized_profit_gained")
    @NotNull
    private final String realizedProfitGained;

    @SerializedName("sector")
    @NotNull
    private final String sector;

    @SerializedName("sell_average_price")
    @NotNull
    private final String sellAveragePrice;

    @SerializedName("stock_type")
    @NotNull
    private final String stockType;

    @SerializedName("total_quantity")
    @NotNull
    private final String totalQuantity;

    @SerializedName("unrealized_pnl")
    @NotNull
    private final String unrealizedPNL;

    @SerializedName("unrealized_profit_percentage")
    @NotNull
    private final String unrealizedProfitPercentage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UnifiedStockTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnifiedStockTransaction createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z13 = z10;
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(Followers.CREATOR, parcel, arrayList, i10, 1);
                readInt = readInt;
                readString12 = readString12;
            }
            return new UnifiedStockTransaction(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, z13, z11, z12, readString15, readString16, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnifiedStockTransaction[] newArray(int i10) {
            return new UnifiedStockTransaction[i10];
        }
    }

    public UnifiedStockTransaction(@NotNull String name, @NotNull String code, @NotNull String quantity, @NotNull String totalQuantity, @NotNull String averagePriceSide1, @NotNull String averagePriceSide2, @NotNull String currentMarketPrice, @NotNull String marketValue, @NotNull String purchaseValue, @NotNull String netPNL, @NotNull String realizedProfitGained, @NotNull String unrealizedPNL, @NotNull String profitPercentage, @NotNull String unrealizedProfitPercentage, boolean z10, boolean z11, boolean z12, @NotNull String marketSentiment, @NotNull String sector, @NotNull List<Followers> followers, @NotNull String imageUrl, @NotNull String stockType, @NotNull String lotsBought, @NotNull String lotsSold, @NotNull String buyAveragePrice, @NotNull String sellAveragePrice, @NotNull String contractName, @NotNull String noOfLots, @NotNull String lotSize) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(totalQuantity, "totalQuantity");
        Intrinsics.checkNotNullParameter(averagePriceSide1, "averagePriceSide1");
        Intrinsics.checkNotNullParameter(averagePriceSide2, "averagePriceSide2");
        Intrinsics.checkNotNullParameter(currentMarketPrice, "currentMarketPrice");
        Intrinsics.checkNotNullParameter(marketValue, "marketValue");
        Intrinsics.checkNotNullParameter(purchaseValue, "purchaseValue");
        Intrinsics.checkNotNullParameter(netPNL, "netPNL");
        Intrinsics.checkNotNullParameter(realizedProfitGained, "realizedProfitGained");
        Intrinsics.checkNotNullParameter(unrealizedPNL, "unrealizedPNL");
        Intrinsics.checkNotNullParameter(profitPercentage, "profitPercentage");
        Intrinsics.checkNotNullParameter(unrealizedProfitPercentage, "unrealizedProfitPercentage");
        Intrinsics.checkNotNullParameter(marketSentiment, "marketSentiment");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(followers, "followers");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(stockType, "stockType");
        Intrinsics.checkNotNullParameter(lotsBought, "lotsBought");
        Intrinsics.checkNotNullParameter(lotsSold, "lotsSold");
        Intrinsics.checkNotNullParameter(buyAveragePrice, "buyAveragePrice");
        Intrinsics.checkNotNullParameter(sellAveragePrice, "sellAveragePrice");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(noOfLots, "noOfLots");
        Intrinsics.checkNotNullParameter(lotSize, "lotSize");
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.totalQuantity = totalQuantity;
        this.averagePriceSide1 = averagePriceSide1;
        this.averagePriceSide2 = averagePriceSide2;
        this.currentMarketPrice = currentMarketPrice;
        this.marketValue = marketValue;
        this.purchaseValue = purchaseValue;
        this.netPNL = netPNL;
        this.realizedProfitGained = realizedProfitGained;
        this.unrealizedPNL = unrealizedPNL;
        this.profitPercentage = profitPercentage;
        this.unrealizedProfitPercentage = unrealizedProfitPercentage;
        this.isLong = z10;
        this.isShort = z11;
        this.isPNLPositive = z12;
        this.marketSentiment = marketSentiment;
        this.sector = sector;
        this.followers = followers;
        this.imageUrl = imageUrl;
        this.stockType = stockType;
        this.lotsBought = lotsBought;
        this.lotsSold = lotsSold;
        this.buyAveragePrice = buyAveragePrice;
        this.sellAveragePrice = sellAveragePrice;
        this.contractName = contractName;
        this.noOfLots = noOfLots;
        this.lotSize = lotSize;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getNetPNL() {
        return this.netPNL;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getRealizedProfitGained() {
        return this.realizedProfitGained;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getUnrealizedPNL() {
        return this.unrealizedPNL;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getProfitPercentage() {
        return this.profitPercentage;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getUnrealizedProfitPercentage() {
        return this.unrealizedProfitPercentage;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsLong() {
        return this.isLong;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsShort() {
        return this.isShort;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsPNLPositive() {
        return this.isPNLPositive;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final String getMarketSentiment() {
        return this.marketSentiment;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final List<Followers> component20() {
        return this.followers;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final String getStockType() {
        return this.stockType;
    }

    @NotNull
    /* renamed from: component23, reason: from getter */
    public final String getLotsBought() {
        return this.lotsBought;
    }

    @NotNull
    /* renamed from: component24, reason: from getter */
    public final String getLotsSold() {
        return this.lotsSold;
    }

    @NotNull
    /* renamed from: component25, reason: from getter */
    public final String getBuyAveragePrice() {
        return this.buyAveragePrice;
    }

    @NotNull
    /* renamed from: component26, reason: from getter */
    public final String getSellAveragePrice() {
        return this.sellAveragePrice;
    }

    @NotNull
    /* renamed from: component27, reason: from getter */
    public final String getContractName() {
        return this.contractName;
    }

    @NotNull
    /* renamed from: component28, reason: from getter */
    public final String getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    /* renamed from: component29, reason: from getter */
    public final String getLotSize() {
        return this.lotSize;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAveragePriceSide1() {
        return this.averagePriceSide1;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAveragePriceSide2() {
        return this.averagePriceSide2;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getCurrentMarketPrice() {
        return this.currentMarketPrice;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getMarketValue() {
        return this.marketValue;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getPurchaseValue() {
        return this.purchaseValue;
    }

    @NotNull
    public final UnifiedStockTransaction copy(@NotNull String name, @NotNull String code, @NotNull String quantity, @NotNull String totalQuantity, @NotNull String averagePriceSide1, @NotNull String averagePriceSide2, @NotNull String currentMarketPrice, @NotNull String marketValue, @NotNull String purchaseValue, @NotNull String netPNL, @NotNull String realizedProfitGained, @NotNull String unrealizedPNL, @NotNull String profitPercentage, @NotNull String unrealizedProfitPercentage, boolean isLong, boolean isShort, boolean isPNLPositive, @NotNull String marketSentiment, @NotNull String sector, @NotNull List<Followers> followers, @NotNull String imageUrl, @NotNull String stockType, @NotNull String lotsBought, @NotNull String lotsSold, @NotNull String buyAveragePrice, @NotNull String sellAveragePrice, @NotNull String contractName, @NotNull String noOfLots, @NotNull String lotSize) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(totalQuantity, "totalQuantity");
        Intrinsics.checkNotNullParameter(averagePriceSide1, "averagePriceSide1");
        Intrinsics.checkNotNullParameter(averagePriceSide2, "averagePriceSide2");
        Intrinsics.checkNotNullParameter(currentMarketPrice, "currentMarketPrice");
        Intrinsics.checkNotNullParameter(marketValue, "marketValue");
        Intrinsics.checkNotNullParameter(purchaseValue, "purchaseValue");
        Intrinsics.checkNotNullParameter(netPNL, "netPNL");
        Intrinsics.checkNotNullParameter(realizedProfitGained, "realizedProfitGained");
        Intrinsics.checkNotNullParameter(unrealizedPNL, "unrealizedPNL");
        Intrinsics.checkNotNullParameter(profitPercentage, "profitPercentage");
        Intrinsics.checkNotNullParameter(unrealizedProfitPercentage, "unrealizedProfitPercentage");
        Intrinsics.checkNotNullParameter(marketSentiment, "marketSentiment");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(followers, "followers");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(stockType, "stockType");
        Intrinsics.checkNotNullParameter(lotsBought, "lotsBought");
        Intrinsics.checkNotNullParameter(lotsSold, "lotsSold");
        Intrinsics.checkNotNullParameter(buyAveragePrice, "buyAveragePrice");
        Intrinsics.checkNotNullParameter(sellAveragePrice, "sellAveragePrice");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        Intrinsics.checkNotNullParameter(noOfLots, "noOfLots");
        Intrinsics.checkNotNullParameter(lotSize, "lotSize");
        return new UnifiedStockTransaction(name, code, quantity, totalQuantity, averagePriceSide1, averagePriceSide2, currentMarketPrice, marketValue, purchaseValue, netPNL, realizedProfitGained, unrealizedPNL, profitPercentage, unrealizedProfitPercentage, isLong, isShort, isPNLPositive, marketSentiment, sector, followers, imageUrl, stockType, lotsBought, lotsSold, buyAveragePrice, sellAveragePrice, contractName, noOfLots, lotSize);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedStockTransaction)) {
            return false;
        }
        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) other;
        return Intrinsics.a(this.name, unifiedStockTransaction.name) && Intrinsics.a(this.code, unifiedStockTransaction.code) && Intrinsics.a(this.quantity, unifiedStockTransaction.quantity) && Intrinsics.a(this.totalQuantity, unifiedStockTransaction.totalQuantity) && Intrinsics.a(this.averagePriceSide1, unifiedStockTransaction.averagePriceSide1) && Intrinsics.a(this.averagePriceSide2, unifiedStockTransaction.averagePriceSide2) && Intrinsics.a(this.currentMarketPrice, unifiedStockTransaction.currentMarketPrice) && Intrinsics.a(this.marketValue, unifiedStockTransaction.marketValue) && Intrinsics.a(this.purchaseValue, unifiedStockTransaction.purchaseValue) && Intrinsics.a(this.netPNL, unifiedStockTransaction.netPNL) && Intrinsics.a(this.realizedProfitGained, unifiedStockTransaction.realizedProfitGained) && Intrinsics.a(this.unrealizedPNL, unifiedStockTransaction.unrealizedPNL) && Intrinsics.a(this.profitPercentage, unifiedStockTransaction.profitPercentage) && Intrinsics.a(this.unrealizedProfitPercentage, unifiedStockTransaction.unrealizedProfitPercentage) && this.isLong == unifiedStockTransaction.isLong && this.isShort == unifiedStockTransaction.isShort && this.isPNLPositive == unifiedStockTransaction.isPNLPositive && Intrinsics.a(this.marketSentiment, unifiedStockTransaction.marketSentiment) && Intrinsics.a(this.sector, unifiedStockTransaction.sector) && Intrinsics.a(this.followers, unifiedStockTransaction.followers) && Intrinsics.a(this.imageUrl, unifiedStockTransaction.imageUrl) && Intrinsics.a(this.stockType, unifiedStockTransaction.stockType) && Intrinsics.a(this.lotsBought, unifiedStockTransaction.lotsBought) && Intrinsics.a(this.lotsSold, unifiedStockTransaction.lotsSold) && Intrinsics.a(this.buyAveragePrice, unifiedStockTransaction.buyAveragePrice) && Intrinsics.a(this.sellAveragePrice, unifiedStockTransaction.sellAveragePrice) && Intrinsics.a(this.contractName, unifiedStockTransaction.contractName) && Intrinsics.a(this.noOfLots, unifiedStockTransaction.noOfLots) && Intrinsics.a(this.lotSize, unifiedStockTransaction.lotSize);
    }

    @NotNull
    public final String getAveragePriceSide1() {
        return this.averagePriceSide1;
    }

    @NotNull
    public final String getAveragePriceSide2() {
        return this.averagePriceSide2;
    }

    @NotNull
    public final String getBuyAveragePrice() {
        return this.buyAveragePrice;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getContractName() {
        return this.contractName;
    }

    @NotNull
    public final String getCurrentMarketPrice() {
        return this.currentMarketPrice;
    }

    @NotNull
    public final List<Followers> getFollowers() {
        return this.followers;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getLotSize() {
        return this.lotSize;
    }

    @NotNull
    public final String getLotsBought() {
        return this.lotsBought;
    }

    @NotNull
    public final String getLotsSold() {
        return this.lotsSold;
    }

    @NotNull
    public final String getMarketSentiment() {
        return this.marketSentiment;
    }

    @NotNull
    public final String getMarketValue() {
        return this.marketValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNetPNL() {
        return this.netPNL;
    }

    @NotNull
    public final String getNoOfLots() {
        return this.noOfLots;
    }

    @NotNull
    public final String getProfitPercentage() {
        return this.profitPercentage;
    }

    @NotNull
    public final String getPurchaseValue() {
        return this.purchaseValue;
    }

    @NotNull
    public final String getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getRealizedProfitGained() {
        return this.realizedProfitGained;
    }

    @NotNull
    public final String getSector() {
        return this.sector;
    }

    @NotNull
    public final String getSellAveragePrice() {
        return this.sellAveragePrice;
    }

    @NotNull
    public final String getStockType() {
        return this.stockType;
    }

    @NotNull
    public final String getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    public final String getUnrealizedPNL() {
        return this.unrealizedPNL;
    }

    @NotNull
    public final String getUnrealizedProfitPercentage() {
        return this.unrealizedProfitPercentage;
    }

    public int hashCode() {
        return this.lotSize.hashCode() + h.g(this.noOfLots, h.g(this.contractName, h.g(this.sellAveragePrice, h.g(this.buyAveragePrice, h.g(this.lotsSold, h.g(this.lotsBought, h.g(this.stockType, h.g(this.imageUrl, d.e(this.followers, h.g(this.sector, h.g(this.marketSentiment, e.d(this.isPNLPositive, e.d(this.isShort, e.d(this.isLong, h.g(this.unrealizedProfitPercentage, h.g(this.profitPercentage, h.g(this.unrealizedPNL, h.g(this.realizedProfitGained, h.g(this.netPNL, h.g(this.purchaseValue, h.g(this.marketValue, h.g(this.currentMarketPrice, h.g(this.averagePriceSide2, h.g(this.averagePriceSide1, h.g(this.totalQuantity, h.g(this.quantity, h.g(this.code, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isLong() {
        return this.isLong;
    }

    public final boolean isPNLPositive() {
        return this.isPNLPositive;
    }

    public final boolean isShort() {
        return this.isShort;
    }

    public final void setFollowers(@NotNull List<Followers> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.followers = list;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.code;
        String str3 = this.quantity;
        String str4 = this.totalQuantity;
        String str5 = this.averagePriceSide1;
        String str6 = this.averagePriceSide2;
        String str7 = this.currentMarketPrice;
        String str8 = this.marketValue;
        String str9 = this.purchaseValue;
        String str10 = this.netPNL;
        String str11 = this.realizedProfitGained;
        String str12 = this.unrealizedPNL;
        String str13 = this.profitPercentage;
        String str14 = this.unrealizedProfitPercentage;
        boolean z10 = this.isLong;
        boolean z11 = this.isShort;
        boolean z12 = this.isPNLPositive;
        String str15 = this.marketSentiment;
        String str16 = this.sector;
        List<Followers> list = this.followers;
        String str17 = this.imageUrl;
        String str18 = this.stockType;
        String str19 = this.lotsBought;
        String str20 = this.lotsSold;
        String str21 = this.buyAveragePrice;
        String str22 = this.sellAveragePrice;
        String str23 = this.contractName;
        String str24 = this.noOfLots;
        String str25 = this.lotSize;
        StringBuilder l10 = e.l("UnifiedStockTransaction(name=", str, ", code=", str2, ", quantity=");
        e.v(l10, str3, ", totalQuantity=", str4, ", averagePriceSide1=");
        e.v(l10, str5, ", averagePriceSide2=", str6, ", currentMarketPrice=");
        e.v(l10, str7, ", marketValue=", str8, ", purchaseValue=");
        e.v(l10, str9, ", netPNL=", str10, ", realizedProfitGained=");
        e.v(l10, str11, ", unrealizedPNL=", str12, ", profitPercentage=");
        e.v(l10, str13, ", unrealizedProfitPercentage=", str14, ", isLong=");
        l10.append(z10);
        l10.append(", isShort=");
        l10.append(z11);
        l10.append(", isPNLPositive=");
        l10.append(z12);
        l10.append(", marketSentiment=");
        l10.append(str15);
        l10.append(", sector=");
        l10.append(str16);
        l10.append(", followers=");
        l10.append(list);
        l10.append(", imageUrl=");
        e.v(l10, str17, ", stockType=", str18, ", lotsBought=");
        e.v(l10, str19, ", lotsSold=", str20, ", buyAveragePrice=");
        e.v(l10, str21, ", sellAveragePrice=", str22, ", contractName=");
        e.v(l10, str23, ", noOfLots=", str24, ", lotSize=");
        return d.o(l10, str25, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeString(this.quantity);
        parcel.writeString(this.totalQuantity);
        parcel.writeString(this.averagePriceSide1);
        parcel.writeString(this.averagePriceSide2);
        parcel.writeString(this.currentMarketPrice);
        parcel.writeString(this.marketValue);
        parcel.writeString(this.purchaseValue);
        parcel.writeString(this.netPNL);
        parcel.writeString(this.realizedProfitGained);
        parcel.writeString(this.unrealizedPNL);
        parcel.writeString(this.profitPercentage);
        parcel.writeString(this.unrealizedProfitPercentage);
        parcel.writeInt(this.isLong ? 1 : 0);
        parcel.writeInt(this.isShort ? 1 : 0);
        parcel.writeInt(this.isPNLPositive ? 1 : 0);
        parcel.writeString(this.marketSentiment);
        parcel.writeString(this.sector);
        Iterator p10 = a.p(this.followers, parcel);
        while (p10.hasNext()) {
            ((Followers) p10.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.stockType);
        parcel.writeString(this.lotsBought);
        parcel.writeString(this.lotsSold);
        parcel.writeString(this.buyAveragePrice);
        parcel.writeString(this.sellAveragePrice);
        parcel.writeString(this.contractName);
        parcel.writeString(this.noOfLots);
        parcel.writeString(this.lotSize);
    }
}
