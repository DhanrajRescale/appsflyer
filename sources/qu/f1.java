package qu;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class f1 extends e1 implements n0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f32204c;

    public f1(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f32204c = executor;
        Method method2 = vu.c.f38358a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = vu.c.f38358a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // qu.n0
    public final t0 H(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f32204c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                o1 o1Var = (o1) coroutineContext.g(c0.f32192b);
                if (o1Var != null) {
                    o1Var.a(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new s0(scheduledFuture);
        }
        return j0.f32226j.H(j10, runnable, coroutineContext);
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f32204c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            o1 o1Var = (o1) coroutineContext.g(c0.f32192b);
            if (o1Var != null) {
                o1Var.a(cancellationException);
            }
            r0.f32256b.b0(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f32204c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof f1) && ((f1) obj).f32204c == this.f32204c) {
            return true;
        }
        return false;
    }

    @Override // qu.n0
    public final void f(long j10, i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f32204c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new m.j(this, iVar, 25), j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                o1 o1Var = (o1) iVar.f32216e.g(c0.f32192b);
                if (o1Var != null) {
                    o1Var.a(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            yk.g.G(iVar, new f(scheduledFuture, 0));
        } else {
            j0.f32226j.f(j10, iVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f32204c);
    }

    @Override // qu.b0
    public final String toString() {
        return this.f32204c.toString();
    }
}
