package androidx.loader.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2029a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f2030b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f2030b;
        switch (this.f2029a) {
            case 0:
                return new Thread(runnable, "ModernAsyncTask #" + atomicInteger.getAndIncrement());
            default:
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(atomicInteger.getAndIncrement())));
        }
    }
}
