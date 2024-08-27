package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/model/SocialGlobalRoleDto;", HttpUrl.FRAGMENT_ENCODE_SET, "limit", HttpUrl.FRAGMENT_ENCODE_SET, "userIds", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Integer;Ljava/util/List;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserIds", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/assetgro/stockgro/data/model/SocialGlobalRoleDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialGlobalRoleDto {
    public static final int $stable = 8;

    @SerializedName("limit")
    private final Integer limit;

    @SerializedName("user_ids")
    @NotNull
    private final List<String> userIds;

    public SocialGlobalRoleDto(Integer num, @NotNull List<String> userIds) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.limit = num;
        this.userIds = userIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialGlobalRoleDto copy$default(SocialGlobalRoleDto socialGlobalRoleDto, Integer num, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = socialGlobalRoleDto.limit;
        }
        if ((i10 & 2) != 0) {
            list = socialGlobalRoleDto.userIds;
        }
        return socialGlobalRoleDto.copy(num, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final List<String> component2() {
        return this.userIds;
    }

    @NotNull
    public final SocialGlobalRoleDto copy(Integer limit, @NotNull List<String> userIds) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        return new SocialGlobalRoleDto(limit, userIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialGlobalRoleDto)) {
            return false;
        }
        SocialGlobalRoleDto socialGlobalRoleDto = (SocialGlobalRoleDto) other;
        return Intrinsics.a(this.limit, socialGlobalRoleDto.limit) && Intrinsics.a(this.userIds, socialGlobalRoleDto.userIds);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final List<String> getUserIds() {
        return this.userIds;
    }

    public int hashCode() {
        Integer num = this.limit;
        return this.userIds.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "SocialGlobalRoleDto(limit=" + this.limit + ", userIds=" + this.userIds + ")";
    }
}
