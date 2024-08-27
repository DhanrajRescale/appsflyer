package fv;

import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* loaded from: classes2.dex */
public final class o extends WebSocketListener {

    /* renamed from: a, reason: collision with root package name */
    public WebSocket f16341a;

    /* renamed from: b, reason: collision with root package name */
    public int f16342b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f16343c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f16344d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f16345e;

    /* renamed from: f, reason: collision with root package name */
    public Function1 f16346f;

    /* renamed from: g, reason: collision with root package name */
    public final URL f16347g;

    /* renamed from: h, reason: collision with root package name */
    public final OkHttpClient f16348h;

    public o(URL url, OkHttpClient okHttpClient) {
        Intrinsics.e(url, "url");
        Intrinsics.e(okHttpClient, "okHttpClient");
        this.f16347g = url;
        this.f16348h = okHttpClient;
        this.f16342b = 4;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket webSocket, int i10, String reason) {
        Intrinsics.e(webSocket, "webSocket");
        Intrinsics.e(reason, "reason");
        this.f16342b = 4;
        Function1 function1 = this.f16346f;
        if (function1 != null) {
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(WebSocket webSocket, int i10, String reason) {
        Intrinsics.e(webSocket, "webSocket");
        Intrinsics.e(reason, "reason");
        this.f16342b = 3;
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket webSocket, Throwable t10, Response response) {
        Intrinsics.e(webSocket, "webSocket");
        Intrinsics.e(t10, "t");
        this.f16342b = 4;
        Function2 function2 = this.f16344d;
        if (function2 != null) {
        }
        Function1 function1 = this.f16346f;
        if (function1 != null) {
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, String text) {
        Intrinsics.e(webSocket, "webSocket");
        Intrinsics.e(text, "text");
        Function1 function1 = this.f16345e;
        if (function1 != null) {
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket webSocket, Response response) {
        Intrinsics.e(webSocket, "webSocket");
        Intrinsics.e(response, "response");
        this.f16342b = 2;
        Function0 function0 = this.f16343c;
        if (function0 != null) {
        }
    }
}
