package com.assetgro.stockgro.data.model.socialgroups;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010%J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0013HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\t\u0010I\u001a\u00020\u0013HÆ\u0003J\t\u0010J\u001a\u00020\u0013HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\t\u0010L\u001a\u00020\u0013HÆ\u0003J\t\u0010M\u001a\u00020\u0013HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010[\u001a\u00020\fHÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003J½\u0002\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010`\u001a\u00020\u00132\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u0003HÖ\u0001J\t\u0010c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0016\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0016\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00105R\u0016\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00105R\u0016\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u00105R\u0016\u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00105R\u0016\u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00105R\u0016\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u00105R\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010)\"\u0004\b9\u0010:R\u0016\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0016\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0016\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u0016\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0016\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+¨\u0006d"}, d2 = {"Lcom/assetgro/stockgro/data/model/socialgroups/GroupInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "accessPackage", HttpUrl.FRAGMENT_ENCODE_SET, "accessPackageName", HttpUrl.FRAGMENT_ENCODE_SET, "admins", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/socialgroups/Admin;", "categoryId", "categoryIds", "createdAtMicros", HttpUrl.FRAGMENT_ENCODE_SET, "createdBy", "description", "exitReasons", "Lcom/assetgro/stockgro/data/model/socialgroups/ExitReason;", "groupId", "hasWriteAccess", HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", "invalidPackage", "isFeatured", "isNewAndGrowing", "isOpenForAudience", "isPopular", "isSocialAuthRequired", "isTrending", "lastGroupMsgTime", "mode", AppMeasurementSdk.ConditionalUserProperty.NAME, "numMsgs", "paymentModel", "sortValue", "type", "writeRoles", "joinStatus", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZZZZZZJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAccessPackage", "()I", "getAccessPackageName", "()Ljava/lang/String;", "getAdmins", "()Ljava/util/List;", "getCategoryId", "getCategoryIds", "getCreatedAtMicros", "()J", "getCreatedBy", "getDescription", "getExitReasons", "getGroupId", "getHasWriteAccess", "()Z", "getImageUrl", "getInvalidPackage", "getJoinStatus", "setJoinStatus", "(Ljava/lang/String;)V", "getLastGroupMsgTime", "getMode", "getName", "getNumMsgs", "getPaymentModel", "getSortValue", "getType", "getWriteRoles", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GroupInfo {
    public static final int $stable = 8;

    @SerializedName("access_package")
    private final int accessPackage;

    @SerializedName("access_package_name")
    @NotNull
    private final String accessPackageName;

    @SerializedName("admins")
    private final List<Admin> admins;

    @SerializedName("category_id")
    @NotNull
    private final String categoryId;

    @SerializedName("category_ids")
    @NotNull
    private final List<String> categoryIds;

    @SerializedName("created_at_micros")
    private final long createdAtMicros;

    @SerializedName("created_by")
    @NotNull
    private final String createdBy;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("exit_reasons")
    @NotNull
    private final List<ExitReason> exitReasons;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("has_write_access")
    private final boolean hasWriteAccess;

    @SerializedName("image_url")
    @NotNull
    private final String imageUrl;

    @SerializedName("invalid_package")
    private final boolean invalidPackage;

    @SerializedName("is_featured")
    private final boolean isFeatured;

    @SerializedName("is_new_and_growing")
    private final boolean isNewAndGrowing;

    @SerializedName("is_open_for_audience")
    private final boolean isOpenForAudience;

    @SerializedName("is_popular")
    private final boolean isPopular;

    @SerializedName("is_social_auth_required")
    private final boolean isSocialAuthRequired;

    @SerializedName("is_trending")
    private final boolean isTrending;
    private String joinStatus;

    @SerializedName("last_group_msg_time")
    private final long lastGroupMsgTime;

    @SerializedName("mode")
    @NotNull
    private final String mode;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("num_msgs")
    private final int numMsgs;

    @SerializedName("payment_model")
    @NotNull
    private final String paymentModel;

    @SerializedName("sort_value")
    private final int sortValue;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("write_roles")
    @NotNull
    private final List<String> writeRoles;

    public GroupInfo(int i10, @NotNull String accessPackageName, List<Admin> list, @NotNull String categoryId, @NotNull List<String> categoryIds, long j10, @NotNull String createdBy, @NotNull String description, @NotNull List<ExitReason> exitReasons, @NotNull String groupId, boolean z10, @NotNull String imageUrl, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, long j11, @NotNull String mode, @NotNull String name, int i11, @NotNull String paymentModel, int i12, @NotNull String type, @NotNull List<String> writeRoles, String str) {
        Intrinsics.checkNotNullParameter(accessPackageName, "accessPackageName");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(exitReasons, "exitReasons");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(paymentModel, "paymentModel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(writeRoles, "writeRoles");
        this.accessPackage = i10;
        this.accessPackageName = accessPackageName;
        this.admins = list;
        this.categoryId = categoryId;
        this.categoryIds = categoryIds;
        this.createdAtMicros = j10;
        this.createdBy = createdBy;
        this.description = description;
        this.exitReasons = exitReasons;
        this.groupId = groupId;
        this.hasWriteAccess = z10;
        this.imageUrl = imageUrl;
        this.invalidPackage = z11;
        this.isFeatured = z12;
        this.isNewAndGrowing = z13;
        this.isOpenForAudience = z14;
        this.isPopular = z15;
        this.isSocialAuthRequired = z16;
        this.isTrending = z17;
        this.lastGroupMsgTime = j11;
        this.mode = mode;
        this.name = name;
        this.numMsgs = i11;
        this.paymentModel = paymentModel;
        this.sortValue = i12;
        this.type = type;
        this.writeRoles = writeRoles;
        this.joinStatus = str;
    }

    /* renamed from: component1, reason: from getter */
    public final int getAccessPackage() {
        return this.accessPackage;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasWriteAccess() {
        return this.hasWriteAccess;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getInvalidPackage() {
        return this.invalidPackage;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsNewAndGrowing() {
        return this.isNewAndGrowing;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsOpenForAudience() {
        return this.isOpenForAudience;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsPopular() {
        return this.isPopular;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsSocialAuthRequired() {
        return this.isSocialAuthRequired;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsTrending() {
        return this.isTrending;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAccessPackageName() {
        return this.accessPackageName;
    }

    /* renamed from: component20, reason: from getter */
    public final long getLastGroupMsgTime() {
        return this.lastGroupMsgTime;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component23, reason: from getter */
    public final int getNumMsgs() {
        return this.numMsgs;
    }

    @NotNull
    /* renamed from: component24, reason: from getter */
    public final String getPaymentModel() {
        return this.paymentModel;
    }

    /* renamed from: component25, reason: from getter */
    public final int getSortValue() {
        return this.sortValue;
    }

    @NotNull
    /* renamed from: component26, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> component27() {
        return this.writeRoles;
    }

    /* renamed from: component28, reason: from getter */
    public final String getJoinStatus() {
        return this.joinStatus;
    }

    public final List<Admin> component3() {
        return this.admins;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final List<String> component5() {
        return this.categoryIds;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreatedAtMicros() {
        return this.createdAtMicros;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<ExitReason> component9() {
        return this.exitReasons;
    }

    @NotNull
    public final GroupInfo copy(int accessPackage, @NotNull String accessPackageName, List<Admin> admins, @NotNull String categoryId, @NotNull List<String> categoryIds, long createdAtMicros, @NotNull String createdBy, @NotNull String description, @NotNull List<ExitReason> exitReasons, @NotNull String groupId, boolean hasWriteAccess, @NotNull String imageUrl, boolean invalidPackage, boolean isFeatured, boolean isNewAndGrowing, boolean isOpenForAudience, boolean isPopular, boolean isSocialAuthRequired, boolean isTrending, long lastGroupMsgTime, @NotNull String mode, @NotNull String name, int numMsgs, @NotNull String paymentModel, int sortValue, @NotNull String type, @NotNull List<String> writeRoles, String joinStatus) {
        Intrinsics.checkNotNullParameter(accessPackageName, "accessPackageName");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(exitReasons, "exitReasons");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(paymentModel, "paymentModel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(writeRoles, "writeRoles");
        return new GroupInfo(accessPackage, accessPackageName, admins, categoryId, categoryIds, createdAtMicros, createdBy, description, exitReasons, groupId, hasWriteAccess, imageUrl, invalidPackage, isFeatured, isNewAndGrowing, isOpenForAudience, isPopular, isSocialAuthRequired, isTrending, lastGroupMsgTime, mode, name, numMsgs, paymentModel, sortValue, type, writeRoles, joinStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) other;
        return this.accessPackage == groupInfo.accessPackage && Intrinsics.a(this.accessPackageName, groupInfo.accessPackageName) && Intrinsics.a(this.admins, groupInfo.admins) && Intrinsics.a(this.categoryId, groupInfo.categoryId) && Intrinsics.a(this.categoryIds, groupInfo.categoryIds) && this.createdAtMicros == groupInfo.createdAtMicros && Intrinsics.a(this.createdBy, groupInfo.createdBy) && Intrinsics.a(this.description, groupInfo.description) && Intrinsics.a(this.exitReasons, groupInfo.exitReasons) && Intrinsics.a(this.groupId, groupInfo.groupId) && this.hasWriteAccess == groupInfo.hasWriteAccess && Intrinsics.a(this.imageUrl, groupInfo.imageUrl) && this.invalidPackage == groupInfo.invalidPackage && this.isFeatured == groupInfo.isFeatured && this.isNewAndGrowing == groupInfo.isNewAndGrowing && this.isOpenForAudience == groupInfo.isOpenForAudience && this.isPopular == groupInfo.isPopular && this.isSocialAuthRequired == groupInfo.isSocialAuthRequired && this.isTrending == groupInfo.isTrending && this.lastGroupMsgTime == groupInfo.lastGroupMsgTime && Intrinsics.a(this.mode, groupInfo.mode) && Intrinsics.a(this.name, groupInfo.name) && this.numMsgs == groupInfo.numMsgs && Intrinsics.a(this.paymentModel, groupInfo.paymentModel) && this.sortValue == groupInfo.sortValue && Intrinsics.a(this.type, groupInfo.type) && Intrinsics.a(this.writeRoles, groupInfo.writeRoles) && Intrinsics.a(this.joinStatus, groupInfo.joinStatus);
    }

    public final int getAccessPackage() {
        return this.accessPackage;
    }

    @NotNull
    public final String getAccessPackageName() {
        return this.accessPackageName;
    }

    public final List<Admin> getAdmins() {
        return this.admins;
    }

    @NotNull
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final List<String> getCategoryIds() {
        return this.categoryIds;
    }

    public final long getCreatedAtMicros() {
        return this.createdAtMicros;
    }

    @NotNull
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<ExitReason> getExitReasons() {
        return this.exitReasons;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public final boolean getHasWriteAccess() {
        return this.hasWriteAccess;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getInvalidPackage() {
        return this.invalidPackage;
    }

    public final String getJoinStatus() {
        return this.joinStatus;
    }

    public final long getLastGroupMsgTime() {
        return this.lastGroupMsgTime;
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNumMsgs() {
        return this.numMsgs;
    }

    @NotNull
    public final String getPaymentModel() {
        return this.paymentModel;
    }

    public final int getSortValue() {
        return this.sortValue;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> getWriteRoles() {
        return this.writeRoles;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.accessPackageName, Integer.hashCode(this.accessPackage) * 31, 31);
        List<Admin> list = this.admins;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int e10 = d.e(this.writeRoles, h.g(this.type, e.f(this.sortValue, h.g(this.paymentModel, e.f(this.numMsgs, h.g(this.name, h.g(this.mode, v.e.c(this.lastGroupMsgTime, v.e.d(this.isTrending, v.e.d(this.isSocialAuthRequired, v.e.d(this.isPopular, v.e.d(this.isOpenForAudience, v.e.d(this.isNewAndGrowing, v.e.d(this.isFeatured, v.e.d(this.invalidPackage, h.g(this.imageUrl, v.e.d(this.hasWriteAccess, h.g(this.groupId, d.e(this.exitReasons, h.g(this.description, h.g(this.createdBy, v.e.c(this.createdAtMicros, d.e(this.categoryIds, h.g(this.categoryId, (g10 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.joinStatus;
        if (str != null) {
            i10 = str.hashCode();
        }
        return e10 + i10;
    }

    public final boolean isFeatured() {
        return this.isFeatured;
    }

    public final boolean isNewAndGrowing() {
        return this.isNewAndGrowing;
    }

    public final boolean isOpenForAudience() {
        return this.isOpenForAudience;
    }

    public final boolean isPopular() {
        return this.isPopular;
    }

    public final boolean isSocialAuthRequired() {
        return this.isSocialAuthRequired;
    }

    public final boolean isTrending() {
        return this.isTrending;
    }

    public final void setJoinStatus(String str) {
        this.joinStatus = str;
    }

    @NotNull
    public String toString() {
        int i10 = this.accessPackage;
        String str = this.accessPackageName;
        List<Admin> list = this.admins;
        String str2 = this.categoryId;
        List<String> list2 = this.categoryIds;
        long j10 = this.createdAtMicros;
        String str3 = this.createdBy;
        String str4 = this.description;
        List<ExitReason> list3 = this.exitReasons;
        String str5 = this.groupId;
        boolean z10 = this.hasWriteAccess;
        String str6 = this.imageUrl;
        boolean z11 = this.invalidPackage;
        boolean z12 = this.isFeatured;
        boolean z13 = this.isNewAndGrowing;
        boolean z14 = this.isOpenForAudience;
        boolean z15 = this.isPopular;
        boolean z16 = this.isSocialAuthRequired;
        boolean z17 = this.isTrending;
        long j11 = this.lastGroupMsgTime;
        String str7 = this.mode;
        String str8 = this.name;
        int i11 = this.numMsgs;
        String str9 = this.paymentModel;
        int i12 = this.sortValue;
        String str10 = this.type;
        List<String> list4 = this.writeRoles;
        String str11 = this.joinStatus;
        StringBuilder sb2 = new StringBuilder("GroupInfo(accessPackage=");
        sb2.append(i10);
        sb2.append(", accessPackageName=");
        sb2.append(str);
        sb2.append(", admins=");
        sb2.append(list);
        sb2.append(", categoryId=");
        sb2.append(str2);
        sb2.append(", categoryIds=");
        sb2.append(list2);
        sb2.append(", createdAtMicros=");
        sb2.append(j10);
        v.e.v(sb2, ", createdBy=", str3, ", description=", str4);
        sb2.append(", exitReasons=");
        sb2.append(list3);
        sb2.append(", groupId=");
        sb2.append(str5);
        sb2.append(", hasWriteAccess=");
        sb2.append(z10);
        sb2.append(", imageUrl=");
        sb2.append(str6);
        sb2.append(", invalidPackage=");
        sb2.append(z11);
        sb2.append(", isFeatured=");
        sb2.append(z12);
        sb2.append(", isNewAndGrowing=");
        sb2.append(z13);
        sb2.append(", isOpenForAudience=");
        sb2.append(z14);
        sb2.append(", isPopular=");
        sb2.append(z15);
        sb2.append(", isSocialAuthRequired=");
        sb2.append(z16);
        sb2.append(", isTrending=");
        sb2.append(z17);
        sb2.append(", lastGroupMsgTime=");
        sb2.append(j11);
        sb2.append(", mode=");
        sb2.append(str7);
        sb2.append(", name=");
        sb2.append(str8);
        sb2.append(", numMsgs=");
        sb2.append(i11);
        sb2.append(", paymentModel=");
        sb2.append(str9);
        sb2.append(", sortValue=");
        sb2.append(i12);
        sb2.append(", type=");
        sb2.append(str10);
        sb2.append(", writeRoles=");
        sb2.append(list4);
        return v.e.j(sb2, ", joinStatus=", str11, ")");
    }
}
