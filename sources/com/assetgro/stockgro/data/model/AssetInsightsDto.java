package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003Ji\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006'"}, d2 = {"Lcom/assetgro/stockgro/data/model/AssetInsightsDto;", "Landroid/os/Parcelable;", "gainers", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockDto;", "losers", "trending", "volumeShockers", "weeklyTopPortfolios", "dailyTopPortfolios", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDailyTopPortfolios", "()Ljava/util/List;", "getGainers", "getLosers", "getTrending", "getVolumeShockers", "getWeeklyTopPortfolios", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AssetInsightsDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AssetInsightsDto> CREATOR = new Creator();

    @SerializedName("daily_top_portfolios")
    @NotNull
    private final List<StockDto> dailyTopPortfolios;

    @SerializedName("top_gainers")
    @NotNull
    private final List<StockDto> gainers;

    @SerializedName("top_losers")
    @NotNull
    private final List<StockDto> losers;

    @SerializedName("trending_stocks")
    @NotNull
    private final List<StockDto> trending;

    @SerializedName("volume_shockers")
    @NotNull
    private final List<StockDto> volumeShockers;

    @SerializedName("weekly_top_portfolios")
    @NotNull
    private final List<StockDto> weeklyTopPortfolios;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<AssetInsightsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AssetInsightsDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            int i11 = 0;
            while (i11 != readInt) {
                i11 = h.e(StockDto.CREATOR, parcel, arrayList, i11, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i12 = 0;
            while (i12 != readInt2) {
                i12 = h.e(StockDto.CREATOR, parcel, arrayList2, i12, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i13 = 0;
            while (i13 != readInt3) {
                i13 = h.e(StockDto.CREATOR, parcel, arrayList3, i13, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            int i14 = 0;
            while (i14 != readInt4) {
                i14 = h.e(StockDto.CREATOR, parcel, arrayList4, i14, 1);
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt5);
            int i15 = 0;
            while (i15 != readInt5) {
                i15 = h.e(StockDto.CREATOR, parcel, arrayList5, i15, 1);
            }
            int readInt6 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt6);
            while (i10 != readInt6) {
                i10 = h.e(StockDto.CREATOR, parcel, arrayList6, i10, 1);
            }
            return new AssetInsightsDto(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AssetInsightsDto[] newArray(int i10) {
            return new AssetInsightsDto[i10];
        }
    }

    public AssetInsightsDto(@NotNull List<StockDto> gainers, @NotNull List<StockDto> losers, @NotNull List<StockDto> trending, @NotNull List<StockDto> volumeShockers, @NotNull List<StockDto> weeklyTopPortfolios, @NotNull List<StockDto> dailyTopPortfolios) {
        Intrinsics.checkNotNullParameter(gainers, "gainers");
        Intrinsics.checkNotNullParameter(losers, "losers");
        Intrinsics.checkNotNullParameter(trending, "trending");
        Intrinsics.checkNotNullParameter(volumeShockers, "volumeShockers");
        Intrinsics.checkNotNullParameter(weeklyTopPortfolios, "weeklyTopPortfolios");
        Intrinsics.checkNotNullParameter(dailyTopPortfolios, "dailyTopPortfolios");
        this.gainers = gainers;
        this.losers = losers;
        this.trending = trending;
        this.volumeShockers = volumeShockers;
        this.weeklyTopPortfolios = weeklyTopPortfolios;
        this.dailyTopPortfolios = dailyTopPortfolios;
    }

    public static /* synthetic */ AssetInsightsDto copy$default(AssetInsightsDto assetInsightsDto, List list, List list2, List list3, List list4, List list5, List list6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = assetInsightsDto.gainers;
        }
        if ((i10 & 2) != 0) {
            list2 = assetInsightsDto.losers;
        }
        List list7 = list2;
        if ((i10 & 4) != 0) {
            list3 = assetInsightsDto.trending;
        }
        List list8 = list3;
        if ((i10 & 8) != 0) {
            list4 = assetInsightsDto.volumeShockers;
        }
        List list9 = list4;
        if ((i10 & 16) != 0) {
            list5 = assetInsightsDto.weeklyTopPortfolios;
        }
        List list10 = list5;
        if ((i10 & 32) != 0) {
            list6 = assetInsightsDto.dailyTopPortfolios;
        }
        return assetInsightsDto.copy(list, list7, list8, list9, list10, list6);
    }

    @NotNull
    public final List<StockDto> component1() {
        return this.gainers;
    }

    @NotNull
    public final List<StockDto> component2() {
        return this.losers;
    }

    @NotNull
    public final List<StockDto> component3() {
        return this.trending;
    }

    @NotNull
    public final List<StockDto> component4() {
        return this.volumeShockers;
    }

    @NotNull
    public final List<StockDto> component5() {
        return this.weeklyTopPortfolios;
    }

    @NotNull
    public final List<StockDto> component6() {
        return this.dailyTopPortfolios;
    }

    @NotNull
    public final AssetInsightsDto copy(@NotNull List<StockDto> gainers, @NotNull List<StockDto> losers, @NotNull List<StockDto> trending, @NotNull List<StockDto> volumeShockers, @NotNull List<StockDto> weeklyTopPortfolios, @NotNull List<StockDto> dailyTopPortfolios) {
        Intrinsics.checkNotNullParameter(gainers, "gainers");
        Intrinsics.checkNotNullParameter(losers, "losers");
        Intrinsics.checkNotNullParameter(trending, "trending");
        Intrinsics.checkNotNullParameter(volumeShockers, "volumeShockers");
        Intrinsics.checkNotNullParameter(weeklyTopPortfolios, "weeklyTopPortfolios");
        Intrinsics.checkNotNullParameter(dailyTopPortfolios, "dailyTopPortfolios");
        return new AssetInsightsDto(gainers, losers, trending, volumeShockers, weeklyTopPortfolios, dailyTopPortfolios);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetInsightsDto)) {
            return false;
        }
        AssetInsightsDto assetInsightsDto = (AssetInsightsDto) other;
        return Intrinsics.a(this.gainers, assetInsightsDto.gainers) && Intrinsics.a(this.losers, assetInsightsDto.losers) && Intrinsics.a(this.trending, assetInsightsDto.trending) && Intrinsics.a(this.volumeShockers, assetInsightsDto.volumeShockers) && Intrinsics.a(this.weeklyTopPortfolios, assetInsightsDto.weeklyTopPortfolios) && Intrinsics.a(this.dailyTopPortfolios, assetInsightsDto.dailyTopPortfolios);
    }

    @NotNull
    public final List<StockDto> getDailyTopPortfolios() {
        return this.dailyTopPortfolios;
    }

    @NotNull
    public final List<StockDto> getGainers() {
        return this.gainers;
    }

    @NotNull
    public final List<StockDto> getLosers() {
        return this.losers;
    }

    @NotNull
    public final List<StockDto> getTrending() {
        return this.trending;
    }

    @NotNull
    public final List<StockDto> getVolumeShockers() {
        return this.volumeShockers;
    }

    @NotNull
    public final List<StockDto> getWeeklyTopPortfolios() {
        return this.weeklyTopPortfolios;
    }

    public int hashCode() {
        return this.dailyTopPortfolios.hashCode() + d.e(this.weeklyTopPortfolios, d.e(this.volumeShockers, d.e(this.trending, d.e(this.losers, this.gainers.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "AssetInsightsDto(gainers=" + this.gainers + ", losers=" + this.losers + ", trending=" + this.trending + ", volumeShockers=" + this.volumeShockers + ", weeklyTopPortfolios=" + this.weeklyTopPortfolios + ", dailyTopPortfolios=" + this.dailyTopPortfolios + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator p10 = a.p(this.gainers, parcel);
        while (p10.hasNext()) {
            ((StockDto) p10.next()).writeToParcel(parcel, flags);
        }
        Iterator p11 = a.p(this.losers, parcel);
        while (p11.hasNext()) {
            ((StockDto) p11.next()).writeToParcel(parcel, flags);
        }
        Iterator p12 = a.p(this.trending, parcel);
        while (p12.hasNext()) {
            ((StockDto) p12.next()).writeToParcel(parcel, flags);
        }
        Iterator p13 = a.p(this.volumeShockers, parcel);
        while (p13.hasNext()) {
            ((StockDto) p13.next()).writeToParcel(parcel, flags);
        }
        Iterator p14 = a.p(this.weeklyTopPortfolios, parcel);
        while (p14.hasNext()) {
            ((StockDto) p14.next()).writeToParcel(parcel, flags);
        }
        Iterator p15 = a.p(this.dailyTopPortfolios, parcel);
        while (p15.hasNext()) {
            ((StockDto) p15.next()).writeToParcel(parcel, flags);
        }
    }
}
