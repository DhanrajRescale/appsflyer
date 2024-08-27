package pt;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class t extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a, reason: collision with root package name */
    public final String f31396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31397b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31398c;

    public t(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f31396a + '-' + incrementAndGet();
        if (this.f31398c) {
            thread = new s(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f31397b);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return nn.d.o(new StringBuilder("RxThreadFactory["), this.f31396a, "]");
    }

    public t(String str, int i10, boolean z10) {
        this.f31396a = str;
        this.f31397b = i10;
        this.f31398c = z10;
    }
}
