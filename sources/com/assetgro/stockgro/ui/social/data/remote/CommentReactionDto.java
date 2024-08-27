package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.CommentReaction;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/CommentReactionDto;", HttpUrl.FRAGMENT_ENCODE_SET, "emoji", HttpUrl.FRAGMENT_ENCODE_SET, "count", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "getCount", "()I", "setCount", "(I)V", "getEmoji", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toCommentReaction", "Lcom/assetgro/stockgro/ui/social/domain/model/CommentReaction;", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CommentReactionDto {
    public static final int $stable = 8;

    @SerializedName("count")
    private int count;

    @SerializedName("emoji")
    private final String emoji;

    public CommentReactionDto(String str, int i10) {
        this.emoji = str;
        this.count = i10;
    }

    public static /* synthetic */ CommentReactionDto copy$default(CommentReactionDto commentReactionDto, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commentReactionDto.emoji;
        }
        if ((i11 & 2) != 0) {
            i10 = commentReactionDto.count;
        }
        return commentReactionDto.copy(str, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final CommentReactionDto copy(String emoji, int count) {
        return new CommentReactionDto(emoji, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentReactionDto)) {
            return false;
        }
        CommentReactionDto commentReactionDto = (CommentReactionDto) other;
        return Intrinsics.a(this.emoji, commentReactionDto.emoji) && this.count == commentReactionDto.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public int hashCode() {
        String str = this.emoji;
        return Integer.hashCode(this.count) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setCount(int i10) {
        this.count = i10;
    }

    @NotNull
    public final CommentReaction toCommentReaction() {
        return new CommentReaction(this.emoji, this.count);
    }

    @NotNull
    public String toString() {
        return "CommentReactionDto(emoji=" + this.emoji + ", count=" + this.count + ")";
    }

    public /* synthetic */ CommentReactionDto(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : i10);
    }
}
