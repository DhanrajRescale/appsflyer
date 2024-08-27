package androidx.loader.content;

import android.util.Log;
import j9.c0;
import j9.d0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class h extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2035b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Callable callable, int i10) {
        super(callable);
        this.f2034a = i10;
        this.f2035b = obj;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        int i10 = this.f2034a;
        Object obj = this.f2035b;
        switch (i10) {
            case 0:
                try {
                    Object obj2 = get();
                    a aVar = (a) obj;
                    if (!aVar.f2025e.get()) {
                        aVar.a(obj2);
                        return;
                    }
                    return;
                } catch (InterruptedException e10) {
                    Log.w("AsyncTask", e10);
                    return;
                } catch (CancellationException unused) {
                    a aVar2 = (a) obj;
                    if (!aVar2.f2025e.get()) {
                        aVar2.a(null);
                        return;
                    }
                    return;
                } catch (ExecutionException e11) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
                } catch (Throwable th2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th2);
                }
            default:
                if (!isCancelled()) {
                    try {
                        c0 c0Var = (c0) get();
                        ExecutorService executorService = d0.f21136e;
                        ((d0) obj).c(c0Var);
                        return;
                    } catch (InterruptedException | ExecutionException e12) {
                        c0 c0Var2 = new c0(e12);
                        ExecutorService executorService2 = d0.f21136e;
                        ((d0) obj).c(c0Var2);
                        return;
                    }
                }
                return;
        }
    }
}
