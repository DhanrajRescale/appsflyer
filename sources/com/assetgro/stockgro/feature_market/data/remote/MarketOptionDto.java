package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.MarketOption;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.i0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JU\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020)HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/MarketOptionDto;", "Landroid/os/Parcelable;", "indices", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "stocks", "stocksCount", HttpUrl.FRAGMENT_ENCODE_SET, "eor", HttpUrl.FRAGMENT_ENCODE_SET, "add", "Lcom/assetgro/stockgro/feature_market/data/remote/AddComponentDto;", "banner", "Lcom/assetgro/stockgro/feature_market/data/remote/BannerComponentDto;", "(Ljava/util/List;Ljava/util/List;IZLcom/assetgro/stockgro/feature_market/data/remote/AddComponentDto;Lcom/assetgro/stockgro/feature_market/data/remote/BannerComponentDto;)V", "getAdd", "()Lcom/assetgro/stockgro/feature_market/data/remote/AddComponentDto;", "getBanner", "()Lcom/assetgro/stockgro/feature_market/data/remote/BannerComponentDto;", "getEor", "()Z", "getIndices", "()Ljava/util/List;", "getStocks", "getStocksCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toMarketOption", "Lcom/assetgro/stockgro/feature_market/domain/model/MarketOption;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketOptionDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MarketOptionDto> CREATOR = new Creator();

    @SerializedName("add")
    @NotNull
    private final AddComponentDto add;

    @SerializedName("banner")
    @NotNull
    private final BannerComponentDto banner;

    @SerializedName("end_of_response")
    private final boolean eor;

    @SerializedName("indices")
    private final List<FnoOptionDto> indices;

    @SerializedName("stocks")
    private final List<FnoOptionDto> stocks;

    @SerializedName("stocks_count")
    private final int stocksCount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MarketOptionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketOptionDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(FnoOptionDto.CREATOR, parcel, arrayList3, i10, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    i11 = h.e(FnoOptionDto.CREATOR, parcel, arrayList2, i11, 1);
                }
            }
            return new MarketOptionDto(arrayList, arrayList2, parcel.readInt(), parcel.readInt() != 0, AddComponentDto.CREATOR.createFromParcel(parcel), BannerComponentDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MarketOptionDto[] newArray(int i10) {
            return new MarketOptionDto[i10];
        }
    }

    public MarketOptionDto(List<FnoOptionDto> list, List<FnoOptionDto> list2, int i10, boolean z10, @NotNull AddComponentDto add, @NotNull BannerComponentDto banner) {
        Intrinsics.checkNotNullParameter(add, "add");
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.indices = list;
        this.stocks = list2;
        this.stocksCount = i10;
        this.eor = z10;
        this.add = add;
        this.banner = banner;
    }

    public static /* synthetic */ MarketOptionDto copy$default(MarketOptionDto marketOptionDto, List list, List list2, int i10, boolean z10, AddComponentDto addComponentDto, BannerComponentDto bannerComponentDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marketOptionDto.indices;
        }
        if ((i11 & 2) != 0) {
            list2 = marketOptionDto.stocks;
        }
        List list3 = list2;
        if ((i11 & 4) != 0) {
            i10 = marketOptionDto.stocksCount;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = marketOptionDto.eor;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            addComponentDto = marketOptionDto.add;
        }
        AddComponentDto addComponentDto2 = addComponentDto;
        if ((i11 & 32) != 0) {
            bannerComponentDto = marketOptionDto.banner;
        }
        return marketOptionDto.copy(list, list3, i12, z11, addComponentDto2, bannerComponentDto);
    }

    public final List<FnoOptionDto> component1() {
        return this.indices;
    }

    public final List<FnoOptionDto> component2() {
        return this.stocks;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStocksCount() {
        return this.stocksCount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEor() {
        return this.eor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AddComponentDto getAdd() {
        return this.add;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BannerComponentDto getBanner() {
        return this.banner;
    }

    @NotNull
    public final MarketOptionDto copy(List<FnoOptionDto> indices, List<FnoOptionDto> stocks, int stocksCount, boolean eor, @NotNull AddComponentDto add, @NotNull BannerComponentDto banner) {
        Intrinsics.checkNotNullParameter(add, "add");
        Intrinsics.checkNotNullParameter(banner, "banner");
        return new MarketOptionDto(indices, stocks, stocksCount, eor, add, banner);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketOptionDto)) {
            return false;
        }
        MarketOptionDto marketOptionDto = (MarketOptionDto) other;
        return Intrinsics.a(this.indices, marketOptionDto.indices) && Intrinsics.a(this.stocks, marketOptionDto.stocks) && this.stocksCount == marketOptionDto.stocksCount && this.eor == marketOptionDto.eor && Intrinsics.a(this.add, marketOptionDto.add) && Intrinsics.a(this.banner, marketOptionDto.banner);
    }

    @NotNull
    public final AddComponentDto getAdd() {
        return this.add;
    }

    @NotNull
    public final BannerComponentDto getBanner() {
        return this.banner;
    }

    public final boolean getEor() {
        return this.eor;
    }

    public final List<FnoOptionDto> getIndices() {
        return this.indices;
    }

    public final List<FnoOptionDto> getStocks() {
        return this.stocks;
    }

    public final int getStocksCount() {
        return this.stocksCount;
    }

    public int hashCode() {
        int hashCode;
        List<FnoOptionDto> list = this.indices;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = hashCode * 31;
        List<FnoOptionDto> list2 = this.stocks;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return this.banner.hashCode() + ((this.add.hashCode() + e.d(this.eor, da.e.f(this.stocksCount, (i11 + i10) * 31, 31), 31)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @NotNull
    public final MarketOption toMarketOption() {
        ?? r12;
        ?? r22;
        List<FnoOptionDto> list = this.indices;
        if (list != null) {
            r12 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r12.add(((FnoOptionDto) it.next()).toFnoOption());
            }
        } else {
            r12 = i0.f38321a;
        }
        List<FnoOptionDto> list2 = this.stocks;
        if (list2 != null) {
            r22 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r22.add(((FnoOptionDto) it2.next()).toFnoOption());
            }
        } else {
            r22 = i0.f38321a;
        }
        return new MarketOption(r12, r22, this.stocksCount, this.eor);
    }

    @NotNull
    public String toString() {
        return "MarketOptionDto(indices=" + this.indices + ", stocks=" + this.stocks + ", stocksCount=" + this.stocksCount + ", eor=" + this.eor + ", add=" + this.add + ", banner=" + this.banner + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<FnoOptionDto> list = this.indices;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((FnoOptionDto) o10.next()).writeToParcel(parcel, flags);
            }
        }
        List<FnoOptionDto> list2 = this.stocks;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o11 = a.o(parcel, 1, list2);
            while (o11.hasNext()) {
                ((FnoOptionDto) o11.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.stocksCount);
        parcel.writeInt(this.eor ? 1 : 0);
        this.add.writeToParcel(parcel, flags);
        this.banner.writeToParcel(parcel, flags);
    }
}
