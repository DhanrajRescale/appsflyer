package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.u;
import b8.l;
import f8.b;
import h.q0;
import java.util.ArrayList;
import java.util.List;
import l8.j;
import m8.a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f2609f = u.C("ConstraintTrkngWrkr");

    /* renamed from: a, reason: collision with root package name */
    public final WorkerParameters f2610a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2611b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f2612c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2613d;

    /* renamed from: e, reason: collision with root package name */
    public ListenableWorker f2614e;

    /* JADX WARN: Type inference failed for: r1v3, types: [l8.j, java.lang.Object] */
    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2610a = workerParameters;
        this.f2611b = new Object();
        this.f2612c = false;
        this.f2613d = new Object();
    }

    @Override // f8.b
    public final void d(ArrayList arrayList) {
        u.w().u(f2609f, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f2611b) {
            this.f2612c = true;
        }
    }

    @Override // f8.b
    public final void e(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return l.c(getApplicationContext()).f4111d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f2614e;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        ListenableWorker listenableWorker = this.f2614e;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f2614e.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final op.a startWork() {
        getBackgroundExecutor().execute(new q0(this, 16));
        return this.f2613d;
    }
}
