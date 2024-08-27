package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.OptionChain;
import com.assetgro.stockgro.feature_market.domain.model.OptionChainData;
import com.assetgro.stockgro.feature_market.domain.model.OptionType;
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
import vt.i0;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\u0006\u0010!\u001a\u00020\"J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001bHÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006)"}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionChainDto;", "Landroid/os/Parcelable;", "ceHeader", HttpUrl.FRAGMENT_ENCODE_SET, "peHeader", "ceContracts", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/OptionContractDto;", "peContracts", "identifierInfo", "Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;)V", "getCeContracts", "()Ljava/util/List;", "getCeHeader", "()Ljava/lang/String;", "getIdentifierInfo", "()Lcom/assetgro/stockgro/feature_market/data/remote/FnoOptionDto;", "getPeContracts", "getPeHeader", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toOptionChain", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionChain;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionChainDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OptionChainDto> CREATOR = new Creator();

    @SerializedName("ce_contracts")
    private final List<OptionContractDto> ceContracts;

    @SerializedName("ce_header")
    @NotNull
    private final String ceHeader;

    @SerializedName("identifier_info")
    @NotNull
    private final FnoOptionDto identifierInfo;

    @SerializedName("pe_contracts")
    private final List<OptionContractDto> peContracts;

    @SerializedName("pe_header")
    @NotNull
    private final String peHeader;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionChainDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionChainDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i10 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = h.e(OptionContractDto.CREATOR, parcel, arrayList, i11, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i10 != readInt2) {
                    i10 = h.e(OptionContractDto.CREATOR, parcel, arrayList2, i10, 1);
                }
            }
            return new OptionChainDto(readString, readString2, arrayList, arrayList2, FnoOptionDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionChainDto[] newArray(int i10) {
            return new OptionChainDto[i10];
        }
    }

    public OptionChainDto(@NotNull String ceHeader, @NotNull String peHeader, List<OptionContractDto> list, List<OptionContractDto> list2, @NotNull FnoOptionDto identifierInfo) {
        Intrinsics.checkNotNullParameter(ceHeader, "ceHeader");
        Intrinsics.checkNotNullParameter(peHeader, "peHeader");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        this.ceHeader = ceHeader;
        this.peHeader = peHeader;
        this.ceContracts = list;
        this.peContracts = list2;
        this.identifierInfo = identifierInfo;
    }

    public static /* synthetic */ OptionChainDto copy$default(OptionChainDto optionChainDto, String str, String str2, List list, List list2, FnoOptionDto fnoOptionDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = optionChainDto.ceHeader;
        }
        if ((i10 & 2) != 0) {
            str2 = optionChainDto.peHeader;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            list = optionChainDto.ceContracts;
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = optionChainDto.peContracts;
        }
        List list4 = list2;
        if ((i10 & 16) != 0) {
            fnoOptionDto = optionChainDto.identifierInfo;
        }
        return optionChainDto.copy(str, str3, list3, list4, fnoOptionDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCeHeader() {
        return this.ceHeader;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPeHeader() {
        return this.peHeader;
    }

    public final List<OptionContractDto> component3() {
        return this.ceContracts;
    }

    public final List<OptionContractDto> component4() {
        return this.peContracts;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final FnoOptionDto getIdentifierInfo() {
        return this.identifierInfo;
    }

    @NotNull
    public final OptionChainDto copy(@NotNull String ceHeader, @NotNull String peHeader, List<OptionContractDto> ceContracts, List<OptionContractDto> peContracts, @NotNull FnoOptionDto identifierInfo) {
        Intrinsics.checkNotNullParameter(ceHeader, "ceHeader");
        Intrinsics.checkNotNullParameter(peHeader, "peHeader");
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        return new OptionChainDto(ceHeader, peHeader, ceContracts, peContracts, identifierInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainDto)) {
            return false;
        }
        OptionChainDto optionChainDto = (OptionChainDto) other;
        return Intrinsics.a(this.ceHeader, optionChainDto.ceHeader) && Intrinsics.a(this.peHeader, optionChainDto.peHeader) && Intrinsics.a(this.ceContracts, optionChainDto.ceContracts) && Intrinsics.a(this.peContracts, optionChainDto.peContracts) && Intrinsics.a(this.identifierInfo, optionChainDto.identifierInfo);
    }

    public final List<OptionContractDto> getCeContracts() {
        return this.ceContracts;
    }

    @NotNull
    public final String getCeHeader() {
        return this.ceHeader;
    }

    @NotNull
    public final FnoOptionDto getIdentifierInfo() {
        return this.identifierInfo;
    }

    public final List<OptionContractDto> getPeContracts() {
        return this.peContracts;
    }

    @NotNull
    public final String getPeHeader() {
        return this.peHeader;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.peHeader, this.ceHeader.hashCode() * 31, 31);
        List<OptionContractDto> list = this.ceContracts;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        List<OptionContractDto> list2 = this.peContracts;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return this.identifierInfo.hashCode() + ((i11 + i10) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @NotNull
    public final OptionChain toOptionChain() {
        ?? r22;
        ?? r32;
        String str = this.ceHeader;
        List<OptionContractDto> list = this.ceContracts;
        if (list != null) {
            r22 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r22.add(((OptionContractDto) it.next()).toOptionContract(OptionType.CALL, this.identifierInfo.getLtp()));
            }
        } else {
            r22 = i0.f38321a;
        }
        OptionChainData optionChainData = new OptionChainData(str, r22);
        String str2 = this.peHeader;
        List<OptionContractDto> list2 = this.peContracts;
        if (list2 != null) {
            r32 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r32.add(((OptionContractDto) it2.next()).toOptionContract(OptionType.PUT, this.identifierInfo.getLtp()));
            }
        } else {
            r32 = i0.f38321a;
        }
        return new OptionChain(optionChainData, new OptionChainData(str2, r32), this.identifierInfo.toFnoOption());
    }

    @NotNull
    public String toString() {
        String str = this.ceHeader;
        String str2 = this.peHeader;
        List<OptionContractDto> list = this.ceContracts;
        List<OptionContractDto> list2 = this.peContracts;
        FnoOptionDto fnoOptionDto = this.identifierInfo;
        StringBuilder l10 = e.l("OptionChainDto(ceHeader=", str, ", peHeader=", str2, ", ceContracts=");
        l10.append(list);
        l10.append(", peContracts=");
        l10.append(list2);
        l10.append(", identifierInfo=");
        l10.append(fnoOptionDto);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ceHeader);
        parcel.writeString(this.peHeader);
        List<OptionContractDto> list = this.ceContracts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((OptionContractDto) o10.next()).writeToParcel(parcel, flags);
            }
        }
        List<OptionContractDto> list2 = this.peContracts;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o11 = a.o(parcel, 1, list2);
            while (o11.hasNext()) {
                ((OptionContractDto) o11.next()).writeToParcel(parcel, flags);
            }
        }
        this.identifierInfo.writeToParcel(parcel, flags);
    }
}
