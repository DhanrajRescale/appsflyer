package com.assetgro.stockgro.data.remote;

import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import ek.u;
import iu.z;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.k;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import yk.g;

@Singleton
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0014*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/data/remote/TokenRefreshAuthenticator;", "Lokhttp3/Authenticator;", "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "logoutSubject", "Lcom/assetgro/stockgro/data/LogoutSubject;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/LogoutSubject;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;Lcom/assetgro/stockgro/data/remote/NetworkService;)V", "getNetworkService", "()Lcom/assetgro/stockgro/data/remote/NetworkService;", "getSessionId", "()Ljava/lang/String;", "getUserPreferences", "()Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "setUserPreferences", "(Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "createSignedRequest", "retryCount", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TokenRefreshAuthenticator implements Authenticator {
    public static final int $stable = 8;

    @NotNull
    private final LogoutSubject logoutSubject;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final String sessionId;

    @NotNull
    private UserPreferences userPreferences;

    @Inject
    public TokenRefreshAuthenticator(@NotNull String sessionId, @NotNull LogoutSubject logoutSubject, @NotNull UserPreferences userPreferences, @Named("REFRESH_NETWORK_SERVICE") @NotNull NetworkService networkService) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.sessionId = sessionId;
        this.logoutSubject = logoutSubject;
        this.userPreferences = userPreferences;
        this.networkService = networkService;
    }

    private final Request createSignedRequest(Response response, int i10) {
        try {
            z zVar = new z();
            zVar.f20560a = HttpUrl.FRAGMENT_ENCODE_SET;
            return (Request) g.X(k.f23369a, new TokenRefreshAuthenticator$createSignedRequest$1(this, response, zVar, null));
        } catch (Throwable unused) {
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("Authenticator", "tag");
            a.g("Failed to re-sign request", "s", objArr, "params", "Authenticator").getClass();
            u.l(objArr);
            return null;
        }
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, @NotNull Response response) {
        Request createSignedRequest;
        Intrinsics.checkNotNullParameter(response, "response");
        synchronized (this) {
            try {
                if (TokenRefreshAuthenticatorKt.getRetryCount(response) > 2) {
                    this.logoutSubject.signalLogout();
                    createSignedRequest = null;
                } else {
                    createSignedRequest = createSignedRequest(response, TokenRefreshAuthenticatorKt.getRetryCount(response));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return createSignedRequest;
    }

    @NotNull
    public final NetworkService getNetworkService() {
        return this.networkService;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final UserPreferences getUserPreferences() {
        return this.userPreferences;
    }

    public final void setUserPreferences(@NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(userPreferences, "<set-?>");
        this.userPreferences = userPreferences;
    }
}
