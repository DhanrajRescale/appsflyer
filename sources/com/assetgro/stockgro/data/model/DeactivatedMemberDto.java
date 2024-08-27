package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/model/DeactivatedMemberDto;", HttpUrl.FRAGMENT_ENCODE_SET, "chatRole", HttpUrl.FRAGMENT_ENCODE_SET, "limit", HttpUrl.FRAGMENT_ENCODE_SET, "offset", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getChatRole", "()Ljava/lang/String;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/assetgro/stockgro/data/model/DeactivatedMemberDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DeactivatedMemberDto {
    public static final int $stable = 0;

    @SerializedName("chat_role")
    private final String chatRole;

    @SerializedName("limit")
    private final Integer limit;

    @SerializedName("offset")
    private final Integer offset;

    public DeactivatedMemberDto(String str, Integer num, Integer num2) {
        this.chatRole = str;
        this.limit = num;
        this.offset = num2;
    }

    public static /* synthetic */ DeactivatedMemberDto copy$default(DeactivatedMemberDto deactivatedMemberDto, String str, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deactivatedMemberDto.chatRole;
        }
        if ((i10 & 2) != 0) {
            num = deactivatedMemberDto.limit;
        }
        if ((i10 & 4) != 0) {
            num2 = deactivatedMemberDto.offset;
        }
        return deactivatedMemberDto.copy(str, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatRole() {
        return this.chatRole;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @NotNull
    public final DeactivatedMemberDto copy(String chatRole, Integer limit, Integer offset) {
        return new DeactivatedMemberDto(chatRole, limit, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeactivatedMemberDto)) {
            return false;
        }
        DeactivatedMemberDto deactivatedMemberDto = (DeactivatedMemberDto) other;
        return Intrinsics.a(this.chatRole, deactivatedMemberDto.chatRole) && Intrinsics.a(this.limit, deactivatedMemberDto.limit) && Intrinsics.a(this.offset, deactivatedMemberDto.offset);
    }

    public final String getChatRole() {
        return this.chatRole;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public int hashCode() {
        String str = this.chatRole;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.limit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offset;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeactivatedMemberDto(chatRole=" + this.chatRole + ", limit=" + this.limit + ", offset=" + this.offset + ")";
    }
}
