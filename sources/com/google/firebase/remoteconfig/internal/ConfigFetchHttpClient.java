package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseException;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import s3.a;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f11852h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f11853a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11855c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11856d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11857e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11858f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11859g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j10, String str3, long j11) {
        String str4;
        this.f11853a = context;
        this.f11854b = str;
        this.f11855c = str2;
        Matcher matcher = f11852h.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.f11856d = str4;
        this.f11857e = str3;
        this.f11858f = j10;
        this.f11859g = j11;
    }

    public static JSONObject b(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    public static void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10) {
        long j10;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f11854b);
            Context context = this.f11853a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i10 >= 28) {
                        j10 = a.b(packageInfo);
                    } else {
                        j10 = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j10));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put(PaymentConstants.SDK_VERSION, "21.4.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l10 != null) {
                long longValue = l10.longValue();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(longValue)));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseException("Fetch failed: Firebase installation id is null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009e A[LOOP:0: B:8:0x0098->B:11:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[Catch: all -> 0x0168, JSONException -> 0x016a, IOException | JSONException -> 0x016c, TRY_LEAVE, TryCatch #2 {all -> 0x0168, blocks: (B:13:0x00b4, B:15:0x00d0, B:74:0x016e, B:75:0x0177, B:77:0x0178, B:78:0x017f), top: B:9:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e A[Catch: all -> 0x0168, JSONException -> 0x016a, IOException | JSONException -> 0x016c, TRY_ENTER, TryCatch #2 {all -> 0x0168, blocks: (B:13:0x00b4, B:15:0x00d0, B:74:0x016e, B:75:0x0177, B:77:0x0178, B:78:0x017f), top: B:9:0x009c }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jr.g fetch(java.net.HttpURLConnection r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.Long r14, java.util.Date r15) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):jr.g");
    }
}
