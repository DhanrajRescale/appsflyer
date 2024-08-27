package com.assetgro.stockgro.feature_onboarding.data.remote;

import a3.a;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0085\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/data/remote/RegisterRequestDto;", HttpUrl.FRAGMENT_ENCODE_SET, "mobileNumber", HttpUrl.FRAGMENT_ENCODE_SET, "pin", "firebaseToken", "displayName", "invitationCode", "appVersionCode", "whatsappConsent", HttpUrl.FRAGMENT_ENCODE_SET, "sessionId", "otp", "notificationId", "udid", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersionCode", "()Ljava/lang/String;", "getCountryCode", "getDisplayName", "getFirebaseToken", "getInvitationCode", "getMobileNumber", "getNotificationId", "getOtp", "getPin", "getSessionId", "getUdid", "getWhatsappConsent", "()Z", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RegisterRequestDto {
    public static final int $stable = 0;

    @SerializedName("app_version_code")
    @NotNull
    private final String appVersionCode;

    @SerializedName("country_code")
    @NotNull
    private final String countryCode;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("device_id")
    @NotNull
    private final String firebaseToken;

    @SerializedName("invitation_code")
    private final String invitationCode;

    @SerializedName("phone_number")
    @NotNull
    private final String mobileNumber;

    @SerializedName("notification_id")
    @NotNull
    private final String notificationId;

    @SerializedName("otp")
    @NotNull
    private final String otp;

    @SerializedName("pin")
    @NotNull
    private final String pin;

    @SerializedName("session_id")
    @NotNull
    private final String sessionId;

    @SerializedName("udid")
    private final String udid;

    @SerializedName("whatsapp_consent")
    private final boolean whatsappConsent;

    public RegisterRequestDto(@NotNull String mobileNumber, @NotNull String pin, @NotNull String firebaseToken, @NotNull String displayName, String str, @NotNull String appVersionCode, boolean z10, @NotNull String sessionId, @NotNull String otp, @NotNull String notificationId, String str2, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(firebaseToken, "firebaseToken");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(appVersionCode, "appVersionCode");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.mobileNumber = mobileNumber;
        this.pin = pin;
        this.firebaseToken = firebaseToken;
        this.displayName = displayName;
        this.invitationCode = str;
        this.appVersionCode = appVersionCode;
        this.whatsappConsent = z10;
        this.sessionId = sessionId;
        this.otp = otp;
        this.notificationId = notificationId;
        this.udid = str2;
        this.countryCode = countryCode;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getNotificationId() {
        return this.notificationId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUdid() {
        return this.udid;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInvitationCode() {
        return this.invitationCode;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAppVersionCode() {
        return this.appVersionCode;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getWhatsappConsent() {
        return this.whatsappConsent;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    @NotNull
    public final RegisterRequestDto copy(@NotNull String mobileNumber, @NotNull String pin, @NotNull String firebaseToken, @NotNull String displayName, String invitationCode, @NotNull String appVersionCode, boolean whatsappConsent, @NotNull String sessionId, @NotNull String otp, @NotNull String notificationId, String udid, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(firebaseToken, "firebaseToken");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(appVersionCode, "appVersionCode");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new RegisterRequestDto(mobileNumber, pin, firebaseToken, displayName, invitationCode, appVersionCode, whatsappConsent, sessionId, otp, notificationId, udid, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterRequestDto)) {
            return false;
        }
        RegisterRequestDto registerRequestDto = (RegisterRequestDto) other;
        return Intrinsics.a(this.mobileNumber, registerRequestDto.mobileNumber) && Intrinsics.a(this.pin, registerRequestDto.pin) && Intrinsics.a(this.firebaseToken, registerRequestDto.firebaseToken) && Intrinsics.a(this.displayName, registerRequestDto.displayName) && Intrinsics.a(this.invitationCode, registerRequestDto.invitationCode) && Intrinsics.a(this.appVersionCode, registerRequestDto.appVersionCode) && this.whatsappConsent == registerRequestDto.whatsappConsent && Intrinsics.a(this.sessionId, registerRequestDto.sessionId) && Intrinsics.a(this.otp, registerRequestDto.otp) && Intrinsics.a(this.notificationId, registerRequestDto.notificationId) && Intrinsics.a(this.udid, registerRequestDto.udid) && Intrinsics.a(this.countryCode, registerRequestDto.countryCode);
    }

    @NotNull
    public final String getAppVersionCode() {
        return this.appVersionCode;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    public final String getInvitationCode() {
        return this.invitationCode;
    }

    @NotNull
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @NotNull
    public final String getNotificationId() {
        return this.notificationId;
    }

    @NotNull
    public final String getOtp() {
        return this.otp;
    }

    @NotNull
    public final String getPin() {
        return this.pin;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUdid() {
        return this.udid;
    }

    public final boolean getWhatsappConsent() {
        return this.whatsappConsent;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.displayName, h.g(this.firebaseToken, h.g(this.pin, this.mobileNumber.hashCode() * 31, 31), 31), 31);
        String str = this.invitationCode;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g11 = h.g(this.notificationId, h.g(this.otp, h.g(this.sessionId, e.d(this.whatsappConsent, h.g(this.appVersionCode, (g10 + hashCode) * 31, 31), 31), 31), 31), 31);
        String str2 = this.udid;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.countryCode.hashCode() + ((g11 + i10) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.mobileNumber;
        String str2 = this.pin;
        String str3 = this.firebaseToken;
        String str4 = this.displayName;
        String str5 = this.invitationCode;
        String str6 = this.appVersionCode;
        boolean z10 = this.whatsappConsent;
        String str7 = this.sessionId;
        String str8 = this.otp;
        String str9 = this.notificationId;
        String str10 = this.udid;
        String str11 = this.countryCode;
        StringBuilder l10 = e.l("RegisterRequestDto(mobileNumber=", str, ", pin=", str2, ", firebaseToken=");
        e.v(l10, str3, ", displayName=", str4, ", invitationCode=");
        e.v(l10, str5, ", appVersionCode=", str6, ", whatsappConsent=");
        l10.append(z10);
        l10.append(", sessionId=");
        l10.append(str7);
        l10.append(", otp=");
        e.v(l10, str8, ", notificationId=", str9, ", udid=");
        return a.k(l10, str10, ", countryCode=", str11, ")");
    }
}
