package yk;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xk.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    public static final String f41726f = "u";

    /* renamed from: a, reason: collision with root package name */
    public final nl.c f41727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41728b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f41729c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f41730d;

    /* renamed from: e, reason: collision with root package name */
    public int f41731e;

    public u(nl.c attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f41727a = attributionIdentifiers;
        this.f41728b = anonymousAppDeviceGUID;
        this.f41729c = new ArrayList();
        this.f41730d = new ArrayList();
    }

    public final synchronized void a(e event) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f41729c.size() + this.f41730d.size() >= 1000) {
                this.f41731e++;
            } else {
                this.f41729c.add(event);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final synchronized void b(boolean z10) {
        if (sl.a.b(this)) {
            return;
        }
        if (z10) {
            try {
                this.f41729c.addAll(this.f41730d);
            } catch (Throwable th2) {
                sl.a.a(this, th2);
                return;
            }
        }
        this.f41730d.clear();
        this.f41731e = 0;
    }

    public final synchronized List c() {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f41729c;
            this.f41729c = new ArrayList();
            return arrayList;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final int d(z request, Context applicationContext, boolean z10, boolean z11) {
        if (sl.a.b(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (this) {
                try {
                    int i10 = this.f41731e;
                    dl.b bVar = dl.b.f14411a;
                    dl.b.b(this.f41729c);
                    this.f41730d.addAll(this.f41729c);
                    this.f41729c.clear();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f41730d.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        String str = eVar.f41689e;
                        if (str != null) {
                            String jSONObject = eVar.f41685a.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
                            if (!Intrinsics.a(ek.h.c(jSONObject), str)) {
                                n0.F(f41726f, Intrinsics.i(eVar, "Event with invalid checksum: "));
                            }
                        }
                        if (z10 || !eVar.f41686b) {
                            jSONArray.put(eVar.f41685a);
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    Unit unit = Unit.f23355a;
                    e(request, applicationContext, i10, jSONArray, z11);
                    return jSONArray.length();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return 0;
        }
    }

    public final void e(z zVar, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (sl.a.b(this)) {
                return;
            }
            try {
                HashMap hashMap = gl.e.f17464a;
                jSONObject = gl.e.a(gl.d.f17462b, this.f41727a, this.f41728b, z10, context);
                if (this.f41731e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            zVar.f40481c = jSONObject;
            Bundle bundle = zVar.f40482d;
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "events.toString()");
            bundle.putString("custom_events", jSONArray2);
            zVar.f40483e = jSONArray2;
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            zVar.f40482d = bundle;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
