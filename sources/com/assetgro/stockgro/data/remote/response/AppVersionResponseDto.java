package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/AppVersionResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "fileName", HttpUrl.FRAGMENT_ENCODE_SET, "updatedAt", "versionCode", HttpUrl.FRAGMENT_ENCODE_SET, "versionName", "isBlocker", HttpUrl.FRAGMENT_ENCODE_SET, "whatsNew", "updateFromPlaystore", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "()Z", "getUpdateFromPlaystore", "getUpdatedAt", "getVersionCode", "()I", "getVersionName", "getWhatsNew", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppVersionResponseDto {
    public static final int $stable = 0;

    @SerializedName("file_name")
    @NotNull
    private final String fileName;

    @SerializedName("is_blocker")
    private final boolean isBlocker;

    @SerializedName("app_store_update")
    private final boolean updateFromPlaystore;

    @SerializedName("updated_at")
    @NotNull
    private final String updatedAt;

    @SerializedName("version_code")
    private final int versionCode;

    @SerializedName("version_name")
    @NotNull
    private final String versionName;

    @SerializedName("whats_new")
    @NotNull
    private final String whatsNew;

    public AppVersionResponseDto(@NotNull String fileName, @NotNull String updatedAt, int i10, @NotNull String versionName, boolean z10, @NotNull String whatsNew, boolean z11) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(whatsNew, "whatsNew");
        this.fileName = fileName;
        this.updatedAt = updatedAt;
        this.versionCode = i10;
        this.versionName = versionName;
        this.isBlocker = z10;
        this.whatsNew = whatsNew;
        this.updateFromPlaystore = z11;
    }

    public static /* synthetic */ AppVersionResponseDto copy$default(AppVersionResponseDto appVersionResponseDto, String str, String str2, int i10, String str3, boolean z10, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appVersionResponseDto.fileName;
        }
        if ((i11 & 2) != 0) {
            str2 = appVersionResponseDto.updatedAt;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            i10 = appVersionResponseDto.versionCode;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = appVersionResponseDto.versionName;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            z10 = appVersionResponseDto.isBlocker;
        }
        boolean z12 = z10;
        if ((i11 & 32) != 0) {
            str4 = appVersionResponseDto.whatsNew;
        }
        String str7 = str4;
        if ((i11 & 64) != 0) {
            z11 = appVersionResponseDto.updateFromPlaystore;
        }
        return appVersionResponseDto.copy(str, str5, i12, str6, z12, str7, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBlocker() {
        return this.isBlocker;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getWhatsNew() {
        return this.whatsNew;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getUpdateFromPlaystore() {
        return this.updateFromPlaystore;
    }

    @NotNull
    public final AppVersionResponseDto copy(@NotNull String fileName, @NotNull String updatedAt, int versionCode, @NotNull String versionName, boolean isBlocker, @NotNull String whatsNew, boolean updateFromPlaystore) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(whatsNew, "whatsNew");
        return new AppVersionResponseDto(fileName, updatedAt, versionCode, versionName, isBlocker, whatsNew, updateFromPlaystore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppVersionResponseDto)) {
            return false;
        }
        AppVersionResponseDto appVersionResponseDto = (AppVersionResponseDto) other;
        return Intrinsics.a(this.fileName, appVersionResponseDto.fileName) && Intrinsics.a(this.updatedAt, appVersionResponseDto.updatedAt) && this.versionCode == appVersionResponseDto.versionCode && Intrinsics.a(this.versionName, appVersionResponseDto.versionName) && this.isBlocker == appVersionResponseDto.isBlocker && Intrinsics.a(this.whatsNew, appVersionResponseDto.whatsNew) && this.updateFromPlaystore == appVersionResponseDto.updateFromPlaystore;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUpdateFromPlaystore() {
        return this.updateFromPlaystore;
    }

    @NotNull
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    public final String getWhatsNew() {
        return this.whatsNew;
    }

    public int hashCode() {
        return Boolean.hashCode(this.updateFromPlaystore) + h.g(this.whatsNew, e.d(this.isBlocker, h.g(this.versionName, da.e.f(this.versionCode, h.g(this.updatedAt, this.fileName.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final boolean isBlocker() {
        return this.isBlocker;
    }

    @NotNull
    public String toString() {
        String str = this.fileName;
        String str2 = this.updatedAt;
        int i10 = this.versionCode;
        String str3 = this.versionName;
        boolean z10 = this.isBlocker;
        String str4 = this.whatsNew;
        boolean z11 = this.updateFromPlaystore;
        StringBuilder l10 = e.l("AppVersionResponseDto(fileName=", str, ", updatedAt=", str2, ", versionCode=");
        d.w(l10, i10, ", versionName=", str3, ", isBlocker=");
        l10.append(z10);
        l10.append(", whatsNew=");
        l10.append(str4);
        l10.append(", updateFromPlaystore=");
        return da.e.o(l10, z11, ")");
    }
}
