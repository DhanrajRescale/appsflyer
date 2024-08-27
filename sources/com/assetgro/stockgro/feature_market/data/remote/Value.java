package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.i0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0002\u0010\u0011J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\u007f\u0010*\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004HÆ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0004HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00068"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/Value;", "Landroid/os/Parcelable;", "pieDistribution", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "pnl", "Lcom/assetgro/stockgro/feature_market/data/remote/Pnl;", "marginUtilised", "portfolioValue", "marginAvailable", "totalTransactionCharges", "periodicPnl", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/PeriodicPnl;", "pendingOrderAmount", "realizedPnl", "unrealizedPnl", "(Ljava/util/Map;Lcom/assetgro/stockgro/feature_market/data/remote/Pnl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMarginAvailable", "()Ljava/lang/String;", "getMarginUtilised", "getPendingOrderAmount", "getPeriodicPnl", "()Ljava/util/List;", "getPieDistribution", "()Ljava/util/Map;", "getPnl", "()Lcom/assetgro/stockgro/feature_market/data/remote/Pnl;", "getPortfolioValue", "getRealizedPnl", "getTotalTransactionCharges", "getUnrealizedPnl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Value implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Value> CREATOR = new Creator();

    @SerializedName("margin_available")
    @NotNull
    private final String marginAvailable;

    @SerializedName("margin_utilised")
    @NotNull
    private final String marginUtilised;

    @SerializedName("pending_order_amount")
    @NotNull
    private final String pendingOrderAmount;

    @SerializedName("periodic_pnl")
    @NotNull
    private final List<PeriodicPnl> periodicPnl;

    @SerializedName("pie_distribution")
    @NotNull
    private final Map<String, String> pieDistribution;

    @SerializedName("pnl")
    @NotNull
    private final Pnl pnl;

    @SerializedName("portfolio_value")
    @NotNull
    private final String portfolioValue;

    @SerializedName("realized_pnl")
    @NotNull
    private final String realizedPnl;

    @SerializedName("total_transaction_charges")
    @NotNull
    private final String totalTransactionCharges;

    @SerializedName("unrealized_pnl")
    @NotNull
    private final String unrealizedPnl;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Value> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Value createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i10 = 0;
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            Pnl createFromParcel = Pnl.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i10 != readInt2) {
                i10 = h.e(PeriodicPnl.CREATOR, parcel, arrayList, i10, 1);
            }
            return new Value(linkedHashMap, createFromParcel, readString, readString2, readString3, readString4, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Value[] newArray(int i10) {
            return new Value[i10];
        }
    }

    public Value(@NotNull Map<String, String> pieDistribution, @NotNull Pnl pnl, @NotNull String marginUtilised, @NotNull String portfolioValue, @NotNull String marginAvailable, @NotNull String totalTransactionCharges, @NotNull List<PeriodicPnl> periodicPnl, @NotNull String pendingOrderAmount, @NotNull String realizedPnl, @NotNull String unrealizedPnl) {
        Intrinsics.checkNotNullParameter(pieDistribution, "pieDistribution");
        Intrinsics.checkNotNullParameter(pnl, "pnl");
        Intrinsics.checkNotNullParameter(marginUtilised, "marginUtilised");
        Intrinsics.checkNotNullParameter(portfolioValue, "portfolioValue");
        Intrinsics.checkNotNullParameter(marginAvailable, "marginAvailable");
        Intrinsics.checkNotNullParameter(totalTransactionCharges, "totalTransactionCharges");
        Intrinsics.checkNotNullParameter(periodicPnl, "periodicPnl");
        Intrinsics.checkNotNullParameter(pendingOrderAmount, "pendingOrderAmount");
        Intrinsics.checkNotNullParameter(realizedPnl, "realizedPnl");
        Intrinsics.checkNotNullParameter(unrealizedPnl, "unrealizedPnl");
        this.pieDistribution = pieDistribution;
        this.pnl = pnl;
        this.marginUtilised = marginUtilised;
        this.portfolioValue = portfolioValue;
        this.marginAvailable = marginAvailable;
        this.totalTransactionCharges = totalTransactionCharges;
        this.periodicPnl = periodicPnl;
        this.pendingOrderAmount = pendingOrderAmount;
        this.realizedPnl = realizedPnl;
        this.unrealizedPnl = unrealizedPnl;
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.pieDistribution;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Pnl getPnl() {
        return this.pnl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMarginUtilised() {
        return this.marginUtilised;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getMarginAvailable() {
        return this.marginAvailable;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTotalTransactionCharges() {
        return this.totalTransactionCharges;
    }

    @NotNull
    public final List<PeriodicPnl> component7() {
        return this.periodicPnl;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getPendingOrderAmount() {
        return this.pendingOrderAmount;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    @NotNull
    public final Value copy(@NotNull Map<String, String> pieDistribution, @NotNull Pnl pnl, @NotNull String marginUtilised, @NotNull String portfolioValue, @NotNull String marginAvailable, @NotNull String totalTransactionCharges, @NotNull List<PeriodicPnl> periodicPnl, @NotNull String pendingOrderAmount, @NotNull String realizedPnl, @NotNull String unrealizedPnl) {
        Intrinsics.checkNotNullParameter(pieDistribution, "pieDistribution");
        Intrinsics.checkNotNullParameter(pnl, "pnl");
        Intrinsics.checkNotNullParameter(marginUtilised, "marginUtilised");
        Intrinsics.checkNotNullParameter(portfolioValue, "portfolioValue");
        Intrinsics.checkNotNullParameter(marginAvailable, "marginAvailable");
        Intrinsics.checkNotNullParameter(totalTransactionCharges, "totalTransactionCharges");
        Intrinsics.checkNotNullParameter(periodicPnl, "periodicPnl");
        Intrinsics.checkNotNullParameter(pendingOrderAmount, "pendingOrderAmount");
        Intrinsics.checkNotNullParameter(realizedPnl, "realizedPnl");
        Intrinsics.checkNotNullParameter(unrealizedPnl, "unrealizedPnl");
        return new Value(pieDistribution, pnl, marginUtilised, portfolioValue, marginAvailable, totalTransactionCharges, periodicPnl, pendingOrderAmount, realizedPnl, unrealizedPnl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Value)) {
            return false;
        }
        Value value = (Value) other;
        return Intrinsics.a(this.pieDistribution, value.pieDistribution) && Intrinsics.a(this.pnl, value.pnl) && Intrinsics.a(this.marginUtilised, value.marginUtilised) && Intrinsics.a(this.portfolioValue, value.portfolioValue) && Intrinsics.a(this.marginAvailable, value.marginAvailable) && Intrinsics.a(this.totalTransactionCharges, value.totalTransactionCharges) && Intrinsics.a(this.periodicPnl, value.periodicPnl) && Intrinsics.a(this.pendingOrderAmount, value.pendingOrderAmount) && Intrinsics.a(this.realizedPnl, value.realizedPnl) && Intrinsics.a(this.unrealizedPnl, value.unrealizedPnl);
    }

    @NotNull
    public final String getMarginAvailable() {
        return this.marginAvailable;
    }

    @NotNull
    public final String getMarginUtilised() {
        return this.marginUtilised;
    }

    @NotNull
    public final String getPendingOrderAmount() {
        return this.pendingOrderAmount;
    }

    @NotNull
    public final List<PeriodicPnl> getPeriodicPnl() {
        return this.periodicPnl;
    }

    @NotNull
    public final Map<String, String> getPieDistribution() {
        return this.pieDistribution;
    }

    @NotNull
    public final Pnl getPnl() {
        return this.pnl;
    }

    @NotNull
    public final String getPortfolioValue() {
        return this.portfolioValue;
    }

    @NotNull
    public final String getRealizedPnl() {
        return this.realizedPnl;
    }

    @NotNull
    public final String getTotalTransactionCharges() {
        return this.totalTransactionCharges;
    }

    @NotNull
    public final String getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    public int hashCode() {
        return this.unrealizedPnl.hashCode() + h.g(this.realizedPnl, h.g(this.pendingOrderAmount, d.e(this.periodicPnl, h.g(this.totalTransactionCharges, h.g(this.marginAvailable, h.g(this.portfolioValue, h.g(this.marginUtilised, (this.pnl.hashCode() + (this.pieDistribution.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        Map<String, String> map = this.pieDistribution;
        Pnl pnl = this.pnl;
        String str = this.marginUtilised;
        String str2 = this.portfolioValue;
        String str3 = this.marginAvailable;
        String str4 = this.totalTransactionCharges;
        List<PeriodicPnl> list = this.periodicPnl;
        String str5 = this.pendingOrderAmount;
        String str6 = this.realizedPnl;
        String str7 = this.unrealizedPnl;
        StringBuilder sb2 = new StringBuilder("Value(pieDistribution=");
        sb2.append(map);
        sb2.append(", pnl=");
        sb2.append(pnl);
        sb2.append(", marginUtilised=");
        e.v(sb2, str, ", portfolioValue=", str2, ", marginAvailable=");
        e.v(sb2, str3, ", totalTransactionCharges=", str4, ", periodicPnl=");
        sb2.append(list);
        sb2.append(", pendingOrderAmount=");
        sb2.append(str5);
        sb2.append(", realizedPnl=");
        return a.k(sb2, str6, ", unrealizedPnl=", str7, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Map<String, String> map = this.pieDistribution;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        this.pnl.writeToParcel(parcel, flags);
        parcel.writeString(this.marginUtilised);
        parcel.writeString(this.portfolioValue);
        parcel.writeString(this.marginAvailable);
        parcel.writeString(this.totalTransactionCharges);
        Iterator p10 = a.p(this.periodicPnl, parcel);
        while (p10.hasNext()) {
            ((PeriodicPnl) p10.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.pendingOrderAmount);
        parcel.writeString(this.realizedPnl);
        parcel.writeString(this.unrealizedPnl);
    }

    public Value(Map map, Pnl pnl, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, pnl, str, str2, str3, str4, (i10 & 64) != 0 ? i0.f38321a : list, str5, str6, str7);
    }
}
