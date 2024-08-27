package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserBlockStatusDao;", HttpUrl.FRAGMENT_ENCODE_SET, "iBlocked", HttpUrl.FRAGMENT_ENCODE_SET, "iAmBlocked", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getIAmBlocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIBlocked", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/data/model/UserBlockStatusDao;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserBlockStatusDao {
    public static final int $stable = 0;

    @SerializedName("iam_blocked")
    private final Boolean iAmBlocked;

    @SerializedName("i_blocked")
    private final Boolean iBlocked;

    public UserBlockStatusDao(Boolean bool, Boolean bool2) {
        this.iBlocked = bool;
        this.iAmBlocked = bool2;
    }

    public static /* synthetic */ UserBlockStatusDao copy$default(UserBlockStatusDao userBlockStatusDao, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = userBlockStatusDao.iBlocked;
        }
        if ((i10 & 2) != 0) {
            bool2 = userBlockStatusDao.iAmBlocked;
        }
        return userBlockStatusDao.copy(bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIBlocked() {
        return this.iBlocked;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIAmBlocked() {
        return this.iAmBlocked;
    }

    @NotNull
    public final UserBlockStatusDao copy(Boolean iBlocked, Boolean iAmBlocked) {
        return new UserBlockStatusDao(iBlocked, iAmBlocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBlockStatusDao)) {
            return false;
        }
        UserBlockStatusDao userBlockStatusDao = (UserBlockStatusDao) other;
        return Intrinsics.a(this.iBlocked, userBlockStatusDao.iBlocked) && Intrinsics.a(this.iAmBlocked, userBlockStatusDao.iAmBlocked);
    }

    public final Boolean getIAmBlocked() {
        return this.iAmBlocked;
    }

    public final Boolean getIBlocked() {
        return this.iBlocked;
    }

    public int hashCode() {
        Boolean bool = this.iBlocked;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.iAmBlocked;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserBlockStatusDao(iBlocked=" + this.iBlocked + ", iAmBlocked=" + this.iAmBlocked + ")";
    }
}
