package okhttp3.internal.http;

import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import vt.g0;
import vt.i0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", HttpUrl.FRAGMENT_ENCODE_SET, "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", HttpUrl.FRAGMENT_ENCODE_SET, "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", HttpUrl.FRAGMENT_ENCODE_SET, "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;

    @NotNull
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String header$default;
        HttpUrl resolve;
        boolean z10;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (resolve = userResponse.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!Intrinsics.a(resolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int code = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (!httpMethod.redirectsWithBody(method) && code != 308 && code != 307) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (httpMethod.redirectsToGet(method) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                if (z10) {
                    requestBody = userResponse.request().body();
                }
                newBuilder.method(method, requestBody);
            }
            if (!z10) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(userResponse.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) throws IOException {
        Route route;
        RealConnection connection;
        if (exchange != null && (connection = exchange.getConnection()) != null) {
            route = connection.getRoute();
        } else {
            route = null;
        }
        int code = userResponse.code();
        String method = userResponse.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code != 421) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure()) {
                                    return null;
                                }
                                RequestBody body = userResponse.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                Response priorResponse = userResponse.priorResponse();
                                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(userResponse, 0) > 0) {
                                    return null;
                                }
                                return userResponse.request();
                            }
                        } else {
                            Intrinsics.c(route);
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, userResponse);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response priorResponse2 = userResponse.priorResponse();
                        if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(userResponse, Api.BaseClientBuilder.API_PRIORITY_OTHER) != 0) {
                            return null;
                        }
                        return userResponse.request();
                    }
                } else {
                    RequestBody body2 = userResponse.request().body();
                    if ((body2 != null && body2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                        return null;
                    }
                    exchange.getConnection().noCoalescedConnections$okhttp();
                    return userResponse.request();
                }
            } else {
                return this.client.authenticator().authenticate(route, userResponse);
            }
        }
        return buildRedirectRequest(userResponse, method);
    }

    private final boolean isRecoverable(IOException e10, boolean requestSendStarted) {
        if (e10 instanceof ProtocolException) {
            return false;
        }
        if (e10 instanceof InterruptedIOException) {
            if (!(e10 instanceof SocketTimeoutException) || requestSendStarted) {
                return false;
            }
            return true;
        }
        if (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private final boolean recover(IOException e10, RealCall call, Request userRequest, boolean requestSendStarted) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((requestSendStarted && requestIsOneShot(e10, userRequest)) || !isRecoverable(e10, requestSendStarted) || !call.retryAfterFailure()) {
            return false;
        }
        return true;
    }

    private final boolean requestIsOneShot(IOException e10, Request userRequest) {
        RequestBody body = userRequest.body();
        if ((body != null && body.isOneShot()) || (e10 instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String header$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header$default == null) {
            return defaultDelay;
        }
        if (new Regex("\\d+").c(header$default)) {
            Integer valueOf = Integer.valueOf(header$default);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Exchange interceptorScopedExchange;
        Request followUpRequest;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.getRequest();
        RealCall call = realInterceptorChain.getCall();
        List list = i0.f38321a;
        boolean z10 = true;
        int i10 = 0;
        Response response = null;
        while (true) {
            call.enterNetworkInterceptorExchange(request, z10);
            try {
                if (!call.getCanceled()) {
                    try {
                        try {
                            Response proceed = realInterceptorChain.proceed(request);
                            if (response != null) {
                                proceed = proceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                            }
                            response = proceed;
                            interceptorScopedExchange = call.getInterceptorScopedExchange();
                            followUpRequest = followUpRequest(response, interceptorScopedExchange);
                        } catch (IOException e10) {
                            if (recover(e10, call, request, !(e10 instanceof ConnectionShutdownException))) {
                                list = g0.J(e10, list);
                                call.exitNetworkInterceptorExchange$okhttp(true);
                                z10 = false;
                            } else {
                                throw Util.withSuppressed(e10, list);
                            }
                        }
                    } catch (RouteException e11) {
                        if (recover(e11.getLastConnectException(), call, request, false)) {
                            list = g0.J(e11.getFirstConnectException(), list);
                            call.exitNetworkInterceptorExchange$okhttp(true);
                            z10 = false;
                        } else {
                            throw Util.withSuppressed(e11.getFirstConnectException(), list);
                        }
                    }
                    if (followUpRequest == null) {
                        if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                            call.timeoutEarlyExit();
                        }
                        call.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    RequestBody body = followUpRequest.body();
                    if (body != null && body.isOneShot()) {
                        call.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    ResponseBody body2 = response.body();
                    if (body2 != null) {
                        Util.closeQuietly(body2);
                    }
                    i10++;
                    if (i10 <= 20) {
                        call.exitNetworkInterceptorExchange$okhttp(true);
                        request = followUpRequest;
                        z10 = true;
                    } else {
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (Throwable th2) {
                call.exitNetworkInterceptorExchange$okhttp(true);
                throw th2;
            }
        }
    }
}
