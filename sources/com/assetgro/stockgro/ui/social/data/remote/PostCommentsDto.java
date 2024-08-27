package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.PostComments;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J%\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/PostCommentsDto;", HttpUrl.FRAGMENT_ENCODE_SET, "comments", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/social/data/remote/CommentMetaDataDto;", "isEndOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Z)V", "getComments", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toPostComments", "Lcom/assetgro/stockgro/ui/social/domain/model/PostComments;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PostCommentsDto {
    public static final int $stable = 8;

    @SerializedName("item_list")
    private final List<CommentMetaDataDto> comments;

    @SerializedName("end_of_response")
    private final boolean isEndOfResponse;

    public PostCommentsDto(List<CommentMetaDataDto> list, boolean z10) {
        this.comments = list;
        this.isEndOfResponse = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostCommentsDto copy$default(PostCommentsDto postCommentsDto, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = postCommentsDto.comments;
        }
        if ((i10 & 2) != 0) {
            z10 = postCommentsDto.isEndOfResponse;
        }
        return postCommentsDto.copy(list, z10);
    }

    public final List<CommentMetaDataDto> component1() {
        return this.comments;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEndOfResponse() {
        return this.isEndOfResponse;
    }

    @NotNull
    public final PostCommentsDto copy(List<CommentMetaDataDto> comments, boolean isEndOfResponse) {
        return new PostCommentsDto(comments, isEndOfResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostCommentsDto)) {
            return false;
        }
        PostCommentsDto postCommentsDto = (PostCommentsDto) other;
        return Intrinsics.a(this.comments, postCommentsDto.comments) && this.isEndOfResponse == postCommentsDto.isEndOfResponse;
    }

    public final List<CommentMetaDataDto> getComments() {
        return this.comments;
    }

    public int hashCode() {
        List<CommentMetaDataDto> list = this.comments;
        return Boolean.hashCode(this.isEndOfResponse) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final boolean isEndOfResponse() {
        return this.isEndOfResponse;
    }

    @NotNull
    public final PostComments toPostComments() {
        ArrayList arrayList;
        List<CommentMetaDataDto> list = this.comments;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CommentMetaDataDto) it.next()).toCommentMetaData());
            }
        } else {
            arrayList = null;
        }
        return new PostComments(arrayList, this.isEndOfResponse);
    }

    @NotNull
    public String toString() {
        return "PostCommentsDto(comments=" + this.comments + ", isEndOfResponse=" + this.isEndOfResponse + ")";
    }
}
