package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class z extends at.l {

    /* renamed from: c, reason: collision with root package name */
    public static final t f31411c;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f31412b;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f31411c = new t("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public z() {
        AtomicReference atomicReference = new AtomicReference();
        this.f31412b = atomicReference;
        boolean z10 = x.f31404a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, f31411c);
        if (x.f31404a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            x.f31407d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // at.l
    public final at.k a() {
        return new y((ScheduledExecutorService) this.f31412b.get());
    }

    @Override // at.l
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        Future schedule;
        if (runnable != null) {
            a aVar = new a(runnable);
            AtomicReference atomicReference = this.f31412b;
            try {
                if (j10 <= 0) {
                    schedule = ((ScheduledExecutorService) atomicReference.get()).submit((Callable) aVar);
                } else {
                    schedule = ((ScheduledExecutorService) atomicReference.get()).schedule((Callable) aVar, j10, timeUnit);
                }
                aVar.b(schedule);
                return aVar;
            } catch (RejectedExecutionException e10) {
                yk.g.M(e10);
                return ft.c.f16242a;
            }
        }
        throw new NullPointerException("run is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [pt.a, ct.b, java.lang.Runnable] */
    @Override // at.l
    public final ct.b d(mt.i iVar, long j10, long j11, TimeUnit timeUnit) {
        Future schedule;
        ft.c cVar = ft.c.f16242a;
        AtomicReference atomicReference = this.f31412b;
        if (j11 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            l lVar = new l(iVar, scheduledExecutorService);
            try {
                if (j10 <= 0) {
                    schedule = scheduledExecutorService.submit(lVar);
                } else {
                    schedule = scheduledExecutorService.schedule(lVar, j10, timeUnit);
                }
                lVar.b(schedule);
                return lVar;
            } catch (RejectedExecutionException e10) {
                yk.g.M(e10);
                return cVar;
            }
        }
        ?? aVar = new a(iVar);
        try {
            aVar.b(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(aVar, j10, j11, timeUnit));
            return aVar;
        } catch (RejectedExecutionException e11) {
            yk.g.M(e11);
            return cVar;
        }
    }
}
