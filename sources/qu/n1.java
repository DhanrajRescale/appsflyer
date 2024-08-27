package qu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class n1 extends p1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32243f = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final l1 f32244e;

    public n1(l1 l1Var) {
        this.f32244e = l1Var;
    }

    @Override // qu.l1
    public final void e(Throwable th2) {
        if (f32243f.compareAndSet(this, 0, 1)) {
            this.f32244e.e(th2);
        }
    }
}
