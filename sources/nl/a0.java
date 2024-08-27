package nl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f28827a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final List f28828b = vt.y.g("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled");

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f28829c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f28830d = new AtomicReference(z.f28980a);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f28831e = new ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f28832f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f28828b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = xk.z.f40475j;
        xk.z w10 = ek.e.w(null, "app", null);
        w10.f40487i = true;
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        w10.f40482d = bundle;
        JSONObject jSONObject = w10.c().f40345d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final y b(String str) {
        if (str != null) {
            return (y) f28829c.get(str);
        }
        return null;
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        String string = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(a3.a.m(new Object[]{FacebookSdk.getApplicationId()}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), null);
        if (!n0.A(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    n0.E("FacebookSDK", e10);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return f(jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return null;
    }

    public static final void d() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        boolean A = n0.A(applicationId);
        z zVar = z.f28983d;
        a0 a0Var = f28827a;
        AtomicReference atomicReference = f28830d;
        if (A) {
            atomicReference.set(zVar);
            a0Var.g();
            return;
        }
        if (f28829c.containsKey(applicationId)) {
            atomicReference.set(z.f28982c);
            a0Var.g();
            return;
        }
        z zVar2 = z.f28980a;
        z zVar3 = z.f28981b;
        while (true) {
            if (atomicReference.compareAndSet(zVar2, zVar3)) {
                break;
            }
            if (atomicReference.get() != zVar2) {
                while (!atomicReference.compareAndSet(zVar, zVar3)) {
                    if (atomicReference.get() != zVar) {
                        a0Var.g();
                        return;
                    }
                }
            }
        }
        FacebookSdk.getExecutor().execute(new il.a(2, applicationContext, a3.a.m(new Object[]{applicationId}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), applicationId));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022f A[LOOP:1: B:38:0x015d->B:47:0x022f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0239 A[EDGE_INSN: B:48:0x0239->B:81:0x0239 BREAK  A[LOOP:1: B:38:0x015d->B:47:0x022f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static nl.y e(java.lang.String r36, org.json.JSONObject r37) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.a0.e(java.lang.String, org.json.JSONObject):nl.y");
    }

    public static HashMap f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                n0.E("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                n0.E("FacebookSDK", e11);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static final y h(String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = f28829c;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (y) concurrentHashMap.get(applicationId);
            }
        }
        a0 a0Var = f28827a;
        y e10 = e(applicationId, a());
        if (Intrinsics.a(applicationId, FacebookSdk.getApplicationId())) {
            f28830d.set(z.f28982c);
            a0Var.g();
        }
        return e10;
    }

    public final synchronized void g() {
        z zVar = (z) f28830d.get();
        if (z.f28980a != zVar && z.f28981b != zVar) {
            y yVar = (y) f28829c.get(FacebookSdk.getApplicationId());
            Handler handler = new Handler(Looper.getMainLooper());
            if (z.f28983d == zVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f28831e;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        handler.post(new bl.d((yk.n) concurrentLinkedQueue.poll(), 5));
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f28831e;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        handler.post(new yk.h(9, (yk.n) concurrentLinkedQueue2.poll(), yVar));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
