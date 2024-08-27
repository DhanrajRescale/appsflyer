package com.assetgro.stockgro.data.model.portfolio.holdings;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.LinkedHashMap;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u0016HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u001cHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003Jí\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\t\u0010N\u001a\u00020\u0016HÖ\u0001J\u0013\u0010O\u001a\u00020\u001c2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0016HÖ\u0001J\u0006\u0010S\u001a\u00020\u001cJ\t\u0010T\u001a\u00020\u000bHÖ\u0001J\u0019\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010#\"\u0004\b$\u0010%R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006Z"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "Landroid/os/Parcelable;", "investedAmount", HttpUrl.FRAGMENT_ENCODE_SET, "totalTurnover", "transactionCharges", "transactionChargePercent", "totalReturns", "Lcom/assetgro/stockgro/data/model/ChangeDto;", "pieDistribution", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "cashBalance", "realizedReturns", "unrealizedReturns", "pendingOrderAmount", "portfolioValue", "portfolioId", "portfolioName", "portfolioStatus", "numberOfStocks", HttpUrl.FRAGMENT_ENCODE_SET, "leagueName", "leagueImage", "leagueId", "assetClass", "isModelPortfolio", HttpUrl.FRAGMENT_ENCODE_SET, "(DDDDLcom/assetgro/stockgro/data/model/ChangeDto;Ljava/util/Map;DDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAssetClass", "()Ljava/lang/String;", "getCashBalance", "()D", "getInvestedAmount", "()Z", "setModelPortfolio", "(Z)V", "getLeagueId", "getLeagueImage", "getLeagueName", "getNumberOfStocks", "()I", "getPendingOrderAmount", "getPieDistribution", "()Ljava/util/Map;", "getPortfolioId", "getPortfolioName", "getPortfolioStatus", "getPortfolioValue", "getRealizedReturns", "getTotalReturns", "()Lcom/assetgro/stockgro/data/model/ChangeDto;", "getTotalTurnover", "getTransactionChargePercent", "getTransactionCharges", "getUnrealizedReturns", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "isPortfolioLinkedToPrepZone", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Portfolio implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Portfolio> CREATOR = new Creator();

    @SerializedName("asset_class")
    private final String assetClass;

    @SerializedName("cash_balance")
    private final double cashBalance;

    @SerializedName("invested_amount")
    private final double investedAmount;
    private boolean isModelPortfolio;

    @SerializedName("league_id")
    private final String leagueId;

    @SerializedName("league_image")
    private final String leagueImage;

    @SerializedName("league_name")
    private final String leagueName;

    @SerializedName("number_of_stocks")
    private final int numberOfStocks;

    @SerializedName("pending_order_amount")
    private final double pendingOrderAmount;

    @SerializedName("pie_distribution")
    private final Map<String, Float> pieDistribution;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName("portfolio_name")
    private final String portfolioName;

    @SerializedName("portfolio_status")
    private final String portfolioStatus;

    @SerializedName("portfolio_value")
    private final double portfolioValue;

    @SerializedName("realized_returns")
    private final double realizedReturns;

    @SerializedName("total_returns")
    private final ChangeDto totalReturns;

    @SerializedName("total_turnover")
    private final double totalTurnover;

    @SerializedName("transaction_charge_pct")
    private final double transactionChargePercent;

    @SerializedName("transaction_charges")
    private final double transactionCharges;

    @SerializedName("unrealized_returns")
    private final double unrealizedReturns;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Portfolio> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Portfolio createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            double readDouble3 = parcel.readDouble();
            double readDouble4 = parcel.readDouble();
            LinkedHashMap linkedHashMap = null;
            ChangeDto createFromParcel = parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    linkedHashMap.put(parcel.readString(), Float.valueOf(parcel.readFloat()));
                }
            }
            return new Portfolio(readDouble, readDouble2, readDouble3, readDouble4, createFromParcel, linkedHashMap, parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Portfolio[] newArray(int i10) {
            return new Portfolio[i10];
        }
    }

    public Portfolio(double d10, double d11, double d12, double d13, ChangeDto changeDto, Map<String, Float> map, double d14, double d15, double d16, double d17, double d18, @NotNull String portfolioId, String str, String str2, int i10, String str3, String str4, String str5, String str6, boolean z10) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.investedAmount = d10;
        this.totalTurnover = d11;
        this.transactionCharges = d12;
        this.transactionChargePercent = d13;
        this.totalReturns = changeDto;
        this.pieDistribution = map;
        this.cashBalance = d14;
        this.realizedReturns = d15;
        this.unrealizedReturns = d16;
        this.pendingOrderAmount = d17;
        this.portfolioValue = d18;
        this.portfolioId = portfolioId;
        this.portfolioName = str;
        this.portfolioStatus = str2;
        this.numberOfStocks = i10;
        this.leagueName = str3;
        this.leagueImage = str4;
        this.leagueId = str5;
        this.assetClass = str6;
        this.isModelPortfolio = z10;
    }

    /* renamed from: component1, reason: from getter */
    public final double getInvestedAmount() {
        return this.investedAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final double getPendingOrderAmount() {
        return this.pendingOrderAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final double getPortfolioValue() {
        return this.portfolioValue;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    /* renamed from: component15, reason: from getter */
    public final int getNumberOfStocks() {
        return this.numberOfStocks;
    }

    /* renamed from: component16, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* renamed from: component17, reason: from getter */
    public final String getLeagueImage() {
        return this.leagueImage;
    }

    /* renamed from: component18, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* renamed from: component19, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTotalTurnover() {
        return this.totalTurnover;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsModelPortfolio() {
        return this.isModelPortfolio;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTransactionCharges() {
        return this.transactionCharges;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTransactionChargePercent() {
        return this.transactionChargePercent;
    }

    /* renamed from: component5, reason: from getter */
    public final ChangeDto getTotalReturns() {
        return this.totalReturns;
    }

    public final Map<String, Float> component6() {
        return this.pieDistribution;
    }

    /* renamed from: component7, reason: from getter */
    public final double getCashBalance() {
        return this.cashBalance;
    }

    /* renamed from: component8, reason: from getter */
    public final double getRealizedReturns() {
        return this.realizedReturns;
    }

    /* renamed from: component9, reason: from getter */
    public final double getUnrealizedReturns() {
        return this.unrealizedReturns;
    }

    @NotNull
    public final Portfolio copy(double investedAmount, double totalTurnover, double transactionCharges, double transactionChargePercent, ChangeDto totalReturns, Map<String, Float> pieDistribution, double cashBalance, double realizedReturns, double unrealizedReturns, double pendingOrderAmount, double portfolioValue, @NotNull String portfolioId, String portfolioName, String portfolioStatus, int numberOfStocks, String leagueName, String leagueImage, String leagueId, String assetClass, boolean isModelPortfolio) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new Portfolio(investedAmount, totalTurnover, transactionCharges, transactionChargePercent, totalReturns, pieDistribution, cashBalance, realizedReturns, unrealizedReturns, pendingOrderAmount, portfolioValue, portfolioId, portfolioName, portfolioStatus, numberOfStocks, leagueName, leagueImage, leagueId, assetClass, isModelPortfolio);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Portfolio)) {
            return false;
        }
        Portfolio portfolio = (Portfolio) other;
        return Double.compare(this.investedAmount, portfolio.investedAmount) == 0 && Double.compare(this.totalTurnover, portfolio.totalTurnover) == 0 && Double.compare(this.transactionCharges, portfolio.transactionCharges) == 0 && Double.compare(this.transactionChargePercent, portfolio.transactionChargePercent) == 0 && Intrinsics.a(this.totalReturns, portfolio.totalReturns) && Intrinsics.a(this.pieDistribution, portfolio.pieDistribution) && Double.compare(this.cashBalance, portfolio.cashBalance) == 0 && Double.compare(this.realizedReturns, portfolio.realizedReturns) == 0 && Double.compare(this.unrealizedReturns, portfolio.unrealizedReturns) == 0 && Double.compare(this.pendingOrderAmount, portfolio.pendingOrderAmount) == 0 && Double.compare(this.portfolioValue, portfolio.portfolioValue) == 0 && Intrinsics.a(this.portfolioId, portfolio.portfolioId) && Intrinsics.a(this.portfolioName, portfolio.portfolioName) && Intrinsics.a(this.portfolioStatus, portfolio.portfolioStatus) && this.numberOfStocks == portfolio.numberOfStocks && Intrinsics.a(this.leagueName, portfolio.leagueName) && Intrinsics.a(this.leagueImage, portfolio.leagueImage) && Intrinsics.a(this.leagueId, portfolio.leagueId) && Intrinsics.a(this.assetClass, portfolio.assetClass) && this.isModelPortfolio == portfolio.isModelPortfolio;
    }

    public final String getAssetClass() {
        return this.assetClass;
    }

    public final double getCashBalance() {
        return this.cashBalance;
    }

    public final double getInvestedAmount() {
        return this.investedAmount;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueImage() {
        return this.leagueImage;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final int getNumberOfStocks() {
        return this.numberOfStocks;
    }

    public final double getPendingOrderAmount() {
        return this.pendingOrderAmount;
    }

    public final Map<String, Float> getPieDistribution() {
        return this.pieDistribution;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final String getPortfolioName() {
        return this.portfolioName;
    }

    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    public final double getPortfolioValue() {
        return this.portfolioValue;
    }

    public final double getRealizedReturns() {
        return this.realizedReturns;
    }

    public final ChangeDto getTotalReturns() {
        return this.totalReturns;
    }

    public final double getTotalTurnover() {
        return this.totalTurnover;
    }

    public final double getTransactionChargePercent() {
        return this.transactionChargePercent;
    }

    public final double getTransactionCharges() {
        return this.transactionCharges;
    }

    public final double getUnrealizedReturns() {
        return this.unrealizedReturns;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int c10 = d.c(this.transactionChargePercent, d.c(this.transactionCharges, d.c(this.totalTurnover, Double.hashCode(this.investedAmount) * 31, 31), 31), 31);
        ChangeDto changeDto = this.totalReturns;
        int i10 = 0;
        if (changeDto == null) {
            hashCode = 0;
        } else {
            hashCode = changeDto.hashCode();
        }
        int i11 = (c10 + hashCode) * 31;
        Map<String, Float> map = this.pieDistribution;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int g10 = h.g(this.portfolioId, d.c(this.portfolioValue, d.c(this.pendingOrderAmount, d.c(this.unrealizedReturns, d.c(this.realizedReturns, d.c(this.cashBalance, (i11 + hashCode2) * 31, 31), 31), 31), 31), 31), 31);
        String str = this.portfolioName;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (g10 + hashCode3) * 31;
        String str2 = this.portfolioStatus;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int f10 = e.f(this.numberOfStocks, (i12 + hashCode4) * 31, 31);
        String str3 = this.leagueName;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (f10 + hashCode5) * 31;
        String str4 = this.leagueImage;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.leagueId;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str6 = this.assetClass;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return Boolean.hashCode(this.isModelPortfolio) + ((i15 + i10) * 31);
    }

    public final boolean isModelPortfolio() {
        return this.isModelPortfolio;
    }

    public final boolean isPortfolioLinkedToPrepZone() {
        boolean z10;
        String str = this.leagueId;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        return !z10;
    }

    public final void setModelPortfolio(boolean z10) {
        this.isModelPortfolio = z10;
    }

    @NotNull
    public String toString() {
        double d10 = this.investedAmount;
        double d11 = this.totalTurnover;
        double d12 = this.transactionCharges;
        double d13 = this.transactionChargePercent;
        ChangeDto changeDto = this.totalReturns;
        Map<String, Float> map = this.pieDistribution;
        double d14 = this.cashBalance;
        double d15 = this.realizedReturns;
        double d16 = this.unrealizedReturns;
        double d17 = this.pendingOrderAmount;
        double d18 = this.portfolioValue;
        String str = this.portfolioId;
        String str2 = this.portfolioName;
        String str3 = this.portfolioStatus;
        int i10 = this.numberOfStocks;
        String str4 = this.leagueName;
        String str5 = this.leagueImage;
        String str6 = this.leagueId;
        String str7 = this.assetClass;
        boolean z10 = this.isModelPortfolio;
        StringBuilder sb2 = new StringBuilder("Portfolio(investedAmount=");
        sb2.append(d10);
        sb2.append(", totalTurnover=");
        sb2.append(d11);
        a.v(sb2, ", transactionCharges=", d12, ", transactionChargePercent=");
        sb2.append(d13);
        sb2.append(", totalReturns=");
        sb2.append(changeDto);
        sb2.append(", pieDistribution=");
        sb2.append(map);
        sb2.append(", cashBalance=");
        sb2.append(d14);
        a.v(sb2, ", realizedReturns=", d15, ", unrealizedReturns=");
        sb2.append(d16);
        a.v(sb2, ", pendingOrderAmount=", d17, ", portfolioValue=");
        sb2.append(d18);
        sb2.append(", portfolioId=");
        sb2.append(str);
        v.e.v(sb2, ", portfolioName=", str2, ", portfolioStatus=", str3);
        sb2.append(", numberOfStocks=");
        sb2.append(i10);
        sb2.append(", leagueName=");
        sb2.append(str4);
        v.e.v(sb2, ", leagueImage=", str5, ", leagueId=", str6);
        sb2.append(", assetClass=");
        sb2.append(str7);
        sb2.append(", isModelPortfolio=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.investedAmount);
        parcel.writeDouble(this.totalTurnover);
        parcel.writeDouble(this.transactionCharges);
        parcel.writeDouble(this.transactionChargePercent);
        ChangeDto changeDto = this.totalReturns;
        if (changeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeDto.writeToParcel(parcel, flags);
        }
        Map<String, Float> map = this.pieDistribution;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeFloat(entry.getValue().floatValue());
            }
        }
        parcel.writeDouble(this.cashBalance);
        parcel.writeDouble(this.realizedReturns);
        parcel.writeDouble(this.unrealizedReturns);
        parcel.writeDouble(this.pendingOrderAmount);
        parcel.writeDouble(this.portfolioValue);
        parcel.writeString(this.portfolioId);
        parcel.writeString(this.portfolioName);
        parcel.writeString(this.portfolioStatus);
        parcel.writeInt(this.numberOfStocks);
        parcel.writeString(this.leagueName);
        parcel.writeString(this.leagueImage);
        parcel.writeString(this.leagueId);
        parcel.writeString(this.assetClass);
        parcel.writeInt(this.isModelPortfolio ? 1 : 0);
    }

    public /* synthetic */ Portfolio(double d10, double d11, double d12, double d13, ChangeDto changeDto, Map map, double d14, double d15, double d16, double d17, double d18, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, changeDto, (i11 & 32) != 0 ? new LinkedHashMap() : map, d14, d15, d16, d17, d18, str, (i11 & 4096) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, str3, i10, str4, str5, str6, str7, (i11 & 524288) != 0 ? true : z10);
    }
}
