package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/UpdatePostBookMarkStatusDto;", HttpUrl.FRAGMENT_ENCODE_SET, "isBookmarked", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UpdatePostBookMarkStatusDto {
    public static final int $stable = 0;

    @SerializedName("is_bookmarked")
    private final boolean isBookmarked;

    public UpdatePostBookMarkStatusDto(boolean z10) {
        this.isBookmarked = z10;
    }

    public static /* synthetic */ UpdatePostBookMarkStatusDto copy$default(UpdatePostBookMarkStatusDto updatePostBookMarkStatusDto, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = updatePostBookMarkStatusDto.isBookmarked;
        }
        return updatePostBookMarkStatusDto.copy(z10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBookmarked() {
        return this.isBookmarked;
    }

    @NotNull
    public final UpdatePostBookMarkStatusDto copy(boolean isBookmarked) {
        return new UpdatePostBookMarkStatusDto(isBookmarked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdatePostBookMarkStatusDto) && this.isBookmarked == ((UpdatePostBookMarkStatusDto) other).isBookmarked;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBookmarked);
    }

    public final boolean isBookmarked() {
        return this.isBookmarked;
    }

    @NotNull
    public String toString() {
        return "UpdatePostBookMarkStatusDto(isBookmarked=" + this.isBookmarked + ")";
    }
}
