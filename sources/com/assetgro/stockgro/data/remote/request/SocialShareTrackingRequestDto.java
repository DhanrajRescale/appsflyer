package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/SocialShareTrackingRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "postId", HttpUrl.FRAGMENT_ENCODE_SET, "clientTime", HttpUrl.FRAGMENT_ENCODE_SET, "destination", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getClientTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDestination", "()Ljava/lang/String;", "getPostId", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/assetgro/stockgro/data/remote/request/SocialShareTrackingRequestDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialShareTrackingRequestDto {
    public static final int $stable = 0;

    @SerializedName("client_time")
    private final Long clientTime;

    @SerializedName("destination")
    @NotNull
    private final String destination;

    @SerializedName("post_id")
    @NotNull
    private final String postId;

    public SocialShareTrackingRequestDto(@NotNull String postId, Long l10, @NotNull String destination) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.postId = postId;
        this.clientTime = l10;
        this.destination = destination;
    }

    public static /* synthetic */ SocialShareTrackingRequestDto copy$default(SocialShareTrackingRequestDto socialShareTrackingRequestDto, String str, Long l10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = socialShareTrackingRequestDto.postId;
        }
        if ((i10 & 2) != 0) {
            l10 = socialShareTrackingRequestDto.clientTime;
        }
        if ((i10 & 4) != 0) {
            str2 = socialShareTrackingRequestDto.destination;
        }
        return socialShareTrackingRequestDto.copy(str, l10, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPostId() {
        return this.postId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getClientTime() {
        return this.clientTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    @NotNull
    public final SocialShareTrackingRequestDto copy(@NotNull String postId, Long clientTime, @NotNull String destination) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new SocialShareTrackingRequestDto(postId, clientTime, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialShareTrackingRequestDto)) {
            return false;
        }
        SocialShareTrackingRequestDto socialShareTrackingRequestDto = (SocialShareTrackingRequestDto) other;
        return Intrinsics.a(this.postId, socialShareTrackingRequestDto.postId) && Intrinsics.a(this.clientTime, socialShareTrackingRequestDto.clientTime) && Intrinsics.a(this.destination, socialShareTrackingRequestDto.destination);
    }

    public final Long getClientTime() {
        return this.clientTime;
    }

    @NotNull
    public final String getDestination() {
        return this.destination;
    }

    @NotNull
    public final String getPostId() {
        return this.postId;
    }

    public int hashCode() {
        int hashCode = this.postId.hashCode() * 31;
        Long l10 = this.clientTime;
        return this.destination.hashCode() + ((hashCode + (l10 == null ? 0 : l10.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.postId;
        Long l10 = this.clientTime;
        String str2 = this.destination;
        StringBuilder sb2 = new StringBuilder("SocialShareTrackingRequestDto(postId=");
        sb2.append(str);
        sb2.append(", clientTime=");
        sb2.append(l10);
        sb2.append(", destination=");
        return d.o(sb2, str2, ")");
    }
}
