package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/data/model/NotificationDto;", HttpUrl.FRAGMENT_ENCODE_SET, "notificationId", HttpUrl.FRAGMENT_ENCODE_SET, "type", "imageUrl", "message", "createdAt", HttpUrl.FRAGMENT_ENCODE_SET, "redirectUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getCreatedAt", "()J", "getImageUrl", "()Ljava/lang/String;", "getMessage", "getNotificationId", "getRedirectUrl", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NotificationDto {
    public static final int $stable = 0;

    @SerializedName("created_at")
    private final long createdAt;

    @SerializedName("display_pic")
    private final String imageUrl;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("notification_id")
    @NotNull
    private final String notificationId;

    @SerializedName("android_redirect_url")
    private final String redirectUrl;

    @SerializedName("type")
    private final String type;

    public NotificationDto(@NotNull String notificationId, String str, String str2, @NotNull String message, long j10, String str3) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.notificationId = notificationId;
        this.type = str;
        this.imageUrl = str2;
        this.message = message;
        this.createdAt = j10;
        this.redirectUrl = str3;
    }

    public static /* synthetic */ NotificationDto copy$default(NotificationDto notificationDto, String str, String str2, String str3, String str4, long j10, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationDto.notificationId;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationDto.type;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = notificationDto.imageUrl;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = notificationDto.message;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            j10 = notificationDto.createdAt;
        }
        long j11 = j10;
        if ((i10 & 32) != 0) {
            str5 = notificationDto.redirectUrl;
        }
        return notificationDto.copy(str, str6, str7, str8, j11, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNotificationId() {
        return this.notificationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final NotificationDto copy(@NotNull String notificationId, String type, String imageUrl, @NotNull String message, long createdAt, String redirectUrl) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(message, "message");
        return new NotificationDto(notificationId, type, imageUrl, message, createdAt, redirectUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationDto)) {
            return false;
        }
        NotificationDto notificationDto = (NotificationDto) other;
        return Intrinsics.a(this.notificationId, notificationDto.notificationId) && Intrinsics.a(this.type, notificationDto.type) && Intrinsics.a(this.imageUrl, notificationDto.imageUrl) && Intrinsics.a(this.message, notificationDto.message) && this.createdAt == notificationDto.createdAt && Intrinsics.a(this.redirectUrl, notificationDto.redirectUrl);
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getNotificationId() {
        return this.notificationId;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.notificationId.hashCode() * 31;
        String str = this.type;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        String str2 = this.imageUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int c10 = e.c(this.createdAt, h.g(this.message, (i11 + hashCode2) * 31, 31), 31);
        String str3 = this.redirectUrl;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return c10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.notificationId;
        String str2 = this.type;
        String str3 = this.imageUrl;
        String str4 = this.message;
        long j10 = this.createdAt;
        String str5 = this.redirectUrl;
        StringBuilder l10 = e.l("NotificationDto(notificationId=", str, ", type=", str2, ", imageUrl=");
        e.v(l10, str3, ", message=", str4, ", createdAt=");
        l10.append(j10);
        l10.append(", redirectUrl=");
        l10.append(str5);
        l10.append(")");
        return l10.toString();
    }
}
