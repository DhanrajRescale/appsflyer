package jl;

import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.n0;
import nl.y;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21463b;

    /* renamed from: a, reason: collision with root package name */
    public static final b f21462a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f21464c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f21465d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            try {
                Iterator it = new ArrayList(f21464c).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null && Intrinsics.a(str, aVar.f21460a)) {
                        for (String str3 : aVar.f21461b.keySet()) {
                            if (Intrinsics.a(str2, str3)) {
                                return (String) aVar.f21461b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w("jl.b", "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [jl.a, java.lang.Object] */
    public final void b() {
        String str;
        if (sl.a.b(this)) {
            return;
        }
        try {
            a0 a0Var = a0.f28827a;
            y h10 = a0.h(FacebookSdk.getApplicationId(), false);
            if (h10 != null && (str = h10.f28977l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = f21464c;
                arrayList.clear();
                CopyOnWriteArraySet copyOnWriteArraySet = f21465d;
                copyOnWriteArraySet.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String eventName = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(eventName);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        Intrinsics.checkNotNullExpressionValue(eventName, "key");
                        HashMap restrictiveParams = new HashMap();
                        Intrinsics.checkNotNullParameter(eventName, "eventName");
                        Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
                        ?? obj = new Object();
                        obj.f21460a = eventName;
                        obj.f21461b = restrictiveParams;
                        if (optJSONObject != null) {
                            HashMap i10 = n0.i(optJSONObject);
                            Intrinsics.checkNotNullParameter(i10, "<set-?>");
                            obj.f21461b = i10;
                            arrayList.add(obj);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(eventName);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
