package ls;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public Handler f25214b;

    /* renamed from: f, reason: collision with root package name */
    public b1 f25218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f25219g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f25213a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f25215c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f25216d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f25217e = -1;

    public h(i iVar) {
        this.f25219g = iVar;
        HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
        handlerThread.start();
        this.f25214b = new g(this, handlerThread.getLooper());
    }

    public static void a(h hVar) {
        hVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = hVar.f25215c;
        long j11 = 1 + j10;
        long j12 = hVar.f25217e;
        if (j12 > 0) {
            long j13 = ((hVar.f25216d * j10) + (currentTimeMillis - j12)) / j11;
            hVar.f25216d = j13;
            i.a(hVar.f25219g, "Average send frequency approximately " + (j13 / 1000) + " seconds.");
        }
        hVar.f25217e = currentTimeMillis;
        hVar.f25215c = j11;
    }

    public final void b(Message message) {
        synchronized (this.f25213a) {
            try {
                Handler handler = this.f25214b;
                if (handler == null) {
                    i.a(this.f25219g, "Dead mixpanel worker dropping a message: " + message.what);
                } else {
                    handler.sendMessage(message);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
