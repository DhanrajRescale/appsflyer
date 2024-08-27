package xk;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: j, reason: collision with root package name */
    public static final String f40475j = z.class.getSimpleName();

    /* renamed from: k, reason: collision with root package name */
    public static final String f40476k;

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f40477l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile String f40478m;

    /* renamed from: a, reason: collision with root package name */
    public final a f40479a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40480b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f40481c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f40482d;

    /* renamed from: e, reason: collision with root package name */
    public Object f40483e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40484f;

    /* renamed from: g, reason: collision with root package name */
    public v f40485g;

    /* renamed from: h, reason: collision with root package name */
    public e0 f40486h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f40487i;

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0026, code lost:
    
        if (r4 > 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0028, code lost:
    
        r0 = r0 + 1;
        r2.append(r1[r3.nextInt(r1.length)]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r0 < r4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r0 = r2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "buffer.toString()");
        xk.z.f40476k = r0;
        xk.z.f40477l = java.util.regex.Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        return;
     */
    static {
        /*
            r0 = 0
            java.lang.Class<xk.z> r1 = xk.z.class
            java.lang.String r1 = r1.getSimpleName()
            xk.z.f40475j = r1
            java.lang.String r1 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            char[] r1 = r1.toCharArray()
            java.lang.String r2 = "(this as java.lang.String).toCharArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r4 = 11
            int r4 = r3.nextInt(r4)
            int r4 = r4 + 30
            if (r4 <= 0) goto L36
        L28:
            int r0 = r0 + 1
            int r5 = r1.length
            int r5 = r3.nextInt(r5)
            char r5 = r1[r5]
            r2.append(r5)
            if (r0 < r4) goto L28
        L36:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "buffer.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            xk.z.f40476k = r0
            java.lang.String r0 = "^/?v\\d+\\.\\d+/(.*)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            xk.z.f40477l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.z.<clinit>():void");
    }

    public z(a aVar, String str, Bundle bundle, e0 e0Var, v vVar) {
        this.f40479a = aVar;
        this.f40480b = str;
        this.f40484f = null;
        j(vVar);
        k(e0Var);
        if (bundle != null) {
            this.f40482d = new Bundle(bundle);
        } else {
            this.f40482d = new Bundle();
        }
        this.f40484f = FacebookSdk.getGraphApiVersion();
    }

    public static String f() {
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        if (applicationId.length() > 0 && clientToken.length() > 0) {
            return applicationId + '|' + clientToken;
        }
        nl.n0.F(f40475j, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    public final void a() {
        boolean s7;
        Bundle bundle = this.f40482d;
        String e10 = e();
        if (e10 == null) {
            s7 = false;
        } else {
            s7 = kotlin.text.w.s(e10, "|", false);
        }
        if ((e10 != null && kotlin.text.s.r(e10, "IG", false) && !s7 && i()) || (Intrinsics.a(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM) && !(!i()) && !s7)) {
            bundle.putString("access_token", f());
        } else {
            String e11 = e();
            if (e11 != null) {
                bundle.putString("access_token", e11);
            }
        }
        if (!bundle.containsKey("access_token") && nl.n0.A(FacebookSdk.getClientToken())) {
            Log.w(f40475j, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString(PaymentConstants.Category.SDK, LogSubCategory.LifeCycle.ANDROID);
        bundle.putString("format", "json");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(g0.f40377h)) {
            bundle.putString(LogLevel.DEBUG, "info");
        } else if (FacebookSdk.isLoggingBehaviorEnabled(g0.f40376g)) {
            bundle.putString(LogLevel.DEBUG, LogLevel.WARNING);
        }
    }

    public final String b(String str, boolean z10) {
        if (!z10 && this.f40486h == e0.f40354b) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f40482d.keySet()) {
            Object obj = this.f40482d.get(str2);
            if (obj == null) {
                obj = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (ek.e.v(obj)) {
                buildUpon.appendQueryParameter(str2, ek.e.e(obj).toString());
            } else if (this.f40486h != e0.f40353a) {
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    public final d0 c() {
        Intrinsics.checkNotNullParameter(this, "request");
        z[] requests = {this};
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = vt.v.y(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        ArrayList p10 = ek.e.p(new c0(requests2));
        if (p10.size() == 1) {
            return (d0) p10.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final a0 d() {
        z[] requests = {this};
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = vt.v.y(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        c0 requests3 = new c0(requests2);
        Intrinsics.checkNotNullParameter(requests3, "requests");
        nl.n0.J(requests3);
        a0 a0Var = new a0(requests3);
        a0Var.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
        return a0Var;
    }

    public final String e() {
        a aVar = this.f40479a;
        if (aVar != null) {
            if (!this.f40482d.containsKey("access_token")) {
                ll.f fVar = nl.e0.f28850c;
                String str = aVar.f40316e;
                fVar.u(str);
                return str;
            }
        } else if (!this.f40482d.containsKey("access_token")) {
            return f();
        }
        return this.f40482d.getString("access_token");
    }

    public final String g() {
        String m10;
        String str;
        if (this.f40486h == e0.f40354b && (str = this.f40480b) != null && kotlin.text.s.i(str, "/videos", false)) {
            m10 = a3.a.m(new Object[]{FacebookSdk.getGraphDomain()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        } else {
            String subdomain = FacebookSdk.getGraphDomain();
            Intrinsics.checkNotNullParameter(subdomain, "subdomain");
            m10 = a3.a.m(new Object[]{subdomain}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        String h10 = h(m10);
        a();
        return b(h10, false);
    }

    public final String h(String str) {
        boolean z10;
        if (!Intrinsics.a(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            z10 = true;
        } else {
            z10 = !i();
        }
        if (!z10) {
            str = a3.a.m(new Object[]{FacebookSdk.getFacebookDomain()}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        String str2 = this.f40480b;
        if (!f40477l.matcher(str2).matches()) {
            str2 = a3.a.m(new Object[]{this.f40484f, str2}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = str2;
        return a3.a.m(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    public final boolean i() {
        String str = this.f40480b;
        if (str == null) {
            return false;
        }
        String str2 = "^/?" + FacebookSdk.getApplicationId() + "/?.*";
        if (!this.f40487i && !Pattern.matches(str2, str) && !Pattern.matches("^/?app/?.*", str)) {
            return false;
        }
        return true;
    }

    public final void j(v vVar) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!FacebookSdk.isLoggingBehaviorEnabled(g0.f40377h) && !FacebookSdk.isLoggingBehaviorEnabled(g0.f40376g)) {
            this.f40485g = vVar;
        } else {
            this.f40485g = new d(vVar, 1);
        }
    }

    public final void k(e0 e0Var) {
        if (e0Var == null) {
            e0Var = e0.f40353a;
        }
        this.f40486h = e0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f40479a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f40480b);
        sb2.append(", graphObject: ");
        sb2.append(this.f40481c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f40486h);
        sb2.append(", parameters: ");
        sb2.append(this.f40482d);
        sb2.append(UrlTreeKt.componentParamSuffix);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }
}
