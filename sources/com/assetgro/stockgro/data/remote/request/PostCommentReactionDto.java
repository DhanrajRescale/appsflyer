package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/PostCommentReactionDto;", "Landroid/os/Parcelable;", "commentId", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "reaction", "isUnreact", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCommentId", "()Ljava/lang/String;", "()Z", "getReaction", "getUserId", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PostCommentReactionDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<PostCommentReactionDto> CREATOR = new Creator();

    @SerializedName("item_id")
    @NotNull
    private final String commentId;

    @SerializedName("is_unreact")
    private final boolean isUnreact;

    @SerializedName("reaction")
    @NotNull
    private final String reaction;

    @SerializedName("user_id")
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PostCommentReactionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostCommentReactionDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostCommentReactionDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PostCommentReactionDto[] newArray(int i10) {
            return new PostCommentReactionDto[i10];
        }
    }

    public PostCommentReactionDto(@NotNull String commentId, String str, @NotNull String reaction, boolean z10) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        this.commentId = commentId;
        this.userId = str;
        this.reaction = reaction;
        this.isUnreact = z10;
    }

    public static /* synthetic */ PostCommentReactionDto copy$default(PostCommentReactionDto postCommentReactionDto, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postCommentReactionDto.commentId;
        }
        if ((i10 & 2) != 0) {
            str2 = postCommentReactionDto.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = postCommentReactionDto.reaction;
        }
        if ((i10 & 8) != 0) {
            z10 = postCommentReactionDto.isUnreact;
        }
        return postCommentReactionDto.copy(str, str2, str3, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCommentId() {
        return this.commentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReaction() {
        return this.reaction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUnreact() {
        return this.isUnreact;
    }

    @NotNull
    public final PostCommentReactionDto copy(@NotNull String commentId, String userId, @NotNull String reaction, boolean isUnreact) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        return new PostCommentReactionDto(commentId, userId, reaction, isUnreact);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostCommentReactionDto)) {
            return false;
        }
        PostCommentReactionDto postCommentReactionDto = (PostCommentReactionDto) other;
        return Intrinsics.a(this.commentId, postCommentReactionDto.commentId) && Intrinsics.a(this.userId, postCommentReactionDto.userId) && Intrinsics.a(this.reaction, postCommentReactionDto.reaction) && this.isUnreact == postCommentReactionDto.isUnreact;
    }

    @NotNull
    public final String getCommentId() {
        return this.commentId;
    }

    @NotNull
    public final String getReaction() {
        return this.reaction;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.commentId.hashCode() * 31;
        String str = this.userId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.isUnreact) + h.g(this.reaction, (hashCode2 + hashCode) * 31, 31);
    }

    public final boolean isUnreact() {
        return this.isUnreact;
    }

    @NotNull
    public String toString() {
        String str = this.commentId;
        String str2 = this.userId;
        String str3 = this.reaction;
        boolean z10 = this.isUnreact;
        StringBuilder l10 = e.l("PostCommentReactionDto(commentId=", str, ", userId=", str2, ", reaction=");
        l10.append(str3);
        l10.append(", isUnreact=");
        l10.append(z10);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.commentId);
        parcel.writeString(this.userId);
        parcel.writeString(this.reaction);
        parcel.writeInt(this.isUnreact ? 1 : 0);
    }
}
