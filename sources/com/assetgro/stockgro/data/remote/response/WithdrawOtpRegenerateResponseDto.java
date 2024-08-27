package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import da.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/WithdrawOtpRegenerateResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "otpTime", HttpUrl.FRAGMENT_ENCODE_SET, "message", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getOtpTime", "()I", "getSessionId", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WithdrawOtpRegenerateResponseDto {
    public static final int $stable = 0;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("otp_timer")
    private final int otpTime;

    @SerializedName("session_id")
    @NotNull
    private final String sessionId;

    public WithdrawOtpRegenerateResponseDto(@NotNull String sessionId, int i10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.sessionId = sessionId;
        this.otpTime = i10;
        this.message = message;
    }

    public static /* synthetic */ WithdrawOtpRegenerateResponseDto copy$default(WithdrawOtpRegenerateResponseDto withdrawOtpRegenerateResponseDto, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawOtpRegenerateResponseDto.sessionId;
        }
        if ((i11 & 2) != 0) {
            i10 = withdrawOtpRegenerateResponseDto.otpTime;
        }
        if ((i11 & 4) != 0) {
            str2 = withdrawOtpRegenerateResponseDto.message;
        }
        return withdrawOtpRegenerateResponseDto.copy(str, i10, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOtpTime() {
        return this.otpTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final WithdrawOtpRegenerateResponseDto copy(@NotNull String sessionId, int otpTime, @NotNull String message) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(message, "message");
        return new WithdrawOtpRegenerateResponseDto(sessionId, otpTime, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawOtpRegenerateResponseDto)) {
            return false;
        }
        WithdrawOtpRegenerateResponseDto withdrawOtpRegenerateResponseDto = (WithdrawOtpRegenerateResponseDto) other;
        return Intrinsics.a(this.sessionId, withdrawOtpRegenerateResponseDto.sessionId) && this.otpTime == withdrawOtpRegenerateResponseDto.otpTime && Intrinsics.a(this.message, withdrawOtpRegenerateResponseDto.message);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getOtpTime() {
        return this.otpTime;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.message.hashCode() + e.f(this.otpTime, this.sessionId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        int i10 = this.otpTime;
        String str2 = this.message;
        StringBuilder sb2 = new StringBuilder("WithdrawOtpRegenerateResponseDto(sessionId=");
        sb2.append(str);
        sb2.append(", otpTime=");
        sb2.append(i10);
        sb2.append(", message=");
        return d.o(sb2, str2, ")");
    }
}
