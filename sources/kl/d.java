package kl;

import android.app.Activity;
import com.appsflyer.internal.l;
import com.facebook.FacebookSdk;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23249a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f23250b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f23251c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f23252d = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (d.class) {
            if (sl.a.b(d.class)) {
                return;
            }
            try {
                FacebookSdk.getExecutor().execute(new l(14));
            } catch (Throwable th2) {
                sl.a.a(d.class, th2);
            }
        }
    }

    public static final void d(Activity activity) {
        if (sl.a.b(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f23250b.get() && !sl.a.b(a.class)) {
                    try {
                        if (a.f23242f) {
                            if (f23251c.isEmpty()) {
                                if (!f23252d.isEmpty()) {
                                }
                            }
                            e.f23253d.F(activity);
                            return;
                        }
                    } catch (Throwable th2) {
                        sl.a.a(a.class, th2);
                    }
                }
                ek.e eVar = e.f23253d;
                ek.e.G(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            sl.a.a(d.class, th3);
        }
    }

    public final void b() {
        String str;
        Activity activity;
        if (sl.a.b(this)) {
            return;
        }
        try {
            a0 a0Var = a0.f28827a;
            y h10 = a0.h(FacebookSdk.getApplicationId(), false);
            if (h10 == null || (str = h10.f28976k) == null) {
                return;
            }
            c(str);
            if (!(!f23251c.isEmpty()) && !(!f23252d.isEmpty())) {
                return;
            }
            File d10 = hl.e.d();
            if (d10 == null) {
                return;
            }
            a.d(d10);
            WeakReference weakReference = gl.b.f17460k;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                d(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void c(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (sl.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    LinkedHashSet linkedHashSet = f23251c;
                    String string = jSONArray2.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                LinkedHashSet linkedHashSet2 = f23252d;
                String string2 = jSONArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i13 < length) {
                    i10 = i13;
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
