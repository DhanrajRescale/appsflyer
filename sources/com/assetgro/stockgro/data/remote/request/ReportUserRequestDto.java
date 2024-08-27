package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ReportUserRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "isReport", HttpUrl.FRAGMENT_ENCODE_SET, "userToBeReported", HttpUrl.FRAGMENT_ENCODE_SET, "code", "subReasonCode", "reasonText", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "()Z", "getReasonText", "getSubReasonCode", "getUserToBeReported", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ReportUserRequestDto {
    public static final int $stable = 0;

    @SerializedName("reason_code")
    private final String code;

    @SerializedName("is_reported")
    private final boolean isReport;

    @SerializedName("reason_text")
    @NotNull
    private final String reasonText;

    @SerializedName("sub_reason_code")
    @NotNull
    private final String subReasonCode;

    @SerializedName("to_report")
    private final String userToBeReported;

    public ReportUserRequestDto(boolean z10, String str, String str2, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        this.isReport = z10;
        this.userToBeReported = str;
        this.code = str2;
        this.subReasonCode = subReasonCode;
        this.reasonText = reasonText;
    }

    public static /* synthetic */ ReportUserRequestDto copy$default(ReportUserRequestDto reportUserRequestDto, boolean z10, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = reportUserRequestDto.isReport;
        }
        if ((i10 & 2) != 0) {
            str = reportUserRequestDto.userToBeReported;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = reportUserRequestDto.code;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = reportUserRequestDto.subReasonCode;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = reportUserRequestDto.reasonText;
        }
        return reportUserRequestDto.copy(z10, str5, str6, str7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsReport() {
        return this.isReport;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserToBeReported() {
        return this.userToBeReported;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSubReasonCode() {
        return this.subReasonCode;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getReasonText() {
        return this.reasonText;
    }

    @NotNull
    public final ReportUserRequestDto copy(boolean isReport, String userToBeReported, String code, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        return new ReportUserRequestDto(isReport, userToBeReported, code, subReasonCode, reasonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportUserRequestDto)) {
            return false;
        }
        ReportUserRequestDto reportUserRequestDto = (ReportUserRequestDto) other;
        return this.isReport == reportUserRequestDto.isReport && Intrinsics.a(this.userToBeReported, reportUserRequestDto.userToBeReported) && Intrinsics.a(this.code, reportUserRequestDto.code) && Intrinsics.a(this.subReasonCode, reportUserRequestDto.subReasonCode) && Intrinsics.a(this.reasonText, reportUserRequestDto.reasonText);
    }

    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getReasonText() {
        return this.reasonText;
    }

    @NotNull
    public final String getSubReasonCode() {
        return this.subReasonCode;
    }

    public final String getUserToBeReported() {
        return this.userToBeReported;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.isReport) * 31;
        String str = this.userToBeReported;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        String str2 = this.code;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.reasonText.hashCode() + h.g(this.subReasonCode, (i11 + i10) * 31, 31);
    }

    public final boolean isReport() {
        return this.isReport;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.isReport;
        String str = this.userToBeReported;
        String str2 = this.code;
        String str3 = this.subReasonCode;
        String str4 = this.reasonText;
        StringBuilder sb2 = new StringBuilder("ReportUserRequestDto(isReport=");
        sb2.append(z10);
        sb2.append(", userToBeReported=");
        sb2.append(str);
        sb2.append(", code=");
        e.v(sb2, str2, ", subReasonCode=", str3, ", reasonText=");
        return d.o(sb2, str4, ")");
    }

    public /* synthetic */ ReportUserRequestDto(boolean z10, String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, str, str2, (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i10 & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4);
    }
}
