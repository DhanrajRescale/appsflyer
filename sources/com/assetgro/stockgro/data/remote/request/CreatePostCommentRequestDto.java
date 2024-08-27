package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.ui.social.domain.model.CommentContent;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/CreatePostCommentRequestDto;", "Landroid/os/Parcelable;", "postId", HttpUrl.FRAGMENT_ENCODE_SET, "senderId", "commentData", "Lcom/assetgro/stockgro/ui/social/domain/model/CommentContent;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/social/domain/model/CommentContent;)V", "getCommentData", "()Lcom/assetgro/stockgro/ui/social/domain/model/CommentContent;", "getPostId", "()Ljava/lang/String;", "getSenderId", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CreatePostCommentRequestDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<CreatePostCommentRequestDto> CREATOR = new Creator();

    @SerializedName("data")
    @NotNull
    private final CommentContent commentData;

    @SerializedName("entity_id")
    @NotNull
    private final String postId;

    @SerializedName("sender_id")
    private final String senderId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<CreatePostCommentRequestDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CreatePostCommentRequestDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreatePostCommentRequestDto(parcel.readString(), parcel.readString(), CommentContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CreatePostCommentRequestDto[] newArray(int i10) {
            return new CreatePostCommentRequestDto[i10];
        }
    }

    public CreatePostCommentRequestDto(@NotNull String postId, String str, @NotNull CommentContent commentData) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(commentData, "commentData");
        this.postId = postId;
        this.senderId = str;
        this.commentData = commentData;
    }

    public static /* synthetic */ CreatePostCommentRequestDto copy$default(CreatePostCommentRequestDto createPostCommentRequestDto, String str, String str2, CommentContent commentContent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createPostCommentRequestDto.postId;
        }
        if ((i10 & 2) != 0) {
            str2 = createPostCommentRequestDto.senderId;
        }
        if ((i10 & 4) != 0) {
            commentContent = createPostCommentRequestDto.commentData;
        }
        return createPostCommentRequestDto.copy(str, str2, commentContent);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPostId() {
        return this.postId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommentContent getCommentData() {
        return this.commentData;
    }

    @NotNull
    public final CreatePostCommentRequestDto copy(@NotNull String postId, String senderId, @NotNull CommentContent commentData) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(commentData, "commentData");
        return new CreatePostCommentRequestDto(postId, senderId, commentData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePostCommentRequestDto)) {
            return false;
        }
        CreatePostCommentRequestDto createPostCommentRequestDto = (CreatePostCommentRequestDto) other;
        return Intrinsics.a(this.postId, createPostCommentRequestDto.postId) && Intrinsics.a(this.senderId, createPostCommentRequestDto.senderId) && Intrinsics.a(this.commentData, createPostCommentRequestDto.commentData);
    }

    @NotNull
    public final CommentContent getCommentData() {
        return this.commentData;
    }

    @NotNull
    public final String getPostId() {
        return this.postId;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public int hashCode() {
        int hashCode = this.postId.hashCode() * 31;
        String str = this.senderId;
        return this.commentData.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.postId;
        String str2 = this.senderId;
        CommentContent commentContent = this.commentData;
        StringBuilder l10 = e.l("CreatePostCommentRequestDto(postId=", str, ", senderId=", str2, ", commentData=");
        l10.append(commentContent);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.postId);
        parcel.writeString(this.senderId);
        this.commentData.writeToParcel(parcel, flags);
    }
}
