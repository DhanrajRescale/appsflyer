package androidx.work;

import c2.e1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import qu.q1;

/* loaded from: classes.dex */
public final class p implements op.a {

    /* renamed from: a, reason: collision with root package name */
    public final l8.j f2633a;

    /* JADX WARN: Type inference failed for: r0v0, types: [l8.j, java.lang.Object] */
    public p(q1 job) {
        ?? underlying = new Object();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f2633a = underlying;
        job.I(new e1(this, 17));
    }

    @Override // op.a
    public final void a(Runnable runnable, Executor executor) {
        this.f2633a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f2633a.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f2633a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2633a.f24227a instanceof l8.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2633a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f2633a.get(j10, timeUnit);
    }
}
