package k8;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.u;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f22691g = u.C("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final l8.j f22692a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Context f22693b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.k f22694c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f22695d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.n f22696e;

    /* renamed from: f, reason: collision with root package name */
    public final m8.a f22697f;

    /* JADX WARN: Type inference failed for: r0v0, types: [l8.j, java.lang.Object] */
    public n(Context context, j8.k kVar, ListenableWorker listenableWorker, o oVar, m8.a aVar) {
        this.f22693b = context;
        this.f22694c = kVar;
        this.f22695d = listenableWorker;
        this.f22696e = oVar;
        this.f22697f = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l8.h, l8.j, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22694c.f21090q && !y3.b.b()) {
            ?? obj = new Object();
            m8.a aVar = this.f22697f;
            ((h.c) aVar).B().execute(new m(this, obj, 0));
            obj.a(new m(this, obj, 1), ((h.c) aVar).B());
            return;
        }
        this.f22692a.j(null);
    }
}
