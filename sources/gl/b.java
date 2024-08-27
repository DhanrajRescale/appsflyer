package gl;

import android.app.Application;
import i5.w;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nl.t;
import nl.v;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17450a;

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f17451b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile ScheduledFuture f17452c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f17453d;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f17454e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile l f17455f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f17456g;

    /* renamed from: h, reason: collision with root package name */
    public static String f17457h;

    /* renamed from: i, reason: collision with root package name */
    public static long f17458i;

    /* renamed from: j, reason: collision with root package name */
    public static int f17459j;

    /* renamed from: k, reason: collision with root package name */
    public static WeakReference f17460k;

    static {
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f17450a = canonicalName;
        f17451b = Executors.newSingleThreadScheduledExecutor();
        f17453d = new Object();
        f17454e = new AtomicInteger(0);
        f17456g = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (f17453d) {
            try {
                if (f17452c != null && (scheduledFuture = f17452c) != null) {
                    scheduledFuture.cancel(false);
                }
                f17452c = null;
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final UUID b() {
        l lVar;
        if (f17455f == null || (lVar = f17455f) == null) {
            return null;
        }
        return lVar.f17480c;
    }

    public static final void c(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        int i10 = 1;
        if (!f17456g.compareAndSet(false, true)) {
            return;
        }
        v vVar = v.f28944a;
        v.a(new w(i10), t.CodelessEvents);
        f17457h = str;
        application.registerActivityLifecycleCallbacks(new el.b(i10));
    }
}
