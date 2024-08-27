package d8;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.u;
import b8.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import k8.s;

/* loaded from: classes.dex */
public final class h implements b8.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f14203k = u.C("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f14204a;

    /* renamed from: b, reason: collision with root package name */
    public final m8.a f14205b;

    /* renamed from: c, reason: collision with root package name */
    public final s f14206c;

    /* renamed from: d, reason: collision with root package name */
    public final b8.b f14207d;

    /* renamed from: e, reason: collision with root package name */
    public final l f14208e;

    /* renamed from: f, reason: collision with root package name */
    public final b f14209f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f14210g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f14211h;

    /* renamed from: i, reason: collision with root package name */
    public Intent f14212i;

    /* renamed from: j, reason: collision with root package name */
    public g f14213j;

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f14204a = applicationContext;
        this.f14209f = new b(applicationContext);
        this.f14206c = new s();
        l c10 = l.c(context);
        this.f14208e = c10;
        b8.b bVar = c10.f4113f;
        this.f14207d = bVar;
        this.f14205b = c10.f4111d;
        bVar.a(this);
        this.f14211h = new ArrayList();
        this.f14212i = null;
        this.f14210g = new Handler(Looper.getMainLooper());
    }

    public final void a(int i10, Intent intent) {
        u w10 = u.w();
        String str = f14203k;
        w10.u(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            u.w().D(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f14211h) {
                try {
                    Iterator it = this.f14211h.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f14211h) {
            try {
                boolean z10 = !this.f14211h.isEmpty();
                this.f14211h.add(intent);
                if (!z10) {
                    f();
                }
            } finally {
            }
        }
    }

    @Override // b8.a
    public final void b(String str, boolean z10) {
        String str2 = b.f14182d;
        Intent intent = new Intent(this.f14204a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        e(new b.d(this, intent, 0));
    }

    public final void c() {
        if (this.f14210g.getLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        u.w().u(f14203k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f14207d.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f14206c.f22707a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f14213j = null;
    }

    public final void e(Runnable runnable) {
        this.f14210g.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock a10 = k8.l.a(this.f14204a, "ProcessCommand");
        try {
            a10.acquire();
            ((h.c) this.f14208e.f4111d).n(new f(this, 0));
        } finally {
            a10.release();
        }
    }
}
