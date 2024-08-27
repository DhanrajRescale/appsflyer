package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/assetgro/stockgro/data/model/StickersDto;", HttpUrl.FRAGMENT_ENCODE_SET, "stickers", "Lcom/assetgro/stockgro/data/model/Stickers;", "(Lcom/assetgro/stockgro/data/model/Stickers;)V", "getStickers", "()Lcom/assetgro/stockgro/data/model/Stickers;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StickersDto {
    public static final int $stable = 8;

    @SerializedName("stickers")
    private final Stickers stickers;

    public StickersDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StickersDto copy$default(StickersDto stickersDto, Stickers stickers, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stickers = stickersDto.stickers;
        }
        return stickersDto.copy(stickers);
    }

    /* renamed from: component1, reason: from getter */
    public final Stickers getStickers() {
        return this.stickers;
    }

    @NotNull
    public final StickersDto copy(Stickers stickers) {
        return new StickersDto(stickers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StickersDto) && Intrinsics.a(this.stickers, ((StickersDto) other).stickers);
    }

    public final Stickers getStickers() {
        return this.stickers;
    }

    public int hashCode() {
        Stickers stickers = this.stickers;
        if (stickers == null) {
            return 0;
        }
        return stickers.hashCode();
    }

    @NotNull
    public String toString() {
        return "StickersDto(stickers=" + this.stickers + ")";
    }

    public StickersDto(Stickers stickers) {
        this.stickers = stickers;
    }

    public /* synthetic */ StickersDto(Stickers stickers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : stickers);
    }
}
