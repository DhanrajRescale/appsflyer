package y3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41142a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f41143b;

    public i(int i10) {
        this.f41142a = i10;
        if (i10 != 2) {
            this.f41143b = new Handler(Looper.getMainLooper());
        } else {
            this.f41143b = new Handler(Looper.getMainLooper());
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f41142a;
        Handler handler = this.f41143b;
        switch (i10) {
            case 0:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }

    public i(Handler handler) {
        this.f41142a = 0;
        this.f41143b = handler;
    }
}
