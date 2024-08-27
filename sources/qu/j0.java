package qu;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class j0 extends a1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final j0 f32226j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f32227k;

    /* JADX WARN: Type inference failed for: r0v0, types: [qu.a1, qu.b1, qu.j0] */
    static {
        Long l10;
        ?? a1Var = new a1();
        f32226j = a1Var;
        a1Var.i0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f32227k = timeUnit.toNanos(l10.longValue());
    }

    @Override // qu.a1, qu.n0
    public final t0 H(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        kp.g gVar = c1.f32193a;
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            x0 x0Var = new x0(runnable, j11 + nanoTime);
            q0(nanoTime, x0Var);
            return x0Var;
        }
        return e2.f32201a;
    }

    @Override // qu.b1
    public final Thread h0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(j0.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // qu.b1
    public final void m0(long j10, y0 y0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // qu.a1
    public final void n0(Runnable runnable) {
        if (debugStatus != 4) {
            super.n0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void r0() {
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            return;
        }
        debugStatus = 3;
        a1.f32178g.set(this, null);
        a1.f32179h.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p02;
        k2.f32232a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j10 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long k02 = k0();
                        if (k02 == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j10 == Long.MAX_VALUE) {
                                j10 = f32227k + nanoTime;
                            }
                            long j11 = j10 - nanoTime;
                            if (j11 <= 0) {
                                _thread = null;
                                r0();
                                if (!p0()) {
                                    h0();
                                    return;
                                }
                                return;
                            }
                            if (k02 > j11) {
                                k02 = j11;
                            }
                        } else {
                            j10 = Long.MAX_VALUE;
                        }
                        if (k02 > 0) {
                            int i11 = debugStatus;
                            if (i11 == 2 || i11 == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, k02);
                            }
                        }
                    }
                    if (!p02) {
                        return;
                    } else {
                        return;
                    }
                }
                _thread = null;
                r0();
                if (!p0()) {
                    h0();
                }
            }
        } finally {
            _thread = null;
            r0();
            if (!p0()) {
                h0();
            }
        }
    }

    @Override // qu.a1, qu.b1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
