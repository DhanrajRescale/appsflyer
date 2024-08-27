package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/data/model/GroupMembersDto;", HttpUrl.FRAGMENT_ENCODE_SET, "members", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/GroupMember;", "endOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/Boolean;)V", "getEndOfResponse", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMembers", "()Ljava/util/List;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupMembersDto {
    public static final int $stable = 8;

    @SerializedName("end_of_response")
    private final Boolean endOfResponse;

    @SerializedName("members")
    private final List<GroupMember> members;

    public GroupMembersDto(List<GroupMember> list, Boolean bool) {
        this.members = list;
        this.endOfResponse = bool;
    }

    public final Boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    public final List<GroupMember> getMembers() {
        return this.members;
    }
}
