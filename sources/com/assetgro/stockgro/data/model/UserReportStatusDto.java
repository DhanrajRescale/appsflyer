package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserReportStatusDto;", HttpUrl.FRAGMENT_ENCODE_SET, "reportThresholdExceeded", HttpUrl.FRAGMENT_ENCODE_SET, "displayStatus", HttpUrl.FRAGMENT_ENCODE_SET, "(ZLjava/lang/String;)V", "getDisplayStatus", "()Ljava/lang/String;", "getReportThresholdExceeded", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserReportStatusDto {
    public static final int $stable = 0;

    @SerializedName("display_status")
    private final String displayStatus;

    @SerializedName("reports_threshold_exceeded")
    private final boolean reportThresholdExceeded;

    public UserReportStatusDto(boolean z10, String str) {
        this.reportThresholdExceeded = z10;
        this.displayStatus = str;
    }

    public static /* synthetic */ UserReportStatusDto copy$default(UserReportStatusDto userReportStatusDto, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = userReportStatusDto.reportThresholdExceeded;
        }
        if ((i10 & 2) != 0) {
            str = userReportStatusDto.displayStatus;
        }
        return userReportStatusDto.copy(z10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getReportThresholdExceeded() {
        return this.reportThresholdExceeded;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    @NotNull
    public final UserReportStatusDto copy(boolean reportThresholdExceeded, String displayStatus) {
        return new UserReportStatusDto(reportThresholdExceeded, displayStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserReportStatusDto)) {
            return false;
        }
        UserReportStatusDto userReportStatusDto = (UserReportStatusDto) other;
        return this.reportThresholdExceeded == userReportStatusDto.reportThresholdExceeded && Intrinsics.a(this.displayStatus, userReportStatusDto.displayStatus);
    }

    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    public final boolean getReportThresholdExceeded() {
        return this.reportThresholdExceeded;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.reportThresholdExceeded) * 31;
        String str = this.displayStatus;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "UserReportStatusDto(reportThresholdExceeded=" + this.reportThresholdExceeded + ", displayStatus=" + this.displayStatus + ")";
    }
}
