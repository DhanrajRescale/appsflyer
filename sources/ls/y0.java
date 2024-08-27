package ls;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: p, reason: collision with root package name */
    public static Integer f25348p = null;

    /* renamed from: q, reason: collision with root package name */
    public static Boolean f25349q = null;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f25350r = true;

    /* renamed from: s, reason: collision with root package name */
    public static final Object f25351s = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Future f25352a;

    /* renamed from: b, reason: collision with root package name */
    public final Future f25353b;

    /* renamed from: c, reason: collision with root package name */
    public final Future f25354c;

    /* renamed from: d, reason: collision with root package name */
    public final Future f25355d;

    /* renamed from: j, reason: collision with root package name */
    public String f25361j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25362k;

    /* renamed from: l, reason: collision with root package name */
    public String f25363l;

    /* renamed from: m, reason: collision with root package name */
    public String f25364m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25365n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f25366o;

    /* renamed from: g, reason: collision with root package name */
    public final Object f25358g = new Object();

    /* renamed from: f, reason: collision with root package name */
    public JSONObject f25357f = null;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f25359h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25360i = false;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f25356e = new x0(this);

    public y0(Future future, FutureTask futureTask, FutureTask futureTask2, FutureTask futureTask3) {
        this.f25353b = future;
        this.f25352a = futureTask;
        this.f25354c = futureTask2;
        this.f25355d = futureTask3;
    }

    public static void r(Context context, HashMap hashMap) {
        synchronized (f25351s) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("com.mixpanel.android.mpmetrics.ReferralInfo", 0).edit();
                edit.clear();
                for (Map.Entry entry : hashMap.entrySet()) {
                    edit.putString((String) entry.getKey(), (String) entry.getValue());
                }
                edit.apply();
                f25350r = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this.f25358g) {
            if (this.f25357f == null) {
                l();
            }
            JSONObject jSONObject2 = this.f25357f;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject.put(next, jSONObject2.get(next));
                } catch (JSONException e10) {
                    el.l.N("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", e10);
                }
            }
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f25352a.get()).edit();
            edit.clear();
            edit.apply();
            l();
            i();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10.getCause());
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11.getCause());
        }
    }

    public final synchronized String c() {
        try {
            if (!this.f25360i) {
                i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25361j;
    }

    public final synchronized String d() {
        try {
            if (!this.f25360i) {
                i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25363l;
    }

    public final HashMap e() {
        synchronized (f25351s) {
            try {
                if (!f25350r) {
                    if (this.f25359h == null) {
                    }
                }
                k();
                f25350r = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f25359h;
    }

    public final synchronized boolean f(String str) {
        boolean z10;
        z10 = false;
        try {
            z10 = ((SharedPreferences) this.f25355d.get()).getBoolean(str, false);
        } catch (InterruptedException e10) {
            el.l.N("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel from shared preferences.", e10);
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.PIdentity", "Couldn't read internal Mixpanel shared preferences.", e11.getCause());
        }
        return z10;
    }

    public final synchronized boolean g(String str, boolean z10) {
        try {
            if (f25349q == null) {
                try {
                    try {
                        if (((SharedPreferences) this.f25355d.get()).getBoolean("has_launched_" + str, false)) {
                            f25349q = Boolean.FALSE;
                        } else {
                            Boolean valueOf = Boolean.valueOf(!z10);
                            f25349q = valueOf;
                            if (!valueOf.booleanValue()) {
                                m(str);
                            }
                        }
                    } catch (ExecutionException unused) {
                        f25349q = Boolean.FALSE;
                    }
                } catch (InterruptedException unused2) {
                    f25349q = Boolean.FALSE;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25349q.booleanValue();
    }

    public final synchronized boolean h(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer valueOf = Integer.valueOf(str);
            try {
                if (f25348p == null) {
                    Integer valueOf2 = Integer.valueOf(((SharedPreferences) this.f25355d.get()).getInt("latest_version_code", -1));
                    f25348p = valueOf2;
                    if (valueOf2.intValue() == -1) {
                        f25348p = valueOf;
                        SharedPreferences.Editor edit = ((SharedPreferences) this.f25355d.get()).edit();
                        edit.putInt("latest_version_code", valueOf.intValue());
                        edit.apply();
                    }
                }
                if (f25348p.intValue() < valueOf.intValue()) {
                    SharedPreferences.Editor edit2 = ((SharedPreferences) this.f25355d.get()).edit();
                    edit2.putInt("latest_version_code", valueOf.intValue());
                    edit2.apply();
                    return true;
                }
            } catch (InterruptedException e10) {
                el.l.N("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e10);
            } catch (ExecutionException e11) {
                el.l.N("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11.getCause());
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r4 = this;
            java.lang.String r0 = "Cannot read distinct ids from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            r2 = 0
            java.util.concurrent.Future r3 = r4.f25352a     // Catch: java.lang.InterruptedException -> Le java.util.concurrent.ExecutionException -> L10
            java.lang.Object r3 = r3.get()     // Catch: java.lang.InterruptedException -> Le java.util.concurrent.ExecutionException -> L10
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch: java.lang.InterruptedException -> Le java.util.concurrent.ExecutionException -> L10
            goto L1e
        Le:
            r3 = move-exception
            goto L12
        L10:
            r3 = move-exception
            goto L16
        L12:
            el.l.N(r1, r0, r3)
            goto L1d
        L16:
            java.lang.Throwable r3 = r3.getCause()
            el.l.N(r1, r0, r3)
        L1d:
            r3 = r2
        L1e:
            if (r3 != 0) goto L21
            return
        L21:
            java.lang.String r0 = "events_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f25361j = r0
            java.lang.String r0 = "events_user_id_present"
            r1 = 0
            boolean r0 = r3.getBoolean(r0, r1)
            r4.f25362k = r0
            java.lang.String r0 = "people_distinct_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f25363l = r0
            java.lang.String r0 = "anonymous_id"
            java.lang.String r0 = r3.getString(r0, r2)
            r4.f25364m = r0
            java.lang.String r0 = "had_persisted_distinct_id"
            boolean r0 = r3.getBoolean(r0, r1)
            r4.f25365n = r0
            java.lang.String r0 = r4.f25361j
            if (r0 != 0) goto L5f
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.f25364m = r0
            r4.f25361j = r0
            r4.f25362k = r1
            r4.q()
        L5f:
            r0 = 1
            r4.f25360i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.y0.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Cannot read opt out flag from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            java.util.concurrent.Future r2 = r3.f25355d     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            java.lang.Object r2 = r2.get()     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            goto L1d
        Ld:
            r2 = move-exception
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            el.l.N(r1, r0, r2)
            goto L1c
        L15:
            java.lang.Throwable r2 = r2.getCause()
            el.l.N(r1, r0, r2)
        L1c:
            r2 = 0
        L1d:
            if (r2 != 0) goto L20
            return
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "opt_out_"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            boolean r4 = r2.getBoolean(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.f25366o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.y0.j(java.lang.String):void");
    }

    public final void k() {
        this.f25359h = new HashMap();
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f25353b.get();
            x0 x0Var = this.f25356e;
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(x0Var);
            sharedPreferences.registerOnSharedPreferenceChangeListener(x0Var);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                this.f25359h.put(entry.getKey(), entry.getValue().toString());
            }
        } catch (InterruptedException e10) {
            el.l.N("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e10);
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e11.getCause());
        }
    }

    public final void l() {
        JSONObject jSONObject;
        try {
            try {
                String string = ((SharedPreferences) this.f25352a.get()).getString("super_properties", "{}");
                el.l.T0("MixpanelAPI.PIdentity", "Loading Super Properties " + string);
                this.f25357f = new JSONObject(string);
            } catch (InterruptedException e10) {
                el.l.N("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e10);
                if (this.f25357f == null) {
                    jSONObject = new JSONObject();
                    this.f25357f = jSONObject;
                }
            } catch (ExecutionException e11) {
                el.l.N("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e11.getCause());
                if (this.f25357f == null) {
                    jSONObject = new JSONObject();
                    this.f25357f = jSONObject;
                }
            } catch (JSONException unused) {
                el.l.M("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
                p();
                if (this.f25357f == null) {
                    jSONObject = new JSONObject();
                    this.f25357f = jSONObject;
                }
            }
        } catch (Throwable th2) {
            if (this.f25357f == null) {
                this.f25357f = new JSONObject();
            }
            throw th2;
        }
    }

    public final synchronized void m(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f25355d.get()).edit();
            edit.putBoolean("has_launched_" + str, true);
            edit.apply();
        } catch (InterruptedException e10) {
            el.l.N("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10);
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11.getCause());
        }
    }

    public final synchronized void n(String str) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f25355d.get()).edit();
            edit.putBoolean(str, true);
            edit.apply();
        } catch (InterruptedException e10) {
            el.l.N("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e10);
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11.getCause());
        }
    }

    public final synchronized void o(String str) {
        try {
            try {
                SharedPreferences.Editor edit = ((SharedPreferences) this.f25352a.get()).edit();
                edit.putString("push_id", str);
                edit.apply();
            } catch (InterruptedException e10) {
                el.l.N("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e10);
            }
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e11.getCause());
        }
    }

    public final void p() {
        JSONObject jSONObject = this.f25357f;
        if (jSONObject == null) {
            el.l.M("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        el.l.T0("MixpanelAPI.PIdentity", "Storing Super Properties " + jSONObject2);
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f25352a.get()).edit();
            edit.putString("super_properties", jSONObject2);
            edit.apply();
        } catch (InterruptedException e10) {
            el.l.N("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e10);
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e11.getCause());
        }
    }

    public final void q() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f25352a.get()).edit();
            edit.putString("events_distinct_id", this.f25361j);
            edit.putBoolean("events_user_id_present", this.f25362k);
            edit.putString("people_distinct_id", this.f25363l);
            edit.putString("anonymous_id", this.f25364m);
            edit.putBoolean("had_persisted_distinct_id", this.f25365n);
            edit.apply();
        } catch (InterruptedException e10) {
            el.l.N("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e10);
        } catch (ExecutionException e11) {
            el.l.N("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e11.getCause());
        }
    }
}
