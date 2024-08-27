package x;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f39763a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final yu.d f39764b = yu.e.a();

    public static final void a(w1 w1Var, t1 t1Var) {
        while (true) {
            AtomicReference atomicReference = w1Var.f39763a;
            t1 t1Var2 = (t1) atomicReference.get();
            if (t1Var2 != null && t1Var.f39721a.compareTo(t1Var2.f39721a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(t1Var2, t1Var)) {
                if (atomicReference.get() != t1Var2) {
                    break;
                }
            }
            if (t1Var2 != null) {
                t1Var2.f39722b.a(new w.z0(1, 0));
                return;
            }
            return;
        }
    }

    public static Object b(w1 w1Var, Function1 function1, yt.a aVar) {
        s1 s1Var = s1.f39717a;
        w1Var.getClass();
        return hl.f.P(new u1(s1Var, w1Var, function1, null), aVar);
    }
}
