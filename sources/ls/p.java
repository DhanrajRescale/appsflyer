package ls;

import android.os.Process;
import java.lang.Thread;

/* loaded from: classes2.dex */
public final class p implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static p f25278b;

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f25279a = Thread.getDefaultUncaughtExceptionHandler();

    public p() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void a() {
        if (f25278b == null) {
            synchronized (p.class) {
                try {
                    if (f25278b == null) {
                        f25278b = new p();
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        n0.c(new wn.e(13, this, th2));
        n0.c(new r0(this, 1));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f25279a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            return;
        }
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
