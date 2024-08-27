package com.assetgro.stockgro.data.remote.response;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/UnlockPortfolioResponse;", "Landroid/os/Parcelable;", "portfolioData", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/remote/response/UnlockPortfolioData;", "walletData", "Lcom/assetgro/stockgro/data/model/portfolio/WalletBalanceResponseDto;", "(Ljava/util/List;Lcom/assetgro/stockgro/data/model/portfolio/WalletBalanceResponseDto;)V", "getPortfolioData", "()Ljava/util/List;", "getWalletData", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletBalanceResponseDto;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnlockPortfolioResponse implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UnlockPortfolioResponse> CREATOR = new Creator();

    @SerializedName("portfolio_data")
    @NotNull
    private final List<UnlockPortfolioData> portfolioData;

    @SerializedName("wallet_data")
    @NotNull
    private final WalletBalanceResponseDto walletData;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UnlockPortfolioResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnlockPortfolioResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(UnlockPortfolioData.CREATOR, parcel, arrayList, i10, 1);
            }
            return new UnlockPortfolioResponse(arrayList, WalletBalanceResponseDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnlockPortfolioResponse[] newArray(int i10) {
            return new UnlockPortfolioResponse[i10];
        }
    }

    public UnlockPortfolioResponse(@NotNull List<UnlockPortfolioData> portfolioData, @NotNull WalletBalanceResponseDto walletData) {
        Intrinsics.checkNotNullParameter(portfolioData, "portfolioData");
        Intrinsics.checkNotNullParameter(walletData, "walletData");
        this.portfolioData = portfolioData;
        this.walletData = walletData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnlockPortfolioResponse copy$default(UnlockPortfolioResponse unlockPortfolioResponse, List list, WalletBalanceResponseDto walletBalanceResponseDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = unlockPortfolioResponse.portfolioData;
        }
        if ((i10 & 2) != 0) {
            walletBalanceResponseDto = unlockPortfolioResponse.walletData;
        }
        return unlockPortfolioResponse.copy(list, walletBalanceResponseDto);
    }

    @NotNull
    public final List<UnlockPortfolioData> component1() {
        return this.portfolioData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WalletBalanceResponseDto getWalletData() {
        return this.walletData;
    }

    @NotNull
    public final UnlockPortfolioResponse copy(@NotNull List<UnlockPortfolioData> portfolioData, @NotNull WalletBalanceResponseDto walletData) {
        Intrinsics.checkNotNullParameter(portfolioData, "portfolioData");
        Intrinsics.checkNotNullParameter(walletData, "walletData");
        return new UnlockPortfolioResponse(portfolioData, walletData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnlockPortfolioResponse)) {
            return false;
        }
        UnlockPortfolioResponse unlockPortfolioResponse = (UnlockPortfolioResponse) other;
        return Intrinsics.a(this.portfolioData, unlockPortfolioResponse.portfolioData) && Intrinsics.a(this.walletData, unlockPortfolioResponse.walletData);
    }

    @NotNull
    public final List<UnlockPortfolioData> getPortfolioData() {
        return this.portfolioData;
    }

    @NotNull
    public final WalletBalanceResponseDto getWalletData() {
        return this.walletData;
    }

    public int hashCode() {
        return this.walletData.hashCode() + (this.portfolioData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UnlockPortfolioResponse(portfolioData=" + this.portfolioData + ", walletData=" + this.walletData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator p10 = a.p(this.portfolioData, parcel);
        while (p10.hasNext()) {
            ((UnlockPortfolioData) p10.next()).writeToParcel(parcel, flags);
        }
        this.walletData.writeToParcel(parcel, flags);
    }
}
