package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import h.q0;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: a, reason: collision with root package name */
    public l8.j f2529a;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract t a();

    /* JADX WARN: Type inference failed for: r0v0, types: [l8.j, java.lang.Object] */
    @Override // androidx.work.ListenableWorker
    public final op.a startWork() {
        this.f2529a = new Object();
        getBackgroundExecutor().execute(new q0(this, 15));
        return this.f2529a;
    }
}
