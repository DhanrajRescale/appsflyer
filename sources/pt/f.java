package pt;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f implements Future {

    /* renamed from: a, reason: collision with root package name */
    public final ct.b f31352a;

    public f(ct.b bVar) {
        this.f31352a = bVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.f31352a.a();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return null;
    }
}
