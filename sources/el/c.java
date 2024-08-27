package el;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.y;
import org.json.JSONException;
import org.json.JSONObject;
import yk.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f15640a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f15641b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f15642c;

    /* renamed from: d, reason: collision with root package name */
    public static a f15643d;

    /* renamed from: e, reason: collision with root package name */
    public static b f15644e;

    /* renamed from: f, reason: collision with root package name */
    public static Intent f15645f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f15646g;

    public static final void a(Context context, ArrayList arrayList, boolean z10) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList skuList = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String purchase = (String) it.next();
                try {
                    String sku = new JSONObject(purchase).getString("productId");
                    Intrinsics.checkNotNullExpressionValue(sku, "sku");
                    Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                    hashMap.put(sku, purchase);
                    skuList.add(sku);
                } catch (JSONException e10) {
                    Log.e("el.c", "Error parsing in-app purchase data.", e10);
                }
            }
            h hVar = h.f15676a;
            Object obj = f15646g;
            LinkedHashMap linkedHashMap = null;
            if (!sl.a.b(h.class)) {
                try {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(skuList, "skuList");
                    h hVar2 = h.f15676a;
                    LinkedHashMap j10 = hVar2.j(skuList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = skuList.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (!j10.containsKey(str)) {
                            arrayList2.add(str);
                        }
                    }
                    j10.putAll(hVar2.g(context, arrayList2, obj, z10));
                    linkedHashMap = j10;
                } catch (Throwable th2) {
                    sl.a.a(h.class, th2);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                String str4 = (String) hashMap.get(str2);
                if (str4 != null) {
                    gl.g.a(str4, str3, z10);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [el.a, java.lang.Object] */
    public static final void b() {
        boolean z10;
        boolean z11;
        int i10 = 0;
        if (f15641b == null) {
            if (l.c0("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f15641b = valueOf;
            if (!Intrinsics.a(valueOf, Boolean.FALSE)) {
                if (l.c0("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f15642c = Boolean.valueOf(z11);
                h hVar = h.f15676a;
                if (!sl.a.b(h.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = h.f15680e;
                        long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j10 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j10 > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th2) {
                        sl.a.a(h.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f15645f = intent;
                f15643d = new Object();
                f15644e = new b(i10);
            }
        }
        if (Intrinsics.a(f15641b, Boolean.FALSE)) {
            return;
        }
        r rVar = gl.g.f17468a;
        y b10 = a0.b(FacebookSdk.getApplicationId());
        if (b10 != null && FacebookSdk.getAutoLogAppEventsEnabled() && b10.f28971f && f15640a.compareAndSet(false, true)) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                b bVar = f15644e;
                if (bVar != null) {
                    application.registerActivityLifecycleCallbacks(bVar);
                    Intent intent2 = f15645f;
                    if (intent2 != null) {
                        a aVar = f15643d;
                        if (aVar != null) {
                            applicationContext.bindService(intent2, aVar, 1);
                            return;
                        } else {
                            Intrinsics.k("serviceConnection");
                            throw null;
                        }
                    }
                    Intrinsics.k("intent");
                    throw null;
                }
                Intrinsics.k("callbacks");
                throw null;
            }
        }
    }
}
