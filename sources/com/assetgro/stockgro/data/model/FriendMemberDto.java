package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/assetgro/stockgro/data/model/FriendMemberDto;", HttpUrl.FRAGMENT_ENCODE_SET, "friends", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/GroupMember;", "endOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Z)V", "getEndOfResponse", "()Z", "getFriends", "()Ljava/util/List;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FriendMemberDto {
    public static final int $stable = 8;

    @SerializedName("end_of_response")
    private final boolean endOfResponse;

    @SerializedName("friends")
    private final List<GroupMember> friends;

    public FriendMemberDto(List<GroupMember> list, boolean z10) {
        this.friends = list;
        this.endOfResponse = z10;
    }

    public final boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    public final List<GroupMember> getFriends() {
        return this.friends;
    }

    public /* synthetic */ FriendMemberDto(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
