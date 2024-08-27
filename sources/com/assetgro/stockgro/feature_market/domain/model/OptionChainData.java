package com.assetgro.stockgro.feature_market.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionChainData;", "Landroid/os/Parcelable;", "header", HttpUrl.FRAGMENT_ENCODE_SET, "contracts", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/domain/model/OptionContract;", "(Ljava/lang/String;Ljava/util/List;)V", "getContracts", "()Ljava/util/List;", "getHeader", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionChainData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OptionChainData> CREATOR = new Creator();

    @NotNull
    private final List<OptionContract> contracts;

    @NotNull
    private final String header;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionChainData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionChainData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(OptionContract.CREATOR, parcel, arrayList, i10, 1);
            }
            return new OptionChainData(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionChainData[] newArray(int i10) {
            return new OptionChainData[i10];
        }
    }

    public OptionChainData(@NotNull String header, @NotNull List<OptionContract> contracts) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(contracts, "contracts");
        this.header = header;
        this.contracts = contracts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionChainData copy$default(OptionChainData optionChainData, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = optionChainData.header;
        }
        if ((i10 & 2) != 0) {
            list = optionChainData.contracts;
        }
        return optionChainData.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    public final List<OptionContract> component2() {
        return this.contracts;
    }

    @NotNull
    public final OptionChainData copy(@NotNull String header, @NotNull List<OptionContract> contracts) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(contracts, "contracts");
        return new OptionChainData(header, contracts);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainData)) {
            return false;
        }
        OptionChainData optionChainData = (OptionChainData) other;
        return Intrinsics.a(this.header, optionChainData.header) && Intrinsics.a(this.contracts, optionChainData.contracts);
    }

    @NotNull
    public final List<OptionContract> getContracts() {
        return this.contracts;
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    public int hashCode() {
        return this.contracts.hashCode() + (this.header.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OptionChainData(header=" + this.header + ", contracts=" + this.contracts + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.header);
        Iterator p10 = a.p(this.contracts, parcel);
        while (p10.hasNext()) {
            ((OptionContract) p10.next()).writeToParcel(parcel, flags);
        }
    }
}
