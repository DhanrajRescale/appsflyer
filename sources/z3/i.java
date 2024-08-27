package z3;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f42003a;

    public i(Runnable runnable, String str, int i10) {
        super(runnable, str);
        this.f42003a = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f42003a);
        super.run();
    }
}
