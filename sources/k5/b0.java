package k5;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22044b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f22043a = i10;
        this.f22044b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        int i10 = this.f22043a;
        Object obj = this.f22044b;
        switch (i10) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            case 1:
                ((Handler) obj).post(runnable);
                return;
            default:
                ((Choreographer) obj).postFrameCallback(new Choreographer.FrameCallback() { // from class: p2.h0
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j10) {
                        runnable.run();
                    }
                });
                return;
        }
    }
}
