package nl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f28883a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static long f28884b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static long f28885c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static long f28886d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static String f28887e = "";

    /* renamed from: f, reason: collision with root package name */
    public static String f28888f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f28889g = "NoCarrier";

    /* renamed from: h, reason: collision with root package name */
    public static String f28890h = "";

    /* renamed from: i, reason: collision with root package name */
    public static Locale f28891i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28892j = 0;

    public static final boolean A(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean B(Uri uri) {
        if (uri != null && (kotlin.text.s.j("http", uri.getScheme(), true) || kotlin.text.s.j("https", uri.getScheme(), true) || kotlin.text.s.j("fbstaging", uri.getScheme(), true))) {
            return true;
        }
        return false;
    }

    public static final ArrayList C(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jsonArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static final HashMap D(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void E(String str, Exception exc) {
        if (FacebookSdk.isDebugEnabled() && str != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
        }
    }

    public static final void F(String str, String str2) {
        if (FacebookSdk.isDebugEnabled() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    public static final void G(String str, String str2, Exception exc) {
        if (FacebookSdk.isDebugEnabled() && !A(str)) {
            Log.d(str, str2, exc);
        }
    }

    public static final String H(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        boolean isEmpty = map.isEmpty();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!isEmpty) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final void I(String arg, String name) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
        } else {
            throw new IllegalArgumentException(nn.d.k("Argument '", name, "' cannot be empty").toString());
        }
    }

    public static final void J(Collection container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Iterator it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (!container.isEmpty()) {
        } else {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void K(Object obj, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
        } else {
            throw new NullPointerException(nn.d.k("Argument '", name, "' cannot be null"));
        }
    }

    public static final void L(String str, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (str != null && str.length() > 0) {
        } else {
            throw new IllegalArgumentException(nn.d.k("Argument '", name, "' cannot be null or empty").toString());
        }
    }

    public static final Bundle M(String str) {
        Bundle bundle = new Bundle();
        if (!A(str)) {
            if (str != null) {
                Object[] array = kotlin.text.w.P(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        String str2 = strArr[i10];
                        i10++;
                        Object[] array2 = kotlin.text.w.P(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), HttpUrl.FRAGMENT_ENCODE_SET);
                                }
                            } catch (UnsupportedEncodingException e10) {
                                E("FacebookSDK", e10);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(Bundle bundle, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) jSONArray).booleanValue());
            return;
        }
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Double) {
            bundle.putDouble("media", ((Number) jSONArray).doubleValue());
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Integer) {
            bundle.putInt("media", ((Number) jSONArray).intValue());
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Long) {
            bundle.putLong("media", ((Number) jSONArray).longValue());
            return;
        }
        if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else if (jSONArray instanceof String) {
            bundle.putString("media", (String) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final HashMap O(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i10 = 0;
            do {
                i10++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i10 < readInt);
        }
        return hashMap;
    }

    public static final String P(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    sb2.append(cArr, 0, read);
                } else {
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    e(bufferedInputStream);
                    e(inputStreamReader);
                    return sb3;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            e(bufferedInputStream);
            e(inputStreamReader);
            throw th2;
        }
    }

    public static final void Q(Runnable runnable) {
        try {
            FacebookSdk.getExecutor().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final void R() {
        if (FacebookSdk.isInitialized()) {
        } else {
            throw new FacebookException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void S(JSONObject params, c cVar, String str, boolean z10, Context context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        v vVar = v.f28944a;
        t tVar = t.ServiceUpdateCompliance;
        if (!v.b(tVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        params.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
        if (cVar != null) {
            if (v.b(tVar)) {
                if (Build.VERSION.SDK_INT >= 31 && z(context)) {
                    if (!cVar.f28843e) {
                        params.put("anon_id", str);
                    }
                } else {
                    params.put("anon_id", str);
                }
            }
            if (cVar.f28841c != null) {
                if (v.b(tVar)) {
                    if (Build.VERSION.SDK_INT >= 31 && z(context)) {
                        if (!cVar.f28843e) {
                            params.put("attribution", cVar.f28841c);
                        }
                    } else {
                        params.put("attribution", cVar.f28841c);
                    }
                } else {
                    params.put("attribution", cVar.f28841c);
                }
            }
            if (cVar.a() != null) {
                params.put("advertiser_id", cVar.a());
                params.put("advertiser_tracking_enabled", !cVar.f28843e);
            }
            if (!cVar.f28843e) {
                yk.w wVar = yk.w.f41735a;
                String str2 = null;
                if (!sl.a.b(yk.w.class)) {
                    try {
                        boolean z11 = yk.w.f41737c.get();
                        yk.w wVar2 = yk.w.f41735a;
                        if (!z11) {
                            wVar2.b();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(yk.w.f41738d);
                        hashMap.putAll(wVar2.a());
                        str2 = H(hashMap);
                    } catch (Throwable th2) {
                        sl.a.a(yk.w.class, th2);
                    }
                }
                if (str2.length() != 0) {
                    params.put("ud", str2);
                }
            }
            Object obj = cVar.f28842d;
            if (obj != null) {
                params.put("installer_package", obj);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void T(org.json.JSONObject r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.n0.T(org.json.JSONObject, android.content.Context):void");
    }

    public static final String U(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return u("SHA-256", bytes);
    }

    public static final void V(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return Intrinsics.a(obj, obj2);
    }

    public static final Uri b(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static void c(Context context, String str) {
        int i10;
        boolean z10;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = kotlin.text.w.P(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                String str2 = strArr[i11];
                i11++;
                Object[] array2 = kotlin.text.w.P(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
                        String str3 = strArr2[0];
                        int length2 = str3.length() - 1;
                        int i12 = 0;
                        boolean z11 = false;
                        while (i12 <= length2) {
                            if (!z11) {
                                i10 = i12;
                            } else {
                                i10 = length2;
                            }
                            if (Intrinsics.f(str3.charAt(i10), 32) <= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z11) {
                                if (!z10) {
                                    z11 = true;
                                } else {
                                    i12++;
                                }
                            } else if (!z10) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        cookieManager.setCookie(str, Intrinsics.i("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i12, length2 + 1).toString()));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final void d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            c(context, FacebookSdk.FACEBOOK_COM);
            c(context, ".facebook.com");
            c(context, "https://facebook.com");
            c(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String f(String str) {
        if (A(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public static final ArrayList g(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String string = jsonArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i11 < length) {
                        i10 = i11;
                    } else {
                        return arrayList;
                    }
                }
            } else {
                return arrayList;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap h(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = h((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public static final HashMap i(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final int j(InputStream inputStream, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                int i10 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i10 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i10;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void k(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final String l(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final String m(Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String applicationName = FacebookSdk.getApplicationName();
            if (applicationName != null) {
                return applicationName;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static final Date n(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + dateBase.getTime());
    }

    public static final JSONObject o() {
        if (sl.a.b(n0.class)) {
            return null;
        }
        try {
            String string = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.DATA_PROCESSING_OPTIONS_PREFERENCES, 0).getString(FacebookSdk.DATA_PROCESSION_OPTIONS, null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(n0.class, th2);
            return null;
        }
    }

    public static final void p(final m0 callback, final String accessToken) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ConcurrentHashMap concurrentHashMap = i0.f28864a;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject jSONObject = (JSONObject) i0.f28864a.get(accessToken);
        if (jSONObject != null) {
            callback.f(jSONObject);
            return;
        }
        xk.v vVar = new xk.v() { // from class: nl.k0
            @Override // xk.v
            public final void onCompleted(xk.d0 response) {
                m0 callback2 = m0.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                String key = accessToken;
                Intrinsics.checkNotNullParameter(key, "$accessToken");
                Intrinsics.checkNotNullParameter(response, "response");
                xk.q qVar = response.f40344c;
                if (qVar != null) {
                    callback2.k(qVar.f40466i);
                    return;
                }
                ConcurrentHashMap concurrentHashMap2 = i0.f28864a;
                JSONObject value = response.f40345d;
                if (value != null) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    i0.f28864a.put(key, value);
                    callback2.f(value);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        };
        Bundle bundle = new Bundle();
        Date date = xk.a.f40309l;
        xk.a q10 = ek.h.q();
        if (q10 == null || (str = q10.f40322k) == null) {
            str = "facebook";
        }
        if (Intrinsics.a(str, FacebookSdk.INSTAGRAM)) {
            str2 = "id,name,profile_picture";
        } else {
            str2 = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str2);
        bundle.putString("access_token", accessToken);
        String str3 = xk.z.f40475j;
        xk.z x10 = ek.e.x(null, null);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        x10.f40482d = bundle;
        x10.k(xk.e0.f40353a);
        x10.j(vVar);
        x10.d();
    }

    public static final Method q(Class clazz, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method r(String className, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return q(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object s(String str, String str2, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt != null && !(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(str2, opt);
                return jSONObject;
            }
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        return opt;
    }

    public static final boolean t(Context context, String redirectURI) {
        List<ResolveInfo> list;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.a(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static String u(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(digest, "digest");
            int length = digest.length;
            int i10 = 0;
            while (i10 < length) {
                byte b10 = digest[i10];
                i10++;
                sb2.append(Integer.toHexString((b10 >> 4) & 15));
                sb2.append(Integer.toHexString(b10 & 15));
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
            return sb3;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object v(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean w() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context applicationContext = FacebookSdk.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = applicationContext.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").c(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y() {
        if (sl.a.b(n0.class)) {
            return false;
        }
        try {
            JSONObject o10 = o();
            if (o10 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = o10.getJSONArray(FacebookSdk.DATA_PROCESSION_OPTIONS);
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (Intrinsics.a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            sl.a.a(n0.class, th2);
            return false;
        }
    }

    public static boolean z(Context context) {
        Method r10 = r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (r10 == null) {
            return false;
        }
        Object v10 = v(null, r10, context);
        if ((v10 instanceof Integer) && Intrinsics.a(v10, 0)) {
            return true;
        }
        return false;
    }
}
