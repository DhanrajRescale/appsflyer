package dr;

import fr.i;
import fr.j;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final yq.a f14487f = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f14488a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f14489b;

    /* renamed from: c, reason: collision with root package name */
    public final Runtime f14490c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f14491d;

    /* renamed from: e, reason: collision with root package name */
    public long f14492e;

    public f() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f14491d = null;
        this.f14492e = -1L;
        this.f14488a = newSingleThreadScheduledExecutor;
        this.f14489b = new ConcurrentLinkedQueue();
        this.f14490c = runtime;
    }

    public final synchronized void a(long j10, i iVar) {
        this.f14492e = j10;
        try {
            this.f14491d = this.f14488a.scheduleAtFixedRate(new e(this, iVar, 0), 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f14487f.f("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    public final gr.d b(i iVar) {
        if (iVar == null) {
            return null;
        }
        long a10 = iVar.a() + iVar.f16224a;
        gr.c x10 = gr.d.x();
        x10.i();
        gr.d.v((gr.d) x10.f11975b, a10);
        Runtime runtime = this.f14490c;
        int b10 = j.b((da.e.e(5) * (runtime.totalMemory() - runtime.freeMemory())) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        x10.i();
        gr.d.w((gr.d) x10.f11975b, b10);
        return (gr.d) x10.g();
    }
}
