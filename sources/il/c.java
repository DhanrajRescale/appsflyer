package il;

import android.os.Bundle;
import ek.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.n0;
import nl.y;
import org.json.JSONArray;
import org.json.JSONObject;
import vt.g0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20098a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final String f20099b = g.class.getSimpleName();

    public static final Bundle a(d eventType, String applicationId, List appEvents) {
        if (sl.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.f20103a);
            bundle.putString("app_id", applicationId);
            if (d.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b10 = f20098a.b(applicationId, appEvents);
                if (b10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b10.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
            return null;
        }
    }

    public final JSONArray b(String str, List list) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList S = g0.S(list);
            dl.b.b(S);
            boolean z10 = false;
            if (!sl.a.b(this)) {
                try {
                    y h10 = a0.h(str, false);
                    if (h10 != null) {
                        z10 = h10.f28966a;
                    }
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
            Iterator it = S.iterator();
            while (it.hasNext()) {
                yk.e eVar = (yk.e) it.next();
                String str2 = eVar.f41689e;
                JSONObject jSONObject = eVar.f41685a;
                if (str2 != null) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    if (!Intrinsics.a(h.c(jSONObject2), str2)) {
                        n0.F(f20099b, Intrinsics.i(eVar, "Event with invalid checksum: "));
                    }
                }
                boolean z11 = eVar.f41686b;
                if ((!z11) || (z11 && z10)) {
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return null;
        }
    }
}
