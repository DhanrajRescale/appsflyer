package kl;

import android.content.SharedPreferences;
import android.view.View;
import cl.g;
import com.facebook.FacebookSdk;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vt.p0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f23245c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f23243a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f23244b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f23246d = new AtomicBoolean(false);

    public static final void a(String pathID, String predictedEvent) {
        if (sl.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!f23246d.get()) {
                f23243a.c();
            }
            LinkedHashMap linkedHashMap = f23244b;
            linkedHashMap.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f23245c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", n0.H(p0.k(linkedHashMap))).apply();
            } else {
                Intrinsics.k("shardPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
        }
    }

    public static final String b(View view, String text) {
        if (sl.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = g.h(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return n0.U(jSONObject.toString());
        } catch (Throwable th2) {
            sl.a.a(b.class, th2);
            return null;
        }
    }

    public final void c() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (sl.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f23246d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f23245c = sharedPreferences;
            LinkedHashMap linkedHashMap = f23244b;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string != null) {
                    str = string;
                }
                linkedHashMap.putAll(n0.D(str));
                atomicBoolean.set(true);
                return;
            }
            Intrinsics.k("shardPreferences");
            throw null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
