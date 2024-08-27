package k7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f22358a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22358a.post(runnable);
    }
}
