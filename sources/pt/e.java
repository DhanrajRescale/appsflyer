package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e extends at.l {

    /* renamed from: c, reason: collision with root package name */
    public static final c f31347c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f31348d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f31349e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f31350f;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f31351b;

    /* JADX WARN: Type inference failed for: r0v3, types: [pt.r, pt.d] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f31349e = availableProcessors;
        ?? rVar = new r(new t("RxComputationShutdown"));
        f31350f = rVar;
        rVar.a();
        t tVar = new t("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f31348d = tVar;
        c cVar = new c(tVar, 0);
        f31347c = cVar;
        for (d dVar : cVar.f31344b) {
            dVar.a();
        }
    }

    public e() {
        AtomicReference atomicReference;
        c cVar = f31347c;
        this.f31351b = new AtomicReference(cVar);
        c cVar2 = new c(f31348d, f31349e);
        do {
            atomicReference = this.f31351b;
            if (atomicReference.compareAndSet(cVar, cVar2)) {
                return;
            }
        } while (atomicReference.get() == cVar);
        for (d dVar : cVar2.f31344b) {
            dVar.a();
        }
    }

    @Override // at.l
    public final at.k a() {
        return new b(((c) this.f31351b.get()).a());
    }

    @Override // at.l
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        Future schedule;
        d a10 = ((c) this.f31351b.get()).a();
        a10.getClass();
        if (runnable != null) {
            a aVar = new a(runnable);
            ScheduledExecutorService scheduledExecutorService = a10.f31393a;
            try {
                if (j10 <= 0) {
                    schedule = scheduledExecutorService.submit((Callable) aVar);
                } else {
                    schedule = scheduledExecutorService.schedule((Callable) aVar, j10, timeUnit);
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
        d a10 = ((c) this.f31351b.get()).a();
        a10.getClass();
        ft.c cVar = ft.c.f16242a;
        if (j11 <= 0) {
            ScheduledExecutorService scheduledExecutorService = a10.f31393a;
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
            aVar.b(a10.f31393a.scheduleAtFixedRate(aVar, j10, j11, timeUnit));
            return aVar;
        } catch (RejectedExecutionException e11) {
            yk.g.M(e11);
            return cVar;
        }
    }
}
