package bv;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends n0 {

    /* renamed from: a, reason: collision with root package name */
    public n0 f7390a;

    public t(n0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f7390a = delegate;
    }

    @Override // bv.n0
    public final void awaitSignal(Condition condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f7390a.awaitSignal(condition);
    }

    @Override // bv.n0
    public final n0 clearDeadline() {
        return this.f7390a.clearDeadline();
    }

    @Override // bv.n0
    public final n0 clearTimeout() {
        return this.f7390a.clearTimeout();
    }

    @Override // bv.n0
    public final long deadlineNanoTime() {
        return this.f7390a.deadlineNanoTime();
    }

    @Override // bv.n0
    public final boolean hasDeadline() {
        return this.f7390a.hasDeadline();
    }

    @Override // bv.n0
    public final void throwIfReached() {
        this.f7390a.throwIfReached();
    }

    @Override // bv.n0
    public final n0 timeout(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f7390a.timeout(j10, unit);
    }

    @Override // bv.n0
    public final long timeoutNanos() {
        return this.f7390a.timeoutNanos();
    }

    @Override // bv.n0
    public final void waitUntilNotified(Object monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.f7390a.waitUntilNotified(monitor);
    }

    @Override // bv.n0
    public final n0 deadlineNanoTime(long j10) {
        return this.f7390a.deadlineNanoTime(j10);
    }
}
