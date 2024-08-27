package at;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class k implements ct.b {
    public ct.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract ct.b c(Runnable runnable, long j10, TimeUnit timeUnit);

    /* JADX WARN: Type inference failed for: r3v0, types: [ft.e, java.util.concurrent.atomic.AtomicReference] */
    public final ct.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        ?? atomicReference = new AtomicReference();
        ft.e eVar = new ft.e(atomicReference);
        long nanos = timeUnit.toNanos(j11);
        long convert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        ct.b c10 = c(new j(this, timeUnit.toNanos(j10) + convert, runnable, convert, eVar, nanos), j10, timeUnit);
        if (c10 == ft.c.f16242a) {
            return c10;
        }
        ft.b.d(atomicReference, c10);
        return eVar;
    }
}
