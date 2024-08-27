package com.assetgro.stockgro.data.remote.request;

import a3.a;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ReportMessageRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "messageToBeReported", HttpUrl.FRAGMENT_ENCODE_SET, "code", "subReasonCode", "reasonText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessageToBeReported", "getReasonText", "getSubReasonCode", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ReportMessageRequestDto {
    public static final int $stable = 0;

    @SerializedName("reason_code")
    private final String code;

    @SerializedName("message_id")
    private final String messageToBeReported;

    @SerializedName("reason_text")
    @NotNull
    private final String reasonText;

    @SerializedName("sub_reason_code")
    @NotNull
    private final String subReasonCode;

    public ReportMessageRequestDto(String str, String str2, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        this.messageToBeReported = str;
        this.code = str2;
        this.subReasonCode = subReasonCode;
        this.reasonText = reasonText;
    }

    public static /* synthetic */ ReportMessageRequestDto copy$default(ReportMessageRequestDto reportMessageRequestDto, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reportMessageRequestDto.messageToBeReported;
        }
        if ((i10 & 2) != 0) {
            str2 = reportMessageRequestDto.code;
        }
        if ((i10 & 4) != 0) {
            str3 = reportMessageRequestDto.subReasonCode;
        }
        if ((i10 & 8) != 0) {
            str4 = reportMessageRequestDto.reasonText;
        }
        return reportMessageRequestDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessageToBeReported() {
        return this.messageToBeReported;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubReasonCode() {
        return this.subReasonCode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getReasonText() {
        return this.reasonText;
    }

    @NotNull
    public final ReportMessageRequestDto copy(String messageToBeReported, String code, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        return new ReportMessageRequestDto(messageToBeReported, code, subReasonCode, reasonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportMessageRequestDto)) {
            return false;
        }
        ReportMessageRequestDto reportMessageRequestDto = (ReportMessageRequestDto) other;
        return Intrinsics.a(this.messageToBeReported, reportMessageRequestDto.messageToBeReported) && Intrinsics.a(this.code, reportMessageRequestDto.code) && Intrinsics.a(this.subReasonCode, reportMessageRequestDto.subReasonCode) && Intrinsics.a(this.reasonText, reportMessageRequestDto.reasonText);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessageToBeReported() {
        return this.messageToBeReported;
    }

    @NotNull
    public final String getReasonText() {
        return this.reasonText;
    }

    @NotNull
    public final String getSubReasonCode() {
        return this.subReasonCode;
    }

    public int hashCode() {
        int hashCode;
        String str = this.messageToBeReported;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.code;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.reasonText.hashCode() + h.g(this.subReasonCode, (i11 + i10) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.messageToBeReported;
        String str2 = this.code;
        return a.k(e.l("ReportMessageRequestDto(messageToBeReported=", str, ", code=", str2, ", subReasonCode="), this.subReasonCode, ", reasonText=", this.reasonText, ")");
    }

    public /* synthetic */ ReportMessageRequestDto(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4);
    }
}
