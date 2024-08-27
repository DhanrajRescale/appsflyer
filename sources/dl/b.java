package dl;

import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.n0;
import nl.y;
import org.json.JSONArray;
import org.json.JSONObject;
import yk.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f14412b;

    /* renamed from: a, reason: collision with root package name */
    public static final b f14411a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f14413c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f14414d = new HashSet();

    public static final void b(ArrayList events) {
        if (sl.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (!f14412b) {
                return;
            }
            Iterator it = events.iterator();
            while (it.hasNext()) {
                if (f14414d.contains(((e) it.next()).f41688d)) {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [dl.a, java.lang.Object] */
    public final synchronized void a() {
        y h10;
        if (sl.a.b(this)) {
            return;
        }
        try {
            a0 a0Var = a0.f28827a;
            h10 = a0.h(FacebookSdk.getApplicationId(), false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return;
        }
        if (h10 == null) {
            return;
        }
        String str = h10.f28977l;
        if (str != null && str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            f14413c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        HashSet hashSet = f14414d;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashSet.add(key);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        ArrayList deprecateParams = new ArrayList();
                        Intrinsics.checkNotNullParameter(key, "eventName");
                        Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
                        ?? obj = new Object();
                        obj.f14409a = key;
                        obj.f14410b = deprecateParams;
                        if (optJSONArray != null) {
                            ArrayList g10 = n0.g(optJSONArray);
                            Intrinsics.checkNotNullParameter(g10, "<set-?>");
                            obj.f14410b = g10;
                        }
                        f14413c.add(obj);
                    }
                }
            }
        }
    }
}
