package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.portfolio.holdings.PortfolioPeriodicReturn;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0013HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003JÇ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\t\u0010<\u001a\u00020\u0013HÖ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0013HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u0006H"}, d2 = {"Lcom/assetgro/stockgro/data/model/PortfolioValue;", "Landroid/os/Parcelable;", "realizedPNL", HttpUrl.FRAGMENT_ENCODE_SET, "unrealizedPNL", "cashBalance", "portfolioValue", "investedAmount", "totalTurnover", "pnl", "Lcom/assetgro/stockgro/data/model/PNL;", "totalTransactionCharges", "transactionChargePercent", "pieDistribution", HttpUrl.FRAGMENT_ENCODE_SET, "pendingOrderAmount", "portfolioName", "portfolioStatus", "numberOfStocks", HttpUrl.FRAGMENT_ENCODE_SET, "periodicPNL", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/portfolio/holdings/PortfolioPeriodicReturn;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/PNL;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getCashBalance", "()Ljava/lang/String;", "getInvestedAmount", "getNumberOfStocks", "()I", "getPendingOrderAmount", "getPeriodicPNL", "()Ljava/util/List;", "getPieDistribution", "()Ljava/util/Map;", "getPnl", "()Lcom/assetgro/stockgro/data/model/PNL;", "getPortfolioName", "getPortfolioStatus", "getPortfolioValue", "getRealizedPNL", "getTotalTransactionCharges", "getTotalTurnover", "getTransactionChargePercent", "getUnrealizedPNL", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioValue implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PortfolioValue> CREATOR = new Creator();

    @SerializedName("cash_balance")
    private final String cashBalance;

    @SerializedName("invested_amount")
    private final String investedAmount;

    @SerializedName("number_of_stocks")
    private final int numberOfStocks;

    @SerializedName("pending_order_amount")
    private final String pendingOrderAmount;

    @SerializedName("periodic_pnl")
    private final List<PortfolioPeriodicReturn> periodicPNL;

    @SerializedName("pie_distribution")
    @NotNull
    private final Map<String, String> pieDistribution;

    @SerializedName("pnl")
    @NotNull
    private final PNL pnl;

    @SerializedName("portfolio_name")
    private final String portfolioName;

    @SerializedName("portfolio_status")
    private final String portfolioStatus;

    @SerializedName("portfolio_value")
    private final String portfolioValue;

    @SerializedName("realized_pnl")
    private final String realizedPNL;

    @SerializedName("total_transaction_charges")
    private final String totalTransactionCharges;

    @SerializedName("total_turnover")
    private final String totalTurnover;

    @SerializedName("transaction_charge_pct")
    @NotNull
    private final String transactionChargePercent;

    @SerializedName("unrealized_pnl")
    private final String unrealizedPNL;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PortfolioValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PortfolioValue createFromParcel(@NotNull Parcel parcel) {
            String str;
            String str2;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            PNL createFromParcel = PNL.CREATOR.createFromParcel(parcel);
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
                str2 = readString10;
                str = readString11;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                str = readString11;
                int i11 = 0;
                while (i11 != readInt3) {
                    i11 = h.e(PortfolioPeriodicReturn.CREATOR, parcel, arrayList2, i11, 1);
                    readInt3 = readInt3;
                    readString10 = readString10;
                }
                str2 = readString10;
                arrayList = arrayList2;
            }
            return new PortfolioValue(readString, readString2, readString3, readString4, readString5, readString6, createFromParcel, readString7, readString8, linkedHashMap, readString9, str2, str, readInt2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PortfolioValue[] newArray(int i10) {
            return new PortfolioValue[i10];
        }
    }

    public PortfolioValue(String str, String str2, String str3, String str4, String str5, String str6, @NotNull PNL pnl, String str7, @NotNull String transactionChargePercent, @NotNull Map<String, String> pieDistribution, String str8, String str9, String str10, int i10, List<PortfolioPeriodicReturn> list) {
        Intrinsics.checkNotNullParameter(pnl, "pnl");
        Intrinsics.checkNotNullParameter(transactionChargePercent, "transactionChargePercent");
        Intrinsics.checkNotNullParameter(pieDistribution, "pieDistribution");
        this.realizedPNL = str;
        this.unrealizedPNL = str2;
        this.cashBalance = str3;
        this.portfolioValue = str4;
        this.investedAmount = str5;
        this.totalTurnover = str6;
        this.pnl = pnl;
        this.totalTransactionCharges = str7;
        this.transactionChargePercent = transactionChargePercent;
        this.pieDistribution = pieDistribution;
        this.pendingOrderAmount = str8;
        this.portfolioName = str9;
        this.portfolioStatus = str10;
        this.numberOfStocks = i10;
        this.periodicPNL = list;
    }

    /* renamed from: component1, reason: from getter */
    public final String getRealizedPNL() {
        return this.realizedPNL;
    }

    @NotNull
    public final Map<String, String> component10() {
        return this.pieDistribution;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPendingOrderAmount() {
        return this.pendingOrderAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    /* renamed from: component14, reason: from getter */
    public final int getNumberOfStocks() {
        return this.numberOfStocks;
    }

    public final List<PortfolioPeriodicReturn> component15() {
        return this.periodicPNL;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUnrealizedPNL() {
        return this.unrealizedPNL;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCashBalance() {
        return this.cashBalance;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInvestedAmount() {
        return this.investedAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTotalTurnover() {
        return this.totalTurnover;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final PNL getPnl() {
        return this.pnl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTotalTransactionCharges() {
        return this.totalTransactionCharges;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTransactionChargePercent() {
        return this.transactionChargePercent;
    }

    @NotNull
    public final PortfolioValue copy(String realizedPNL, String unrealizedPNL, String cashBalance, String portfolioValue, String investedAmount, String totalTurnover, @NotNull PNL pnl, String totalTransactionCharges, @NotNull String transactionChargePercent, @NotNull Map<String, String> pieDistribution, String pendingOrderAmount, String portfolioName, String portfolioStatus, int numberOfStocks, List<PortfolioPeriodicReturn> periodicPNL) {
        Intrinsics.checkNotNullParameter(pnl, "pnl");
        Intrinsics.checkNotNullParameter(transactionChargePercent, "transactionChargePercent");
        Intrinsics.checkNotNullParameter(pieDistribution, "pieDistribution");
        return new PortfolioValue(realizedPNL, unrealizedPNL, cashBalance, portfolioValue, investedAmount, totalTurnover, pnl, totalTransactionCharges, transactionChargePercent, pieDistribution, pendingOrderAmount, portfolioName, portfolioStatus, numberOfStocks, periodicPNL);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioValue)) {
            return false;
        }
        PortfolioValue portfolioValue = (PortfolioValue) other;
        return Intrinsics.a(this.realizedPNL, portfolioValue.realizedPNL) && Intrinsics.a(this.unrealizedPNL, portfolioValue.unrealizedPNL) && Intrinsics.a(this.cashBalance, portfolioValue.cashBalance) && Intrinsics.a(this.portfolioValue, portfolioValue.portfolioValue) && Intrinsics.a(this.investedAmount, portfolioValue.investedAmount) && Intrinsics.a(this.totalTurnover, portfolioValue.totalTurnover) && Intrinsics.a(this.pnl, portfolioValue.pnl) && Intrinsics.a(this.totalTransactionCharges, portfolioValue.totalTransactionCharges) && Intrinsics.a(this.transactionChargePercent, portfolioValue.transactionChargePercent) && Intrinsics.a(this.pieDistribution, portfolioValue.pieDistribution) && Intrinsics.a(this.pendingOrderAmount, portfolioValue.pendingOrderAmount) && Intrinsics.a(this.portfolioName, portfolioValue.portfolioName) && Intrinsics.a(this.portfolioStatus, portfolioValue.portfolioStatus) && this.numberOfStocks == portfolioValue.numberOfStocks && Intrinsics.a(this.periodicPNL, portfolioValue.periodicPNL);
    }

    public final String getCashBalance() {
        return this.cashBalance;
    }

    public final String getInvestedAmount() {
        return this.investedAmount;
    }

    public final int getNumberOfStocks() {
        return this.numberOfStocks;
    }

    public final String getPendingOrderAmount() {
        return this.pendingOrderAmount;
    }

    public final List<PortfolioPeriodicReturn> getPeriodicPNL() {
        return this.periodicPNL;
    }

    @NotNull
    public final Map<String, String> getPieDistribution() {
        return this.pieDistribution;
    }

    @NotNull
    public final PNL getPnl() {
        return this.pnl;
    }

    public final String getPortfolioName() {
        return this.portfolioName;
    }

    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    public final String getRealizedPNL() {
        return this.realizedPNL;
    }

    public final String getTotalTransactionCharges() {
        return this.totalTransactionCharges;
    }

    public final String getTotalTurnover() {
        return this.totalTurnover;
    }

    @NotNull
    public final String getTransactionChargePercent() {
        return this.transactionChargePercent;
    }

    public final String getUnrealizedPNL() {
        return this.unrealizedPNL;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        String str = this.realizedPNL;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.unrealizedPNL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.cashBalance;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.portfolioValue;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.investedAmount;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.totalTurnover;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int hashCode11 = (this.pnl.hashCode() + ((i15 + hashCode6) * 31)) * 31;
        String str7 = this.totalTransactionCharges;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int hashCode12 = (this.pieDistribution.hashCode() + h.g(this.transactionChargePercent, (hashCode11 + hashCode7) * 31, 31)) * 31;
        String str8 = this.pendingOrderAmount;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (hashCode12 + hashCode8) * 31;
        String str9 = this.portfolioName;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str10 = this.portfolioStatus;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int f10 = e.f(this.numberOfStocks, (i17 + hashCode10) * 31, 31);
        List<PortfolioPeriodicReturn> list = this.periodicPNL;
        if (list != null) {
            i10 = list.hashCode();
        }
        return f10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.realizedPNL;
        String str2 = this.unrealizedPNL;
        String str3 = this.cashBalance;
        String str4 = this.portfolioValue;
        String str5 = this.investedAmount;
        String str6 = this.totalTurnover;
        PNL pnl = this.pnl;
        String str7 = this.totalTransactionCharges;
        String str8 = this.transactionChargePercent;
        Map<String, String> map = this.pieDistribution;
        String str9 = this.pendingOrderAmount;
        String str10 = this.portfolioName;
        String str11 = this.portfolioStatus;
        int i10 = this.numberOfStocks;
        List<PortfolioPeriodicReturn> list = this.periodicPNL;
        StringBuilder l10 = v.e.l("PortfolioValue(realizedPNL=", str, ", unrealizedPNL=", str2, ", cashBalance=");
        v.e.v(l10, str3, ", portfolioValue=", str4, ", investedAmount=");
        v.e.v(l10, str5, ", totalTurnover=", str6, ", pnl=");
        l10.append(pnl);
        l10.append(", totalTransactionCharges=");
        l10.append(str7);
        l10.append(", transactionChargePercent=");
        l10.append(str8);
        l10.append(", pieDistribution=");
        l10.append(map);
        l10.append(", pendingOrderAmount=");
        v.e.v(l10, str9, ", portfolioName=", str10, ", portfolioStatus=");
        l10.append(str11);
        l10.append(", numberOfStocks=");
        l10.append(i10);
        l10.append(", periodicPNL=");
        return a.l(l10, list, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.realizedPNL);
        parcel.writeString(this.unrealizedPNL);
        parcel.writeString(this.cashBalance);
        parcel.writeString(this.portfolioValue);
        parcel.writeString(this.investedAmount);
        parcel.writeString(this.totalTurnover);
        this.pnl.writeToParcel(parcel, flags);
        parcel.writeString(this.totalTransactionCharges);
        parcel.writeString(this.transactionChargePercent);
        Map<String, String> map = this.pieDistribution;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.pendingOrderAmount);
        parcel.writeString(this.portfolioName);
        parcel.writeString(this.portfolioStatus);
        parcel.writeInt(this.numberOfStocks);
        List<PortfolioPeriodicReturn> list = this.periodicPNL;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((PortfolioPeriodicReturn) o10.next()).writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PortfolioValue(String str, String str2, String str3, String str4, String str5, String str6, PNL pnl, String str7, String str8, Map map, String str9, String str10, String str11, int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, pnl, str7, str8, (i11 & 512) != 0 ? new LinkedHashMap() : map, str9, str10, str11, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 0 : i10, list);
    }
}
