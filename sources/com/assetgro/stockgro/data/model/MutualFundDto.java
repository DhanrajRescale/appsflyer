package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/model/MutualFundDto;", "Landroid/os/Parcelable;", "holdingPercentage", HttpUrl.FRAGMENT_ENCODE_SET, "holding", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/ImageTitleDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getHolding", "()Ljava/util/List;", "getHoldingPercentage", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MutualFundDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MutualFundDto> CREATOR = new Creator();

    @SerializedName("holding")
    private final List<ImageTitleDto> holding;

    @SerializedName("holding_percentage")
    private final String holdingPercentage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MutualFundDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MutualFundDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(ImageTitleDto.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new MutualFundDto(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MutualFundDto[] newArray(int i10) {
            return new MutualFundDto[i10];
        }
    }

    public MutualFundDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutualFundDto copy$default(MutualFundDto mutualFundDto, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mutualFundDto.holdingPercentage;
        }
        if ((i10 & 2) != 0) {
            list = mutualFundDto.holding;
        }
        return mutualFundDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHoldingPercentage() {
        return this.holdingPercentage;
    }

    public final List<ImageTitleDto> component2() {
        return this.holding;
    }

    @NotNull
    public final MutualFundDto copy(String holdingPercentage, List<ImageTitleDto> holding) {
        return new MutualFundDto(holdingPercentage, holding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MutualFundDto)) {
            return false;
        }
        MutualFundDto mutualFundDto = (MutualFundDto) other;
        return Intrinsics.a(this.holdingPercentage, mutualFundDto.holdingPercentage) && Intrinsics.a(this.holding, mutualFundDto.holding);
    }

    public final List<ImageTitleDto> getHolding() {
        return this.holding;
    }

    public final String getHoldingPercentage() {
        return this.holdingPercentage;
    }

    public int hashCode() {
        String str = this.holdingPercentage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ImageTitleDto> list = this.holding;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MutualFundDto(holdingPercentage=" + this.holdingPercentage + ", holding=" + this.holding + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.holdingPercentage);
        List<ImageTitleDto> list = this.holding;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((ImageTitleDto) o10.next()).writeToParcel(parcel, flags);
        }
    }

    public MutualFundDto(String str, List<ImageTitleDto> list) {
        this.holdingPercentage = str;
        this.holding = list;
    }

    public /* synthetic */ MutualFundDto(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : list);
    }
}
