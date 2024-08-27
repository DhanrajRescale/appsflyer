package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class k extends at.l {

    /* renamed from: c, reason: collision with root package name */
    public static final at.l f31365c = st.e.f34773a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f31366b;

    public k(Executor executor) {
        this.f31366b = executor;
    }

    @Override // at.l
    public final at.k a() {
        return new j(this.f31366b, false);
    }

    @Override // at.l
    public final ct.b b(Runnable runnable) {
        Executor executor = this.f31366b;
        if (runnable != null) {
            try {
                if (executor instanceof ExecutorService) {
                    a aVar = new a(runnable);
                    aVar.b(((ExecutorService) executor).submit((Callable) aVar));
                    return aVar;
                }
                h hVar = new h(runnable);
                executor.execute(hVar);
                return hVar;
            } catch (RejectedExecutionException e10) {
                yk.g.M(e10);
                return ft.c.f16242a;
            }
        }
        throw new NullPointerException("run is null");
    }

    @Override // at.l
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable != null) {
            Executor executor = this.f31366b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    a aVar = new a(runnable);
                    aVar.b(((ScheduledExecutorService) executor).schedule((Callable) aVar, j10, timeUnit));
                    return aVar;
                } catch (RejectedExecutionException e10) {
                    yk.g.M(e10);
                    return ft.c.f16242a;
                }
            }
            g gVar = new g(runnable);
            ct.b c10 = f31365c.c(new m.j(23, this, gVar), j10, timeUnit);
            ft.e eVar = gVar.f31353a;
            eVar.getClass();
            ft.b.d(eVar, c10);
            return gVar;
        }
        throw new NullPointerException("run is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [pt.a, ct.b, java.lang.Runnable] */
    @Override // at.l
    public final ct.b d(mt.i iVar, long j10, long j11, TimeUnit timeUnit) {
        Executor executor = this.f31366b;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ?? aVar = new a(iVar);
                aVar.b(((ScheduledExecutorService) executor).scheduleAtFixedRate(aVar, j10, j11, timeUnit));
                return aVar;
            } catch (RejectedExecutionException e10) {
                yk.g.M(e10);
                return ft.c.f16242a;
            }
        }
        return super.d(iVar, j10, j11, timeUnit);
    }
}
