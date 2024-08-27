package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u007f\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000202HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000202HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006>"}, d2 = {"Lcom/assetgro/stockgro/data/model/StockDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "code", "ltp", HttpUrl.FRAGMENT_ENCODE_SET, "ask", "bid", "imageUrl", "change", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "sector", "marketSentiment", "Lcom/assetgro/stockgro/data/model/MarketSentimentDto;", "mutualFundHolding", "Lcom/assetgro/stockgro/data/model/MutualFundDto;", "friendsHolding", "Lcom/assetgro/stockgro/data/model/FriendHoldingDto;", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ChangeDto;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/MarketSentimentDto;Lcom/assetgro/stockgro/data/model/MutualFundDto;Lcom/assetgro/stockgro/data/model/FriendHoldingDto;)V", "getAsk", "()Ljava/lang/String;", "getBid", "getChange", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getCode", "getFriendsHolding", "()Lcom/assetgro/stockgro/data/model/FriendHoldingDto;", "getImageUrl", "getLtp", "()D", "getMarketSentiment", "()Lcom/assetgro/stockgro/data/model/MarketSentimentDto;", "getMutualFundHolding", "()Lcom/assetgro/stockgro/data/model/MutualFundDto;", "getName", "getSector", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StockDto> CREATOR = new Creator();

    @SerializedName("ask")
    @NotNull
    private final String ask;

    @SerializedName("bid")
    @NotNull
    private final String bid;

    @SerializedName("change")
    private final ChangeDto change;

    @SerializedName("identifier")
    @NotNull
    private final String code;

    @SerializedName("friends_holdings")
    private final FriendHoldingDto friendsHolding;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("last_trade_price")
    private final double ltp;

    @SerializedName("market_sentiment")
    private final MarketSentimentDto marketSentiment;

    @SerializedName("mutual_fund_holdings")
    private final MutualFundDto mutualFundHolding;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("sector")
    @NotNull
    private final String sector;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StockDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockDto(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : MarketSentimentDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MutualFundDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FriendHoldingDto.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StockDto[] newArray(int i10) {
            return new StockDto[i10];
        }
    }

    public StockDto(@NotNull String name, @NotNull String code, double d10, @NotNull String ask, @NotNull String bid, @NotNull String imageUrl, ChangeDto changeDto, @NotNull String sector, MarketSentimentDto marketSentimentDto, MutualFundDto mutualFundDto, FriendHoldingDto friendHoldingDto) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(ask, "ask");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(sector, "sector");
        this.name = name;
        this.code = code;
        this.ltp = d10;
        this.ask = ask;
        this.bid = bid;
        this.imageUrl = imageUrl;
        this.change = changeDto;
        this.sector = sector;
        this.marketSentiment = marketSentimentDto;
        this.mutualFundHolding = mutualFundDto;
        this.friendsHolding = friendHoldingDto;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final MutualFundDto getMutualFundHolding() {
        return this.mutualFundHolding;
    }

    /* renamed from: component11, reason: from getter */
    public final FriendHoldingDto getFriendsHolding() {
        return this.friendsHolding;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLtp() {
        return this.ltp;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getAsk() {
        return this.ask;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    /* renamed from: component9, reason: from getter */
    public final MarketSentimentDto getMarketSentiment() {
        return this.marketSentiment;
    }

    @NotNull
    public final StockDto copy(@NotNull String name, @NotNull String code, double ltp, @NotNull String ask, @NotNull String bid, @NotNull String imageUrl, ChangeDto change, @NotNull String sector, MarketSentimentDto marketSentiment, MutualFundDto mutualFundHolding, FriendHoldingDto friendsHolding) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(ask, "ask");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(sector, "sector");
        return new StockDto(name, code, ltp, ask, bid, imageUrl, change, sector, marketSentiment, mutualFundHolding, friendsHolding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockDto)) {
            return false;
        }
        StockDto stockDto = (StockDto) other;
        return Intrinsics.a(this.name, stockDto.name) && Intrinsics.a(this.code, stockDto.code) && Double.compare(this.ltp, stockDto.ltp) == 0 && Intrinsics.a(this.ask, stockDto.ask) && Intrinsics.a(this.bid, stockDto.bid) && Intrinsics.a(this.imageUrl, stockDto.imageUrl) && Intrinsics.a(this.change, stockDto.change) && Intrinsics.a(this.sector, stockDto.sector) && Intrinsics.a(this.marketSentiment, stockDto.marketSentiment) && Intrinsics.a(this.mutualFundHolding, stockDto.mutualFundHolding) && Intrinsics.a(this.friendsHolding, stockDto.friendsHolding);
    }

    @NotNull
    public final String getAsk() {
        return this.ask;
    }

    @NotNull
    public final String getBid() {
        return this.bid;
    }

    public final ChangeDto getChange() {
        return this.change;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final FriendHoldingDto getFriendsHolding() {
        return this.friendsHolding;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final double getLtp() {
        return this.ltp;
    }

    public final MarketSentimentDto getMarketSentiment() {
        return this.marketSentiment;
    }

    public final MutualFundDto getMutualFundHolding() {
        return this.mutualFundHolding;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSector() {
        return this.sector;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int g10 = h.g(this.imageUrl, h.g(this.bid, h.g(this.ask, d.c(this.ltp, h.g(this.code, this.name.hashCode() * 31, 31), 31), 31), 31), 31);
        ChangeDto changeDto = this.change;
        int i10 = 0;
        if (changeDto == null) {
            hashCode = 0;
        } else {
            hashCode = changeDto.hashCode();
        }
        int g11 = h.g(this.sector, (g10 + hashCode) * 31, 31);
        MarketSentimentDto marketSentimentDto = this.marketSentiment;
        if (marketSentimentDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = marketSentimentDto.hashCode();
        }
        int i11 = (g11 + hashCode2) * 31;
        MutualFundDto mutualFundDto = this.mutualFundHolding;
        if (mutualFundDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mutualFundDto.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        FriendHoldingDto friendHoldingDto = this.friendsHolding;
        if (friendHoldingDto != null) {
            i10 = friendHoldingDto.hashCode();
        }
        return i12 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.code;
        double d10 = this.ltp;
        String str3 = this.ask;
        String str4 = this.bid;
        String str5 = this.imageUrl;
        ChangeDto changeDto = this.change;
        String str6 = this.sector;
        MarketSentimentDto marketSentimentDto = this.marketSentiment;
        MutualFundDto mutualFundDto = this.mutualFundHolding;
        FriendHoldingDto friendHoldingDto = this.friendsHolding;
        StringBuilder l10 = e.l("StockDto(name=", str, ", code=", str2, ", ltp=");
        l10.append(d10);
        l10.append(", ask=");
        l10.append(str3);
        e.v(l10, ", bid=", str4, ", imageUrl=", str5);
        l10.append(", change=");
        l10.append(changeDto);
        l10.append(", sector=");
        l10.append(str6);
        l10.append(", marketSentiment=");
        l10.append(marketSentimentDto);
        l10.append(", mutualFundHolding=");
        l10.append(mutualFundDto);
        l10.append(", friendsHolding=");
        l10.append(friendHoldingDto);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeDouble(this.ltp);
        parcel.writeString(this.ask);
        parcel.writeString(this.bid);
        parcel.writeString(this.imageUrl);
        ChangeDto changeDto = this.change;
        if (changeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeDto.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.sector);
        MarketSentimentDto marketSentimentDto = this.marketSentiment;
        if (marketSentimentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSentimentDto.writeToParcel(parcel, flags);
        }
        MutualFundDto mutualFundDto = this.mutualFundHolding;
        if (mutualFundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mutualFundDto.writeToParcel(parcel, flags);
        }
        FriendHoldingDto friendHoldingDto = this.friendsHolding;
        if (friendHoldingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendHoldingDto.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ StockDto(String str, String str2, double d10, String str3, String str4, String str5, ChangeDto changeDto, String str6, MarketSentimentDto marketSentimentDto, MutualFundDto mutualFundDto, FriendHoldingDto friendHoldingDto, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d10, str3, str4, str5, changeDto, str6, (i10 & 256) != 0 ? null : marketSentimentDto, (i10 & 512) != 0 ? null : mutualFundDto, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : friendHoldingDto);
    }
}
