package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/data/model/ChatNotificationDto;", HttpUrl.FRAGMENT_ENCODE_SET, "totalUnreadMessages", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Integer;)V", "getTotalUnreadMessages", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChatNotificationDto {
    public static final int $stable = 0;

    @SerializedName("total_unread_messages")
    private final Integer totalUnreadMessages;

    public ChatNotificationDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer getTotalUnreadMessages() {
        return this.totalUnreadMessages;
    }

    public ChatNotificationDto(Integer num) {
        this.totalUnreadMessages = num;
    }

    public /* synthetic */ ChatNotificationDto(Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num);
    }
}
