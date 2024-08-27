package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/MarkReadMessagesDto;", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "lastReadMessageTime", HttpUrl.FRAGMENT_ENCODE_SET, "lastReadMessageId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getLastReadMessageId", "getLastReadMessageTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/assetgro/stockgro/data/remote/request/MarkReadMessagesDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarkReadMessagesDto {
    public static final int $stable = 0;

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName("last_read_msg_id")
    private final String lastReadMessageId;

    @SerializedName("last_read_msg_server_micros")
    private final Long lastReadMessageTime;

    @SerializedName("user_id")
    private final String userId;

    public MarkReadMessagesDto(String str, String str2, Long l10, String str3) {
        this.groupId = str;
        this.userId = str2;
        this.lastReadMessageTime = l10;
        this.lastReadMessageId = str3;
    }

    public static /* synthetic */ MarkReadMessagesDto copy$default(MarkReadMessagesDto markReadMessagesDto, String str, String str2, Long l10, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = markReadMessagesDto.groupId;
        }
        if ((i10 & 2) != 0) {
            str2 = markReadMessagesDto.userId;
        }
        if ((i10 & 4) != 0) {
            l10 = markReadMessagesDto.lastReadMessageTime;
        }
        if ((i10 & 8) != 0) {
            str3 = markReadMessagesDto.lastReadMessageId;
        }
        return markReadMessagesDto.copy(str, str2, l10, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getLastReadMessageTime() {
        return this.lastReadMessageTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    @NotNull
    public final MarkReadMessagesDto copy(String groupId, String userId, Long lastReadMessageTime, String lastReadMessageId) {
        return new MarkReadMessagesDto(groupId, userId, lastReadMessageTime, lastReadMessageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkReadMessagesDto)) {
            return false;
        }
        MarkReadMessagesDto markReadMessagesDto = (MarkReadMessagesDto) other;
        return Intrinsics.a(this.groupId, markReadMessagesDto.groupId) && Intrinsics.a(this.userId, markReadMessagesDto.userId) && Intrinsics.a(this.lastReadMessageTime, markReadMessagesDto.lastReadMessageTime) && Intrinsics.a(this.lastReadMessageId, markReadMessagesDto.lastReadMessageId);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    public final Long getLastReadMessageTime() {
        return this.lastReadMessageTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.groupId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.lastReadMessageTime;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.lastReadMessageId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.groupId;
        String str2 = this.userId;
        Long l10 = this.lastReadMessageTime;
        String str3 = this.lastReadMessageId;
        StringBuilder l11 = e.l("MarkReadMessagesDto(groupId=", str, ", userId=", str2, ", lastReadMessageTime=");
        l11.append(l10);
        l11.append(", lastReadMessageId=");
        l11.append(str3);
        l11.append(")");
        return l11.toString();
    }
}
