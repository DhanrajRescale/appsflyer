package xu;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import qu.b0;
import qu.e1;

/* loaded from: classes2.dex */
public final class d extends e1 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f40584c = new b0();

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f40585d;

    /* JADX WARN: Type inference failed for: r0v0, types: [qu.b0, xu.d] */
    static {
        l lVar = l.f40600c;
        int i10 = vu.b0.f38357a;
        if (64 >= i10) {
            i10 = 64;
        }
        f40585d = lVar.e0(el.l.P0("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12));
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        f40585d.b0(coroutineContext, runnable);
    }

    @Override // qu.b0
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        f40585d.c0(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // qu.b0
    public final b0 e0(int i10) {
        return l.f40600c.e0(1);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b0(kotlin.coroutines.k.f23369a, runnable);
    }

    @Override // qu.b0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
