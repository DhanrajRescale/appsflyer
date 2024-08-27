package com.assetgro.stockgro.data.remote;

import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import in.juspay.hyper.constants.LogSubCategory;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/assetgro/stockgro/data/remote/BaseInterceptor;", "Lokhttp3/Interceptor;", "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "getUserPreferences", "()Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "setUserPreferences", "(Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "getUserAgent", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseInterceptor implements Interceptor {
    public static final int $stable = 8;

    @NotNull
    private final String sessionId;

    @NotNull
    private UserPreferences userPreferences;

    public BaseInterceptor(@NotNull String sessionId, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.sessionId = sessionId;
        this.userPreferences = userPreferences;
    }

    private final String getUserAgent() {
        return "StockGro_Android_220";
    }

    @NotNull
    public final UserPreferences getUserPreferences() {
        return this.userPreferences;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Request.Builder removeHeader;
        Intrinsics.checkNotNullParameter(chain, "chain");
        boolean isOnline = WifiService.INSTANCE.getInstance().isOnline();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!isOnline) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(600).body(ResponseBody.Companion.create$default(ResponseBody.INSTANCE, HttpUrl.FRAGMENT_ENCODE_SET, (MediaType) null, 1, (Object) null)).message("Not connected to internet").build();
        }
        Request request = chain.request();
        boolean a10 = true ^ Intrinsics.a(request.headers().get("isAuthorizable"), "false");
        if (a10) {
            Request.Builder addHeader = request.newBuilder().addHeader("platform", LogSubCategory.LifeCycle.ANDROID);
            String loginId = this.userPreferences.getLoginId();
            if (loginId != null) {
                str = loginId;
            }
            removeHeader = addHeader.addHeader("loginId", str).addHeader("sessionid", this.sessionId).addHeader("User-Agent", getUserAgent()).addHeader("version_code", "220").addHeader("version-code", "220");
        } else {
            removeHeader = request.newBuilder().removeHeader("isAuthorizable");
        }
        if (w.s(request.url().host(), "stockgro", false)) {
            if (w.s(request.url().getUrl(), "refresh", false)) {
                String refreshToken = this.userPreferences.getRefreshToken();
                if (refreshToken != null) {
                    removeHeader.addHeader("Authorization", "Bearer ".concat(refreshToken));
                }
            } else {
                String accessToken = this.userPreferences.getAccessToken();
                if (accessToken != null && a10) {
                    removeHeader.addHeader("Authorization", "Bearer ".concat(accessToken));
                }
            }
        }
        return chain.proceed(removeHeader.build());
    }

    public final void setUserPreferences(@NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(userPreferences, "<set-?>");
        this.userPreferences = userPreferences;
    }
}
