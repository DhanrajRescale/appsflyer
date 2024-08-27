package pt;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class p extends at.l {

    /* renamed from: c, reason: collision with root package name */
    public static final t f31384c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f31385d;

    /* renamed from: g, reason: collision with root package name */
    public static final o f31388g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f31389h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f31390b;

    /* renamed from: f, reason: collision with root package name */
    public static final TimeUnit f31387f = TimeUnit.SECONDS;

    /* renamed from: e, reason: collision with root package name */
    public static final long f31386e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        o oVar = new o(new t("RxCachedThreadSchedulerShutdown"));
        f31388g = oVar;
        oVar.a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        t tVar = new t("RxCachedThreadScheduler", max, false);
        f31384c = tVar;
        f31385d = new t("RxCachedWorkerPoolEvictor", max, false);
        m mVar = new m(0L, null, tVar);
        f31389h = mVar;
        mVar.f31375c.a();
        ScheduledFuture scheduledFuture = mVar.f31377e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = mVar.f31376d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public p() {
        AtomicReference atomicReference;
        m mVar = f31389h;
        this.f31390b = new AtomicReference(mVar);
        m mVar2 = new m(f31386e, f31387f, f31384c);
        do {
            atomicReference = this.f31390b;
            if (atomicReference.compareAndSet(mVar, mVar2)) {
                return;
            }
        } while (atomicReference.get() == mVar);
        mVar2.f31375c.a();
        ScheduledFuture scheduledFuture = mVar2.f31377e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = mVar2.f31376d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // at.l
    public final at.k a() {
        return new n((m) this.f31390b.get());
    }
}
