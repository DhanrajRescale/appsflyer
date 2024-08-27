package qu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class m2 implements l1 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32239c = AtomicIntegerFieldUpdater.newUpdater(m2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Thread f32240a = Thread.currentThread();

    /* renamed from: b, reason: collision with root package name */
    public t0 f32241b;

    public m2(o1 o1Var) {
    }

    public static void b(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32239c;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                t0 t0Var = this.f32241b;
                if (t0Var != null) {
                    t0Var.a();
                    return;
                }
                return;
            }
        }
    }

    @Override // qu.l1
    public final void e(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f32239c;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    b(i10);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f32240a.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }
}
