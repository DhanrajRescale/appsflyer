package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import h.o0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class RxWorker extends ListenableWorker {
    static final Executor INSTANT_EXECUTOR = new o0(1);
    private f0 mSingleFutureObserverAdapter;

    public RxWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract at.m createWork();

    @NonNull
    public at.l getBackgroundScheduler() {
        Executor backgroundExecutor = getBackgroundExecutor();
        at.l lVar = st.e.f34773a;
        return new pt.k(backgroundExecutor);
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        f0 f0Var = this.mSingleFutureObserverAdapter;
        if (f0Var != null) {
            ct.b bVar = f0Var.f2563b;
            if (bVar != null) {
                bVar.a();
            }
            this.mSingleFutureObserverAdapter = null;
        }
    }

    @NonNull
    public final at.a setCompletableProgress(@NonNull k kVar) {
        op.a progressAsync = setProgressAsync(kVar);
        if (progressAsync != null) {
            return new kt.d(new ek.h0(progressAsync, 24), 0);
        }
        throw new NullPointerException("future is null");
    }

    @NonNull
    @Deprecated
    public final at.m<Void> setProgress(@NonNull k kVar) {
        op.a progressAsync = setProgressAsync(kVar);
        int i10 = at.c.f2779a;
        if (progressAsync != null) {
            return new lt.i(0, new lt.b(progressAsync), null);
        }
        throw new NullPointerException("future is null");
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public op.a startWork() {
        this.mSingleFutureObserverAdapter = new f0();
        nt.h c10 = createWork().c(getBackgroundScheduler());
        k8.j jVar = (k8.j) ((h.c) getTaskExecutor()).f17583b;
        at.l lVar = st.e.f34773a;
        new nt.h(c10, new pt.k(jVar), 0).a(this.mSingleFutureObserverAdapter);
        return this.mSingleFutureObserverAdapter.f2562a;
    }
}
