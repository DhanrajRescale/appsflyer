package com.assetgro.stockgro.feature_onboarding.data.remote;

import a3.a;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/data/remote/OnboardingResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "accessToken", HttpUrl.FRAGMENT_ENCODE_SET, "refreshToken", "avatar", "displayName", "loginId", "userRole", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAvatar", "getDisplayName", "getLoginId", "getRefreshToken", "getUserRole", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OnboardingResponseDto {
    public static final int $stable = 0;

    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("display_name")
    @NotNull
    private final String displayName;

    @SerializedName("login_id")
    @NotNull
    private final String loginId;

    @SerializedName("refresh_token")
    @NotNull
    private final String refreshToken;

    @SerializedName("user_role")
    private final String userRole;

    public OnboardingResponseDto(@NotNull String accessToken, @NotNull String refreshToken, String str, @NotNull String displayName, @NotNull String loginId, String str2) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(loginId, "loginId");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.avatar = str;
        this.displayName = displayName;
        this.loginId = loginId;
        this.userRole = str2;
    }

    public static /* synthetic */ OnboardingResponseDto copy$default(OnboardingResponseDto onboardingResponseDto, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = onboardingResponseDto.accessToken;
        }
        if ((i10 & 2) != 0) {
            str2 = onboardingResponseDto.refreshToken;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = onboardingResponseDto.avatar;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = onboardingResponseDto.displayName;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = onboardingResponseDto.loginId;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = onboardingResponseDto.userRole;
        }
        return onboardingResponseDto.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLoginId() {
        return this.loginId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUserRole() {
        return this.userRole;
    }

    @NotNull
    public final OnboardingResponseDto copy(@NotNull String accessToken, @NotNull String refreshToken, String avatar, @NotNull String displayName, @NotNull String loginId, String userRole) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(loginId, "loginId");
        return new OnboardingResponseDto(accessToken, refreshToken, avatar, displayName, loginId, userRole);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingResponseDto)) {
            return false;
        }
        OnboardingResponseDto onboardingResponseDto = (OnboardingResponseDto) other;
        return Intrinsics.a(this.accessToken, onboardingResponseDto.accessToken) && Intrinsics.a(this.refreshToken, onboardingResponseDto.refreshToken) && Intrinsics.a(this.avatar, onboardingResponseDto.avatar) && Intrinsics.a(this.displayName, onboardingResponseDto.displayName) && Intrinsics.a(this.loginId, onboardingResponseDto.loginId) && Intrinsics.a(this.userRole, onboardingResponseDto.userRole);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getLoginId() {
        return this.loginId;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getUserRole() {
        return this.userRole;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.refreshToken, this.accessToken.hashCode() * 31, 31);
        String str = this.avatar;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g11 = h.g(this.loginId, h.g(this.displayName, (g10 + hashCode) * 31, 31), 31);
        String str2 = this.userRole;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return g11 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.avatar;
        String str4 = this.displayName;
        String str5 = this.loginId;
        String str6 = this.userRole;
        StringBuilder l10 = e.l("OnboardingResponseDto(accessToken=", str, ", refreshToken=", str2, ", avatar=");
        e.v(l10, str3, ", displayName=", str4, ", loginId=");
        return a.k(l10, str5, ", userRole=", str6, ")");
    }
}
