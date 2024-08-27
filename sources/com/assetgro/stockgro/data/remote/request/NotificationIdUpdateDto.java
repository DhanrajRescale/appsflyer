package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/NotificationIdUpdateDto;", HttpUrl.FRAGMENT_ENCODE_SET, "notificationId", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getNotificationId", "()Ljava/lang/String;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationIdUpdateDto {
    public static final int $stable = 0;

    @SerializedName("notification_id")
    private final String notificationId;

    public NotificationIdUpdateDto(String str) {
        this.notificationId = str;
    }

    public final String getNotificationId() {
        return this.notificationId;
    }
}
