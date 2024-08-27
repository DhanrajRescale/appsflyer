package com.assetgro.stockgro.feature_market.data.remote;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/IdentifierInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "sector", HttpUrl.FRAGMENT_ENCODE_SET, "lastTradePrice", HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "identifier", "change", "Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/Change;)V", "getChange", "()Lcom/assetgro/stockgro/feature_market/data/remote/Change;", "getIdentifier", "()Ljava/lang/String;", "getImageUrl", "getLastTradePrice", "()D", "getName", "getSector", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IdentifierInfo {
    public static final int $stable = 0;

    @SerializedName("change")
    @NotNull
    private final Change change;

    @SerializedName("identifier")
    @NotNull
    private final String identifier;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("last_trade_price")
    private final double lastTradePrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("sector")
    @NotNull
    private final String sector;

    public IdentifierInfo(@NotNull String sector, double d10, @NotNull String imageUrl, @NotNull String name, @NotNull String identifier, @NotNull Change change) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(change, "change");
        this.sector = sector;
        this.lastTradePrice = d10;
        this.imageUrl = imageUrl;
        this.name = name;
        this.identifier = identifier;
        this.change = change;
    }

    public static /* synthetic */ IdentifierInfo copy$default(IdentifierInfo identifierInfo, String str, double d10, String str2, String str3, String str4, Change change, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = identifierInfo.sector;
        }
        if ((i10 & 2) != 0) {
            d10 = identifierInfo.lastTradePrice;
        }
        double d11 = d10;
        if ((i10 & 4) != 0) {
            str2 = identifierInfo.imageUrl;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = identifierInfo.name;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = identifierInfo.identifier;
        }
        String str7 = str4;
        if ((i10 & 32) != 0) {
            change = identifierInfo.change;
        }
        return identifierInfo.copy(str, d11, str5, str6, str7, change);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLastTradePrice() {
        return this.lastTradePrice;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Change getChange() {
        return this.change;
    }

    @NotNull
    public final IdentifierInfo copy(@NotNull String sector, double lastTradePrice, @NotNull String imageUrl, @NotNull String name, @NotNull String identifier, @NotNull Change change) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(change, "change");
        return new IdentifierInfo(sector, lastTradePrice, imageUrl, name, identifier, change);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifierInfo)) {
            return false;
        }
        IdentifierInfo identifierInfo = (IdentifierInfo) other;
        return Intrinsics.a(this.sector, identifierInfo.sector) && Double.compare(this.lastTradePrice, identifierInfo.lastTradePrice) == 0 && Intrinsics.a(this.imageUrl, identifierInfo.imageUrl) && Intrinsics.a(this.name, identifierInfo.name) && Intrinsics.a(this.identifier, identifierInfo.identifier) && Intrinsics.a(this.change, identifierInfo.change);
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
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final double getLastTradePrice() {
        return this.lastTradePrice;
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
        return this.change.hashCode() + h.g(this.identifier, h.g(this.name, h.g(this.imageUrl, d.c(this.lastTradePrice, this.sector.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.sector;
        double d10 = this.lastTradePrice;
        String str2 = this.imageUrl;
        String str3 = this.name;
        String str4 = this.identifier;
        Change change = this.change;
        StringBuilder sb2 = new StringBuilder("IdentifierInfo(sector=");
        sb2.append(str);
        sb2.append(", lastTradePrice=");
        sb2.append(d10);
        e.v(sb2, ", imageUrl=", str2, ", name=", str3);
        sb2.append(", identifier=");
        sb2.append(str4);
        sb2.append(", change=");
        sb2.append(change);
        sb2.append(")");
        return sb2.toString();
    }
}
