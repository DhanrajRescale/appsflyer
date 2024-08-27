package com.assetgro.stockgro.ui.portfolio.history.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/history/model/PortfolioFnoHistoryData;", HttpUrl.FRAGMENT_ENCODE_SET, "data", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/portfolio/history/model/PortfolioHistoryFnoDataItem;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioFnoHistoryData {
    public static final int $stable = 8;

    @SerializedName("data")
    @NotNull
    private final List<PortfolioHistoryFnoDataItem> data;

    public PortfolioFnoHistoryData(@NotNull List<PortfolioHistoryFnoDataItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortfolioFnoHistoryData copy$default(PortfolioFnoHistoryData portfolioFnoHistoryData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = portfolioFnoHistoryData.data;
        }
        return portfolioFnoHistoryData.copy(list);
    }

    @NotNull
    public final List<PortfolioHistoryFnoDataItem> component1() {
        return this.data;
    }

    @NotNull
    public final PortfolioFnoHistoryData copy(@NotNull List<PortfolioHistoryFnoDataItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new PortfolioFnoHistoryData(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PortfolioFnoHistoryData) && Intrinsics.a(this.data, ((PortfolioFnoHistoryData) other).data);
    }

    @NotNull
    public final List<PortfolioHistoryFnoDataItem> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("PortfolioFnoHistoryData(data=", this.data, ")");
    }
}
