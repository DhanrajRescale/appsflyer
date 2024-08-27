package vu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import qu.f2;

/* loaded from: classes2.dex */
public abstract class z extends e implements f2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38411d = AtomicIntegerFieldUpdater.newUpdater(z.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f38412c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public z(long j10, z zVar, int i10) {
        super(zVar);
        this.f38412c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // vu.e
    public final boolean c() {
        if (f38411d.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f38411d.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i10, CoroutineContext coroutineContext);

    public final void h() {
        if (f38411d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f38411d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
