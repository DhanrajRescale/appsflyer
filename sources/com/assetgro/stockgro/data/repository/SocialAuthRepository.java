package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.LinkedInEmailModel;
import com.assetgro.stockgro.data.model.LinkedInProfileModel;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.response.LinkedInTokenResponseDto;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/repository/SocialAuthRepository;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getUserId", "linkedinCode", "Lnv/v0;", "Lcom/assetgro/stockgro/data/remote/response/LinkedInTokenResponseDto;", "getLinkedInAccessToken", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "accessToken", "Lcom/assetgro/stockgro/data/model/LinkedInProfileModel;", "getLinkedInUserProfile", "Lcom/assetgro/stockgro/data/model/LinkedInEmailModel;", "getLinkedInEmailAddress", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialAuthRepository {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public SocialAuthRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
    }

    public final Object getLinkedInAccessToken(@NotNull String str, @NotNull yt.a<? super v0<LinkedInTokenResponseDto>> aVar) {
        return this.networkService.getLinkedInAccessToken("authorization_code", str, "https://stockgro.onelink.me/vNON/mega6my1", "8689q2q53gx356", "XgpNzVl3J6mfS49I", aVar);
    }

    public final Object getLinkedInEmailAddress(@NotNull String str, @NotNull yt.a<? super v0<LinkedInEmailModel>> aVar) {
        return this.networkService.getLinkedInEmailAddress(str, aVar);
    }

    public final Object getLinkedInUserProfile(@NotNull String str, @NotNull yt.a<? super v0<LinkedInProfileModel>> aVar) {
        return this.networkService.getLinkedInUserProfile(str, aVar);
    }

    public final String getUserId() {
        return this.userPreferences.getUuid();
    }
}
