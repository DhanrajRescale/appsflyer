package hp;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f18643a;

    public l() {
        this.f18643a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f18643a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f18643a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public l(TaskCompletionSource taskCompletionSource) {
        this.f18643a = taskCompletionSource;
    }
}
