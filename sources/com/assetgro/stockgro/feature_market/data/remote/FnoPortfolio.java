package com.assetgro.stockgro.feature_market.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006'"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/FnoPortfolio;", "Landroid/os/Parcelable;", "portfolioId", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioName", "cashBalance", HttpUrl.FRAGMENT_ENCODE_SET, "isModel", HttpUrl.FRAGMENT_ENCODE_SET, "openPositions", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/PositionItem;", "(Ljava/lang/String;Ljava/lang/String;DZLjava/util/Map;)V", "getCashBalance", "()D", "()Z", "getOpenPositions", "()Ljava/util/Map;", "getPortfolioId", "()Ljava/lang/String;", "getPortfolioName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FnoPortfolio implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FnoPortfolio> CREATOR = new Creator();

    @SerializedName("cash_balance")
    private final double cashBalance;

    @SerializedName("is_model")
    private final boolean isModel;

    @SerializedName("open_pos")
    @NotNull
    private final Map<String, PositionItem> openPositions;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName("portfolio_name")
    @NotNull
    private final String portfolioName;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FnoPortfolio> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FnoPortfolio createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            double readDouble = parcel.readDouble();
            boolean z10 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                linkedHashMap.put(parcel.readString(), PositionItem.CREATOR.createFromParcel(parcel));
            }
            return new FnoPortfolio(readString, readString2, readDouble, z10, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FnoPortfolio[] newArray(int i10) {
            return new FnoPortfolio[i10];
        }
    }

    public FnoPortfolio(@NotNull String portfolioId, @NotNull String portfolioName, double d10, boolean z10, @NotNull Map<String, PositionItem> openPositions) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(openPositions, "openPositions");
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
        this.cashBalance = d10;
        this.isModel = z10;
        this.openPositions = openPositions;
    }

    public static /* synthetic */ FnoPortfolio copy$default(FnoPortfolio fnoPortfolio, String str, String str2, double d10, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fnoPortfolio.portfolioId;
        }
        if ((i10 & 2) != 0) {
            str2 = fnoPortfolio.portfolioName;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            d10 = fnoPortfolio.cashBalance;
        }
        double d11 = d10;
        if ((i10 & 8) != 0) {
            z10 = fnoPortfolio.isModel;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            map = fnoPortfolio.openPositions;
        }
        return fnoPortfolio.copy(str, str3, d11, z11, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    /* renamed from: component3, reason: from getter */
    public final double getCashBalance() {
        return this.cashBalance;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsModel() {
        return this.isModel;
    }

    @NotNull
    public final Map<String, PositionItem> component5() {
        return this.openPositions;
    }

    @NotNull
    public final FnoPortfolio copy(@NotNull String portfolioId, @NotNull String portfolioName, double cashBalance, boolean isModel, @NotNull Map<String, PositionItem> openPositions) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(openPositions, "openPositions");
        return new FnoPortfolio(portfolioId, portfolioName, cashBalance, isModel, openPositions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FnoPortfolio)) {
            return false;
        }
        FnoPortfolio fnoPortfolio = (FnoPortfolio) other;
        return Intrinsics.a(this.portfolioId, fnoPortfolio.portfolioId) && Intrinsics.a(this.portfolioName, fnoPortfolio.portfolioName) && Double.compare(this.cashBalance, fnoPortfolio.cashBalance) == 0 && this.isModel == fnoPortfolio.isModel && Intrinsics.a(this.openPositions, fnoPortfolio.openPositions);
    }

    public final double getCashBalance() {
        return this.cashBalance;
    }

    @NotNull
    public final Map<String, PositionItem> getOpenPositions() {
        return this.openPositions;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    public int hashCode() {
        return this.openPositions.hashCode() + e.d(this.isModel, d.c(this.cashBalance, h.g(this.portfolioName, this.portfolioId.hashCode() * 31, 31), 31), 31);
    }

    public final boolean isModel() {
        return this.isModel;
    }

    @NotNull
    public String toString() {
        String str = this.portfolioId;
        String str2 = this.portfolioName;
        double d10 = this.cashBalance;
        boolean z10 = this.isModel;
        Map<String, PositionItem> map = this.openPositions;
        StringBuilder l10 = e.l("FnoPortfolio(portfolioId=", str, ", portfolioName=", str2, ", cashBalance=");
        l10.append(d10);
        l10.append(", isModel=");
        l10.append(z10);
        l10.append(", openPositions=");
        l10.append(map);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.portfolioId);
        parcel.writeString(this.portfolioName);
        parcel.writeDouble(this.cashBalance);
        parcel.writeInt(this.isModel ? 1 : 0);
        Map<String, PositionItem> map = this.openPositions;
        parcel.writeInt(map.size());
        for (Map.Entry<String, PositionItem> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }
}
