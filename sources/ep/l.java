package ep;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f15792a;

    public l() {
        this.f15792a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f15792a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }

    public l(TaskCompletionSource taskCompletionSource) {
        this.f15792a = taskCompletionSource;
    }
}
