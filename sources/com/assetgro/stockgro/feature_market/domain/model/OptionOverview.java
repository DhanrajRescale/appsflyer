package com.assetgro.stockgro.feature_market.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\tHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\u0006\u0010+\u001a\u00020\rJ\u0006\u0010,\u001a\u00020\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionOverview;", "Landroid/os/Parcelable;", "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "type", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "identifierInfo", "Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;", "expiries", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "selectedExpiry", "strikes", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionContract;", "optionType", HttpUrl.FRAGMENT_ENCODE_SET, "(ILcom/assetgro/stockgro/feature_market/domain/model/OptionType;Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;Ljava/util/List;JLjava/util/List;Ljava/lang/String;)V", "getExpiries", "()Ljava/util/List;", "getIdentifierInfo", "()Lcom/assetgro/stockgro/feature_market/domain/model/FnoOption;", "getLotSize", "()I", "getOptionType", "()Ljava/lang/String;", "getSelectedExpiry", "()J", "getStrikes", "getType", "()Lcom/assetgro/stockgro/feature_market/domain/model/OptionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getDefaultStrike", "getDefaultStrikeIndex", "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionOverview implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OptionOverview> CREATOR = new Creator();

    @NotNull
    private final List<Long> expiries;

    @NotNull
    private final FnoOption identifierInfo;
    private final int lotSize;

    @NotNull
    private final String optionType;
    private final long selectedExpiry;

    @NotNull
    private final List<OptionContract> strikes;

    @NotNull
    private final OptionType type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionOverview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionOverview createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            OptionType valueOf = OptionType.valueOf(parcel.readString());
            FnoOption createFromParcel = FnoOption.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i10 = 0;
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            long readLong = parcel.readLong();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (i10 != readInt3) {
                i10 = h.e(OptionContract.CREATOR, parcel, arrayList2, i10, 1);
            }
            return new OptionOverview(readInt, valueOf, createFromParcel, arrayList, readLong, arrayList2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionOverview[] newArray(int i10) {
            return new OptionOverview[i10];
        }
    }

    public OptionOverview(int i10, @NotNull OptionType type, @NotNull FnoOption identifierInfo, @NotNull List<Long> expiries, long j10, @NotNull List<OptionContract> strikes, @NotNull String optionType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(expiries, "expiries");
        Intrinsics.checkNotNullParameter(strikes, "strikes");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.lotSize = i10;
        this.type = type;
        this.identifierInfo = identifierInfo;
        this.expiries = expiries;
        this.selectedExpiry = j10;
        this.strikes = strikes;
        this.optionType = optionType;
    }

    /* renamed from: component1, reason: from getter */
    public final int getLotSize() {
        return this.lotSize;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OptionType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FnoOption getIdentifierInfo() {
        return this.identifierInfo;
    }

    @NotNull
    public final List<Long> component4() {
        return this.expiries;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSelectedExpiry() {
        return this.selectedExpiry;
    }

    @NotNull
    public final List<OptionContract> component6() {
        return this.strikes;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    @NotNull
    public final OptionOverview copy(int lotSize, @NotNull OptionType type, @NotNull FnoOption identifierInfo, @NotNull List<Long> expiries, long selectedExpiry, @NotNull List<OptionContract> strikes, @NotNull String optionType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(expiries, "expiries");
        Intrinsics.checkNotNullParameter(strikes, "strikes");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        return new OptionOverview(lotSize, type, identifierInfo, expiries, selectedExpiry, strikes, optionType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOverview)) {
            return false;
        }
        OptionOverview optionOverview = (OptionOverview) other;
        return this.lotSize == optionOverview.lotSize && this.type == optionOverview.type && Intrinsics.a(this.identifierInfo, optionOverview.identifierInfo) && Intrinsics.a(this.expiries, optionOverview.expiries) && this.selectedExpiry == optionOverview.selectedExpiry && Intrinsics.a(this.strikes, optionOverview.strikes) && Intrinsics.a(this.optionType, optionOverview.optionType);
    }

    @NotNull
    public final OptionContract getDefaultStrike() {
        for (OptionContract optionContract : this.strikes) {
            if (optionContract.getMarker()) {
                return optionContract;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int getDefaultStrikeIndex() {
        Iterator<OptionContract> it = this.strikes.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!it.next().getMarker()) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @NotNull
    public final List<Long> getExpiries() {
        return this.expiries;
    }

    @NotNull
    public final FnoOption getIdentifierInfo() {
        return this.identifierInfo;
    }

    public final int getLotSize() {
        return this.lotSize;
    }

    @NotNull
    public final String getOptionType() {
        return this.optionType;
    }

    public final long getSelectedExpiry() {
        return this.selectedExpiry;
    }

    @NotNull
    public final List<OptionContract> getStrikes() {
        return this.strikes;
    }

    @NotNull
    public final OptionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.optionType.hashCode() + d.e(this.strikes, e.c(this.selectedExpiry, d.e(this.expiries, (this.identifierInfo.hashCode() + ((this.type.hashCode() + (Integer.hashCode(this.lotSize) * 31)) * 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.lotSize;
        OptionType optionType = this.type;
        FnoOption fnoOption = this.identifierInfo;
        List<Long> list = this.expiries;
        long j10 = this.selectedExpiry;
        List<OptionContract> list2 = this.strikes;
        String str = this.optionType;
        StringBuilder sb2 = new StringBuilder("OptionOverview(lotSize=");
        sb2.append(i10);
        sb2.append(", type=");
        sb2.append(optionType);
        sb2.append(", identifierInfo=");
        sb2.append(fnoOption);
        sb2.append(", expiries=");
        sb2.append(list);
        sb2.append(", selectedExpiry=");
        sb2.append(j10);
        sb2.append(", strikes=");
        sb2.append(list2);
        return e.j(sb2, ", optionType=", str, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.lotSize);
        parcel.writeString(this.type.name());
        this.identifierInfo.writeToParcel(parcel, flags);
        Iterator p10 = a.p(this.expiries, parcel);
        while (p10.hasNext()) {
            parcel.writeLong(((Number) p10.next()).longValue());
        }
        parcel.writeLong(this.selectedExpiry);
        Iterator p11 = a.p(this.strikes, parcel);
        while (p11.hasNext()) {
            ((OptionContract) p11.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.optionType);
    }
}
