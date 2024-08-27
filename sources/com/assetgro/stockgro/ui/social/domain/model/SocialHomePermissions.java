package com.assetgro.stockgro.ui.social.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/SocialHomePermissions;", "Landroid/os/Parcelable;", "canLaunchPublicGroup", HttpUrl.FRAGMENT_ENCODE_SET, "canDeactivateMembers", "canLaunchPrivateGroup", "(ZZZ)V", "getCanDeactivateMembers", "()Z", "getCanLaunchPrivateGroup", "getCanLaunchPublicGroup", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialHomePermissions implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SocialHomePermissions> CREATOR = new Creator();
    private final boolean canDeactivateMembers;
    private final boolean canLaunchPrivateGroup;
    private final boolean canLaunchPublicGroup;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SocialHomePermissions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialHomePermissions createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SocialHomePermissions(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SocialHomePermissions[] newArray(int i10) {
            return new SocialHomePermissions[i10];
        }
    }

    public SocialHomePermissions() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ SocialHomePermissions copy$default(SocialHomePermissions socialHomePermissions, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = socialHomePermissions.canLaunchPublicGroup;
        }
        if ((i10 & 2) != 0) {
            z11 = socialHomePermissions.canDeactivateMembers;
        }
        if ((i10 & 4) != 0) {
            z12 = socialHomePermissions.canLaunchPrivateGroup;
        }
        return socialHomePermissions.copy(z10, z11, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanLaunchPublicGroup() {
        return this.canLaunchPublicGroup;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanDeactivateMembers() {
        return this.canDeactivateMembers;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanLaunchPrivateGroup() {
        return this.canLaunchPrivateGroup;
    }

    @NotNull
    public final SocialHomePermissions copy(boolean canLaunchPublicGroup, boolean canDeactivateMembers, boolean canLaunchPrivateGroup) {
        return new SocialHomePermissions(canLaunchPublicGroup, canDeactivateMembers, canLaunchPrivateGroup);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialHomePermissions)) {
            return false;
        }
        SocialHomePermissions socialHomePermissions = (SocialHomePermissions) other;
        return this.canLaunchPublicGroup == socialHomePermissions.canLaunchPublicGroup && this.canDeactivateMembers == socialHomePermissions.canDeactivateMembers && this.canLaunchPrivateGroup == socialHomePermissions.canLaunchPrivateGroup;
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

    public int hashCode() {
        return Boolean.hashCode(this.canLaunchPrivateGroup) + e.d(this.canDeactivateMembers, Boolean.hashCode(this.canLaunchPublicGroup) * 31, 31);
    }

    @NotNull
    public String toString() {
        boolean z10 = this.canLaunchPublicGroup;
        boolean z11 = this.canDeactivateMembers;
        boolean z12 = this.canLaunchPrivateGroup;
        StringBuilder sb2 = new StringBuilder("SocialHomePermissions(canLaunchPublicGroup=");
        sb2.append(z10);
        sb2.append(", canDeactivateMembers=");
        sb2.append(z11);
        sb2.append(", canLaunchPrivateGroup=");
        return da.e.o(sb2, z12, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.canLaunchPublicGroup ? 1 : 0);
        parcel.writeInt(this.canDeactivateMembers ? 1 : 0);
        parcel.writeInt(this.canLaunchPrivateGroup ? 1 : 0);
    }

    public SocialHomePermissions(boolean z10, boolean z11, boolean z12) {
        this.canLaunchPublicGroup = z10;
        this.canDeactivateMembers = z11;
        this.canLaunchPrivateGroup = z12;
    }

    public /* synthetic */ SocialHomePermissions(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }
}
