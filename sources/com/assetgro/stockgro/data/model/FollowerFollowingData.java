package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/model/FollowerFollowingData;", HttpUrl.FRAGMENT_ENCODE_SET, "userFollowerFollowings", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/UserFollowerFollowing;", "titleFollowerFollowing", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;)V", "getTitleFollowerFollowing", "()Ljava/lang/String;", "setTitleFollowerFollowing", "(Ljava/lang/String;)V", "getUserFollowerFollowings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FollowerFollowingData {
    public static final int $stable = 8;
    private String titleFollowerFollowing;

    @SerializedName(alternate = {"userFollowing"}, value = "userFollowers")
    private final List<UserFollowerFollowing> userFollowerFollowings;

    public FollowerFollowingData(List<UserFollowerFollowing> list, String str) {
        this.userFollowerFollowings = list;
        this.titleFollowerFollowing = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowerFollowingData copy$default(FollowerFollowingData followerFollowingData, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = followerFollowingData.userFollowerFollowings;
        }
        if ((i10 & 2) != 0) {
            str = followerFollowingData.titleFollowerFollowing;
        }
        return followerFollowingData.copy(list, str);
    }

    public final List<UserFollowerFollowing> component1() {
        return this.userFollowerFollowings;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleFollowerFollowing() {
        return this.titleFollowerFollowing;
    }

    @NotNull
    public final FollowerFollowingData copy(List<UserFollowerFollowing> userFollowerFollowings, String titleFollowerFollowing) {
        return new FollowerFollowingData(userFollowerFollowings, titleFollowerFollowing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowerFollowingData)) {
            return false;
        }
        FollowerFollowingData followerFollowingData = (FollowerFollowingData) other;
        return Intrinsics.a(this.userFollowerFollowings, followerFollowingData.userFollowerFollowings) && Intrinsics.a(this.titleFollowerFollowing, followerFollowingData.titleFollowerFollowing);
    }

    public final String getTitleFollowerFollowing() {
        return this.titleFollowerFollowing;
    }

    public final List<UserFollowerFollowing> getUserFollowerFollowings() {
        return this.userFollowerFollowings;
    }

    public int hashCode() {
        List<UserFollowerFollowing> list = this.userFollowerFollowings;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.titleFollowerFollowing;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setTitleFollowerFollowing(String str) {
        this.titleFollowerFollowing = str;
    }

    @NotNull
    public String toString() {
        return "FollowerFollowingData(userFollowerFollowings=" + this.userFollowerFollowings + ", titleFollowerFollowing=" + this.titleFollowerFollowing + ")";
    }

    public /* synthetic */ FollowerFollowingData(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? "Followers" : str);
    }
}
