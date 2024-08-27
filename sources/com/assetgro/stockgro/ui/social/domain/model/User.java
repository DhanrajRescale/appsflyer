package com.assetgro.stockgro.ui.social.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/User;", HttpUrl.FRAGMENT_ENCODE_SET, "userId", HttpUrl.FRAGMENT_ENCODE_SET, "memberName", "displayPicture", "username", "isExpert", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplayPicture", "()Ljava/lang/String;", "()Z", "getMemberName", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class User {
    public static final int $stable = 0;
    private final String displayPicture;
    private final boolean isExpert;
    private final String memberName;

    @NotNull
    private final String userId;
    private final String username;

    public User(@NotNull String userId, String str, String str2, String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.memberName = str;
        this.displayPicture = str2;
        this.username = str3;
        this.isExpert = z10;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = user.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = user.memberName;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = user.displayPicture;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = user.username;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = user.isExpert;
        }
        return user.copy(str, str5, str6, str7, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMemberName() {
        return this.memberName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    @NotNull
    public final User copy(@NotNull String userId, String memberName, String displayPicture, String username, boolean isExpert) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new User(userId, memberName, displayPicture, username, isExpert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.a(this.userId, user.userId) && Intrinsics.a(this.memberName, user.memberName) && Intrinsics.a(this.displayPicture, user.displayPicture) && Intrinsics.a(this.username, user.username) && this.isExpert == user.isExpert;
    }

    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    public final String getMemberName() {
        return this.memberName;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = this.userId.hashCode() * 31;
        String str = this.memberName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayPicture;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.username;
        return Boolean.hashCode(this.isExpert) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isExpert() {
        return this.isExpert;
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.memberName;
        String str3 = this.displayPicture;
        String str4 = this.username;
        boolean z10 = this.isExpert;
        StringBuilder l10 = e.l("User(userId=", str, ", memberName=", str2, ", displayPicture=");
        e.v(l10, str3, ", username=", str4, ", isExpert=");
        return da.e.o(l10, z10, ")");
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? "@username" : str4, z10);
    }
}
