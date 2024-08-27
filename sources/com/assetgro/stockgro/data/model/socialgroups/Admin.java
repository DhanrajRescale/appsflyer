package com.assetgro.stockgro.data.model.socialgroups;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/socialgroups/Admin;", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "displayPicture", "invalidPackage", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getDisplayPicture", "getInvalidPackage", "()Z", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Admin {
    public static final int $stable = 0;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("display_picture")
    @NotNull
    private final String displayPicture;

    @SerializedName("invalid_package")
    private final boolean invalidPackage;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    public Admin(@NotNull String displayName, @NotNull String displayPicture, boolean z10, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.displayName = displayName;
        this.displayPicture = displayPicture;
        this.invalidPackage = z10;
        this.userId = userId;
    }

    public static /* synthetic */ Admin copy$default(Admin admin, String str, String str2, boolean z10, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = admin.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = admin.displayPicture;
        }
        if ((i10 & 4) != 0) {
            z10 = admin.invalidPackage;
        }
        if ((i10 & 8) != 0) {
            str3 = admin.userId;
        }
        return admin.copy(str, str2, z10, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInvalidPackage() {
        return this.invalidPackage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final Admin copy(@NotNull String displayName, @NotNull String displayPicture, boolean invalidPackage, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new Admin(displayName, displayPicture, invalidPackage, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Admin)) {
            return false;
        }
        Admin admin = (Admin) other;
        return Intrinsics.a(this.displayName, admin.displayName) && Intrinsics.a(this.displayPicture, admin.displayPicture) && this.invalidPackage == admin.invalidPackage && Intrinsics.a(this.userId, admin.userId);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    public final boolean getInvalidPackage() {
        return this.invalidPackage;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + e.d(this.invalidPackage, h.g(this.displayPicture, this.displayName.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.displayName;
        String str2 = this.displayPicture;
        boolean z10 = this.invalidPackage;
        String str3 = this.userId;
        StringBuilder l10 = e.l("Admin(displayName=", str, ", displayPicture=", str2, ", invalidPackage=");
        l10.append(z10);
        l10.append(", userId=");
        l10.append(str3);
        l10.append(")");
        return l10.toString();
    }
}
