package com.assetgro.stockgro.feature_market.data.remote;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00061"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/ContractOverviewResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "change", "Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "premium", HttpUrl.FRAGMENT_ENCODE_SET, "optionType", HttpUrl.FRAGMENT_ENCODE_SET, "strikePrice", "marginPrice", "identifier", "type", "identifierInfo", "Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;", AppMeasurementSdk.ConditionalUserProperty.NAME, "(Lcom/assetgro/stockgro/feature_market/data/remote/Change;IDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;Ljava/lang/String;)V", "getChange", "()Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "getIdentifier", "()Ljava/lang/String;", "getIdentifierInfo", "()Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;", "getLotSize", "()I", "getMarginPrice", "()D", "getName", "getOptionType", "getPremium", "getStrikePrice", "getType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContractOverviewResponseDto {
    public static final int $stable = 0;

    @SerializedName("change")
    @NotNull
    private final Change change;

    @SerializedName("identifier")
    @NotNull
    private final String identifier;

    @SerializedName("identifier_info")
    @NotNull
    private final IdentifierInfo identifierInfo;

    @SerializedName("lot_size")
    private final int lotSize;

    @SerializedName("margin_price")
    private final double marginPrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("option_type")
    @NotNull
    private final String optionType;

    @SerializedName("premium")
    private final double premium;

    @SerializedName("strike_price")
    private final int strikePrice;

    @SerializedName("type")
    @NotNull
    private final String type;

    public ContractOverviewResponseDto(@NotNull Change change, int i10, double d10, @NotNull String optionType, int i11, double d11, @NotNull String identifier, @NotNull String type, @NotNull IdentifierInfo identifierInfo, @NotNull String name) {
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(name, "name");
        this.change = change;
        this.lotSize = i10;
        this.premium = d10;
        this.optionType = optionType;
        this.strikePrice = i11;
        this.marginPrice = d11;
        this.identifier = identifier;
        this.type = type;
        this.identifierInfo = identifierInfo;
        this.name = name;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Change getChange() {
        return this.change;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLotSize() {
        return this.lotSize;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPremium() {
        return this.premium;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getStrikePrice() {
        return this.strikePrice;
    }

    /* renamed from: component6, reason: from getter */
    public final double getMarginPrice() {
        return this.marginPrice;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    @NotNull
    public final ContractOverviewResponseDto copy(@NotNull Change change, int lotSize, double premium, @NotNull String optionType, int strikePrice, double marginPrice, @NotNull String identifier, @NotNull String type, @NotNull IdentifierInfo identifierInfo, @NotNull String name) {
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ContractOverviewResponseDto(change, lotSize, premium, optionType, strikePrice, marginPrice, identifier, type, identifierInfo, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContractOverviewResponseDto)) {
            return false;
        }
        ContractOverviewResponseDto contractOverviewResponseDto = (ContractOverviewResponseDto) other;
        return Intrinsics.a(this.change, contractOverviewResponseDto.change) && this.lotSize == contractOverviewResponseDto.lotSize && Double.compare(this.premium, contractOverviewResponseDto.premium) == 0 && Intrinsics.a(this.optionType, contractOverviewResponseDto.optionType) && this.strikePrice == contractOverviewResponseDto.strikePrice && Double.compare(this.marginPrice, contractOverviewResponseDto.marginPrice) == 0 && Intrinsics.a(this.identifier, contractOverviewResponseDto.identifier) && Intrinsics.a(this.type, contractOverviewResponseDto.type) && Intrinsics.a(this.identifierInfo, contractOverviewResponseDto.identifierInfo) && Intrinsics.a(this.name, contractOverviewResponseDto.name);
    }

    @NotNull
    public final Change getChange() {
        return this.change;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final IdentifierInfo getIdentifierInfo() {
        return this.identifierInfo;
    }

    public final int getLotSize() {
        return this.lotSize;
    }

    public final double getMarginPrice() {
        return this.marginPrice;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getOptionType() {
        return this.optionType;
    }

    public final double getPremium() {
        return this.premium;
    }

    public final int getStrikePrice() {
        return this.strikePrice;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.name.hashCode() + ((this.identifierInfo.hashCode() + h.g(this.type, h.g(this.identifier, d.c(this.marginPrice, e.f(this.strikePrice, h.g(this.optionType, d.c(this.premium, e.f(this.lotSize, this.change.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        Change change = this.change;
        int i10 = this.lotSize;
        double d10 = this.premium;
        String str = this.optionType;
        int i11 = this.strikePrice;
        double d11 = this.marginPrice;
        String str2 = this.identifier;
        String str3 = this.type;
        IdentifierInfo identifierInfo = this.identifierInfo;
        String str4 = this.name;
        StringBuilder sb2 = new StringBuilder("ContractOverviewResponseDto(change=");
        sb2.append(change);
        sb2.append(", lotSize=");
        sb2.append(i10);
        sb2.append(", premium=");
        sb2.append(d10);
        sb2.append(", optionType=");
        sb2.append(str);
        sb2.append(", strikePrice=");
        sb2.append(i11);
        sb2.append(", marginPrice=");
        sb2.append(d11);
        sb2.append(", identifier=");
        sb2.append(str2);
        sb2.append(", type=");
        sb2.append(str3);
        sb2.append(", identifierInfo=");
        sb2.append(identifierInfo);
        return v.e.j(sb2, ", name=", str4, ")");
    }
}
