package k8;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f22679b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f22681d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f22678a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f22680c = new Object();

    public j(ExecutorService executorService) {
        this.f22679b = executorService;
    }

    public final void a() {
        synchronized (this.f22680c) {
            try {
                Runnable runnable = (Runnable) this.f22678a.poll();
                this.f22681d = runnable;
                if (runnable != null) {
                    this.f22679b.execute(this.f22681d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f22680c) {
            try {
                this.f22678a.add(new m.j(this, runnable, 12));
                if (this.f22681d == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
