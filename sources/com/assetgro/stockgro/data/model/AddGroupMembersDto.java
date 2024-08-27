package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/data/model/AddGroupMembersDto;", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "userIds", HttpUrl.FRAGMENT_ENCODE_SET, "role", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getRole", "getUserIds", "()Ljava/util/List;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddGroupMembersDto {
    public static final int $stable = 8;

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName("role")
    private final String role;

    @SerializedName("user_ids")
    @NotNull
    private final List<String> userIds;

    public AddGroupMembersDto(String str, @NotNull List<String> userIds, String str2) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.groupId = str;
        this.userIds = userIds;
        this.role = str2;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getRole() {
        return this.role;
    }

    @NotNull
    public final List<String> getUserIds() {
        return this.userIds;
    }
}
