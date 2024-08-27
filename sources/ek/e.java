package ek;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import com.facebook.FacebookSdk;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import h.m0;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements x, k, hk.m, xj.n, sk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15582a;

    public /* synthetic */ e(int i10) {
        this.f15582a = i10;
    }

    public static void A(String str, Object obj, xk.w wVar, boolean z10) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z10) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String m10 = a3.a.m(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                    Object opt = jSONObject.opt(next);
                    Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                    A(m10, opt, wVar, z10);
                }
                return;
            }
            if (jSONObject.has("id")) {
                String optString = jSONObject.optString("id");
                Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                A(str, optString, wVar, z10);
                return;
            } else if (jSONObject.has("url")) {
                String optString2 = jSONObject.optString("url");
                Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                A(str, optString2, wVar, z10);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    A(str, jSONObject2, wVar, z10);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i10);
                    Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                    A(format, opt2, wVar, z10);
                    if (i11 < length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } else {
            if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(format2, "iso8601DateFormat.format(date)");
                    wVar.a(str, format2);
                    return;
                }
                n0.F(xk.z.f40475j, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            wVar.a(str, obj.toString());
        }
    }

    public static void B(xk.c0 requests, ArrayList responses) {
        Boolean valueOf;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(responses, "responses");
        int size = requests.f40337c.size();
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                xk.z zVar = (xk.z) requests.f40337c.get(i10);
                if (zVar.f40485g != null) {
                    arrayList.add(new Pair(zVar.f40485g, responses.get(i10)));
                }
                if (i11 >= size) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        if (arrayList.size() > 0) {
            m0 m0Var = new m0(27, arrayList, requests);
            Handler handler = requests.f40335a;
            if (handler == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(handler.post(m0Var));
            }
            if (valueOf == null) {
                m0Var.run();
            }
        }
    }

    public static void C(HashMap hashMap, xk.y yVar) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = xk.z.f40475j;
            if (u(((xk.u) entry.getValue()).f40468b)) {
                yVar.g((String) entry.getKey(), ((xk.u) entry.getValue()).f40468b, ((xk.u) entry.getValue()).f40467a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032d  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(xk.c0 r20, java.net.HttpURLConnection r21) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.e.D(xk.c0, java.net.HttpURLConnection):void");
    }

    public static void E(xk.i authenticationToken) {
        androidx.work.u uVar = xk.m.f40433d;
        xk.m mVar = xk.m.f40434e;
        if (mVar == null) {
            synchronized (uVar) {
                mVar = xk.m.f40434e;
                if (mVar == null) {
                    a5.b a10 = a5.b.a(FacebookSdk.getApplicationContext());
                    Intrinsics.checkNotNullExpressionValue(a10, "getInstance(applicationContext)");
                    xk.m mVar2 = new xk.m(a10, new xk.j());
                    xk.m.f40434e = mVar2;
                    mVar = mVar2;
                }
            }
        }
        xk.i iVar = mVar.f40437c;
        mVar.f40437c = authenticationToken;
        xk.j jVar = mVar.f40436b;
        if (authenticationToken != null) {
            jVar.getClass();
            Intrinsics.checkNotNullParameter(authenticationToken, "authenticationToken");
            try {
                jVar.f40403a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.a().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            jVar.f40403a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            n0.d(FacebookSdk.getApplicationContext());
        }
        if (!n0.a(iVar, authenticationToken)) {
            Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", iVar);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
            mVar.f40435a.c(intent);
        }
    }

    public static void G(Activity activity) {
        View b10;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int hashCode = activity.hashCode();
        e eVar = kl.e.f23253d;
        HashMap hashMap = null;
        if (!sl.a.b(kl.e.class)) {
            try {
                hashMap = kl.e.f23254e;
            } catch (Throwable th2) {
                sl.a.a(kl.e.class, th2);
            }
        }
        kl.e eVar2 = (kl.e) hashMap.remove(Integer.valueOf(hashCode));
        if (eVar2 != null && !sl.a.b(kl.e.class)) {
            try {
                if (!sl.a.b(eVar2)) {
                    try {
                        if (eVar2.f23257c.getAndSet(false) && (b10 = gl.c.b((Activity) eVar2.f23255a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(eVar2);
                            }
                        }
                    } catch (Throwable th3) {
                        sl.a.a(eVar2, th3);
                    }
                }
            } catch (Throwable th4) {
                sl.a.a(kl.e.class, th4);
            }
        }
    }

    public static HttpURLConnection H(xk.c0 requests) {
        URL url;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Iterator<E> it = requests.iterator();
        while (it.hasNext()) {
            xk.z zVar = (xk.z) it.next();
            if (xk.e0.f40353a == zVar.f40486h && n0.A(zVar.f40482d.getString("fields"))) {
                ll.f fVar = nl.e0.f28850c;
                xk.g0 g0Var = xk.g0.f40375f;
                StringBuilder sb2 = new StringBuilder("GET requests for /");
                String str = zVar.f40480b;
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                fVar.q(g0Var, 5, "Request", nn.d.o(sb2, str, " should contain an explicit \"fields\" parameter."));
            }
        }
        try {
            if (requests.f40337c.size() == 1) {
                url = new URL(((xk.z) requests.f40337c.get(0)).g());
            } else {
                String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.getGraphDomain()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                url = new URL(format);
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = o(url);
                D(requests, httpURLConnection);
                return httpURLConnection;
            } catch (IOException e10) {
                n0.k(httpURLConnection);
                throw new RuntimeException("could not construct request body", e10);
            } catch (JSONException e11) {
                n0.k(httpURLConnection);
                throw new RuntimeException("could not construct request body", e11);
            }
        } catch (MalformedURLException e12) {
            throw new RuntimeException("could not construct URL for request", e12);
        }
    }

    public static final int b(int[] iArr) {
        int i10 = hl.a.f18583d;
        if (iArr.length != 0) {
            int i11 = iArr[0];
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            int i12 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    i11 *= iArr[i12];
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            return i11;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void d(yk.e appEvent, yk.b accessTokenAppId) {
        boolean z10;
        e eVar = yk.m.f41703c;
        u uVar = yk.i.f41694a;
        if (!sl.a.b(yk.i.class)) {
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
                Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                yk.i.f41695b.execute(new m0(29, accessTokenAppId, appEvent));
            } catch (Throwable th2) {
                sl.a.a(yk.i.class, th2);
            }
        }
        nl.v vVar = nl.v.f28944a;
        boolean b10 = nl.v.b(nl.t.OnDevicePostInstallEventProcessing);
        String str = appEvent.f41688d;
        boolean z11 = appEvent.f41686b;
        if (b10 && il.b.a()) {
            String applicationId = accessTokenAppId.f41675a;
            if (!sl.a.b(il.b.class)) {
                try {
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    Intrinsics.checkNotNullParameter(appEvent, "event");
                    il.b bVar = il.b.f20096a;
                    if (!sl.a.b(bVar)) {
                        if (z11) {
                            try {
                                if (il.b.f20097b.contains(str)) {
                                    z10 = true;
                                    if (!(!z11) || z10) {
                                        FacebookSdk.getExecutor().execute(new yk.h(8, applicationId, appEvent));
                                    }
                                }
                            } catch (Throwable th3) {
                                sl.a.a(bVar, th3);
                            }
                        }
                        z10 = false;
                        if (!(!z11)) {
                        }
                        FacebookSdk.getExecutor().execute(new yk.h(8, applicationId, appEvent));
                    }
                } catch (Throwable th4) {
                    sl.a.a(il.b.class, th4);
                }
            }
        }
        if (!z11) {
            e eVar2 = yk.m.f41703c;
            if (!sl.a.b(yk.m.class)) {
                try {
                    if (yk.m.f41708h) {
                        return;
                    }
                } catch (Throwable th5) {
                    sl.a.a(yk.m.class, th5);
                }
            }
            if (Intrinsics.a(str, "fb_mobile_activate_app")) {
                if (!sl.a.b(yk.m.class)) {
                    try {
                        yk.m.f41708h = true;
                        return;
                    } catch (Throwable th6) {
                        sl.a.a(yk.m.class, th6);
                        return;
                    }
                }
                return;
            }
            nl.e0.f28850c.r(xk.g0.f40374e, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        }
    }

    public static final String e(Object obj) {
        String str = xk.z.f40475j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        return obj.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r4.equals("r5") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r5 = new kotlin.text.Regex("[^a-z]+").replace(r5, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r4.equals("r4") == false) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(java.util.HashMap r3, java.lang.String r4, java.lang.String r5) {
        /*
            ek.e r0 = zk.d.f42546e
            int r0 = r4.hashCode()
            r1 = 0
            switch(r0) {
                case 3585: goto L5c;
                case 3586: goto L45;
                case 3587: goto L3c;
                case 3588: goto Lc;
                default: goto La;
            }
        La:
            goto L82
        Lc:
            java.lang.String r0 = "r6"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L16
            goto L82
        L16:
            java.lang.String r0 = "-"
            boolean r2 = kotlin.text.w.s(r5, r0, r1)
            if (r2 == 0) goto L82
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r0)
            java.util.List r5 = r2.d(r5)
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r0)
            if (r5 == 0) goto L34
            java.lang.String[] r5 = (java.lang.String[]) r5
            r5 = r5[r1]
            goto L82
        L34:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            r3.<init>(r4)
            throw r3
        L3c:
            java.lang.String r0 = "r5"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4e
            goto L82
        L45:
            java.lang.String r0 = "r4"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4e
            goto L82
        L4e:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[^a-z]+"
            r0.<init>(r1)
            java.lang.String r1 = ""
            java.lang.String r5 = r0.replace(r5, r1)
            goto L82
        L5c:
            java.lang.String r0 = "r3"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L65
            goto L82
        L65:
            java.lang.String r0 = "m"
            boolean r2 = kotlin.text.s.r(r5, r0, r1)
            if (r2 != 0) goto L81
            java.lang.String r2 = "b"
            boolean r2 = kotlin.text.s.r(r5, r2, r1)
            if (r2 != 0) goto L81
            java.lang.String r2 = "ge"
            boolean r5 = kotlin.text.s.r(r5, r2, r1)
            if (r5 == 0) goto L7e
            goto L81
        L7e:
            java.lang.String r5 = "f"
            goto L82
        L81:
            r5 = r0
        L82:
            r3.put(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.e.k(java.util.HashMap, java.lang.String, java.lang.String):void");
    }

    public static xk.z m(String str, xk.a aVar, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter("app_indexing", "requestType");
        String str4 = xk.z.f40475j;
        int i10 = 1;
        String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        xk.z y10 = y(aVar, format, null, null);
        Bundle bundle = y10.f40482d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            str3 = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", LogSubCategory.LifeCycle.ANDROID);
        bundle.putString("request_type", "app_indexing");
        if (Intrinsics.a("app_indexing", "app_indexing")) {
            bundle.putString("device_session_id", bl.e.a());
        }
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        y10.f40482d = bundle;
        y10.j(new al.c(i10));
        return y10;
    }

    public static HttpURLConnection o(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        if (uRLConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            if (xk.z.f40478m == null) {
                xk.z.f40478m = a3.a.m(new Object[]{"FBAndroidSDK", "16.3.0"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
                if (!n0.A(null)) {
                    String format = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{xk.z.f40478m, null}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    xk.z.f40478m = format;
                }
            }
            httpURLConnection.setRequestProperty("User-Agent", xk.z.f40478m);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: all -> 0x014b, TryCatch #6 {all -> 0x014b, blocks: (B:12:0x0017, B:21:0x0051, B:22:0x0099, B:24:0x00a8, B:27:0x00b7, B:29:0x00c6, B:31:0x00d5, B:33:0x00e3, B:35:0x00f1, B:36:0x00f5, B:37:0x0109, B:38:0x0130, B:51:0x0131, B:52:0x0134, B:43:0x0082, B:7:0x0137), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109 A[Catch: all -> 0x014b, TryCatch #6 {all -> 0x014b, blocks: (B:12:0x0017, B:21:0x0051, B:22:0x0099, B:24:0x00a8, B:27:0x00b7, B:29:0x00c6, B:31:0x00d5, B:33:0x00e3, B:35:0x00f1, B:36:0x00f5, B:37:0x0109, B:38:0x0130, B:51:0x0131, B:52:0x0134, B:43:0x0082, B:7:0x0137), top: B:5:0x0015 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.facebook.FacebookException, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.facebook.FacebookException, java.lang.RuntimeException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList p(xk.c0 r11) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.e.p(xk.c0):java.util.ArrayList");
    }

    public static String s() {
        Object callback = new Object();
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(FacebookSdk.getApplicationContext()).build();
            try {
                build.startConnection(new hi.a(build, callback, 1));
            } catch (Exception unused) {
            }
        }
        return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getString("install_referrer", null);
    }

    public static void t() {
        synchronized (yk.m.c()) {
            if (yk.m.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!sl.a.b(yk.m.class)) {
                try {
                    yk.m.f41705e = scheduledThreadPoolExecutor;
                } catch (Throwable th2) {
                    sl.a.a(yk.m.class, th2);
                }
            }
            Unit unit = Unit.f23355a;
            com.appsflyer.internal.l lVar = new com.appsflyer.internal.l(4);
            ScheduledThreadPoolExecutor b10 = yk.m.b();
            if (b10 != null) {
                b10.scheduleAtFixedRate(lVar, 0L, 86400L, TimeUnit.SECONDS);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public static boolean u(Object obj) {
        if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof xk.x)) {
            return false;
        }
        return true;
    }

    public static boolean v(Object obj) {
        if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
            return false;
        }
        return true;
    }

    public static xk.z w(xk.a aVar, String str, xk.v vVar) {
        return new xk.z(aVar, str, null, null, vVar);
    }

    public static xk.z x(xk.a aVar, da.d dVar) {
        return new xk.z(aVar, "me", null, null, new xk.d(dVar, 2));
    }

    public static xk.z y(xk.a aVar, String str, JSONObject jSONObject, xk.v vVar) {
        xk.z zVar = new xk.z(aVar, str, null, xk.e0.f40354b, vVar);
        zVar.f40481c = jSONObject;
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void z(org.json.JSONObject r7, java.lang.String r8, xk.w r9) {
        /*
            java.util.regex.Pattern r0 = xk.z.f40477l
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.String r0 = r0.group(r2)
            java.lang.String r1 = "matcher.group(1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L18
        L17:
            r0 = r8
        L18:
            java.lang.String r1 = "me/"
            r3 = 0
            boolean r1 = kotlin.text.s.r(r0, r1, r3)
            if (r1 != 0) goto L2c
            java.lang.String r1 = "/me/"
            boolean r0 = kotlin.text.s.r(r0, r1, r3)
            if (r0 == 0) goto L2a
            goto L2c
        L2a:
            r8 = r3
            goto L42
        L2c:
            java.lang.String r0 = ":"
            r1 = 6
            int r0 = kotlin.text.w.A(r8, r0, r3, r3, r1)
            java.lang.String r4 = "?"
            int r8 = kotlin.text.w.A(r8, r4, r3, r3, r1)
            r1 = 3
            if (r0 <= r1) goto L2a
            r1 = -1
            if (r8 == r1) goto L41
            if (r0 >= r8) goto L2a
        L41:
            r8 = r2
        L42:
            java.util.Iterator r0 = r7.keys()
        L46:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r7.opt(r1)
            if (r8 == 0) goto L62
            java.lang.String r5 = "image"
            boolean r5 = kotlin.text.s.j(r1, r5, r2)
            if (r5 == 0) goto L62
            r5 = r2
            goto L63
        L62:
            r5 = r3
        L63:
            java.lang.String r6 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            A(r1, r4, r9, r5)
            goto L46
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.e.z(org.json.JSONObject, java.lang.String, xk.w):void");
    }

    public final void F(Activity activity) {
        View b10;
        View b11;
        HashMap hashMap = null;
        switch (this.f15582a) {
            case 23:
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode = activity.hashCode();
                e eVar = zk.d.f42546e;
                if (!sl.a.b(zk.d.class)) {
                    try {
                        hashMap = zk.d.f42547f;
                    } catch (Throwable th2) {
                        sl.a.a(zk.d.class, th2);
                    }
                }
                Integer valueOf = Integer.valueOf(hashCode);
                Object obj = hashMap.get(valueOf);
                if (obj == null) {
                    obj = new zk.d(activity);
                    hashMap.put(valueOf, obj);
                }
                zk.d dVar = (zk.d) obj;
                if (!sl.a.b(zk.d.class)) {
                    try {
                        if (!sl.a.b(dVar)) {
                            try {
                                if (!dVar.f42551d.getAndSet(true) && (b10 = gl.c.b((Activity) dVar.f42550c.get())) != null) {
                                    ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                                    if (viewTreeObserver.isAlive()) {
                                        viewTreeObserver.addOnGlobalFocusChangeListener(dVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                sl.a.a(dVar, th3);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        sl.a.a(zk.d.class, th4);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode2 = activity.hashCode();
                e eVar2 = kl.e.f23253d;
                if (!sl.a.b(kl.e.class)) {
                    try {
                        hashMap = kl.e.f23254e;
                    } catch (Throwable th5) {
                        sl.a.a(kl.e.class, th5);
                    }
                }
                Integer valueOf2 = Integer.valueOf(hashCode2);
                Object obj2 = hashMap.get(valueOf2);
                if (obj2 == null) {
                    obj2 = new kl.e(activity);
                    hashMap.put(valueOf2, obj2);
                }
                kl.e eVar3 = (kl.e) obj2;
                if (!sl.a.b(kl.e.class)) {
                    try {
                        if (!sl.a.b(eVar3)) {
                            try {
                                if (!eVar3.f23257c.getAndSet(true) && (b11 = gl.c.b((Activity) eVar3.f23255a.get())) != null) {
                                    ViewTreeObserver viewTreeObserver2 = b11.getViewTreeObserver();
                                    if (viewTreeObserver2.isAlive()) {
                                        viewTreeObserver2.addOnGlobalLayoutListener(eVar3);
                                        eVar3.a();
                                    }
                                }
                            } catch (Throwable th6) {
                                sl.a.a(eVar3, th6);
                            }
                        }
                        return;
                    } catch (Throwable th7) {
                        sl.a.a(kl.e.class, th7);
                        return;
                    }
                }
                return;
        }
    }

    @Override // ek.k
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // xj.n
    public final int c(xj.k kVar) {
        return 1;
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        int i10 = 0;
        switch (this.f15582a) {
            case 0:
                return new f(new e.l(this, 29), i10);
            case 1:
            default:
                return new k0(c0Var.a(l.class, InputStream.class));
            case 2:
                return new e0(c0Var.a(Uri.class, AssetFileDescriptor.class), i10);
        }
    }

    @Override // ek.k
    public final Object g(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // xj.c
    public final boolean h(Object obj, File file, xj.k kVar) {
        try {
            rk.a.b(((wj.e) ((jk.c) ((ak.e0) obj).get()).f21422a.f21421a.f21439a).f39126d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    @Override // hk.m
    public final void i() {
    }

    @Override // sk.a
    public final Object j() {
        return new ArrayList();
    }

    @Override // hk.m
    public final void l(Bitmap bitmap, bk.d dVar) {
    }

    @Override // ek.k
    public final void n(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public final synchronized nl.p q() {
        nl.a0 a0Var = nl.a0.f28827a;
        nl.y b10 = nl.a0.b(FacebookSdk.getApplicationId());
        if (b10 == null) {
            return nl.p.f28895d.i();
        }
        return b10.f28970e;
    }

    public final yk.k r() {
        yk.k kVar;
        synchronized (yk.m.c()) {
            kVar = null;
            if (!sl.a.b(yk.m.class)) {
                try {
                    kVar = yk.k.f41698a;
                } catch (Throwable th2) {
                    sl.a.a(yk.m.class, th2);
                }
            }
        }
        return kVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        this(10);
        this.f15582a = i10;
        switch (i10) {
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }
}
