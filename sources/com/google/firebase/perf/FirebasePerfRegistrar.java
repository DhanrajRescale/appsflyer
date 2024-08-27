package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.h0;
import b5.i0;
import b5.s0;
import bq.p;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import er.f;
import fr.j;
import h.q0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ll.e;
import m.a4;
import nq.d;
import pp.a;
import pp.g;
import tq.b;
import tq.c;

@Keep
/* loaded from: classes2.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX WARN: Type inference failed for: r1v0, types: [tq.b, java.lang.Object] */
    public static b lambda$getComponents$0(p pVar, bq.b bVar) {
        AppStartTrace appStartTrace;
        boolean z10;
        g gVar = (g) bVar.a(g.class);
        a aVar = (a) bVar.b(a.class).get();
        Executor executor = (Executor) bVar.e(pVar);
        ?? obj = new Object();
        gVar.a();
        Context context = gVar.f31271a;
        vq.a e10 = vq.a.e();
        e10.getClass();
        vq.a.f38248d.f41802b = j.a(context);
        e10.f38252c.c(context);
        uq.b a10 = uq.b.a();
        synchronized (a10) {
            if (!a10.f37347p) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(a10);
                    a10.f37347p = true;
                }
            }
        }
        Object obj2 = new Object();
        synchronized (a10.f37338g) {
            a10.f37338g.add(obj2);
        }
        if (aVar != null) {
            if (AppStartTrace.f11812y != null) {
                appStartTrace = AppStartTrace.f11812y;
            } else {
                f fVar = f.f15842s;
                e eVar = new e(18);
                if (AppStartTrace.f11812y == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.f11812y == null) {
                                AppStartTrace.f11812y = new AppStartTrace(fVar, eVar, vq.a.e(), new ThreadPoolExecutor(0, 1, AppStartTrace.f11811x + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } finally {
                        }
                    }
                }
                appStartTrace = AppStartTrace.f11812y;
            }
            synchronized (appStartTrace) {
                try {
                    if (!appStartTrace.f11814a) {
                        h0.f1909c.f1911b.a(appStartTrace);
                        Context applicationContext2 = context.getApplicationContext();
                        if (applicationContext2 instanceof Application) {
                            ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                            if (!appStartTrace.f11835v && !AppStartTrace.h(applicationContext2)) {
                                z10 = false;
                                appStartTrace.f11835v = z10;
                                appStartTrace.f11814a = true;
                                appStartTrace.f11819f = applicationContext2;
                            }
                            z10 = true;
                            appStartTrace.f11835v = z10;
                            appStartTrace.f11814a = true;
                            appStartTrace.f11819f = applicationContext2;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            executor.execute(new q0(appStartTrace, 26));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [android.support.v4.media.d, java.lang.Object] */
    public static c providesFirebasePerformance(bq.b bVar) {
        bVar.a(b.class);
        xq.a aVar = new xq.a((g) bVar.a(g.class), (d) bVar.a(d.class), bVar.b(ir.f.class), bVar.b(gn.f.class));
        ?? obj = new Object();
        xq.c cVar = new xq.c(aVar, 0);
        obj.f809a = cVar;
        xq.b bVar2 = new xq.b(aVar, 1);
        obj.f810b = bVar2;
        wq.a aVar2 = new wq.a(aVar, 1);
        obj.f811c = aVar2;
        xq.b bVar3 = new xq.b(aVar, 2);
        obj.f812d = bVar3;
        xq.c cVar2 = new xq.c(aVar, 1);
        obj.f813e = cVar2;
        xq.b bVar4 = new xq.b(aVar, 0);
        obj.f814f = bVar4;
        wq.a aVar3 = new wq.a(aVar, 2);
        obj.f815g = aVar3;
        xs.b a10 = xs.a.a(new nn.c(new a4(cVar, bVar2, aVar2, bVar3, cVar2, bVar4, aVar3, 8), 1));
        obj.f816h = a10;
        return (c) a10.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<bq.a> getComponents() {
        p pVar = new p(wp.d.class, Executor.class);
        i0 a10 = bq.a.a(c.class);
        a10.f3350a = LIBRARY_NAME;
        a10.b(bq.j.c(g.class));
        a10.b(new bq.j(1, 1, ir.f.class));
        a10.b(bq.j.c(d.class));
        a10.b(new bq.j(1, 1, gn.f.class));
        a10.b(bq.j.c(b.class));
        a10.f3355f = new s0(8);
        bq.a c10 = a10.c();
        i0 a11 = bq.a.a(b.class);
        a11.f3350a = EARLY_LIBRARY_NAME;
        a11.b(bq.j.c(g.class));
        a11.b(bq.j.b(a.class));
        a11.b(new bq.j(pVar, 1, 0));
        a11.d(2);
        a11.f3355f = new kq.b(pVar, 1);
        return Arrays.asList(c10, a11.c(), yk.g.p(LIBRARY_NAME, "20.3.2"));
    }
}
