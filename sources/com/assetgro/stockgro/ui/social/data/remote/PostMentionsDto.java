package com.assetgro.stockgro.ui.social.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.ui.social.domain.model.PostMentions;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/PostMentionsDto;", "Landroid/os/Parcelable;", "stockIds", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "userIds", "(Ljava/util/List;Ljava/util/List;)V", "getStockIds", "()Ljava/util/List;", "getUserIds", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toPostMentions", "Lcom/assetgro/stockgro/ui/social/domain/model/PostMentions;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PostMentionsDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PostMentionsDto> CREATOR = new Creator();

    @SerializedName("stock_ids")
    private final List<String> stockIds;

    @SerializedName("user_ids")
    private final List<String> userIds;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PostMentionsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostMentionsDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostMentionsDto(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostMentionsDto[] newArray(int i10) {
            return new PostMentionsDto[i10];
        }
    }

    public PostMentionsDto(List<String> list, List<String> list2) {
        this.stockIds = list;
        this.userIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostMentionsDto copy$default(PostMentionsDto postMentionsDto, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = postMentionsDto.stockIds;
        }
        if ((i10 & 2) != 0) {
            list2 = postMentionsDto.userIds;
        }
        return postMentionsDto.copy(list, list2);
    }

    public final List<String> component1() {
        return this.stockIds;
    }

    public final List<String> component2() {
        return this.userIds;
    }

    @NotNull
    public final PostMentionsDto copy(List<String> stockIds, List<String> userIds) {
        return new PostMentionsDto(stockIds, userIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostMentionsDto)) {
            return false;
        }
        PostMentionsDto postMentionsDto = (PostMentionsDto) other;
        return Intrinsics.a(this.stockIds, postMentionsDto.stockIds) && Intrinsics.a(this.userIds, postMentionsDto.userIds);
    }

    public final List<String> getStockIds() {
        return this.stockIds;
    }

    public final List<String> getUserIds() {
        return this.userIds;
    }

    public int hashCode() {
        List<String> list = this.stockIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.userIds;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public final PostMentions toPostMentions() {
        return new PostMentions(this.stockIds, this.userIds);
    }

    @NotNull
    public String toString() {
        return "PostMentionsDto(stockIds=" + this.stockIds + ", userIds=" + this.userIds + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeStringList(this.stockIds);
        parcel.writeStringList(this.userIds);
    }
}
