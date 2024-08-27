package com.assetgro.stockgro.data.remote.response;

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
import v.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006'"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/UnlockPortfolioData;", "Landroid/os/Parcelable;", "portfolioName", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioType", "portfolioValueLimit", HttpUrl.FRAGMENT_ENCODE_SET, "transactionFeeType", "expiry_options", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/remote/response/ExpiryOption;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getExpiry_options", "()Ljava/util/List;", "getPortfolioName", "()Ljava/lang/String;", "getPortfolioType", "getPortfolioValueLimit", "()J", "getTransactionFeeType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnlockPortfolioData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UnlockPortfolioData> CREATOR = new Creator();

    @SerializedName("expiry_options")
    @NotNull
    private final List<ExpiryOption> expiry_options;

    @SerializedName("portfolio_name")
    @NotNull
    private final String portfolioName;

    @SerializedName("portfolio_type")
    @NotNull
    private final String portfolioType;

    @SerializedName("portfolio_value_limit")
    private final long portfolioValueLimit;

    @SerializedName("transaction_fee_type")
    @NotNull
    private final String transactionFeeType;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UnlockPortfolioData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnlockPortfolioData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(ExpiryOption.CREATOR, parcel, arrayList, i10, 1);
            }
            return new UnlockPortfolioData(readString, readString2, readLong, readString3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UnlockPortfolioData[] newArray(int i10) {
            return new UnlockPortfolioData[i10];
        }
    }

    public UnlockPortfolioData(@NotNull String portfolioName, @NotNull String portfolioType, long j10, @NotNull String transactionFeeType, @NotNull List<ExpiryOption> expiry_options) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
        Intrinsics.checkNotNullParameter(transactionFeeType, "transactionFeeType");
        Intrinsics.checkNotNullParameter(expiry_options, "expiry_options");
        this.portfolioName = portfolioName;
        this.portfolioType = portfolioType;
        this.portfolioValueLimit = j10;
        this.transactionFeeType = transactionFeeType;
        this.expiry_options = expiry_options;
    }

    public static /* synthetic */ UnlockPortfolioData copy$default(UnlockPortfolioData unlockPortfolioData, String str, String str2, long j10, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unlockPortfolioData.portfolioName;
        }
        if ((i10 & 2) != 0) {
            str2 = unlockPortfolioData.portfolioType;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            j10 = unlockPortfolioData.portfolioValueLimit;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            str3 = unlockPortfolioData.transactionFeeType;
        }
        String str5 = str3;
        if ((i10 & 16) != 0) {
            list = unlockPortfolioData.expiry_options;
        }
        return unlockPortfolioData.copy(str, str4, j11, str5, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPortfolioType() {
        return this.portfolioType;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPortfolioValueLimit() {
        return this.portfolioValueLimit;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTransactionFeeType() {
        return this.transactionFeeType;
    }

    @NotNull
    public final List<ExpiryOption> component5() {
        return this.expiry_options;
    }

    @NotNull
    public final UnlockPortfolioData copy(@NotNull String portfolioName, @NotNull String portfolioType, long portfolioValueLimit, @NotNull String transactionFeeType, @NotNull List<ExpiryOption> expiry_options) {
        Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
        Intrinsics.checkNotNullParameter(portfolioType, "portfolioType");
        Intrinsics.checkNotNullParameter(transactionFeeType, "transactionFeeType");
        Intrinsics.checkNotNullParameter(expiry_options, "expiry_options");
        return new UnlockPortfolioData(portfolioName, portfolioType, portfolioValueLimit, transactionFeeType, expiry_options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnlockPortfolioData)) {
            return false;
        }
        UnlockPortfolioData unlockPortfolioData = (UnlockPortfolioData) other;
        return Intrinsics.a(this.portfolioName, unlockPortfolioData.portfolioName) && Intrinsics.a(this.portfolioType, unlockPortfolioData.portfolioType) && this.portfolioValueLimit == unlockPortfolioData.portfolioValueLimit && Intrinsics.a(this.transactionFeeType, unlockPortfolioData.transactionFeeType) && Intrinsics.a(this.expiry_options, unlockPortfolioData.expiry_options);
    }

    @NotNull
    public final List<ExpiryOption> getExpiry_options() {
        return this.expiry_options;
    }

    @NotNull
    public final String getPortfolioName() {
        return this.portfolioName;
    }

    @NotNull
    public final String getPortfolioType() {
        return this.portfolioType;
    }

    public final long getPortfolioValueLimit() {
        return this.portfolioValueLimit;
    }

    @NotNull
    public final String getTransactionFeeType() {
        return this.transactionFeeType;
    }

    public int hashCode() {
        return this.expiry_options.hashCode() + h.g(this.transactionFeeType, e.c(this.portfolioValueLimit, h.g(this.portfolioType, this.portfolioName.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.portfolioName;
        String str2 = this.portfolioType;
        long j10 = this.portfolioValueLimit;
        String str3 = this.transactionFeeType;
        List<ExpiryOption> list = this.expiry_options;
        StringBuilder l10 = e.l("UnlockPortfolioData(portfolioName=", str, ", portfolioType=", str2, ", portfolioValueLimit=");
        l10.append(j10);
        l10.append(", transactionFeeType=");
        l10.append(str3);
        l10.append(", expiry_options=");
        l10.append(list);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.portfolioName);
        parcel.writeString(this.portfolioType);
        parcel.writeLong(this.portfolioValueLimit);
        parcel.writeString(this.transactionFeeType);
        Iterator p10 = a.p(this.expiry_options, parcel);
        while (p10.hasNext()) {
            ((ExpiryOption) p10.next()).writeToParcel(parcel, flags);
        }
    }
}
