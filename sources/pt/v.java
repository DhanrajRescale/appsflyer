package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class v extends a implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.f31334c;
        this.f31337b = Thread.currentThread();
        try {
            this.f31336a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f31337b = null;
        }
    }
}
