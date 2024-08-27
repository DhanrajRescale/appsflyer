package qu;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f32195d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f32196e;

    public d(CoroutineContext coroutineContext, Thread thread, b1 b1Var) {
        super(coroutineContext, true);
        this.f32195d = thread;
        this.f32196e = b1Var;
    }

    @Override // qu.x1
    public final void s(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f32195d;
        if (!Intrinsics.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
