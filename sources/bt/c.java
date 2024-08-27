package bt;

import at.l;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7311a;

    static {
        try {
            l lVar = (l) new a(0).call();
            if (lVar != null) {
                f7311a = lVar;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw rt.b.b(th2);
        }
    }
}
