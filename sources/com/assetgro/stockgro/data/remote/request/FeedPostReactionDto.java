package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/FeedPostReactionDto;", "Landroid/os/Parcelable;", "postId", HttpUrl.FRAGMENT_ENCODE_SET, "reaction", "isUnreact", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getPostId", "()Ljava/lang/String;", "getReaction", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FeedPostReactionDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<FeedPostReactionDto> CREATOR = new Creator();

    @SerializedName("is_unreact")
    private final boolean isUnreact;

    @SerializedName("post_id")
    @NotNull
    private final String postId;

    @SerializedName("reaction")
    @NotNull
    private final String reaction;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FeedPostReactionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedPostReactionDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedPostReactionDto(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedPostReactionDto[] newArray(int i10) {
            return new FeedPostReactionDto[i10];
        }
    }

    public FeedPostReactionDto(@NotNull String postId, @NotNull String reaction, boolean z10) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        this.postId = postId;
        this.reaction = reaction;
        this.isUnreact = z10;
    }

    public static /* synthetic */ FeedPostReactionDto copy$default(FeedPostReactionDto feedPostReactionDto, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedPostReactionDto.postId;
        }
        if ((i10 & 2) != 0) {
            str2 = feedPostReactionDto.reaction;
        }
        if ((i10 & 4) != 0) {
            z10 = feedPostReactionDto.isUnreact;
        }
        return feedPostReactionDto.copy(str, str2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPostId() {
        return this.postId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getReaction() {
        return this.reaction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsUnreact() {
        return this.isUnreact;
    }

    @NotNull
    public final FeedPostReactionDto copy(@NotNull String postId, @NotNull String reaction, boolean isUnreact) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        return new FeedPostReactionDto(postId, reaction, isUnreact);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedPostReactionDto)) {
            return false;
        }
        FeedPostReactionDto feedPostReactionDto = (FeedPostReactionDto) other;
        return Intrinsics.a(this.postId, feedPostReactionDto.postId) && Intrinsics.a(this.reaction, feedPostReactionDto.reaction) && this.isUnreact == feedPostReactionDto.isUnreact;
    }

    @NotNull
    public final String getPostId() {
        return this.postId;
    }

    @NotNull
    public final String getReaction() {
        return this.reaction;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isUnreact) + h.g(this.reaction, this.postId.hashCode() * 31, 31);
    }

    public final boolean isUnreact() {
        return this.isUnreact;
    }

    @NotNull
    public String toString() {
        String str = this.postId;
        String str2 = this.reaction;
        return e.o(v.e.l("FeedPostReactionDto(postId=", str, ", reaction=", str2, ", isUnreact="), this.isUnreact, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.postId);
        parcel.writeString(this.reaction);
        parcel.writeInt(this.isUnreact ? 1 : 0);
    }
}
