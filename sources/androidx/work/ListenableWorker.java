package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import d4.i2;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f2535f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [op.a, l8.j, java.lang.Object] */
    @NonNull
    public op.a getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f2530a;
    }

    @NonNull
    public final k getInputData() {
        return this.mWorkerParams.f2531b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f2533d.f17585d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f2534e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f2532c;
    }

    @NonNull
    public m8.a getTaskExecutor() {
        return this.mWorkerParams.f2536g;
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f2533d.f17583b;
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f2533d.f17584c;
    }

    @NonNull
    public m0 getWorkerFactory() {
        return this.mWorkerParams.f2537h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [op.a, java.lang.Object] */
    @NonNull
    public final op.a setForegroundAsync(@NonNull m mVar) {
        this.mRunInForeground = true;
        n nVar = this.mWorkerParams.f2539j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        k8.o oVar = (k8.o) nVar;
        oVar.getClass();
        ?? obj = new Object();
        ((h.c) oVar.f22698a).n(new i2(oVar, obj, id2, mVar, applicationContext, 1));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [op.a, java.lang.Object] */
    @NonNull
    public op.a setProgressAsync(@NonNull k kVar) {
        e0 e0Var = this.mWorkerParams.f2538i;
        getApplicationContext();
        UUID id2 = getId();
        k8.p pVar = (k8.p) e0Var;
        pVar.getClass();
        ?? obj = new Object();
        ((h.c) pVar.f22703b).n(new l.g(pVar, id2, kVar, obj, 2));
        return obj;
    }

    public void setRunInForeground(boolean z10) {
        this.mRunInForeground = z10;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract op.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
