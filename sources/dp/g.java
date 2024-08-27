package dp;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import ep.q;
import ll.o;

/* loaded from: classes2.dex */
public final class g extends ep.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Object obj2, int i10) {
        super(taskCompletionSource);
        this.f14448b = i10;
        this.f14451e = obj;
        this.f14449c = taskCompletionSource2;
        this.f14450d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [android.os.IInterface, ep.h] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.os.IInterface, ep.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dp.i, dp.h] */
    @Override // ep.l
    public final void a() {
        switch (this.f14448b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f14449c;
                Object obj = this.f14451e;
                Object obj2 = this.f14450d;
                try {
                    k kVar = (k) obj;
                    ((k) obj).f14458a.f15815m.c(kVar.f14459b, k.a(kVar, (String) obj2), new j((k) obj, taskCompletionSource, (String) obj2));
                    return;
                } catch (RemoteException e10) {
                    k.f14456e.j("requestUpdateInfo(%s)", e10, (String) obj2);
                    taskCompletionSource.trySetException(new RuntimeException(e10));
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.f14449c;
                Object obj3 = this.f14451e;
                try {
                    ((k) obj3).f14458a.f15815m.e(((k) obj3).f14459b, k.b(), new h((k) obj3, new o("OnCompleteUpdateCallback"), taskCompletionSource2));
                    return;
                } catch (RemoteException e11) {
                    k.f14456e.j("completeUpdate(%s)", e11, (String) this.f14450d);
                    taskCompletionSource2.trySetException(new RuntimeException(e11));
                    return;
                }
            default:
                synchronized (((q) this.f14451e).f15808f) {
                    try {
                        q qVar = (q) this.f14451e;
                        TaskCompletionSource taskCompletionSource3 = this.f14449c;
                        qVar.f15807e.add(taskCompletionSource3);
                        taskCompletionSource3.getTask().addOnCompleteListener(new ep.m(0, qVar, taskCompletionSource3));
                        if (((q) this.f14451e).f15813k.getAndIncrement() > 0) {
                            ((q) this.f14451e).f15804b.k("Already connected to the service.", new Object[0]);
                        }
                        q.b((q) this.f14451e, (ep.l) this.f14450d);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f14448b = 0;
        this.f14451e = kVar;
        this.f14450d = str;
        this.f14449c = taskCompletionSource2;
    }
}
