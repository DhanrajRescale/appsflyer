package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.i0;
import vt.p0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000eHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0083\u0001\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\u0006\u0010/\u001a\u000200J\t\u00101\u001a\u00020\tHÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020*HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0014R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017¨\u00067"}, d2 = {"Lcom/assetgro/stockgro/data/model/UnifiedPortfolio;", "Landroid/os/Parcelable;", "stockvalues", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/UnifiedStockTransaction;", "optionValues", "portfolioValue", "Lcom/assetgro/stockgro/data/model/PortfolioValue;", "portfolioName", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioStatus", "portfolioId", "leagueId", "isPortfolioEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "assetClass", "isModel", "(Ljava/util/List;Ljava/util/List;Lcom/assetgro/stockgro/data/model/PortfolioValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getAssetClass", "()Ljava/lang/String;", "()Z", "getLeagueId", "getOptionValues", "()Ljava/util/List;", "getPortfolioId", "getPortfolioName", "getPortfolioStatus", "getPortfolioValue", "()Lcom/assetgro/stockgro/data/model/PortfolioValue;", "getStockvalues", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toSimplePortfolio", "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnifiedPortfolio implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UnifiedPortfolio> CREATOR = new Creator();

    @SerializedName("asset_class")
    private final String assetClass;

    @SerializedName("is_model")
    private final boolean isModel;

    @SerializedName("is_empty")
    private final boolean isPortfolioEmpty;

    @SerializedName("league_id")
    @NotNull
    private final String leagueId;

    @SerializedName("option_values")
    private final List<UnifiedStockTransaction> optionValues;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String portfolioName;

    @SerializedName("status")
    private final String portfolioStatus;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    @NotNull
    private final PortfolioValue portfolioValue;

    @SerializedName("stock_values")
    private final List<UnifiedStockTransaction> stockvalues;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UnifiedPortfolio> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnifiedPortfolio createFromParcel(@NotNull Parcel parcel) {
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
                    i10 = h.e(UnifiedStockTransaction.CREATOR, parcel, arrayList3, i10, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    i11 = h.e(UnifiedStockTransaction.CREATOR, parcel, arrayList2, i11, 1);
                }
            }
            return new UnifiedPortfolio(arrayList, arrayList2, PortfolioValue.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnifiedPortfolio[] newArray(int i10) {
            return new UnifiedPortfolio[i10];
        }
    }

    public UnifiedPortfolio(List<UnifiedStockTransaction> list, List<UnifiedStockTransaction> list2, @NotNull PortfolioValue portfolioValue, String str, String str2, @NotNull String portfolioId, @NotNull String leagueId, boolean z10, String str3, boolean z11) {
        Intrinsics.checkNotNullParameter(portfolioValue, "portfolioValue");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        this.stockvalues = list;
        this.optionValues = list2;
        this.portfolioValue = portfolioValue;
        this.portfolioName = str;
        this.portfolioStatus = str2;
        this.portfolioId = portfolioId;
        this.leagueId = leagueId;
        this.isPortfolioEmpty = z10;
        this.assetClass = str3;
        this.isModel = z11;
    }

    public final List<UnifiedStockTransaction> component1() {
        return this.stockvalues;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsModel() {
        return this.isModel;
    }

    public final List<UnifiedStockTransaction> component2() {
        return this.optionValues;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PortfolioValue getPortfolioValue() {
        return this.portfolioValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPortfolioStatus() {
        return this.portfolioStatus;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsPortfolioEmpty() {
        return this.isPortfolioEmpty;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final UnifiedPortfolio copy(List<UnifiedStockTransaction> stockvalues, List<UnifiedStockTransaction> optionValues, @NotNull PortfolioValue portfolioValue, String portfolioName, String portfolioStatus, @NotNull String portfolioId, @NotNull String leagueId, boolean isPortfolioEmpty, String assetClass, boolean isModel) {
        Intrinsics.checkNotNullParameter(portfolioValue, "portfolioValue");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        return new UnifiedPortfolio(stockvalues, optionValues, portfolioValue, portfolioName, portfolioStatus, portfolioId, leagueId, isPortfolioEmpty, assetClass, isModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedPortfolio)) {
            return false;
        }
        UnifiedPortfolio unifiedPortfolio = (UnifiedPortfolio) other;
        return Intrinsics.a(this.stockvalues, unifiedPortfolio.stockvalues) && Intrinsics.a(this.optionValues, unifiedPortfolio.optionValues) && Intrinsics.a(this.portfolioValue, unifiedPortfolio.portfolioValue) && Intrinsics.a(this.portfolioName, unifiedPortfolio.portfolioName) && Intrinsics.a(this.portfolioStatus, unifiedPortfolio.portfolioStatus) && Intrinsics.a(this.portfolioId, unifiedPortfolio.portfolioId) && Intrinsics.a(this.leagueId, unifiedPortfolio.leagueId) && this.isPortfolioEmpty == unifiedPortfolio.isPortfolioEmpty && Intrinsics.a(this.assetClass, unifiedPortfolio.assetClass) && this.isModel == unifiedPortfolio.isModel;
    }

    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final String getLeagueId() {
        return this.leagueId;
    }

    public final List<UnifiedStockTransaction> getOptionValues() {
        return this.optionValues;
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

    @NotNull
    public final PortfolioValue getPortfolioValue() {
        return this.portfolioValue;
    }

    public final List<UnifiedStockTransaction> getStockvalues() {
        return this.stockvalues;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        List<UnifiedStockTransaction> list = this.stockvalues;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = hashCode * 31;
        List<UnifiedStockTransaction> list2 = this.optionValues;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int hashCode5 = (this.portfolioValue.hashCode() + ((i11 + hashCode2) * 31)) * 31;
        String str = this.portfolioName;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (hashCode5 + hashCode3) * 31;
        String str2 = this.portfolioStatus;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int d10 = e.d(this.isPortfolioEmpty, h.g(this.leagueId, h.g(this.portfolioId, (i12 + hashCode4) * 31, 31), 31), 31);
        String str3 = this.assetClass;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return Boolean.hashCode(this.isModel) + ((d10 + i10) * 31);
    }

    public final boolean isModel() {
        return this.isModel;
    }

    public final boolean isPortfolioEmpty() {
        return this.isPortfolioEmpty;
    }

    @NotNull
    public final Portfolio toSimplePortfolio() {
        String str;
        String str2;
        String str3;
        ij.h hVar = ij.h.f20067a;
        double c10 = ij.h.c(this.portfolioValue.getInvestedAmount());
        double c11 = ij.h.c(this.portfolioValue.getTotalTurnover());
        double c12 = ij.h.c(this.portfolioValue.getTotalTransactionCharges());
        double c13 = ij.h.c(this.portfolioValue.getTransactionChargePercent());
        Map d10 = p0.d();
        double c14 = ij.h.c(this.portfolioValue.getCashBalance());
        double c15 = ij.h.c(this.portfolioValue.getRealizedPNL());
        double c16 = ij.h.c(this.portfolioValue.getUnrealizedPNL());
        double c17 = ij.h.c(this.portfolioValue.getPendingOrderAmount());
        double c18 = ij.h.c(this.portfolioValue.getPortfolioValue());
        String str4 = this.portfolioId;
        String str5 = this.portfolioName;
        if (str5 == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = str5;
        }
        String str6 = this.portfolioStatus;
        if (str6 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = str6;
        }
        String str7 = this.leagueId;
        String str8 = this.assetClass;
        if (str8 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str3 = str8;
        }
        return new Portfolio(c10, c11, c12, c13, null, d10, c14, c15, c16, c17, c18, str4, str, str2, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, str7, str3, this.isModel);
    }

    @NotNull
    public String toString() {
        List<UnifiedStockTransaction> list = this.stockvalues;
        List<UnifiedStockTransaction> list2 = this.optionValues;
        PortfolioValue portfolioValue = this.portfolioValue;
        String str = this.portfolioName;
        String str2 = this.portfolioStatus;
        String str3 = this.portfolioId;
        String str4 = this.leagueId;
        boolean z10 = this.isPortfolioEmpty;
        String str5 = this.assetClass;
        boolean z11 = this.isModel;
        StringBuilder sb2 = new StringBuilder("UnifiedPortfolio(stockvalues=");
        sb2.append(list);
        sb2.append(", optionValues=");
        sb2.append(list2);
        sb2.append(", portfolioValue=");
        sb2.append(portfolioValue);
        sb2.append(", portfolioName=");
        sb2.append(str);
        sb2.append(", portfolioStatus=");
        e.v(sb2, str2, ", portfolioId=", str3, ", leagueId=");
        sb2.append(str4);
        sb2.append(", isPortfolioEmpty=");
        sb2.append(z10);
        sb2.append(", assetClass=");
        sb2.append(str5);
        sb2.append(", isModel=");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<UnifiedStockTransaction> list = this.stockvalues;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((UnifiedStockTransaction) o10.next()).writeToParcel(parcel, flags);
            }
        }
        List<UnifiedStockTransaction> list2 = this.optionValues;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o11 = a.o(parcel, 1, list2);
            while (o11.hasNext()) {
                ((UnifiedStockTransaction) o11.next()).writeToParcel(parcel, flags);
            }
        }
        this.portfolioValue.writeToParcel(parcel, flags);
        parcel.writeString(this.portfolioName);
        parcel.writeString(this.portfolioStatus);
        parcel.writeString(this.portfolioId);
        parcel.writeString(this.leagueId);
        parcel.writeInt(this.isPortfolioEmpty ? 1 : 0);
        parcel.writeString(this.assetClass);
        parcel.writeInt(this.isModel ? 1 : 0);
    }

    public UnifiedPortfolio(List list, List list2, PortfolioValue portfolioValue, String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? i0.f38321a : list, (i10 & 2) != 0 ? i0.f38321a : list2, portfolioValue, str, str2, str3, str4, z10, str5, z11);
    }
}
