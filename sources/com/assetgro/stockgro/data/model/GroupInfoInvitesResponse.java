package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/GroupInfoInvitesResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "members", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/GroupInfoInviteItem;", "totalInvite", HttpUrl.FRAGMENT_ENCODE_SET, "endOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;IZ)V", "getEndOfResponse", "()Z", "getMembers", "()Ljava/util/List;", "getTotalInvite", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GroupInfoInvitesResponse {
    public static final int $stable = 8;

    @SerializedName("end_of_response")
    private final boolean endOfResponse;

    @SerializedName("members")
    @NotNull
    private final List<GroupInfoInviteItem> members;

    @SerializedName("total_invite")
    private final int totalInvite;

    public GroupInfoInvitesResponse(@NotNull List<GroupInfoInviteItem> members, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(members, "members");
        this.members = members;
        this.totalInvite = i10;
        this.endOfResponse = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupInfoInvitesResponse copy$default(GroupInfoInvitesResponse groupInfoInvitesResponse, List list, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = groupInfoInvitesResponse.members;
        }
        if ((i11 & 2) != 0) {
            i10 = groupInfoInvitesResponse.totalInvite;
        }
        if ((i11 & 4) != 0) {
            z10 = groupInfoInvitesResponse.endOfResponse;
        }
        return groupInfoInvitesResponse.copy(list, i10, z10);
    }

    @NotNull
    public final List<GroupInfoInviteItem> component1() {
        return this.members;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalInvite() {
        return this.totalInvite;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    @NotNull
    public final GroupInfoInvitesResponse copy(@NotNull List<GroupInfoInviteItem> members, int totalInvite, boolean endOfResponse) {
        Intrinsics.checkNotNullParameter(members, "members");
        return new GroupInfoInvitesResponse(members, totalInvite, endOfResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupInfoInvitesResponse)) {
            return false;
        }
        GroupInfoInvitesResponse groupInfoInvitesResponse = (GroupInfoInvitesResponse) other;
        return Intrinsics.a(this.members, groupInfoInvitesResponse.members) && this.totalInvite == groupInfoInvitesResponse.totalInvite && this.endOfResponse == groupInfoInvitesResponse.endOfResponse;
    }

    public final boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    @NotNull
    public final List<GroupInfoInviteItem> getMembers() {
        return this.members;
    }

    public final int getTotalInvite() {
        return this.totalInvite;
    }

    public int hashCode() {
        return Boolean.hashCode(this.endOfResponse) + e.f(this.totalInvite, this.members.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<GroupInfoInviteItem> list = this.members;
        int i10 = this.totalInvite;
        boolean z10 = this.endOfResponse;
        StringBuilder sb2 = new StringBuilder("GroupInfoInvitesResponse(members=");
        sb2.append(list);
        sb2.append(", totalInvite=");
        sb2.append(i10);
        sb2.append(", endOfResponse=");
        return e.o(sb2, z10, ")");
    }
}
