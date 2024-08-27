package fv;

import com.google.firebase.messaging.t;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.w;
import kotlin.text.y;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import vt.g0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f16316a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f16317b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16318c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16319d;

    /* renamed from: e, reason: collision with root package name */
    public final d f16320e;

    /* renamed from: f, reason: collision with root package name */
    public final d f16321f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f16322g;

    /* renamed from: h, reason: collision with root package name */
    public final h f16323h;

    /* renamed from: i, reason: collision with root package name */
    public final k f16324i;

    /* renamed from: j, reason: collision with root package name */
    public final t f16325j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f16326k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16327l;

    /* renamed from: m, reason: collision with root package name */
    public int f16328m;

    /* renamed from: n, reason: collision with root package name */
    public i f16329n;

    /* renamed from: o, reason: collision with root package name */
    public String f16330o;

    /* renamed from: p, reason: collision with root package name */
    public final n f16331p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16332q;

    /* renamed from: r, reason: collision with root package name */
    public o f16333r;

    /* renamed from: s, reason: collision with root package name */
    public final Gson f16334s;

    /* renamed from: t, reason: collision with root package name */
    public final OkHttpClient f16335t;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, fv.h] */
    public m(String url) {
        String str;
        String str2;
        Gson create = new GsonBuilder().setLenient().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        Intrinsics.b(create, "GsonBuilder()\n        .s…SCORES)\n        .create()");
        OkHttpClient build = new OkHttpClient.Builder().build();
        Intrinsics.b(build, "OkHttpClient.Builder().build()");
        Intrinsics.e(url, "url");
        this.f16334s = create;
        this.f16335t = build;
        this.f16318c = 10000L;
        this.f16319d = 30000L;
        this.f16320e = d.f16277c;
        this.f16321f = d.f16278d;
        ?? obj = new Object();
        obj.f16304a = new ScheduledThreadPoolExecutor(8);
        this.f16323h = obj;
        this.f16324i = new k(this, 2);
        this.f16325j = new t(14);
        this.f16326k = new ArrayList();
        this.f16327l = new ArrayList();
        int i10 = 0;
        if (!w.s(url, "/websocket", false)) {
            if (y.Z(url) != '/') {
                str2 = url.concat("/");
            } else {
                str2 = url;
            }
            str = jr.h.r(str2, "websocket");
        } else {
            str = url;
        }
        this.f16316a = str;
        if (s.l(0, 0, 3, url, "ws:", true)) {
            String substring = url.substring(3);
            Intrinsics.b(substring, "(this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (s.l(0, 0, 4, url, "wss:", true)) {
            String substring2 = url.substring(4);
            Intrinsics.b(substring2, "(this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse != null) {
            URL url2 = parse.url();
            Intrinsics.b(url2, "httpUrl.url()");
            this.f16317b = url2;
            this.f16331p = new n(this.f16323h, new j(this, i10), this.f16320e);
            return;
        }
        throw new IllegalArgumentException("invalid url: ".concat(url));
    }

    public final e a(String topic, Map params) {
        Intrinsics.e(topic, "topic");
        Intrinsics.e(params, "params");
        e eVar = new e(topic, params, this);
        this.f16326k = g0.J(eVar, this.f16326k);
        return eVar;
    }

    public final void b() {
        if (c()) {
            return;
        }
        int i10 = 0;
        this.f16332q = false;
        o oVar = (o) this.f16324i.invoke(this.f16317b);
        this.f16333r = oVar;
        int i11 = 1;
        if (oVar != null) {
            oVar.f16343c = new j(this, i11);
        }
        if (oVar != null) {
            oVar.f16346f = new k(this, i10);
        }
        if (oVar != null) {
            oVar.f16344d = new be.b(this, 24);
        }
        if (oVar != null) {
            oVar.f16345e = new k(this, i11);
        }
        if (oVar != null) {
            oVar.f16342b = 1;
            oVar.f16341a = oVar.f16348h.newWebSocket(new Request.Builder().url(oVar.f16347g).build(), oVar);
        }
    }

    public final boolean c() {
        o oVar = this.f16333r;
        if (oVar != null && oVar.f16342b == 2) {
            return true;
        }
        return false;
    }

    public final void d(String body) {
        Intrinsics.e(body, "body");
        Function1 function1 = this.f16322g;
        if (function1 != null) {
        }
    }

    public final void e(String topic, String event, String str, String str2, Map payload) {
        Intrinsics.e(topic, "topic");
        Intrinsics.e(event, "event");
        Intrinsics.e(payload, "payload");
        l lVar = new l(this, topic, event, payload, str, str2);
        if (c()) {
            lVar.mo2invoke();
        } else {
            this.f16327l.add(lVar);
        }
    }

    public final void f(int i10, String str, Function0 function0) {
        o oVar = this.f16333r;
        if (oVar != null) {
            oVar.f16346f = null;
        }
        if (oVar != null) {
            WebSocket webSocket = oVar.f16341a;
            if (webSocket != null) {
                webSocket.close(i10, str);
            }
            oVar.f16341a = null;
        }
        this.f16333r = null;
        i iVar = this.f16329n;
        if (iVar != null) {
            iVar.f16305a.cancel(true);
        }
        this.f16329n = null;
        Iterator it = ((List) this.f16325j.f11783c).iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).mo2invoke();
        }
        if (function0 != null) {
        }
    }

    public final void g() {
        Iterator it = this.f16326k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i10 = eVar.f16280a;
            if (i10 != 2 && i10 != 5 && i10 != 1) {
                e.i(eVar, "phx_error", null, 14);
            }
        }
    }
}
