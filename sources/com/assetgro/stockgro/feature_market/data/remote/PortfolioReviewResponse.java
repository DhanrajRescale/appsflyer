package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/PortfolioReviewResponse;", "Landroid/os/Parcelable;", "portfolios", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/FnoPortfolio;", "(Ljava/util/List;)V", "getPortfolios", "()Ljava/util/List;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PortfolioReviewResponse implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PortfolioReviewResponse> CREATOR = new Creator();

    @SerializedName("portfolios")
    @NotNull
    private final List<FnoPortfolio> portfolios;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PortfolioReviewResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PortfolioReviewResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(FnoPortfolio.CREATOR, parcel, arrayList, i10, 1);
            }
            return new PortfolioReviewResponse(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PortfolioReviewResponse[] newArray(int i10) {
            return new PortfolioReviewResponse[i10];
        }
    }

    public PortfolioReviewResponse(@NotNull List<FnoPortfolio> portfolios) {
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        this.portfolios = portfolios;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortfolioReviewResponse copy$default(PortfolioReviewResponse portfolioReviewResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = portfolioReviewResponse.portfolios;
        }
        return portfolioReviewResponse.copy(list);
    }

    @NotNull
    public final List<FnoPortfolio> component1() {
        return this.portfolios;
    }

    @NotNull
    public final PortfolioReviewResponse copy(@NotNull List<FnoPortfolio> portfolios) {
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        return new PortfolioReviewResponse(portfolios);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PortfolioReviewResponse) && Intrinsics.a(this.portfolios, ((PortfolioReviewResponse) other).portfolios);
    }

    @NotNull
    public final List<FnoPortfolio> getPortfolios() {
        return this.portfolios;
    }

    public int hashCode() {
        return this.portfolios.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("PortfolioReviewResponse(portfolios=", this.portfolios, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator p10 = a.p(this.portfolios, parcel);
        while (p10.hasNext()) {
            ((FnoPortfolio) p10.next()).writeToParcel(parcel, flags);
        }
    }
}
