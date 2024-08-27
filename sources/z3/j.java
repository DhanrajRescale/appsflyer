package z3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import k8.s;

/* loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42004a;

    /* renamed from: b, reason: collision with root package name */
    public int f42005b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f42006c;

    public j(s sVar) {
        this.f42004a = 1;
        this.f42006c = sVar;
        this.f42005b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f42004a) {
            case 0:
                return new i(runnable, (String) this.f42006c, this.f42005b);
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkTimer-thread-" + this.f42005b);
                this.f42005b = this.f42005b + 1;
                return newThread;
        }
    }

    public j() {
        this.f42004a = 0;
        this.f42006c = "fonts-androidx";
        this.f42005b = 10;
    }
}
