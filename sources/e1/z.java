package e1;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final t0.g f14950a = new AtomicInteger(0);

    public final boolean d(int i10) {
        if ((i10 & this.f14950a.get()) != 0) {
            return true;
        }
        return false;
    }

    public final void f(int i10) {
        t0.g gVar;
        int i11;
        do {
            gVar = this.f14950a;
            i11 = gVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!gVar.compareAndSet(i11, i11 | i10));
    }
}
