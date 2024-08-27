package pt;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class i extends AtomicInteger implements Runnable, ct.b {
    private static final long serialVersionUID = -3603436687413320876L;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f31356a;

    /* renamed from: b, reason: collision with root package name */
    public final ft.a f31357b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Thread f31358c;

    public i(Runnable runnable, ct.a aVar) {
        this.f31356a = runnable;
        this.f31357b = aVar;
    }

    @Override // ct.b
    public final void a() {
        while (true) {
            int i10 = get();
            if (i10 < 2) {
                if (i10 == 0) {
                    if (compareAndSet(0, 4)) {
                        ft.a aVar = this.f31357b;
                        if (aVar != null) {
                            aVar.d(this);
                            return;
                        }
                        return;
                    }
                } else if (compareAndSet(1, 3)) {
                    Thread thread = this.f31358c;
                    if (thread != null) {
                        thread.interrupt();
                        this.f31358c = null;
                    }
                    set(4);
                    ft.a aVar2 = this.f31357b;
                    if (aVar2 != null) {
                        aVar2.d(this);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0) {
            this.f31358c = Thread.currentThread();
            if (compareAndSet(0, 1)) {
                try {
                    this.f31356a.run();
                    this.f31358c = null;
                    if (compareAndSet(1, 2)) {
                        ft.a aVar = this.f31357b;
                        if (aVar != null) {
                            aVar.d(this);
                            return;
                        }
                        return;
                    }
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                    return;
                } catch (Throwable th2) {
                    this.f31358c = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        ft.a aVar2 = this.f31357b;
                        if (aVar2 != null) {
                            aVar2.d(this);
                        }
                    }
                    throw th2;
                }
            }
            this.f31358c = null;
        }
    }
}
