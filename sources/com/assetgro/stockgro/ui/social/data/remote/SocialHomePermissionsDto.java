package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.SocialHomePermissions;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/SocialHomePermissionsDto;", HttpUrl.FRAGMENT_ENCODE_SET, "canLaunchPublicGroup", HttpUrl.FRAGMENT_ENCODE_SET, "canDeactivateMembers", "canLaunchPrivateGroup", "(ZZZ)V", "getCanDeactivateMembers", "()Z", "getCanLaunchPrivateGroup", "getCanLaunchPublicGroup", "toSocialHomePermissions", "Lcom/assetgro/stockgro/ui/social/domain/model/SocialHomePermissions;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocialHomePermissionsDto {
    public static final int $stable = 0;

    @SerializedName("can_deactivate_members")
    private final boolean canDeactivateMembers;

    @SerializedName("can_launch_private_group")
    private final boolean canLaunchPrivateGroup;

    @SerializedName("can_launch_public_group")
    private final boolean canLaunchPublicGroup;

    public SocialHomePermissionsDto() {
        this(false, false, false, 7, null);
    }

    public final boolean getCanDeactivateMembers() {
        return this.canDeactivateMembers;
    }

    public final boolean getCanLaunchPrivateGroup() {
        return this.canLaunchPrivateGroup;
    }

    public final boolean getCanLaunchPublicGroup() {
        return this.canLaunchPublicGroup;
    }

    @NotNull
    public final SocialHomePermissions toSocialHomePermissions() {
        return new SocialHomePermissions(this.canLaunchPublicGroup, this.canDeactivateMembers, this.canLaunchPrivateGroup);
    }

    public SocialHomePermissionsDto(boolean z10, boolean z11, boolean z12) {
        this.canLaunchPublicGroup = z10;
        this.canDeactivateMembers = z11;
        this.canLaunchPrivateGroup = z12;
    }

    public /* synthetic */ SocialHomePermissionsDto(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }
}
