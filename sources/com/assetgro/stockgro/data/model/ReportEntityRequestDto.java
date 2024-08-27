package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/model/ReportEntityRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "code", HttpUrl.FRAGMENT_ENCODE_SET, "subReasonCode", "reasonText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getReasonText", "getSubReasonCode", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ReportEntityRequestDto {
    public static final int $stable = 0;

    @SerializedName("reason_code")
    private final String code;

    @SerializedName("reason_text")
    @NotNull
    private final String reasonText;

    @SerializedName("sub_reason_code")
    @NotNull
    private final String subReasonCode;

    public ReportEntityRequestDto(String str, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        this.code = str;
        this.subReasonCode = subReasonCode;
        this.reasonText = reasonText;
    }

    public static /* synthetic */ ReportEntityRequestDto copy$default(ReportEntityRequestDto reportEntityRequestDto, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reportEntityRequestDto.code;
        }
        if ((i10 & 2) != 0) {
            str2 = reportEntityRequestDto.subReasonCode;
        }
        if ((i10 & 4) != 0) {
            str3 = reportEntityRequestDto.reasonText;
        }
        return reportEntityRequestDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubReasonCode() {
        return this.subReasonCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReasonText() {
        return this.reasonText;
    }

    @NotNull
    public final ReportEntityRequestDto copy(String code, @NotNull String subReasonCode, @NotNull String reasonText) {
        Intrinsics.checkNotNullParameter(subReasonCode, "subReasonCode");
        Intrinsics.checkNotNullParameter(reasonText, "reasonText");
        return new ReportEntityRequestDto(code, subReasonCode, reasonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportEntityRequestDto)) {
            return false;
        }
        ReportEntityRequestDto reportEntityRequestDto = (ReportEntityRequestDto) other;
        return Intrinsics.a(this.code, reportEntityRequestDto.code) && Intrinsics.a(this.subReasonCode, reportEntityRequestDto.subReasonCode) && Intrinsics.a(this.reasonText, reportEntityRequestDto.reasonText);
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

    public int hashCode() {
        int hashCode;
        String str = this.code;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.reasonText.hashCode() + h.g(this.subReasonCode, hashCode * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.subReasonCode;
        return d.o(e.l("ReportEntityRequestDto(code=", str, ", subReasonCode=", str2, ", reasonText="), this.reasonText, ")");
    }

    public /* synthetic */ ReportEntityRequestDto(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3);
    }
}
