package n;

import android.os.Looper;

/* loaded from: classes.dex */
public final class b extends vl.b {

    /* renamed from: h, reason: collision with root package name */
    public static volatile b f28107h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f28108i = new a(1);

    /* renamed from: g, reason: collision with root package name */
    public final e f28109g = new e();

    public static b u0() {
        if (f28107h != null) {
            return f28107h;
        }
        synchronized (b.class) {
            try {
                if (f28107h == null) {
                    f28107h = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f28107h;
    }

    public final void t0(Runnable runnable) {
        this.f28109g.u0(runnable);
    }

    public final boolean v0() {
        this.f28109g.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void w0(Runnable runnable) {
        e eVar = this.f28109g;
        if (eVar.f28113i == null) {
            synchronized (eVar.f28111g) {
                try {
                    if (eVar.f28113i == null) {
                        eVar.f28113i = e.t0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        eVar.f28113i.post(runnable);
    }
}
