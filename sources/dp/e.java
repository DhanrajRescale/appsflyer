package dp;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;
import ep.q;
import ll.o;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k f14444a;

    /* renamed from: b, reason: collision with root package name */
    public final c f14445b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14446c;

    public e(k kVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f14444a = kVar;
        this.f14445b = cVar;
        this.f14446c = context;
    }

    public static void c(a aVar, int i10, Activity activity) {
        m a10 = m.a(i10);
        if (activity == null) {
            return;
        }
        o oVar = new o(10, activity);
        if (aVar != null && aVar.a(a10) != null && !aVar.f14434i) {
            aVar.f14434i = true;
            ((Activity) oVar.f24937b).startIntentSenderForResult(aVar.a(a10).getIntentSender(), 121, null, 0, 0, 0, null);
        }
    }

    public final void a() {
        String packageName = this.f14446c.getPackageName();
        k kVar = this.f14444a;
        q qVar = kVar.f14458a;
        if (qVar == null) {
            Object[] objArr = {-9};
            o oVar = k.f14456e;
            oVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", o.l((String) oVar.f24937b, "onError(%d)", objArr));
            }
            Tasks.forException(new InstallException(-9));
            return;
        }
        k.f14456e.k("completeUpdate(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        qVar.a().post(new g(qVar, taskCompletionSource, taskCompletionSource, new g(kVar, taskCompletionSource, taskCompletionSource, packageName, 1), 2));
        taskCompletionSource.getTask();
    }

    public final Task b() {
        String packageName = this.f14446c.getPackageName();
        k kVar = this.f14444a;
        q qVar = kVar.f14458a;
        if (qVar == null) {
            Object[] objArr = {-9};
            o oVar = k.f14456e;
            oVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", o.l((String) oVar.f24937b, "onError(%d)", objArr));
            }
            return Tasks.forException(new InstallException(-9));
        }
        k.f14456e.k("requestUpdateInfo(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        qVar.a().post(new g(qVar, taskCompletionSource, taskCompletionSource, new g(kVar, taskCompletionSource, packageName, taskCompletionSource), 2));
        return taskCompletionSource.getTask();
    }
}
