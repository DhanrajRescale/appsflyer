package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2540a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2541b;

    public a(boolean z10) {
        this.f2541b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f2541b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder p10 = da.e.p(str);
        p10.append(this.f2540a.incrementAndGet());
        return new Thread(runnable, p10.toString());
    }
}
