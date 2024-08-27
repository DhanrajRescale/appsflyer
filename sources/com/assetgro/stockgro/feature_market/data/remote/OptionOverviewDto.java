package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.domain.model.OptionType;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.i0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0006\u0010*\u001a\u00020+J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionOverviewDto;", "Landroid/os/Parcelable;", "lotSize", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "identifierInfo", "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "expiries", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "selectedExpiry", "strikes", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionContractDto;", "optionType", "(ILjava/lang/String;Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;Ljava/util/List;JLjava/util/List;Ljava/lang/String;)V", "getExpiries", "()Ljava/util/List;", "getIdentifierInfo", "()Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "getLotSize", "()I", "getOptionType", "()Ljava/lang/String;", "getSelectedExpiry", "()J", "getStrikes", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toOptionOverview", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionOverview;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionOverviewDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OptionOverviewDto> CREATOR = new Creator();

    @SerializedName("expiries")
    @NotNull
    private final List<Long> expiries;

    @SerializedName("identifier_info")
    @NotNull
    private final FnoOptionDto identifierInfo;

    @SerializedName("lot_size")
    private final int lotSize;

    @SerializedName("option_type")
    @NotNull
    private final String optionType;

    @SerializedName("selected_expiry")
    private final long selectedExpiry;

    @SerializedName("strikes")
    private final List<OptionContractDto> strikes;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionOverviewDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionOverviewDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            FnoOptionDto createFromParcel = FnoOptionDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i10 = 0;
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            long readLong = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                while (i10 != readInt3) {
                    i10 = h.e(OptionContractDto.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            return new OptionOverviewDto(readInt, readString, createFromParcel, arrayList2, readLong, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionOverviewDto[] newArray(int i10) {
            return new OptionOverviewDto[i10];
        }
    }

    public OptionOverviewDto(int i10, @NotNull String type, @NotNull FnoOptionDto identifierInfo, @NotNull List<Long> expiries, long j10, List<OptionContractDto> list, @NotNull String optionType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(expiries, "expiries");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.lotSize = i10;
        this.type = type;
        this.identifierInfo = identifierInfo;
        this.expiries = expiries;
        this.selectedExpiry = j10;
        this.strikes = list;
        this.optionType = optionType;
    }

    /* renamed from: component1, reason: from getter */
    public final int getLotSize() {
        return this.lotSize;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FnoOptionDto getIdentifierInfo() {
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

    public final List<OptionContractDto> component6() {
        return this.strikes;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    @NotNull
    public final OptionOverviewDto copy(int lotSize, @NotNull String type, @NotNull FnoOptionDto identifierInfo, @NotNull List<Long> expiries, long selectedExpiry, List<OptionContractDto> strikes, @NotNull String optionType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(expiries, "expiries");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        return new OptionOverviewDto(lotSize, type, identifierInfo, expiries, selectedExpiry, strikes, optionType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOverviewDto)) {
            return false;
        }
        OptionOverviewDto optionOverviewDto = (OptionOverviewDto) other;
        return this.lotSize == optionOverviewDto.lotSize && Intrinsics.a(this.type, optionOverviewDto.type) && Intrinsics.a(this.identifierInfo, optionOverviewDto.identifierInfo) && Intrinsics.a(this.expiries, optionOverviewDto.expiries) && this.selectedExpiry == optionOverviewDto.selectedExpiry && Intrinsics.a(this.strikes, optionOverviewDto.strikes) && Intrinsics.a(this.optionType, optionOverviewDto.optionType);
    }

    @NotNull
    public final List<Long> getExpiries() {
        return this.expiries;
    }

    @NotNull
    public final FnoOptionDto getIdentifierInfo() {
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

    public final List<OptionContractDto> getStrikes() {
        return this.strikes;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int c10 = e.c(this.selectedExpiry, d.e(this.expiries, (this.identifierInfo.hashCode() + h.g(this.type, Integer.hashCode(this.lotSize) * 31, 31)) * 31, 31), 31);
        List<OptionContractDto> list = this.strikes;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return this.optionType.hashCode() + ((c10 + hashCode) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    @NotNull
    public final OptionOverview toOptionOverview() {
        ?? r72;
        OptionType optionType;
        int i10 = this.lotSize;
        OptionType optionType2 = OptionType.INSTANCE.getOptionType(this.type);
        FnoOption fnoOption = this.identifierInfo.toFnoOption();
        List<Long> list = this.expiries;
        long j10 = this.selectedExpiry;
        List<OptionContractDto> list2 = this.strikes;
        if (list2 != null) {
            r72 = new ArrayList();
            for (OptionContractDto optionContractDto : list2) {
                if (Intrinsics.a(this.optionType, "CE")) {
                    optionType = OptionType.CALL;
                } else {
                    optionType = OptionType.PUT;
                }
                r72.add(optionContractDto.toOptionContract(optionType, this.identifierInfo.getLtp()));
            }
        } else {
            r72 = i0.f38321a;
        }
        return new OptionOverview(i10, optionType2, fnoOption, list, j10, r72, this.optionType);
    }

    @NotNull
    public String toString() {
        int i10 = this.lotSize;
        String str = this.type;
        FnoOptionDto fnoOptionDto = this.identifierInfo;
        List<Long> list = this.expiries;
        long j10 = this.selectedExpiry;
        List<OptionContractDto> list2 = this.strikes;
        String str2 = this.optionType;
        StringBuilder sb2 = new StringBuilder("OptionOverviewDto(lotSize=");
        sb2.append(i10);
        sb2.append(", type=");
        sb2.append(str);
        sb2.append(", identifierInfo=");
        sb2.append(fnoOptionDto);
        sb2.append(", expiries=");
        sb2.append(list);
        sb2.append(", selectedExpiry=");
        sb2.append(j10);
        sb2.append(", strikes=");
        sb2.append(list2);
        return e.j(sb2, ", optionType=", str2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.lotSize);
        parcel.writeString(this.type);
        this.identifierInfo.writeToParcel(parcel, flags);
        Iterator p10 = a.p(this.expiries, parcel);
        while (p10.hasNext()) {
            parcel.writeLong(((Number) p10.next()).longValue());
        }
        parcel.writeLong(this.selectedExpiry);
        List<OptionContractDto> list = this.strikes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((OptionContractDto) o10.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.optionType);
    }
}
