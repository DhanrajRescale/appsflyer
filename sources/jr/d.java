package jr;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f21585d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final n.a f21586e = new n.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f21587a;

    /* renamed from: b, reason: collision with root package name */
    public final o f21588b;

    /* renamed from: c, reason: collision with root package name */
    public Task f21589c = null;

    public d(ScheduledExecutorService scheduledExecutorService, o oVar) {
        this.f21587a = scheduledExecutorService;
        this.f21588b = oVar;
    }

    public static Object a(Task task, TimeUnit timeUnit) {
        ll.o oVar = new ll.o();
        Executor executor = f21586e;
        task.addOnSuccessListener(executor, oVar);
        task.addOnFailureListener(executor, oVar);
        task.addOnCanceledListener(executor, oVar);
        if (((CountDownLatch) oVar.f24937b).await(5L, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public final synchronized Task b() {
        try {
            Task task = this.f21589c;
            if (task != null) {
                if (task.isComplete() && !this.f21589c.isSuccessful()) {
                }
            }
            Executor executor = this.f21587a;
            o oVar = this.f21588b;
            Objects.requireNonNull(oVar);
            this.f21589c = Tasks.call(executor, new j9.m(oVar, 5));
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f21589c;
    }

    public final Task c(e eVar) {
        j9.f fVar = new j9.f(6, this, eVar);
        Executor executor = this.f21587a;
        return Tasks.call(executor, fVar).onSuccessTask(executor, new u5.d((Object) this, true, (Object) eVar));
    }
}
