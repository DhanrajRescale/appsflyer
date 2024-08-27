package gl;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nl.e0;
import nl.n0;
import org.json.JSONObject;
import vt.p0;
import xk.g0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f17464a = p0.f(new Pair(d.f17461a, "MOBILE_APP_INSTALL"), new Pair(d.f17462b, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(d activityType, nl.c cVar, String str, boolean z10, Context context) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f17464a.get(activityType));
        ek.h hVar = yk.l.f41701b;
        ReentrantReadWriteLock reentrantReadWriteLock = yk.c.f41677a;
        if (!yk.c.f41679c) {
            Log.w("c", "initStore should have been called before calling setUserID");
            yk.c.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock2 = yk.c.f41677a;
        reentrantReadWriteLock2.readLock().lock();
        try {
            String str2 = yk.c.f41678b;
            reentrantReadWriteLock2.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            n0.S(jSONObject, cVar, str, z10, context);
            try {
                n0.T(jSONObject, context);
            } catch (Exception e10) {
                e0.f28850c.s(g0.f40374e, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
            }
            JSONObject o10 = n0.o();
            if (o10 != null) {
                Iterator<String> keys = o10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, o10.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th2) {
            yk.c.f41677a.readLock().unlock();
            throw th2;
        }
    }
}
