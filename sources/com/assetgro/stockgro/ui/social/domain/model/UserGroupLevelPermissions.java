package com.assetgro.stockgro.ui.social.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJV\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006'"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/UserGroupLevelPermissions;", "Landroid/os/Parcelable;", "canForwardGroupMessage", HttpUrl.FRAGMENT_ENCODE_SET, "canReportGroupMessage", "canDeleteGroupMessage", "canPinGroupMessage", "canReplyToGroupMessage", "canShareGroupMessage", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCanDeleteGroupMessage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanForwardGroupMessage", "getCanPinGroupMessage", "getCanReplyToGroupMessage", "getCanReportGroupMessage", "getCanShareGroupMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/ui/social/domain/model/UserGroupLevelPermissions;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserGroupLevelPermissions implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UserGroupLevelPermissions> CREATOR = new Creator();
    private final Boolean canDeleteGroupMessage;
    private final Boolean canForwardGroupMessage;
    private final Boolean canPinGroupMessage;
    private final Boolean canReplyToGroupMessage;
    private final Boolean canReportGroupMessage;
    private final Boolean canShareGroupMessage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UserGroupLevelPermissions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserGroupLevelPermissions createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserGroupLevelPermissions(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserGroupLevelPermissions[] newArray(int i10) {
            return new UserGroupLevelPermissions[i10];
        }
    }

    public UserGroupLevelPermissions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UserGroupLevelPermissions copy$default(UserGroupLevelPermissions userGroupLevelPermissions, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = userGroupLevelPermissions.canForwardGroupMessage;
        }
        if ((i10 & 2) != 0) {
            bool2 = userGroupLevelPermissions.canReportGroupMessage;
        }
        Boolean bool7 = bool2;
        if ((i10 & 4) != 0) {
            bool3 = userGroupLevelPermissions.canDeleteGroupMessage;
        }
        Boolean bool8 = bool3;
        if ((i10 & 8) != 0) {
            bool4 = userGroupLevelPermissions.canPinGroupMessage;
        }
        Boolean bool9 = bool4;
        if ((i10 & 16) != 0) {
            bool5 = userGroupLevelPermissions.canReplyToGroupMessage;
        }
        Boolean bool10 = bool5;
        if ((i10 & 32) != 0) {
            bool6 = userGroupLevelPermissions.canShareGroupMessage;
        }
        return userGroupLevelPermissions.copy(bool, bool7, bool8, bool9, bool10, bool6);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getCanForwardGroupMessage() {
        return this.canForwardGroupMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getCanReportGroupMessage() {
        return this.canReportGroupMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getCanDeleteGroupMessage() {
        return this.canDeleteGroupMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getCanPinGroupMessage() {
        return this.canPinGroupMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getCanReplyToGroupMessage() {
        return this.canReplyToGroupMessage;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getCanShareGroupMessage() {
        return this.canShareGroupMessage;
    }

    @NotNull
    public final UserGroupLevelPermissions copy(Boolean canForwardGroupMessage, Boolean canReportGroupMessage, Boolean canDeleteGroupMessage, Boolean canPinGroupMessage, Boolean canReplyToGroupMessage, Boolean canShareGroupMessage) {
        return new UserGroupLevelPermissions(canForwardGroupMessage, canReportGroupMessage, canDeleteGroupMessage, canPinGroupMessage, canReplyToGroupMessage, canShareGroupMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserGroupLevelPermissions)) {
            return false;
        }
        UserGroupLevelPermissions userGroupLevelPermissions = (UserGroupLevelPermissions) other;
        return Intrinsics.a(this.canForwardGroupMessage, userGroupLevelPermissions.canForwardGroupMessage) && Intrinsics.a(this.canReportGroupMessage, userGroupLevelPermissions.canReportGroupMessage) && Intrinsics.a(this.canDeleteGroupMessage, userGroupLevelPermissions.canDeleteGroupMessage) && Intrinsics.a(this.canPinGroupMessage, userGroupLevelPermissions.canPinGroupMessage) && Intrinsics.a(this.canReplyToGroupMessage, userGroupLevelPermissions.canReplyToGroupMessage) && Intrinsics.a(this.canShareGroupMessage, userGroupLevelPermissions.canShareGroupMessage);
    }

    public final Boolean getCanDeleteGroupMessage() {
        return this.canDeleteGroupMessage;
    }

    public final Boolean getCanForwardGroupMessage() {
        return this.canForwardGroupMessage;
    }

    public final Boolean getCanPinGroupMessage() {
        return this.canPinGroupMessage;
    }

    public final Boolean getCanReplyToGroupMessage() {
        return this.canReplyToGroupMessage;
    }

    public final Boolean getCanReportGroupMessage() {
        return this.canReportGroupMessage;
    }

    public final Boolean getCanShareGroupMessage() {
        return this.canShareGroupMessage;
    }

    public int hashCode() {
        Boolean bool = this.canForwardGroupMessage;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.canReportGroupMessage;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canDeleteGroupMessage;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canPinGroupMessage;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canReplyToGroupMessage;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canShareGroupMessage;
        return hashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserGroupLevelPermissions(canForwardGroupMessage=" + this.canForwardGroupMessage + ", canReportGroupMessage=" + this.canReportGroupMessage + ", canDeleteGroupMessage=" + this.canDeleteGroupMessage + ", canPinGroupMessage=" + this.canPinGroupMessage + ", canReplyToGroupMessage=" + this.canReplyToGroupMessage + ", canShareGroupMessage=" + this.canShareGroupMessage + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Boolean bool = this.canForwardGroupMessage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        Boolean bool2 = this.canReportGroupMessage;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool2);
        }
        Boolean bool3 = this.canDeleteGroupMessage;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool3);
        }
        Boolean bool4 = this.canPinGroupMessage;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool4);
        }
        Boolean bool5 = this.canReplyToGroupMessage;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool5);
        }
        Boolean bool6 = this.canShareGroupMessage;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool6);
        }
    }

    public UserGroupLevelPermissions(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.canForwardGroupMessage = bool;
        this.canReportGroupMessage = bool2;
        this.canDeleteGroupMessage = bool3;
        this.canPinGroupMessage = bool4;
        this.canReplyToGroupMessage = bool5;
        this.canShareGroupMessage = bool6;
    }

    public /* synthetic */ UserGroupLevelPermissions(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2, (i10 & 4) != 0 ? Boolean.FALSE : bool3, (i10 & 8) != 0 ? Boolean.FALSE : bool4, (i10 & 16) != 0 ? Boolean.FALSE : bool5, (i10 & 32) != 0 ? Boolean.FALSE : bool6);
    }
}
