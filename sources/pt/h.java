package pt;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class h extends AtomicBoolean implements Runnable, ct.b {
    private static final long serialVersionUID = -2421395018820541164L;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f31355a;

    public h(Runnable runnable) {
        this.f31355a = runnable;
    }

    @Override // ct.b
    public final void a() {
        lazySet(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.f31355a.run();
        } finally {
            lazySet(true);
        }
    }
}
