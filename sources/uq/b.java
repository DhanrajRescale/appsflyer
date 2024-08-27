package uq;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.j0;
import androidx.fragment.app.q0;
import androidx.fragment.app.x0;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import er.f;
import fr.h;
import fr.i;
import gr.a0;
import gr.w;
import gr.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import q3.r;

/* loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r, reason: collision with root package name */
    public static final yq.a f37330r = yq.a.d();

    /* renamed from: s, reason: collision with root package name */
    public static volatile b f37331s;

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f37332a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f37333b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f37334c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f37335d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f37336e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f37337f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f37338g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f37339h;

    /* renamed from: i, reason: collision with root package name */
    public final f f37340i;

    /* renamed from: j, reason: collision with root package name */
    public final vq.a f37341j;

    /* renamed from: k, reason: collision with root package name */
    public final ll.e f37342k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f37343l;

    /* renamed from: m, reason: collision with root package name */
    public i f37344m;

    /* renamed from: n, reason: collision with root package name */
    public i f37345n;

    /* renamed from: o, reason: collision with root package name */
    public gr.i f37346o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37347p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37348q;

    public b(f fVar, ll.e eVar) {
        vq.a e10 = vq.a.e();
        yq.a aVar = e.f37355e;
        this.f37332a = new WeakHashMap();
        this.f37333b = new WeakHashMap();
        this.f37334c = new WeakHashMap();
        this.f37335d = new WeakHashMap();
        this.f37336e = new HashMap();
        this.f37337f = new HashSet();
        this.f37338g = new HashSet();
        this.f37339h = new AtomicInteger(0);
        this.f37346o = gr.i.BACKGROUND;
        this.f37347p = false;
        this.f37348q = true;
        this.f37340i = fVar;
        this.f37342k = eVar;
        this.f37341j = e10;
        this.f37343l = true;
    }

    public static b a() {
        if (f37331s == null) {
            synchronized (b.class) {
                try {
                    if (f37331s == null) {
                        f37331s = new b(f.f15842s, new ll.e(18));
                    }
                } finally {
                }
            }
        }
        return f37331s;
    }

    public final void b(String str) {
        synchronized (this.f37336e) {
            try {
                Long l10 = (Long) this.f37336e.get(str);
                if (l10 == null) {
                    this.f37336e.put(str, 1L);
                } else {
                    this.f37336e.put(str, Long.valueOf(l10.longValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Activity activity) {
        fr.d dVar;
        WeakHashMap weakHashMap = this.f37335d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        e eVar = (e) this.f37333b.get(activity);
        r rVar = eVar.f37357b;
        boolean z10 = eVar.f37359d;
        yq.a aVar = e.f37355e;
        if (!z10) {
            aVar.a("Cannot stop because no recording was started");
            dVar = new fr.d();
        } else {
            Map map = eVar.f37358c;
            if (!map.isEmpty()) {
                aVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            fr.d a10 = eVar.a();
            try {
                rVar.f31637a.v(eVar.f37356a);
            } catch (IllegalArgumentException | NullPointerException e10) {
                if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e10;
                }
                aVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
                a10 = new fr.d();
            }
            rVar.f31637a.w();
            eVar.f37359d = false;
            dVar = a10;
        }
        if (!dVar.b()) {
            f37330r.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            h.a(trace, (zq.e) dVar.a());
            trace.stop();
        }
    }

    public final void d(String str, i iVar, i iVar2) {
        if (!this.f37341j.o()) {
            return;
        }
        x O = a0.O();
        O.o(str);
        O.m(iVar.f16224a);
        O.n(iVar2.f16225b - iVar.f16225b);
        w a10 = SessionManager.getInstance().perfSession().a();
        O.i();
        a0.A((a0) O.f11975b, a10);
        int andSet = this.f37339h.getAndSet(0);
        synchronized (this.f37336e) {
            try {
                HashMap hashMap = this.f37336e;
                O.i();
                a0.w((a0) O.f11975b).putAll(hashMap);
                if (andSet != 0) {
                    O.l(andSet, "_tsns");
                }
                this.f37336e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f37340i.c((a0) O.g(), gr.i.FOREGROUND_BACKGROUND);
    }

    public final void e(Activity activity) {
        if (this.f37343l && this.f37341j.o()) {
            e eVar = new e(activity);
            this.f37333b.put(activity, eVar);
            if (activity instanceof j0) {
                d dVar = new d(this.f37342k, this.f37340i, this, eVar);
                this.f37334c.put(activity, dVar);
                ((CopyOnWriteArrayList) ((j0) activity).getSupportFragmentManager().f1657n.f1588a).add(new q0(dVar, true));
            }
        }
    }

    public final void f(gr.i iVar) {
        this.f37346o = iVar;
        synchronized (this.f37337f) {
            try {
                Iterator it = this.f37337f.iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((WeakReference) it.next()).get();
                    if (aVar != null) {
                        aVar.onUpdateAppState(this.f37346o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f37333b.remove(activity);
        WeakHashMap weakHashMap = this.f37334c;
        if (weakHashMap.containsKey(activity)) {
            ((j0) activity).getSupportFragmentManager().g0((x0) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.f37332a.isEmpty()) {
            this.f37342k.getClass();
            this.f37344m = new i();
            this.f37332a.put(activity, Boolean.TRUE);
            if (this.f37348q) {
                f(gr.i.FOREGROUND);
                synchronized (this.f37338g) {
                    try {
                        Iterator it = this.f37338g.iterator();
                        while (it.hasNext()) {
                            if (((tq.d) it.next()) != null) {
                                yq.a aVar = tq.c.f36351b;
                            }
                        }
                    } finally {
                    }
                }
                this.f37348q = false;
            } else {
                d("_bs", this.f37345n, this.f37344m);
                f(gr.i.FOREGROUND);
            }
        } else {
            this.f37332a.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f37343l && this.f37341j.o()) {
                if (!this.f37333b.containsKey(activity)) {
                    e(activity);
                }
                e eVar = (e) this.f37333b.get(activity);
                boolean z10 = eVar.f37359d;
                Activity activity2 = eVar.f37356a;
                if (z10) {
                    e.f37355e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    eVar.f37357b.f31637a.t(activity2);
                    eVar.f37359d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f37340i, this.f37342k, this);
                trace.start();
                this.f37335d.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f37343l) {
                c(activity);
            }
            if (this.f37332a.containsKey(activity)) {
                this.f37332a.remove(activity);
                if (this.f37332a.isEmpty()) {
                    this.f37342k.getClass();
                    i iVar = new i();
                    this.f37345n = iVar;
                    d("_fs", this.f37344m, iVar);
                    f(gr.i.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
