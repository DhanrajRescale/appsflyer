package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.UserGroupLevelPermissions;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/UserGroupLevelPermissionsDto;", HttpUrl.FRAGMENT_ENCODE_SET, "canForwardGroupMessage", HttpUrl.FRAGMENT_ENCODE_SET, "canReportGroupMessage", "canDeleteGroupMessage", "canPinGroupMessage", "canReplyToGroupMessage", "canShareGroupMessage", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCanDeleteGroupMessage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanForwardGroupMessage", "getCanPinGroupMessage", "getCanReplyToGroupMessage", "getCanReportGroupMessage", "getCanShareGroupMessage", "toUserGroupLevelPermissions", "Lcom/assetgro/stockgro/ui/social/domain/model/UserGroupLevelPermissions;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserGroupLevelPermissionsDto {
    public static final int $stable = 0;

    @SerializedName("can_delete_group_msg")
    private final Boolean canDeleteGroupMessage;

    @SerializedName("can_forward_group_msg")
    private final Boolean canForwardGroupMessage;

    @SerializedName("can_pin_group_msg")
    private final Boolean canPinGroupMessage;

    @SerializedName("can_reply_group_msg")
    private final Boolean canReplyToGroupMessage;

    @SerializedName("can_report_group_msg")
    private final Boolean canReportGroupMessage;

    @SerializedName("can_share_group_msg")
    private final Boolean canShareGroupMessage;

    public UserGroupLevelPermissionsDto() {
        this(null, null, null, null, null, null, 63, null);
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

    @NotNull
    public final UserGroupLevelPermissions toUserGroupLevelPermissions() {
        return new UserGroupLevelPermissions(this.canForwardGroupMessage, this.canReportGroupMessage, this.canDeleteGroupMessage, this.canPinGroupMessage, this.canReplyToGroupMessage, this.canShareGroupMessage);
    }

    public UserGroupLevelPermissionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.canForwardGroupMessage = bool;
        this.canReportGroupMessage = bool2;
        this.canDeleteGroupMessage = bool3;
        this.canPinGroupMessage = bool4;
        this.canReplyToGroupMessage = bool5;
        this.canShareGroupMessage = bool6;
    }

    public /* synthetic */ UserGroupLevelPermissionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2, (i10 & 4) != 0 ? Boolean.FALSE : bool3, (i10 & 8) != 0 ? Boolean.FALSE : bool4, (i10 & 16) != 0 ? Boolean.FALSE : bool5, (i10 & 32) != 0 ? Boolean.FALSE : bool6);
    }
}
