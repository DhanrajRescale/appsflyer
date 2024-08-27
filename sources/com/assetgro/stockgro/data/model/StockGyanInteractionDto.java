package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/data/model/StockGyanInteractionDto;", HttpUrl.FRAGMENT_ENCODE_SET, "cardId", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "source", "isLiked", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCardId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSource", "getUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/data/model/StockGyanInteractionDto;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockGyanInteractionDto {
    public static final int $stable = 0;

    @SerializedName("card_id")
    private final String cardId;

    @SerializedName("is_liked")
    private final Boolean isLiked;

    @SerializedName("source")
    private final String source;

    @SerializedName("user_id")
    private final String userId;

    public StockGyanInteractionDto(String str, String str2, String str3, Boolean bool) {
        this.cardId = str;
        this.userId = str2;
        this.source = str3;
        this.isLiked = bool;
    }

    public static /* synthetic */ StockGyanInteractionDto copy$default(StockGyanInteractionDto stockGyanInteractionDto, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stockGyanInteractionDto.cardId;
        }
        if ((i10 & 2) != 0) {
            str2 = stockGyanInteractionDto.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = stockGyanInteractionDto.source;
        }
        if ((i10 & 8) != 0) {
            bool = stockGyanInteractionDto.isLiked;
        }
        return stockGyanInteractionDto.copy(str, str2, str3, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsLiked() {
        return this.isLiked;
    }

    @NotNull
    public final StockGyanInteractionDto copy(String cardId, String userId, String source, Boolean isLiked) {
        return new StockGyanInteractionDto(cardId, userId, source, isLiked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockGyanInteractionDto)) {
            return false;
        }
        StockGyanInteractionDto stockGyanInteractionDto = (StockGyanInteractionDto) other;
        return Intrinsics.a(this.cardId, stockGyanInteractionDto.cardId) && Intrinsics.a(this.userId, stockGyanInteractionDto.userId) && Intrinsics.a(this.source, stockGyanInteractionDto.source) && Intrinsics.a(this.isLiked, stockGyanInteractionDto.isLiked);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.cardId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isLiked;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isLiked() {
        return this.isLiked;
    }

    @NotNull
    public String toString() {
        String str = this.cardId;
        String str2 = this.userId;
        String str3 = this.source;
        Boolean bool = this.isLiked;
        StringBuilder l10 = e.l("StockGyanInteractionDto(cardId=", str, ", userId=", str2, ", source=");
        l10.append(str3);
        l10.append(", isLiked=");
        l10.append(bool);
        l10.append(")");
        return l10.toString();
    }
}
