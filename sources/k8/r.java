package k8;

import androidx.work.u;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final s f22704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22705b;

    public r(s sVar, String str) {
        this.f22704a = sVar;
        this.f22705b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22704a.f22710d) {
            try {
                if (((r) this.f22704a.f22708b.remove(this.f22705b)) != null) {
                    q qVar = (q) this.f22704a.f22709c.remove(this.f22705b);
                    if (qVar != null) {
                        u.w().u(d8.e.f14191j, String.format("Exceeded time limits on execution for %s", this.f22705b), new Throwable[0]);
                        ((d8.e) qVar).f();
                    }
                } else {
                    u.w().u("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f22705b), new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
