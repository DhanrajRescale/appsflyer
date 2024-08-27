package el;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import bl.m;
import com.facebook.FacebookSdk;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.e0;
import nl.n0;
import nl.y;
import x5.u;
import xk.g0;

/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15639a;

    public /* synthetic */ b(int i10) {
        this.f15639a = i10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f15639a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                e0.f28850c.r(g0.f40374e, gl.b.f17450a, "onActivityCreated");
                gl.b.f17451b.execute(new com.appsflyer.internal.l(10));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f15639a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                e0.f28850c.r(g0.f40374e, gl.b.f17450a, "onActivityDestroyed");
                bl.e eVar = bl.e.f7087a;
                if (!sl.a.b(bl.e.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        bl.h x10 = bl.h.f7101f.x();
                        if (!sl.a.b(x10)) {
                            try {
                                Intrinsics.checkNotNullParameter(activity, "activity");
                                x10.f7108e.remove(Integer.valueOf(activity.hashCode()));
                                return;
                            } catch (Throwable th2) {
                                sl.a.a(x10, th2);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        sl.a.a(bl.e.class, th3);
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f15639a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                ll.f fVar = e0.f28850c;
                g0 g0Var = g0.f40374e;
                String str = gl.b.f17450a;
                fVar.r(g0Var, str, "onActivityPaused");
                AtomicInteger atomicInteger = gl.b.f17454e;
                int i10 = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                    Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
                }
                gl.b.a();
                long currentTimeMillis = System.currentTimeMillis();
                String l10 = n0.l(activity);
                bl.e eVar = bl.e.f7087a;
                if (!sl.a.b(bl.e.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        if (bl.e.f7092f.get()) {
                            bl.h.f7101f.x().c(activity);
                            bl.l lVar = bl.e.f7090d;
                            if (lVar != null && !sl.a.b(lVar)) {
                                try {
                                    if (((Activity) lVar.f7119b.get()) != null) {
                                        try {
                                            Timer timer = lVar.f7120c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            lVar.f7120c = null;
                                        } catch (Exception e10) {
                                            Log.e(bl.l.f7117e, "Error unscheduling indexing job", e10);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    sl.a.a(lVar, th2);
                                }
                            }
                            SensorManager sensorManager = bl.e.f7089c;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(bl.e.f7088b);
                            }
                        }
                    } catch (Throwable th3) {
                        sl.a.a(bl.e.class, th3);
                    }
                }
                gl.b.f17451b.execute(new gl.a(i10, l10, currentTimeMillis));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Boolean valueOf;
        switch (this.f15639a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    FacebookSdk.getExecutor().execute(new com.appsflyer.internal.l(6));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                e0.f28850c.r(g0.f40374e, gl.b.f17450a, "onActivityResumed");
                Intrinsics.checkNotNullParameter(activity, "activity");
                gl.b.f17460k = new WeakReference(activity);
                gl.b.f17454e.incrementAndGet();
                gl.b.a();
                long currentTimeMillis = System.currentTimeMillis();
                gl.b.f17458i = currentTimeMillis;
                String l10 = n0.l(activity);
                bl.e eVar = bl.e.f7087a;
                if (!sl.a.b(bl.e.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        if (bl.e.f7092f.get()) {
                            bl.h.f7101f.x().a(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String applicationId = FacebookSdk.getApplicationId();
                            y b10 = a0.b(applicationId);
                            if (b10 == null) {
                                valueOf = null;
                            } else {
                                valueOf = Boolean.valueOf(b10.f28972g);
                            }
                            boolean a10 = Intrinsics.a(valueOf, Boolean.TRUE);
                            bl.e eVar2 = bl.e.f7087a;
                            if (!a10) {
                                sl.a.b(eVar2);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    bl.e.f7089c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    bl.l lVar = new bl.l(activity);
                                    bl.e.f7090d = lVar;
                                    m mVar = bl.e.f7088b;
                                    androidx.fragment.app.g gVar = new androidx.fragment.app.g(26, b10, applicationId);
                                    if (!sl.a.b(mVar)) {
                                        try {
                                            mVar.f7122a = gVar;
                                        } catch (Throwable th2) {
                                            sl.a.a(mVar, th2);
                                        }
                                    }
                                    sensorManager.registerListener(mVar, defaultSensor, 2);
                                    if (b10 != null && b10.f28972g) {
                                        lVar.c();
                                    }
                                }
                            }
                            sl.a.b(eVar2);
                        }
                    } catch (Throwable th3) {
                        sl.a.a(bl.e.class, th3);
                    }
                }
                if (!sl.a.b(zk.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        try {
                            if (zk.a.f42540b) {
                                CopyOnWriteArraySet copyOnWriteArraySet = zk.c.f42542d;
                                if (!new HashSet(zk.c.a()).isEmpty()) {
                                    zk.d.f42546e.F(activity);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th4) {
                        sl.a.a(zk.a.class, th4);
                    }
                }
                kl.d.d(activity);
                j.a();
                gl.b.f17451b.execute(new u(activity.getApplicationContext(), l10, currentTimeMillis));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f15639a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                e0.f28850c.r(g0.f40374e, gl.b.f17450a, "onActivitySaveInstanceState");
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f15639a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                gl.b.f17459j++;
                e0.f28850c.r(g0.f40374e, gl.b.f17450a, "onActivityStarted");
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f15639a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    if (Intrinsics.a(c.f15642c, Boolean.TRUE) && Intrinsics.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        FacebookSdk.getExecutor().execute(new com.appsflyer.internal.l(7));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                e0.f28850c.r(g0.f40374e, gl.b.f17450a, "onActivityStopped");
                ek.h hVar = yk.l.f41701b;
                ek.e eVar = yk.m.f41703c;
                ek.u uVar = yk.i.f41694a;
                if (!sl.a.b(yk.i.class)) {
                    try {
                        yk.i.f41695b.execute(new com.appsflyer.internal.l(3));
                    } catch (Throwable th2) {
                        sl.a.a(yk.i.class, th2);
                    }
                }
                gl.b.f17459j--;
                return;
        }
    }
}
