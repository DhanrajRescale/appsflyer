package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/model/PackageInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "accessPackageLevel", HttpUrl.FRAGMENT_ENCODE_SET, "accessPackageName", HttpUrl.FRAGMENT_ENCODE_SET, "(ILjava/lang/String;)V", "getAccessPackageLevel", "()I", "getAccessPackageName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PackageInfo {
    public static final int $stable = 0;

    @SerializedName("access_package_level")
    private final int accessPackageLevel;

    @SerializedName("access_package_name")
    @NotNull
    private final String accessPackageName;

    public PackageInfo(int i10, @NotNull String accessPackageName) {
        Intrinsics.checkNotNullParameter(accessPackageName, "accessPackageName");
        this.accessPackageLevel = i10;
        this.accessPackageName = accessPackageName;
    }

    public static /* synthetic */ PackageInfo copy$default(PackageInfo packageInfo, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = packageInfo.accessPackageLevel;
        }
        if ((i11 & 2) != 0) {
            str = packageInfo.accessPackageName;
        }
        return packageInfo.copy(i10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAccessPackageLevel() {
        return this.accessPackageLevel;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAccessPackageName() {
        return this.accessPackageName;
    }

    @NotNull
    public final PackageInfo copy(int accessPackageLevel, @NotNull String accessPackageName) {
        Intrinsics.checkNotNullParameter(accessPackageName, "accessPackageName");
        return new PackageInfo(accessPackageLevel, accessPackageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageInfo)) {
            return false;
        }
        PackageInfo packageInfo = (PackageInfo) other;
        return this.accessPackageLevel == packageInfo.accessPackageLevel && Intrinsics.a(this.accessPackageName, packageInfo.accessPackageName);
    }

    public final int getAccessPackageLevel() {
        return this.accessPackageLevel;
    }

    @NotNull
    public final String getAccessPackageName() {
        return this.accessPackageName;
    }

    public int hashCode() {
        return this.accessPackageName.hashCode() + (Integer.hashCode(this.accessPackageLevel) * 31);
    }

    @NotNull
    public String toString() {
        return "PackageInfo(accessPackageLevel=" + this.accessPackageLevel + ", accessPackageName=" + this.accessPackageName + ")";
    }
}
