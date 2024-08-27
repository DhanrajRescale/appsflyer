package androidx.loader.content;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadPoolExecutor f2019i;

    /* renamed from: j, reason: collision with root package name */
    public static j f2020j;

    /* renamed from: a, reason: collision with root package name */
    public final g f2021a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2022b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2023c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2024d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2025e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f2026f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2027g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f2028h;

    static {
        f fVar = new f();
        f2019i = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), fVar);
    }

    public a(b bVar) {
        this.f2028h = bVar;
        g gVar = new g(this);
        this.f2021a = gVar;
        this.f2022b = new h(this, gVar, 0);
        this.f2026f = new CountDownLatch(1);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.loader.content.j, android.os.Handler] */
    public final void a(Object obj) {
        j jVar;
        synchronized (a.class) {
            try {
                if (f2020j == null) {
                    f2020j = new Handler(Looper.getMainLooper());
                }
                jVar = f2020j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jVar.obtainMessage(1, new i(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2027g = false;
        this.f2028h.executePendingTask();
    }
}
