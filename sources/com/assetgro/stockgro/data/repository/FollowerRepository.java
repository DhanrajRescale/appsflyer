package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.CreateGroupSearchResponse;
import com.assetgro.stockgro.data.model.CreateGroupUsersResponse;
import com.assetgro.stockgro.data.model.FollowerDto;
import com.assetgro.stockgro.data.model.MemberInvitedGroupsResponse;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.FriendRequestDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\n2\u0006\u0010\t\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016JL\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\n2\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJT\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\n2\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00100\n2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b#\u0010$J$\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\n2\u0006\u0010\t\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b%\u0010\fR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/data/repository/FollowerRepository;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getUserId", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/FollowerDto;", "getFriends", "uuid", "Lnv/v0;", "addFriend", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "offset", "limit", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", "Lcom/assetgro/stockgro/data/model/CreateGroupUsersResponse;", "getCreateGroupFollowers", "(IILyt/a;)Ljava/lang/Object;", "groupId", "getCreateGroupFollowersAddMembers", "(IILjava/lang/String;Lyt/a;)Ljava/lang/Object;", "searchStr", "fOffset", "fLimit", "Lcom/assetgro/stockgro/data/model/CreateGroupSearchResponse;", "getCreateGroupUniversalFollowers", "(Ljava/lang/String;IIIILyt/a;)Ljava/lang/Object;", "getCreateGroupUniversalFollowersAddMembers", "(Ljava/lang/String;IIIILjava/lang/String;Lyt/a;)Ljava/lang/Object;", "sortDesc", HttpUrl.FRAGMENT_ENCODE_SET, "withInviteCount", "Lcom/assetgro/stockgro/data/model/MemberInvitedGroupsResponse;", "getMemberInvitedGroups", "(IILjava/lang/String;ZLyt/a;)Ljava/lang/Object;", "unfriend", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FollowerRepository {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public FollowerRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
    }

    public static /* synthetic */ Object getCreateGroupFollowers$default(FollowerRepository followerRepository, int i10, int i11, yt.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 10;
        }
        return followerRepository.getCreateGroupFollowers(i10, i11, aVar);
    }

    public static /* synthetic */ Object getCreateGroupFollowersAddMembers$default(FollowerRepository followerRepository, int i10, int i11, String str, yt.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 10;
        }
        return followerRepository.getCreateGroupFollowersAddMembers(i10, i11, str, aVar);
    }

    public static /* synthetic */ Object getCreateGroupUniversalFollowers$default(FollowerRepository followerRepository, String str, int i10, int i11, int i12, int i13, yt.a aVar, int i14, Object obj) {
        int i15;
        int i16;
        int i17;
        int i18;
        if ((i14 & 2) != 0) {
            i15 = 0;
        } else {
            i15 = i10;
        }
        if ((i14 & 4) != 0) {
            i16 = 10;
        } else {
            i16 = i11;
        }
        if ((i14 & 8) != 0) {
            i17 = 10;
        } else {
            i17 = i12;
        }
        if ((i14 & 16) != 0) {
            i18 = 0;
        } else {
            i18 = i13;
        }
        return followerRepository.getCreateGroupUniversalFollowers(str, i15, i16, i17, i18, aVar);
    }

    public static /* synthetic */ Object getCreateGroupUniversalFollowersAddMembers$default(FollowerRepository followerRepository, String str, int i10, int i11, int i12, int i13, String str2, yt.a aVar, int i14, Object obj) {
        int i15;
        int i16;
        int i17;
        int i18;
        if ((i14 & 2) != 0) {
            i15 = 0;
        } else {
            i15 = i10;
        }
        if ((i14 & 4) != 0) {
            i16 = 10;
        } else {
            i16 = i11;
        }
        if ((i14 & 8) != 0) {
            i17 = 10;
        } else {
            i17 = i12;
        }
        if ((i14 & 16) != 0) {
            i18 = 0;
        } else {
            i18 = i13;
        }
        return followerRepository.getCreateGroupUniversalFollowersAddMembers(str, i15, i16, i17, i18, str2, aVar);
    }

    public static /* synthetic */ Object getMemberInvitedGroups$default(FollowerRepository followerRepository, int i10, int i11, String str, boolean z10, yt.a aVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str = "is_support_group,is_pinned,last_group_msg_time";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return followerRepository.getMemberInvitedGroups(i10, i11, str2, z10, aVar);
    }

    public final Object addFriend(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<Object>>> aVar) {
        return this.networkService.addFriend(new FriendRequestDto(str), aVar);
    }

    public final Object getCreateGroupFollowers(int i10, int i11, @NotNull yt.a<? super v0<BaseResponseV2Dto<CreateGroupUsersResponse>>> aVar) {
        return this.networkService.getCreateGroupFollowers(i10, i11, aVar);
    }

    public final Object getCreateGroupFollowersAddMembers(int i10, int i11, @NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<CreateGroupUsersResponse>>> aVar) {
        return this.networkService.getCreateGroupFollowersAddMembers(i10, i11, str, aVar);
    }

    public final Object getCreateGroupUniversalFollowers(@NotNull String str, int i10, int i11, int i12, int i13, @NotNull yt.a<? super v0<BaseResponseV2Dto<CreateGroupSearchResponse>>> aVar) {
        return this.networkService.getCreateGroupUniversalFollowers(str, i10, i11, i12, i13, aVar);
    }

    public final Object getCreateGroupUniversalFollowersAddMembers(@NotNull String str, int i10, int i11, int i12, int i13, @NotNull String str2, @NotNull yt.a<? super v0<BaseResponseV2Dto<CreateGroupSearchResponse>>> aVar) {
        return this.networkService.getCreateGroupUniversalFollowersAddMembers(str, i10, i11, i12, i13, str2, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<List<FollowerDto>>> getFriends() {
        return this.networkService.getFriends(this.userPreferences.getUuid());
    }

    public final Object getMemberInvitedGroups(int i10, int i11, @NotNull String str, boolean z10, @NotNull yt.a<? super v0<BaseResponseV2Dto<MemberInvitedGroupsResponse>>> aVar) {
        return this.networkService.getMemberInvitedGroups(i10, i11, str, z10, aVar);
    }

    public final String getUserId() {
        return this.userPreferences.getUuid();
    }

    public final Object unfriend(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<Object>>> aVar) {
        return this.networkService.unfriend(new FriendRequestDto(str), aVar);
    }
}
