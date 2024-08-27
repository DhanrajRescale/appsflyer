package com.assetgro.stockgro.data.remote.request;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/UpdatePinNumberRequestDtoV2;", HttpUrl.FRAGMENT_ENCODE_SET, "updatedPin", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", "forgetPinOtp", "forgetPinSessionId", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getForgetPinOtp", "getForgetPinSessionId", "getPhoneNumber", "getUpdatedPin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UpdatePinNumberRequestDtoV2 {
    public static final int $stable = 0;

    @SerializedName("country_code")
    @NotNull
    private final String countryCode;

    @SerializedName("otp")
    @NotNull
    private final String forgetPinOtp;

    @SerializedName("session_id")
    @NotNull
    private final String forgetPinSessionId;

    @SerializedName("phone_number")
    @NotNull
    private final String phoneNumber;

    @SerializedName("pin")
    @NotNull
    private final String updatedPin;

    public UpdatePinNumberRequestDtoV2(@NotNull String updatedPin, @NotNull String phoneNumber, @NotNull String forgetPinOtp, @NotNull String forgetPinSessionId, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(forgetPinOtp, "forgetPinOtp");
        Intrinsics.checkNotNullParameter(forgetPinSessionId, "forgetPinSessionId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.updatedPin = updatedPin;
        this.phoneNumber = phoneNumber;
        this.forgetPinOtp = forgetPinOtp;
        this.forgetPinSessionId = forgetPinSessionId;
        this.countryCode = countryCode;
    }

    public static /* synthetic */ UpdatePinNumberRequestDtoV2 copy$default(UpdatePinNumberRequestDtoV2 updatePinNumberRequestDtoV2, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updatePinNumberRequestDtoV2.updatedPin;
        }
        if ((i10 & 2) != 0) {
            str2 = updatePinNumberRequestDtoV2.phoneNumber;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = updatePinNumberRequestDtoV2.forgetPinOtp;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = updatePinNumberRequestDtoV2.forgetPinSessionId;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = updatePinNumberRequestDtoV2.countryCode;
        }
        return updatePinNumberRequestDtoV2.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUpdatedPin() {
        return this.updatedPin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getForgetPinOtp() {
        return this.forgetPinOtp;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getForgetPinSessionId() {
        return this.forgetPinSessionId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final UpdatePinNumberRequestDtoV2 copy(@NotNull String updatedPin, @NotNull String phoneNumber, @NotNull String forgetPinOtp, @NotNull String forgetPinSessionId, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(forgetPinOtp, "forgetPinOtp");
        Intrinsics.checkNotNullParameter(forgetPinSessionId, "forgetPinSessionId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new UpdatePinNumberRequestDtoV2(updatedPin, phoneNumber, forgetPinOtp, forgetPinSessionId, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePinNumberRequestDtoV2)) {
            return false;
        }
        UpdatePinNumberRequestDtoV2 updatePinNumberRequestDtoV2 = (UpdatePinNumberRequestDtoV2) other;
        return Intrinsics.a(this.updatedPin, updatePinNumberRequestDtoV2.updatedPin) && Intrinsics.a(this.phoneNumber, updatePinNumberRequestDtoV2.phoneNumber) && Intrinsics.a(this.forgetPinOtp, updatePinNumberRequestDtoV2.forgetPinOtp) && Intrinsics.a(this.forgetPinSessionId, updatePinNumberRequestDtoV2.forgetPinSessionId) && Intrinsics.a(this.countryCode, updatePinNumberRequestDtoV2.countryCode);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getForgetPinOtp() {
        return this.forgetPinOtp;
    }

    @NotNull
    public final String getForgetPinSessionId() {
        return this.forgetPinSessionId;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getUpdatedPin() {
        return this.updatedPin;
    }

    public int hashCode() {
        return this.countryCode.hashCode() + h.g(this.forgetPinSessionId, h.g(this.forgetPinOtp, h.g(this.phoneNumber, this.updatedPin.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.updatedPin;
        String str2 = this.phoneNumber;
        String str3 = this.forgetPinOtp;
        String str4 = this.forgetPinSessionId;
        String str5 = this.countryCode;
        StringBuilder l10 = e.l("UpdatePinNumberRequestDtoV2(updatedPin=", str, ", phoneNumber=", str2, ", forgetPinOtp=");
        e.v(l10, str3, ", forgetPinSessionId=", str4, ", countryCode=");
        return d.o(l10, str5, ")");
    }
}
