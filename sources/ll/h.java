package ll;

import in.juspay.hyper.constants.LogSubCategory;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f24911c = new h();

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f24912a;

    /* renamed from: b, reason: collision with root package name */
    public final g f24913b;

    public h() {
        ExecutorService executorService;
        String property = System.getProperty("java.runtime.name");
        if (property != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = property.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (w.s(lowerCase, LogSubCategory.LifeCycle.ANDROID, false)) {
                b bVar = b.f24901b;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b.f24902c, b.f24903d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                executorService = threadPoolExecutor;
                this.f24912a = executorService;
                Intrinsics.checkNotNullExpressionValue(Executors.newSingleThreadScheduledExecutor(), "newSingleThreadScheduledExecutor()");
                this.f24913b = new g();
            }
        }
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool()");
        executorService = newCachedThreadPool;
        this.f24912a = executorService;
        Intrinsics.checkNotNullExpressionValue(Executors.newSingleThreadScheduledExecutor(), "newSingleThreadScheduledExecutor()");
        this.f24913b = new g();
    }
}
