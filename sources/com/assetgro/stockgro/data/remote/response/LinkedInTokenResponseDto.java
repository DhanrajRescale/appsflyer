package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import da.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/LinkedInTokenResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "accessToken", HttpUrl.FRAGMENT_ENCODE_SET, "expiresIn", HttpUrl.FRAGMENT_ENCODE_SET, "scope", "(Ljava/lang/String;ILjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()I", "getScope", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LinkedInTokenResponseDto {
    public static final int $stable = 0;

    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    @SerializedName("expires_in")
    private final int expiresIn;

    @SerializedName("scope")
    @NotNull
    private final String scope;

    public LinkedInTokenResponseDto(@NotNull String accessToken, int i10, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.accessToken = accessToken;
        this.expiresIn = i10;
        this.scope = scope;
    }

    public static /* synthetic */ LinkedInTokenResponseDto copy$default(LinkedInTokenResponseDto linkedInTokenResponseDto, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkedInTokenResponseDto.accessToken;
        }
        if ((i11 & 2) != 0) {
            i10 = linkedInTokenResponseDto.expiresIn;
        }
        if ((i11 & 4) != 0) {
            str2 = linkedInTokenResponseDto.scope;
        }
        return linkedInTokenResponseDto.copy(str, i10, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final LinkedInTokenResponseDto copy(@NotNull String accessToken, int expiresIn, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new LinkedInTokenResponseDto(accessToken, expiresIn, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkedInTokenResponseDto)) {
            return false;
        }
        LinkedInTokenResponseDto linkedInTokenResponseDto = (LinkedInTokenResponseDto) other;
        return Intrinsics.a(this.accessToken, linkedInTokenResponseDto.accessToken) && this.expiresIn == linkedInTokenResponseDto.expiresIn && Intrinsics.a(this.scope, linkedInTokenResponseDto.scope);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getScope() {
        return this.scope;
    }

    public int hashCode() {
        return this.scope.hashCode() + e.f(this.expiresIn, this.accessToken.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        int i10 = this.expiresIn;
        String str2 = this.scope;
        StringBuilder sb2 = new StringBuilder("LinkedInTokenResponseDto(accessToken=");
        sb2.append(str);
        sb2.append(", expiresIn=");
        sb2.append(i10);
        sb2.append(", scope=");
        return d.o(sb2, str2, ")");
    }
}
