package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bó\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001f\u0012\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020*\u0018\u00010)j\n\u0012\u0004\u0012\u00020*\u0018\u0001`+\u0012\b\b\u0002\u0010,\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u00020\b\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00104\u001a\u00020\b\u0012\b\b\u0002\u00105\u001a\u00020\b\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u001f\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010@J\t\u0010x\u001a\u00020\u0014HÖ\u0001J\u0019\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020\u0014HÖ\u0001R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u00101\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010FR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010FR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010FR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010FR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010BR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010FR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010FR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010FR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010FR\u0018\u0010>\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010FR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010FR\u0018\u00106\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u001a\u0010?\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010X\u001a\u0004\bV\u0010WR\u0016\u0010-\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010DR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010FR\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010FR\u0016\u00105\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010DR\u0016\u00104\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010DR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010DR\u0016\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010DR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010DR\u001a\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010X\u001a\u0004\b%\u0010WR\u0016\u0010,\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010DR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010F\"\u0004\b]\u0010^R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010FR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010aR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010HR\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010FR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010BR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010FR*\u0010(\u001a\u0016\u0012\u0004\u0012\u00020*\u0018\u00010)j\n\u0012\u0004\u0012\u00020*\u0018\u0001`+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0018\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010FR\u0018\u0010:\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0018\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010FR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010BR\u0016\u0010\u0016\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010HR\u0016\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u001e\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010BR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010F¨\u0006~"}, d2 = {"Lcom/assetgro/stockgro/data/model/Group;", "Landroid/os/Parcelable;", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "id", "displayImageUrl", "coverImageURL", "isLive", HttpUrl.FRAGMENT_ENCODE_SET, "isPopular", "groupName", "description", "type", "mode", "joinStatus", "lastReadMessageTime", HttpUrl.FRAGMENT_ENCODE_SET, "lastReadMessageId", "otherUserId", "memberCount", HttpUrl.FRAGMENT_ENCODE_SET, "memberInviteeCount", "starredMessagesCount", "bannedMembersCount", "isOpenForAudience", "membersCount", "Lcom/assetgro/stockgro/data/model/MembersCount;", "friendUserName", "friendUserId", "friendImageURL", "admins", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/GroupMember;", "moderators", "seeders", "membershipStatus", "Lcom/assetgro/stockgro/data/model/MembershipStatus;", "isSocialAuthRequired", "exitReasons", "Lcom/assetgro/stockgro/data/model/ExitOption;", "reportReasons", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/model/ReportReason;", "Lkotlin/collections/ArrayList;", "isUserBlocked", "iAmBlocked", "blockMessageToShow", "subscriptionPackageInfo", "Lcom/assetgro/stockgro/data/model/SubscriptionPackageInfo;", "allowedToJoin", "inviteLink", "autoDeleteTime", "isFeedEnabled", "isChatDisabled", "groupUIConfig", "Lcom/assetgro/stockgro/data/model/GroupUIConfig;", "tags", "Lcom/assetgro/stockgro/data/model/Tags;", "riaRraInfo", "Lcom/assetgro/stockgro/data/model/RiaRraInfo;", "riaRraUserId", "riaRraDescription", "groupLanding", "hasWriteAccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IIIIZLcom/assetgro/stockgro/data/model/MembersCount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/assetgro/stockgro/data/model/MembershipStatus;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/ArrayList;ZZLjava/lang/String;Lcom/assetgro/stockgro/data/model/SubscriptionPackageInfo;ZLjava/lang/String;Ljava/lang/String;ZZLcom/assetgro/stockgro/data/model/GroupUIConfig;Ljava/util/List;Lcom/assetgro/stockgro/data/model/RiaRraInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAdmins", "()Ljava/util/List;", "getAllowedToJoin", "()Z", "getAutoDeleteTime", "()Ljava/lang/String;", "getBannedMembersCount", "()I", "getBlockMessageToShow", "getCoverImageURL", "getDescription", "getDisplayImageUrl", "getExitReasons", "getFriendImageURL", "getFriendUserId", "getFriendUserName", "getGroupId", "getGroupLanding", "getGroupName", "getGroupUIConfig", "()Lcom/assetgro/stockgro/data/model/GroupUIConfig;", "getHasWriteAccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIAmBlocked", "getId", "getInviteLink", "getJoinStatus", "setJoinStatus", "(Ljava/lang/String;)V", "getLastReadMessageId", "getLastReadMessageTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMemberCount", "getMemberInviteeCount", "getMembersCount", "()Lcom/assetgro/stockgro/data/model/MembersCount;", "getMembershipStatus", "()Lcom/assetgro/stockgro/data/model/MembershipStatus;", "getMode", "getModerators", "getOtherUserId", "getReportReasons", "()Ljava/util/ArrayList;", "getRiaRraDescription", "getRiaRraInfo", "()Lcom/assetgro/stockgro/data/model/RiaRraInfo;", "getRiaRraUserId", "getSeeders", "getStarredMessagesCount", "getSubscriptionPackageInfo", "()Lcom/assetgro/stockgro/data/model/SubscriptionPackageInfo;", "getTags", "getType", "describeContents", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Group implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Group> CREATOR = new Creator();

    @SerializedName("admins")
    private final List<GroupMember> admins;

    @SerializedName("allowed_to_join")
    private final boolean allowedToJoin;

    @SerializedName("auto_delete_time")
    private final String autoDeleteTime;

    @SerializedName("banned_members_count")
    private final int bannedMembersCount;

    @SerializedName("block_message_to_show")
    private final String blockMessageToShow;

    @SerializedName("cover_image_url")
    private final String coverImageURL;

    @SerializedName("description")
    private final String description;

    @SerializedName("image_url")
    private final String displayImageUrl;

    @SerializedName("exit_reasons")
    private final List<ExitOption> exitReasons;

    @SerializedName("friend_display_picture")
    private final String friendImageURL;

    @SerializedName("friend_id")
    private final String friendUserId;

    @SerializedName("friend_name")
    private final String friendUserName;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("group_landing")
    private final String groupLanding;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String groupName;

    @SerializedName("group_ui_config")
    private final GroupUIConfig groupUIConfig;

    @SerializedName("has_write_access")
    private final Boolean hasWriteAccess;

    @SerializedName("iam_blocked")
    private final boolean iAmBlocked;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("invite_link")
    private final String inviteLink;

    @SerializedName("is_chat_disabled")
    private final boolean isChatDisabled;

    @SerializedName("is_feed_enabled")
    private final boolean isFeedEnabled;

    @SerializedName("is_live")
    private final boolean isLive;

    @SerializedName("is_open_for_audience")
    private final boolean isOpenForAudience;

    @SerializedName("is_popular")
    private final boolean isPopular;

    @SerializedName("is_social_auth_required")
    private final Boolean isSocialAuthRequired;

    @SerializedName("i_blocked")
    private final boolean isUserBlocked;
    private String joinStatus;

    @SerializedName("last_read_msg_id")
    private final String lastReadMessageId;

    @SerializedName("last_read_msg_server_micros")
    private final Long lastReadMessageTime;

    @SerializedName("total_members_count")
    private final int memberCount;

    @SerializedName("member_invitee_count")
    private final int memberInviteeCount;

    @SerializedName("members_count")
    @NotNull
    private final MembersCount membersCount;

    @SerializedName("membership_status")
    private final MembershipStatus membershipStatus;

    @SerializedName("mode")
    private final String mode;

    @SerializedName("moderators")
    private final List<GroupMember> moderators;

    @SerializedName("other_user_id")
    private final String otherUserId;

    @SerializedName("msg_report_reasons")
    private final ArrayList<ReportReason> reportReasons;

    @SerializedName("ria_rra_description")
    private final String riaRraDescription;

    @SerializedName("ria_rra_info")
    private final RiaRraInfo riaRraInfo;

    @SerializedName("ria_rra_uuid")
    private final String riaRraUserId;

    @SerializedName("seeders")
    private final List<GroupMember> seeders;

    @SerializedName("starred_message_count")
    private final int starredMessagesCount;

    @SerializedName("package_info")
    @NotNull
    private final SubscriptionPackageInfo subscriptionPackageInfo;

    @SerializedName("tags")
    private final List<Tags> tags;

    @SerializedName("type")
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Group> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Group createFromParcel(@NotNull Parcel parcel) {
            Long l10;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            boolean z12 = parcel.readInt() != 0;
            MembersCount createFromParcel = MembersCount.CREATOR.createFromParcel(parcel);
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                l10 = valueOf3;
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt5);
                int i10 = 0;
                while (i10 != readInt5) {
                    i10 = h.e(GroupMember.CREATOR, parcel, arrayList7, i10, 1);
                    readInt5 = readInt5;
                    valueOf3 = valueOf3;
                }
                l10 = valueOf3;
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt6);
                int i11 = 0;
                while (i11 != readInt6) {
                    i11 = h.e(GroupMember.CREATOR, parcel, arrayList8, i11, 1);
                    readInt6 = readInt6;
                }
                arrayList2 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt7 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt7);
                int i12 = 0;
                while (i12 != readInt7) {
                    i12 = h.e(GroupMember.CREATOR, parcel, arrayList9, i12, 1);
                    readInt7 = readInt7;
                }
                arrayList3 = arrayList9;
            }
            MembershipStatus createFromParcel2 = parcel.readInt() == 0 ? null : MembershipStatus.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt8 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt8);
                int i13 = 0;
                while (i13 != readInt8) {
                    i13 = h.e(ExitOption.CREATOR, parcel, arrayList10, i13, 1);
                    readInt8 = readInt8;
                }
                arrayList4 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt9 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt9);
                int i14 = 0;
                while (i14 != readInt9) {
                    i14 = h.e(ReportReason.CREATOR, parcel, arrayList11, i14, 1);
                    readInt9 = readInt9;
                }
                arrayList5 = arrayList11;
            }
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            String readString15 = parcel.readString();
            SubscriptionPackageInfo createFromParcel3 = SubscriptionPackageInfo.CREATOR.createFromParcel(parcel);
            boolean z15 = parcel.readInt() != 0;
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            GroupUIConfig createFromParcel4 = parcel.readInt() == 0 ? null : GroupUIConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt10 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(readInt10);
                int i15 = 0;
                while (i15 != readInt10) {
                    i15 = h.e(Tags.CREATOR, parcel, arrayList12, i15, 1);
                    readInt10 = readInt10;
                }
                arrayList6 = arrayList12;
            }
            RiaRraInfo createFromParcel5 = parcel.readInt() == 0 ? null : RiaRraInfo.CREATOR.createFromParcel(parcel);
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Group(readString, readString2, readString3, readString4, z10, z11, readString5, readString6, readString7, readString8, readString9, l10, readString10, readString11, readInt, readInt2, readInt3, readInt4, z12, createFromParcel, readString12, readString13, readString14, arrayList, arrayList2, arrayList3, createFromParcel2, valueOf, arrayList4, arrayList5, z13, z14, readString15, createFromParcel3, z15, readString16, readString17, z16, z17, createFromParcel4, arrayList6, createFromParcel5, readString18, readString19, readString20, valueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Group[] newArray(int i10) {
            return new Group[i10];
        }
    }

    public Group(@NotNull String groupId, @NotNull String id2, String str, String str2, boolean z10, boolean z11, @NotNull String groupName, String str3, String str4, String str5, String str6, Long l10, String str7, String str8, int i10, int i11, int i12, int i13, boolean z12, @NotNull MembersCount membersCount, String str9, String str10, String str11, List<GroupMember> list, List<GroupMember> list2, List<GroupMember> list3, MembershipStatus membershipStatus, Boolean bool, List<ExitOption> list4, ArrayList<ReportReason> arrayList, boolean z13, boolean z14, String str12, @NotNull SubscriptionPackageInfo subscriptionPackageInfo, boolean z15, String str13, String str14, boolean z16, boolean z17, GroupUIConfig groupUIConfig, List<Tags> list5, RiaRraInfo riaRraInfo, String str15, String str16, String str17, Boolean bool2) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(membersCount, "membersCount");
        Intrinsics.checkNotNullParameter(subscriptionPackageInfo, "subscriptionPackageInfo");
        this.groupId = groupId;
        this.id = id2;
        this.displayImageUrl = str;
        this.coverImageURL = str2;
        this.isLive = z10;
        this.isPopular = z11;
        this.groupName = groupName;
        this.description = str3;
        this.type = str4;
        this.mode = str5;
        this.joinStatus = str6;
        this.lastReadMessageTime = l10;
        this.lastReadMessageId = str7;
        this.otherUserId = str8;
        this.memberCount = i10;
        this.memberInviteeCount = i11;
        this.starredMessagesCount = i12;
        this.bannedMembersCount = i13;
        this.isOpenForAudience = z12;
        this.membersCount = membersCount;
        this.friendUserName = str9;
        this.friendUserId = str10;
        this.friendImageURL = str11;
        this.admins = list;
        this.moderators = list2;
        this.seeders = list3;
        this.membershipStatus = membershipStatus;
        this.isSocialAuthRequired = bool;
        this.exitReasons = list4;
        this.reportReasons = arrayList;
        this.isUserBlocked = z13;
        this.iAmBlocked = z14;
        this.blockMessageToShow = str12;
        this.subscriptionPackageInfo = subscriptionPackageInfo;
        this.allowedToJoin = z15;
        this.inviteLink = str13;
        this.autoDeleteTime = str14;
        this.isFeedEnabled = z16;
        this.isChatDisabled = z17;
        this.groupUIConfig = groupUIConfig;
        this.tags = list5;
        this.riaRraInfo = riaRraInfo;
        this.riaRraUserId = str15;
        this.riaRraDescription = str16;
        this.groupLanding = str17;
        this.hasWriteAccess = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<GroupMember> getAdmins() {
        return this.admins;
    }

    public final boolean getAllowedToJoin() {
        return this.allowedToJoin;
    }

    public final String getAutoDeleteTime() {
        return this.autoDeleteTime;
    }

    public final int getBannedMembersCount() {
        return this.bannedMembersCount;
    }

    public final String getBlockMessageToShow() {
        return this.blockMessageToShow;
    }

    public final String getCoverImageURL() {
        return this.coverImageURL;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayImageUrl() {
        return this.displayImageUrl;
    }

    public final List<ExitOption> getExitReasons() {
        return this.exitReasons;
    }

    public final String getFriendImageURL() {
        return this.friendImageURL;
    }

    public final String getFriendUserId() {
        return this.friendUserId;
    }

    public final String getFriendUserName() {
        return this.friendUserName;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final String getGroupLanding() {
        return this.groupLanding;
    }

    @NotNull
    public final String getGroupName() {
        return this.groupName;
    }

    public final GroupUIConfig getGroupUIConfig() {
        return this.groupUIConfig;
    }

    public final Boolean getHasWriteAccess() {
        return this.hasWriteAccess;
    }

    public final boolean getIAmBlocked() {
        return this.iAmBlocked;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getInviteLink() {
        return this.inviteLink;
    }

    public final String getJoinStatus() {
        return this.joinStatus;
    }

    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    public final Long getLastReadMessageTime() {
        return this.lastReadMessageTime;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final int getMemberInviteeCount() {
        return this.memberInviteeCount;
    }

    @NotNull
    public final MembersCount getMembersCount() {
        return this.membersCount;
    }

    public final MembershipStatus getMembershipStatus() {
        return this.membershipStatus;
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<GroupMember> getModerators() {
        return this.moderators;
    }

    public final String getOtherUserId() {
        return this.otherUserId;
    }

    public final ArrayList<ReportReason> getReportReasons() {
        return this.reportReasons;
    }

    public final String getRiaRraDescription() {
        return this.riaRraDescription;
    }

    public final RiaRraInfo getRiaRraInfo() {
        return this.riaRraInfo;
    }

    public final String getRiaRraUserId() {
        return this.riaRraUserId;
    }

    public final List<GroupMember> getSeeders() {
        return this.seeders;
    }

    public final int getStarredMessagesCount() {
        return this.starredMessagesCount;
    }

    @NotNull
    public final SubscriptionPackageInfo getSubscriptionPackageInfo() {
        return this.subscriptionPackageInfo;
    }

    public final List<Tags> getTags() {
        return this.tags;
    }

    public final String getType() {
        return this.type;
    }

    /* renamed from: isChatDisabled, reason: from getter */
    public final boolean getIsChatDisabled() {
        return this.isChatDisabled;
    }

    /* renamed from: isFeedEnabled, reason: from getter */
    public final boolean getIsFeedEnabled() {
        return this.isFeedEnabled;
    }

    /* renamed from: isLive, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* renamed from: isOpenForAudience, reason: from getter */
    public final boolean getIsOpenForAudience() {
        return this.isOpenForAudience;
    }

    /* renamed from: isPopular, reason: from getter */
    public final boolean getIsPopular() {
        return this.isPopular;
    }

    /* renamed from: isSocialAuthRequired, reason: from getter */
    public final Boolean getIsSocialAuthRequired() {
        return this.isSocialAuthRequired;
    }

    /* renamed from: isUserBlocked, reason: from getter */
    public final boolean getIsUserBlocked() {
        return this.isUserBlocked;
    }

    public final void setJoinStatus(String str) {
        this.joinStatus = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.groupId);
        parcel.writeString(this.id);
        parcel.writeString(this.displayImageUrl);
        parcel.writeString(this.coverImageURL);
        parcel.writeInt(this.isLive ? 1 : 0);
        parcel.writeInt(this.isPopular ? 1 : 0);
        parcel.writeString(this.groupName);
        parcel.writeString(this.description);
        parcel.writeString(this.type);
        parcel.writeString(this.mode);
        parcel.writeString(this.joinStatus);
        Long l10 = this.lastReadMessageTime;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l10);
        }
        parcel.writeString(this.lastReadMessageId);
        parcel.writeString(this.otherUserId);
        parcel.writeInt(this.memberCount);
        parcel.writeInt(this.memberInviteeCount);
        parcel.writeInt(this.starredMessagesCount);
        parcel.writeInt(this.bannedMembersCount);
        parcel.writeInt(this.isOpenForAudience ? 1 : 0);
        this.membersCount.writeToParcel(parcel, flags);
        parcel.writeString(this.friendUserName);
        parcel.writeString(this.friendUserId);
        parcel.writeString(this.friendImageURL);
        List<GroupMember> list = this.admins;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((GroupMember) o10.next()).writeToParcel(parcel, flags);
            }
        }
        List<GroupMember> list2 = this.moderators;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o11 = a.o(parcel, 1, list2);
            while (o11.hasNext()) {
                ((GroupMember) o11.next()).writeToParcel(parcel, flags);
            }
        }
        List<GroupMember> list3 = this.seeders;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o12 = a.o(parcel, 1, list3);
            while (o12.hasNext()) {
                ((GroupMember) o12.next()).writeToParcel(parcel, flags);
            }
        }
        MembershipStatus membershipStatus = this.membershipStatus;
        if (membershipStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            membershipStatus.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isSocialAuthRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        List<ExitOption> list4 = this.exitReasons;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o13 = a.o(parcel, 1, list4);
            while (o13.hasNext()) {
                ((ExitOption) o13.next()).writeToParcel(parcel, flags);
            }
        }
        ArrayList<ReportReason> arrayList = this.reportReasons;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<ReportReason> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.isUserBlocked ? 1 : 0);
        parcel.writeInt(this.iAmBlocked ? 1 : 0);
        parcel.writeString(this.blockMessageToShow);
        this.subscriptionPackageInfo.writeToParcel(parcel, flags);
        parcel.writeInt(this.allowedToJoin ? 1 : 0);
        parcel.writeString(this.inviteLink);
        parcel.writeString(this.autoDeleteTime);
        parcel.writeInt(this.isFeedEnabled ? 1 : 0);
        parcel.writeInt(this.isChatDisabled ? 1 : 0);
        GroupUIConfig groupUIConfig = this.groupUIConfig;
        if (groupUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupUIConfig.writeToParcel(parcel, flags);
        }
        List<Tags> list5 = this.tags;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o14 = a.o(parcel, 1, list5);
            while (o14.hasNext()) {
                ((Tags) o14.next()).writeToParcel(parcel, flags);
            }
        }
        RiaRraInfo riaRraInfo = this.riaRraInfo;
        if (riaRraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            riaRraInfo.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.riaRraUserId);
        parcel.writeString(this.riaRraDescription);
        parcel.writeString(this.groupLanding);
        Boolean bool2 = this.hasWriteAccess;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool2);
        }
    }

    public /* synthetic */ Group(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, String str6, String str7, String str8, String str9, Long l10, String str10, String str11, int i10, int i11, int i12, int i13, boolean z12, MembersCount membersCount, String str12, String str13, String str14, List list, List list2, List list3, MembershipStatus membershipStatus, Boolean bool, List list4, ArrayList arrayList, boolean z13, boolean z14, String str15, SubscriptionPackageInfo subscriptionPackageInfo, boolean z15, String str16, String str17, boolean z16, boolean z17, GroupUIConfig groupUIConfig, List list5, RiaRraInfo riaRraInfo, String str18, String str19, String str20, Boolean bool2, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z10, z11, str5, str6, str7, str8, str9, l10, str10, str11, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i10, (32768 & i14) != 0 ? 0 : i11, (65536 & i14) != 0 ? 0 : i12, (131072 & i14) != 0 ? 0 : i13, (262144 & i14) != 0 ? true : z12, membersCount, str12, str13, str14, list, list2, list3, membershipStatus, bool, list4, arrayList, (1073741824 & i14) != 0 ? false : z13, (i14 & Integer.MIN_VALUE) != 0 ? false : z14, str15, subscriptionPackageInfo, z15, str16, str17, (i15 & 32) != 0 ? false : z16, (i15 & 64) != 0 ? false : z17, groupUIConfig, (i15 & 256) != 0 ? null : list5, riaRraInfo, str18, str19, str20, bool2);
    }
}
