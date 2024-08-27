package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class y extends at.k {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f31408a;

    /* renamed from: b, reason: collision with root package name */
    public final ct.a f31409b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f31410c;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ct.a] */
    public y(ScheduledExecutorService scheduledExecutorService) {
        this.f31408a = scheduledExecutorService;
    }

    @Override // ct.b
    public final void a() {
        if (!this.f31410c) {
            this.f31410c = true;
            this.f31409b.a();
        }
    }

    @Override // at.k
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        Future schedule;
        boolean z10 = this.f31410c;
        ft.c cVar = ft.c.f16242a;
        if (z10) {
            return cVar;
        }
        if (runnable != null) {
            w wVar = new w(runnable, this.f31409b);
            this.f31409b.c(wVar);
            try {
                if (j10 <= 0) {
                    schedule = this.f31408a.submit((Callable) wVar);
                } else {
                    schedule = this.f31408a.schedule((Callable) wVar, j10, timeUnit);
                }
                wVar.b(schedule);
                return wVar;
            } catch (RejectedExecutionException e10) {
                a();
                yk.g.M(e10);
                return cVar;
            }
        }
        throw new NullPointerException("run is null");
    }
}
