package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.i0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/FnoPortfolioHolding;", "Landroid/os/Parcelable;", "status", HttpUrl.FRAGMENT_ENCODE_SET, "assetClass", "isModel", HttpUrl.FRAGMENT_ENCODE_SET, "optionValues", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/OptionValue;", "portfolioId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lcom/assetgro/stockgro/feature_market/data/remote/Value;", AppMeasurementSdk.ConditionalUserProperty.NAME, "isEmpty", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/Value;Ljava/lang/String;Z)V", "getAssetClass", "()Ljava/lang/String;", "()Z", "getName", "getOptionValues", "()Ljava/util/List;", "getPortfolioId", "getStatus", "getValue", "()Lcom/assetgro/stockgro/feature_market/data/remote/Value;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FnoPortfolioHolding implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FnoPortfolioHolding> CREATOR = new Creator();

    @SerializedName("asset_class")
    @NotNull
    private final String assetClass;

    @SerializedName("is_empty")
    private final boolean isEmpty;

    @SerializedName("is_model")
    private final boolean isModel;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("option_values")
    @NotNull
    private final List<OptionValue> optionValues;

    @SerializedName("portfolio_id")
    @NotNull
    private final String portfolioId;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    @NotNull
    private final Value value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FnoPortfolioHolding> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FnoPortfolioHolding createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(OptionValue.CREATOR, parcel, arrayList, i10, 1);
            }
            return new FnoPortfolioHolding(readString, readString2, z10, arrayList, parcel.readString(), Value.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FnoPortfolioHolding[] newArray(int i10) {
            return new FnoPortfolioHolding[i10];
        }
    }

    public FnoPortfolioHolding(@NotNull String status, @NotNull String assetClass, boolean z10, @NotNull List<OptionValue> optionValues, @NotNull String portfolioId, @NotNull Value value, @NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(optionValues, "optionValues");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        this.status = status;
        this.assetClass = assetClass;
        this.isModel = z10;
        this.optionValues = optionValues;
        this.portfolioId = portfolioId;
        this.value = value;
        this.name = name;
        this.isEmpty = z11;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsModel() {
        return this.isModel;
    }

    @NotNull
    public final List<OptionValue> component4() {
        return this.optionValues;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    @NotNull
    public final FnoPortfolioHolding copy(@NotNull String status, @NotNull String assetClass, boolean isModel, @NotNull List<OptionValue> optionValues, @NotNull String portfolioId, @NotNull Value value, @NotNull String name, boolean isEmpty) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(optionValues, "optionValues");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        return new FnoPortfolioHolding(status, assetClass, isModel, optionValues, portfolioId, value, name, isEmpty);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FnoPortfolioHolding)) {
            return false;
        }
        FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) other;
        return Intrinsics.a(this.status, fnoPortfolioHolding.status) && Intrinsics.a(this.assetClass, fnoPortfolioHolding.assetClass) && this.isModel == fnoPortfolioHolding.isModel && Intrinsics.a(this.optionValues, fnoPortfolioHolding.optionValues) && Intrinsics.a(this.portfolioId, fnoPortfolioHolding.portfolioId) && Intrinsics.a(this.value, fnoPortfolioHolding.value) && Intrinsics.a(this.name, fnoPortfolioHolding.name) && this.isEmpty == fnoPortfolioHolding.isEmpty;
    }

    @NotNull
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<OptionValue> getOptionValues() {
        return this.optionValues;
    }

    @NotNull
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEmpty) + h.g(this.name, (this.value.hashCode() + h.g(this.portfolioId, d.e(this.optionValues, e.d(this.isModel, h.g(this.assetClass, this.status.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public final boolean isModel() {
        return this.isModel;
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.assetClass;
        boolean z10 = this.isModel;
        List<OptionValue> list = this.optionValues;
        String str3 = this.portfolioId;
        Value value = this.value;
        String str4 = this.name;
        boolean z11 = this.isEmpty;
        StringBuilder l10 = e.l("FnoPortfolioHolding(status=", str, ", assetClass=", str2, ", isModel=");
        l10.append(z10);
        l10.append(", optionValues=");
        l10.append(list);
        l10.append(", portfolioId=");
        l10.append(str3);
        l10.append(", value=");
        l10.append(value);
        l10.append(", name=");
        l10.append(str4);
        l10.append(", isEmpty=");
        l10.append(z11);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.status);
        parcel.writeString(this.assetClass);
        parcel.writeInt(this.isModel ? 1 : 0);
        Iterator p10 = a.p(this.optionValues, parcel);
        while (p10.hasNext()) {
            ((OptionValue) p10.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.portfolioId);
        this.value.writeToParcel(parcel, flags);
        parcel.writeString(this.name);
        parcel.writeInt(this.isEmpty ? 1 : 0);
    }

    public FnoPortfolioHolding(String str, String str2, boolean z10, List list, String str3, Value value, String str4, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, (i10 & 8) != 0 ? i0.f38321a : list, str3, value, str4, z11);
    }
}
