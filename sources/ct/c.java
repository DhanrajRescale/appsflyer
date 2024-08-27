package ct;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class c extends AtomicReference implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    @Override // ct.b
    public final void a() {
        Object andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            ((Runnable) andSet).run();
        }
    }

    public final boolean b() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
