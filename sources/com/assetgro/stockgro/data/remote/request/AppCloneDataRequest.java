package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u000eJV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\t\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u0014¨\u0006*"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/AppCloneDataRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "packageId", HttpUrl.FRAGMENT_ENCODE_SET, "installationDirectory", "udid", "osVersion", "manufacturer", "model", "isLicensed", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getInstallationDirectory", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "setLicensed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getManufacturer", "setManufacturer", "(Ljava/lang/String;)V", "getModel", "setModel", "getOsVersion", "setOsVersion", "getPackageId", "getUdid", "setUdid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/data/remote/request/AppCloneDataRequest;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppCloneDataRequest {
    public static final int $stable = 8;

    @SerializedName("installation_directory")
    @NotNull
    private final String installationDirectory;

    @SerializedName("is_licensed")
    private Boolean isLicensed;

    @SerializedName("manufacturer")
    @NotNull
    private String manufacturer;

    @SerializedName("model")
    @NotNull
    private String model;

    @SerializedName("os_version")
    @NotNull
    private String osVersion;

    @SerializedName("package_id")
    @NotNull
    private final String packageId;

    @SerializedName("udid")
    @NotNull
    private String udid;

    public AppCloneDataRequest(@NotNull String packageId, @NotNull String installationDirectory, @NotNull String udid, @NotNull String osVersion, @NotNull String manufacturer, @NotNull String model, Boolean bool) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(installationDirectory, "installationDirectory");
        Intrinsics.checkNotNullParameter(udid, "udid");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        this.packageId = packageId;
        this.installationDirectory = installationDirectory;
        this.udid = udid;
        this.osVersion = osVersion;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isLicensed = bool;
    }

    public static /* synthetic */ AppCloneDataRequest copy$default(AppCloneDataRequest appCloneDataRequest, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appCloneDataRequest.packageId;
        }
        if ((i10 & 2) != 0) {
            str2 = appCloneDataRequest.installationDirectory;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = appCloneDataRequest.udid;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = appCloneDataRequest.osVersion;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = appCloneDataRequest.manufacturer;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = appCloneDataRequest.model;
        }
        String str11 = str6;
        if ((i10 & 64) != 0) {
            bool = appCloneDataRequest.isLicensed;
        }
        return appCloneDataRequest.copy(str, str7, str8, str9, str10, str11, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getInstallationDirectory() {
        return this.installationDirectory;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUdid() {
        return this.udid;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsLicensed() {
        return this.isLicensed;
    }

    @NotNull
    public final AppCloneDataRequest copy(@NotNull String packageId, @NotNull String installationDirectory, @NotNull String udid, @NotNull String osVersion, @NotNull String manufacturer, @NotNull String model, Boolean isLicensed) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(installationDirectory, "installationDirectory");
        Intrinsics.checkNotNullParameter(udid, "udid");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        return new AppCloneDataRequest(packageId, installationDirectory, udid, osVersion, manufacturer, model, isLicensed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCloneDataRequest)) {
            return false;
        }
        AppCloneDataRequest appCloneDataRequest = (AppCloneDataRequest) other;
        return Intrinsics.a(this.packageId, appCloneDataRequest.packageId) && Intrinsics.a(this.installationDirectory, appCloneDataRequest.installationDirectory) && Intrinsics.a(this.udid, appCloneDataRequest.udid) && Intrinsics.a(this.osVersion, appCloneDataRequest.osVersion) && Intrinsics.a(this.manufacturer, appCloneDataRequest.manufacturer) && Intrinsics.a(this.model, appCloneDataRequest.model) && Intrinsics.a(this.isLicensed, appCloneDataRequest.isLicensed);
    }

    @NotNull
    public final String getInstallationDirectory() {
        return this.installationDirectory;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getPackageId() {
        return this.packageId;
    }

    @NotNull
    public final String getUdid() {
        return this.udid;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.model, h.g(this.manufacturer, h.g(this.osVersion, h.g(this.udid, h.g(this.installationDirectory, this.packageId.hashCode() * 31, 31), 31), 31), 31), 31);
        Boolean bool = this.isLicensed;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return g10 + hashCode;
    }

    public final Boolean isLicensed() {
        return this.isLicensed;
    }

    public final void setLicensed(Boolean bool) {
        this.isLicensed = bool;
    }

    public final void setManufacturer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.manufacturer = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setOsVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.osVersion = str;
    }

    public final void setUdid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.udid = str;
    }

    @NotNull
    public String toString() {
        String str = this.packageId;
        String str2 = this.installationDirectory;
        String str3 = this.udid;
        String str4 = this.osVersion;
        String str5 = this.manufacturer;
        String str6 = this.model;
        Boolean bool = this.isLicensed;
        StringBuilder l10 = e.l("AppCloneDataRequest(packageId=", str, ", installationDirectory=", str2, ", udid=");
        e.v(l10, str3, ", osVersion=", str4, ", manufacturer=");
        e.v(l10, str5, ", model=", str6, ", isLicensed=");
        l10.append(bool);
        l10.append(")");
        return l10.toString();
    }

    public /* synthetic */ AppCloneDataRequest(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4, (i10 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str5, (i10 & 32) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str6, (i10 & 64) != 0 ? null : bool);
    }
}
