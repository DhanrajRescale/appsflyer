package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ReportChatGroupRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "isReport", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "(ZLjava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ReportChatGroupRequestDto {
    public static final int $stable = 0;

    @SerializedName("group_id")
    @NotNull
    private final String groupId;

    @SerializedName("is_reported")
    private final boolean isReport;

    public ReportChatGroupRequestDto(boolean z10, @NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.isReport = z10;
        this.groupId = groupId;
    }

    public static /* synthetic */ ReportChatGroupRequestDto copy$default(ReportChatGroupRequestDto reportChatGroupRequestDto, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = reportChatGroupRequestDto.isReport;
        }
        if ((i10 & 2) != 0) {
            str = reportChatGroupRequestDto.groupId;
        }
        return reportChatGroupRequestDto.copy(z10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsReport() {
        return this.isReport;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final ReportChatGroupRequestDto copy(boolean isReport, @NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return new ReportChatGroupRequestDto(isReport, groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportChatGroupRequestDto)) {
            return false;
        }
        ReportChatGroupRequestDto reportChatGroupRequestDto = (ReportChatGroupRequestDto) other;
        return this.isReport == reportChatGroupRequestDto.isReport && Intrinsics.a(this.groupId, reportChatGroupRequestDto.groupId);
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return this.groupId.hashCode() + (Boolean.hashCode(this.isReport) * 31);
    }

    public final boolean isReport() {
        return this.isReport;
    }

    @NotNull
    public String toString() {
        return "ReportChatGroupRequestDto(isReport=" + this.isReport + ", groupId=" + this.groupId + ")";
    }
}
