package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.CommentContent;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import com.assetgro.stockgro.ui.social.domain.model.CommentReaction;
import com.assetgro.stockgro.ui.social.domain.model.CreatorMeta;
import com.assetgro.stockgro.ui.social.domain.model.Interaction;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import pe.a;
import v.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u001fHÖ\u0001J\b\u0010,\u001a\u00020\u0007H\u0002J\u0006\u0010-\u001a\u00020.J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u00060"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/CommentMetaDataDto;", HttpUrl.FRAGMENT_ENCODE_SET, "commentId", HttpUrl.FRAGMENT_ENCODE_SET, "postId", "senderId", "isLiked", HttpUrl.FRAGMENT_ENCODE_SET, "creatorInfo", "Lcom/assetgro/stockgro/ui/social/data/remote/CreatorMetaDto;", "commentsContentDto", "Lcom/assetgro/stockgro/ui/social/data/remote/CommentContentDto;", PaymentConstants.TIMESTAMP, "interactionDto", "Lcom/assetgro/stockgro/ui/social/data/remote/InteractionDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/assetgro/stockgro/ui/social/data/remote/CreatorMetaDto;Lcom/assetgro/stockgro/ui/social/data/remote/CommentContentDto;Ljava/lang/String;Lcom/assetgro/stockgro/ui/social/data/remote/InteractionDto;)V", "getCommentId", "()Ljava/lang/String;", "getCommentsContentDto", "()Lcom/assetgro/stockgro/ui/social/data/remote/CommentContentDto;", "getCreatorInfo", "()Lcom/assetgro/stockgro/ui/social/data/remote/CreatorMetaDto;", "getInteractionDto", "()Lcom/assetgro/stockgro/ui/social/data/remote/InteractionDto;", "()Z", "setLiked", "(Z)V", "getPostId", "getSenderId", "getTimestamp", "commentLikeCount", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "isCommentLiked", "toCommentMetaData", "Lcom/assetgro/stockgro/ui/social/domain/model/CommentMetaData;", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommentMetaDataDto {
    public static final int $stable = 8;

    @SerializedName("item_id")
    @NotNull
    private final String commentId;

    @SerializedName("data")
    private final CommentContentDto commentsContentDto;

    @SerializedName("sender_info")
    private final CreatorMetaDto creatorInfo;

    @SerializedName("interaction")
    private final InteractionDto interactionDto;

    @SerializedName("is_liked")
    private boolean isLiked;

    @SerializedName("entity_id")
    private final String postId;

    @SerializedName("sender_id")
    private final String senderId;

    @SerializedName("time")
    private final String timestamp;

    public CommentMetaDataDto(@NotNull String commentId, String str, String str2, boolean z10, CreatorMetaDto creatorMetaDto, CommentContentDto commentContentDto, String str3, InteractionDto interactionDto) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        this.commentId = commentId;
        this.postId = str;
        this.senderId = str2;
        this.isLiked = z10;
        this.creatorInfo = creatorMetaDto;
        this.commentsContentDto = commentContentDto;
        this.timestamp = str3;
        this.interactionDto = interactionDto;
    }

    private final int commentLikeCount() {
        Interaction interaction;
        List<CommentReaction> reactions;
        CommentReaction commentReaction;
        InteractionDto interactionDto = this.interactionDto;
        if (interactionDto == null || (interaction = interactionDto.toInteraction()) == null || (reactions = interaction.getReactions()) == null || (commentReaction = reactions.get(0)) == null) {
            return 0;
        }
        return commentReaction.getCount();
    }

    private final boolean isCommentLiked() {
        String userReaction;
        InteractionDto interactionDto = this.interactionDto;
        if (interactionDto != null && (userReaction = interactionDto.getUserReaction()) != null) {
            a[] aVarArr = a.f31008a;
            return Intrinsics.a("Like", userReaction);
        }
        return false;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCommentId() {
        return this.commentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPostId() {
        return this.postId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    /* renamed from: component5, reason: from getter */
    public final CreatorMetaDto getCreatorInfo() {
        return this.creatorInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final CommentContentDto getCommentsContentDto() {
        return this.commentsContentDto;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final InteractionDto getInteractionDto() {
        return this.interactionDto;
    }

    @NotNull
    public final CommentMetaDataDto copy(@NotNull String commentId, String postId, String senderId, boolean isLiked, CreatorMetaDto creatorInfo, CommentContentDto commentsContentDto, String timestamp, InteractionDto interactionDto) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        return new CommentMetaDataDto(commentId, postId, senderId, isLiked, creatorInfo, commentsContentDto, timestamp, interactionDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentMetaDataDto)) {
            return false;
        }
        CommentMetaDataDto commentMetaDataDto = (CommentMetaDataDto) other;
        return Intrinsics.a(this.commentId, commentMetaDataDto.commentId) && Intrinsics.a(this.postId, commentMetaDataDto.postId) && Intrinsics.a(this.senderId, commentMetaDataDto.senderId) && this.isLiked == commentMetaDataDto.isLiked && Intrinsics.a(this.creatorInfo, commentMetaDataDto.creatorInfo) && Intrinsics.a(this.commentsContentDto, commentMetaDataDto.commentsContentDto) && Intrinsics.a(this.timestamp, commentMetaDataDto.timestamp) && Intrinsics.a(this.interactionDto, commentMetaDataDto.interactionDto);
    }

    @NotNull
    public final String getCommentId() {
        return this.commentId;
    }

    public final CommentContentDto getCommentsContentDto() {
        return this.commentsContentDto;
    }

    public final CreatorMetaDto getCreatorInfo() {
        return this.creatorInfo;
    }

    public final InteractionDto getInteractionDto() {
        return this.interactionDto;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.commentId.hashCode() * 31;
        String str = this.postId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode6 + hashCode) * 31;
        String str2 = this.senderId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int d10 = e.d(this.isLiked, (i11 + hashCode2) * 31, 31);
        CreatorMetaDto creatorMetaDto = this.creatorInfo;
        if (creatorMetaDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = creatorMetaDto.hashCode();
        }
        int i12 = (d10 + hashCode3) * 31;
        CommentContentDto commentContentDto = this.commentsContentDto;
        if (commentContentDto == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = commentContentDto.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str3 = this.timestamp;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        InteractionDto interactionDto = this.interactionDto;
        if (interactionDto != null) {
            i10 = interactionDto.hashCode();
        }
        return i14 + i10;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final void setLiked(boolean z10) {
        this.isLiked = z10;
    }

    @NotNull
    public final CommentMetaData toCommentMetaData() {
        String str;
        CreatorMeta creatorMeta;
        CommentContent commentContent;
        Interaction interaction;
        String str2 = this.commentId;
        String str3 = this.postId;
        CreatorMetaDto creatorMetaDto = this.creatorInfo;
        if (creatorMetaDto != null) {
            str = creatorMetaDto.getUserId();
        } else {
            str = null;
        }
        boolean isCommentLiked = isCommentLiked();
        CreatorMetaDto creatorMetaDto2 = this.creatorInfo;
        if (creatorMetaDto2 != null) {
            creatorMeta = creatorMetaDto2.toCreatorMeta();
        } else {
            creatorMeta = null;
        }
        CommentContentDto commentContentDto = this.commentsContentDto;
        if (commentContentDto != null) {
            commentContent = commentContentDto.toCommentContent();
        } else {
            commentContent = null;
        }
        String str4 = this.timestamp;
        InteractionDto interactionDto = this.interactionDto;
        if (interactionDto != null) {
            interaction = interactionDto.toInteraction();
        } else {
            interaction = null;
        }
        return new CommentMetaData(str2, str3, str, isCommentLiked, creatorMeta, commentContent, str4, interaction, commentLikeCount());
    }

    @NotNull
    public String toString() {
        String str = this.commentId;
        String str2 = this.postId;
        String str3 = this.senderId;
        boolean z10 = this.isLiked;
        CreatorMetaDto creatorMetaDto = this.creatorInfo;
        CommentContentDto commentContentDto = this.commentsContentDto;
        String str4 = this.timestamp;
        InteractionDto interactionDto = this.interactionDto;
        StringBuilder l10 = e.l("CommentMetaDataDto(commentId=", str, ", postId=", str2, ", senderId=");
        l10.append(str3);
        l10.append(", isLiked=");
        l10.append(z10);
        l10.append(", creatorInfo=");
        l10.append(creatorMetaDto);
        l10.append(", commentsContentDto=");
        l10.append(commentContentDto);
        l10.append(", timestamp=");
        l10.append(str4);
        l10.append(", interactionDto=");
        l10.append(interactionDto);
        l10.append(")");
        return l10.toString();
    }

    public /* synthetic */ CommentMetaDataDto(String str, String str2, String str3, boolean z10, CreatorMetaDto creatorMetaDto, CommentContentDto commentContentDto, String str4, InteractionDto interactionDto, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10, creatorMetaDto, commentContentDto, str4, interactionDto);
    }
}
