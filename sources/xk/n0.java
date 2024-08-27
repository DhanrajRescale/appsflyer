package xk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f40443a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f40444b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f40445c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f40446d = new m0(true, FacebookSdk.AUTO_INIT_ENABLED_PROPERTY);

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f40447e = new m0(true, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f40448f = new m0(true, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);

    /* renamed from: g, reason: collision with root package name */
    public static final m0 f40449g = new m0(false, "auto_event_setup_enabled");

    /* renamed from: h, reason: collision with root package name */
    public static final m0 f40450h = new m0(true, FacebookSdk.MONITOR_ENABLED_PROPERTY);

    /* renamed from: i, reason: collision with root package name */
    public static SharedPreferences f40451i;

    public static final boolean b() {
        if (sl.a.b(n0.class)) {
            return false;
        }
        try {
            f40443a.d();
            return f40448f.a();
        } catch (Throwable th2) {
            sl.a.a(n0.class, th2);
            return false;
        }
    }

    public static final Boolean i() {
        SharedPreferences sharedPreferences;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (sl.a.b(n0.class)) {
            return null;
        }
        try {
            f40443a.k();
            try {
                sharedPreferences = f40451i;
            } catch (JSONException e10) {
                nl.n0.E("xk.n0", e10);
            }
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(f40447e.f40439b, HttpUrl.FRAGMENT_ENCODE_SET);
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
                return null;
            }
            Intrinsics.k("userSettingPref");
            throw null;
        } catch (Throwable th2) {
            sl.a.a(n0.class, th2);
            return null;
        }
    }

    public final boolean a() {
        if (sl.a.b(this)) {
            return false;
        }
        try {
            HashMap c10 = nl.a0.c();
            if (c10 != null && !c10.isEmpty()) {
                Boolean bool = (Boolean) c10.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) c10.get("auto_log_app_events_default");
                if (bool == null) {
                    Boolean bool3 = null;
                    if (!sl.a.b(this)) {
                        try {
                            Boolean i10 = i();
                            if (i10 == null) {
                                Boolean e10 = e();
                                if (e10 != null) {
                                    bool3 = Boolean.valueOf(e10.booleanValue());
                                }
                            } else {
                                bool3 = Boolean.valueOf(i10.booleanValue());
                            }
                        } catch (Throwable th2) {
                            sl.a.a(this, th2);
                        }
                    }
                    if (bool3 == null) {
                        if (bool2 == null) {
                            return true;
                        }
                        return bool2.booleanValue();
                    }
                    return bool3.booleanValue();
                }
                return bool.booleanValue();
            }
            return f40447e.a();
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return false;
        }
    }

    public final void c() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            m0 m0Var = f40449g;
            j(m0Var);
            final long currentTimeMillis = System.currentTimeMillis();
            if (m0Var.f40440c != null && currentTimeMillis - m0Var.f40441d < 604800000) {
                return;
            }
            m0Var.f40440c = null;
            m0Var.f40441d = 0L;
            if (!f40445c.compareAndSet(false, true)) {
                return;
            }
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: xk.l0
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    long j10 = currentTimeMillis;
                    if (!sl.a.b(n0.class)) {
                        try {
                            if (n0.f40448f.a()) {
                                nl.a0 a0Var = nl.a0.f28827a;
                                nl.y h10 = nl.a0.h(FacebookSdk.getApplicationId(), false);
                                if (h10 != null && h10.f28972g) {
                                    Context applicationContext = FacebookSdk.getApplicationContext();
                                    String str2 = nl.c.f28837f;
                                    nl.c h11 = ll.e.h(applicationContext);
                                    if (h11 != null && h11.a() != null) {
                                        str = h11.a();
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", str);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str3 = z.f40475j;
                                        z w10 = ek.e.w(null, "app", null);
                                        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                                        w10.f40482d = bundle;
                                        JSONObject jSONObject = w10.c().f40343b;
                                        if (jSONObject != null) {
                                            m0 m0Var2 = n0.f40449g;
                                            m0Var2.f40440c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            m0Var2.f40441d = j10;
                                            n0.f40443a.l(m0Var2);
                                        }
                                    }
                                }
                            }
                            n0.f40445c.set(false);
                        } catch (Throwable th2) {
                            sl.a.a(n0.class, th2);
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void d() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            if (!FacebookSdk.isInitialized()) {
                return;
            }
            int i10 = 0;
            if (!f40444b.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            f40451i = sharedPreferences;
            m0[] m0VarArr = {f40447e, f40448f, f40446d};
            if (!sl.a.b(this)) {
                while (i10 < 3) {
                    try {
                        m0 m0Var = m0VarArr[i10];
                        i10++;
                        if (m0Var == f40449g) {
                            c();
                        } else if (m0Var.f40440c == null) {
                            j(m0Var);
                            if (m0Var.f40440c == null) {
                                f(m0Var);
                            }
                        } else {
                            l(m0Var);
                        }
                    } catch (Throwable th2) {
                        sl.a.a(this, th2);
                    }
                }
            }
            c();
            h();
            g();
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }

    public final Boolean e() {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            k();
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    m0 m0Var = f40447e;
                    if (bundle.containsKey(m0Var.f40439b)) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(m0Var.f40439b));
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                nl.n0.E("xk.n0", e10);
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void f(m0 m0Var) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(m0Var.f40439b)) {
                    m0Var.f40440c = Boolean.valueOf(applicationInfo.metaData.getBoolean(m0Var.f40439b, m0Var.f40438a));
                }
            } catch (PackageManager.NameNotFoundException e10) {
                nl.n0.E("xk.n0", e10);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:6:0x000b, B:9:0x0014, B:12:0x001b, B:16:0x0048, B:18:0x004e, B:20:0x0052, B:22:0x005d, B:24:0x0074, B:28:0x0090, B:34:0x00b9, B:37:0x00ee, B:39:0x00e8, B:48:0x00f4, B:49:0x00f7, B:51:0x00f9, B:52:0x00fc), top: B:5:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.n0.g():void");
    }

    public final void h() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey(FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY)) {
                    Log.w("xk.n0", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!b()) {
                    Log.w("xk.n0", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void j(m0 m0Var) {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (sl.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                SharedPreferences sharedPreferences = f40451i;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(m0Var.f40439b, HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        m0Var.f40440c = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        m0Var.f40441d = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                Intrinsics.k("userSettingPref");
                throw null;
            } catch (JSONException e10) {
                nl.n0.E("xk.n0", e10);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void k() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            if (f40444b.get()) {
            } else {
                throw new FacebookException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void l(m0 m0Var) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, m0Var.f40440c);
                jSONObject.put("last_timestamp", m0Var.f40441d);
                SharedPreferences sharedPreferences = f40451i;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(m0Var.f40439b, jSONObject.toString()).apply();
                    g();
                } else {
                    Intrinsics.k("userSettingPref");
                    throw null;
                }
            } catch (Exception e10) {
                nl.n0.E("xk.n0", e10);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
