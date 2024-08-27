package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/TokenRefreshResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "accessToken", HttpUrl.FRAGMENT_ENCODE_SET, "userRole", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getUserRole", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TokenRefreshResponseDto {
    public static final int $stable = 0;

    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    @SerializedName("user_role")
    @NotNull
    private final String userRole;

    public TokenRefreshResponseDto(@NotNull String accessToken, @NotNull String userRole) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        this.accessToken = accessToken;
        this.userRole = userRole;
    }

    public static /* synthetic */ TokenRefreshResponseDto copy$default(TokenRefreshResponseDto tokenRefreshResponseDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenRefreshResponseDto.accessToken;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenRefreshResponseDto.userRole;
        }
        return tokenRefreshResponseDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUserRole() {
        return this.userRole;
    }

    @NotNull
    public final TokenRefreshResponseDto copy(@NotNull String accessToken, @NotNull String userRole) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        return new TokenRefreshResponseDto(accessToken, userRole);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenRefreshResponseDto)) {
            return false;
        }
        TokenRefreshResponseDto tokenRefreshResponseDto = (TokenRefreshResponseDto) other;
        return Intrinsics.a(this.accessToken, tokenRefreshResponseDto.accessToken) && Intrinsics.a(this.userRole, tokenRefreshResponseDto.userRole);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getUserRole() {
        return this.userRole;
    }

    public int hashCode() {
        return this.userRole.hashCode() + (this.accessToken.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return h.s("TokenRefreshResponseDto(accessToken=", this.accessToken, ", userRole=", this.userRole, ")");
    }
}
