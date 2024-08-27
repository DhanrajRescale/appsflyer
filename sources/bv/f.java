package bv;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class f extends n0 {

    @NotNull
    private static final c Companion = new Object();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @NotNull
    private static final Condition condition;
    private static f head;

    @NotNull
    private static final ReentrantLock lock;
    private f next;
    private int state;
    private long timeoutAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [bv.c, java.lang.Object] */
    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final /* synthetic */ c access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ f access$getHead$cp() {
        return head;
    }

    public static final /* synthetic */ ReentrantLock access$getLock$cp() {
        return lock;
    }

    public static final long access$remainingNanos(f fVar, long j10) {
        return fVar.timeoutAt - j10;
    }

    public static final /* synthetic */ void access$setHead$cp(f fVar) {
        head = fVar;
    }

    @NotNull
    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // bv.n0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                c.b(Companion, this);
                this.state = 3;
            }
            Unit unit = Unit.f23355a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 0) {
                this.state = 1;
                c.a(Companion, this, timeoutNanos, hasDeadline);
                Unit unit = Unit.f23355a;
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            boolean z10 = false;
            this.state = 0;
            if (i10 == 1) {
                c.b(Companion, this);
                return false;
            }
            if (i10 == 2) {
                z10 = true;
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final i0 sink(@NotNull i0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new d(this, sink);
    }

    @NotNull
    public final k0 source(@NotNull k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new e(this, source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            T t10 = (T) block.mo2invoke();
            if (!exit()) {
                return t10;
            }
            throw access$newTimeoutException(null);
        } catch (IOException e10) {
            if (!exit()) {
                throw e10;
            }
            throw access$newTimeoutException(e10);
        } finally {
            exit();
        }
    }
}
