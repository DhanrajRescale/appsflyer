package ls;

import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l0 implements b0, m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f25236a;

    public /* synthetic */ l0(n0 n0Var) {
        this.f25236a = n0Var;
    }

    @Override // ls.m0
    public final void a() {
    }

    public final void b(Object obj, String str) {
        n0 n0Var = this.f25236a;
        if (n0Var.i()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            n0.a(n0Var, h(jSONObject, "$append"));
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.API", "Exception appending a property", e10);
        }
    }

    public String c() {
        return this.f25236a.f25265g.d();
    }

    public final a0 d() {
        n0 n0Var = this.f25236a;
        n nVar = n0Var.f25268j;
        boolean z10 = n0Var.f25261c.f25154f;
        synchronized (nVar) {
            if (nVar.f25247d.isEmpty()) {
                el.l.T0("MixpanelAPI.DecideUpdts", "No unseen notifications exist, none will be returned.");
                return null;
            }
            a0 a0Var = (a0) nVar.f25247d.remove(0);
            if (z10) {
                nVar.f25247d.add(a0Var);
            } else {
                el.l.T0("MixpanelAPI.DecideUpdts", "Recording notification " + a0Var + " as seen.");
            }
            return a0Var;
        }
    }

    public final void e(String str, double d10) {
        n0 n0Var = this.f25236a;
        if (n0Var.i()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, Double.valueOf(d10));
        if (!n0Var.i()) {
            try {
                n0.a(n0Var, h(new JSONObject(hashMap), "$add"));
            } catch (JSONException e10) {
                el.l.N("MixpanelAPI.API", "Exception incrementing properties", e10);
            }
        }
    }

    public final void f(String str, String str2) {
        if (this.f25236a.i()) {
            return;
        }
        try {
            g(new JSONObject().put(str2, str));
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.API", "set", e10);
        }
    }

    public final void g(JSONObject jSONObject) {
        n0 n0Var = this.f25236a;
        if (n0Var.i()) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(n0Var.f25269k);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
            n0.a(n0Var, h(jSONObject2, "$set"));
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.API", "Exception setting people properties", e10);
        }
    }

    public final JSONObject h(Object obj, String str) {
        String str2;
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        String c10 = c();
        n0 n0Var = this.f25236a;
        y0 y0Var = n0Var.f25265g;
        synchronized (y0Var) {
            try {
                if (!y0Var.f25360i) {
                    y0Var.i();
                }
                str2 = y0Var.f25364m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jSONObject.put(str, obj);
        jSONObject.put("$token", n0Var.f25262d);
        jSONObject.put("$time", System.currentTimeMillis());
        y0 y0Var2 = n0Var.f25265g;
        synchronized (y0Var2) {
            try {
                if (!y0Var2.f25360i) {
                    y0Var2.i();
                }
                z10 = y0Var2.f25365n;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        jSONObject.put("$had_persisted_distinct_id", z10);
        if (str2 != null) {
            jSONObject.put("$device_id", str2);
        }
        if (c10 != null) {
            jSONObject.put("$distinct_id", c10);
            jSONObject.put("$user_id", c10);
        }
        jSONObject.put("$mp_metadata", n0Var.f25272n.a(false));
        return jSONObject;
    }

    public final void i(String str, a0 a0Var, JSONObject jSONObject) {
        n0 n0Var = this.f25236a;
        if (n0Var.i()) {
            return;
        }
        JSONObject a10 = a0Var.a();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a10.put(next, jSONObject.get(next));
                }
            } catch (JSONException e10) {
                el.l.N("MixpanelAPI.API", "Exception merging provided properties with notification properties", e10);
            }
        }
        n0Var.m(str, a10);
    }

    public final void j(a0 a0Var) {
        y0 y0Var = this.f25236a.f25265g;
        Integer valueOf = Integer.valueOf(a0Var.f25112c);
        synchronized (y0Var) {
            try {
                SharedPreferences sharedPreferences = (SharedPreferences) y0Var.f25352a.get();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("seen_campaign_ids", sharedPreferences.getString("seen_campaign_ids", HttpUrl.FRAGMENT_ENCODE_SET) + valueOf + ",");
                edit.apply();
            } catch (InterruptedException e10) {
                el.l.N("MixpanelAPI.PIdentity", "Can't write campaign id to shared preferences", e10);
            } catch (ExecutionException e11) {
                el.l.N("MixpanelAPI.PIdentity", "Can't write campaign d to shared preferences", e11.getCause());
            }
        }
        if (this.f25236a.i()) {
            return;
        }
        j0 j0Var = null;
        i("$campaign_delivery", a0Var, null);
        l0 l0Var = this.f25236a.f25263e;
        String c10 = c();
        l0Var.getClass();
        if (c10 != null) {
            j0Var = new j0(l0Var, c10);
        }
        if (j0Var != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            JSONObject a10 = a0Var.a();
            try {
                a10.put("$time", simpleDateFormat.format(new Date()));
            } catch (JSONException e12) {
                el.l.N("MixpanelAPI.API", "Exception trying to track an in-app notification seen", e12);
            }
            j0Var.b(Integer.valueOf(a0Var.f25112c), "$campaigns");
            j0Var.b(a10, "$notifications");
            return;
        }
        el.l.M("MixpanelAPI.API", "No identity found. Make sure to call getPeople().identify() before showing in-app notifications.");
    }
}
