package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class j extends at.k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31359a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f31360b;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f31362d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f31363e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public final ct.a f31364f = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final wn.e f31361c = new wn.e(19);

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ct.a] */
    public j(Executor executor, boolean z10) {
        this.f31360b = executor;
        this.f31359a = z10;
    }

    @Override // ct.b
    public final void a() {
        if (!this.f31362d) {
            this.f31362d = true;
            this.f31364f.a();
            if (this.f31363e.getAndIncrement() == 0) {
                this.f31361c.clear();
            }
        }
    }

    @Override // at.k
    public final ct.b b(Runnable runnable) {
        ct.b hVar;
        boolean z10 = this.f31362d;
        ft.c cVar = ft.c.f16242a;
        if (z10) {
            return cVar;
        }
        if (runnable != null) {
            if (this.f31359a) {
                hVar = new i(runnable, this.f31364f);
                this.f31364f.c(hVar);
            } else {
                hVar = new h(runnable);
            }
            this.f31361c.offer(hVar);
            if (this.f31363e.getAndIncrement() == 0) {
                try {
                    this.f31360b.execute(this);
                } catch (RejectedExecutionException e10) {
                    this.f31362d = true;
                    this.f31361c.clear();
                    yk.g.M(e10);
                    return cVar;
                }
            }
            return hVar;
        }
        throw new NullPointerException("run is null");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ft.e, java.util.concurrent.atomic.AtomicReference] */
    @Override // at.k
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (j10 <= 0) {
            return b(runnable);
        }
        boolean z10 = this.f31362d;
        ft.c cVar = ft.c.f16242a;
        if (z10) {
            return cVar;
        }
        ?? atomicReference = new AtomicReference();
        ft.e eVar = new ft.e(atomicReference);
        if (runnable != null) {
            w wVar = new w(new z3.a(10, this, eVar, runnable), this.f31364f);
            this.f31364f.c(wVar);
            Executor executor = this.f31360b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    wVar.b(((ScheduledExecutorService) executor).schedule((Callable) wVar, j10, timeUnit));
                } catch (RejectedExecutionException e10) {
                    this.f31362d = true;
                    yk.g.M(e10);
                    return cVar;
                }
            } else {
                wVar.b(new f(k.f31365c.c(wVar, j10, timeUnit)));
            }
            ft.b.d(atomicReference, wVar);
            return eVar;
        }
        throw new NullPointerException("run is null");
    }

    @Override // java.lang.Runnable
    public final void run() {
        wn.e eVar = this.f31361c;
        int i10 = 1;
        while (!this.f31362d) {
            do {
                Runnable runnable = (Runnable) eVar.i();
                if (runnable == null) {
                    if (this.f31362d) {
                        eVar.clear();
                        return;
                    } else {
                        i10 = this.f31363e.addAndGet(-i10);
                        if (i10 == 0) {
                            return;
                        }
                    }
                } else {
                    runnable.run();
                }
            } while (!this.f31362d);
            eVar.clear();
            return;
        }
        eVar.clear();
    }
}
