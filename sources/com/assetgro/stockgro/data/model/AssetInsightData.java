package com.assetgro.stockgro.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/data/model/AssetInsightData;", HttpUrl.FRAGMENT_ENCODE_SET, "assetType", HttpUrl.FRAGMENT_ENCODE_SET, "insightList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/StockDto;", "type", "Lcom/assetgro/stockgro/data/model/InsightListType;", "(Ljava/lang/String;Ljava/util/List;Lcom/assetgro/stockgro/data/model/InsightListType;)V", "getAssetType", "()Ljava/lang/String;", "getInsightList", "()Ljava/util/List;", "getType", "()Lcom/assetgro/stockgro/data/model/InsightListType;", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AssetInsightData {
    public static final int $stable = 8;

    @NotNull
    private final String assetType;

    @NotNull
    private final List<StockDto> insightList;

    @NotNull
    private final InsightListType type;

    public AssetInsightData(@NotNull String assetType, @NotNull List<StockDto> insightList, @NotNull InsightListType type) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(insightList, "insightList");
        Intrinsics.checkNotNullParameter(type, "type");
        this.assetType = assetType;
        this.insightList = insightList;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetInsightData copy$default(AssetInsightData assetInsightData, String str, List list, InsightListType insightListType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = assetInsightData.assetType;
        }
        if ((i10 & 2) != 0) {
            list = assetInsightData.insightList;
        }
        if ((i10 & 4) != 0) {
            insightListType = assetInsightData.type;
        }
        return assetInsightData.copy(str, list, insightListType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    @NotNull
    public final List<StockDto> component2() {
        return this.insightList;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InsightListType getType() {
        return this.type;
    }

    @NotNull
    public final AssetInsightData copy(@NotNull String assetType, @NotNull List<StockDto> insightList, @NotNull InsightListType type) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(insightList, "insightList");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AssetInsightData(assetType, insightList, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetInsightData)) {
            return false;
        }
        AssetInsightData assetInsightData = (AssetInsightData) other;
        return Intrinsics.a(this.assetType, assetInsightData.assetType) && Intrinsics.a(this.insightList, assetInsightData.insightList) && this.type == assetInsightData.type;
    }

    @NotNull
    public final String getAssetType() {
        return this.assetType;
    }

    @NotNull
    public final List<StockDto> getInsightList() {
        return this.insightList;
    }

    @NotNull
    public final InsightListType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + d.e(this.insightList, this.assetType.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "AssetInsightData(assetType=" + this.assetType + ", insightList=" + this.insightList + ", type=" + this.type + ")";
    }
}
