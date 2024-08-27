package h;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17716a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f17717b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f17718c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f17719d;

    public n0(o0 o0Var) {
        this.f17718c = o0Var;
    }

    public final void a() {
        synchronized (this.f17716a) {
            try {
                Runnable runnable = (Runnable) this.f17717b.poll();
                this.f17719d = runnable;
                if (runnable != null) {
                    this.f17718c.execute(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f17716a) {
            try {
                this.f17717b.add(new m0(0, this, runnable));
                if (this.f17719d == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
