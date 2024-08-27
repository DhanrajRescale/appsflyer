package nl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f28946a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f28947b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f28948c;

    /* renamed from: d, reason: collision with root package name */
    public static Long f28949d;

    /* renamed from: e, reason: collision with root package name */
    public static ek.h0 f28950e;

    static {
        iu.a0.a(w.class).b();
        f28946a = new AtomicBoolean(false);
        f28947b = new ConcurrentLinkedQueue();
        f28948c = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", LogSubCategory.LifeCycle.ANDROID);
        bundle.putString("sdk_version", FacebookSdk.getSdkVersion());
        bundle.putString("fields", "gatekeepers");
        String str = xk.z.f40475j;
        xk.z w10 = ek.e.w(null, a3.a.m(new Object[]{"mobile_sdk_gk"}, 1, "app/%s", "java.lang.String.format(format, *args)"), null);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        w10.f40482d = bundle;
        JSONObject jSONObject = w10.c().f40345d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.w.b(java.lang.String, java.lang.String, boolean):boolean");
    }

    public static final synchronized void c(u uVar) {
        synchronized (w.class) {
            if (uVar != null) {
                try {
                    f28947b.add(uVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String applicationId = FacebookSdk.getApplicationId();
            Long l10 = f28949d;
            if (l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000 && f28948c.containsKey(applicationId)) {
                e();
                return;
            }
            Context applicationContext = FacebookSdk.getApplicationContext();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            if (applicationContext == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!n0.A(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    n0.E("FacebookSDK", e10);
                }
                if (jSONObject != null) {
                    d(applicationId, jSONObject);
                }
            }
            Executor executor = FacebookSdk.getExecutor();
            if (executor == null) {
                return;
            }
            if (!f28946a.compareAndSet(false, true)) {
                return;
            }
            executor.execute(new il.a(applicationContext, applicationId, format));
        }
    }

    public static final synchronized JSONObject d(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        synchronized (w.class) {
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                jSONObject2 = (JSONObject) f28948c.get(applicationId);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                int i10 = 0;
                if (optJSONArray == null) {
                    optJSONObject = null;
                } else {
                    optJSONObject = optJSONArray.optJSONObject(0);
                }
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        try {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i10);
                            jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        } catch (JSONException e10) {
                            n0.E("FacebookSDK", e10);
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                f28948c.put(applicationId, jSONObject2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f28947b;
            if (!concurrentLinkedQueue.isEmpty()) {
                u uVar = (u) concurrentLinkedQueue.poll();
                if (uVar != null) {
                    handler.post(new bl.d(uVar, 4));
                }
            } else {
                return;
            }
        }
    }
}
