package com.assetgro.stockgro.data.remote.response;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.FTWeekTopStocksDto;
import com.assetgro.stockgro.data.model.FriendHoldingDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.StockNewsDto;
import com.assetgro.stockgro.data.model.TopPortfolioDto;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\r\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u0019\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rHÆ\u0003J\u0019\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\rHÆ\u0003J\u0019\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\rHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0014HÆ\u0003JÅ\u0001\u00100\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\r2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000202HÖ\u0001J\t\u00108\u001a\u00020\u0012HÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000202HÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR&\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R&\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 ¨\u0006>"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/HomePageTopDataResponse;", "Landroid/os/Parcelable;", "trendingStocks", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockDto;", "weeklyTopPortfolios", "Lcom/assetgro/stockgro/data/model/TopPortfolioDto;", "todayTopPortfolios", "ftWeekHighLow", "Lcom/assetgro/stockgro/data/model/FTWeekTopStocksDto;", "stockNews", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/model/StockNewsDto;", "Lkotlin/collections/ArrayList;", "topGainers", "topLosers", "stockGyans", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "friendsHoldings", "Lcom/assetgro/stockgro/data/model/FriendHoldingDto;", "volumeShockers", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/assetgro/stockgro/data/model/FTWeekTopStocksDto;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;Lcom/assetgro/stockgro/data/model/FriendHoldingDto;Ljava/util/List;)V", "getFriendsHoldings", "()Lcom/assetgro/stockgro/data/model/FriendHoldingDto;", "getFtWeekHighLow", "()Lcom/assetgro/stockgro/data/model/FTWeekTopStocksDto;", "getStockGyans", "()Ljava/util/Map;", "getStockNews", "()Ljava/util/ArrayList;", "getTodayTopPortfolios", "()Ljava/util/List;", "getTopGainers", "getTopLosers", "getTrendingStocks", "getVolumeShockers", "getWeeklyTopPortfolios", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomePageTopDataResponse implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HomePageTopDataResponse> CREATOR = new Creator();

    @SerializedName("friends_holdings")
    @NotNull
    private final FriendHoldingDto friendsHoldings;

    @SerializedName("ft_week_high_low")
    @NotNull
    private final FTWeekTopStocksDto ftWeekHighLow;

    @SerializedName("stocks_gyans")
    private final Map<String, String> stockGyans;

    @SerializedName("stock_news")
    @NotNull
    private final ArrayList<StockNewsDto> stockNews;

    @SerializedName("today_top_portfolios")
    @NotNull
    private final List<TopPortfolioDto> todayTopPortfolios;

    @SerializedName("top_gainers")
    @NotNull
    private final ArrayList<StockDto> topGainers;

    @SerializedName("top_losers")
    @NotNull
    private final ArrayList<StockDto> topLosers;

    @SerializedName("trending_stocks")
    @NotNull
    private final List<StockDto> trendingStocks;

    @SerializedName("volume_shockers")
    private final List<StockDto> volumeShockers;

    @SerializedName("weekly_top_portfolios")
    @NotNull
    private final List<TopPortfolioDto> weeklyTopPortfolios;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<HomePageTopDataResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HomePageTopDataResponse createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i10 = 0;
            int i11 = 0;
            while (i11 != readInt) {
                i11 = h.e(StockDto.CREATOR, parcel, arrayList2, i11, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i12 = 0;
            while (i12 != readInt2) {
                i12 = h.e(TopPortfolioDto.CREATOR, parcel, arrayList3, i12, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt3);
            int i13 = 0;
            while (i13 != readInt3) {
                i13 = h.e(TopPortfolioDto.CREATOR, parcel, arrayList4, i13, 1);
            }
            FTWeekTopStocksDto createFromParcel = FTWeekTopStocksDto.CREATOR.createFromParcel(parcel);
            int readInt4 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt4);
            int i14 = 0;
            while (i14 != readInt4) {
                i14 = h.e(StockNewsDto.CREATOR, parcel, arrayList5, i14, 1);
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt5);
            int i15 = 0;
            while (i15 != readInt5) {
                i15 = h.e(StockDto.CREATOR, parcel, arrayList6, i15, 1);
            }
            int readInt6 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt6);
            int i16 = 0;
            while (i16 != readInt6) {
                i16 = h.e(StockDto.CREATOR, parcel, arrayList7, i16, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt7 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt7);
                for (int i17 = 0; i17 != readInt7; i17++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            FriendHoldingDto createFromParcel2 = FriendHoldingDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList = new ArrayList(readInt8);
                while (i10 != readInt8) {
                    i10 = h.e(StockDto.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            return new HomePageTopDataResponse(arrayList2, arrayList3, arrayList4, createFromParcel, arrayList5, arrayList6, arrayList7, linkedHashMap, createFromParcel2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HomePageTopDataResponse[] newArray(int i10) {
            return new HomePageTopDataResponse[i10];
        }
    }

    public HomePageTopDataResponse(@NotNull List<StockDto> trendingStocks, @NotNull List<TopPortfolioDto> weeklyTopPortfolios, @NotNull List<TopPortfolioDto> todayTopPortfolios, @NotNull FTWeekTopStocksDto ftWeekHighLow, @NotNull ArrayList<StockNewsDto> stockNews, @NotNull ArrayList<StockDto> topGainers, @NotNull ArrayList<StockDto> topLosers, Map<String, String> map, @NotNull FriendHoldingDto friendsHoldings, List<StockDto> list) {
        Intrinsics.checkNotNullParameter(trendingStocks, "trendingStocks");
        Intrinsics.checkNotNullParameter(weeklyTopPortfolios, "weeklyTopPortfolios");
        Intrinsics.checkNotNullParameter(todayTopPortfolios, "todayTopPortfolios");
        Intrinsics.checkNotNullParameter(ftWeekHighLow, "ftWeekHighLow");
        Intrinsics.checkNotNullParameter(stockNews, "stockNews");
        Intrinsics.checkNotNullParameter(topGainers, "topGainers");
        Intrinsics.checkNotNullParameter(topLosers, "topLosers");
        Intrinsics.checkNotNullParameter(friendsHoldings, "friendsHoldings");
        this.trendingStocks = trendingStocks;
        this.weeklyTopPortfolios = weeklyTopPortfolios;
        this.todayTopPortfolios = todayTopPortfolios;
        this.ftWeekHighLow = ftWeekHighLow;
        this.stockNews = stockNews;
        this.topGainers = topGainers;
        this.topLosers = topLosers;
        this.stockGyans = map;
        this.friendsHoldings = friendsHoldings;
        this.volumeShockers = list;
    }

    @NotNull
    public final List<StockDto> component1() {
        return this.trendingStocks;
    }

    public final List<StockDto> component10() {
        return this.volumeShockers;
    }

    @NotNull
    public final List<TopPortfolioDto> component2() {
        return this.weeklyTopPortfolios;
    }

    @NotNull
    public final List<TopPortfolioDto> component3() {
        return this.todayTopPortfolios;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FTWeekTopStocksDto getFtWeekHighLow() {
        return this.ftWeekHighLow;
    }

    @NotNull
    public final ArrayList<StockNewsDto> component5() {
        return this.stockNews;
    }

    @NotNull
    public final ArrayList<StockDto> component6() {
        return this.topGainers;
    }

    @NotNull
    public final ArrayList<StockDto> component7() {
        return this.topLosers;
    }

    public final Map<String, String> component8() {
        return this.stockGyans;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final FriendHoldingDto getFriendsHoldings() {
        return this.friendsHoldings;
    }

    @NotNull
    public final HomePageTopDataResponse copy(@NotNull List<StockDto> trendingStocks, @NotNull List<TopPortfolioDto> weeklyTopPortfolios, @NotNull List<TopPortfolioDto> todayTopPortfolios, @NotNull FTWeekTopStocksDto ftWeekHighLow, @NotNull ArrayList<StockNewsDto> stockNews, @NotNull ArrayList<StockDto> topGainers, @NotNull ArrayList<StockDto> topLosers, Map<String, String> stockGyans, @NotNull FriendHoldingDto friendsHoldings, List<StockDto> volumeShockers) {
        Intrinsics.checkNotNullParameter(trendingStocks, "trendingStocks");
        Intrinsics.checkNotNullParameter(weeklyTopPortfolios, "weeklyTopPortfolios");
        Intrinsics.checkNotNullParameter(todayTopPortfolios, "todayTopPortfolios");
        Intrinsics.checkNotNullParameter(ftWeekHighLow, "ftWeekHighLow");
        Intrinsics.checkNotNullParameter(stockNews, "stockNews");
        Intrinsics.checkNotNullParameter(topGainers, "topGainers");
        Intrinsics.checkNotNullParameter(topLosers, "topLosers");
        Intrinsics.checkNotNullParameter(friendsHoldings, "friendsHoldings");
        return new HomePageTopDataResponse(trendingStocks, weeklyTopPortfolios, todayTopPortfolios, ftWeekHighLow, stockNews, topGainers, topLosers, stockGyans, friendsHoldings, volumeShockers);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePageTopDataResponse)) {
            return false;
        }
        HomePageTopDataResponse homePageTopDataResponse = (HomePageTopDataResponse) other;
        return Intrinsics.a(this.trendingStocks, homePageTopDataResponse.trendingStocks) && Intrinsics.a(this.weeklyTopPortfolios, homePageTopDataResponse.weeklyTopPortfolios) && Intrinsics.a(this.todayTopPortfolios, homePageTopDataResponse.todayTopPortfolios) && Intrinsics.a(this.ftWeekHighLow, homePageTopDataResponse.ftWeekHighLow) && Intrinsics.a(this.stockNews, homePageTopDataResponse.stockNews) && Intrinsics.a(this.topGainers, homePageTopDataResponse.topGainers) && Intrinsics.a(this.topLosers, homePageTopDataResponse.topLosers) && Intrinsics.a(this.stockGyans, homePageTopDataResponse.stockGyans) && Intrinsics.a(this.friendsHoldings, homePageTopDataResponse.friendsHoldings) && Intrinsics.a(this.volumeShockers, homePageTopDataResponse.volumeShockers);
    }

    @NotNull
    public final FriendHoldingDto getFriendsHoldings() {
        return this.friendsHoldings;
    }

    @NotNull
    public final FTWeekTopStocksDto getFtWeekHighLow() {
        return this.ftWeekHighLow;
    }

    public final Map<String, String> getStockGyans() {
        return this.stockGyans;
    }

    @NotNull
    public final ArrayList<StockNewsDto> getStockNews() {
        return this.stockNews;
    }

    @NotNull
    public final List<TopPortfolioDto> getTodayTopPortfolios() {
        return this.todayTopPortfolios;
    }

    @NotNull
    public final ArrayList<StockDto> getTopGainers() {
        return this.topGainers;
    }

    @NotNull
    public final ArrayList<StockDto> getTopLosers() {
        return this.topLosers;
    }

    @NotNull
    public final List<StockDto> getTrendingStocks() {
        return this.trendingStocks;
    }

    public final List<StockDto> getVolumeShockers() {
        return this.volumeShockers;
    }

    @NotNull
    public final List<TopPortfolioDto> getWeeklyTopPortfolios() {
        return this.weeklyTopPortfolios;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.topLosers.hashCode() + ((this.topGainers.hashCode() + ((this.stockNews.hashCode() + ((this.ftWeekHighLow.hashCode() + d.e(this.todayTopPortfolios, d.e(this.weeklyTopPortfolios, this.trendingStocks.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31)) * 31;
        Map<String, String> map = this.stockGyans;
        int i10 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int hashCode3 = (this.friendsHoldings.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        List<StockDto> list = this.volumeShockers;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    @NotNull
    public String toString() {
        return "HomePageTopDataResponse(trendingStocks=" + this.trendingStocks + ", weeklyTopPortfolios=" + this.weeklyTopPortfolios + ", todayTopPortfolios=" + this.todayTopPortfolios + ", ftWeekHighLow=" + this.ftWeekHighLow + ", stockNews=" + this.stockNews + ", topGainers=" + this.topGainers + ", topLosers=" + this.topLosers + ", stockGyans=" + this.stockGyans + ", friendsHoldings=" + this.friendsHoldings + ", volumeShockers=" + this.volumeShockers + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator p10 = a.p(this.trendingStocks, parcel);
        while (p10.hasNext()) {
            ((StockDto) p10.next()).writeToParcel(parcel, flags);
        }
        Iterator p11 = a.p(this.weeklyTopPortfolios, parcel);
        while (p11.hasNext()) {
            ((TopPortfolioDto) p11.next()).writeToParcel(parcel, flags);
        }
        Iterator p12 = a.p(this.todayTopPortfolios, parcel);
        while (p12.hasNext()) {
            ((TopPortfolioDto) p12.next()).writeToParcel(parcel, flags);
        }
        this.ftWeekHighLow.writeToParcel(parcel, flags);
        ArrayList<StockNewsDto> arrayList = this.stockNews;
        parcel.writeInt(arrayList.size());
        Iterator<StockNewsDto> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        ArrayList<StockDto> arrayList2 = this.topGainers;
        parcel.writeInt(arrayList2.size());
        Iterator<StockDto> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
        ArrayList<StockDto> arrayList3 = this.topLosers;
        parcel.writeInt(arrayList3.size());
        Iterator<StockDto> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, flags);
        }
        Map<String, String> map = this.stockGyans;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        this.friendsHoldings.writeToParcel(parcel, flags);
        List<StockDto> list = this.volumeShockers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((StockDto) o10.next()).writeToParcel(parcel, flags);
        }
    }
}
