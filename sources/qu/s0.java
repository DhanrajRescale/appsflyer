package qu;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class s0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Future f32264a;

    public s0(ScheduledFuture scheduledFuture) {
        this.f32264a = scheduledFuture;
    }

    @Override // qu.t0
    public final void a() {
        this.f32264a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f32264a + ']';
    }
}
