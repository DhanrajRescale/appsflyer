package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class e extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final Object f28111g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f28112h = Executors.newFixedThreadPool(4, new c());

    /* renamed from: i, reason: collision with root package name */
    public volatile Handler f28113i;

    public static Handler t0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final void u0(Runnable runnable) {
        this.f28112h.execute(runnable);
    }
}
