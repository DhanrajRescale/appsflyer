package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import er.f;
import fr.i;
import gr.a0;
import gr.w;
import gr.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jr.h;
import ll.e;
import pp.g;
import vq.a;
import zq.b;

/* loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, s {

    /* renamed from: w, reason: collision with root package name */
    public static final i f11810w = new i();

    /* renamed from: x, reason: collision with root package name */
    public static final long f11811x = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: y, reason: collision with root package name */
    public static volatile AppStartTrace f11812y;

    /* renamed from: z, reason: collision with root package name */
    public static ExecutorService f11813z;

    /* renamed from: b, reason: collision with root package name */
    public final f f11815b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11816c;

    /* renamed from: d, reason: collision with root package name */
    public final a f11817d;

    /* renamed from: e, reason: collision with root package name */
    public final x f11818e;

    /* renamed from: f, reason: collision with root package name */
    public Context f11819f;

    /* renamed from: h, reason: collision with root package name */
    public final i f11821h;

    /* renamed from: i, reason: collision with root package name */
    public final i f11822i;

    /* renamed from: r, reason: collision with root package name */
    public cr.a f11831r;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11814a = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11820g = false;

    /* renamed from: j, reason: collision with root package name */
    public i f11823j = null;

    /* renamed from: k, reason: collision with root package name */
    public i f11824k = null;

    /* renamed from: l, reason: collision with root package name */
    public i f11825l = null;

    /* renamed from: m, reason: collision with root package name */
    public i f11826m = null;

    /* renamed from: n, reason: collision with root package name */
    public i f11827n = null;

    /* renamed from: o, reason: collision with root package name */
    public i f11828o = null;

    /* renamed from: p, reason: collision with root package name */
    public i f11829p = null;

    /* renamed from: q, reason: collision with root package name */
    public i f11830q = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11832s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f11833t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final b f11834u = new b(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f11835v = false;

    public AppStartTrace(f fVar, e eVar, a aVar, ThreadPoolExecutor threadPoolExecutor) {
        i iVar = null;
        this.f11815b = fVar;
        this.f11816c = eVar;
        this.f11817d = aVar;
        f11813z = threadPoolExecutor;
        x O = a0.O();
        O.o("_experiment_app_start_ttid");
        this.f11818e = O;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        long micros2 = timeUnit.toMicros(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f11821h = new i((micros - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + micros2, micros);
        pp.a aVar2 = (pp.a) g.d().b(pp.a.class);
        if (aVar2 != null) {
            long micros3 = timeUnit.toMicros(aVar2.f31260b);
            iVar = new i((micros3 - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros3);
        }
        this.f11822i = iVar;
    }

    public static boolean h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String r10 = h.r(packageName, ":");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(r10))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final i a() {
        i iVar = this.f11822i;
        return iVar != null ? iVar : f11810w;
    }

    public final i e() {
        i iVar = this.f11821h;
        if (iVar != null) {
            return iVar;
        }
        return a();
    }

    public final void i(x xVar) {
        if (this.f11828o != null && this.f11829p != null && this.f11830q != null) {
            f11813z.execute(new yk.h(21, this, xVar));
            j();
        }
    }

    public final synchronized void j() {
        if (!this.f11814a) {
            return;
        }
        h0.f1909c.f1911b.c(this);
        ((Application) this.f11819f).unregisterActivityLifecycleCallbacks(this);
        this.f11814a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:14:0x001d, B:16:0x0040), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f11832s     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L44
            fr.i r5 = r3.f11823j     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto La
            goto L44
        La:
            boolean r5 = r3.f11835v     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r5 != 0) goto L1c
            android.content.Context r5 = r3.f11819f     // Catch: java.lang.Throwable -> L1a
            boolean r5 = h(r5)     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L18
            goto L1c
        L18:
            r5 = 0
            goto L1d
        L1a:
            r4 = move-exception
            goto L46
        L1c:
            r5 = r0
        L1d:
            r3.f11835v = r5     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1a
            ll.e r4 = r3.f11816c     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            fr.i r4 = new fr.i     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            r3.f11823j = r4     // Catch: java.lang.Throwable -> L1a
            fr.i r4 = r3.e()     // Catch: java.lang.Throwable -> L1a
            fr.i r5 = r3.f11823j     // Catch: java.lang.Throwable -> L1a
            long r4 = r4.b(r5)     // Catch: java.lang.Throwable -> L1a
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.f11811x     // Catch: java.lang.Throwable -> L1a
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L42
            r3.f11820g = r0     // Catch: java.lang.Throwable -> L1a
        L42:
            monitor-exit(r3)
            return
        L44:
            monitor-exit(r3)
            return
        L46:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f11832s && !this.f11820g && this.f11817d.f()) {
            activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f11834u);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [zq.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [zq.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [zq.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f11832s && !this.f11820g) {
                boolean f10 = this.f11817d.f();
                if (f10) {
                    View findViewById = activity.findViewById(R.id.content);
                    findViewById.getViewTreeObserver().addOnDrawListener(this.f11834u);
                    final int i10 = 0;
                    fr.b bVar = new fr.b(findViewById, new Runnable(this) { // from class: zq.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f42795b;

                        {
                            this.f42795b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            int i11 = i10;
                            AppStartTrace appStartTrace = this.f42795b;
                            switch (i11) {
                                case 0:
                                    if (appStartTrace.f11830q == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11830q = new i();
                                        x O = a0.O();
                                        O.o("_experiment_onDrawFoQ");
                                        O.m(appStartTrace.e().f16224a);
                                        O.n(appStartTrace.e().b(appStartTrace.f11830q));
                                        a0 a0Var = (a0) O.g();
                                        x xVar = appStartTrace.f11818e;
                                        xVar.k(a0Var);
                                        if (appStartTrace.f11821h != null) {
                                            x O2 = a0.O();
                                            O2.o("_experiment_procStart_to_classLoad");
                                            O2.m(appStartTrace.e().f16224a);
                                            O2.n(appStartTrace.e().b(appStartTrace.a()));
                                            xVar.k((a0) O2.g());
                                        }
                                        if (appStartTrace.f11835v) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        xVar.i();
                                        a0.z((a0) xVar.f11975b).put("systemDeterminedForeground", str);
                                        xVar.l(appStartTrace.f11833t, "onDrawCount");
                                        w a10 = appStartTrace.f11831r.a();
                                        xVar.i();
                                        a0.A((a0) xVar.f11975b, a10);
                                        appStartTrace.i(xVar);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f11828o == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11828o = new i();
                                        long j10 = appStartTrace.e().f16224a;
                                        x xVar2 = appStartTrace.f11818e;
                                        xVar2.m(j10);
                                        xVar2.n(appStartTrace.e().b(appStartTrace.f11828o));
                                        appStartTrace.i(xVar2);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f11829p == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11829p = new i();
                                        x O3 = a0.O();
                                        O3.o("_experiment_preDrawFoQ");
                                        O3.m(appStartTrace.e().f16224a);
                                        O3.n(appStartTrace.e().b(appStartTrace.f11829p));
                                        a0 a0Var2 = (a0) O3.g();
                                        x xVar3 = appStartTrace.f11818e;
                                        xVar3.k(a0Var2);
                                        appStartTrace.i(xVar3);
                                        return;
                                    }
                                    return;
                                default:
                                    i iVar = AppStartTrace.f11810w;
                                    appStartTrace.getClass();
                                    x O4 = a0.O();
                                    O4.o("_as");
                                    O4.m(appStartTrace.a().f16224a);
                                    O4.n(appStartTrace.a().b(appStartTrace.f11825l));
                                    ArrayList arrayList = new ArrayList(3);
                                    x O5 = a0.O();
                                    O5.o("_astui");
                                    O5.m(appStartTrace.a().f16224a);
                                    O5.n(appStartTrace.a().b(appStartTrace.f11823j));
                                    arrayList.add((a0) O5.g());
                                    x O6 = a0.O();
                                    O6.o("_astfd");
                                    O6.m(appStartTrace.f11823j.f16224a);
                                    O6.n(appStartTrace.f11823j.b(appStartTrace.f11824k));
                                    arrayList.add((a0) O6.g());
                                    x O7 = a0.O();
                                    O7.o("_asti");
                                    O7.m(appStartTrace.f11824k.f16224a);
                                    O7.n(appStartTrace.f11824k.b(appStartTrace.f11825l));
                                    arrayList.add((a0) O7.g());
                                    O4.i();
                                    a0.y((a0) O4.f11975b, arrayList);
                                    w a11 = appStartTrace.f11831r.a();
                                    O4.i();
                                    a0.A((a0) O4.f11975b, a11);
                                    appStartTrace.f11815b.c((a0) O4.g(), gr.i.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    });
                    if (Build.VERSION.SDK_INT < 26 && (!findViewById.getViewTreeObserver().isAlive() || !findViewById.isAttachedToWindow())) {
                        findViewById.addOnAttachStateChangeListener(new l.f(bVar, 6));
                        final int i11 = 1;
                        final int i12 = 2;
                        findViewById.getViewTreeObserver().addOnPreDrawListener(new fr.e(findViewById, new Runnable(this) { // from class: zq.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ AppStartTrace f42795b;

                            {
                                this.f42795b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                int i112 = i11;
                                AppStartTrace appStartTrace = this.f42795b;
                                switch (i112) {
                                    case 0:
                                        if (appStartTrace.f11830q == null) {
                                            appStartTrace.f11816c.getClass();
                                            appStartTrace.f11830q = new i();
                                            x O = a0.O();
                                            O.o("_experiment_onDrawFoQ");
                                            O.m(appStartTrace.e().f16224a);
                                            O.n(appStartTrace.e().b(appStartTrace.f11830q));
                                            a0 a0Var = (a0) O.g();
                                            x xVar = appStartTrace.f11818e;
                                            xVar.k(a0Var);
                                            if (appStartTrace.f11821h != null) {
                                                x O2 = a0.O();
                                                O2.o("_experiment_procStart_to_classLoad");
                                                O2.m(appStartTrace.e().f16224a);
                                                O2.n(appStartTrace.e().b(appStartTrace.a()));
                                                xVar.k((a0) O2.g());
                                            }
                                            if (appStartTrace.f11835v) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            xVar.i();
                                            a0.z((a0) xVar.f11975b).put("systemDeterminedForeground", str);
                                            xVar.l(appStartTrace.f11833t, "onDrawCount");
                                            w a10 = appStartTrace.f11831r.a();
                                            xVar.i();
                                            a0.A((a0) xVar.f11975b, a10);
                                            appStartTrace.i(xVar);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.f11828o == null) {
                                            appStartTrace.f11816c.getClass();
                                            appStartTrace.f11828o = new i();
                                            long j10 = appStartTrace.e().f16224a;
                                            x xVar2 = appStartTrace.f11818e;
                                            xVar2.m(j10);
                                            xVar2.n(appStartTrace.e().b(appStartTrace.f11828o));
                                            appStartTrace.i(xVar2);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.f11829p == null) {
                                            appStartTrace.f11816c.getClass();
                                            appStartTrace.f11829p = new i();
                                            x O3 = a0.O();
                                            O3.o("_experiment_preDrawFoQ");
                                            O3.m(appStartTrace.e().f16224a);
                                            O3.n(appStartTrace.e().b(appStartTrace.f11829p));
                                            a0 a0Var2 = (a0) O3.g();
                                            x xVar3 = appStartTrace.f11818e;
                                            xVar3.k(a0Var2);
                                            appStartTrace.i(xVar3);
                                            return;
                                        }
                                        return;
                                    default:
                                        i iVar = AppStartTrace.f11810w;
                                        appStartTrace.getClass();
                                        x O4 = a0.O();
                                        O4.o("_as");
                                        O4.m(appStartTrace.a().f16224a);
                                        O4.n(appStartTrace.a().b(appStartTrace.f11825l));
                                        ArrayList arrayList = new ArrayList(3);
                                        x O5 = a0.O();
                                        O5.o("_astui");
                                        O5.m(appStartTrace.a().f16224a);
                                        O5.n(appStartTrace.a().b(appStartTrace.f11823j));
                                        arrayList.add((a0) O5.g());
                                        x O6 = a0.O();
                                        O6.o("_astfd");
                                        O6.m(appStartTrace.f11823j.f16224a);
                                        O6.n(appStartTrace.f11823j.b(appStartTrace.f11824k));
                                        arrayList.add((a0) O6.g());
                                        x O7 = a0.O();
                                        O7.o("_asti");
                                        O7.m(appStartTrace.f11824k.f16224a);
                                        O7.n(appStartTrace.f11824k.b(appStartTrace.f11825l));
                                        arrayList.add((a0) O7.g());
                                        O4.i();
                                        a0.y((a0) O4.f11975b, arrayList);
                                        w a11 = appStartTrace.f11831r.a();
                                        O4.i();
                                        a0.A((a0) O4.f11975b, a11);
                                        appStartTrace.f11815b.c((a0) O4.g(), gr.i.FOREGROUND_BACKGROUND);
                                        return;
                                }
                            }
                        }, new Runnable(this) { // from class: zq.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ AppStartTrace f42795b;

                            {
                                this.f42795b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                int i112 = i12;
                                AppStartTrace appStartTrace = this.f42795b;
                                switch (i112) {
                                    case 0:
                                        if (appStartTrace.f11830q == null) {
                                            appStartTrace.f11816c.getClass();
                                            appStartTrace.f11830q = new i();
                                            x O = a0.O();
                                            O.o("_experiment_onDrawFoQ");
                                            O.m(appStartTrace.e().f16224a);
                                            O.n(appStartTrace.e().b(appStartTrace.f11830q));
                                            a0 a0Var = (a0) O.g();
                                            x xVar = appStartTrace.f11818e;
                                            xVar.k(a0Var);
                                            if (appStartTrace.f11821h != null) {
                                                x O2 = a0.O();
                                                O2.o("_experiment_procStart_to_classLoad");
                                                O2.m(appStartTrace.e().f16224a);
                                                O2.n(appStartTrace.e().b(appStartTrace.a()));
                                                xVar.k((a0) O2.g());
                                            }
                                            if (appStartTrace.f11835v) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            xVar.i();
                                            a0.z((a0) xVar.f11975b).put("systemDeterminedForeground", str);
                                            xVar.l(appStartTrace.f11833t, "onDrawCount");
                                            w a10 = appStartTrace.f11831r.a();
                                            xVar.i();
                                            a0.A((a0) xVar.f11975b, a10);
                                            appStartTrace.i(xVar);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.f11828o == null) {
                                            appStartTrace.f11816c.getClass();
                                            appStartTrace.f11828o = new i();
                                            long j10 = appStartTrace.e().f16224a;
                                            x xVar2 = appStartTrace.f11818e;
                                            xVar2.m(j10);
                                            xVar2.n(appStartTrace.e().b(appStartTrace.f11828o));
                                            appStartTrace.i(xVar2);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.f11829p == null) {
                                            appStartTrace.f11816c.getClass();
                                            appStartTrace.f11829p = new i();
                                            x O3 = a0.O();
                                            O3.o("_experiment_preDrawFoQ");
                                            O3.m(appStartTrace.e().f16224a);
                                            O3.n(appStartTrace.e().b(appStartTrace.f11829p));
                                            a0 a0Var2 = (a0) O3.g();
                                            x xVar3 = appStartTrace.f11818e;
                                            xVar3.k(a0Var2);
                                            appStartTrace.i(xVar3);
                                            return;
                                        }
                                        return;
                                    default:
                                        i iVar = AppStartTrace.f11810w;
                                        appStartTrace.getClass();
                                        x O4 = a0.O();
                                        O4.o("_as");
                                        O4.m(appStartTrace.a().f16224a);
                                        O4.n(appStartTrace.a().b(appStartTrace.f11825l));
                                        ArrayList arrayList = new ArrayList(3);
                                        x O5 = a0.O();
                                        O5.o("_astui");
                                        O5.m(appStartTrace.a().f16224a);
                                        O5.n(appStartTrace.a().b(appStartTrace.f11823j));
                                        arrayList.add((a0) O5.g());
                                        x O6 = a0.O();
                                        O6.o("_astfd");
                                        O6.m(appStartTrace.f11823j.f16224a);
                                        O6.n(appStartTrace.f11823j.b(appStartTrace.f11824k));
                                        arrayList.add((a0) O6.g());
                                        x O7 = a0.O();
                                        O7.o("_asti");
                                        O7.m(appStartTrace.f11824k.f16224a);
                                        O7.n(appStartTrace.f11824k.b(appStartTrace.f11825l));
                                        arrayList.add((a0) O7.g());
                                        O4.i();
                                        a0.y((a0) O4.f11975b, arrayList);
                                        w a11 = appStartTrace.f11831r.a();
                                        O4.i();
                                        a0.A((a0) O4.f11975b, a11);
                                        appStartTrace.f11815b.c((a0) O4.g(), gr.i.FOREGROUND_BACKGROUND);
                                        return;
                                }
                            }
                        }));
                    }
                    findViewById.getViewTreeObserver().addOnDrawListener(bVar);
                    final int i112 = 1;
                    final int i122 = 2;
                    findViewById.getViewTreeObserver().addOnPreDrawListener(new fr.e(findViewById, new Runnable(this) { // from class: zq.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f42795b;

                        {
                            this.f42795b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            int i1122 = i112;
                            AppStartTrace appStartTrace = this.f42795b;
                            switch (i1122) {
                                case 0:
                                    if (appStartTrace.f11830q == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11830q = new i();
                                        x O = a0.O();
                                        O.o("_experiment_onDrawFoQ");
                                        O.m(appStartTrace.e().f16224a);
                                        O.n(appStartTrace.e().b(appStartTrace.f11830q));
                                        a0 a0Var = (a0) O.g();
                                        x xVar = appStartTrace.f11818e;
                                        xVar.k(a0Var);
                                        if (appStartTrace.f11821h != null) {
                                            x O2 = a0.O();
                                            O2.o("_experiment_procStart_to_classLoad");
                                            O2.m(appStartTrace.e().f16224a);
                                            O2.n(appStartTrace.e().b(appStartTrace.a()));
                                            xVar.k((a0) O2.g());
                                        }
                                        if (appStartTrace.f11835v) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        xVar.i();
                                        a0.z((a0) xVar.f11975b).put("systemDeterminedForeground", str);
                                        xVar.l(appStartTrace.f11833t, "onDrawCount");
                                        w a10 = appStartTrace.f11831r.a();
                                        xVar.i();
                                        a0.A((a0) xVar.f11975b, a10);
                                        appStartTrace.i(xVar);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f11828o == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11828o = new i();
                                        long j10 = appStartTrace.e().f16224a;
                                        x xVar2 = appStartTrace.f11818e;
                                        xVar2.m(j10);
                                        xVar2.n(appStartTrace.e().b(appStartTrace.f11828o));
                                        appStartTrace.i(xVar2);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f11829p == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11829p = new i();
                                        x O3 = a0.O();
                                        O3.o("_experiment_preDrawFoQ");
                                        O3.m(appStartTrace.e().f16224a);
                                        O3.n(appStartTrace.e().b(appStartTrace.f11829p));
                                        a0 a0Var2 = (a0) O3.g();
                                        x xVar3 = appStartTrace.f11818e;
                                        xVar3.k(a0Var2);
                                        appStartTrace.i(xVar3);
                                        return;
                                    }
                                    return;
                                default:
                                    i iVar = AppStartTrace.f11810w;
                                    appStartTrace.getClass();
                                    x O4 = a0.O();
                                    O4.o("_as");
                                    O4.m(appStartTrace.a().f16224a);
                                    O4.n(appStartTrace.a().b(appStartTrace.f11825l));
                                    ArrayList arrayList = new ArrayList(3);
                                    x O5 = a0.O();
                                    O5.o("_astui");
                                    O5.m(appStartTrace.a().f16224a);
                                    O5.n(appStartTrace.a().b(appStartTrace.f11823j));
                                    arrayList.add((a0) O5.g());
                                    x O6 = a0.O();
                                    O6.o("_astfd");
                                    O6.m(appStartTrace.f11823j.f16224a);
                                    O6.n(appStartTrace.f11823j.b(appStartTrace.f11824k));
                                    arrayList.add((a0) O6.g());
                                    x O7 = a0.O();
                                    O7.o("_asti");
                                    O7.m(appStartTrace.f11824k.f16224a);
                                    O7.n(appStartTrace.f11824k.b(appStartTrace.f11825l));
                                    arrayList.add((a0) O7.g());
                                    O4.i();
                                    a0.y((a0) O4.f11975b, arrayList);
                                    w a11 = appStartTrace.f11831r.a();
                                    O4.i();
                                    a0.A((a0) O4.f11975b, a11);
                                    appStartTrace.f11815b.c((a0) O4.g(), gr.i.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    }, new Runnable(this) { // from class: zq.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f42795b;

                        {
                            this.f42795b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            int i1122 = i122;
                            AppStartTrace appStartTrace = this.f42795b;
                            switch (i1122) {
                                case 0:
                                    if (appStartTrace.f11830q == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11830q = new i();
                                        x O = a0.O();
                                        O.o("_experiment_onDrawFoQ");
                                        O.m(appStartTrace.e().f16224a);
                                        O.n(appStartTrace.e().b(appStartTrace.f11830q));
                                        a0 a0Var = (a0) O.g();
                                        x xVar = appStartTrace.f11818e;
                                        xVar.k(a0Var);
                                        if (appStartTrace.f11821h != null) {
                                            x O2 = a0.O();
                                            O2.o("_experiment_procStart_to_classLoad");
                                            O2.m(appStartTrace.e().f16224a);
                                            O2.n(appStartTrace.e().b(appStartTrace.a()));
                                            xVar.k((a0) O2.g());
                                        }
                                        if (appStartTrace.f11835v) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        xVar.i();
                                        a0.z((a0) xVar.f11975b).put("systemDeterminedForeground", str);
                                        xVar.l(appStartTrace.f11833t, "onDrawCount");
                                        w a10 = appStartTrace.f11831r.a();
                                        xVar.i();
                                        a0.A((a0) xVar.f11975b, a10);
                                        appStartTrace.i(xVar);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f11828o == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11828o = new i();
                                        long j10 = appStartTrace.e().f16224a;
                                        x xVar2 = appStartTrace.f11818e;
                                        xVar2.m(j10);
                                        xVar2.n(appStartTrace.e().b(appStartTrace.f11828o));
                                        appStartTrace.i(xVar2);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f11829p == null) {
                                        appStartTrace.f11816c.getClass();
                                        appStartTrace.f11829p = new i();
                                        x O3 = a0.O();
                                        O3.o("_experiment_preDrawFoQ");
                                        O3.m(appStartTrace.e().f16224a);
                                        O3.n(appStartTrace.e().b(appStartTrace.f11829p));
                                        a0 a0Var2 = (a0) O3.g();
                                        x xVar3 = appStartTrace.f11818e;
                                        xVar3.k(a0Var2);
                                        appStartTrace.i(xVar3);
                                        return;
                                    }
                                    return;
                                default:
                                    i iVar = AppStartTrace.f11810w;
                                    appStartTrace.getClass();
                                    x O4 = a0.O();
                                    O4.o("_as");
                                    O4.m(appStartTrace.a().f16224a);
                                    O4.n(appStartTrace.a().b(appStartTrace.f11825l));
                                    ArrayList arrayList = new ArrayList(3);
                                    x O5 = a0.O();
                                    O5.o("_astui");
                                    O5.m(appStartTrace.a().f16224a);
                                    O5.n(appStartTrace.a().b(appStartTrace.f11823j));
                                    arrayList.add((a0) O5.g());
                                    x O6 = a0.O();
                                    O6.o("_astfd");
                                    O6.m(appStartTrace.f11823j.f16224a);
                                    O6.n(appStartTrace.f11823j.b(appStartTrace.f11824k));
                                    arrayList.add((a0) O6.g());
                                    x O7 = a0.O();
                                    O7.o("_asti");
                                    O7.m(appStartTrace.f11824k.f16224a);
                                    O7.n(appStartTrace.f11824k.b(appStartTrace.f11825l));
                                    arrayList.add((a0) O7.g());
                                    O4.i();
                                    a0.y((a0) O4.f11975b, arrayList);
                                    w a11 = appStartTrace.f11831r.a();
                                    O4.i();
                                    a0.A((a0) O4.f11975b, a11);
                                    appStartTrace.f11815b.c((a0) O4.g(), gr.i.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    }));
                }
                if (this.f11825l != null) {
                    return;
                }
                new WeakReference(activity);
                this.f11816c.getClass();
                this.f11825l = new i();
                this.f11831r = SessionManager.getInstance().perfSession();
                yq.a.d().a("onResume(): " + activity.getClass().getName() + ": " + a().b(this.f11825l) + " microseconds");
                final int i13 = 3;
                f11813z.execute(new Runnable(this) { // from class: zq.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f42795b;

                    {
                        this.f42795b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i1122 = i13;
                        AppStartTrace appStartTrace = this.f42795b;
                        switch (i1122) {
                            case 0:
                                if (appStartTrace.f11830q == null) {
                                    appStartTrace.f11816c.getClass();
                                    appStartTrace.f11830q = new i();
                                    x O = a0.O();
                                    O.o("_experiment_onDrawFoQ");
                                    O.m(appStartTrace.e().f16224a);
                                    O.n(appStartTrace.e().b(appStartTrace.f11830q));
                                    a0 a0Var = (a0) O.g();
                                    x xVar = appStartTrace.f11818e;
                                    xVar.k(a0Var);
                                    if (appStartTrace.f11821h != null) {
                                        x O2 = a0.O();
                                        O2.o("_experiment_procStart_to_classLoad");
                                        O2.m(appStartTrace.e().f16224a);
                                        O2.n(appStartTrace.e().b(appStartTrace.a()));
                                        xVar.k((a0) O2.g());
                                    }
                                    if (appStartTrace.f11835v) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    xVar.i();
                                    a0.z((a0) xVar.f11975b).put("systemDeterminedForeground", str);
                                    xVar.l(appStartTrace.f11833t, "onDrawCount");
                                    w a10 = appStartTrace.f11831r.a();
                                    xVar.i();
                                    a0.A((a0) xVar.f11975b, a10);
                                    appStartTrace.i(xVar);
                                    return;
                                }
                                return;
                            case 1:
                                if (appStartTrace.f11828o == null) {
                                    appStartTrace.f11816c.getClass();
                                    appStartTrace.f11828o = new i();
                                    long j10 = appStartTrace.e().f16224a;
                                    x xVar2 = appStartTrace.f11818e;
                                    xVar2.m(j10);
                                    xVar2.n(appStartTrace.e().b(appStartTrace.f11828o));
                                    appStartTrace.i(xVar2);
                                    return;
                                }
                                return;
                            case 2:
                                if (appStartTrace.f11829p == null) {
                                    appStartTrace.f11816c.getClass();
                                    appStartTrace.f11829p = new i();
                                    x O3 = a0.O();
                                    O3.o("_experiment_preDrawFoQ");
                                    O3.m(appStartTrace.e().f16224a);
                                    O3.n(appStartTrace.e().b(appStartTrace.f11829p));
                                    a0 a0Var2 = (a0) O3.g();
                                    x xVar3 = appStartTrace.f11818e;
                                    xVar3.k(a0Var2);
                                    appStartTrace.i(xVar3);
                                    return;
                                }
                                return;
                            default:
                                i iVar = AppStartTrace.f11810w;
                                appStartTrace.getClass();
                                x O4 = a0.O();
                                O4.o("_as");
                                O4.m(appStartTrace.a().f16224a);
                                O4.n(appStartTrace.a().b(appStartTrace.f11825l));
                                ArrayList arrayList = new ArrayList(3);
                                x O5 = a0.O();
                                O5.o("_astui");
                                O5.m(appStartTrace.a().f16224a);
                                O5.n(appStartTrace.a().b(appStartTrace.f11823j));
                                arrayList.add((a0) O5.g());
                                x O6 = a0.O();
                                O6.o("_astfd");
                                O6.m(appStartTrace.f11823j.f16224a);
                                O6.n(appStartTrace.f11823j.b(appStartTrace.f11824k));
                                arrayList.add((a0) O6.g());
                                x O7 = a0.O();
                                O7.o("_asti");
                                O7.m(appStartTrace.f11824k.f16224a);
                                O7.n(appStartTrace.f11824k.b(appStartTrace.f11825l));
                                arrayList.add((a0) O7.g());
                                O4.i();
                                a0.y((a0) O4.f11975b, arrayList);
                                w a11 = appStartTrace.f11831r.a();
                                O4.i();
                                a0.A((a0) O4.f11975b, a11);
                                appStartTrace.f11815b.c((a0) O4.g(), gr.i.FOREGROUND_BACKGROUND);
                                return;
                        }
                    }
                });
                if (!f10) {
                    j();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f11832s && this.f11824k == null && !this.f11820g) {
            this.f11816c.getClass();
            this.f11824k = new i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @g0(m.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.f11832s && !this.f11820g && this.f11827n == null) {
            this.f11816c.getClass();
            this.f11827n = new i();
            x O = a0.O();
            O.o("_experiment_firstBackgrounding");
            O.m(e().f16224a);
            O.n(e().b(this.f11827n));
            this.f11818e.k((a0) O.g());
        }
    }

    @g0(m.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.f11832s && !this.f11820g && this.f11826m == null) {
            this.f11816c.getClass();
            this.f11826m = new i();
            x O = a0.O();
            O.o("_experiment_firstForegrounding");
            O.m(e().f16224a);
            O.n(e().b(this.f11826m));
            this.f11818e.k((a0) O.g());
        }
    }
}
