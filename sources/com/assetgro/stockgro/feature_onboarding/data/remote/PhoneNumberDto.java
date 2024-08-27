package com.assetgro.stockgro.feature_onboarding.data.remote;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/data/remote/PhoneNumberDto;", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", HttpUrl.FRAGMENT_ENCODE_SET, "countryCode", "otpChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getOtpChannel", "getPhoneNumber", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PhoneNumberDto {
    public static final int $stable = 0;

    @SerializedName("country_code")
    @NotNull
    private final String countryCode;

    @SerializedName("otp_channel")
    @NotNull
    private final String otpChannel;

    @SerializedName("phone_number")
    @NotNull
    private final String phoneNumber;

    public PhoneNumberDto(@NotNull String phoneNumber, @NotNull String countryCode, @NotNull String otpChannel) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.otpChannel = otpChannel;
    }

    public static /* synthetic */ PhoneNumberDto copy$default(PhoneNumberDto phoneNumberDto, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = phoneNumberDto.phoneNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = phoneNumberDto.countryCode;
        }
        if ((i10 & 4) != 0) {
            str3 = phoneNumberDto.otpChannel;
        }
        return phoneNumberDto.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOtpChannel() {
        return this.otpChannel;
    }

    @NotNull
    public final PhoneNumberDto copy(@NotNull String phoneNumber, @NotNull String countryCode, @NotNull String otpChannel) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
        return new PhoneNumberDto(phoneNumber, countryCode, otpChannel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneNumberDto)) {
            return false;
        }
        PhoneNumberDto phoneNumberDto = (PhoneNumberDto) other;
        return Intrinsics.a(this.phoneNumber, phoneNumberDto.phoneNumber) && Intrinsics.a(this.countryCode, phoneNumberDto.countryCode) && Intrinsics.a(this.otpChannel, phoneNumberDto.otpChannel);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getOtpChannel() {
        return this.otpChannel;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return this.otpChannel.hashCode() + h.g(this.countryCode, this.phoneNumber.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.phoneNumber;
        String str2 = this.countryCode;
        return d.o(e.l("PhoneNumberDto(phoneNumber=", str, ", countryCode=", str2, ", otpChannel="), this.otpChannel, ")");
    }

    public /* synthetic */ PhoneNumberDto(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3);
    }
}
