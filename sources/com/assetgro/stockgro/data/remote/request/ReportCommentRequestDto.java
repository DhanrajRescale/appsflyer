package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ReportCommentRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "commentId", HttpUrl.FRAGMENT_ENCODE_SET, "userId", "reportData", "Lcom/assetgro/stockgro/data/remote/request/ReportData;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/remote/request/ReportData;)V", "getCommentId", "()Ljava/lang/String;", "getReportData", "()Lcom/assetgro/stockgro/data/remote/request/ReportData;", "getUserId", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ReportCommentRequestDto {
    public static final int $stable = 0;

    @SerializedName("item_id")
    @NotNull
    private final String commentId;

    @SerializedName("report_data")
    private final ReportData reportData;

    @SerializedName("user_id")
    private final String userId;

    public ReportCommentRequestDto(@NotNull String commentId, String str, ReportData reportData) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        this.commentId = commentId;
        this.userId = str;
        this.reportData = reportData;
    }

    public static /* synthetic */ ReportCommentRequestDto copy$default(ReportCommentRequestDto reportCommentRequestDto, String str, String str2, ReportData reportData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reportCommentRequestDto.commentId;
        }
        if ((i10 & 2) != 0) {
            str2 = reportCommentRequestDto.userId;
        }
        if ((i10 & 4) != 0) {
            reportData = reportCommentRequestDto.reportData;
        }
        return reportCommentRequestDto.copy(str, str2, reportData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCommentId() {
        return this.commentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final ReportData getReportData() {
        return this.reportData;
    }

    @NotNull
    public final ReportCommentRequestDto copy(@NotNull String commentId, String userId, ReportData reportData) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        return new ReportCommentRequestDto(commentId, userId, reportData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportCommentRequestDto)) {
            return false;
        }
        ReportCommentRequestDto reportCommentRequestDto = (ReportCommentRequestDto) other;
        return Intrinsics.a(this.commentId, reportCommentRequestDto.commentId) && Intrinsics.a(this.userId, reportCommentRequestDto.userId) && Intrinsics.a(this.reportData, reportCommentRequestDto.reportData);
    }

    @NotNull
    public final String getCommentId() {
        return this.commentId;
    }

    public final ReportData getReportData() {
        return this.reportData;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = this.commentId.hashCode() * 31;
        String str = this.userId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReportData reportData = this.reportData;
        return hashCode2 + (reportData != null ? reportData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.commentId;
        String str2 = this.userId;
        ReportData reportData = this.reportData;
        StringBuilder l10 = e.l("ReportCommentRequestDto(commentId=", str, ", userId=", str2, ", reportData=");
        l10.append(reportData);
        l10.append(")");
        return l10.toString();
    }
}
