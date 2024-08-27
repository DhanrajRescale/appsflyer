package com.assetgro.stockgro.ui.social.domain.model;

import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003Jo\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0010HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/CommentMetaData;", HttpUrl.FRAGMENT_ENCODE_SET, "commentId", HttpUrl.FRAGMENT_ENCODE_SET, "postId", "senderId", "isLiked", HttpUrl.FRAGMENT_ENCODE_SET, "creatorInfo", "Lcom/assetgro/stockgro/ui/social/domain/model/CreatorMeta;", "commentsContent", "Lcom/assetgro/stockgro/ui/social/domain/model/CommentContent;", PaymentConstants.TIMESTAMP, "interaction", "Lcom/assetgro/stockgro/ui/social/domain/model/Interaction;", "likesCount", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/assetgro/stockgro/ui/social/domain/model/CreatorMeta;Lcom/assetgro/stockgro/ui/social/domain/model/CommentContent;Ljava/lang/String;Lcom/assetgro/stockgro/ui/social/domain/model/Interaction;I)V", "getCommentId", "()Ljava/lang/String;", "getCommentsContent", "()Lcom/assetgro/stockgro/ui/social/domain/model/CommentContent;", "getCreatorInfo", "()Lcom/assetgro/stockgro/ui/social/domain/model/CreatorMeta;", "getInteraction", "()Lcom/assetgro/stockgro/ui/social/domain/model/Interaction;", "()Z", "setLiked", "(Z)V", "getLikesCount", "()I", "setLikesCount", "(I)V", "getPostId", "getSenderId", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommentMetaData {
    public static final int $stable = 8;

    @NotNull
    private final String commentId;
    private final CommentContent commentsContent;
    private final CreatorMeta creatorInfo;
    private final Interaction interaction;
    private boolean isLiked;
    private int likesCount;
    private final String postId;
    private final String senderId;
    private final String timestamp;

    public CommentMetaData(@NotNull String commentId, String str, String str2, boolean z10, CreatorMeta creatorMeta, CommentContent commentContent, String str3, Interaction interaction, int i10) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        this.commentId = commentId;
        this.postId = str;
        this.senderId = str2;
        this.isLiked = z10;
        this.creatorInfo = creatorMeta;
        this.commentsContent = commentContent;
        this.timestamp = str3;
        this.interaction = interaction;
        this.likesCount = i10;
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
    public final CreatorMeta getCreatorInfo() {
        return this.creatorInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final CommentContent getCommentsContent() {
        return this.commentsContent;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final Interaction getInteraction() {
        return this.interaction;
    }

    /* renamed from: component9, reason: from getter */
    public final int getLikesCount() {
        return this.likesCount;
    }

    @NotNull
    public final CommentMetaData copy(@NotNull String commentId, String postId, String senderId, boolean isLiked, CreatorMeta creatorInfo, CommentContent commentsContent, String timestamp, Interaction interaction, int likesCount) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        return new CommentMetaData(commentId, postId, senderId, isLiked, creatorInfo, commentsContent, timestamp, interaction, likesCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentMetaData)) {
            return false;
        }
        CommentMetaData commentMetaData = (CommentMetaData) other;
        return Intrinsics.a(this.commentId, commentMetaData.commentId) && Intrinsics.a(this.postId, commentMetaData.postId) && Intrinsics.a(this.senderId, commentMetaData.senderId) && this.isLiked == commentMetaData.isLiked && Intrinsics.a(this.creatorInfo, commentMetaData.creatorInfo) && Intrinsics.a(this.commentsContent, commentMetaData.commentsContent) && Intrinsics.a(this.timestamp, commentMetaData.timestamp) && Intrinsics.a(this.interaction, commentMetaData.interaction) && this.likesCount == commentMetaData.likesCount;
    }

    @NotNull
    public final String getCommentId() {
        return this.commentId;
    }

    public final CommentContent getCommentsContent() {
        return this.commentsContent;
    }

    public final CreatorMeta getCreatorInfo() {
        return this.creatorInfo;
    }

    public final Interaction getInteraction() {
        return this.interaction;
    }

    public final int getLikesCount() {
        return this.likesCount;
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
        CreatorMeta creatorMeta = this.creatorInfo;
        if (creatorMeta == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = creatorMeta.hashCode();
        }
        int i12 = (d10 + hashCode3) * 31;
        CommentContent commentContent = this.commentsContent;
        if (commentContent == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = commentContent.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str3 = this.timestamp;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Interaction interaction = this.interaction;
        if (interaction != null) {
            i10 = interaction.hashCode();
        }
        return Integer.hashCode(this.likesCount) + ((i14 + i10) * 31);
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final void setLiked(boolean z10) {
        this.isLiked = z10;
    }

    public final void setLikesCount(int i10) {
        this.likesCount = i10;
    }

    @NotNull
    public String toString() {
        String str = this.commentId;
        String str2 = this.postId;
        String str3 = this.senderId;
        boolean z10 = this.isLiked;
        CreatorMeta creatorMeta = this.creatorInfo;
        CommentContent commentContent = this.commentsContent;
        String str4 = this.timestamp;
        Interaction interaction = this.interaction;
        int i10 = this.likesCount;
        StringBuilder l10 = e.l("CommentMetaData(commentId=", str, ", postId=", str2, ", senderId=");
        l10.append(str3);
        l10.append(", isLiked=");
        l10.append(z10);
        l10.append(", creatorInfo=");
        l10.append(creatorMeta);
        l10.append(", commentsContent=");
        l10.append(commentContent);
        l10.append(", timestamp=");
        l10.append(str4);
        l10.append(", interaction=");
        l10.append(interaction);
        l10.append(", likesCount=");
        return d.m(l10, i10, ")");
    }

    public /* synthetic */ CommentMetaData(String str, String str2, String str3, boolean z10, CreatorMeta creatorMeta, CommentContent commentContent, String str4, Interaction interaction, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? false : z10, creatorMeta, commentContent, str4, interaction, (i11 & 256) != 0 ? 0 : i10);
    }
}
