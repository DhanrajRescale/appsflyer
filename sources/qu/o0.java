package qu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class o0 extends vu.y {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32246e = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // vu.y, qu.x1
    public final void s(Object obj) {
        t(obj);
    }

    @Override // vu.y, qu.x1
    public final void t(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f32246e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    vu.i.a(zt.f.b(this.f38410d), v.a(obj), null);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
