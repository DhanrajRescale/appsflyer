package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/WithdrawInitiateResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "otpTime", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "getOtpTime", "()I", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WithdrawInitiateResponseDto {
    public static final int $stable = 0;

    @SerializedName("otp_timer")
    private final int otpTime;

    @SerializedName("session_id")
    @NotNull
    private final String sessionId;

    public WithdrawInitiateResponseDto(@NotNull String sessionId, int i10) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.otpTime = i10;
    }

    public static /* synthetic */ WithdrawInitiateResponseDto copy$default(WithdrawInitiateResponseDto withdrawInitiateResponseDto, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawInitiateResponseDto.sessionId;
        }
        if ((i11 & 2) != 0) {
            i10 = withdrawInitiateResponseDto.otpTime;
        }
        return withdrawInitiateResponseDto.copy(str, i10);
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
    public final WithdrawInitiateResponseDto copy(@NotNull String sessionId, int otpTime) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new WithdrawInitiateResponseDto(sessionId, otpTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawInitiateResponseDto)) {
            return false;
        }
        WithdrawInitiateResponseDto withdrawInitiateResponseDto = (WithdrawInitiateResponseDto) other;
        return Intrinsics.a(this.sessionId, withdrawInitiateResponseDto.sessionId) && this.otpTime == withdrawInitiateResponseDto.otpTime;
    }

    public final int getOtpTime() {
        return this.otpTime;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Integer.hashCode(this.otpTime) + (this.sessionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WithdrawInitiateResponseDto(sessionId=" + this.sessionId + ", otpTime=" + this.otpTime + ")";
    }
}
