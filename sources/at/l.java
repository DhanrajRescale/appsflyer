package at;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2794a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract k a();

    public ct.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        k a10 = a();
        if (runnable != null) {
            h hVar = new h(runnable, a10);
            a10.c(hVar, j10, timeUnit);
            return hVar;
        }
        throw new NullPointerException("run is null");
    }

    public ct.b d(mt.i iVar, long j10, long j11, TimeUnit timeUnit) {
        k a10 = a();
        i iVar2 = new i(iVar, a10);
        ct.b d10 = a10.d(iVar2, j10, j11, timeUnit);
        if (d10 == ft.c.f16242a) {
            return d10;
        }
        return iVar2;
    }
}
