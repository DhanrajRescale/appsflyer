package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/model/CreateGroupSearchResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "universeUsers", "Lcom/assetgro/stockgro/data/model/CreateGroupUsersResponse;", "followerUsers", "(Lcom/assetgro/stockgro/data/model/CreateGroupUsersResponse;Lcom/assetgro/stockgro/data/model/CreateGroupUsersResponse;)V", "getFollowerUsers", "()Lcom/assetgro/stockgro/data/model/CreateGroupUsersResponse;", "getUniverseUsers", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CreateGroupSearchResponse {
    public static final int $stable = 8;

    @SerializedName("follower_users")
    @NotNull
    private final CreateGroupUsersResponse followerUsers;

    @SerializedName("universe_users")
    @NotNull
    private final CreateGroupUsersResponse universeUsers;

    public CreateGroupSearchResponse(@NotNull CreateGroupUsersResponse universeUsers, @NotNull CreateGroupUsersResponse followerUsers) {
        Intrinsics.checkNotNullParameter(universeUsers, "universeUsers");
        Intrinsics.checkNotNullParameter(followerUsers, "followerUsers");
        this.universeUsers = universeUsers;
        this.followerUsers = followerUsers;
    }

    public static /* synthetic */ CreateGroupSearchResponse copy$default(CreateGroupSearchResponse createGroupSearchResponse, CreateGroupUsersResponse createGroupUsersResponse, CreateGroupUsersResponse createGroupUsersResponse2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            createGroupUsersResponse = createGroupSearchResponse.universeUsers;
        }
        if ((i10 & 2) != 0) {
            createGroupUsersResponse2 = createGroupSearchResponse.followerUsers;
        }
        return createGroupSearchResponse.copy(createGroupUsersResponse, createGroupUsersResponse2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CreateGroupUsersResponse getUniverseUsers() {
        return this.universeUsers;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CreateGroupUsersResponse getFollowerUsers() {
        return this.followerUsers;
    }

    @NotNull
    public final CreateGroupSearchResponse copy(@NotNull CreateGroupUsersResponse universeUsers, @NotNull CreateGroupUsersResponse followerUsers) {
        Intrinsics.checkNotNullParameter(universeUsers, "universeUsers");
        Intrinsics.checkNotNullParameter(followerUsers, "followerUsers");
        return new CreateGroupSearchResponse(universeUsers, followerUsers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateGroupSearchResponse)) {
            return false;
        }
        CreateGroupSearchResponse createGroupSearchResponse = (CreateGroupSearchResponse) other;
        return Intrinsics.a(this.universeUsers, createGroupSearchResponse.universeUsers) && Intrinsics.a(this.followerUsers, createGroupSearchResponse.followerUsers);
    }

    @NotNull
    public final CreateGroupUsersResponse getFollowerUsers() {
        return this.followerUsers;
    }

    @NotNull
    public final CreateGroupUsersResponse getUniverseUsers() {
        return this.universeUsers;
    }

    public int hashCode() {
        return this.followerUsers.hashCode() + (this.universeUsers.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CreateGroupSearchResponse(universeUsers=" + this.universeUsers + ", followerUsers=" + this.followerUsers + ")";
    }
}
