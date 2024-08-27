package l7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f24200a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f24201b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public Runnable f24202c;

    public y(Executor executor) {
        this.f24200a = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) this.f24201b.poll();
        this.f24202c = runnable;
        if (runnable != null) {
            this.f24200a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f24201b.offer(new m.j(7, this, runnable));
        if (this.f24202c == null) {
            a();
        }
    }
}
