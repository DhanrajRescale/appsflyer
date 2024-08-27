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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/SocialSearchHistoryResponseDto;", "Landroid/os/Parcelable;", "searchRequests", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/remote/response/SocialSearchHistoryItem;", "(Ljava/util/List;)V", "getSearchRequests", "()Ljava/util/List;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialSearchHistoryResponseDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SocialSearchHistoryResponseDto> CREATOR = new Creator();

    @SerializedName("search_requests")
    private final List<SocialSearchHistoryItem> searchRequests;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SocialSearchHistoryResponseDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialSearchHistoryResponseDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(SocialSearchHistoryItem.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new SocialSearchHistoryResponseDto(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialSearchHistoryResponseDto[] newArray(int i10) {
            return new SocialSearchHistoryResponseDto[i10];
        }
    }

    public SocialSearchHistoryResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialSearchHistoryResponseDto copy$default(SocialSearchHistoryResponseDto socialSearchHistoryResponseDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = socialSearchHistoryResponseDto.searchRequests;
        }
        return socialSearchHistoryResponseDto.copy(list);
    }

    public final List<SocialSearchHistoryItem> component1() {
        return this.searchRequests;
    }

    @NotNull
    public final SocialSearchHistoryResponseDto copy(List<SocialSearchHistoryItem> searchRequests) {
        return new SocialSearchHistoryResponseDto(searchRequests);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocialSearchHistoryResponseDto) && Intrinsics.a(this.searchRequests, ((SocialSearchHistoryResponseDto) other).searchRequests);
    }

    public final List<SocialSearchHistoryItem> getSearchRequests() {
        return this.searchRequests;
    }

    public int hashCode() {
        List<SocialSearchHistoryItem> list = this.searchRequests;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("SocialSearchHistoryResponseDto(searchRequests=", this.searchRequests, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<SocialSearchHistoryItem> list = this.searchRequests;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((SocialSearchHistoryItem) o10.next()).writeToParcel(parcel, flags);
        }
    }

    public SocialSearchHistoryResponseDto(List<SocialSearchHistoryItem> list) {
        this.searchRequests = list;
    }

    public /* synthetic */ SocialSearchHistoryResponseDto(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list);
    }
}
