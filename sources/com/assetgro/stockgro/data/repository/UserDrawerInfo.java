package com.assetgro.stockgro.data.repository;

import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/repository/UserDrawerInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "avatar", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getDisplayName", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserDrawerInfo {
    public static final int $stable = 0;
    private final String avatar;

    @NotNull
    private final String displayName;

    public UserDrawerInfo(@NotNull String displayName, String str) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.displayName = displayName;
        this.avatar = str;
    }

    public static /* synthetic */ UserDrawerInfo copy$default(UserDrawerInfo userDrawerInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userDrawerInfo.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = userDrawerInfo.avatar;
        }
        return userDrawerInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final UserDrawerInfo copy(@NotNull String displayName, String avatar) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new UserDrawerInfo(displayName, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDrawerInfo)) {
            return false;
        }
        UserDrawerInfo userDrawerInfo = (UserDrawerInfo) other;
        return Intrinsics.a(this.displayName, userDrawerInfo.displayName) && Intrinsics.a(this.avatar, userDrawerInfo.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        int hashCode = this.displayName.hashCode() * 31;
        String str = this.avatar;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return h.s("UserDrawerInfo(displayName=", this.displayName, ", avatar=", this.avatar, ")");
    }
}
