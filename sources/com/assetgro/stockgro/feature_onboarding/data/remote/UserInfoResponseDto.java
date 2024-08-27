package com.assetgro.stockgro.feature_onboarding.data.remote;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import vt.p0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jy\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030-j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`.J\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000300J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/data/remote/UserInfoResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", HttpUrl.FRAGMENT_ENCODE_SET, "uuid", "avatarUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL, "countryCode", "mobilePrefix", "userRole", "invitationCode", "username", "isExpert", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatarUrl", "()Ljava/lang/String;", "getCountryCode", "getEmail", "getInvitationCode", "()Z", "getMobilePrefix", "getName", "getPhoneNumber", "getUserRole", "getUsername", "getUuid", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toAnalyticsParam", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "toLaunchMainParams", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserInfoResponseDto {
    public static final int $stable = 0;

    @SerializedName("avatar")
    private final String avatarUrl;

    @SerializedName("country_code")
    @NotNull
    private final String countryCode;

    @SerializedName(Scopes.EMAIL)
    @NotNull
    private final String email;

    @SerializedName("invitation_code")
    @NotNull
    private final String invitationCode;

    @SerializedName("is_ria_rra")
    private final boolean isExpert;

    @SerializedName("mobile_prefix")
    @NotNull
    private final String mobilePrefix;

    @SerializedName("display_name")
    @NotNull
    private final String name;

    @SerializedName("phone_number")
    @NotNull
    private final String phoneNumber;

    @SerializedName("user_role")
    @NotNull
    private final String userRole;

    @SerializedName("username")
    @NotNull
    private final String username;

    @SerializedName("uuid")
    @NotNull
    private final String uuid;

    public UserInfoResponseDto(@NotNull String phoneNumber, @NotNull String uuid, String str, @NotNull String name, @NotNull String email, @NotNull String countryCode, @NotNull String mobilePrefix, @NotNull String userRole, @NotNull String invitationCode, @NotNull String username, boolean z10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(mobilePrefix, "mobilePrefix");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(username, "username");
        this.phoneNumber = phoneNumber;
        this.uuid = uuid;
        this.avatarUrl = str;
        this.name = name;
        this.email = email;
        this.countryCode = countryCode;
        this.mobilePrefix = mobilePrefix;
        this.userRole = userRole;
        this.invitationCode = invitationCode;
        this.username = username;
        this.isExpert = z10;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getMobilePrefix() {
        return this.mobilePrefix;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getUserRole() {
        return this.userRole;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getInvitationCode() {
        return this.invitationCode;
    }

    @NotNull
    public final UserInfoResponseDto copy(@NotNull String phoneNumber, @NotNull String uuid, String avatarUrl, @NotNull String name, @NotNull String email, @NotNull String countryCode, @NotNull String mobilePrefix, @NotNull String userRole, @NotNull String invitationCode, @NotNull String username, boolean isExpert) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(mobilePrefix, "mobilePrefix");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        Intrinsics.checkNotNullParameter(username, "username");
        return new UserInfoResponseDto(phoneNumber, uuid, avatarUrl, name, email, countryCode, mobilePrefix, userRole, invitationCode, username, isExpert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoResponseDto)) {
            return false;
        }
        UserInfoResponseDto userInfoResponseDto = (UserInfoResponseDto) other;
        return Intrinsics.a(this.phoneNumber, userInfoResponseDto.phoneNumber) && Intrinsics.a(this.uuid, userInfoResponseDto.uuid) && Intrinsics.a(this.avatarUrl, userInfoResponseDto.avatarUrl) && Intrinsics.a(this.name, userInfoResponseDto.name) && Intrinsics.a(this.email, userInfoResponseDto.email) && Intrinsics.a(this.countryCode, userInfoResponseDto.countryCode) && Intrinsics.a(this.mobilePrefix, userInfoResponseDto.mobilePrefix) && Intrinsics.a(this.userRole, userInfoResponseDto.userRole) && Intrinsics.a(this.invitationCode, userInfoResponseDto.invitationCode) && Intrinsics.a(this.username, userInfoResponseDto.username) && this.isExpert == userInfoResponseDto.isExpert;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getInvitationCode() {
        return this.invitationCode;
    }

    @NotNull
    public final String getMobilePrefix() {
        return this.mobilePrefix;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getUserRole() {
        return this.userRole;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.uuid, this.phoneNumber.hashCode() * 31, 31);
        String str = this.avatarUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.isExpert) + h.g(this.username, h.g(this.invitationCode, h.g(this.userRole, h.g(this.mobilePrefix, h.g(this.countryCode, h.g(this.email, h.g(this.name, (g10 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isExpert() {
        return this.isExpert;
    }

    @NotNull
    public final HashMap<String, String> toAnalyticsParam() {
        return p0.f(new Pair("UUID", this.uuid), new Pair("phone_number", this.phoneNumber), new Pair("refcode", this.invitationCode), new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, this.name));
    }

    @NotNull
    public final Map<String, String> toLaunchMainParams() {
        String str = this.phoneNumber;
        Pair pair = new Pair("phone_number", str);
        String str2 = this.uuid;
        return p0.g(pair, new Pair("UUID", str2), new Pair("user_id", str2), new Pair("first_name", this.name), new Pair("phone", str));
    }

    @NotNull
    public String toString() {
        String str = this.phoneNumber;
        String str2 = this.uuid;
        String str3 = this.avatarUrl;
        String str4 = this.name;
        String str5 = this.email;
        String str6 = this.countryCode;
        String str7 = this.mobilePrefix;
        String str8 = this.userRole;
        String str9 = this.invitationCode;
        String str10 = this.username;
        boolean z10 = this.isExpert;
        StringBuilder l10 = e.l("UserInfoResponseDto(phoneNumber=", str, ", uuid=", str2, ", avatarUrl=");
        e.v(l10, str3, ", name=", str4, ", email=");
        e.v(l10, str5, ", countryCode=", str6, ", mobilePrefix=");
        e.v(l10, str7, ", userRole=", str8, ", invitationCode=");
        e.v(l10, str9, ", username=", str10, ", isExpert=");
        return da.e.o(l10, z10, ")");
    }

    public /* synthetic */ UserInfoResponseDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z10);
    }
}
