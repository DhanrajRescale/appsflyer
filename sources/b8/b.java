package b8;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements a, i8.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f4073l = u.C("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f4075b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.d f4076c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.a f4077d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f4078e;

    /* renamed from: h, reason: collision with root package name */
    public final List f4081h;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f4080g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4079f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f4082i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4083j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f4074a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4084k = new Object();

    public b(Context context, androidx.work.d dVar, h.c cVar, WorkDatabase workDatabase, List list) {
        this.f4075b = context;
        this.f4076c = dVar;
        this.f4077d = cVar;
        this.f4078e = workDatabase;
        this.f4081h = list;
    }

    public static boolean c(String str, n nVar) {
        boolean z10;
        if (nVar != null) {
            nVar.f4145s = true;
            nVar.i();
            op.a aVar = nVar.f4144r;
            if (aVar != null) {
                z10 = aVar.isDone();
                nVar.f4144r.cancel(true);
            } else {
                z10 = false;
            }
            ListenableWorker listenableWorker = nVar.f4132f;
            if (listenableWorker != null && !z10) {
                listenableWorker.stop();
            } else {
                u.w().u(n.f4126t, String.format("WorkSpec %s is already done. Not interrupting.", nVar.f4131e), new Throwable[0]);
            }
            u.w().u(f4073l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        u.w().u(f4073l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    public final void a(a aVar) {
        synchronized (this.f4084k) {
            this.f4083j.add(aVar);
        }
    }

    @Override // b8.a
    public final void b(String str, boolean z10) {
        synchronized (this.f4084k) {
            try {
                this.f4080g.remove(str);
                u.w().u(f4073l, String.format("%s %s executed; reschedule = %s", b.class.getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
                Iterator it = this.f4083j.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(String str) {
        boolean z10;
        synchronized (this.f4084k) {
            try {
                if (!this.f4080g.containsKey(str) && !this.f4079f.containsKey(str)) {
                    z10 = false;
                }
                z10 = true;
            } finally {
            }
        }
        return z10;
    }

    public final void e(a aVar) {
        synchronized (this.f4084k) {
            this.f4083j.remove(aVar);
        }
    }

    public final void f(String str, androidx.work.m mVar) {
        synchronized (this.f4084k) {
            try {
                u.w().z(f4073l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                n nVar = (n) this.f4080g.remove(str);
                if (nVar != null) {
                    if (this.f4074a == null) {
                        PowerManager.WakeLock a10 = k8.l.a(this.f4075b, "ProcessorForegroundLck");
                        this.f4074a = a10;
                        a10.acquire();
                    }
                    this.f4079f.put(str, nVar);
                    r3.k.startForegroundService(this.f4075b, i8.c.c(this.f4075b, str, mVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [b8.m, java.lang.Object] */
    public final boolean g(String str, h.c cVar) {
        synchronized (this.f4084k) {
            try {
                if (d(str)) {
                    u.w().u(f4073l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                Context context = this.f4075b;
                androidx.work.d dVar = this.f4076c;
                m8.a aVar = this.f4077d;
                WorkDatabase workDatabase = this.f4078e;
                ?? obj = new Object();
                obj.f4125i = new h.c(26, 0);
                obj.f4117a = context.getApplicationContext();
                obj.f4120d = aVar;
                obj.f4119c = this;
                obj.f4121e = dVar;
                obj.f4122f = workDatabase;
                obj.f4123g = str;
                obj.f4124h = this.f4081h;
                if (cVar != null) {
                    obj.f4125i = cVar;
                }
                n a10 = obj.a();
                l8.j jVar = a10.f4143q;
                jVar.a(new z3.a(this, str, jVar, 3), ((h.c) this.f4077d).B());
                this.f4080g.put(str, a10);
                ((k8.j) ((h.c) this.f4077d).f17583b).execute(a10);
                u.w().u(f4073l, String.format("%s: processing %s", b.class.getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f4084k) {
            try {
                if (!(!this.f4079f.isEmpty())) {
                    Context context = this.f4075b;
                    String str = i8.c.f19731j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f4075b.startService(intent);
                    } catch (Throwable th2) {
                        u.w().v(f4073l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f4074a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f4074a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean i(String str) {
        boolean c10;
        synchronized (this.f4084k) {
            u.w().u(f4073l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            c10 = c(str, (n) this.f4079f.remove(str));
        }
        return c10;
    }

    public final boolean j(String str) {
        boolean c10;
        synchronized (this.f4084k) {
            u.w().u(f4073l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            c10 = c(str, (n) this.f4080g.remove(str));
        }
        return c10;
    }
}
