package yk;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import nl.e0;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import vt.g0;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final HashSet f41684f = new HashSet();
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f41685a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41686b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41687c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41688d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41689e;

    public e(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f41686b = z10;
        this.f41687c = z11;
        this.f41688d = eventName;
        ek.h.d(eventName);
        JSONObject jSONObject = new JSONObject();
        jl.b bVar = jl.b.f21462a;
        String str = null;
        if (!sl.a.b(jl.b.class)) {
            try {
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                if (jl.b.f21463b) {
                    jl.b bVar2 = jl.b.f21462a;
                    if (!sl.a.b(bVar2)) {
                        try {
                            if (jl.b.f21465d.contains(eventName)) {
                                eventName = "_removed_";
                            }
                        } catch (Throwable th2) {
                            sl.a.a(bVar2, th2);
                        }
                    }
                }
                str = eventName;
            } catch (Throwable th3) {
                sl.a.a(jl.b.class, th3);
            }
        }
        jSONObject.put("_eventName", str);
        jSONObject.put("_eventName_md5", ek.h.c(str));
        jSONObject.put("_logTime", System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        jSONObject.put("_ui", contextName);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            HashMap parameters = new HashMap();
            for (String key : bundle.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                ek.h.d(key);
                Object obj = bundle.get(key);
                if (!(obj instanceof String) && !(obj instanceof Number)) {
                    throw new FacebookException(a3.a.m(new Object[]{obj, key}, 2, "Parameter value '%s' for key '%s' should be a string or a numeric type.", "java.lang.String.format(format, *args)"));
                }
                parameters.put(key, obj.toString());
            }
            if (!sl.a.b(fl.a.class)) {
                try {
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    if (fl.a.f16163b && !parameters.isEmpty()) {
                        try {
                            List<String> R = g0.R(parameters.keySet());
                            JSONObject jSONObject2 = new JSONObject();
                            for (String str2 : R) {
                                Object obj2 = parameters.get(str2);
                                if (obj2 != null) {
                                    String str3 = (String) obj2;
                                    fl.a aVar = fl.a.f16162a;
                                    if (!aVar.a(str2) && !aVar.a(str3)) {
                                    }
                                    parameters.remove(str2);
                                    if (!fl.a.f16164c) {
                                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    jSONObject2.put(str2, str3);
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                            if (jSONObject2.length() != 0) {
                                String jSONObject3 = jSONObject2.toString();
                                Intrinsics.checkNotNullExpressionValue(jSONObject3, "restrictiveParamJson.toString()");
                                parameters.put("_onDeviceParams", jSONObject3);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th4) {
                    sl.a.a(fl.a.class, th4);
                }
            }
            jl.b bVar3 = jl.b.f21462a;
            boolean b10 = sl.a.b(jl.b.class);
            String eventName2 = this.f41688d;
            if (!b10) {
                try {
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    Intrinsics.checkNotNullParameter(eventName2, "eventName");
                    if (jl.b.f21463b) {
                        HashMap hashMap = new HashMap();
                        Iterator it = new ArrayList(parameters.keySet()).iterator();
                        while (it.hasNext()) {
                            String str4 = (String) it.next();
                            String a10 = jl.b.f21462a.a(eventName2, str4);
                            if (a10 != null) {
                                hashMap.put(str4, a10);
                                parameters.remove(str4);
                            }
                        }
                        if (!hashMap.isEmpty()) {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                parameters.put("_restrictedParams", jSONObject4.toString());
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } catch (Throwable th5) {
                    sl.a.a(jl.b.class, th5);
                }
            }
            dl.b bVar4 = dl.b.f14411a;
            if (!sl.a.b(dl.b.class)) {
                try {
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    Intrinsics.checkNotNullParameter(eventName2, "eventName");
                    if (dl.b.f14412b) {
                        ArrayList arrayList = new ArrayList(parameters.keySet());
                        Iterator it2 = new ArrayList(dl.b.f14413c).iterator();
                        while (it2.hasNext()) {
                            dl.a aVar2 = (dl.a) it2.next();
                            if (Intrinsics.a(aVar2.f14409a, eventName2)) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    String str5 = (String) it3.next();
                                    if (aVar2.f14410b.contains(str5)) {
                                        parameters.remove(str5);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th6) {
                    sl.a.a(dl.b.class, th6);
                }
            }
            for (String str6 : parameters.keySet()) {
                jSONObject.put(str6, parameters.get(str6));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f41687c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f41686b) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            ll.f fVar = e0.f28850c;
            xk.g0 g0Var = xk.g0.f40374e;
            String jSONObject5 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject5, "eventObject.toString()");
            fVar.s(g0Var, "AppEvents", "Created app event '%s'", jSONObject5);
        }
        this.f41685a = jSONObject;
        String jSONObject6 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject6, "jsonObject.toString()");
        this.f41689e = ek.h.c(jSONObject6);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.f41685a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new d(jSONObject, this.f41689e, this.f41686b, this.f41687c);
    }

    public final String toString() {
        JSONObject jSONObject = this.f41685a;
        return a3.a.m(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f41686b), jSONObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }

    public e(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f41685a = jSONObject;
        this.f41686b = z10;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f41688d = optString;
        this.f41689e = str2;
        this.f41687c = z11;
    }
}
