package gt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pt.x;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17566a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17566a) {
            case 0:
                return;
            default:
                Iterator it = new ArrayList(x.f31407d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        x.f31407d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f17566a) {
            case 0:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
