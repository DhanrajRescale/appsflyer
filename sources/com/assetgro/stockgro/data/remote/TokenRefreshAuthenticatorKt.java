package com.assetgro.stockgro.data.remote;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a$\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"retryCount", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Response;", "getRetryCount", "(Lokhttp3/Response;)I", "getUserAgent", HttpUrl.FRAGMENT_ENCODE_SET, "signWithToken", "Lokhttp3/Request;", "sessionId", "accessToken", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "app_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TokenRefreshAuthenticatorKt {
    public static final int getRetryCount(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        int i10 = 0;
        for (Response priorResponse = response.priorResponse(); priorResponse != null; priorResponse = priorResponse.priorResponse()) {
            i10++;
        }
        return i10;
    }

    @NotNull
    public static final String getUserAgent() {
        return "StockGro_Android_220";
    }

    @NotNull
    public static final Request signWithToken(@NotNull Request request, @NotNull String sessionId, String str, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(request, "<this>");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        Request.Builder addHeader = request.newBuilder().addHeader("platform", LogSubCategory.LifeCycle.ANDROID).removeHeader("loginId").removeHeader("sessionid").removeHeader("User-Agent").removeHeader("version_code").removeHeader("version-code").removeHeader("Authorization").addHeader("platform", LogSubCategory.LifeCycle.ANDROID);
        String loginId = userPreferences.getLoginId();
        if (loginId == null) {
            loginId = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return addHeader.addHeader("loginId", loginId).addHeader("sessionid", sessionId).addHeader("User-Agent", getUserAgent()).addHeader("version_code", "220").addHeader("version-code", "220").addHeader("Authorization", "Bearer " + str).build();
    }
}
