package com.assetgro.stockgro.data.uimodel;

import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/uimodel/StickerData;", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "url", "stickerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStickerId", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StickerData {
    public static final int $stable = 0;

    @NotNull
    private final String stickerId;

    @NotNull
    private final String type;

    @NotNull
    private final String url;

    public StickerData(@NotNull String type, @NotNull String url, @NotNull String stickerId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        this.type = type;
        this.url = url;
        this.stickerId = stickerId;
    }

    public static /* synthetic */ StickerData copy$default(StickerData stickerData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stickerData.type;
        }
        if ((i10 & 2) != 0) {
            str2 = stickerData.url;
        }
        if ((i10 & 4) != 0) {
            str3 = stickerData.stickerId;
        }
        return stickerData.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStickerId() {
        return this.stickerId;
    }

    @NotNull
    public final StickerData copy(@NotNull String type, @NotNull String url, @NotNull String stickerId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        return new StickerData(type, url, stickerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerData)) {
            return false;
        }
        StickerData stickerData = (StickerData) other;
        return Intrinsics.a(this.type, stickerData.type) && Intrinsics.a(this.url, stickerData.url) && Intrinsics.a(this.stickerId, stickerData.stickerId);
    }

    @NotNull
    public final String getStickerId() {
        return this.stickerId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.stickerId.hashCode() + h.g(this.url, this.type.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.url;
        return d.o(e.l("StickerData(type=", str, ", url=", str2, ", stickerId="), this.stickerId, ")");
    }
}
