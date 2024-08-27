package yk;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.e0;
import nl.n0;
import nl.y;
import org.json.JSONArray;
import org.json.JSONException;
import xk.d0;
import xk.g0;
import xk.z;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: c, reason: collision with root package name */
    public static ScheduledFuture f41696c;

    /* renamed from: a, reason: collision with root package name */
    public static volatile ek.u f41694a = new ek.u(4);

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f41695b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d, reason: collision with root package name */
    public static final com.appsflyer.internal.l f41697d = new com.appsflyer.internal.l(2);

    public static final z a(b accessTokenAppId, u appEvents, boolean z10, eb.f flushState) {
        if (sl.a.b(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String str = accessTokenAppId.f41675a;
            boolean z11 = false;
            y h10 = a0.h(str, false);
            String str2 = z.f40475j;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            z y10 = ek.e.y(null, format, null, null);
            y10.f40487i = true;
            Bundle bundle = y10.f40482d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", accessTokenAppId.f41676b);
            synchronized (m.c()) {
                sl.a.b(m.class);
            }
            ek.e eVar = m.f41703c;
            String s7 = ek.e.s();
            if (s7 != null) {
                bundle.putString("install_referrer", s7);
            }
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            y10.f40482d = bundle;
            if (h10 != null) {
                z11 = h10.f28966a;
            }
            int d10 = appEvents.d(y10, FacebookSdk.getApplicationContext(), z11, z10);
            if (d10 == 0) {
                return null;
            }
            flushState.f15308a += d10;
            y10.j(new xk.c(accessTokenAppId, y10, appEvents, flushState, 1));
            return y10;
        } catch (Throwable th2) {
            sl.a.a(i.class, th2);
            return null;
        }
    }

    public static final ArrayList b(ek.u appEventCollection, eb.f flushResults) {
        if (sl.a.b(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean limitEventAndDataUsage = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
            ArrayList arrayList = new ArrayList();
            for (b bVar : appEventCollection.C()) {
                u m10 = appEventCollection.m(bVar);
                if (m10 != null) {
                    z request = a(bVar, m10, limitEventAndDataUsage, flushResults);
                    if (request != null) {
                        arrayList.add(request);
                        if (al.d.f640a) {
                            HashSet hashSet = al.k.f657a;
                            Intrinsics.checkNotNullParameter(request, "request");
                            n0.Q(new androidx.activity.b(request, 29));
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            sl.a.a(i.class, th2);
            return null;
        }
    }

    public static final void c(p reason) {
        if (sl.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f41695b.execute(new androidx.activity.b(reason, 28));
        } catch (Throwable th2) {
            sl.a.a(i.class, th2);
        }
    }

    public static final void d(p reason) {
        if (sl.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f41694a.e(g.Q());
            try {
                eb.f f10 = f(reason, f41694a);
                if (f10 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f10.f15308a);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (q) f10.f15309b);
                    a5.b.a(FacebookSdk.getApplicationContext()).c(intent);
                }
            } catch (Exception e10) {
                Log.w("yk.i", "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            sl.a.a(i.class, th2);
        }
    }

    public static final void e(eb.f flushState, z request, d0 response, b accessTokenAppId, u appEvents) {
        q qVar;
        boolean z10;
        boolean z11;
        String str;
        if (sl.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            xk.q qVar2 = response.f40344c;
            String str2 = "Success";
            q qVar3 = q.f41719a;
            q qVar4 = q.f41721c;
            if (qVar2 != null) {
                if (qVar2.f40459b == -1) {
                    str2 = "Failed: No Connectivity";
                    qVar = qVar4;
                } else {
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), qVar2.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                    qVar = q.f41720b;
                }
            } else {
                qVar = qVar3;
            }
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            g0 g0Var = g0.f40374e;
            if (FacebookSdk.isLoggingBehaviorEnabled(g0Var)) {
                try {
                    str = new JSONArray((String) request.f40483e).toString(2);
                    Intrinsics.checkNotNullExpressionValue(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                ll.f fVar = e0.f28850c;
                Intrinsics.checkNotNullExpressionValue("yk.i", "TAG");
                z10 = true;
                fVar.s(g0Var, "yk.i", "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.f40481c), str2, str);
            } else {
                z10 = true;
            }
            if (qVar2 != null) {
                z11 = z10;
            } else {
                z11 = false;
            }
            appEvents.b(z11);
            if (qVar == qVar4) {
                FacebookSdk.getExecutor().execute(new h(0, accessTokenAppId, appEvents));
            }
            if (qVar != qVar3 && ((q) flushState.f15309b) != qVar4) {
                Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                flushState.f15309b = qVar;
            }
        } catch (Throwable th2) {
            sl.a.a(i.class, th2);
        }
    }

    public static final eb.f f(p reason, ek.u appEventCollection) {
        if (sl.a.b(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            eb.f fVar = new eb.f(6);
            ArrayList b10 = b(appEventCollection, fVar);
            if (!(!b10.isEmpty())) {
                return null;
            }
            ll.f fVar2 = e0.f28850c;
            g0 g0Var = g0.f40374e;
            Intrinsics.checkNotNullExpressionValue("yk.i", "TAG");
            fVar2.s(g0Var, "yk.i", "Flushing %d events due to %s.", Integer.valueOf(fVar.f15308a), reason.toString());
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                ((z) it.next()).c();
            }
            return fVar;
        } catch (Throwable th2) {
            sl.a.a(i.class, th2);
            return null;
        }
    }
}
