package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.Interaction;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/InteractionDto;", HttpUrl.FRAGMENT_ENCODE_SET, "reactionsDto", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/social/data/remote/CommentReactionDto;", "userReaction", HttpUrl.FRAGMENT_ENCODE_SET, "isReported", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;Z)V", "()Z", "setReported", "(Z)V", "getReactionsDto", "()Ljava/util/List;", "getUserReaction", "()Ljava/lang/String;", "setUserReaction", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toInteraction", "Lcom/assetgro/stockgro/ui/social/domain/model/Interaction;", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InteractionDto {
    public static final int $stable = 8;

    @SerializedName("is_reported")
    private boolean isReported;

    @SerializedName("reactions")
    private final List<CommentReactionDto> reactionsDto;

    @SerializedName("user_reaction")
    private String userReaction;

    public InteractionDto(List<CommentReactionDto> list, String str, boolean z10) {
        this.reactionsDto = list;
        this.userReaction = str;
        this.isReported = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractionDto copy$default(InteractionDto interactionDto, List list, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = interactionDto.reactionsDto;
        }
        if ((i10 & 2) != 0) {
            str = interactionDto.userReaction;
        }
        if ((i10 & 4) != 0) {
            z10 = interactionDto.isReported;
        }
        return interactionDto.copy(list, str, z10);
    }

    public final List<CommentReactionDto> component1() {
        return this.reactionsDto;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserReaction() {
        return this.userReaction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsReported() {
        return this.isReported;
    }

    @NotNull
    public final InteractionDto copy(List<CommentReactionDto> reactionsDto, String userReaction, boolean isReported) {
        return new InteractionDto(reactionsDto, userReaction, isReported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionDto)) {
            return false;
        }
        InteractionDto interactionDto = (InteractionDto) other;
        return Intrinsics.a(this.reactionsDto, interactionDto.reactionsDto) && Intrinsics.a(this.userReaction, interactionDto.userReaction) && this.isReported == interactionDto.isReported;
    }

    public final List<CommentReactionDto> getReactionsDto() {
        return this.reactionsDto;
    }

    public final String getUserReaction() {
        return this.userReaction;
    }

    public int hashCode() {
        List<CommentReactionDto> list = this.reactionsDto;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.userReaction;
        return Boolean.hashCode(this.isReported) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isReported() {
        return this.isReported;
    }

    public final void setReported(boolean z10) {
        this.isReported = z10;
    }

    public final void setUserReaction(String str) {
        this.userReaction = str;
    }

    @NotNull
    public final Interaction toInteraction() {
        ArrayList arrayList;
        List<CommentReactionDto> list = this.reactionsDto;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CommentReactionDto) it.next()).toCommentReaction());
            }
        } else {
            arrayList = null;
        }
        return new Interaction(arrayList, this.userReaction, this.isReported);
    }

    @NotNull
    public String toString() {
        List<CommentReactionDto> list = this.reactionsDto;
        String str = this.userReaction;
        boolean z10 = this.isReported;
        StringBuilder sb2 = new StringBuilder("InteractionDto(reactionsDto=");
        sb2.append(list);
        sb2.append(", userReaction=");
        sb2.append(str);
        sb2.append(", isReported=");
        return e.o(sb2, z10, ")");
    }

    public /* synthetic */ InteractionDto(List list, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i10 & 4) != 0 ? false : z10);
    }
}
