package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/PinnedChatDto;", HttpUrl.FRAGMENT_ENCODE_SET, "userId", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", "isPinned", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Z)V", "getGroupId", "()Ljava/lang/String;", "()Z", "getUserId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PinnedChatDto {
    public static final int $stable = 0;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("is_pinned")
    private final boolean isPinned;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    public PinnedChatDto(@NotNull String userId, @NotNull String groupId, boolean z10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.userId = userId;
        this.groupId = groupId;
        this.isPinned = z10;
    }

    public static /* synthetic */ PinnedChatDto copy$default(PinnedChatDto pinnedChatDto, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pinnedChatDto.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = pinnedChatDto.groupId;
        }
        if ((i10 & 4) != 0) {
            z10 = pinnedChatDto.isPinned;
        }
        return pinnedChatDto.copy(str, str2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    @NotNull
    public final PinnedChatDto copy(@NotNull String userId, @NotNull String groupId, boolean isPinned) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return new PinnedChatDto(userId, groupId, isPinned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedChatDto)) {
            return false;
        }
        PinnedChatDto pinnedChatDto = (PinnedChatDto) other;
        return Intrinsics.a(this.userId, pinnedChatDto.userId) && Intrinsics.a(this.groupId, pinnedChatDto.groupId) && this.isPinned == pinnedChatDto.isPinned;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPinned) + h.g(this.groupId, this.userId.hashCode() * 31, 31);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.groupId;
        return e.o(v.e.l("PinnedChatDto(userId=", str, ", groupId=", str2, ", isPinned="), this.isPinned, ")");
    }
}
