package com.assetgro.stockgro.feature_market.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionChain;", "Landroid/os/Parcelable;", "callOptionData", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionChainData;", "putOptionData", "identifierInfo", "Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;", "(Lcom/assetgro/stockgro/feature_market/domain/model/OptionChainData;Lcom/assetgro/stockgro/feature_market/domain/model/OptionChainData;Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;)V", "getCallOptionData", "()Lcom/assetgro/stockgro/feature_market/domain/model/OptionChainData;", "getIdentifierInfo", "()Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;", "getPutOptionData", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionChain implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OptionChain> CREATOR = new Creator();

    @NotNull
    private final OptionChainData callOptionData;

    @NotNull
    private final FnoOption identifierInfo;

    @NotNull
    private final OptionChainData putOptionData;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionChain> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionChain createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<OptionChainData> creator = OptionChainData.CREATOR;
            return new OptionChain(creator.createFromParcel(parcel), creator.createFromParcel(parcel), FnoOption.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionChain[] newArray(int i10) {
            return new OptionChain[i10];
        }
    }

    public OptionChain(@NotNull OptionChainData callOptionData, @NotNull OptionChainData putOptionData, @NotNull FnoOption identifierInfo) {
        Intrinsics.checkNotNullParameter(callOptionData, "callOptionData");
        Intrinsics.checkNotNullParameter(putOptionData, "putOptionData");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        this.callOptionData = callOptionData;
        this.putOptionData = putOptionData;
        this.identifierInfo = identifierInfo;
    }

    public static /* synthetic */ OptionChain copy$default(OptionChain optionChain, OptionChainData optionChainData, OptionChainData optionChainData2, FnoOption fnoOption, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            optionChainData = optionChain.callOptionData;
        }
        if ((i10 & 2) != 0) {
            optionChainData2 = optionChain.putOptionData;
        }
        if ((i10 & 4) != 0) {
            fnoOption = optionChain.identifierInfo;
        }
        return optionChain.copy(optionChainData, optionChainData2, fnoOption);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OptionChainData getCallOptionData() {
        return this.callOptionData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OptionChainData getPutOptionData() {
        return this.putOptionData;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FnoOption getIdentifierInfo() {
        return this.identifierInfo;
    }

    @NotNull
    public final OptionChain copy(@NotNull OptionChainData callOptionData, @NotNull OptionChainData putOptionData, @NotNull FnoOption identifierInfo) {
        Intrinsics.checkNotNullParameter(callOptionData, "callOptionData");
        Intrinsics.checkNotNullParameter(putOptionData, "putOptionData");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        return new OptionChain(callOptionData, putOptionData, identifierInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChain)) {
            return false;
        }
        OptionChain optionChain = (OptionChain) other;
        return Intrinsics.a(this.callOptionData, optionChain.callOptionData) && Intrinsics.a(this.putOptionData, optionChain.putOptionData) && Intrinsics.a(this.identifierInfo, optionChain.identifierInfo);
    }

    @NotNull
    public final OptionChainData getCallOptionData() {
        return this.callOptionData;
    }

    @NotNull
    public final FnoOption getIdentifierInfo() {
        return this.identifierInfo;
    }

    @NotNull
    public final OptionChainData getPutOptionData() {
        return this.putOptionData;
    }

    public int hashCode() {
        return this.identifierInfo.hashCode() + ((this.putOptionData.hashCode() + (this.callOptionData.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "OptionChain(callOptionData=" + this.callOptionData + ", putOptionData=" + this.putOptionData + ", identifierInfo=" + this.identifierInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.callOptionData.writeToParcel(parcel, flags);
        this.putOptionData.writeToParcel(parcel, flags);
        this.identifierInfo.writeToParcel(parcel, flags);
    }
}
