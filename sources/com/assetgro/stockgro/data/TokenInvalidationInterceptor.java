package com.assetgro.stockgro.data;

import ek.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/assetgro/stockgro/data/TokenInvalidationInterceptor;", "Lokhttp3/Interceptor;", "logoutSubject", "Lcom/assetgro/stockgro/data/LogoutSubject;", "multipleSignInLogoutSubject", "Lcom/assetgro/stockgro/data/MultipleSignInLogoutSubject;", "(Lcom/assetgro/stockgro/data/LogoutSubject;Lcom/assetgro/stockgro/data/MultipleSignInLogoutSubject;)V", "logoutTriggered", HttpUrl.FRAGMENT_ENCODE_SET, "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TokenInvalidationInterceptor implements Interceptor {
    public static final int InvalidatedTokenResponseCode = 401;

    @NotNull
    private final LogoutSubject logoutSubject;
    private boolean logoutTriggered;

    @NotNull
    private final MultipleSignInLogoutSubject multipleSignInLogoutSubject;
    public static final int $stable = 8;

    @Inject
    public TokenInvalidationInterceptor(@NotNull LogoutSubject logoutSubject, @NotNull MultipleSignInLogoutSubject multipleSignInLogoutSubject) {
        Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
        Intrinsics.checkNotNullParameter(multipleSignInLogoutSubject, "multipleSignInLogoutSubject");
        this.logoutSubject = logoutSubject;
        this.multipleSignInLogoutSubject = multipleSignInLogoutSubject;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        if (w.s(request.url().host(), "stockgro", false) && w.s(request.url().getUrl(), "login", false)) {
            this.logoutTriggered = false;
        }
        if (proceed.code() == 401) {
            if (w.s(request.url().host(), "stockgro", false) && !w.s(request.url().getUrl(), "bigboss", false) && !w.s(request.url().getUrl(), "parrot", false) && !w.s(request.url().getUrl(), "postie", false)) {
                qv.a.f32312b.getClass();
                u.H(new Object[0]);
                this.logoutSubject.signalLogout();
                this.logoutTriggered = true;
            }
        } else if (proceed.code() == 407 && w.s(request.url().host(), "stockgro", false) && !w.s(request.url().getUrl(), "logout", false)) {
            qv.a.f32312b.getClass();
            u.H(new Object[0]);
            this.multipleSignInLogoutSubject.signalLogout();
        }
        return proceed;
    }
}
