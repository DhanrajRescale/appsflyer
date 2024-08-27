package k8;

import androidx.work.u;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f22706e = u.C("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f22707a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22708b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22709c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22710d;

    public s() {
        z3.j jVar = new z3.j(this);
        this.f22708b = new HashMap();
        this.f22709c = new HashMap();
        this.f22710d = new Object();
        this.f22707a = Executors.newSingleThreadScheduledExecutor(jVar);
    }

    public final void a(String str, q qVar) {
        synchronized (this.f22710d) {
            u.w().u(f22706e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            r rVar = new r(this, str);
            this.f22708b.put(str, rVar);
            this.f22709c.put(str, qVar);
            this.f22707a.schedule(rVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f22710d) {
            try {
                if (((r) this.f22708b.remove(str)) != null) {
                    u.w().u(f22706e, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f22709c.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
