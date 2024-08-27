package ls;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f25255o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static final r0 f25256p = new r0();

    /* renamed from: q, reason: collision with root package name */
    public static final h8.h f25257q = new h8.h(13);

    /* renamed from: r, reason: collision with root package name */
    public static FutureTask f25258r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25259a;

    /* renamed from: b, reason: collision with root package name */
    public final i f25260b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f25261c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25262d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f25263e;

    /* renamed from: f, reason: collision with root package name */
    public final os.n f25264f;

    /* renamed from: g, reason: collision with root package name */
    public final y0 f25265g;

    /* renamed from: h, reason: collision with root package name */
    public final os.u f25266h;

    /* renamed from: i, reason: collision with root package name */
    public final k f25267i;

    /* renamed from: j, reason: collision with root package name */
    public final n f25268j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f25269k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f25270l;

    /* renamed from: m, reason: collision with root package name */
    public final p0 f25271m;

    /* renamed from: n, reason: collision with root package name */
    public final k5.n f25272n;

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, k5.n] */
    public n0(Context context, Future future, String str) {
        os.n eVar;
        os.u uVar;
        HashSet hashSet;
        d0 a10 = d0.a(context);
        this.f25259a = context;
        this.f25262d = str;
        this.f25263e = new l0(this);
        new HashMap();
        this.f25261c = a10;
        HashMap hashMap = new HashMap();
        hashMap.put("$android_lib_version", "5.8.5");
        hashMap.put("$android_os", "Android");
        String str2 = Build.VERSION.RELEASE;
        hashMap.put("$android_os_version", str2 == null ? "UNKNOWN" : str2);
        String str3 = Build.MANUFACTURER;
        hashMap.put("$android_manufacturer", str3 == null ? "UNKNOWN" : str3);
        String str4 = Build.BRAND;
        hashMap.put("$android_brand", str4 == null ? "UNKNOWN" : str4);
        String str5 = Build.MODEL;
        hashMap.put("$android_model", str5 == null ? "UNKNOWN" : str5);
        int i10 = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            hashMap.put("$android_app_version", packageInfo.versionName);
            hashMap.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e10) {
            el.l.N("MixpanelAPI.API", "Exception getting app version name", e10);
        }
        this.f25269k = Collections.unmodifiableMap(hashMap);
        ?? obj = new Object();
        obj.b();
        obj.f22163e = new Random();
        this.f25272n = obj;
        d0 d0Var = this.f25261c;
        boolean z10 = d0Var.f25158j;
        h8.h hVar = f25257q;
        if (!z10 && !Arrays.asList(d0Var.f25160l).contains(str)) {
            eVar = new os.u(this.f25259a, this.f25262d, this, hVar);
        } else {
            el.l.l0("MixpanelAPI.API", "DisableViewCrawler is set to true. Web Configuration, A/B Testing, and Dynamic Tweaks are disabled.");
            eVar = new wn.e(14, this, hVar);
        }
        this.f25264f = eVar;
        if (eVar instanceof os.u) {
            uVar = (os.u) eVar;
        } else {
            uVar = null;
        }
        this.f25266h = uVar;
        this.f25260b = g();
        l0 l0Var = new l0(this);
        String concat = "com.mixpanel.android.mpmetrics.MixpanelAPI_".concat(str);
        r0 r0Var = f25256p;
        FutureTask e11 = r0Var.e(context, concat, l0Var);
        FutureTask e12 = r0Var.e(context, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_".concat(str), null);
        this.f25265g = new y0(future, e11, e12, r0Var.e(context, "com.mixpanel.android.mpmetrics.Mixpanel", null));
        HashMap hashMap2 = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : ((SharedPreferences) e12.get()).getAll().entrySet()) {
                hashMap2.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
            }
        } catch (InterruptedException e13) {
            e13.printStackTrace();
        } catch (ExecutionException e14) {
            e14.printStackTrace();
        }
        this.f25270l = hashMap2;
        k0 k0Var = new k0(this, i10);
        os.n nVar = this.f25264f;
        Context context2 = this.f25259a;
        y0 y0Var = this.f25265g;
        synchronized (y0Var) {
            hashSet = new HashSet();
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(((SharedPreferences) y0Var.f25352a.get()).getString("seen_campaign_ids", HttpUrl.FRAGMENT_ENCODE_SET), ",");
                while (stringTokenizer.hasMoreTokens()) {
                    hashSet.add(Integer.valueOf(stringTokenizer.nextToken()));
                }
            } catch (InterruptedException e15) {
                el.l.N("MixpanelAPI.PIdentity", "Couldn't read Mixpanel shared preferences.", e15);
            } catch (ExecutionException e16) {
                el.l.N("MixpanelAPI.PIdentity", "Couldn't read Mixpanel shared preferences.", e16.getCause());
            }
        }
        n nVar2 = new n(context2, str, k0Var, nVar, hashSet);
        this.f25268j = nVar2;
        this.f25267i = new k(this.f25259a, this);
        String d10 = this.f25265g.d();
        nVar2.c(d10 == null ? this.f25265g.c() : d10);
        boolean exists = g0.g(this.f25259a).f25204a.f25185a.exists();
        Context context3 = this.f25259a;
        if (context3.getApplicationContext() instanceof Application) {
            Application application = (Application) context3.getApplicationContext();
            p0 p0Var = new p0(this, this.f25261c);
            this.f25271m = p0Var;
            application.registerActivityLifecycleCallbacks(p0Var);
        } else {
            el.l.l0("MixpanelAPI.API", "Context is not an Application, Mixpanel will not automatically show in-app notifications or A/B test experiments. We won't be able to automatically flush on an app background.");
        }
        FutureTask futureTask = f25258r;
        if (futureTask != null) {
            try {
                if (((SharedPreferences) futureTask.get()).getAll().size() == 0) {
                    new c0(this.f25259a, new l0(this)).a();
                }
            } catch (ClassNotFoundException unused) {
                el.l.F("MixpanelAPI.ConfigurationChecker", "Missing com.android.installreferrer dependency. Google Play Store referrer information won't be available.");
            } catch (InterruptedException unused2) {
                el.l.V0("MixpanelAPI.ConfigurationChecker", "Could not read referrer shared preferences.");
            } catch (ExecutionException unused3) {
                el.l.V0("MixpanelAPI.ConfigurationChecker", "Could not read referrer shared preferences.");
            }
        }
        if (this.f25265g.g(this.f25262d, exists)) {
            n(null, "$ae_first_open", true);
            this.f25265g.m(this.f25262d);
        }
        if (!this.f25261c.f25168t) {
            i iVar = this.f25260b;
            n nVar3 = this.f25268j;
            iVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 12;
            obtain.obj = nVar3;
            iVar.f25224a.b(obtain);
        }
        if (!this.f25261c.f25157i) {
            m("$app_open", null);
        }
        if (!this.f25265g.f(this.f25262d)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mp_lib", "Android");
                jSONObject.put("lib", "Android");
                jSONObject.put("distinct_id", str);
                jSONObject.put("$lib_version", "5.8.5");
                jSONObject.put("$user_id", str);
                a aVar = new a("Integration", jSONObject, "85053bf24bba75239b16a601d9387e17", false, new JSONObject());
                i iVar2 = this.f25260b;
                iVar2.getClass();
                Message obtain2 = Message.obtain();
                obtain2.what = 1;
                obtain2.obj = aVar;
                iVar2.f25224a.b(obtain2);
                i iVar3 = this.f25260b;
                iVar3.getClass();
                Message obtain3 = Message.obtain();
                obtain3.what = 2;
                obtain3.obj = "85053bf24bba75239b16a601d9387e17";
                obtain3.arg1 = 0;
                iVar3.f25224a.b(obtain3);
                this.f25265g.n(this.f25262d);
            } catch (JSONException unused4) {
            }
        }
        if (this.f25265g.h((String) hashMap.get("$android_app_version_code"))) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("$ae_updated_version", hashMap.get("$android_app_version"));
                n(jSONObject2, "$ae_updated", true);
            } catch (JSONException unused5) {
            }
        }
        this.f25264f.c();
        if (!this.f25261c.f25159k) {
            p.a();
        }
    }

    public static void a(n0 n0Var, JSONObject jSONObject) {
        if (!n0Var.i()) {
            c cVar = new c(n0Var.f25262d, jSONObject);
            i iVar = n0Var.f25260b;
            iVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = cVar;
            iVar.f25224a.b(obtain);
        }
    }

    public static void c(i0 i0Var) {
        HashMap hashMap = f25255o;
        synchronized (hashMap) {
            try {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Map) it.next()).values().iterator();
                    while (it2.hasNext()) {
                        i0Var.h((n0) it2.next());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(Context context) {
        if (context instanceof Activity) {
            try {
                Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
                return;
            } catch (ClassNotFoundException e10) {
                el.l.F("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e10.getMessage());
                return;
            } catch (IllegalAccessException e11) {
                el.l.F("MixpanelAPI.AL", "Unable to detect inbound App Links: " + e11.getMessage());
                return;
            } catch (NoSuchMethodException e12) {
                el.l.F("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e12.getMessage());
                return;
            } catch (InvocationTargetException e13) {
                el.l.G("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", e13);
                return;
            }
        }
        el.l.F("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
    }

    public static n0 h(Context context, String str) {
        n0 n0Var = null;
        if (context != null) {
            HashMap hashMap = f25255o;
            synchronized (hashMap) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (f25258r == null) {
                        f25258r = f25256p.e(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
                    }
                    Map map = (Map) hashMap.get(str);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(str, map);
                    }
                    n0 n0Var2 = (n0) map.get(applicationContext);
                    if (n0Var2 == null) {
                        PackageManager packageManager = applicationContext.getPackageManager();
                        String packageName = applicationContext.getPackageName();
                        if (packageManager != null && packageName != null) {
                            if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                                el.l.V0("MixpanelAPI.ConfigurationChecker", "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
                                el.l.l0("MixpanelAPI.ConfigurationChecker", "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
                            } else {
                                n0Var2 = new n0(applicationContext, f25258r, str);
                                k(context, n0Var2);
                                map.put(applicationContext, n0Var2);
                                if (kp.j.B(applicationContext)) {
                                    try {
                                        s0.d();
                                    } catch (Exception e10) {
                                        el.l.N("MixpanelAPI.API", "Push notification could not be initialized", e10);
                                    }
                                }
                            }
                        }
                        el.l.V0("MixpanelAPI.ConfigurationChecker", "Can't check configuration when using a Context with null packageManager or packageName");
                    }
                    n0Var = n0Var2;
                    d(context);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return n0Var;
    }

    public static void k(Context context, n0 n0Var) {
        try {
            Object obj = a5.b.f173f;
            a5.b.class.getMethod("b", BroadcastReceiver.class, IntentFilter.class).invoke(a5.b.class.getMethod("a", Context.class).invoke(null, context), new h.a0(n0Var, 13), new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (ClassNotFoundException e10) {
            el.l.F("MixpanelAPI.AL", "To enable App Links tracking android.support.v4 must be installed: " + e10.getMessage());
        } catch (IllegalAccessException e11) {
            el.l.F("MixpanelAPI.AL", "App Links tracking will not be enabled due to this exception: " + e11.getMessage());
        } catch (NoSuchMethodException e12) {
            el.l.F("MixpanelAPI.AL", "To enable App Links tracking android.support.v4 must be installed: " + e12.getMessage());
        } catch (InvocationTargetException e13) {
            el.l.G("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", e13);
        }
    }

    public static void o(Context context, Integer num, Integer num2, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            if (jSONObject2.optString("token") == null) {
                el.l.M("MixpanelAPI.API", "\"token\" not found in mp payload, not tracking event: \"" + str3 + "\"");
                return;
            }
            jSONObject2.remove("token");
            if (jSONObject2.optString("distinct_id") == null) {
                el.l.M("MixpanelAPI.API", "\"distinct_id\" not found in mp payload, not tracking event: \"" + str3 + "\"");
                return;
            }
            jSONObject2.remove("distinct_id");
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                jSONObject2.put("message_id", num2);
                jSONObject2.put("campaign_id", num);
                jSONObject2.put("$android_notification_id", str);
            } catch (JSONException e10) {
                el.l.N("MixpanelAPI.API", "Error setting tracking JSON properties.", e10);
            }
            n0 n0Var = null;
            try {
                String optString = new JSONObject(str2).optString("token");
                if (optString != null) {
                    n0Var = h(context, optString);
                }
            } catch (JSONException unused) {
            }
            if (n0Var == null) {
                el.l.M("MixpanelAPI.API", "Got null instance, not tracking \"" + str3 + "\"");
                return;
            }
            n0Var.m(str3, jSONObject2);
            n0Var.f();
        } catch (JSONException e11) {
            el.l.N("MixpanelAPI.API", "Exception parsing mp payload from intent extras, not tracking event: \"" + str3 + "\"", e11);
        }
    }

    public static void p(Context context, Intent intent, String str, JSONObject jSONObject) {
        if (intent.hasExtra("mp") && intent.hasExtra("mp_campaign_id") && intent.hasExtra("mp_message_id")) {
            String stringExtra = intent.getStringExtra("mp_message_id");
            o(context, Integer.valueOf(intent.getStringExtra("mp_campaign_id")), Integer.valueOf(stringExtra), intent.getStringExtra("mp_canonical_notification_id"), intent.getStringExtra("mp"), str, jSONObject);
            return;
        }
        el.l.M("MixpanelAPI.API", "Intent is missing Mixpanel notification metadata, not tracking event: \"" + str + "\"");
    }

    public final void b(String str, String str2) {
        if (i()) {
            return;
        }
        if (str2 == null) {
            str2 = this.f25265g.c();
        }
        if (str.equals(str2)) {
            el.l.V0("MixpanelAPI.API", "Attempted to alias identical distinct_ids " + str + ". Alias message will not be sent.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alias", str);
            jSONObject.put("original", str2);
            m("$create_alias", jSONObject);
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.API", "Failed to alias", e10);
        }
        e();
    }

    public final void e() {
        if (i()) {
            return;
        }
        i iVar = this.f25260b;
        iVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = this.f25262d;
        obtain.arg1 = 1;
        iVar.f25224a.b(obtain);
    }

    public final void f() {
        if (i()) {
            return;
        }
        i iVar = this.f25260b;
        iVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = this.f25262d;
        obtain.arg1 = 0;
        iVar.f25224a.b(obtain);
    }

    public final i g() {
        i iVar;
        Context context = this.f25259a;
        HashMap hashMap = i.f25223d;
        synchronized (hashMap) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (!hashMap.containsKey(applicationContext)) {
                    iVar = new i(applicationContext);
                    hashMap.put(applicationContext, iVar);
                } else {
                    iVar = (i) hashMap.get(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public final boolean i() {
        boolean booleanValue;
        y0 y0Var = this.f25265g;
        String str = this.f25262d;
        synchronized (y0Var) {
            try {
                if (y0Var.f25366o == null) {
                    y0Var.j(str);
                }
                booleanValue = y0Var.f25366o.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public final void j(String str, boolean z10) {
        if (i()) {
            return;
        }
        if (str == null) {
            el.l.M("MixpanelAPI.API", "Can't identify with null distinct_id.");
            return;
        }
        synchronized (this.f25265g) {
            try {
                String c10 = this.f25265g.c();
                y0 y0Var = this.f25265g;
                synchronized (y0Var) {
                    try {
                        if (!y0Var.f25360i) {
                            y0Var.i();
                        }
                        if (y0Var.f25364m == null) {
                            y0Var.f25364m = c10;
                            y0Var.f25365n = true;
                            y0Var.q();
                        }
                    } finally {
                    }
                }
                y0 y0Var2 = this.f25265g;
                synchronized (y0Var2) {
                    try {
                        if (!y0Var2.f25360i) {
                            y0Var2.i();
                        }
                        y0Var2.f25361j = str;
                        y0Var2.q();
                    } finally {
                    }
                }
                if (z10) {
                    y0 y0Var3 = this.f25265g;
                    synchronized (y0Var3) {
                        try {
                            if (!y0Var3.f25360i) {
                                y0Var3.i();
                            }
                            y0Var3.f25362k = true;
                            y0Var3.q();
                        } finally {
                        }
                    }
                }
                String d10 = this.f25265g.d();
                if (d10 == null) {
                    d10 = this.f25265g.c();
                }
                this.f25268j.c(d10);
                if (!str.equals(c10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$anon_distinct_id", c10);
                        m("$identify", jSONObject);
                    } catch (JSONException unused) {
                        el.l.M("MixpanelAPI.API", "Could not track $identify event");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(JSONObject jSONObject) {
        if (i()) {
            return;
        }
        y0 y0Var = this.f25265g;
        synchronized (y0Var.f25358g) {
            if (y0Var.f25357f == null) {
                y0Var.l();
            }
            JSONObject jSONObject2 = y0Var.f25357f;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject2.put(next, jSONObject.get(next));
                } catch (JSONException e10) {
                    el.l.N("MixpanelAPI.PIdentity", "Exception registering super property.", e10);
                }
            }
            y0Var.p();
        }
    }

    public final void m(String str, JSONObject jSONObject) {
        if (i()) {
            return;
        }
        n(jSONObject, str, false);
    }

    public final void n(JSONObject jSONObject, String str, boolean z10) {
        Long l10;
        String str2;
        Activity activity;
        String str3;
        boolean z11;
        Activity activity2;
        Boolean bool;
        if (!i()) {
            if (!z10 || (bool = this.f25268j.f25252i) == null || bool.booleanValue()) {
                synchronized (this.f25270l) {
                    l10 = (Long) this.f25270l.get(str);
                    this.f25270l.remove(str);
                    y0 y0Var = this.f25265g;
                    y0Var.getClass();
                    try {
                        SharedPreferences.Editor edit = ((SharedPreferences) y0Var.f25354c.get()).edit();
                        edit.remove(str);
                        edit.apply();
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    } catch (ExecutionException e11) {
                        e11.printStackTrace();
                    }
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : this.f25265g.e().entrySet()) {
                        jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    this.f25265g.a(jSONObject2);
                    double currentTimeMillis = System.currentTimeMillis() / 1000.0d;
                    long j10 = (long) currentTimeMillis;
                    String c10 = this.f25265g.c();
                    y0 y0Var2 = this.f25265g;
                    synchronized (y0Var2) {
                        try {
                            if (!y0Var2.f25360i) {
                                y0Var2.i();
                            }
                            str2 = y0Var2.f25364m;
                        } finally {
                        }
                    }
                    y0 y0Var3 = this.f25265g;
                    synchronized (y0Var3) {
                        try {
                            if (!y0Var3.f25360i) {
                                y0Var3.i();
                            }
                            activity = null;
                            if (y0Var3.f25362k) {
                                str3 = y0Var3.f25361j;
                            } else {
                                str3 = null;
                            }
                        } finally {
                        }
                    }
                    jSONObject2.put("time", j10);
                    jSONObject2.put("distinct_id", c10);
                    y0 y0Var4 = this.f25265g;
                    synchronized (y0Var4) {
                        try {
                            if (!y0Var4.f25360i) {
                                y0Var4.i();
                            }
                            z11 = y0Var4.f25365n;
                        } finally {
                        }
                    }
                    jSONObject2.put("$had_persisted_distinct_id", z11);
                    if (str2 != null) {
                        jSONObject2.put("$device_id", str2);
                    }
                    if (str3 != null) {
                        jSONObject2.put("$user_id", str3);
                    }
                    if (l10 != null) {
                        jSONObject2.put("$duration", currentTimeMillis - (l10.longValue() / 1000.0d));
                    }
                    if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!jSONObject.isNull(next)) {
                                jSONObject2.put(next, jSONObject.get(next));
                            }
                        }
                    }
                    a aVar = new a(str, jSONObject2, this.f25262d, z10, this.f25272n.a(true));
                    i iVar = this.f25260b;
                    iVar.getClass();
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = aVar;
                    iVar.f25224a.b(obtain);
                    WeakReference weakReference = this.f25271m.f25287g;
                    if (weakReference != null) {
                        activity2 = (Activity) weakReference.get();
                    } else {
                        activity2 = null;
                    }
                    if (activity2 != null) {
                        l0 l0Var = this.f25263e;
                        a0 a10 = this.f25268j.a(aVar, this.f25261c.f25154f);
                        WeakReference weakReference2 = this.f25271m.f25287g;
                        if (weakReference2 != null) {
                            activity = (Activity) weakReference2.get();
                        }
                        if (a10 != null) {
                            l0Var.getClass();
                            activity.runOnUiThread(new k0(l0Var, a10, activity));
                        } else {
                            l0Var.getClass();
                        }
                    }
                    os.u uVar = this.f25266h;
                    if (uVar != null) {
                        os.t tVar = uVar.f30399h;
                        Message obtainMessage = tVar.obtainMessage();
                        obtainMessage.what = 7;
                        obtainMessage.obj = str;
                        tVar.sendMessage(obtainMessage);
                    }
                } catch (JSONException e12) {
                    el.l.N("MixpanelAPI.API", "Exception tracking event " + str, e12);
                }
            }
        }
    }

    public final void q(wn.e eVar) {
        if (i()) {
            return;
        }
        y0 y0Var = this.f25265g;
        synchronized (y0Var.f25358g) {
            if (y0Var.f25357f == null) {
                y0Var.l();
            }
            JSONObject jSONObject = y0Var.f25357f;
            JSONObject jSONObject2 = new JSONObject();
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                try {
                    jSONObject2.put("$experiments", (JSONObject) eVar.f39327b);
                } catch (JSONException e10) {
                    if (el.l.M0(6)) {
                        Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", e10);
                    }
                }
                y0Var.f25357f = jSONObject2;
                y0Var.p();
            } catch (JSONException e11) {
                el.l.N("MixpanelAPI.PIdentity", "Can't copy from one JSONObject to another", e11);
            }
        }
    }
}
