package el;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import org.json.JSONObject;
import vt.p0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f15683b;

    /* renamed from: a, reason: collision with root package name */
    public static final i f15682a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArraySet f15684c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f15685d = new ConcurrentHashMap();

    public static final boolean d() {
        if (sl.a.b(i.class)) {
            return false;
        }
        try {
            f15682a.f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f15683b;
            if (sharedPreferences != null) {
                long j10 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
                if (j10 != 0 && currentTimeMillis - j10 < 86400) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = f15683b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                Intrinsics.k("sharedPreferences");
                throw null;
            }
            Intrinsics.k("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            sl.a.a(i.class, th2);
            return false;
        }
    }

    public static final void e(ConcurrentHashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (sl.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            i iVar = f15682a;
            iVar.f();
            LinkedHashMap c10 = iVar.c(iVar.a(purchaseDetailsMap), skuDetailsMap);
            if (!sl.a.b(iVar)) {
                try {
                    for (Map.Entry entry : c10.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (str != null && str2 != null) {
                            gl.g.a(str, str2, false);
                        }
                    }
                } catch (Throwable th2) {
                    sl.a.a(iVar, th2);
                }
            }
        } catch (Throwable th3) {
            sl.a.a(i.class, th3);
        }
    }

    public final HashMap a(ConcurrentHashMap purchaseDetailsMap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = p0.k(purchaseDetailsMap).entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                copyOnWriteArraySet = f15684c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f15685d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(currentTimeMillis);
                            copyOnWriteArraySet.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f15683b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
                return new HashMap(purchaseDetailsMap);
            }
            Intrinsics.k("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (sl.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f15683b;
            if (sharedPreferences != null) {
                long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                if (j10 == 0) {
                    SharedPreferences sharedPreferences2 = f15683b;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        Intrinsics.k("sharedPreferences");
                        throw null;
                    }
                }
                if (currentTimeMillis - j10 > 604800) {
                    ConcurrentHashMap concurrentHashMap = f15685d;
                    Iterator it = p0.k(concurrentHashMap).entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        copyOnWriteArraySet = f15684c;
                        if (!hasNext) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        long longValue = ((Number) entry.getValue()).longValue();
                        if (currentTimeMillis - longValue > 86400) {
                            copyOnWriteArraySet.remove(str + ';' + longValue);
                            concurrentHashMap.remove(str);
                        }
                    }
                    SharedPreferences sharedPreferences3 = f15683b;
                    if (sharedPreferences3 != null) {
                        sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        Intrinsics.k("sharedPreferences");
                        throw null;
                    }
                }
                return;
            }
            Intrinsics.k("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final LinkedHashMap c(HashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void f() {
        Collection collection;
        if (sl.a.b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f15683b = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = f15684c;
            if (sharedPreferences3 != null) {
                Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    collection = new HashSet();
                } else {
                    collection = stringSet;
                }
                copyOnWriteArraySet.addAll(collection);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    List P = w.P((String) it.next(), new String[]{";"}, 2, 2);
                    f15685d.put(P.get(0), Long.valueOf(Long.parseLong((String) P.get(1))));
                }
                b();
                return;
            }
            Intrinsics.k("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
